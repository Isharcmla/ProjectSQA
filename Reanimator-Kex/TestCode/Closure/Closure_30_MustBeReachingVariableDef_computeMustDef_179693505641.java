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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class MustBeReachingVariableDef_computeMustDef_179693505641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7480;
     Object term7572;
     Object term8702;
     Object term8703;

    public MustBeReachingVariableDef_computeMustDef_179693505641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7480 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term7572 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term7664 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term7756 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term7848 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term7572, term7572.getClass(), "type", 1265463001);
        setIntField(term7664, term7664.getClass(), "type", -2027534003);
        setIntField(term7756, term7756.getClass(), "type", 1375330971);
        setField(term7756, term7756.getClass(), "first", null);
        setField(term7756, term7756.getClass(), "next", null);
        setField(term7664, term7664.getClass(), "first", term7756);
        setField(term7664, term7664.getClass(), "next", term7848);
        setField(term7572, term7572.getClass(), "first", term7664);
        term8702 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term8702, term8702.getClass(), "jsScope", null);
        setField(term8702, term8702.getClass(), "compiler", null);
        setField(term8702, term8702.getClass(), "escaped", null);
        setField(term8702, term8702.getClass(), "cfg", null);
        setField(term8702, term8702.getClass(), "joinOp", null);
        setField(term8702, term8702.getClass(), "orderedWorkSet", null);
        term8703 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term8704 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term8705 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term8706 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term8703, term8703.getClass(), "str", null);
        setIntField(term8703, term8703.getClass(), "type", 1265463001);
        setField(term8703, term8703.getClass(), "next", null);
        setField(term8704, term8704.getClass(), "str", null);
        setIntField(term8704, term8704.getClass(), "type", -2027534003);
        setField(term8705, term8705.getClass(), "str", null);
        setIntField(term8705, term8705.getClass(), "type", 0);
        setField(term8705, term8705.getClass(), "next", null);
        setField(term8705, term8705.getClass(), "first", null);
        setField(term8705, term8705.getClass(), "last", null);
        setField(term8705, term8705.getClass(), "propListHead", null);
        setIntField(term8705, term8705.getClass(), "sourcePosition", 0);
        setField(term8705, term8705.getClass(), "jsType", null);
        setField(term8705, term8705.getClass(), "parent", null);
        setField(term8704, term8704.getClass(), "next", term8705);
        setField(term8706, term8706.getClass(), "str", null);
        setIntField(term8706, term8706.getClass(), "type", 1375330971);
        setField(term8706, term8706.getClass(), "next", null);
        setField(term8706, term8706.getClass(), "first", null);
        setField(term8706, term8706.getClass(), "last", null);
        setField(term8706, term8706.getClass(), "propListHead", null);
        setIntField(term8706, term8706.getClass(), "sourcePosition", 0);
        setField(term8706, term8706.getClass(), "jsType", null);
        setField(term8706, term8706.getClass(), "parent", null);
        setField(term8704, term8704.getClass(), "first", term8706);
        setField(term8704, term8704.getClass(), "last", null);
        setField(term8704, term8704.getClass(), "propListHead", null);
        setIntField(term8704, term8704.getClass(), "sourcePosition", 0);
        setField(term8704, term8704.getClass(), "jsType", null);
        setField(term8704, term8704.getClass(), "parent", null);
        setField(term8703, term8703.getClass(), "first", term8704);
        setField(term8703, term8703.getClass(), "last", null);
        setField(term8703, term8703.getClass(), "propListHead", null);
        setIntField(term8703, term8703.getClass(), "sourcePosition", 0);
        setField(term8703, term8703.getClass(), "jsType", null);
        setField(term8703, term8703.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term7572;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term7480, args);
        assertTrue(recursiveEquals(term7480, term8702));
        assertTrue(recursiveEquals(term7572, term8703));
    }

};


