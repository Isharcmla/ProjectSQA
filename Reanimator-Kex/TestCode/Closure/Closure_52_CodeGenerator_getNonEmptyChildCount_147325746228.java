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
import java.lang.Object;
import java.lang.Integer;

public class CodeGenerator_getNonEmptyChildCount_147325746228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2514;
     Object term2535;

    public CodeGenerator_getNonEmptyChildCount_147325746228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2514 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2528 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2531 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2514, term2514.getClass(), "type", 1555897383);
        setIntField(term2516, term2516.getClass(), "type", -1697741339);
        setIntField(term2518, term2518.getClass(), "type", 0);
        setField(term2518, term2518.getClass(), "next", null);
        setField(term2518, term2518.getClass(), "first", null);
        setField(term2518, term2518.getClass(), "last", null);
        setField(term2518, term2518.getClass(), "propListHead", null);
        setIntField(term2518, term2518.getClass(), "sourcePosition", 0);
        setField(term2518, term2518.getClass(), "jsType", null);
        setField(term2518, term2518.getClass(), "parent", null);
        setField(term2516, term2516.getClass(), "next", term2518);
        setIntField(term2521, term2521.getClass(), "type", 0);
        setField(term2521, term2521.getClass(), "next", null);
        setField(term2521, term2521.getClass(), "first", null);
        setField(term2521, term2521.getClass(), "last", null);
        setField(term2521, term2521.getClass(), "propListHead", null);
        setIntField(term2521, term2521.getClass(), "sourcePosition", 0);
        setField(term2521, term2521.getClass(), "jsType", null);
        setField(term2521, term2521.getClass(), "parent", null);
        setField(term2516, term2516.getClass(), "first", term2521);
        setIntField(term2524, term2524.getClass(), "type", 0);
        setField(term2524, term2524.getClass(), "next", null);
        setField(term2524, term2524.getClass(), "first", null);
        setField(term2524, term2524.getClass(), "last", null);
        setField(term2524, term2524.getClass(), "propListHead", null);
        setIntField(term2524, term2524.getClass(), "sourcePosition", 0);
        setField(term2524, term2524.getClass(), "jsType", null);
        setField(term2524, term2524.getClass(), "parent", null);
        setField(term2516, term2516.getClass(), "last", term2524);
        setField(term2516, term2516.getClass(), "propListHead", null);
        setIntField(term2516, term2516.getClass(), "sourcePosition", 0);
        setField(term2516, term2516.getClass(), "jsType", null);
        setField(term2516, term2516.getClass(), "parent", null);
        setField(term2514, term2514.getClass(), "next", term2516);
        setIntField(term2528, term2528.getClass(), "type", 0);
        setField(term2528, term2528.getClass(), "next", null);
        setField(term2528, term2528.getClass(), "first", null);
        setField(term2528, term2528.getClass(), "last", null);
        setField(term2528, term2528.getClass(), "propListHead", null);
        setIntField(term2528, term2528.getClass(), "sourcePosition", 0);
        setField(term2528, term2528.getClass(), "jsType", null);
        setField(term2528, term2528.getClass(), "parent", null);
        setField(term2514, term2514.getClass(), "first", term2528);
        setIntField(term2531, term2531.getClass(), "type", 0);
        setField(term2531, term2531.getClass(), "next", null);
        setField(term2531, term2531.getClass(), "first", null);
        setField(term2531, term2531.getClass(), "last", null);
        setField(term2531, term2531.getClass(), "propListHead", null);
        setIntField(term2531, term2531.getClass(), "sourcePosition", 0);
        setField(term2531, term2531.getClass(), "jsType", null);
        setField(term2531, term2531.getClass(), "parent", null);
        setField(term2514, term2514.getClass(), "last", term2531);
        setField(term2514, term2514.getClass(), "propListHead", null);
        setIntField(term2514, term2514.getClass(), "sourcePosition", 0);
        setField(term2514, term2514.getClass(), "jsType", null);
        setField(term2514, term2514.getClass(), "parent", null);
        term2535 = new Integer(-1498296052);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2514;
        args[1] = term2535;
        callMethod(klass, "getNonEmptyChildCount", argTypes, null, args);
    }

};


