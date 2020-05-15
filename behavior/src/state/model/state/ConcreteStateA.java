package state.model.state;

import state.model.context.Context;

//具体状态A类
public class ConcreteStateA extends State {
    public void handle(Context context) {
        System.out.println(context.getState().toString());
        context.setState(new ConcreteStateB());
    }

    @Override
    public String toString() {
        return "这是状态A";
    }
}
