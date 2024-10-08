package nl.han.aim.asd.expression;

public class Multiplication extends Expression{
    public Multiplication(Expression left, Expression right) {
        super.content = "*";
        setLeft(left);
        setRight(right);
    }
}
