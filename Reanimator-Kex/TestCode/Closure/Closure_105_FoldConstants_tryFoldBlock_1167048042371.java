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

public class FoldConstants_tryFoldBlock_1167048042371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104935;
     Object term105005;
     Object term105421;
     Object term105422;

    public FoldConstants_tryFoldBlock_1167048042371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104935 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term105005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term105075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term105145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term105215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term105285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term105215, term105215.getClass(), "next", term105285);
        setIntField(term105215, term105215.getClass(), "type", 99);
        setField(term105145, term105145.getClass(), "next", term105215);
        setIntField(term105145, term105145.getClass(), "type", 114);
        setField(term105075, term105075.getClass(), "next", term105145);
        setIntField(term105075, term105075.getClass(), "type", 82);
        setField(term105005, term105005.getClass(), "first", term105075);
        term105421 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term105421, term105421.getClass(), "compiler", null);
        term105422 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term105423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term105424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term105425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term105426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term105422, term105422.getClass(), "type", 0);
        setField(term105422, term105422.getClass(), "next", null);
        setIntField(term105423, term105423.getClass(), "type", 82);
        setIntField(term105424, term105424.getClass(), "type", 114);
        setIntField(term105425, term105425.getClass(), "type", 99);
        setIntField(term105426, term105426.getClass(), "type", 0);
        setField(term105426, term105426.getClass(), "next", null);
        setField(term105426, term105426.getClass(), "first", null);
        setField(term105426, term105426.getClass(), "last", null);
        setField(term105426, term105426.getClass(), "propListHead", null);
        setIntField(term105426, term105426.getClass(), "sourcePosition", 0);
        setField(term105426, term105426.getClass(), "jsType", null);
        setField(term105426, term105426.getClass(), "parent", null);
        setField(term105425, term105425.getClass(), "next", term105426);
        setField(term105425, term105425.getClass(), "first", null);
        setField(term105425, term105425.getClass(), "last", null);
        setField(term105425, term105425.getClass(), "propListHead", null);
        setIntField(term105425, term105425.getClass(), "sourcePosition", 0);
        setField(term105425, term105425.getClass(), "jsType", null);
        setField(term105425, term105425.getClass(), "parent", null);
        setField(term105424, term105424.getClass(), "next", term105425);
        setField(term105424, term105424.getClass(), "first", null);
        setField(term105424, term105424.getClass(), "last", null);
        setField(term105424, term105424.getClass(), "propListHead", null);
        setIntField(term105424, term105424.getClass(), "sourcePosition", 0);
        setField(term105424, term105424.getClass(), "jsType", null);
        setField(term105424, term105424.getClass(), "parent", null);
        setField(term105423, term105423.getClass(), "next", term105424);
        setField(term105423, term105423.getClass(), "first", null);
        setField(term105423, term105423.getClass(), "last", null);
        setField(term105423, term105423.getClass(), "propListHead", null);
        setIntField(term105423, term105423.getClass(), "sourcePosition", 0);
        setField(term105423, term105423.getClass(), "jsType", null);
        setField(term105423, term105423.getClass(), "parent", null);
        setField(term105422, term105422.getClass(), "first", term105423);
        setField(term105422, term105422.getClass(), "last", null);
        setField(term105422, term105422.getClass(), "propListHead", null);
        setIntField(term105422, term105422.getClass(), "sourcePosition", 0);
        setField(term105422, term105422.getClass(), "jsType", null);
        setField(term105422, term105422.getClass(), "parent", null);
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
        args[1] = term105005;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term104935, args);
        assertTrue(recursiveEquals(term104935, term105421));
        assertTrue(recursiveEquals(term105005, null));
    }

};


