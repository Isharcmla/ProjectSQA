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

public class CheckAccessControls_process_381406339213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61020;
     Object term61090;
     Object term61413;
     Object term61414;

    public CheckAccessControls_process_381406339213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61020 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term61020, term61020.getClass(), "compiler", null);
        term61090 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61160 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61248 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setIntField(term61090, term61090.getClass(), "type", 30);
        setField(term61160, term61160.getClass(), "next", null);
        setIntField(term61160, term61160.getClass(), "type", 0);
        setField(term61160, term61160.getClass(), "first", null);
        setField(term61090, term61090.getClass(), "first", term61160);
        setField(term61090, term61090.getClass(), "jsType", term61248);
        term61413 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term61413, term61413.getClass(), "compiler", null);
        setField(term61413, term61413.getClass(), "validator", null);
        setIntField(term61413, term61413.getClass(), "deprecatedDepth", 0);
        setIntField(term61413, term61413.getClass(), "methodDepth", 0);
        setField(term61413, term61413.getClass(), "currentClass", null);
        setField(term61413, term61413.getClass(), "initializedConstantProperties", null);
        term61414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61416 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setIntField(term61414, term61414.getClass(), "type", 30);
        setField(term61414, term61414.getClass(), "next", null);
        setIntField(term61415, term61415.getClass(), "type", 0);
        setField(term61415, term61415.getClass(), "next", null);
        setField(term61415, term61415.getClass(), "first", null);
        setField(term61415, term61415.getClass(), "last", null);
        setField(term61415, term61415.getClass(), "propListHead", null);
        setIntField(term61415, term61415.getClass(), "sourcePosition", 0);
        setField(term61415, term61415.getClass(), "jsType", null);
        setField(term61415, term61415.getClass(), "parent", null);
        setField(term61414, term61414.getClass(), "first", term61415);
        setField(term61414, term61414.getClass(), "last", null);
        setField(term61414, term61414.getClass(), "propListHead", null);
        setIntField(term61414, term61414.getClass(), "sourcePosition", 0);
        setField(term61416, term61416.getClass(), "call", null);
        setField(term61416, term61416.getClass(), "prototype", null);
        setField(term61416, term61416.getClass(), "kind", null);
        setField(term61416, term61416.getClass(), "typeOfThis", null);
        setField(term61416, term61416.getClass(), "source", null);
        setField(term61416, term61416.getClass(), "implementedInterfaces", null);
        setField(term61416, term61416.getClass(), "subTypes", null);
        setField(term61416, term61416.getClass(), "templateTypeName", null);
        setField(term61416, term61416.getClass(), "className", null);
        setField(term61416, term61416.getClass(), "properties", null);
        setBooleanField(term61416, term61416.getClass(), "nativeType", false);
        setField(term61416, term61416.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term61416, term61416.getClass(), "prettyPrint", false);
        setBooleanField(term61416, term61416.getClass(), "visited", false);
        setField(term61416, term61416.getClass(), "docInfo", null);
        setBooleanField(term61416, term61416.getClass(), "unknown", false);
        setBooleanField(term61416, term61416.getClass(), "resolved", false);
        setField(term61416, term61416.getClass(), "resolveResult", null);
        setField(term61416, term61416.getClass(), "registry", null);
        setField(term61414, term61414.getClass(), "jsType", term61416);
        setField(term61414, term61414.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term61090;
        callMethod(klass, "process", argTypes, term61020, args);
        assertTrue(recursiveEquals(term61020, term61413));
        assertTrue(recursiveEquals(term61090, null));
    }

};


