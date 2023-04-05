package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    Main check = new Main();
    Main check2 = new Main();

    //test true
    @Test
    void checkSHH() {
        assertTrue(check.checkSHH(6));
    }
    @Test
    void checkSHH1() {
        assertTrue(check.checkSHH(28));
    }
    @Test
    void checkSHH2() {
        assertTrue(check.checkSHH(496));
    }
    @Test
    void checkSHH3() {
        assertTrue(check.checkSHH(8128));
    }
    @Test
    void checkSHH4() {
        assertTrue(check.checkSHH(33550336));
    }
    //test false
    @Test
    void checkSHH5() {
        assertFalse(check.checkSHH(4));
    }
    @Test
    void checkSHH6() {
        assertFalse(check.checkSHH(7));
    }
    @Test
    void checkSHH7() {
        assertFalse(check.checkSHH(-123));
    }
    @Test
    void checkSHH8() {
        assertFalse(check.checkSHH(345));
    }
    @Test
    void checkSHH9() {
        assertFalse(check.checkSHH(-532432));
    }

    //test true
    @Test
    void checkSNT() {
        assertTrue(check.checkSNT(2));
    }
    @Test
    void checkSNT1() {
        assertTrue(check.checkSNT(3));
    }
    @Test
    void checkSNT2() {
        assertTrue(check.checkSNT(7));
    }
    @Test
    void checkSNT3() {
        assertTrue(check.checkSNT(11));
    }
    @Test
    void checkSNT4() {
        assertTrue(check.checkSNT(23));
    }
    //test false
    @Test
    void checkSNT5() {
        assertFalse(check.checkSNT(4));
    }
    @Test
    void checkSNT6() {
        assertFalse(check.checkSNT(-3));
    }
    @Test
    void checkSNT7() {
        assertFalse(check.checkSNT(-7));
    }
    @Test
    void checkSNT8() {
        assertFalse(check.checkSNT(9));
    }
    @Test
    void checkSNT9() {
        assertFalse(check.checkSNT(123));
    }
    @Test
    public void main1() {
        String input = "8128\n";
        ByteArrayInputStream in =
                new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        //invoke
        String[] args ={};
        Main.main(args);
        String consolOutput= "Nhap so bat ki: "+System.getProperty("line.separator");
        consolOutput+= "8128 khong la so nguyen to" +System.getProperty("line.separator");
        consolOutput+= "8128 la so hoan hao" +System.getProperty("line.separator");
        assertEquals(consolOutput,out.toString());
    }
    @Test
    public void main2() {
        String input = "11\n";
        ByteArrayInputStream in =
                new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        //invoke
        String[] args ={};
        Main.main(args);
        String consolOutput= "Nhap so bat ki: "+System.getProperty("line.separator");
        consolOutput+= "11 la so nguyen to" +System.getProperty("line.separator");
        consolOutput+= "11 khong la so hoan hao" +System.getProperty("line.separator");
        assertEquals(consolOutput,out.toString());
    }
}