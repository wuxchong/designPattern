package state;

import state.context.Context;

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