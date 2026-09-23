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

public class CheckAccessControls_getClassOfMethod_1679898606212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60704;
     Object term60774;
     Object term61266;
     Object term61267;

    public CheckAccessControls_getClassOfMethod_1679898606212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60704 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term60774 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term60774, term60774.getClass(), "type", 86);
        setField(term60774, term60774.getClass(), "first", term60774);
        term61266 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term61266, term61266.getClass(), "compiler", null);
        setField(term61266, term61266.getClass(), "validator", null);
        setIntField(term61266, term61266.getClass(), "deprecatedDepth", 0);
        setIntField(term61266, term61266.getClass(), "methodDepth", 0);
        setField(term61266, term61266.getClass(), "currentClass", null);
        setField(term61266, term61266.getClass(), "initializedConstantProperties", null);
        term61267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term61267, term61267.getClass(), "type", 86);
        setField(term61267, term61267.getClass(), "next", null);
        setField(term61267, term61267.getClass(), "first", term61267);
        setField(term61267, term61267.getClass(), "last", null);
        setField(term61267, term61267.getClass(), "propListHead", null);
        setIntField(term61267, term61267.getClass(), "sourcePosition", 0);
        setField(term61267, term61267.getClass(), "jsType", null);
        setField(term61267, term61267.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term60774;
        Object retValue = callMethod(klass, "getClassOfMethod", argTypes, term60704, args);
        assertTrue(recursiveEquals(term60704, term61266));
        assertTrue(recursiveEquals(term60774, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


