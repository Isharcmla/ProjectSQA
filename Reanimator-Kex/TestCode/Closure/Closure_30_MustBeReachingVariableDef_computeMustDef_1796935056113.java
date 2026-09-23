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

public class MustBeReachingVariableDef_computeMustDef_1796935056113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30706;
     Object term30798;
     Object term31239;
     Object term31240;

    public MustBeReachingVariableDef_computeMustDef_1796935056113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30706 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term30798 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term30890 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term30982 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term31074 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term30798, term30798.getClass(), "type", 1265463001);
        setIntField(term30890, term30890.getClass(), "type", -2027534003);
        setIntField(term30982, term30982.getClass(), "type", 1375330971);
        setField(term30982, term30982.getClass(), "first", null);
        setField(term30982, term30982.getClass(), "next", null);
        setField(term30890, term30890.getClass(), "first", term30982);
        setIntField(term31074, term31074.getClass(), "type", 112);
        setField(term30890, term30890.getClass(), "next", term31074);
        setField(term30798, term30798.getClass(), "first", term30890);
        term31239 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term31239, term31239.getClass(), "jsScope", null);
        setField(term31239, term31239.getClass(), "compiler", null);
        setField(term31239, term31239.getClass(), "escaped", null);
        setField(term31239, term31239.getClass(), "cfg", null);
        setField(term31239, term31239.getClass(), "joinOp", null);
        setField(term31239, term31239.getClass(), "orderedWorkSet", null);
        term31240 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term31241 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term31242 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term31243 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term31240, term31240.getClass(), "str", null);
        setIntField(term31240, term31240.getClass(), "type", 1265463001);
        setField(term31240, term31240.getClass(), "next", null);
        setField(term31241, term31241.getClass(), "str", null);
        setIntField(term31241, term31241.getClass(), "type", -2027534003);
        setField(term31242, term31242.getClass(), "str", null);
        setIntField(term31242, term31242.getClass(), "type", 112);
        setField(term31242, term31242.getClass(), "next", null);
        setField(term31242, term31242.getClass(), "first", null);
        setField(term31242, term31242.getClass(), "last", null);
        setField(term31242, term31242.getClass(), "propListHead", null);
        setIntField(term31242, term31242.getClass(), "sourcePosition", 0);
        setField(term31242, term31242.getClass(), "jsType", null);
        setField(term31242, term31242.getClass(), "parent", null);
        setField(term31241, term31241.getClass(), "next", term31242);
        setField(term31243, term31243.getClass(), "str", null);
        setIntField(term31243, term31243.getClass(), "type", 1375330971);
        setField(term31243, term31243.getClass(), "next", null);
        setField(term31243, term31243.getClass(), "first", null);
        setField(term31243, term31243.getClass(), "last", null);
        setField(term31243, term31243.getClass(), "propListHead", null);
        setIntField(term31243, term31243.getClass(), "sourcePosition", 0);
        setField(term31243, term31243.getClass(), "jsType", null);
        setField(term31243, term31243.getClass(), "parent", null);
        setField(term31241, term31241.getClass(), "first", term31243);
        setField(term31241, term31241.getClass(), "last", null);
        setField(term31241, term31241.getClass(), "propListHead", null);
        setIntField(term31241, term31241.getClass(), "sourcePosition", 0);
        setField(term31241, term31241.getClass(), "jsType", null);
        setField(term31241, term31241.getClass(), "parent", null);
        setField(term31240, term31240.getClass(), "first", term31241);
        setField(term31240, term31240.getClass(), "last", null);
        setField(term31240, term31240.getClass(), "propListHead", null);
        setIntField(term31240, term31240.getClass(), "sourcePosition", 0);
        setField(term31240, term31240.getClass(), "jsType", null);
        setField(term31240, term31240.getClass(), "parent", null);
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
        args[0] = term30798;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term30706, args);
        assertTrue(recursiveEquals(term30706, term31239));
        assertTrue(recursiveEquals(term30798, term31240));
    }

};


