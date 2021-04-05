import org.junit.Assert;
import org.junit.Test;

public class JunitTest {
    @Test
    public void testGetArea(){
        Rect r=new Rect(1,2);
        int res=r.getArea();
        Assert.assertEquals(res, 2);
    }
    @Test
    public void testGetPerimeter(){
        Rect r=new Rect(1,2);
        int res=r.getPerimeter();
        Assert.assertEquals(res,6);
    }
    @Test
    public void testFindMax(){
        Rect r1= new Rect(3,5);
        Rect r2=new Rect(2,4);
        Rect[] arr = new Rect[]{r1,r2};

        Rect r= Rect.findMax(arr, new Rect.areaCompare());
    }
}
