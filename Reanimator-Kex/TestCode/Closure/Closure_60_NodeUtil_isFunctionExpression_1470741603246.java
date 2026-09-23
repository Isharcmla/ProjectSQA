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

public class NodeUtil_isFunctionExpression_1470741603246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1918;
     Object term14302;

    public NodeUtil_isFunctionExpression_1470741603246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1920 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1922 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1925 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1928 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1935 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1918, term1918.getClass(), "type", 1235045850);
        setIntField(term1920, term1920.getClass(), "type", 1795369860);
        setIntField(term1922, term1922.getClass(), "type", 0);
        setField(term1922, term1922.getClass(), "next", null);
        setField(term1922, term1922.getClass(), "first", null);
        setField(term1922, term1922.getClass(), "last", null);
        setField(term1922, term1922.getClass(), "propListHead", null);
        setIntField(term1922, term1922.getClass(), "sourcePosition", 0);
        setField(term1922, term1922.getClass(), "jsType", null);
        setField(term1922, term1922.getClass(), "parent", null);
        setField(term1920, term1920.getClass(), "next", term1922);
        setIntField(term1925, term1925.getClass(), "type", 0);
        setField(term1925, term1925.getClass(), "next", null);
        setField(term1925, term1925.getClass(), "first", null);
        setField(term1925, term1925.getClass(), "last", null);
        setField(term1925, term1925.getClass(), "propListHead", null);
        setIntField(term1925, term1925.getClass(), "sourcePosition", 0);
        setField(term1925, term1925.getClass(), "jsType", null);
        setField(term1925, term1925.getClass(), "parent", null);
        setField(term1920, term1920.getClass(), "first", term1925);
        setIntField(term1928, term1928.getClass(), "type", 0);
        setField(term1928, term1928.getClass(), "next", null);
        setField(term1928, term1928.getClass(), "first", null);
        setField(term1928, term1928.getClass(), "last", null);
        setField(term1928, term1928.getClass(), "propListHead", null);
        setIntField(term1928, term1928.getClass(), "sourcePosition", 0);
        setField(term1928, term1928.getClass(), "jsType", null);
        setField(term1928, term1928.getClass(), "parent", null);
        setField(term1920, term1920.getClass(), "last", term1928);
        setField(term1920, term1920.getClass(), "propListHead", null);
        setIntField(term1920, term1920.getClass(), "sourcePosition", 0);
        setField(term1920, term1920.getClass(), "jsType", null);
        setField(term1920, term1920.getClass(), "parent", null);
        setField(term1918, term1918.getClass(), "next", term1920);
        setIntField(term1932, term1932.getClass(), "type", 0);
        setField(term1932, term1932.getClass(), "next", null);
        setField(term1932, term1932.getClass(), "first", null);
        setField(term1932, term1932.getClass(), "last", null);
        setField(term1932, term1932.getClass(), "propListHead", null);
        setIntField(term1932, term1932.getClass(), "sourcePosition", 0);
        setField(term1932, term1932.getClass(), "jsType", null);
        setField(term1932, term1932.getClass(), "parent", null);
        setField(term1918, term1918.getClass(), "first", term1932);
        setIntField(term1935, term1935.getClass(), "type", 0);
        setField(term1935, term1935.getClass(), "next", null);
        setField(term1935, term1935.getClass(), "first", null);
        setField(term1935, term1935.getClass(), "last", null);
        setField(term1935, term1935.getClass(), "propListHead", null);
        setIntField(term1935, term1935.getClass(), "sourcePosition", 0);
        setField(term1935, term1935.getClass(), "jsType", null);
        setField(term1935, term1935.getClass(), "parent", null);
        setField(term1918, term1918.getClass(), "last", term1935);
        setField(term1918, term1918.getClass(), "propListHead", null);
        setIntField(term1918, term1918.getClass(), "sourcePosition", 0);
        setField(term1918, term1918.getClass(), "jsType", null);
        setField(term1918, term1918.getClass(), "parent", null);
        term14302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14304 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14302, term14302.getClass(), "type", 1235045850);
        setIntField(term14303, term14303.getClass(), "type", 1795369860);
        setIntField(term14304, term14304.getClass(), "type", 0);
        setField(term14304, term14304.getClass(), "next", null);
        setField(term14304, term14304.getClass(), "first", null);
        setField(term14304, term14304.getClass(), "last", null);
        setField(term14304, term14304.getClass(), "propListHead", null);
        setIntField(term14304, term14304.getClass(), "sourcePosition", 0);
        setField(term14304, term14304.getClass(), "jsType", null);
        setField(term14304, term14304.getClass(), "parent", null);
        setField(term14303, term14303.getClass(), "next", term14304);
        setIntField(term14305, term14305.getClass(), "type", 0);
        setField(term14305, term14305.getClass(), "next", null);
        setField(term14305, term14305.getClass(), "first", null);
        setField(term14305, term14305.getClass(), "last", null);
        setField(term14305, term14305.getClass(), "propListHead", null);
        setIntField(term14305, term14305.getClass(), "sourcePosition", 0);
        setField(term14305, term14305.getClass(), "jsType", null);
        setField(term14305, term14305.getClass(), "parent", null);
        setField(term14303, term14303.getClass(), "first", term14305);
        setIntField(term14306, term14306.getClass(), "type", 0);
        setField(term14306, term14306.getClass(), "next", null);
        setField(term14306, term14306.getClass(), "first", null);
        setField(term14306, term14306.getClass(), "last", null);
        setField(term14306, term14306.getClass(), "propListHead", null);
        setIntField(term14306, term14306.getClass(), "sourcePosition", 0);
        setField(term14306, term14306.getClass(), "jsType", null);
        setField(term14306, term14306.getClass(), "parent", null);
        setField(term14303, term14303.getClass(), "last", term14306);
        setField(term14303, term14303.getClass(), "propListHead", null);
        setIntField(term14303, term14303.getClass(), "sourcePosition", 0);
        setField(term14303, term14303.getClass(), "jsType", null);
        setField(term14303, term14303.getClass(), "parent", null);
        setField(term14302, term14302.getClass(), "next", term14303);
        setIntField(term14307, term14307.getClass(), "type", 0);
        setField(term14307, term14307.getClass(), "next", null);
        setField(term14307, term14307.getClass(), "first", null);
        setField(term14307, term14307.getClass(), "last", null);
        setField(term14307, term14307.getClass(), "propListHead", null);
        setIntField(term14307, term14307.getClass(), "sourcePosition", 0);
        setField(term14307, term14307.getClass(), "jsType", null);
        setField(term14307, term14307.getClass(), "parent", null);
        setField(term14302, term14302.getClass(), "first", term14307);
        setIntField(term14308, term14308.getClass(), "type", 0);
        setField(term14308, term14308.getClass(), "next", null);
        setField(term14308, term14308.getClass(), "first", null);
        setField(term14308, term14308.getClass(), "last", null);
        setField(term14308, term14308.getClass(), "propListHead", null);
        setIntField(term14308, term14308.getClass(), "sourcePosition", 0);
        setField(term14308, term14308.getClass(), "jsType", null);
        setField(term14308, term14308.getClass(), "parent", null);
        setField(term14302, term14302.getClass(), "last", term14308);
        setField(term14302, term14302.getClass(), "propListHead", null);
        setIntField(term14302, term14302.getClass(), "sourcePosition", 0);
        setField(term14302, term14302.getClass(), "jsType", null);
        setField(term14302, term14302.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1918;
        Object retValue = callMethod(klass, "isFunctionExpression", argTypes, null, args);
        assertTrue(recursiveEquals(term1918, term14302));
        assertTrue(recursiveEquals(retValue, false));
    }

};


