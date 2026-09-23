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

public class MustBeReachingVariableDef_computeMustDef_1796935056164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45980;
     Object term46072;
     Object term47141;
     Object term47142;

    public MustBeReachingVariableDef_computeMustDef_1796935056164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45980 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term46072 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term46164 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term46256 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term46348 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term46072, term46072.getClass(), "type", 1265463001);
        setIntField(term46164, term46164.getClass(), "type", -2027534003);
        setIntField(term46256, term46256.getClass(), "type", 1375330971);
        setField(term46256, term46256.getClass(), "first", null);
        setField(term46256, term46256.getClass(), "next", null);
        setField(term46164, term46164.getClass(), "first", term46256);
        setIntField(term46348, term46348.getClass(), "type", 119);
        setField(term46164, term46164.getClass(), "next", term46348);
        setField(term46072, term46072.getClass(), "first", term46164);
        term47141 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term47141, term47141.getClass(), "jsScope", null);
        setField(term47141, term47141.getClass(), "compiler", null);
        setField(term47141, term47141.getClass(), "escaped", null);
        setField(term47141, term47141.getClass(), "cfg", null);
        setField(term47141, term47141.getClass(), "joinOp", null);
        setField(term47141, term47141.getClass(), "orderedWorkSet", null);
        term47142 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term47143 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term47144 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term47145 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term47142, term47142.getClass(), "str", null);
        setIntField(term47142, term47142.getClass(), "type", 1265463001);
        setField(term47142, term47142.getClass(), "next", null);
        setField(term47143, term47143.getClass(), "str", null);
        setIntField(term47143, term47143.getClass(), "type", -2027534003);
        setField(term47144, term47144.getClass(), "str", null);
        setIntField(term47144, term47144.getClass(), "type", 119);
        setField(term47144, term47144.getClass(), "next", null);
        setField(term47144, term47144.getClass(), "first", null);
        setField(term47144, term47144.getClass(), "last", null);
        setField(term47144, term47144.getClass(), "propListHead", null);
        setIntField(term47144, term47144.getClass(), "sourcePosition", 0);
        setField(term47144, term47144.getClass(), "jsType", null);
        setField(term47144, term47144.getClass(), "parent", null);
        setField(term47143, term47143.getClass(), "next", term47144);
        setField(term47145, term47145.getClass(), "str", null);
        setIntField(term47145, term47145.getClass(), "type", 1375330971);
        setField(term47145, term47145.getClass(), "next", null);
        setField(term47145, term47145.getClass(), "first", null);
        setField(term47145, term47145.getClass(), "last", null);
        setField(term47145, term47145.getClass(), "propListHead", null);
        setIntField(term47145, term47145.getClass(), "sourcePosition", 0);
        setField(term47145, term47145.getClass(), "jsType", null);
        setField(term47145, term47145.getClass(), "parent", null);
        setField(term47143, term47143.getClass(), "first", term47145);
        setField(term47143, term47143.getClass(), "last", null);
        setField(term47143, term47143.getClass(), "propListHead", null);
        setIntField(term47143, term47143.getClass(), "sourcePosition", 0);
        setField(term47143, term47143.getClass(), "jsType", null);
        setField(term47143, term47143.getClass(), "parent", null);
        setField(term47142, term47142.getClass(), "first", term47143);
        setField(term47142, term47142.getClass(), "last", null);
        setField(term47142, term47142.getClass(), "propListHead", null);
        setIntField(term47142, term47142.getClass(), "sourcePosition", 0);
        setField(term47142, term47142.getClass(), "jsType", null);
        setField(term47142, term47142.getClass(), "parent", null);
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
        args[0] = term46072;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term45980, args);
        assertTrue(recursiveEquals(term45980, term47141));
        assertTrue(recursiveEquals(term46072, term47142));
    }

};


