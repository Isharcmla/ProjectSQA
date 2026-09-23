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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_getFunctionParameters_868132584295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3304;

    public NodeUtil_getFunctionParameters_868132584295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3304 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3314 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3304, term3304.getClass(), "type", 1329150584);
        setIntField(term3306, term3306.getClass(), "type", 953387911);
        setIntField(term3308, term3308.getClass(), "type", 0);
        setField(term3308, term3308.getClass(), "next", null);
        setField(term3308, term3308.getClass(), "first", null);
        setField(term3308, term3308.getClass(), "last", null);
        setField(term3308, term3308.getClass(), "propListHead", null);
        setIntField(term3308, term3308.getClass(), "sourcePosition", 0);
        setField(term3308, term3308.getClass(), "jsType", null);
        setField(term3308, term3308.getClass(), "parent", null);
        setField(term3306, term3306.getClass(), "next", term3308);
        setIntField(term3311, term3311.getClass(), "type", 0);
        setField(term3311, term3311.getClass(), "next", null);
        setField(term3311, term3311.getClass(), "first", null);
        setField(term3311, term3311.getClass(), "last", null);
        setField(term3311, term3311.getClass(), "propListHead", null);
        setIntField(term3311, term3311.getClass(), "sourcePosition", 0);
        setField(term3311, term3311.getClass(), "jsType", null);
        setField(term3311, term3311.getClass(), "parent", null);
        setField(term3306, term3306.getClass(), "first", term3311);
        setIntField(term3314, term3314.getClass(), "type", 0);
        setField(term3314, term3314.getClass(), "next", null);
        setField(term3314, term3314.getClass(), "first", null);
        setField(term3314, term3314.getClass(), "last", null);
        setField(term3314, term3314.getClass(), "propListHead", null);
        setIntField(term3314, term3314.getClass(), "sourcePosition", 0);
        setField(term3314, term3314.getClass(), "jsType", null);
        setField(term3314, term3314.getClass(), "parent", null);
        setField(term3306, term3306.getClass(), "last", term3314);
        setField(term3306, term3306.getClass(), "propListHead", null);
        setIntField(term3306, term3306.getClass(), "sourcePosition", 0);
        setField(term3306, term3306.getClass(), "jsType", null);
        setField(term3306, term3306.getClass(), "parent", null);
        setField(term3304, term3304.getClass(), "next", term3306);
        setIntField(term3318, term3318.getClass(), "type", 0);
        setField(term3318, term3318.getClass(), "next", null);
        setField(term3318, term3318.getClass(), "first", null);
        setField(term3318, term3318.getClass(), "last", null);
        setField(term3318, term3318.getClass(), "propListHead", null);
        setIntField(term3318, term3318.getClass(), "sourcePosition", 0);
        setField(term3318, term3318.getClass(), "jsType", null);
        setField(term3318, term3318.getClass(), "parent", null);
        setField(term3304, term3304.getClass(), "first", term3318);
        setIntField(term3321, term3321.getClass(), "type", 0);
        setField(term3321, term3321.getClass(), "next", null);
        setField(term3321, term3321.getClass(), "first", null);
        setField(term3321, term3321.getClass(), "last", null);
        setField(term3321, term3321.getClass(), "propListHead", null);
        setIntField(term3321, term3321.getClass(), "sourcePosition", 0);
        setField(term3321, term3321.getClass(), "jsType", null);
        setField(term3321, term3321.getClass(), "parent", null);
        setField(term3304, term3304.getClass(), "last", term3321);
        setField(term3304, term3304.getClass(), "propListHead", null);
        setIntField(term3304, term3304.getClass(), "sourcePosition", 0);
        setField(term3304, term3304.getClass(), "jsType", null);
        setField(term3304, term3304.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3304;
        try {
            callMethod(klass, "getFunctionParameters", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


