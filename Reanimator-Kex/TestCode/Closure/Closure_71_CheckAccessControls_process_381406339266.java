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

public class CheckAccessControls_process_381406339266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79370;
     Object term79440;
     Object term80282;
     Object term80283;

    public CheckAccessControls_process_381406339266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79370 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term79370, term79370.getClass(), "compiler", null);
        term79440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79510 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term79440, term79440.getClass(), "type", 0);
        setField(term79510, term79510.getClass(), "next", null);
        setIntField(term79510, term79510.getClass(), "type", 30);
        setField(term79510, term79510.getClass(), "first", null);
        setField(term79440, term79440.getClass(), "first", term79510);
        term80282 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term80282, term80282.getClass(), "compiler", null);
        setField(term80282, term80282.getClass(), "validator", null);
        setIntField(term80282, term80282.getClass(), "deprecatedDepth", 0);
        setIntField(term80282, term80282.getClass(), "methodDepth", 0);
        setField(term80282, term80282.getClass(), "currentClass", null);
        setField(term80282, term80282.getClass(), "initializedConstantProperties", null);
        term80283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term80283, term80283.getClass(), "type", 0);
        setField(term80283, term80283.getClass(), "next", null);
        setIntField(term80284, term80284.getClass(), "type", 30);
        setField(term80284, term80284.getClass(), "next", null);
        setField(term80284, term80284.getClass(), "first", null);
        setField(term80284, term80284.getClass(), "last", null);
        setField(term80284, term80284.getClass(), "propListHead", null);
        setIntField(term80284, term80284.getClass(), "sourcePosition", 0);
        setField(term80284, term80284.getClass(), "jsType", null);
        setField(term80284, term80284.getClass(), "parent", null);
        setField(term80283, term80283.getClass(), "first", term80284);
        setField(term80283, term80283.getClass(), "last", null);
        setField(term80283, term80283.getClass(), "propListHead", null);
        setIntField(term80283, term80283.getClass(), "sourcePosition", 0);
        setField(term80283, term80283.getClass(), "jsType", null);
        setField(term80283, term80283.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term79440;
        callMethod(klass, "process", argTypes, term79370, args);
        assertTrue(recursiveEquals(term79370, term80282));
        assertTrue(recursiveEquals(term79440, null));
    }

};


