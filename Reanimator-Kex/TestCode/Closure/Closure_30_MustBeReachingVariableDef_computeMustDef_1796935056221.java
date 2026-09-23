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

public class MustBeReachingVariableDef_computeMustDef_1796935056221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211627;
     Object term211719;
     Object term214721;
     Object term214722;

    public MustBeReachingVariableDef_computeMustDef_1796935056221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term211627 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term211719 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term211811 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term211903 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term211995 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term211719, term211719.getClass(), "type", 1265463001);
        setIntField(term211811, term211811.getClass(), "type", -2027534003);
        setIntField(term211903, term211903.getClass(), "type", 1375330971);
        setIntField(term211995, term211995.getClass(), "type", 121);
        setField(term211903, term211903.getClass(), "first", term211995);
        setField(term211811, term211811.getClass(), "first", term211903);
        setField(term211719, term211719.getClass(), "first", term211811);
        term214721 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term214721, term214721.getClass(), "jsScope", null);
        setField(term214721, term214721.getClass(), "compiler", null);
        setField(term214721, term214721.getClass(), "escaped", null);
        setField(term214721, term214721.getClass(), "cfg", null);
        setField(term214721, term214721.getClass(), "joinOp", null);
        setField(term214721, term214721.getClass(), "orderedWorkSet", null);
        term214722 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term214723 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term214724 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term214725 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term214722, term214722.getClass(), "str", null);
        setIntField(term214722, term214722.getClass(), "type", 1265463001);
        setField(term214722, term214722.getClass(), "next", null);
        setField(term214723, term214723.getClass(), "str", null);
        setIntField(term214723, term214723.getClass(), "type", -2027534003);
        setField(term214723, term214723.getClass(), "next", null);
        setField(term214724, term214724.getClass(), "str", null);
        setIntField(term214724, term214724.getClass(), "type", 1375330971);
        setField(term214724, term214724.getClass(), "next", null);
        setField(term214725, term214725.getClass(), "str", null);
        setIntField(term214725, term214725.getClass(), "type", 121);
        setField(term214725, term214725.getClass(), "next", null);
        setField(term214725, term214725.getClass(), "first", null);
        setField(term214725, term214725.getClass(), "last", null);
        setField(term214725, term214725.getClass(), "propListHead", null);
        setIntField(term214725, term214725.getClass(), "sourcePosition", 0);
        setField(term214725, term214725.getClass(), "jsType", null);
        setField(term214725, term214725.getClass(), "parent", null);
        setField(term214724, term214724.getClass(), "first", term214725);
        setField(term214724, term214724.getClass(), "last", null);
        setField(term214724, term214724.getClass(), "propListHead", null);
        setIntField(term214724, term214724.getClass(), "sourcePosition", 0);
        setField(term214724, term214724.getClass(), "jsType", null);
        setField(term214724, term214724.getClass(), "parent", null);
        setField(term214723, term214723.getClass(), "first", term214724);
        setField(term214723, term214723.getClass(), "last", null);
        setField(term214723, term214723.getClass(), "propListHead", null);
        setIntField(term214723, term214723.getClass(), "sourcePosition", 0);
        setField(term214723, term214723.getClass(), "jsType", null);
        setField(term214723, term214723.getClass(), "parent", null);
        setField(term214722, term214722.getClass(), "first", term214723);
        setField(term214722, term214722.getClass(), "last", null);
        setField(term214722, term214722.getClass(), "propListHead", null);
        setIntField(term214722, term214722.getClass(), "sourcePosition", 0);
        setField(term214722, term214722.getClass(), "jsType", null);
        setField(term214722, term214722.getClass(), "parent", null);
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
        args[0] = term211719;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term211627, args);
        assertTrue(recursiveEquals(term211627, term214721));
        assertTrue(recursiveEquals(term211719, term214722));
    }

};


