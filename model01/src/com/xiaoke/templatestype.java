package com.xiaoke;

import java.util.ArrayList;

/**
 * @author kzm
 * @create 2020-01-2020/1/4 17:39
 */
public class templatestype {
    //prsf
    private static final int AA = 2;
    //psf
    public static final int BB = 2;
    //psfi
    public static final int CC = 22;
    /**
     * 用模板定义变量
     **/
    //pric
    private int aa;


    //psvm
    public static void main(String[] args) {
        //sout
        System.out.println("im");
        //fori循环遍历
        String[] arr = {"aa", "dd"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //iter循环
        for (String s : arr) {
            System.out.println(s);
        }
        //list遍历
        ArrayList list = new ArrayList();
        list.add("addd");
        //list.for
        for (Object o : list) {

        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }
        //ifn
        if (list == null) {

        }
        //inn
        if (list != null) {

        }

        //xxx.nn
        if (list != null) {

        }
        //xxx.null
        if (list == null) {

        }

    }

    public void testUPDATE() {
        System.out.println();
    }
}
