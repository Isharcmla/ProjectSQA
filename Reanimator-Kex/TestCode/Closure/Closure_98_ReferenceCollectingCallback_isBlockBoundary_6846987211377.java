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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term431824;
     Object term431916;
     Object term432360;
     Object term432362;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term431824 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term431916 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term432008 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term431916, term431916.getClass(), "type", 108);
        setField(term431916, term431916.getClass(), "first", term432008);
        term432360 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term432361 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term432360, term432360.getClass(), "str", null);
        setIntField(term432360, term432360.getClass(), "type", 108);
        setField(term432360, term432360.getClass(), "next", null);
        setField(term432361, term432361.getClass(), "str", null);
        setIntField(term432361, term432361.getClass(), "type", 0);
        setField(term432361, term432361.getClass(), "next", null);
        setField(term432361, term432361.getClass(), "first", null);
        setField(term432361, term432361.getClass(), "last", null);
        setField(term432361, term432361.getClass(), "propListHead", null);
        setIntField(term432361, term432361.getClass(), "sourcePosition", 0);
        setField(term432361, term432361.getClass(), "jsType", null);
        setField(term432361, term432361.getClass(), "parent", null);
        setField(term432360, term432360.getClass(), "first", term432361);
        setField(term432360, term432360.getClass(), "last", null);
        setField(term432360, term432360.getClass(), "propListHead", null);
        setIntField(term432360, term432360.getClass(), "sourcePosition", 0);
        setField(term432360, term432360.getClass(), "jsType", null);
        setField(term432360, term432360.getClass(), "parent", null);
        term432362 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term432362, term432362.getClass(), "str", null);
        setIntField(term432362, term432362.getClass(), "type", 0);
        setField(term432362, term432362.getClass(), "next", null);
        setField(term432362, term432362.getClass(), "first", null);
        setField(term432362, term432362.getClass(), "last", null);
        setField(term432362, term432362.getClass(), "propListHead", null);
        setIntField(term432362, term432362.getClass(), "sourcePosition", 0);
        setField(term432362, term432362.getClass(), "jsType", null);
        setField(term432362, term432362.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term431824;
        args[1] = term431916;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term431824, term432360));
        assertTrue(recursiveEquals(term431916, term432362));
        assertTrue(recursiveEquals(retValue, true));
    }

};


