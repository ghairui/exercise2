package com.jd.demo;

/**
 * Created with IntelliJ IDEA.
 * User: guohairui
 * Date: 17-2-17
 * Time: 上午11:16
 * To change this template use File | Settings | File Templates.
 */
public class Test extends ATest{
    public String name="name";
    public static void main(String[] m){
        System.out.println("i'm here");
        ATest test = new Test();
        test.bb();
        System.out.println(test.name);
    }

    @Override
    public void aa() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
//    @Override
    public void bb() {
        System.out.println("t.bb");
    }
}
