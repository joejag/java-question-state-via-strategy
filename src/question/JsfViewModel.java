package question;

import static question.QuestionChangeStrategyBuilder.onChangeTo;

public class JsfViewModel {

    Question q1 = new Question("q1", true);
    Question q2 = new Question("q2", false);
    Question q3 = new Question("q3", false);
    Question q4 = new Question("q4", false);

    public JsfViewModel() {
        stateChangeSetup();
    }

    public void stateChangeSetup() {
        onChangeTo(q1).hide(q1).show(q2, q3);
        onChangeTo(q2).hide(q2, q3).show(q4);
        onChangeTo(q3).hide(q2, q3).show(q4);
    }

    public static void main(String[] args) {
        JsfViewModel model = new JsfViewModel();
        printState(model);

        model.q1.submit();
        printState(model);

        model.q3.submit();
        printState(model);
    }

    private static void printState(JsfViewModel model) {
        System.out.println(model.q1 + " :: " + model.q2 + " :: " + model.q3 + " :: " + model.q4);
    }
}
