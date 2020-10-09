package com.duke.spring5;

/**
 * 演示使用set方法进行注入属性
 */
public class Book {

    private String bname;
    private String bauthor;

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void testDemo() {
        System.out.println(bname + " :: " + bauthor);
    }
}
