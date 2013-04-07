package question;

public class QuestionChangeStrategy {

    private Question[] toHide = new Question[]{};
    private Question[] toShow = new Question[]{};

    public void change() {
        for (Question question : toHide)
            question.hide();

        for (Question question : toShow)
            question.show();
    }

    public void hide(Question[] toHide) {
        this.toHide = toHide;
    }

    public void show(Question[] toShow) {
        this.toShow = toShow;
    }
}
