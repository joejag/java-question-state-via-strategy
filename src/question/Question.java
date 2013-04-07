package question;

public class Question {

    private String name;
    private boolean visible;
    private QuestionChangeStrategy changeStrategy = new QuestionChangeStrategy();

    public Question(String name, boolean visible) {
        this.name = name;
        this.visible = visible;
    }

    public void show() { this.visible = true; }
    public void hide() { this.visible = false; }
    public boolean isVisible() { return visible; }

    public void setChangeStrategy(QuestionChangeStrategy changeStrategy) {
        this.changeStrategy = changeStrategy;
    }

    public void submit() {
        System.out.println(name + " changed!");
        changeStrategy.change();
    }

    @Override
    public String toString() {
        return "{ " + name + " visible? " + visible + " }";
    }
}
