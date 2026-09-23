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

public class MustBeReachingVariableDef_computeMustDef_1796935056151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41730;
     Object term41822;
     Object term43466;
     Object term43467;

    public MustBeReachingVariableDef_computeMustDef_1796935056151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41730 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term41822 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term41914 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term42006 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term42098 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term42190 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term41822, term41822.getClass(), "type", 1265463001);
        setIntField(term41914, term41914.getClass(), "type", -2027534003);
        setIntField(term42006, term42006.getClass(), "type", 1375330971);
        setField(term42006, term42006.getClass(), "first", null);
        setField(term42006, term42006.getClass(), "next", null);
        setField(term41914, term41914.getClass(), "first", term42006);
        setIntField(term42098, term42098.getClass(), "type", 0);
        setField(term42098, term42098.getClass(), "first", term42190);
        setField(term41914, term41914.getClass(), "next", term42098);
        setField(term41822, term41822.getClass(), "first", term41914);
        term43466 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term43466, term43466.getClass(), "jsScope", null);
        setField(term43466, term43466.getClass(), "compiler", null);
        setField(term43466, term43466.getClass(), "escaped", null);
        setField(term43466, term43466.getClass(), "cfg", null);
        setField(term43466, term43466.getClass(), "joinOp", null);
        setField(term43466, term43466.getClass(), "orderedWorkSet", null);
        term43467 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term43468 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term43469 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term43470 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term43471 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term43467, term43467.getClass(), "str", null);
        setIntField(term43467, term43467.getClass(), "type", 1265463001);
        setField(term43467, term43467.getClass(), "next", null);
        setField(term43468, term43468.getClass(), "str", null);
        setIntField(term43468, term43468.getClass(), "type", -2027534003);
        setField(term43469, term43469.getClass(), "str", null);
        setIntField(term43469, term43469.getClass(), "type", 0);
        setField(term43469, term43469.getClass(), "next", null);
        setField(term43470, term43470.getClass(), "str", null);
        setIntField(term43470, term43470.getClass(), "type", 0);
        setField(term43470, term43470.getClass(), "next", null);
        setField(term43470, term43470.getClass(), "first", null);
        setField(term43470, term43470.getClass(), "last", null);
        setField(term43470, term43470.getClass(), "propListHead", null);
        setIntField(term43470, term43470.getClass(), "sourcePosition", 0);
        setField(term43470, term43470.getClass(), "jsType", null);
        setField(term43470, term43470.getClass(), "parent", null);
        setField(term43469, term43469.getClass(), "first", term43470);
        setField(term43469, term43469.getClass(), "last", null);
        setField(term43469, term43469.getClass(), "propListHead", null);
        setIntField(term43469, term43469.getClass(), "sourcePosition", 0);
        setField(term43469, term43469.getClass(), "jsType", null);
        setField(term43469, term43469.getClass(), "parent", null);
        setField(term43468, term43468.getClass(), "next", term43469);
        setField(term43471, term43471.getClass(), "str", null);
        setIntField(term43471, term43471.getClass(), "type", 1375330971);
        setField(term43471, term43471.getClass(), "next", null);
        setField(term43471, term43471.getClass(), "first", null);
        setField(term43471, term43471.getClass(), "last", null);
        setField(term43471, term43471.getClass(), "propListHead", null);
        setIntField(term43471, term43471.getClass(), "sourcePosition", 0);
        setField(term43471, term43471.getClass(), "jsType", null);
        setField(term43471, term43471.getClass(), "parent", null);
        setField(term43468, term43468.getClass(), "first", term43471);
        setField(term43468, term43468.getClass(), "last", null);
        setField(term43468, term43468.getClass(), "propListHead", null);
        setIntField(term43468, term43468.getClass(), "sourcePosition", 0);
        setField(term43468, term43468.getClass(), "jsType", null);
        setField(term43468, term43468.getClass(), "parent", null);
        setField(term43467, term43467.getClass(), "first", term43468);
        setField(term43467, term43467.getClass(), "last", null);
        setField(term43467, term43467.getClass(), "propListHead", null);
        setIntField(term43467, term43467.getClass(), "sourcePosition", 0);
        setField(term43467, term43467.getClass(), "jsType", null);
        setField(term43467, term43467.getClass(), "parent", null);
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
        args[0] = term41822;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term41730, args);
        assertTrue(recursiveEquals(term41730, term43466));
        assertTrue(recursiveEquals(term41822, term43467));
    }

};


