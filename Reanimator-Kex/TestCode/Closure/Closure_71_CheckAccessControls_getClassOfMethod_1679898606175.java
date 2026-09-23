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

public class CheckAccessControls_getClassOfMethod_1679898606175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49007;
     Object term49099;
     Object term49512;
     Object term49513;

    public CheckAccessControls_getClassOfMethod_1679898606175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49007 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term49099 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term49191 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term49099, term49099.getClass(), "type", 86);
        setField(term49099, term49099.getClass(), "first", term49191);
        term49512 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term49512, term49512.getClass(), "compiler", null);
        setField(term49512, term49512.getClass(), "validator", null);
        setIntField(term49512, term49512.getClass(), "deprecatedDepth", 0);
        setIntField(term49512, term49512.getClass(), "methodDepth", 0);
        setField(term49512, term49512.getClass(), "currentClass", null);
        setField(term49512, term49512.getClass(), "initializedConstantProperties", null);
        term49513 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term49514 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term49513, term49513.getClass(), "str", null);
        setIntField(term49513, term49513.getClass(), "type", 86);
        setField(term49513, term49513.getClass(), "next", null);
        setField(term49514, term49514.getClass(), "str", null);
        setIntField(term49514, term49514.getClass(), "type", 0);
        setField(term49514, term49514.getClass(), "next", null);
        setField(term49514, term49514.getClass(), "first", null);
        setField(term49514, term49514.getClass(), "last", null);
        setField(term49514, term49514.getClass(), "propListHead", null);
        setIntField(term49514, term49514.getClass(), "sourcePosition", 0);
        setField(term49514, term49514.getClass(), "jsType", null);
        setField(term49514, term49514.getClass(), "parent", null);
        setField(term49513, term49513.getClass(), "first", term49514);
        setField(term49513, term49513.getClass(), "last", null);
        setField(term49513, term49513.getClass(), "propListHead", null);
        setIntField(term49513, term49513.getClass(), "sourcePosition", 0);
        setField(term49513, term49513.getClass(), "jsType", null);
        setField(term49513, term49513.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term49099;
        Object retValue = callMethod(klass, "getClassOfMethod", argTypes, term49007, args);
        assertTrue(recursiveEquals(term49007, term49512));
        assertTrue(recursiveEquals(term49099, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


