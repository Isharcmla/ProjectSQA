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

public class CheckAccessControls_getClassOfMethod_167989860695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25950;
     Object term26020;
     Object term26090;
     Object term26109;
     Object term26110;
     Object term26111;

    public CheckAccessControls_getClassOfMethod_167989860695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25950 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term26020 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26020, term26020.getClass(), "type", 38);
        term26090 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26090, term26090.getClass(), "type", 38);
        term26109 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term26109, term26109.getClass(), "compiler", null);
        setField(term26109, term26109.getClass(), "validator", null);
        setIntField(term26109, term26109.getClass(), "deprecatedDepth", 0);
        setIntField(term26109, term26109.getClass(), "methodDepth", 0);
        setField(term26109, term26109.getClass(), "currentClass", null);
        setField(term26109, term26109.getClass(), "initializedConstantProperties", null);
        term26110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26110, term26110.getClass(), "type", 38);
        setField(term26110, term26110.getClass(), "next", null);
        setField(term26110, term26110.getClass(), "first", null);
        setField(term26110, term26110.getClass(), "last", null);
        setField(term26110, term26110.getClass(), "propListHead", null);
        setIntField(term26110, term26110.getClass(), "sourcePosition", 0);
        setField(term26110, term26110.getClass(), "jsType", null);
        setField(term26110, term26110.getClass(), "parent", null);
        term26111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26111, term26111.getClass(), "type", 38);
        setField(term26111, term26111.getClass(), "next", null);
        setField(term26111, term26111.getClass(), "first", null);
        setField(term26111, term26111.getClass(), "last", null);
        setField(term26111, term26111.getClass(), "propListHead", null);
        setIntField(term26111, term26111.getClass(), "sourcePosition", 0);
        setField(term26111, term26111.getClass(), "jsType", null);
        setField(term26111, term26111.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term26020;
        args[1] = term26090;
        Object retValue = callMethod(klass, "getClassOfMethod", argTypes, term25950, args);
        assertTrue(recursiveEquals(term25950, term26109));
        assertTrue(recursiveEquals(term26020, term26110));
        assertTrue(recursiveEquals(term26090, term26111));
        assertTrue(recursiveEquals(retValue, null));
    }

};


