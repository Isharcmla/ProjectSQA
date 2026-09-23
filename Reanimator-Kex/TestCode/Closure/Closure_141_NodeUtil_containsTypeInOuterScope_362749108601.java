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

public class NodeUtil_containsTypeInOuterScope_362749108601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52582;
     Object term52848;

    public NodeUtil_containsTypeInOuterScope_362749108601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52582 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52652 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term52582, term52582.getClass(), "type", 32768);
        setIntField(term52652, term52652.getClass(), "type", 32768);
        setField(term52652, term52652.getClass(), "first", null);
        setField(term52652, term52652.getClass(), "next", term52722);
        setField(term52582, term52582.getClass(), "first", term52652);
        term52848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52849 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52850 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term52848, term52848.getClass(), "type", 32768);
        setField(term52848, term52848.getClass(), "next", null);
        setIntField(term52849, term52849.getClass(), "type", 32768);
        setIntField(term52850, term52850.getClass(), "type", 0);
        setField(term52850, term52850.getClass(), "next", null);
        setField(term52850, term52850.getClass(), "first", null);
        setField(term52850, term52850.getClass(), "last", null);
        setField(term52850, term52850.getClass(), "propListHead", null);
        setIntField(term52850, term52850.getClass(), "sourcePosition", 0);
        setField(term52850, term52850.getClass(), "jsType", null);
        setField(term52850, term52850.getClass(), "parent", null);
        setField(term52849, term52849.getClass(), "next", term52850);
        setField(term52849, term52849.getClass(), "first", null);
        setField(term52849, term52849.getClass(), "last", null);
        setField(term52849, term52849.getClass(), "propListHead", null);
        setIntField(term52849, term52849.getClass(), "sourcePosition", 0);
        setField(term52849, term52849.getClass(), "jsType", null);
        setField(term52849, term52849.getClass(), "parent", null);
        setField(term52848, term52848.getClass(), "first", term52849);
        setField(term52848, term52848.getClass(), "last", null);
        setField(term52848, term52848.getClass(), "propListHead", null);
        setIntField(term52848, term52848.getClass(), "sourcePosition", 0);
        setField(term52848, term52848.getClass(), "jsType", null);
        setField(term52848, term52848.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term52582;
        args[1] = -32769;
        callMethod(klass, "containsTypeInOuterScope", argTypes, null, args);
        assertTrue(recursiveEquals(term52582, -32769));
    }

};


