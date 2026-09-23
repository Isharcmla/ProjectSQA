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

public class FoldConstants_tryFoldBlock_1167048042289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77541;
     Object term77611;
     Object term78404;
     Object term78405;

    public FoldConstants_tryFoldBlock_1167048042289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77541 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term77611 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77681 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77751 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77821 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77891 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term77821, term77821.getClass(), "next", term77891);
        setIntField(term77821, term77821.getClass(), "type", 109);
        setField(term77751, term77751.getClass(), "next", term77821);
        setIntField(term77751, term77751.getClass(), "type", 54);
        setField(term77681, term77681.getClass(), "next", term77751);
        setIntField(term77681, term77681.getClass(), "type", 60);
        setField(term77611, term77611.getClass(), "first", term77681);
        term78404 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term78404, term78404.getClass(), "compiler", null);
        term78405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term78405, term78405.getClass(), "type", 0);
        setField(term78405, term78405.getClass(), "next", null);
        setIntField(term78406, term78406.getClass(), "type", 60);
        setIntField(term78407, term78407.getClass(), "type", 54);
        setIntField(term78408, term78408.getClass(), "type", 109);
        setIntField(term78409, term78409.getClass(), "type", 0);
        setField(term78409, term78409.getClass(), "next", null);
        setField(term78409, term78409.getClass(), "first", null);
        setField(term78409, term78409.getClass(), "last", null);
        setField(term78409, term78409.getClass(), "propListHead", null);
        setIntField(term78409, term78409.getClass(), "sourcePosition", 0);
        setField(term78409, term78409.getClass(), "jsType", null);
        setField(term78409, term78409.getClass(), "parent", null);
        setField(term78408, term78408.getClass(), "next", term78409);
        setField(term78408, term78408.getClass(), "first", null);
        setField(term78408, term78408.getClass(), "last", null);
        setField(term78408, term78408.getClass(), "propListHead", null);
        setIntField(term78408, term78408.getClass(), "sourcePosition", 0);
        setField(term78408, term78408.getClass(), "jsType", null);
        setField(term78408, term78408.getClass(), "parent", null);
        setField(term78407, term78407.getClass(), "next", term78408);
        setField(term78407, term78407.getClass(), "first", null);
        setField(term78407, term78407.getClass(), "last", null);
        setField(term78407, term78407.getClass(), "propListHead", null);
        setIntField(term78407, term78407.getClass(), "sourcePosition", 0);
        setField(term78407, term78407.getClass(), "jsType", null);
        setField(term78407, term78407.getClass(), "parent", null);
        setField(term78406, term78406.getClass(), "next", term78407);
        setField(term78406, term78406.getClass(), "first", null);
        setField(term78406, term78406.getClass(), "last", null);
        setField(term78406, term78406.getClass(), "propListHead", null);
        setIntField(term78406, term78406.getClass(), "sourcePosition", 0);
        setField(term78406, term78406.getClass(), "jsType", null);
        setField(term78406, term78406.getClass(), "parent", null);
        setField(term78405, term78405.getClass(), "first", term78406);
        setField(term78405, term78405.getClass(), "last", null);
        setField(term78405, term78405.getClass(), "propListHead", null);
        setIntField(term78405, term78405.getClass(), "sourcePosition", 0);
        setField(term78405, term78405.getClass(), "jsType", null);
        setField(term78405, term78405.getClass(), "parent", null);
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
        args[1] = term77611;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term77541, args);
        assertTrue(recursiveEquals(term77541, term78404));
        assertTrue(recursiveEquals(term77611, null));
    }

};


