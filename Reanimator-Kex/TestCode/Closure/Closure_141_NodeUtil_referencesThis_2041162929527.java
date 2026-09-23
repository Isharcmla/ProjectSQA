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

public class NodeUtil_referencesThis_2041162929527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44070;
     Object term44438;

    public NodeUtil_referencesThis_2041162929527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44070 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44070, term44070.getClass(), "type", 2);
        setIntField(term44140, term44140.getClass(), "type", 0);
        setField(term44140, term44140.getClass(), "first", term44210);
        setField(term44070, term44070.getClass(), "first", term44140);
        term44438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44438, term44438.getClass(), "type", 2);
        setField(term44438, term44438.getClass(), "next", null);
        setIntField(term44439, term44439.getClass(), "type", 0);
        setField(term44439, term44439.getClass(), "next", null);
        setIntField(term44440, term44440.getClass(), "type", 0);
        setField(term44440, term44440.getClass(), "next", null);
        setField(term44440, term44440.getClass(), "first", null);
        setField(term44440, term44440.getClass(), "last", null);
        setField(term44440, term44440.getClass(), "propListHead", null);
        setIntField(term44440, term44440.getClass(), "sourcePosition", 0);
        setField(term44440, term44440.getClass(), "jsType", null);
        setField(term44440, term44440.getClass(), "parent", null);
        setField(term44439, term44439.getClass(), "first", term44440);
        setField(term44439, term44439.getClass(), "last", null);
        setField(term44439, term44439.getClass(), "propListHead", null);
        setIntField(term44439, term44439.getClass(), "sourcePosition", 0);
        setField(term44439, term44439.getClass(), "jsType", null);
        setField(term44439, term44439.getClass(), "parent", null);
        setField(term44438, term44438.getClass(), "first", term44439);
        setField(term44438, term44438.getClass(), "last", null);
        setField(term44438, term44438.getClass(), "propListHead", null);
        setIntField(term44438, term44438.getClass(), "sourcePosition", 0);
        setField(term44438, term44438.getClass(), "jsType", null);
        setField(term44438, term44438.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term44070;
        callMethod(klass, "referencesThis", argTypes, null, args);
        assertTrue(recursiveEquals(term44070, term44438));
    }

};


