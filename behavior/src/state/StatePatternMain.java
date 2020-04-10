package state;

/**
 * 状态模式
 */
public class StatePatternMain {
    public static void main(String[] args) {
        Context context=new Context();    //创建环境
        context.handle();    //处理请求
        context.handle();
        context.handle();
        context.handle();
    }
}

//环境类
class Context {
    private State state;

    //定义环境类的初态
    public Context() {
        this.state = new ConcreteStateA();
    }

    //设置新状态
    void setState(State state) {
        this.state=state;
    }

    //读取状态
    State getState() {
        return(state);
    }

    //对请求做处理
    void handle() {
        state.handle(this);
    }

}

//抽象状态类
abstract class State {
    public abstract void handle(Context context);
}

//具体状态A类
class ConcreteStateA extends State {
    public void handle(Context context) {
        System.out.println(context.getState().toString());
        context.setState(new ConcreteStateB());
    }

    @Override
    public String toString() {
        return "这是状态A";
    }
}
//具体状态B类
class ConcreteStateB extends State {
    public void handle(Context context) {
        System.out.println(context.getState().toString());
        context.setState(new ConcreteStateA());
    }

    @Override
    public String toString() {
        return "这是状态B";
    }
}