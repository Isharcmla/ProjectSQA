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

public class MustBeReachingVariableDef_computeMustDef_179693505669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17460;
     Object term17530;
     Object term18002;
     Object term18003;

    public MustBeReachingVariableDef_computeMustDef_179693505669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17460 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term17530 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17530, term17530.getClass(), "type", 1265463001);
        setIntField(term17600, term17600.getClass(), "type", -2027534003);
        setIntField(term17670, term17670.getClass(), "type", 1375330971);
        setField(term17670, term17670.getClass(), "first", null);
        setField(term17670, term17670.getClass(), "next", null);
        setField(term17600, term17600.getClass(), "first", term17670);
        setIntField(term17740, term17740.getClass(), "type", 125);
        setField(term17600, term17600.getClass(), "next", term17740);
        setField(term17530, term17530.getClass(), "first", term17600);
        term18002 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term18002, term18002.getClass(), "jsScope", null);
        setField(term18002, term18002.getClass(), "compiler", null);
        setField(term18002, term18002.getClass(), "escaped", null);
        setField(term18002, term18002.getClass(), "cfg", null);
        setField(term18002, term18002.getClass(), "joinOp", null);
        setField(term18002, term18002.getClass(), "orderedWorkSet", null);
        term18003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18004 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18006 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18003, term18003.getClass(), "type", 1265463001);
        setField(term18003, term18003.getClass(), "next", null);
        setIntField(term18004, term18004.getClass(), "type", -2027534003);
        setIntField(term18005, term18005.getClass(), "type", 125);
        setField(term18005, term18005.getClass(), "next", null);
        setField(term18005, term18005.getClass(), "first", null);
        setField(term18005, term18005.getClass(), "last", null);
        setField(term18005, term18005.getClass(), "propListHead", null);
        setIntField(term18005, term18005.getClass(), "sourcePosition", 0);
        setField(term18005, term18005.getClass(), "jsType", null);
        setField(term18005, term18005.getClass(), "parent", null);
        setField(term18004, term18004.getClass(), "next", term18005);
        setIntField(term18006, term18006.getClass(), "type", 1375330971);
        setField(term18006, term18006.getClass(), "next", null);
        setField(term18006, term18006.getClass(), "first", null);
        setField(term18006, term18006.getClass(), "last", null);
        setField(term18006, term18006.getClass(), "propListHead", null);
        setIntField(term18006, term18006.getClass(), "sourcePosition", 0);
        setField(term18006, term18006.getClass(), "jsType", null);
        setField(term18006, term18006.getClass(), "parent", null);
        setField(term18004, term18004.getClass(), "first", term18006);
        setField(term18004, term18004.getClass(), "last", null);
        setField(term18004, term18004.getClass(), "propListHead", null);
        setIntField(term18004, term18004.getClass(), "sourcePosition", 0);
        setField(term18004, term18004.getClass(), "jsType", null);
        setField(term18004, term18004.getClass(), "parent", null);
        setField(term18003, term18003.getClass(), "first", term18004);
        setField(term18003, term18003.getClass(), "last", null);
        setField(term18003, term18003.getClass(), "propListHead", null);
        setIntField(term18003, term18003.getClass(), "sourcePosition", 0);
        setField(term18003, term18003.getClass(), "jsType", null);
        setField(term18003, term18003.getClass(), "parent", null);
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
        args[0] = term17530;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term17460, args);
        assertTrue(recursiveEquals(term17460, term18002));
        assertTrue(recursiveEquals(term17530, term18003));
    }

};


