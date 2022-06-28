import org.testng.annotations.*;

public class WebLogin {

    @AfterTest
    public void AfterLogin(){
        System.out.println("In After web login");
    }


    @Test
    public void HomeLogin(){
        System.out.println("In Home login");
    }

    @Parameters({"URL"})
    @Test(dependsOnMethods = {"HomeLogin"})
    public void AboutLogin(String URL){
        System.out.println("In About login url is added"+""+URL);
    }

    @AfterSuite
    public void BeforeSuite(){
        System.out.println("In after suite");
    }


    @BeforeTest
    public void BeforeLogin(){
        System.out.println("In Before web login");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class");
    }


    @Test(groups = {"Smoke"})
    public void WebSmokeHomeLogin(){
        System.out.println("In Web Smoke Home Login Mobile");
    }

    @Test(timeOut = 4000)
    public void APILogin(){
        System.out.println("In API server");
    }

}
