package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestUserAddress {

    public static final Target CITY = Target.the("User city")
            .located(By.id("city"));

    public static final Target ZIP = Target.the("User postal code")
            .located(By.id("zip"));

    public static final Target COUNTRY_BOX = Target.the("Box with a list of countries")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));


    public static final Target COUNTRY = Target.the("User country")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));

    public static final Target NEXT_BTN = Target.the("Button that redirects us to the next step of registration")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));

}
