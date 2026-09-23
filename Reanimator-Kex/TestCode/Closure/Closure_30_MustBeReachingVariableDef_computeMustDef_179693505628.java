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

public class MustBeReachingVariableDef_computeMustDef_179693505628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4369;
     Object term4439;
     Object term5393;
     Object term5394;

    public MustBeReachingVariableDef_computeMustDef_179693505628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4369 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term4439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4439, term4439.getClass(), "type", 1265463001);
        setIntField(term4509, term4509.getClass(), "type", -2027534003);
        setIntField(term4579, term4579.getClass(), "type", 106);
        setField(term4509, term4509.getClass(), "first", term4579);
        setField(term4439, term4439.getClass(), "first", term4509);
        term5393 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term5393, term5393.getClass(), "jsScope", null);
        setField(term5393, term5393.getClass(), "compiler", null);
        setField(term5393, term5393.getClass(), "escaped", null);
        setField(term5393, term5393.getClass(), "cfg", null);
        setField(term5393, term5393.getClass(), "joinOp", null);
        setField(term5393, term5393.getClass(), "orderedWorkSet", null);
        term5394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5394, term5394.getClass(), "type", 1265463001);
        setField(term5394, term5394.getClass(), "next", null);
        setIntField(term5395, term5395.getClass(), "type", -2027534003);
        setField(term5395, term5395.getClass(), "next", null);
        setIntField(term5396, term5396.getClass(), "type", 106);
        setField(term5396, term5396.getClass(), "next", null);
        setField(term5396, term5396.getClass(), "first", null);
        setField(term5396, term5396.getClass(), "last", null);
        setField(term5396, term5396.getClass(), "propListHead", null);
        setIntField(term5396, term5396.getClass(), "sourcePosition", 0);
        setField(term5396, term5396.getClass(), "jsType", null);
        setField(term5396, term5396.getClass(), "parent", null);
        setField(term5395, term5395.getClass(), "first", term5396);
        setField(term5395, term5395.getClass(), "last", null);
        setField(term5395, term5395.getClass(), "propListHead", null);
        setIntField(term5395, term5395.getClass(), "sourcePosition", 0);
        setField(term5395, term5395.getClass(), "jsType", null);
        setField(term5395, term5395.getClass(), "parent", null);
        setField(term5394, term5394.getClass(), "first", term5395);
        setField(term5394, term5394.getClass(), "last", null);
        setField(term5394, term5394.getClass(), "propListHead", null);
        setIntField(term5394, term5394.getClass(), "sourcePosition", 0);
        setField(term5394, term5394.getClass(), "jsType", null);
        setField(term5394, term5394.getClass(), "parent", null);
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
        args[0] = term4439;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term4369, args);
        assertTrue(recursiveEquals(term4369, term5393));
        assertTrue(recursiveEquals(term4439, term5394));
    }

};


