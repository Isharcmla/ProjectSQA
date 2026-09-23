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

public class NodeUtil_containsType_1974866574317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24869;
     Object term25117;

    public NodeUtil_containsType_1974866574317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24939 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24869, term24869.getClass(), "type", 524288);
        setIntField(term24939, term24939.getClass(), "type", 0);
        setField(term24939, term24939.getClass(), "first", null);
        setField(term24939, term24939.getClass(), "next", term25009);
        setField(term24869, term24869.getClass(), "first", term24939);
        term25117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25118 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25117, term25117.getClass(), "type", 524288);
        setField(term25117, term25117.getClass(), "next", null);
        setIntField(term25118, term25118.getClass(), "type", 0);
        setIntField(term25119, term25119.getClass(), "type", 0);
        setField(term25119, term25119.getClass(), "next", null);
        setField(term25119, term25119.getClass(), "first", null);
        setField(term25119, term25119.getClass(), "last", null);
        setField(term25119, term25119.getClass(), "propListHead", null);
        setIntField(term25119, term25119.getClass(), "sourcePosition", 0);
        setField(term25119, term25119.getClass(), "jsType", null);
        setField(term25119, term25119.getClass(), "parent", null);
        setField(term25118, term25118.getClass(), "next", term25119);
        setField(term25118, term25118.getClass(), "first", null);
        setField(term25118, term25118.getClass(), "last", null);
        setField(term25118, term25118.getClass(), "propListHead", null);
        setIntField(term25118, term25118.getClass(), "sourcePosition", 0);
        setField(term25118, term25118.getClass(), "jsType", null);
        setField(term25118, term25118.getClass(), "parent", null);
        setField(term25117, term25117.getClass(), "first", term25118);
        setField(term25117, term25117.getClass(), "last", null);
        setField(term25117, term25117.getClass(), "propListHead", null);
        setIntField(term25117, term25117.getClass(), "sourcePosition", 0);
        setField(term25117, term25117.getClass(), "jsType", null);
        setField(term25117, term25117.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term24869;
        args[1] = 512;
        callMethod(klass, "containsType", argTypes, null, args);
        assertTrue(recursiveEquals(term24869, 512));
    }

};


