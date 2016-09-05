import com.github.pagehelper.PageInfo;
import com.seapeng.BookSystem.model.TInRecord;
import com.seapeng.BookSystem.model.TPublisher;
import com.seapeng.BookSystem.model.TSaleRecord;
import com.seapeng.BookSystem.service.IInRecordService;
import com.seapeng.BookSystem.service.ISaleRecordService;
import com.seapeng.BookSystem.service.ITPublisherService;
import com.seapeng.BookSystem.service.ITypeService;
import com.seapeng.BookSystem.service.Impl.BookService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zseapeng on 2016/9/1.
 */
public class TestBook {
    @Resource
    private BookService bookService;

    private ITypeService typeService;

    private ITPublisherService publisherService;

    private ISaleRecordService saleRecordService;

    private IInRecordService inRecordService;
    private PageInfo page;

    @Before
    public void init(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("Beans.xml");
        publisherService = (ITPublisherService) ac.getBean("TPublisherService");
        saleRecordService = (ISaleRecordService) ac.getBean("saleRecordService");
        inRecordService = (IInRecordService) ac.getBean("inRecordService");
    }
    @Test
    public void a(){

        List<TPublisher> publishers = publisherService.selectAll();

         page = new PageInfo(publishers);
        System.out.println("总数据量"+page.getTotal());
        System.out.println("一页数据量"+page.getPageSize());
        System.out.println(page.getLastPage());
        System.out.println("page.getNextPage()==  "+page.getNextPage());
        for (TPublisher p : publishers){
            System.out.println("publishers = "+p.toString());
        }
    }

    @Test
    public void nextPage(){
        System.out.println("page.getNextPage()  == "+page.getNextPage());
        System.out.println("page.getPageNum()==   "+page.getPageNum());
    }

    @Test
    public void testSale(){
        List<TSaleRecord> saleRecordList = saleRecordService.selectAll();
        for (TSaleRecord sal : saleRecordList){
            System.out.println(sal);
            System.out.println("-------------");
        }
    }


    @Test
    public void testinRecordMapper(){
        List<TInRecord> inRecordList = inRecordService.selectAll();

        for (TInRecord i:inRecordList){
            System.out.println("TInRecord----->"+i.toString());
            System.out.println("BookInRecordList.size--->"+i.getBookInRecordList().size());
        }

    }

}
