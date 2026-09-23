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

public class TypeInference_traverseArrayLiteral_67090236250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term379148;
     Object term379218;

    public TypeInference_traverseArrayLiteral_67090236250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term379148 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term379218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term379288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term379358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term379428 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term379498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term379568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term379638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term379708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term379778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term379848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term379918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term379988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term380058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term380128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term380198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term380268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term380338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term380408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term380478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term380548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term380618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term380688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term380758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term380828 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term380898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term380968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term381038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term381108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term381178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term381248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term381318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term381388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term381458 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term381528 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term381598 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term381668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term381738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term381808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term381878 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term381948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term382018 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term382088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term382158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term382228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term382298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term382368 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term382438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term382508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term382578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term382648 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term382718 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term382788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term382858 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term382928 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term379288, term379288.getClass(), "type", 83);
        setIntField(term379358, term379358.getClass(), "type", 83);
        setIntField(term379428, term379428.getClass(), "type", 83);
        setIntField(term379498, term379498.getClass(), "type", 83);
        setIntField(term379568, term379568.getClass(), "type", 83);
        setIntField(term379638, term379638.getClass(), "type", 83);
        setIntField(term379708, term379708.getClass(), "type", 83);
        setIntField(term379778, term379778.getClass(), "type", 83);
        setIntField(term379848, term379848.getClass(), "type", 83);
        setIntField(term379918, term379918.getClass(), "type", 83);
        setIntField(term379988, term379988.getClass(), "type", 83);
        setIntField(term380058, term380058.getClass(), "type", 83);
        setIntField(term380128, term380128.getClass(), "type", 83);
        setIntField(term380198, term380198.getClass(), "type", 83);
        setIntField(term380268, term380268.getClass(), "type", 83);
        setIntField(term380338, term380338.getClass(), "type", 83);
        setIntField(term380408, term380408.getClass(), "type", 83);
        setIntField(term380478, term380478.getClass(), "type", 83);
        setIntField(term380548, term380548.getClass(), "type", 83);
        setIntField(term380618, term380618.getClass(), "type", 83);
        setIntField(term380688, term380688.getClass(), "type", 83);
        setIntField(term380758, term380758.getClass(), "type", 83);
        setIntField(term380828, term380828.getClass(), "type", 83);
        setIntField(term380898, term380898.getClass(), "type", 83);
        setIntField(term380968, term380968.getClass(), "type", 83);
        setIntField(term381038, term381038.getClass(), "type", 83);
        setIntField(term381108, term381108.getClass(), "type", 83);
        setIntField(term381178, term381178.getClass(), "type", 83);
        setIntField(term381248, term381248.getClass(), "type", 83);
        setIntField(term381318, term381318.getClass(), "type", 83);
        setIntField(term381388, term381388.getClass(), "type", 83);
        setIntField(term381458, term381458.getClass(), "type", 83);
        setIntField(term381528, term381528.getClass(), "type", 83);
        setIntField(term381598, term381598.getClass(), "type", 83);
        setIntField(term381668, term381668.getClass(), "type", 83);
        setIntField(term381738, term381738.getClass(), "type", 83);
        setIntField(term381808, term381808.getClass(), "type", 83);
        setIntField(term381878, term381878.getClass(), "type", 83);
        setIntField(term381948, term381948.getClass(), "type", 83);
        setIntField(term382018, term382018.getClass(), "type", 83);
        setIntField(term382088, term382088.getClass(), "type", 83);
        setIntField(term382158, term382158.getClass(), "type", 83);
        setIntField(term382228, term382228.getClass(), "type", 83);
        setIntField(term382298, term382298.getClass(), "type", 83);
        setIntField(term382368, term382368.getClass(), "type", 83);
        setIntField(term382438, term382438.getClass(), "type", 83);
        setIntField(term382508, term382508.getClass(), "type", 83);
        setIntField(term382578, term382578.getClass(), "type", 83);
        setIntField(term382648, term382648.getClass(), "type", 83);
        setIntField(term382718, term382718.getClass(), "type", 83);
        setIntField(term382788, term382788.getClass(), "type", 83);
        setIntField(term382858, term382858.getClass(), "type", 83);
        setIntField(term382928, term382928.getClass(), "type", 4);
        setField(term382858, term382858.getClass(), "first", term382928);
        setField(term382788, term382788.getClass(), "first", term382858);
        setField(term382718, term382718.getClass(), "first", term382788);
        setField(term382648, term382648.getClass(), "first", term382718);
        setField(term382578, term382578.getClass(), "first", term382648);
        setField(term382508, term382508.getClass(), "first", term382578);
        setField(term382438, term382438.getClass(), "first", term382508);
        setField(term382368, term382368.getClass(), "first", term382438);
        setField(term382298, term382298.getClass(), "first", term382368);
        setField(term382228, term382228.getClass(), "first", term382298);
        setField(term382158, term382158.getClass(), "first", term382228);
        setField(term382088, term382088.getClass(), "first", term382158);
        setField(term382018, term382018.getClass(), "first", term382088);
        setField(term381948, term381948.getClass(), "first", term382018);
        setField(term381878, term381878.getClass(), "first", term381948);
        setField(term381808, term381808.getClass(), "first", term381878);
        setField(term381738, term381738.getClass(), "first", term381808);
        setField(term381668, term381668.getClass(), "first", term381738);
        setField(term381598, term381598.getClass(), "first", term381668);
        setField(term381528, term381528.getClass(), "first", term381598);
        setField(term381458, term381458.getClass(), "first", term381528);
        setField(term381388, term381388.getClass(), "first", term381458);
        setField(term381318, term381318.getClass(), "first", term381388);
        setField(term381248, term381248.getClass(), "first", term381318);
        setField(term381178, term381178.getClass(), "first", term381248);
        setField(term381108, term381108.getClass(), "first", term381178);
        setField(term381038, term381038.getClass(), "first", term381108);
        setField(term380968, term380968.getClass(), "first", term381038);
        setField(term380898, term380898.getClass(), "first", term380968);
        setField(term380828, term380828.getClass(), "first", term380898);
        setField(term380758, term380758.getClass(), "first", term380828);
        setField(term380688, term380688.getClass(), "first", term380758);
        setField(term380618, term380618.getClass(), "first", term380688);
        setField(term380548, term380548.getClass(), "first", term380618);
        setField(term380478, term380478.getClass(), "first", term380548);
        setField(term380408, term380408.getClass(), "first", term380478);
        setField(term380338, term380338.getClass(), "first", term380408);
        setField(term380268, term380268.getClass(), "first", term380338);
        setField(term380198, term380198.getClass(), "first", term380268);
        setField(term380128, term380128.getClass(), "first", term380198);
        setField(term380058, term380058.getClass(), "first", term380128);
        setField(term379988, term379988.getClass(), "first", term380058);
        setField(term379918, term379918.getClass(), "first", term379988);
        setField(term379848, term379848.getClass(), "first", term379918);
        setField(term379778, term379778.getClass(), "first", term379848);
        setField(term379708, term379708.getClass(), "first", term379778);
        setField(term379638, term379638.getClass(), "first", term379708);
        setField(term379568, term379568.getClass(), "first", term379638);
        setField(term379498, term379498.getClass(), "first", term379568);
        setField(term379428, term379428.getClass(), "first", term379498);
        setField(term379358, term379358.getClass(), "first", term379428);
        setField(term379288, term379288.getClass(), "first", term379358);
        setField(term379218, term379218.getClass(), "first", term379288);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term379218;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term379148, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


