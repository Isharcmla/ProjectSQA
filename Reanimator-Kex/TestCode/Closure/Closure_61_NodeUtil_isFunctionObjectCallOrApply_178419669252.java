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

public class NodeUtil_isFunctionObjectCallOrApply_178419669252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2066;
     Object term14916;

    public NodeUtil_isFunctionObjectCallOrApply_178419669252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2066 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2068 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2070 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2073 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2080 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2083 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2066, term2066.getClass(), "type", -383508597);
        setIntField(term2068, term2068.getClass(), "type", 1985432430);
        setIntField(term2070, term2070.getClass(), "type", 0);
        setField(term2070, term2070.getClass(), "next", null);
        setField(term2070, term2070.getClass(), "first", null);
        setField(term2070, term2070.getClass(), "last", null);
        setField(term2070, term2070.getClass(), "propListHead", null);
        setIntField(term2070, term2070.getClass(), "sourcePosition", 0);
        setField(term2070, term2070.getClass(), "jsType", null);
        setField(term2070, term2070.getClass(), "parent", null);
        setField(term2068, term2068.getClass(), "next", term2070);
        setIntField(term2073, term2073.getClass(), "type", 0);
        setField(term2073, term2073.getClass(), "next", null);
        setField(term2073, term2073.getClass(), "first", null);
        setField(term2073, term2073.getClass(), "last", null);
        setField(term2073, term2073.getClass(), "propListHead", null);
        setIntField(term2073, term2073.getClass(), "sourcePosition", 0);
        setField(term2073, term2073.getClass(), "jsType", null);
        setField(term2073, term2073.getClass(), "parent", null);
        setField(term2068, term2068.getClass(), "first", term2073);
        setIntField(term2076, term2076.getClass(), "type", 0);
        setField(term2076, term2076.getClass(), "next", null);
        setField(term2076, term2076.getClass(), "first", null);
        setField(term2076, term2076.getClass(), "last", null);
        setField(term2076, term2076.getClass(), "propListHead", null);
        setIntField(term2076, term2076.getClass(), "sourcePosition", 0);
        setField(term2076, term2076.getClass(), "jsType", null);
        setField(term2076, term2076.getClass(), "parent", null);
        setField(term2068, term2068.getClass(), "last", term2076);
        setField(term2068, term2068.getClass(), "propListHead", null);
        setIntField(term2068, term2068.getClass(), "sourcePosition", 0);
        setField(term2068, term2068.getClass(), "jsType", null);
        setField(term2068, term2068.getClass(), "parent", null);
        setField(term2066, term2066.getClass(), "next", term2068);
        setIntField(term2080, term2080.getClass(), "type", 0);
        setField(term2080, term2080.getClass(), "next", null);
        setField(term2080, term2080.getClass(), "first", null);
        setField(term2080, term2080.getClass(), "last", null);
        setField(term2080, term2080.getClass(), "propListHead", null);
        setIntField(term2080, term2080.getClass(), "sourcePosition", 0);
        setField(term2080, term2080.getClass(), "jsType", null);
        setField(term2080, term2080.getClass(), "parent", null);
        setField(term2066, term2066.getClass(), "first", term2080);
        setIntField(term2083, term2083.getClass(), "type", 0);
        setField(term2083, term2083.getClass(), "next", null);
        setField(term2083, term2083.getClass(), "first", null);
        setField(term2083, term2083.getClass(), "last", null);
        setField(term2083, term2083.getClass(), "propListHead", null);
        setIntField(term2083, term2083.getClass(), "sourcePosition", 0);
        setField(term2083, term2083.getClass(), "jsType", null);
        setField(term2083, term2083.getClass(), "parent", null);
        setField(term2066, term2066.getClass(), "last", term2083);
        setField(term2066, term2066.getClass(), "propListHead", null);
        setIntField(term2066, term2066.getClass(), "sourcePosition", 0);
        setField(term2066, term2066.getClass(), "jsType", null);
        setField(term2066, term2066.getClass(), "parent", null);
        term14916 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14920 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14922 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14916, term14916.getClass(), "type", -383508597);
        setIntField(term14917, term14917.getClass(), "type", 1985432430);
        setIntField(term14918, term14918.getClass(), "type", 0);
        setField(term14918, term14918.getClass(), "next", null);
        setField(term14918, term14918.getClass(), "first", null);
        setField(term14918, term14918.getClass(), "last", null);
        setField(term14918, term14918.getClass(), "propListHead", null);
        setIntField(term14918, term14918.getClass(), "sourcePosition", 0);
        setField(term14918, term14918.getClass(), "jsType", null);
        setField(term14918, term14918.getClass(), "parent", null);
        setField(term14917, term14917.getClass(), "next", term14918);
        setIntField(term14919, term14919.getClass(), "type", 0);
        setField(term14919, term14919.getClass(), "next", null);
        setField(term14919, term14919.getClass(), "first", null);
        setField(term14919, term14919.getClass(), "last", null);
        setField(term14919, term14919.getClass(), "propListHead", null);
        setIntField(term14919, term14919.getClass(), "sourcePosition", 0);
        setField(term14919, term14919.getClass(), "jsType", null);
        setField(term14919, term14919.getClass(), "parent", null);
        setField(term14917, term14917.getClass(), "first", term14919);
        setIntField(term14920, term14920.getClass(), "type", 0);
        setField(term14920, term14920.getClass(), "next", null);
        setField(term14920, term14920.getClass(), "first", null);
        setField(term14920, term14920.getClass(), "last", null);
        setField(term14920, term14920.getClass(), "propListHead", null);
        setIntField(term14920, term14920.getClass(), "sourcePosition", 0);
        setField(term14920, term14920.getClass(), "jsType", null);
        setField(term14920, term14920.getClass(), "parent", null);
        setField(term14917, term14917.getClass(), "last", term14920);
        setField(term14917, term14917.getClass(), "propListHead", null);
        setIntField(term14917, term14917.getClass(), "sourcePosition", 0);
        setField(term14917, term14917.getClass(), "jsType", null);
        setField(term14917, term14917.getClass(), "parent", null);
        setField(term14916, term14916.getClass(), "next", term14917);
        setIntField(term14921, term14921.getClass(), "type", 0);
        setField(term14921, term14921.getClass(), "next", null);
        setField(term14921, term14921.getClass(), "first", null);
        setField(term14921, term14921.getClass(), "last", null);
        setField(term14921, term14921.getClass(), "propListHead", null);
        setIntField(term14921, term14921.getClass(), "sourcePosition", 0);
        setField(term14921, term14921.getClass(), "jsType", null);
        setField(term14921, term14921.getClass(), "parent", null);
        setField(term14916, term14916.getClass(), "first", term14921);
        setIntField(term14922, term14922.getClass(), "type", 0);
        setField(term14922, term14922.getClass(), "next", null);
        setField(term14922, term14922.getClass(), "first", null);
        setField(term14922, term14922.getClass(), "last", null);
        setField(term14922, term14922.getClass(), "propListHead", null);
        setIntField(term14922, term14922.getClass(), "sourcePosition", 0);
        setField(term14922, term14922.getClass(), "jsType", null);
        setField(term14922, term14922.getClass(), "parent", null);
        setField(term14916, term14916.getClass(), "last", term14922);
        setField(term14916, term14916.getClass(), "propListHead", null);
        setIntField(term14916, term14916.getClass(), "sourcePosition", 0);
        setField(term14916, term14916.getClass(), "jsType", null);
        setField(term14916, term14916.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2066;
        Object retValue = callMethod(klass, "isFunctionObjectCallOrApply", argTypes, null, args);
        assertTrue(recursiveEquals(term2066, term14916));
        assertTrue(recursiveEquals(retValue, false));
    }

};


