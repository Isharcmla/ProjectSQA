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

public class FoldConstants_tryFoldBlock_1167048042176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36116;
     Object term36186;
     Object term46689;
     Object term46690;

    public FoldConstants_tryFoldBlock_1167048042176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36116 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term36186 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term36256, term36256.getClass(), "next", term36186);
        setIntField(term36256, term36256.getClass(), "type", 75);
        setField(term36186, term36186.getClass(), "first", term36256);
        setField(term36186, term36186.getClass(), "next", term36326);
        setIntField(term36186, term36186.getClass(), "type", 102);
        term46689 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term46689, term46689.getClass(), "compiler", null);
        term46690 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46692 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46690, term46690.getClass(), "type", 102);
        setIntField(term46691, term46691.getClass(), "type", 0);
        setField(term46691, term46691.getClass(), "next", null);
        setField(term46691, term46691.getClass(), "first", null);
        setField(term46691, term46691.getClass(), "last", null);
        setField(term46691, term46691.getClass(), "propListHead", null);
        setIntField(term46691, term46691.getClass(), "sourcePosition", 0);
        setField(term46691, term46691.getClass(), "jsType", null);
        setField(term46691, term46691.getClass(), "parent", null);
        setField(term46690, term46690.getClass(), "next", term46691);
        setIntField(term46692, term46692.getClass(), "type", 75);
        setField(term46692, term46692.getClass(), "next", term46690);
        setField(term46692, term46692.getClass(), "first", null);
        setField(term46692, term46692.getClass(), "last", null);
        setField(term46692, term46692.getClass(), "propListHead", null);
        setIntField(term46692, term46692.getClass(), "sourcePosition", 0);
        setField(term46692, term46692.getClass(), "jsType", null);
        setField(term46692, term46692.getClass(), "parent", null);
        setField(term46690, term46690.getClass(), "first", term46692);
        setField(term46690, term46690.getClass(), "last", null);
        setField(term46690, term46690.getClass(), "propListHead", null);
        setIntField(term46690, term46690.getClass(), "sourcePosition", 0);
        setField(term46690, term46690.getClass(), "jsType", null);
        setField(term46690, term46690.getClass(), "parent", null);
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
        args[1] = term36186;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term36116, args);
        assertTrue(recursiveEquals(term36116, term46689));
        assertTrue(recursiveEquals(term36186, null));
    }

};


