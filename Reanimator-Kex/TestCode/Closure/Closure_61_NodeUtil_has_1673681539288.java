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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_has_1673681539288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3157;

    public NodeUtil_has_1673681539288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3157, term3157.getClass(), "type", -963204620);
        setIntField(term3159, term3159.getClass(), "type", -1468541076);
        setIntField(term3161, term3161.getClass(), "type", 0);
        setField(term3161, term3161.getClass(), "next", null);
        setField(term3161, term3161.getClass(), "first", null);
        setField(term3161, term3161.getClass(), "last", null);
        setField(term3161, term3161.getClass(), "propListHead", null);
        setIntField(term3161, term3161.getClass(), "sourcePosition", 0);
        setField(term3161, term3161.getClass(), "jsType", null);
        setField(term3161, term3161.getClass(), "parent", null);
        setField(term3159, term3159.getClass(), "next", term3161);
        setIntField(term3164, term3164.getClass(), "type", 0);
        setField(term3164, term3164.getClass(), "next", null);
        setField(term3164, term3164.getClass(), "first", null);
        setField(term3164, term3164.getClass(), "last", null);
        setField(term3164, term3164.getClass(), "propListHead", null);
        setIntField(term3164, term3164.getClass(), "sourcePosition", 0);
        setField(term3164, term3164.getClass(), "jsType", null);
        setField(term3164, term3164.getClass(), "parent", null);
        setField(term3159, term3159.getClass(), "first", term3164);
        setIntField(term3167, term3167.getClass(), "type", 0);
        setField(term3167, term3167.getClass(), "next", null);
        setField(term3167, term3167.getClass(), "first", null);
        setField(term3167, term3167.getClass(), "last", null);
        setField(term3167, term3167.getClass(), "propListHead", null);
        setIntField(term3167, term3167.getClass(), "sourcePosition", 0);
        setField(term3167, term3167.getClass(), "jsType", null);
        setField(term3167, term3167.getClass(), "parent", null);
        setField(term3159, term3159.getClass(), "last", term3167);
        setField(term3159, term3159.getClass(), "propListHead", null);
        setIntField(term3159, term3159.getClass(), "sourcePosition", 0);
        setField(term3159, term3159.getClass(), "jsType", null);
        setField(term3159, term3159.getClass(), "parent", null);
        setField(term3157, term3157.getClass(), "next", term3159);
        setIntField(term3171, term3171.getClass(), "type", 0);
        setField(term3171, term3171.getClass(), "next", null);
        setField(term3171, term3171.getClass(), "first", null);
        setField(term3171, term3171.getClass(), "last", null);
        setField(term3171, term3171.getClass(), "propListHead", null);
        setIntField(term3171, term3171.getClass(), "sourcePosition", 0);
        setField(term3171, term3171.getClass(), "jsType", null);
        setField(term3171, term3171.getClass(), "parent", null);
        setField(term3157, term3157.getClass(), "first", term3171);
        setIntField(term3174, term3174.getClass(), "type", 0);
        setField(term3174, term3174.getClass(), "next", null);
        setField(term3174, term3174.getClass(), "first", null);
        setField(term3174, term3174.getClass(), "last", null);
        setField(term3174, term3174.getClass(), "propListHead", null);
        setIntField(term3174, term3174.getClass(), "sourcePosition", 0);
        setField(term3174, term3174.getClass(), "jsType", null);
        setField(term3174, term3174.getClass(), "parent", null);
        setField(term3157, term3157.getClass(), "last", term3174);
        setField(term3157, term3157.getClass(), "propListHead", null);
        setIntField(term3157, term3157.getClass(), "sourcePosition", 0);
        setField(term3157, term3157.getClass(), "jsType", null);
        setField(term3157, term3157.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.common.base.Predicate");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term3157;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "has", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


