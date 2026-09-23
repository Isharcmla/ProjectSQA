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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInference_traverseArrayLiteral_67090236402 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1516278;
     Object term1516348;

    public TypeInference_traverseArrayLiteral_67090236402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1516278 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1516348 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1516418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1516488 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1516558 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1516628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1516698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1516768 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1516838 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1516908 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1516978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1517048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1517118 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1517188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1517258 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1517328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1517398 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1517468 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1517538 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1517608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1517678 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1517748 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1517818 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1517888 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1517958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1518028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1518098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1518168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1518238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1518308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1518378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1518448 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1518518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1518588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1518658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1518728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1518798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1518868 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1518938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1519008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1519078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1519148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1516418, term1516418.getClass(), "type", 83);
        setIntField(term1516488, term1516488.getClass(), "type", 83);
        setIntField(term1516558, term1516558.getClass(), "type", 83);
        setIntField(term1516628, term1516628.getClass(), "type", 83);
        setIntField(term1516698, term1516698.getClass(), "type", 83);
        setIntField(term1516768, term1516768.getClass(), "type", 83);
        setIntField(term1516838, term1516838.getClass(), "type", 83);
        setIntField(term1516908, term1516908.getClass(), "type", 83);
        setIntField(term1516978, term1516978.getClass(), "type", 83);
        setIntField(term1517048, term1517048.getClass(), "type", 83);
        setIntField(term1517118, term1517118.getClass(), "type", 83);
        setIntField(term1517188, term1517188.getClass(), "type", 83);
        setIntField(term1517258, term1517258.getClass(), "type", 83);
        setIntField(term1517328, term1517328.getClass(), "type", 83);
        setIntField(term1517398, term1517398.getClass(), "type", 83);
        setIntField(term1517468, term1517468.getClass(), "type", 83);
        setIntField(term1517538, term1517538.getClass(), "type", 83);
        setIntField(term1517608, term1517608.getClass(), "type", 83);
        setIntField(term1517678, term1517678.getClass(), "type", 83);
        setIntField(term1517748, term1517748.getClass(), "type", 83);
        setIntField(term1517818, term1517818.getClass(), "type", 83);
        setIntField(term1517888, term1517888.getClass(), "type", 83);
        setIntField(term1517958, term1517958.getClass(), "type", 83);
        setIntField(term1518028, term1518028.getClass(), "type", 83);
        setIntField(term1518098, term1518098.getClass(), "type", 83);
        setIntField(term1518168, term1518168.getClass(), "type", 83);
        setIntField(term1518238, term1518238.getClass(), "type", 83);
        setIntField(term1518308, term1518308.getClass(), "type", 83);
        setIntField(term1518378, term1518378.getClass(), "type", 83);
        setIntField(term1518448, term1518448.getClass(), "type", 83);
        setIntField(term1518518, term1518518.getClass(), "type", 83);
        setIntField(term1518588, term1518588.getClass(), "type", 83);
        setIntField(term1518658, term1518658.getClass(), "type", 83);
        setIntField(term1518728, term1518728.getClass(), "type", 83);
        setIntField(term1518798, term1518798.getClass(), "type", 83);
        setIntField(term1518868, term1518868.getClass(), "type", 83);
        setIntField(term1518938, term1518938.getClass(), "type", 83);
        setIntField(term1519008, term1519008.getClass(), "type", 83);
        setIntField(term1519078, term1519078.getClass(), "type", 83);
        setIntField(term1519148, term1519148.getClass(), "type", 60);
        setField(term1519078, term1519078.getClass(), "first", term1519148);
        setField(term1519008, term1519008.getClass(), "first", term1519078);
        setField(term1518938, term1518938.getClass(), "first", term1519008);
        setField(term1518868, term1518868.getClass(), "first", term1518938);
        setField(term1518798, term1518798.getClass(), "first", term1518868);
        setField(term1518728, term1518728.getClass(), "first", term1518798);
        setField(term1518658, term1518658.getClass(), "first", term1518728);
        setField(term1518588, term1518588.getClass(), "first", term1518658);
        setField(term1518518, term1518518.getClass(), "first", term1518588);
        setField(term1518448, term1518448.getClass(), "first", term1518518);
        setField(term1518378, term1518378.getClass(), "first", term1518448);
        setField(term1518308, term1518308.getClass(), "first", term1518378);
        setField(term1518238, term1518238.getClass(), "first", term1518308);
        setField(term1518168, term1518168.getClass(), "first", term1518238);
        setField(term1518098, term1518098.getClass(), "first", term1518168);
        setField(term1518028, term1518028.getClass(), "first", term1518098);
        setField(term1517958, term1517958.getClass(), "first", term1518028);
        setField(term1517888, term1517888.getClass(), "first", term1517958);
        setField(term1517818, term1517818.getClass(), "first", term1517888);
        setField(term1517748, term1517748.getClass(), "first", term1517818);
        setField(term1517678, term1517678.getClass(), "first", term1517748);
        setField(term1517608, term1517608.getClass(), "first", term1517678);
        setField(term1517538, term1517538.getClass(), "first", term1517608);
        setField(term1517468, term1517468.getClass(), "first", term1517538);
        setField(term1517398, term1517398.getClass(), "first", term1517468);
        setField(term1517328, term1517328.getClass(), "first", term1517398);
        setField(term1517258, term1517258.getClass(), "first", term1517328);
        setField(term1517188, term1517188.getClass(), "first", term1517258);
        setField(term1517118, term1517118.getClass(), "first", term1517188);
        setField(term1517048, term1517048.getClass(), "first", term1517118);
        setField(term1516978, term1516978.getClass(), "first", term1517048);
        setField(term1516908, term1516908.getClass(), "first", term1516978);
        setField(term1516838, term1516838.getClass(), "first", term1516908);
        setField(term1516768, term1516768.getClass(), "first", term1516838);
        setField(term1516698, term1516698.getClass(), "first", term1516768);
        setField(term1516628, term1516628.getClass(), "first", term1516698);
        setField(term1516558, term1516558.getClass(), "first", term1516628);
        setField(term1516488, term1516488.getClass(), "first", term1516558);
        setField(term1516418, term1516418.getClass(), "first", term1516488);
        setField(term1516348, term1516348.getClass(), "first", term1516418);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1516348;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term1516278, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


