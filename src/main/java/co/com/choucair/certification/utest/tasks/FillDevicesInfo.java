package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.model.Utest_Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static org.openqa.selenium.Keys.*;

import java.util.List;


import static co.com.choucair.certification.utest.userinterface.UtestDevices.*;


public class FillDevicesInfo implements Task {
    private List<Utest_Data> data;

    public FillDevicesInfo(List<Utest_Data> data) {
        this.data = data;
    }

    public static FillDevicesInfo theForm(List<Utest_Data> data) {
        return Tasks.instrumented(FillDevicesInfo.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(COMPUTER_BOX),
                Enter.theValue(data.get(0).getStrComputer()).into(COMPUTER).thenHit(ARROW_DOWN,ENTER),
                Click.on(VERSION_BOX),
                Enter.theValue(data.get(0).getStrComputerVersion()).into(VERSION).thenHit(ARROW_DOWN,ENTER),
                Click.on(LANGUAGE_BOX),
                Enter.theValue(data.get(0).getStrComputerLanguage()).into(LANGUAGE).thenHit(ARROW_DOWN,ENTER),
                Click.on(MOBILE_BOX),
                Enter.theValue(data.get(0).getStrMobileDevice()).into(MOBILE).thenHit(ARROW_DOWN,ENTER),
                Click.on(MODEL_BOX),
                Enter.theValue(data.get(0).getStrMobileModel()).into(MODEL).thenHit(ARROW_DOWN,ENTER),
                Click.on(OS_BOX),
                Enter.theValue(data.get(0).getStrMobileOs()).into(OS).thenHit(ARROW_DOWN,ENTER),
                Click.on(NEXT_BTN)
        );
    }
}
