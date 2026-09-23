package com.google.javascript.jscomp;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MakeDeclaredNamesUnique_findDeclaredNames_160439403049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28170;
     Object term28240;
     Object term32367;

    public MakeDeclaredNamesUnique_findDeclaredNames_160439403049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28170 = newInstance(Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        term28240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28310 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28380 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28450 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28800 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28870 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28940 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29010 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29080 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29150 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29220 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29290 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29360 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29430 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29500 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29570 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29640 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29710 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29780 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29850 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29920 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29990 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30060 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30216 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term30286 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30566 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term32367 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32402 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32472 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32542 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32577 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32612 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32647 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32752 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32822 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32857 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32900 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term32935 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33040 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28240, term28240.getClass(), "type", 0);
        setIntField(term28310, term28310.getClass(), "type", 0);
        setIntField(term28380, term28380.getClass(), "type", 0);
        setIntField(term28450, term28450.getClass(), "type", 0);
        setIntField(term28520, term28520.getClass(), "type", 0);
        setIntField(term28590, term28590.getClass(), "type", 0);
        setIntField(term28660, term28660.getClass(), "type", 0);
        setIntField(term28730, term28730.getClass(), "type", 0);
        setIntField(term28800, term28800.getClass(), "type", 0);
        setIntField(term28870, term28870.getClass(), "type", 0);
        setIntField(term28940, term28940.getClass(), "type", 0);
        setIntField(term29010, term29010.getClass(), "type", 0);
        setIntField(term29080, term29080.getClass(), "type", 0);
        setIntField(term29150, term29150.getClass(), "type", 0);
        setIntField(term29220, term29220.getClass(), "type", 0);
        setIntField(term29290, term29290.getClass(), "type", 0);
        setIntField(term29360, term29360.getClass(), "type", 0);
        setIntField(term29430, term29430.getClass(), "type", 0);
        setIntField(term29500, term29500.getClass(), "type", 0);
        setIntField(term29570, term29570.getClass(), "type", 0);
        setIntField(term29640, term29640.getClass(), "type", 0);
        setIntField(term29710, term29710.getClass(), "type", 0);
        setIntField(term29780, term29780.getClass(), "type", 0);
        setIntField(term29850, term29850.getClass(), "type", 0);
        setIntField(term29920, term29920.getClass(), "type", 0);
        setIntField(term29990, term29990.getClass(), "type", 0);
        setIntField(term30060, term30060.getClass(), "type", 0);
        setIntField(term30130, term30130.getClass(), "type", 0);
        setIntField(term30216, term30216.getClass(), "type", 0);
        setIntField(term30286, term30286.getClass(), "type", 0);
        setIntField(term30356, term30356.getClass(), "type", 0);
        setIntField(term30426, term30426.getClass(), "type", 0);
        setIntField(term30496, term30496.getClass(), "type", 0);
        setIntField(term30566, term30566.getClass(), "type", 0);
        setIntField(term30636, term30636.getClass(), "type", 0);
        setIntField(term30706, term30706.getClass(), "type", 0);
        setIntField(term32367, term32367.getClass(), "type", 0);
        setIntField(term32402, term32402.getClass(), "type", 0);
        setIntField(term32437, term32437.getClass(), "type", 0);
        setIntField(term32472, term32472.getClass(), "type", 0);
        setIntField(term32507, term32507.getClass(), "type", 0);
        setIntField(term32542, term32542.getClass(), "type", 0);
        setIntField(term32577, term32577.getClass(), "type", 0);
        setIntField(term32612, term32612.getClass(), "type", 0);
        setIntField(term32647, term32647.getClass(), "type", 0);
        setIntField(term32682, term32682.getClass(), "type", 0);
        setIntField(term32717, term32717.getClass(), "type", 0);
        setIntField(term32752, term32752.getClass(), "type", 0);
        setIntField(term32787, term32787.getClass(), "type", 0);
        setIntField(term32822, term32822.getClass(), "type", 0);
        setIntField(term32857, term32857.getClass(), "type", 0);
        setIntField(term32900, term32900.getClass(), "type", 0);
        setIntField(term32935, term32935.getClass(), "type", 0);
        setIntField(term32970, term32970.getClass(), "type", 0);
        setIntField(term33005, term33005.getClass(), "type", 0);
        setIntField(term33040, term33040.getClass(), "type", 0);
        setIntField(term33075, term33075.getClass(), "type", 0);
        setIntField(term33110, term33110.getClass(), "type", 0);
        setIntField(term33145, term33145.getClass(), "type", 0);
        setField(term33145, term33145.getClass(), "first", term32577);
        setField(term33110, term33110.getClass(), "first", term33145);
        setField(term33075, term33075.getClass(), "first", term33110);
        setField(term33040, term33040.getClass(), "first", term33075);
        setField(term33005, term33005.getClass(), "first", term33040);
        setField(term32970, term32970.getClass(), "first", term33005);
        setField(term32935, term32935.getClass(), "first", term32970);
        setField(term32900, term32900.getClass(), "first", term32935);
        setField(term32857, term32857.getClass(), "first", term32900);
        setField(term32822, term32822.getClass(), "first", term32857);
        setField(term32787, term32787.getClass(), "first", term32822);
        setField(term32752, term32752.getClass(), "first", term32787);
        setField(term32717, term32717.getClass(), "first", term32752);
        setField(term32682, term32682.getClass(), "first", term32717);
        setField(term32647, term32647.getClass(), "first", term32682);
        setField(term32612, term32612.getClass(), "first", term32647);
        setField(term32577, term32577.getClass(), "first", term32612);
        setField(term32542, term32542.getClass(), "first", term32577);
        setField(term32507, term32507.getClass(), "first", term32542);
        setField(term32472, term32472.getClass(), "first", term32507);
        setField(term32437, term32437.getClass(), "first", term32472);
        setField(term32402, term32402.getClass(), "first", term32437);
        setField(term32367, term32367.getClass(), "first", term32402);
        setField(term30706, term30706.getClass(), "first", term32367);
        setField(term30636, term30636.getClass(), "first", term30706);
        setField(term30566, term30566.getClass(), "first", term30636);
        setField(term30496, term30496.getClass(), "first", term30566);
        setField(term30426, term30426.getClass(), "first", term30496);
        setField(term30356, term30356.getClass(), "first", term30426);
        setField(term30286, term30286.getClass(), "first", term30356);
        setField(term30216, term30216.getClass(), "first", term30286);
        setField(term30130, term30130.getClass(), "first", term30216);
        setField(term30060, term30060.getClass(), "first", term30130);
        setField(term29990, term29990.getClass(), "first", term30060);
        setField(term29920, term29920.getClass(), "first", term29990);
        setField(term29850, term29850.getClass(), "first", term29920);
        setField(term29780, term29780.getClass(), "first", term29850);
        setField(term29710, term29710.getClass(), "first", term29780);
        setField(term29640, term29640.getClass(), "first", term29710);
        setField(term29570, term29570.getClass(), "first", term29640);
        setField(term29500, term29500.getClass(), "first", term29570);
        setField(term29430, term29430.getClass(), "first", term29500);
        setField(term29360, term29360.getClass(), "first", term29430);
        setField(term29290, term29290.getClass(), "first", term29360);
        setField(term29220, term29220.getClass(), "first", term29290);
        setField(term29150, term29150.getClass(), "first", term29220);
        setField(term29080, term29080.getClass(), "first", term29150);
        setField(term29010, term29010.getClass(), "first", term29080);
        setField(term28940, term28940.getClass(), "first", term29010);
        setField(term28870, term28870.getClass(), "first", term28940);
        setField(term28800, term28800.getClass(), "first", term28870);
        setField(term28730, term28730.getClass(), "first", term28800);
        setField(term28660, term28660.getClass(), "first", term28730);
        setField(term28590, term28590.getClass(), "first", term28660);
        setField(term28520, term28520.getClass(), "first", term28590);
        setField(term28450, term28450.getClass(), "first", term28520);
        setField(term28380, term28380.getClass(), "first", term28450);
        setField(term28310, term28310.getClass(), "first", term28380);
        setField(term28240, term28240.getClass(), "first", term28310);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Object[] args = new Object[3];
        args[0] = term28240;
        args[1] = term32367;
        args[2] = null;
        try {
            callMethod(klass, "findDeclaredNames", argTypes, term28170, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


