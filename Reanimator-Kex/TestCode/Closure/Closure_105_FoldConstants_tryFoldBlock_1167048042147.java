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

public class FoldConstants_tryFoldBlock_1167048042147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33207;
     Object term33277;
     Object term33408;
     Object term33409;

    public FoldConstants_tryFoldBlock_1167048042147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33207 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term33277 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term33277, term33277.getClass(), "first", term33277);
        setField(term33277, term33277.getClass(), "next", term33347);
        setIntField(term33277, term33277.getClass(), "type", 103);
        term33408 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term33408, term33408.getClass(), "compiler", null);
        term33409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33409, term33409.getClass(), "type", 103);
        setIntField(term33410, term33410.getClass(), "type", 0);
        setField(term33410, term33410.getClass(), "next", null);
        setField(term33410, term33410.getClass(), "first", null);
        setField(term33410, term33410.getClass(), "last", null);
        setField(term33410, term33410.getClass(), "propListHead", null);
        setIntField(term33410, term33410.getClass(), "sourcePosition", 0);
        setField(term33410, term33410.getClass(), "jsType", null);
        setField(term33410, term33410.getClass(), "parent", null);
        setField(term33409, term33409.getClass(), "next", term33410);
        setField(term33409, term33409.getClass(), "first", term33409);
        setField(term33409, term33409.getClass(), "last", null);
        setField(term33409, term33409.getClass(), "propListHead", null);
        setIntField(term33409, term33409.getClass(), "sourcePosition", 0);
        setField(term33409, term33409.getClass(), "jsType", null);
        setField(term33409, term33409.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term33277;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term33207, args);
        assertTrue(recursiveEquals(term33207, term33408));
        assertTrue(recursiveEquals(term33277, null));
    }

};


