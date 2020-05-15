package state.model.state;

import state.model.context.Context;

//抽象状态类
public abstract class State {
    public abstract void handle(Context context);
}
