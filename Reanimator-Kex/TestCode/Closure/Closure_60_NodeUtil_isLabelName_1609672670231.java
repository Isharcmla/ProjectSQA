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

public class NodeUtil_isLabelName_1609672670231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1561;
     Object term13931;

    public NodeUtil_isLabelName_1609672670231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1561 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1565 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1561, term1561.getClass(), "type", -1630069454);
        setIntField(term1563, term1563.getClass(), "type", 1038029515);
        setIntField(term1565, term1565.getClass(), "type", 0);
        setField(term1565, term1565.getClass(), "next", null);
        setField(term1565, term1565.getClass(), "first", null);
        setField(term1565, term1565.getClass(), "last", null);
        setField(term1565, term1565.getClass(), "propListHead", null);
        setIntField(term1565, term1565.getClass(), "sourcePosition", 0);
        setField(term1565, term1565.getClass(), "jsType", null);
        setField(term1565, term1565.getClass(), "parent", null);
        setField(term1563, term1563.getClass(), "next", term1565);
        setIntField(term1568, term1568.getClass(), "type", 0);
        setField(term1568, term1568.getClass(), "next", null);
        setField(term1568, term1568.getClass(), "first", null);
        setField(term1568, term1568.getClass(), "last", null);
        setField(term1568, term1568.getClass(), "propListHead", null);
        setIntField(term1568, term1568.getClass(), "sourcePosition", 0);
        setField(term1568, term1568.getClass(), "jsType", null);
        setField(term1568, term1568.getClass(), "parent", null);
        setField(term1563, term1563.getClass(), "first", term1568);
        setIntField(term1571, term1571.getClass(), "type", 0);
        setField(term1571, term1571.getClass(), "next", null);
        setField(term1571, term1571.getClass(), "first", null);
        setField(term1571, term1571.getClass(), "last", null);
        setField(term1571, term1571.getClass(), "propListHead", null);
        setIntField(term1571, term1571.getClass(), "sourcePosition", 0);
        setField(term1571, term1571.getClass(), "jsType", null);
        setField(term1571, term1571.getClass(), "parent", null);
        setField(term1563, term1563.getClass(), "last", term1571);
        setField(term1563, term1563.getClass(), "propListHead", null);
        setIntField(term1563, term1563.getClass(), "sourcePosition", 0);
        setField(term1563, term1563.getClass(), "jsType", null);
        setField(term1563, term1563.getClass(), "parent", null);
        setField(term1561, term1561.getClass(), "next", term1563);
        setIntField(term1575, term1575.getClass(), "type", 0);
        setField(term1575, term1575.getClass(), "next", null);
        setField(term1575, term1575.getClass(), "first", null);
        setField(term1575, term1575.getClass(), "last", null);
        setField(term1575, term1575.getClass(), "propListHead", null);
        setIntField(term1575, term1575.getClass(), "sourcePosition", 0);
        setField(term1575, term1575.getClass(), "jsType", null);
        setField(term1575, term1575.getClass(), "parent", null);
        setField(term1561, term1561.getClass(), "first", term1575);
        setIntField(term1578, term1578.getClass(), "type", 0);
        setField(term1578, term1578.getClass(), "next", null);
        setField(term1578, term1578.getClass(), "first", null);
        setField(term1578, term1578.getClass(), "last", null);
        setField(term1578, term1578.getClass(), "propListHead", null);
        setIntField(term1578, term1578.getClass(), "sourcePosition", 0);
        setField(term1578, term1578.getClass(), "jsType", null);
        setField(term1578, term1578.getClass(), "parent", null);
        setField(term1561, term1561.getClass(), "last", term1578);
        setField(term1561, term1561.getClass(), "propListHead", null);
        setIntField(term1561, term1561.getClass(), "sourcePosition", 0);
        setField(term1561, term1561.getClass(), "jsType", null);
        setField(term1561, term1561.getClass(), "parent", null);
        term13931 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13933 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13935 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13936 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13931, term13931.getClass(), "type", -1630069454);
        setIntField(term13932, term13932.getClass(), "type", 1038029515);
        setIntField(term13933, term13933.getClass(), "type", 0);
        setField(term13933, term13933.getClass(), "next", null);
        setField(term13933, term13933.getClass(), "first", null);
        setField(term13933, term13933.getClass(), "last", null);
        setField(term13933, term13933.getClass(), "propListHead", null);
        setIntField(term13933, term13933.getClass(), "sourcePosition", 0);
        setField(term13933, term13933.getClass(), "jsType", null);
        setField(term13933, term13933.getClass(), "parent", null);
        setField(term13932, term13932.getClass(), "next", term13933);
        setIntField(term13934, term13934.getClass(), "type", 0);
        setField(term13934, term13934.getClass(), "next", null);
        setField(term13934, term13934.getClass(), "first", null);
        setField(term13934, term13934.getClass(), "last", null);
        setField(term13934, term13934.getClass(), "propListHead", null);
        setIntField(term13934, term13934.getClass(), "sourcePosition", 0);
        setField(term13934, term13934.getClass(), "jsType", null);
        setField(term13934, term13934.getClass(), "parent", null);
        setField(term13932, term13932.getClass(), "first", term13934);
        setIntField(term13935, term13935.getClass(), "type", 0);
        setField(term13935, term13935.getClass(), "next", null);
        setField(term13935, term13935.getClass(), "first", null);
        setField(term13935, term13935.getClass(), "last", null);
        setField(term13935, term13935.getClass(), "propListHead", null);
        setIntField(term13935, term13935.getClass(), "sourcePosition", 0);
        setField(term13935, term13935.getClass(), "jsType", null);
        setField(term13935, term13935.getClass(), "parent", null);
        setField(term13932, term13932.getClass(), "last", term13935);
        setField(term13932, term13932.getClass(), "propListHead", null);
        setIntField(term13932, term13932.getClass(), "sourcePosition", 0);
        setField(term13932, term13932.getClass(), "jsType", null);
        setField(term13932, term13932.getClass(), "parent", null);
        setField(term13931, term13931.getClass(), "next", term13932);
        setIntField(term13936, term13936.getClass(), "type", 0);
        setField(term13936, term13936.getClass(), "next", null);
        setField(term13936, term13936.getClass(), "first", null);
        setField(term13936, term13936.getClass(), "last", null);
        setField(term13936, term13936.getClass(), "propListHead", null);
        setIntField(term13936, term13936.getClass(), "sourcePosition", 0);
        setField(term13936, term13936.getClass(), "jsType", null);
        setField(term13936, term13936.getClass(), "parent", null);
        setField(term13931, term13931.getClass(), "first", term13936);
        setIntField(term13937, term13937.getClass(), "type", 0);
        setField(term13937, term13937.getClass(), "next", null);
        setField(term13937, term13937.getClass(), "first", null);
        setField(term13937, term13937.getClass(), "last", null);
        setField(term13937, term13937.getClass(), "propListHead", null);
        setIntField(term13937, term13937.getClass(), "sourcePosition", 0);
        setField(term13937, term13937.getClass(), "jsType", null);
        setField(term13937, term13937.getClass(), "parent", null);
        setField(term13931, term13931.getClass(), "last", term13937);
        setField(term13931, term13931.getClass(), "propListHead", null);
        setIntField(term13931, term13931.getClass(), "sourcePosition", 0);
        setField(term13931, term13931.getClass(), "jsType", null);
        setField(term13931, term13931.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1561;
        Object retValue = callMethod(klass, "isLabelName", argTypes, null, args);
        assertTrue(recursiveEquals(term1561, term13931));
        assertTrue(recursiveEquals(retValue, false));
    }

};


