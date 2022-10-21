package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestPassword {

    public static final Target PASSWORD = Target.the("User password")
            .located(By.id("password"));

    public static final Target CONFIRM_PASSWORD = Target.the("Confirm user password")
            .located(By.id("confirmPassword"));

    public static final Target STAY_INFORMED = Target.the("Checkbox to enable email updates from uTest")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));

    public static final Target TERMS = Target.the("Checkbox to accept uTest terms of use and the uTest guidelines")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target PRIVACY = Target.the("Checkbox to accept uTest privacy & security policy")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target COMPLETE_BTN = Target.the("Button to complete user registration")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));

}
