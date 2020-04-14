package state.state;

import state.context.Context;

//抽象状态类
public abstract class State {
    public abstract void handle(Context context);
}
