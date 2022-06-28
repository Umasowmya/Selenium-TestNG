import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MobileLogin {

    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("In before suite");
    }


    @Test(enabled = false)
    public void MobileHomeLogin(){
        System.out.println("In Home Login Mobile");
    }

    @Test
    public void MobileAboutLogin(){
        System.out.println("In About Login Mobile");
    }


    @Test(groups = {"Smoke"})
    public void MobileSmokeHomeLogin(){
        System.out.println("In Mobile Smoke Home Login Mobile");
    }

}
