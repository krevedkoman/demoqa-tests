package test.mypkg;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
    @Test
    void textBoxTest1(){
        open("https://demoqa.com/text-box");
        $("[id=userName]").setValue("test");
        $("[id=userEmail]").setValue("test@test.ts");
        $("[id=currentAddress]").setValue("1577 divan dr, lutz, FL, 33556");
        $("[id=permanentAddress]").setValue("1577 divan dr, lutz, FL, 33556");

        $("[id=submit]").pressEnter();

        $("#output").$("#name").shouldHave(text("test"));
        $("#output").$("#email").shouldHave(text("test@test.ts"));
        $("#output").$("#currentAddress").shouldHave(text("1577 divan dr, lutz, FL, 33556"));
        $("#output").$("#permanentAddress").shouldHave(text("1577 divan dr, lutz, FL, 33556"));

    }
    @Test
    void textBoxText2(){

    }
}
