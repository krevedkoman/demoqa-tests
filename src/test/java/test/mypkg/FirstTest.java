package test.mypkg;

import com.codeborne.selenide.junit5.ScreenShooterExtension;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.RegisterExtension;
import static com.codeborne.selenide.Selenide.*;


public class FirstTest {

   // @RegisterExtension
  //  static ScreenShooterExtension screenshotEmAll = new ScreenShooterExtension(true).to("build/reports/tests/test/screenshots/");

    @BeforeAll
    static void beforeAll(){
        System.out.println("Start this before all tests");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("Start this after all tests");
    }

    @BeforeEach
    void beforeEachTest(){
        System.out.println("Start this before each tests");
  //      open("https://google.com");
    }

    @AfterEach
    void afterEachTest(){
        System.out.println("Start this after each tests");
    }

    @Test
    void firstTest(){
        System.out.println("First Test");
 //       $("[name=q]").setValue("Selenide").pressEnter();
    }

    @Test
    void secondTest(){
        System.out.println("Second Test");
  //      $("[name=q]").setValue("Warcraft3").pressEnter();
    }
}

