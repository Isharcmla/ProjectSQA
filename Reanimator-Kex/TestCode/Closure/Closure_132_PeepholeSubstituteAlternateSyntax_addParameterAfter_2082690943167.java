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

public class PeepholeSubstituteAlternateSyntax_addParameterAfter_2082690943167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88550;
     Object term88642;

    public PeepholeSubstituteAlternateSyntax_addParameterAfter_2082690943167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88550 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term88642 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term88734 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term88826 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term88918 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term89010 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term89102 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term89194 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term89286 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term89378 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term89470 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term89562 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term89654 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term89746 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term89838 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term89930 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term90022 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term90114 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term90206 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term90298 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term90390 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term90482 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term90574 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term90666 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term90758 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term90850 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term90942 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term91034 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term91126 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term91218 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term91310 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term91402 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term91494 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term91586 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term91678 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term91770 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term91862 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term91954 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term92046 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term92138 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term92230 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term92322 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term92414 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term92506 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term92598 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term92690 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term92782 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term92874 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term92966 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term93058 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term93150 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term93242 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term93334 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term93426 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term93426, term93426.getClass(), "next", term93426);
        setField(term93334, term93334.getClass(), "next", term93426);
        setField(term93242, term93242.getClass(), "next", term93334);
        setField(term93150, term93150.getClass(), "next", term93242);
        setField(term93058, term93058.getClass(), "next", term93150);
        setField(term92966, term92966.getClass(), "next", term93058);
        setField(term92874, term92874.getClass(), "next", term92966);
        setField(term92782, term92782.getClass(), "next", term92874);
        setField(term92690, term92690.getClass(), "next", term92782);
        setField(term92598, term92598.getClass(), "next", term92690);
        setField(term92506, term92506.getClass(), "next", term92598);
        setField(term92414, term92414.getClass(), "next", term92506);
        setField(term92322, term92322.getClass(), "next", term92414);
        setField(term92230, term92230.getClass(), "next", term92322);
        setField(term92138, term92138.getClass(), "next", term92230);
        setField(term92046, term92046.getClass(), "next", term92138);
        setField(term91954, term91954.getClass(), "next", term92046);
        setField(term91862, term91862.getClass(), "next", term91954);
        setField(term91770, term91770.getClass(), "next", term91862);
        setField(term91678, term91678.getClass(), "next", term91770);
        setField(term91586, term91586.getClass(), "next", term91678);
        setField(term91494, term91494.getClass(), "next", term91586);
        setField(term91402, term91402.getClass(), "next", term91494);
        setField(term91310, term91310.getClass(), "next", term91402);
        setField(term91218, term91218.getClass(), "next", term91310);
        setField(term91126, term91126.getClass(), "next", term91218);
        setField(term91034, term91034.getClass(), "next", term91126);
        setField(term90942, term90942.getClass(), "next", term91034);
        setField(term90850, term90850.getClass(), "next", term90942);
        setField(term90758, term90758.getClass(), "next", term90850);
        setField(term90666, term90666.getClass(), "next", term90758);
        setField(term90574, term90574.getClass(), "next", term90666);
        setField(term90482, term90482.getClass(), "next", term90574);
        setField(term90390, term90390.getClass(), "next", term90482);
        setField(term90298, term90298.getClass(), "next", term90390);
        setField(term90206, term90206.getClass(), "next", term90298);
        setField(term90114, term90114.getClass(), "next", term90206);
        setField(term90022, term90022.getClass(), "next", term90114);
        setField(term89930, term89930.getClass(), "next", term90022);
        setField(term89838, term89838.getClass(), "next", term89930);
        setField(term89746, term89746.getClass(), "next", term89838);
        setField(term89654, term89654.getClass(), "next", term89746);
        setField(term89562, term89562.getClass(), "next", term89654);
        setField(term89470, term89470.getClass(), "next", term89562);
        setField(term89378, term89378.getClass(), "next", term89470);
        setField(term89286, term89286.getClass(), "next", term89378);
        setField(term89194, term89194.getClass(), "next", term89286);
        setField(term89102, term89102.getClass(), "next", term89194);
        setField(term89010, term89010.getClass(), "next", term89102);
        setField(term88918, term88918.getClass(), "next", term89010);
        setField(term88826, term88826.getClass(), "next", term88918);
        setField(term88734, term88734.getClass(), "next", term88826);
        setField(term88642, term88642.getClass(), "next", term88734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term88642;
        args[1] = null;
        try {
            callMethod(klass, "addParameterAfter", argTypes, term88550, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


