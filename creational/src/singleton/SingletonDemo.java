package singleton;

public class SingletonDemo {
    public static void main(String[] args) {

        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();

        //获取唯一可用的对象
        SingleObject single = SingleObject.getInstance();

        //显示消息
        single.showMessage();
    }
}
