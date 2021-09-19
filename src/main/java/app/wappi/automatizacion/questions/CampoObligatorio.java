package app.wappi.automatizacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CampoObligatorio implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        //return Text.of(AccessForm.RESPONSE_DAY).viewedBy(actor).asString();
return null;
    }
public static CampoObligatorio validarCampo () {return new CampoObligatorio(); }


}
