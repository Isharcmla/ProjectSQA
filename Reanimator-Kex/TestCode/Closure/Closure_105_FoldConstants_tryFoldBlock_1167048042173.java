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

public class FoldConstants_tryFoldBlock_1167048042173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35118;
     Object term35188;
     Object term46386;
     Object term46387;

    public FoldConstants_tryFoldBlock_1167048042173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35118 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term35188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35258 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term35258, term35258.getClass(), "next", term35188);
        setIntField(term35258, term35258.getClass(), "type", 82);
        setField(term35188, term35188.getClass(), "first", term35258);
        setField(term35188, term35188.getClass(), "next", term35328);
        setIntField(term35188, term35188.getClass(), "type", 114);
        term46386 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term46386, term46386.getClass(), "compiler", null);
        term46387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46387, term46387.getClass(), "type", 114);
        setIntField(term46388, term46388.getClass(), "type", 0);
        setField(term46388, term46388.getClass(), "next", null);
        setField(term46388, term46388.getClass(), "first", null);
        setField(term46388, term46388.getClass(), "last", null);
        setField(term46388, term46388.getClass(), "propListHead", null);
        setIntField(term46388, term46388.getClass(), "sourcePosition", 0);
        setField(term46388, term46388.getClass(), "jsType", null);
        setField(term46388, term46388.getClass(), "parent", null);
        setField(term46387, term46387.getClass(), "next", term46388);
        setIntField(term46389, term46389.getClass(), "type", 82);
        setField(term46389, term46389.getClass(), "next", term46387);
        setField(term46389, term46389.getClass(), "first", null);
        setField(term46389, term46389.getClass(), "last", null);
        setField(term46389, term46389.getClass(), "propListHead", null);
        setIntField(term46389, term46389.getClass(), "sourcePosition", 0);
        setField(term46389, term46389.getClass(), "jsType", null);
        setField(term46389, term46389.getClass(), "parent", null);
        setField(term46387, term46387.getClass(), "first", term46389);
        setField(term46387, term46387.getClass(), "last", null);
        setField(term46387, term46387.getClass(), "propListHead", null);
        setIntField(term46387, term46387.getClass(), "sourcePosition", 0);
        setField(term46387, term46387.getClass(), "jsType", null);
        setField(term46387, term46387.getClass(), "parent", null);
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
        args[1] = term35188;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term35118, args);
        assertTrue(recursiveEquals(term35118, term46386));
        assertTrue(recursiveEquals(term35188, null));
    }

};


