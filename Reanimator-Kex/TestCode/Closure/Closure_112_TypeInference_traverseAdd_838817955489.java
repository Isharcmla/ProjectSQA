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

public class TypeInference_traverseAdd_838817955489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1997858;
     Object term1997928;

    public TypeInference_traverseAdd_838817955489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1997858 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1997928 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1997998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1998068 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1998138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1998208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1998278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1998348 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1998418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1998488 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1998558 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1998628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1998698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1998768 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1998838 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1998908 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1998978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1999048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1999118 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1999188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1999258 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1999328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1999398 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1999468 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1999538 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1999608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1999678 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1999748 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1999818 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1999888 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1999958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2000028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2000098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2000168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2000238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2000308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2000378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2000448 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2000518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2000588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2000658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2000728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2000798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2000868 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2000938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2001008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2001078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2001148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2001218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2001288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2001358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2001428 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2001498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2001568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2001638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2001708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2001778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2001848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2001918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1997998, term1997998.getClass(), "next", null);
        setIntField(term1997998, term1997998.getClass(), "type", 14);
        setIntField(term1998068, term1998068.getClass(), "type", 14);
        setIntField(term1998138, term1998138.getClass(), "type", 14);
        setIntField(term1998208, term1998208.getClass(), "type", 14);
        setIntField(term1998278, term1998278.getClass(), "type", 14);
        setIntField(term1998348, term1998348.getClass(), "type", 14);
        setIntField(term1998418, term1998418.getClass(), "type", 14);
        setIntField(term1998488, term1998488.getClass(), "type", 14);
        setIntField(term1998558, term1998558.getClass(), "type", 14);
        setIntField(term1998628, term1998628.getClass(), "type", 14);
        setIntField(term1998698, term1998698.getClass(), "type", 14);
        setIntField(term1998768, term1998768.getClass(), "type", 14);
        setIntField(term1998838, term1998838.getClass(), "type", 14);
        setIntField(term1998908, term1998908.getClass(), "type", 14);
        setIntField(term1998978, term1998978.getClass(), "type", 14);
        setIntField(term1999048, term1999048.getClass(), "type", 14);
        setIntField(term1999118, term1999118.getClass(), "type", 14);
        setIntField(term1999188, term1999188.getClass(), "type", 14);
        setIntField(term1999258, term1999258.getClass(), "type", 14);
        setIntField(term1999328, term1999328.getClass(), "type", 14);
        setIntField(term1999398, term1999398.getClass(), "type", 14);
        setIntField(term1999468, term1999468.getClass(), "type", 14);
        setIntField(term1999538, term1999538.getClass(), "type", 14);
        setIntField(term1999608, term1999608.getClass(), "type", 14);
        setIntField(term1999678, term1999678.getClass(), "type", 14);
        setIntField(term1999748, term1999748.getClass(), "type", 14);
        setIntField(term1999818, term1999818.getClass(), "type", 14);
        setIntField(term1999888, term1999888.getClass(), "type", 14);
        setIntField(term1999958, term1999958.getClass(), "type", 14);
        setIntField(term2000028, term2000028.getClass(), "type", 14);
        setIntField(term2000098, term2000098.getClass(), "type", 14);
        setIntField(term2000168, term2000168.getClass(), "type", 14);
        setIntField(term2000238, term2000238.getClass(), "type", 14);
        setIntField(term2000308, term2000308.getClass(), "type", 14);
        setIntField(term2000378, term2000378.getClass(), "type", 14);
        setIntField(term2000448, term2000448.getClass(), "type", 14);
        setIntField(term2000518, term2000518.getClass(), "type", 14);
        setIntField(term2000588, term2000588.getClass(), "type", 14);
        setIntField(term2000658, term2000658.getClass(), "type", 14);
        setIntField(term2000728, term2000728.getClass(), "type", 14);
        setIntField(term2000798, term2000798.getClass(), "type", 14);
        setIntField(term2000868, term2000868.getClass(), "type", 14);
        setIntField(term2000938, term2000938.getClass(), "type", 14);
        setIntField(term2001008, term2001008.getClass(), "type", 14);
        setIntField(term2001078, term2001078.getClass(), "type", 14);
        setIntField(term2001148, term2001148.getClass(), "type", 14);
        setIntField(term2001218, term2001218.getClass(), "type", 14);
        setIntField(term2001288, term2001288.getClass(), "type", 14);
        setIntField(term2001358, term2001358.getClass(), "type", 14);
        setIntField(term2001428, term2001428.getClass(), "type", 14);
        setIntField(term2001498, term2001498.getClass(), "type", 14);
        setIntField(term2001568, term2001568.getClass(), "type", 14);
        setIntField(term2001638, term2001638.getClass(), "type", 14);
        setIntField(term2001708, term2001708.getClass(), "type", 14);
        setIntField(term2001778, term2001778.getClass(), "type", 14);
        setIntField(term2001848, term2001848.getClass(), "type", 14);
        setIntField(term2001918, term2001918.getClass(), "type", 89);
        setField(term2001848, term2001848.getClass(), "first", term2001918);
        setField(term2001778, term2001778.getClass(), "first", term2001848);
        setField(term2001708, term2001708.getClass(), "first", term2001778);
        setField(term2001638, term2001638.getClass(), "first", term2001708);
        setField(term2001568, term2001568.getClass(), "first", term2001638);
        setField(term2001498, term2001498.getClass(), "first", term2001568);
        setField(term2001428, term2001428.getClass(), "first", term2001498);
        setField(term2001358, term2001358.getClass(), "first", term2001428);
        setField(term2001288, term2001288.getClass(), "first", term2001358);
        setField(term2001218, term2001218.getClass(), "first", term2001288);
        setField(term2001148, term2001148.getClass(), "first", term2001218);
        setField(term2001078, term2001078.getClass(), "first", term2001148);
        setField(term2001008, term2001008.getClass(), "first", term2001078);
        setField(term2000938, term2000938.getClass(), "first", term2001008);
        setField(term2000868, term2000868.getClass(), "first", term2000938);
        setField(term2000798, term2000798.getClass(), "first", term2000868);
        setField(term2000728, term2000728.getClass(), "first", term2000798);
        setField(term2000658, term2000658.getClass(), "first", term2000728);
        setField(term2000588, term2000588.getClass(), "first", term2000658);
        setField(term2000518, term2000518.getClass(), "first", term2000588);
        setField(term2000448, term2000448.getClass(), "first", term2000518);
        setField(term2000378, term2000378.getClass(), "first", term2000448);
        setField(term2000308, term2000308.getClass(), "first", term2000378);
        setField(term2000238, term2000238.getClass(), "first", term2000308);
        setField(term2000168, term2000168.getClass(), "first", term2000238);
        setField(term2000098, term2000098.getClass(), "first", term2000168);
        setField(term2000028, term2000028.getClass(), "first", term2000098);
        setField(term1999958, term1999958.getClass(), "first", term2000028);
        setField(term1999888, term1999888.getClass(), "first", term1999958);
        setField(term1999818, term1999818.getClass(), "first", term1999888);
        setField(term1999748, term1999748.getClass(), "first", term1999818);
        setField(term1999678, term1999678.getClass(), "first", term1999748);
        setField(term1999608, term1999608.getClass(), "first", term1999678);
        setField(term1999538, term1999538.getClass(), "first", term1999608);
        setField(term1999468, term1999468.getClass(), "first", term1999538);
        setField(term1999398, term1999398.getClass(), "first", term1999468);
        setField(term1999328, term1999328.getClass(), "first", term1999398);
        setField(term1999258, term1999258.getClass(), "first", term1999328);
        setField(term1999188, term1999188.getClass(), "first", term1999258);
        setField(term1999118, term1999118.getClass(), "first", term1999188);
        setField(term1999048, term1999048.getClass(), "first", term1999118);
        setField(term1998978, term1998978.getClass(), "first", term1999048);
        setField(term1998908, term1998908.getClass(), "first", term1998978);
        setField(term1998838, term1998838.getClass(), "first", term1998908);
        setField(term1998768, term1998768.getClass(), "first", term1998838);
        setField(term1998698, term1998698.getClass(), "first", term1998768);
        setField(term1998628, term1998628.getClass(), "first", term1998698);
        setField(term1998558, term1998558.getClass(), "first", term1998628);
        setField(term1998488, term1998488.getClass(), "first", term1998558);
        setField(term1998418, term1998418.getClass(), "first", term1998488);
        setField(term1998348, term1998348.getClass(), "first", term1998418);
        setField(term1998278, term1998278.getClass(), "first", term1998348);
        setField(term1998208, term1998208.getClass(), "first", term1998278);
        setField(term1998138, term1998138.getClass(), "first", term1998208);
        setField(term1998068, term1998068.getClass(), "first", term1998138);
        setField(term1997998, term1997998.getClass(), "first", term1998068);
        setField(term1997928, term1997928.getClass(), "first", term1997998);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1997928;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term1997858, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


