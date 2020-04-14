package state.context;

import state.state.ConcreteStateA;
import state.state.State;

//环境类
public class Context {
    private State state;

    //定义环境类的初态
    public Context() {
        this.state = new ConcreteStateA();
    }

    //设置新状态
    public void setState(State state) {
        this.state=state;
    }

    //读取状态
    public State getState() {
        return(state);
    }

    //对请求做处理
    public void handle() {
        state.handle(this);
    }

}
