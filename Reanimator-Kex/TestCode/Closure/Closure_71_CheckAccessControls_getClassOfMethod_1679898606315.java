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

public class CheckAccessControls_getClassOfMethod_1679898606315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99917;
     Object term100009;
     Object term100101;
     Object term101169;
     Object term101170;
     Object term101171;

    public CheckAccessControls_getClassOfMethod_1679898606315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99917 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term100009 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term100101 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term100101, term100101.getClass(), "type", -87);
        term101169 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term101169, term101169.getClass(), "compiler", null);
        setField(term101169, term101169.getClass(), "validator", null);
        setIntField(term101169, term101169.getClass(), "deprecatedDepth", 0);
        setIntField(term101169, term101169.getClass(), "methodDepth", 0);
        setField(term101169, term101169.getClass(), "currentClass", null);
        setField(term101169, term101169.getClass(), "initializedConstantProperties", null);
        term101170 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term101170, term101170.getClass(), "str", null);
        setIntField(term101170, term101170.getClass(), "type", -87);
        setField(term101170, term101170.getClass(), "next", null);
        setField(term101170, term101170.getClass(), "first", null);
        setField(term101170, term101170.getClass(), "last", null);
        setField(term101170, term101170.getClass(), "propListHead", null);
        setIntField(term101170, term101170.getClass(), "sourcePosition", 0);
        setField(term101170, term101170.getClass(), "jsType", null);
        setField(term101170, term101170.getClass(), "parent", null);
        term101171 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term101171, term101171.getClass(), "str", null);
        setIntField(term101171, term101171.getClass(), "type", 0);
        setField(term101171, term101171.getClass(), "next", null);
        setField(term101171, term101171.getClass(), "first", null);
        setField(term101171, term101171.getClass(), "last", null);
        setField(term101171, term101171.getClass(), "propListHead", null);
        setIntField(term101171, term101171.getClass(), "sourcePosition", 0);
        setField(term101171, term101171.getClass(), "jsType", null);
        setField(term101171, term101171.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term100009;
        args[1] = term100101;
        Object retValue = callMethod(klass, "getClassOfMethod", argTypes, term99917, args);
        assertTrue(recursiveEquals(term99917, term101169));
        assertTrue(recursiveEquals(term100009, term101170));
        assertTrue(recursiveEquals(term100101, term101171));
        assertTrue(recursiveEquals(retValue, null));
    }

};


