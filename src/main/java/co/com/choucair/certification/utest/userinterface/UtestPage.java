package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


@DefaultUrl("https://utest.com/")
public class UtestPage extends PageObject {

    public static final Target JOIN_BUTTON = Target.the("button that redirects us to the register form")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
