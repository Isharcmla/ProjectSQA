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

public class NodeUtil_isSimpleOperator_1940912183168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term397;
     Object term7277;

    public NodeUtil_isSimpleOperator_1940912183168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term410 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term420 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term397, term397.getClass(), "type", 158873461);
        setIntField(term399, term399.getClass(), "type", -1388471422);
        setIntField(term401, term401.getClass(), "type", 0);
        setField(term401, term401.getClass(), "next", null);
        setField(term401, term401.getClass(), "first", null);
        setField(term401, term401.getClass(), "last", null);
        setField(term401, term401.getClass(), "propListHead", null);
        setIntField(term401, term401.getClass(), "sourcePosition", 0);
        setField(term401, term401.getClass(), "jsType", null);
        setField(term401, term401.getClass(), "parent", null);
        setField(term399, term399.getClass(), "next", term401);
        setIntField(term404, term404.getClass(), "type", 0);
        setField(term404, term404.getClass(), "next", null);
        setField(term404, term404.getClass(), "first", null);
        setField(term404, term404.getClass(), "last", null);
        setField(term404, term404.getClass(), "propListHead", null);
        setIntField(term404, term404.getClass(), "sourcePosition", 0);
        setField(term404, term404.getClass(), "jsType", null);
        setField(term404, term404.getClass(), "parent", null);
        setField(term399, term399.getClass(), "first", term404);
        setIntField(term407, term407.getClass(), "type", 0);
        setField(term407, term407.getClass(), "next", null);
        setField(term407, term407.getClass(), "first", null);
        setField(term407, term407.getClass(), "last", null);
        setField(term407, term407.getClass(), "propListHead", null);
        setIntField(term407, term407.getClass(), "sourcePosition", 0);
        setField(term407, term407.getClass(), "jsType", null);
        setField(term407, term407.getClass(), "parent", null);
        setField(term399, term399.getClass(), "last", term407);
        setField(term410, term410.getClass(), "next", null);
        setIntField(term410, term410.getClass(), "type", 0);
        setIntField(term410, term410.getClass(), "intValue", 0);
        setField(term410, term410.getClass(), "objectValue", null);
        setField(term399, term399.getClass(), "propListHead", term410);
        setIntField(term399, term399.getClass(), "sourcePosition", 1598895173);
        setField(term399, term399.getClass(), "jsType", null);
        setField(term399, term399.getClass(), "parent", null);
        setField(term397, term397.getClass(), "next", term399);
        setIntField(term414, term414.getClass(), "type", 0);
        setField(term414, term414.getClass(), "next", null);
        setField(term414, term414.getClass(), "first", null);
        setField(term414, term414.getClass(), "last", null);
        setField(term414, term414.getClass(), "propListHead", null);
        setIntField(term414, term414.getClass(), "sourcePosition", 0);
        setField(term414, term414.getClass(), "jsType", null);
        setField(term414, term414.getClass(), "parent", null);
        setField(term397, term397.getClass(), "first", term414);
        setIntField(term417, term417.getClass(), "type", 0);
        setField(term417, term417.getClass(), "next", null);
        setField(term417, term417.getClass(), "first", null);
        setField(term417, term417.getClass(), "last", null);
        setField(term417, term417.getClass(), "propListHead", null);
        setIntField(term417, term417.getClass(), "sourcePosition", 0);
        setField(term417, term417.getClass(), "jsType", null);
        setField(term417, term417.getClass(), "parent", null);
        setField(term397, term397.getClass(), "last", term417);
        setField(term420, term420.getClass(), "next", null);
        setIntField(term420, term420.getClass(), "type", 0);
        setIntField(term420, term420.getClass(), "intValue", 0);
        setField(term420, term420.getClass(), "objectValue", null);
        setField(term397, term397.getClass(), "propListHead", term420);
        setIntField(term397, term397.getClass(), "sourcePosition", 1830648570);
        setField(term397, term397.getClass(), "jsType", null);
        setField(term397, term397.getClass(), "parent", null);
        term7277 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7281 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7282 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7285 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term7277, term7277.getClass(), "type", 158873461);
        setIntField(term7278, term7278.getClass(), "type", -1388471422);
        setIntField(term7279, term7279.getClass(), "type", 0);
        setField(term7279, term7279.getClass(), "next", null);
        setField(term7279, term7279.getClass(), "first", null);
        setField(term7279, term7279.getClass(), "last", null);
        setField(term7279, term7279.getClass(), "propListHead", null);
        setIntField(term7279, term7279.getClass(), "sourcePosition", 0);
        setField(term7279, term7279.getClass(), "jsType", null);
        setField(term7279, term7279.getClass(), "parent", null);
        setField(term7278, term7278.getClass(), "next", term7279);
        setIntField(term7280, term7280.getClass(), "type", 0);
        setField(term7280, term7280.getClass(), "next", null);
        setField(term7280, term7280.getClass(), "first", null);
        setField(term7280, term7280.getClass(), "last", null);
        setField(term7280, term7280.getClass(), "propListHead", null);
        setIntField(term7280, term7280.getClass(), "sourcePosition", 0);
        setField(term7280, term7280.getClass(), "jsType", null);
        setField(term7280, term7280.getClass(), "parent", null);
        setField(term7278, term7278.getClass(), "first", term7280);
        setIntField(term7281, term7281.getClass(), "type", 0);
        setField(term7281, term7281.getClass(), "next", null);
        setField(term7281, term7281.getClass(), "first", null);
        setField(term7281, term7281.getClass(), "last", null);
        setField(term7281, term7281.getClass(), "propListHead", null);
        setIntField(term7281, term7281.getClass(), "sourcePosition", 0);
        setField(term7281, term7281.getClass(), "jsType", null);
        setField(term7281, term7281.getClass(), "parent", null);
        setField(term7278, term7278.getClass(), "last", term7281);
        setField(term7282, term7282.getClass(), "next", null);
        setIntField(term7282, term7282.getClass(), "type", 0);
        setIntField(term7282, term7282.getClass(), "intValue", 0);
        setField(term7282, term7282.getClass(), "objectValue", null);
        setField(term7278, term7278.getClass(), "propListHead", term7282);
        setIntField(term7278, term7278.getClass(), "sourcePosition", 1598895173);
        setField(term7278, term7278.getClass(), "jsType", null);
        setField(term7278, term7278.getClass(), "parent", null);
        setField(term7277, term7277.getClass(), "next", term7278);
        setIntField(term7283, term7283.getClass(), "type", 0);
        setField(term7283, term7283.getClass(), "next", null);
        setField(term7283, term7283.getClass(), "first", null);
        setField(term7283, term7283.getClass(), "last", null);
        setField(term7283, term7283.getClass(), "propListHead", null);
        setIntField(term7283, term7283.getClass(), "sourcePosition", 0);
        setField(term7283, term7283.getClass(), "jsType", null);
        setField(term7283, term7283.getClass(), "parent", null);
        setField(term7277, term7277.getClass(), "first", term7283);
        setIntField(term7284, term7284.getClass(), "type", 0);
        setField(term7284, term7284.getClass(), "next", null);
        setField(term7284, term7284.getClass(), "first", null);
        setField(term7284, term7284.getClass(), "last", null);
        setField(term7284, term7284.getClass(), "propListHead", null);
        setIntField(term7284, term7284.getClass(), "sourcePosition", 0);
        setField(term7284, term7284.getClass(), "jsType", null);
        setField(term7284, term7284.getClass(), "parent", null);
        setField(term7277, term7277.getClass(), "last", term7284);
        setField(term7285, term7285.getClass(), "next", null);
        setIntField(term7285, term7285.getClass(), "type", 0);
        setIntField(term7285, term7285.getClass(), "intValue", 0);
        setField(term7285, term7285.getClass(), "objectValue", null);
        setField(term7277, term7277.getClass(), "propListHead", term7285);
        setIntField(term7277, term7277.getClass(), "sourcePosition", 1830648570);
        setField(term7277, term7277.getClass(), "jsType", null);
        setField(term7277, term7277.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term397;
        callMethod(klass, "isSimpleOperator", argTypes, null, args);
        assertTrue(recursiveEquals(term397, term7277));
    }

};


