package test;

class Computer3 {// ���ࣺ����
	String  sayHello(){
		return "��ӭʹ��";
	}
}
public class Pad3 extends Computer3 {// ���ࣺƽ�����

	String sayHello() {// ������д���෽��
		return super.sayHello() + "ƽ�����";// ���ø��෽����������������ַ���
	}

	public static void main(String[] args) {
		Computer3 pc = new Computer3();// ������
		System.out.println(pc.sayHello());
		Pad3 ipad = new Pad3();// ƽ�������
		System.out.println(ipad.sayHello());
	}
}
