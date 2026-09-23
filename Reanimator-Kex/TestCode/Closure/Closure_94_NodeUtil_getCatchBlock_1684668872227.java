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

public class NodeUtil_getCatchBlock_1684668872227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3301;

    public NodeUtil_getCatchBlock_1684668872227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3314 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3324 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3301, term3301.getClass(), "type", 249657454);
        setIntField(term3303, term3303.getClass(), "type", -1600748613);
        setIntField(term3305, term3305.getClass(), "type", 0);
        setField(term3305, term3305.getClass(), "next", null);
        setField(term3305, term3305.getClass(), "first", null);
        setField(term3305, term3305.getClass(), "last", null);
        setField(term3305, term3305.getClass(), "propListHead", null);
        setIntField(term3305, term3305.getClass(), "sourcePosition", 0);
        setField(term3305, term3305.getClass(), "jsType", null);
        setField(term3305, term3305.getClass(), "parent", null);
        setField(term3303, term3303.getClass(), "next", term3305);
        setIntField(term3308, term3308.getClass(), "type", 0);
        setField(term3308, term3308.getClass(), "next", null);
        setField(term3308, term3308.getClass(), "first", null);
        setField(term3308, term3308.getClass(), "last", null);
        setField(term3308, term3308.getClass(), "propListHead", null);
        setIntField(term3308, term3308.getClass(), "sourcePosition", 0);
        setField(term3308, term3308.getClass(), "jsType", null);
        setField(term3308, term3308.getClass(), "parent", null);
        setField(term3303, term3303.getClass(), "first", term3308);
        setIntField(term3311, term3311.getClass(), "type", 0);
        setField(term3311, term3311.getClass(), "next", null);
        setField(term3311, term3311.getClass(), "first", null);
        setField(term3311, term3311.getClass(), "last", null);
        setField(term3311, term3311.getClass(), "propListHead", null);
        setIntField(term3311, term3311.getClass(), "sourcePosition", 0);
        setField(term3311, term3311.getClass(), "jsType", null);
        setField(term3311, term3311.getClass(), "parent", null);
        setField(term3303, term3303.getClass(), "last", term3311);
        setField(term3314, term3314.getClass(), "next", null);
        setIntField(term3314, term3314.getClass(), "type", 0);
        setIntField(term3314, term3314.getClass(), "intValue", 0);
        setField(term3314, term3314.getClass(), "objectValue", null);
        setField(term3303, term3303.getClass(), "propListHead", term3314);
        setIntField(term3303, term3303.getClass(), "sourcePosition", 478422495);
        setField(term3303, term3303.getClass(), "jsType", null);
        setField(term3303, term3303.getClass(), "parent", null);
        setField(term3301, term3301.getClass(), "next", term3303);
        setIntField(term3318, term3318.getClass(), "type", 0);
        setField(term3318, term3318.getClass(), "next", null);
        setField(term3318, term3318.getClass(), "first", null);
        setField(term3318, term3318.getClass(), "last", null);
        setField(term3318, term3318.getClass(), "propListHead", null);
        setIntField(term3318, term3318.getClass(), "sourcePosition", 0);
        setField(term3318, term3318.getClass(), "jsType", null);
        setField(term3318, term3318.getClass(), "parent", null);
        setField(term3301, term3301.getClass(), "first", term3318);
        setIntField(term3321, term3321.getClass(), "type", 0);
        setField(term3321, term3321.getClass(), "next", null);
        setField(term3321, term3321.getClass(), "first", null);
        setField(term3321, term3321.getClass(), "last", null);
        setField(term3321, term3321.getClass(), "propListHead", null);
        setIntField(term3321, term3321.getClass(), "sourcePosition", 0);
        setField(term3321, term3321.getClass(), "jsType", null);
        setField(term3321, term3321.getClass(), "parent", null);
        setField(term3301, term3301.getClass(), "last", term3321);
        setField(term3324, term3324.getClass(), "next", null);
        setIntField(term3324, term3324.getClass(), "type", 0);
        setIntField(term3324, term3324.getClass(), "intValue", 0);
        setField(term3324, term3324.getClass(), "objectValue", null);
        setField(term3301, term3301.getClass(), "propListHead", term3324);
        setIntField(term3301, term3301.getClass(), "sourcePosition", 1727771237);
        setField(term3301, term3301.getClass(), "jsType", null);
        setField(term3301, term3301.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3301;
        try {
            callMethod(klass, "getCatchBlock", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


