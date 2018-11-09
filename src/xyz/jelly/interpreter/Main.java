package xyz.jelly.interpreter;

public class Main {
    public static void main(String[] args) {
        Expression isMale = getMale();
        Expression isWoman = getMarriedWoman();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married woman? " + isWoman.interpret("Married Julie"));

        System.out.println("Joh is male? " + isMale.interpret("Joh"));
        System.out.println("Juli is a married woman? " + isWoman.interpret("Married Juli"));

    }

    public static Expression getMale() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWoman() {

        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }
}
