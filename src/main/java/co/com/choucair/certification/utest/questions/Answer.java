package co.com.choucair.certification.utest.questions;

import co.com.choucair.certification.utest.model.Utest_Data;
import co.com.choucair.certification.utest.userinterface.UtestPassword;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Answer implements Question<Boolean>{

    private List<Utest_Data> question;

    public Answer(List<Utest_Data> question) {
        this.question = question;
    }

    public static Answer toThe(List<Utest_Data> question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String complete_button_text = Text.of(UtestPassword.COMPLETE_BTN).viewedBy(actor).asString();
        return question.get(0).getStrCompleted().equals(complete_button_text);
    }
}

