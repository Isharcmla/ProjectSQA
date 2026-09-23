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

public class CheckAccessControls_getClassOfMethod_167989860652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9908;
     Object term10000;
     Object term10092;
     Object term11169;
     Object term11170;
     Object term11171;

    public CheckAccessControls_getClassOfMethod_167989860652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9908 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term10000 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term10092 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term10092, term10092.getClass(), "type", -87);
        term11169 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term11169, term11169.getClass(), "compiler", null);
        setField(term11169, term11169.getClass(), "validator", null);
        setIntField(term11169, term11169.getClass(), "deprecatedDepth", 0);
        setIntField(term11169, term11169.getClass(), "methodDepth", 0);
        setField(term11169, term11169.getClass(), "currentClass", null);
        setField(term11169, term11169.getClass(), "initializedConstantProperties", null);
        term11170 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term11170, term11170.getClass(), "str", null);
        setIntField(term11170, term11170.getClass(), "type", -87);
        setField(term11170, term11170.getClass(), "next", null);
        setField(term11170, term11170.getClass(), "first", null);
        setField(term11170, term11170.getClass(), "last", null);
        setField(term11170, term11170.getClass(), "propListHead", null);
        setIntField(term11170, term11170.getClass(), "sourcePosition", 0);
        setField(term11170, term11170.getClass(), "jsType", null);
        setField(term11170, term11170.getClass(), "parent", null);
        term11171 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term11171, term11171.getClass(), "str", null);
        setIntField(term11171, term11171.getClass(), "type", 0);
        setField(term11171, term11171.getClass(), "next", null);
        setField(term11171, term11171.getClass(), "first", null);
        setField(term11171, term11171.getClass(), "last", null);
        setField(term11171, term11171.getClass(), "propListHead", null);
        setIntField(term11171, term11171.getClass(), "sourcePosition", 0);
        setField(term11171, term11171.getClass(), "jsType", null);
        setField(term11171, term11171.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term10000;
        args[1] = term10092;
        Object retValue = callMethod(klass, "getClassOfMethod", argTypes, term9908, args);
        assertTrue(recursiveEquals(term9908, term11169));
        assertTrue(recursiveEquals(term10000, term11170));
        assertTrue(recursiveEquals(term10092, term11171));
        assertTrue(recursiveEquals(retValue, null));
    }

};


