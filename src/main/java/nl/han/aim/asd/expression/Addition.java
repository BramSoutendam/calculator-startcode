package nl.han.aim.asd.expression;

public class Addition extends Expression{
    public Addition(Expression left, Expression right){
        super.content = "+";
        setLeft(left);
        setRight(right);
    }
}
