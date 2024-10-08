package nl.han.aim.asd.expression;

public class Expression {
    protected String content;
    private Expression left;
    private Expression right;


    @Override
    public String toString() {
        if(left == null && right == null){
            return content;
        }
        return left + content + right;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    public double evaluate() {
        System.out.println(content);
        if(left == null && right == null){
            return Double.valueOf(content);
        }else if (content.equals( "*")){
            return left.evaluate() * right.evaluate();
        }else if (content.equals( "+")){
            return left.evaluate() + right.evaluate();
        }else if (content.equals( "-")){
            return left.evaluate() - right.evaluate();
        }else {
            return left.evaluate() / right.evaluate();
        }
    }
}
