package question;

public class QuestionChangeStrategyBuilder {

    private QuestionChangeStrategy strategy = new QuestionChangeStrategy();

    public QuestionChangeStrategyBuilder(Question question) {
        question.setChangeStrategy(strategy);
    }

    public static QuestionChangeStrategyBuilder onChangeTo(Question question) {
      return new QuestionChangeStrategyBuilder(question);
    }

    public QuestionChangeStrategyBuilder show(Question... questions) {
        strategy.show(questions);
        return this;
    }

    public QuestionChangeStrategyBuilder hide(Question... questions) {
        strategy.hide(questions);
        return this;
    }
}
