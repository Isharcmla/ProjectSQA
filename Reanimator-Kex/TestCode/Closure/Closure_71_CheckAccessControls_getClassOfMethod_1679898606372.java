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

public class CheckAccessControls_getClassOfMethod_1679898606372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114590;
     Object term114682;
     Object term114774;
     Object term192250;
     Object term192251;
     Object term192252;

    public CheckAccessControls_getClassOfMethod_1679898606372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114590 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term114682 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term114682, term114682.getClass(), "type", 0);
        term114774 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term114774, term114774.getClass(), "type", 38);
        term192250 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term192250, term192250.getClass(), "compiler", null);
        setField(term192250, term192250.getClass(), "validator", null);
        setIntField(term192250, term192250.getClass(), "deprecatedDepth", 0);
        setIntField(term192250, term192250.getClass(), "methodDepth", 0);
        setField(term192250, term192250.getClass(), "currentClass", null);
        setField(term192250, term192250.getClass(), "initializedConstantProperties", null);
        term192251 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term192251, term192251.getClass(), "number", 0.0);
        setIntField(term192251, term192251.getClass(), "type", 38);
        setField(term192251, term192251.getClass(), "next", null);
        setField(term192251, term192251.getClass(), "first", null);
        setField(term192251, term192251.getClass(), "last", null);
        setField(term192251, term192251.getClass(), "propListHead", null);
        setIntField(term192251, term192251.getClass(), "sourcePosition", 0);
        setField(term192251, term192251.getClass(), "jsType", null);
        setField(term192251, term192251.getClass(), "parent", null);
        term192252 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term192252, term192252.getClass(), "str", null);
        setIntField(term192252, term192252.getClass(), "type", 0);
        setField(term192252, term192252.getClass(), "next", null);
        setField(term192252, term192252.getClass(), "first", null);
        setField(term192252, term192252.getClass(), "last", null);
        setField(term192252, term192252.getClass(), "propListHead", null);
        setIntField(term192252, term192252.getClass(), "sourcePosition", 0);
        setField(term192252, term192252.getClass(), "jsType", null);
        setField(term192252, term192252.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term114682;
        args[1] = term114774;
        Object retValue = callMethod(klass, "getClassOfMethod", argTypes, term114590, args);
        assertTrue(recursiveEquals(term114590, term192250));
        assertTrue(recursiveEquals(term114682, term192251));
        assertTrue(recursiveEquals(term114774, term192252));
        assertTrue(recursiveEquals(retValue, null));
    }

};


