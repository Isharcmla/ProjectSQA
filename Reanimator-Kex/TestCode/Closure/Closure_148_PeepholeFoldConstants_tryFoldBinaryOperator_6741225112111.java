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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term573219;
     Object term573311;
     Object term573943;
     Object term573944;
     Object term573914;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term573219 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term573311 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term573403 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term573495 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term573403, term573403.getClass(), "next", term573495);
        setIntField(term573403, term573403.getClass(), "type", 39);
        setField(term573311, term573311.getClass(), "first", term573403);
        setIntField(term573311, term573311.getClass(), "type", 20);
        term573943 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term573943, term573943.getClass(), "currentTraversal", null);
        term573944 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term573945 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term573946 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term573944, term573944.getClass(), "str", null);
        setIntField(term573944, term573944.getClass(), "type", 20);
        setField(term573944, term573944.getClass(), "next", null);
        setField(term573945, term573945.getClass(), "str", null);
        setIntField(term573945, term573945.getClass(), "type", 39);
        setField(term573946, term573946.getClass(), "str", null);
        setIntField(term573946, term573946.getClass(), "type", 0);
        setField(term573946, term573946.getClass(), "next", null);
        setField(term573946, term573946.getClass(), "first", null);
        setField(term573946, term573946.getClass(), "last", null);
        setField(term573946, term573946.getClass(), "propListHead", null);
        setIntField(term573946, term573946.getClass(), "sourcePosition", 0);
        setField(term573946, term573946.getClass(), "jsType", null);
        setField(term573946, term573946.getClass(), "parent", null);
        setField(term573945, term573945.getClass(), "next", term573946);
        setField(term573945, term573945.getClass(), "first", null);
        setField(term573945, term573945.getClass(), "last", null);
        setField(term573945, term573945.getClass(), "propListHead", null);
        setIntField(term573945, term573945.getClass(), "sourcePosition", 0);
        setField(term573945, term573945.getClass(), "jsType", null);
        setField(term573945, term573945.getClass(), "parent", null);
        setField(term573944, term573944.getClass(), "first", term573945);
        setField(term573944, term573944.getClass(), "last", null);
        setField(term573944, term573944.getClass(), "propListHead", null);
        setIntField(term573944, term573944.getClass(), "sourcePosition", 0);
        setField(term573944, term573944.getClass(), "jsType", null);
        setField(term573944, term573944.getClass(), "parent", null);
        term573914 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term573916 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term573918 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term573914, term573914.getClass(), "str", null);
        setIntField(term573914, term573914.getClass(), "type", 20);
        setField(term573914, term573914.getClass(), "next", null);
        setField(term573916, term573916.getClass(), "str", null);
        setIntField(term573916, term573916.getClass(), "type", 39);
        setField(term573918, term573918.getClass(), "str", null);
        setIntField(term573918, term573918.getClass(), "type", 0);
        setField(term573918, term573918.getClass(), "next", null);
        setField(term573918, term573918.getClass(), "first", null);
        setField(term573918, term573918.getClass(), "last", null);
        setField(term573918, term573918.getClass(), "propListHead", null);
        setIntField(term573918, term573918.getClass(), "sourcePosition", 0);
        setField(term573918, term573918.getClass(), "jsType", null);
        setField(term573918, term573918.getClass(), "parent", null);
        setField(term573916, term573916.getClass(), "next", term573918);
        setField(term573916, term573916.getClass(), "first", null);
        setField(term573916, term573916.getClass(), "last", null);
        setField(term573916, term573916.getClass(), "propListHead", null);
        setIntField(term573916, term573916.getClass(), "sourcePosition", 0);
        setField(term573916, term573916.getClass(), "jsType", null);
        setField(term573916, term573916.getClass(), "parent", null);
        setField(term573914, term573914.getClass(), "first", term573916);
        setField(term573914, term573914.getClass(), "last", null);
        setField(term573914, term573914.getClass(), "propListHead", null);
        setIntField(term573914, term573914.getClass(), "sourcePosition", 0);
        setField(term573914, term573914.getClass(), "jsType", null);
        setField(term573914, term573914.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term573311;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term573219, args);
        assertTrue(recursiveEquals(term573219, term573943));
        assertTrue(recursiveEquals(term573311, term573944));
        assertTrue(recursiveEquals(retValue, term573914));
    }

};


