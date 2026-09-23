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

public class CheckAccessControls_hotSwapScript_739486180226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65873;
     Object term65943;
     Object term66118;
     Object term66119;

    public CheckAccessControls_hotSwapScript_739486180226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65873 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term65873, term65873.getClass(), "compiler", null);
        term65943 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66013 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term65943, term65943.getClass(), "type", 0);
        setField(term66013, term66013.getClass(), "next", null);
        setIntField(term66013, term66013.getClass(), "type", 30);
        setField(term66013, term66013.getClass(), "first", null);
        setField(term65943, term65943.getClass(), "first", term66013);
        term66118 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term66118, term66118.getClass(), "compiler", null);
        setField(term66118, term66118.getClass(), "validator", null);
        setIntField(term66118, term66118.getClass(), "deprecatedDepth", 0);
        setIntField(term66118, term66118.getClass(), "methodDepth", 0);
        setField(term66118, term66118.getClass(), "currentClass", null);
        setField(term66118, term66118.getClass(), "initializedConstantProperties", null);
        term66119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66120 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term66119, term66119.getClass(), "type", 0);
        setField(term66119, term66119.getClass(), "next", null);
        setIntField(term66120, term66120.getClass(), "type", 30);
        setField(term66120, term66120.getClass(), "next", null);
        setField(term66120, term66120.getClass(), "first", null);
        setField(term66120, term66120.getClass(), "last", null);
        setField(term66120, term66120.getClass(), "propListHead", null);
        setIntField(term66120, term66120.getClass(), "sourcePosition", 0);
        setField(term66120, term66120.getClass(), "jsType", null);
        setField(term66120, term66120.getClass(), "parent", null);
        setField(term66119, term66119.getClass(), "first", term66120);
        setField(term66119, term66119.getClass(), "last", null);
        setField(term66119, term66119.getClass(), "propListHead", null);
        setIntField(term66119, term66119.getClass(), "sourcePosition", 0);
        setField(term66119, term66119.getClass(), "jsType", null);
        setField(term66119, term66119.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term65943;
        callMethod(klass, "hotSwapScript", argTypes, term65873, args);
        assertTrue(recursiveEquals(term65873, term66118));
        assertTrue(recursiveEquals(term65943, term66119));
    }

};


