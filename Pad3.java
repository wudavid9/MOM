package test;

class Computer3 {// 父类：电脑
	String  sayHello(){
		return "欢迎使用";
	}
}
public class Pad3 extends Computer3 {// 子类：平板电脑

	String sayHello() {// 子类重写父类方法
		return super.sayHello() + "平板电脑";// 调用父类方法，在其结果后添加字符串
	}

	public static void main(String[] args) {
		Computer3 pc = new Computer3();// 电脑类
		System.out.println(pc.sayHello());
		Pad3 ipad = new Pad3();// 平板电脑类
		System.out.println(ipad.sayHello());
	}
}
