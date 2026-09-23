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

public class CheckAccessControls_hotSwapScript_739486180262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77960;
     Object term78030;
     Object term79134;
     Object term79135;

    public CheckAccessControls_hotSwapScript_739486180262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77960 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term77960, term77960.getClass(), "compiler", null);
        term78030 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78100 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term78030, term78030.getClass(), "type", 30);
        setField(term78100, term78100.getClass(), "next", null);
        setIntField(term78100, term78100.getClass(), "type", 30);
        setField(term78100, term78100.getClass(), "first", null);
        setField(term78100, term78100.getClass(), "jsType", null);
        setField(term78030, term78030.getClass(), "first", term78100);
        term79134 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term79134, term79134.getClass(), "compiler", null);
        setField(term79134, term79134.getClass(), "validator", null);
        setIntField(term79134, term79134.getClass(), "deprecatedDepth", 0);
        setIntField(term79134, term79134.getClass(), "methodDepth", 0);
        setField(term79134, term79134.getClass(), "currentClass", null);
        setField(term79134, term79134.getClass(), "initializedConstantProperties", null);
        term79135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79136 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term79135, term79135.getClass(), "type", 30);
        setField(term79135, term79135.getClass(), "next", null);
        setIntField(term79136, term79136.getClass(), "type", 30);
        setField(term79136, term79136.getClass(), "next", null);
        setField(term79136, term79136.getClass(), "first", null);
        setField(term79136, term79136.getClass(), "last", null);
        setField(term79136, term79136.getClass(), "propListHead", null);
        setIntField(term79136, term79136.getClass(), "sourcePosition", 0);
        setField(term79136, term79136.getClass(), "jsType", null);
        setField(term79136, term79136.getClass(), "parent", null);
        setField(term79135, term79135.getClass(), "first", term79136);
        setField(term79135, term79135.getClass(), "last", null);
        setField(term79135, term79135.getClass(), "propListHead", null);
        setIntField(term79135, term79135.getClass(), "sourcePosition", 0);
        setField(term79135, term79135.getClass(), "jsType", null);
        setField(term79135, term79135.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term78030;
        callMethod(klass, "hotSwapScript", argTypes, term77960, args);
        assertTrue(recursiveEquals(term77960, term79134));
        assertTrue(recursiveEquals(term78030, term79135));
    }

};


