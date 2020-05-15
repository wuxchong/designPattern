package state.model.state;

import state.model.context.Context;

//具体状态B类
public class ConcreteStateB extends State {

    @Override
    public void handle(Context context) {
        System.out.println(context.getState().toString());
        context.setState(new ConcreteStateA());
    }

    @Override
    public String toString() {
        return "这是状态B";
    }
}
