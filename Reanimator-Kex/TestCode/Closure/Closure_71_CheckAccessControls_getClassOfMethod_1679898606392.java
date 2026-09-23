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

public class CheckAccessControls_getClassOfMethod_1679898606392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200109;
     Object term200201;
     Object term200293;
     Object term200312;
     Object term200313;
     Object term200314;

    public CheckAccessControls_getClassOfMethod_1679898606392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term200109 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term200201 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term200293 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term200293, term200293.getClass(), "type", -87);
        term200312 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term200312, term200312.getClass(), "compiler", null);
        setField(term200312, term200312.getClass(), "validator", null);
        setIntField(term200312, term200312.getClass(), "deprecatedDepth", 0);
        setIntField(term200312, term200312.getClass(), "methodDepth", 0);
        setField(term200312, term200312.getClass(), "currentClass", null);
        setField(term200312, term200312.getClass(), "initializedConstantProperties", null);
        term200313 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term200313, term200313.getClass(), "str", null);
        setIntField(term200313, term200313.getClass(), "type", -87);
        setField(term200313, term200313.getClass(), "next", null);
        setField(term200313, term200313.getClass(), "first", null);
        setField(term200313, term200313.getClass(), "last", null);
        setField(term200313, term200313.getClass(), "propListHead", null);
        setIntField(term200313, term200313.getClass(), "sourcePosition", 0);
        setField(term200313, term200313.getClass(), "jsType", null);
        setField(term200313, term200313.getClass(), "parent", null);
        term200314 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term200314, term200314.getClass(), "number", 0.0);
        setIntField(term200314, term200314.getClass(), "type", 0);
        setField(term200314, term200314.getClass(), "next", null);
        setField(term200314, term200314.getClass(), "first", null);
        setField(term200314, term200314.getClass(), "last", null);
        setField(term200314, term200314.getClass(), "propListHead", null);
        setIntField(term200314, term200314.getClass(), "sourcePosition", 0);
        setField(term200314, term200314.getClass(), "jsType", null);
        setField(term200314, term200314.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term200201;
        args[1] = term200293;
        Object retValue = callMethod(klass, "getClassOfMethod", argTypes, term200109, args);
        assertTrue(recursiveEquals(term200109, term200312));
        assertTrue(recursiveEquals(term200201, term200313));
        assertTrue(recursiveEquals(term200293, term200314));
        assertTrue(recursiveEquals(retValue, null));
    }

};


