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

public class FoldConstants_tryFoldBlock_1167048042275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73469;
     Object term73539;
     Object term74056;
     Object term74057;

    public FoldConstants_tryFoldBlock_1167048042275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73469 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term73539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term73749, term73749.getClass(), "next", term73819);
        setIntField(term73749, term73749.getClass(), "type", 54);
        setField(term73679, term73679.getClass(), "next", term73749);
        setIntField(term73679, term73679.getClass(), "type", 91);
        setIntField(term73889, term73889.getClass(), "type", 129);
        setField(term73679, term73679.getClass(), "first", term73889);
        setField(term73609, term73609.getClass(), "next", term73679);
        setIntField(term73609, term73609.getClass(), "type", 129);
        setField(term73539, term73539.getClass(), "first", term73609);
        term74056 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term74056, term74056.getClass(), "compiler", null);
        term74057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74060 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term74057, term74057.getClass(), "type", 0);
        setField(term74057, term74057.getClass(), "next", null);
        setIntField(term74058, term74058.getClass(), "type", 129);
        setIntField(term74059, term74059.getClass(), "type", 91);
        setIntField(term74060, term74060.getClass(), "type", 54);
        setIntField(term74061, term74061.getClass(), "type", 0);
        setField(term74061, term74061.getClass(), "next", null);
        setField(term74061, term74061.getClass(), "first", null);
        setField(term74061, term74061.getClass(), "last", null);
        setField(term74061, term74061.getClass(), "propListHead", null);
        setIntField(term74061, term74061.getClass(), "sourcePosition", 0);
        setField(term74061, term74061.getClass(), "jsType", null);
        setField(term74061, term74061.getClass(), "parent", null);
        setField(term74060, term74060.getClass(), "next", term74061);
        setField(term74060, term74060.getClass(), "first", null);
        setField(term74060, term74060.getClass(), "last", null);
        setField(term74060, term74060.getClass(), "propListHead", null);
        setIntField(term74060, term74060.getClass(), "sourcePosition", 0);
        setField(term74060, term74060.getClass(), "jsType", null);
        setField(term74060, term74060.getClass(), "parent", null);
        setField(term74059, term74059.getClass(), "next", term74060);
        setIntField(term74062, term74062.getClass(), "type", 129);
        setField(term74062, term74062.getClass(), "next", null);
        setField(term74062, term74062.getClass(), "first", null);
        setField(term74062, term74062.getClass(), "last", null);
        setField(term74062, term74062.getClass(), "propListHead", null);
        setIntField(term74062, term74062.getClass(), "sourcePosition", 0);
        setField(term74062, term74062.getClass(), "jsType", null);
        setField(term74062, term74062.getClass(), "parent", null);
        setField(term74059, term74059.getClass(), "first", term74062);
        setField(term74059, term74059.getClass(), "last", null);
        setField(term74059, term74059.getClass(), "propListHead", null);
        setIntField(term74059, term74059.getClass(), "sourcePosition", 0);
        setField(term74059, term74059.getClass(), "jsType", null);
        setField(term74059, term74059.getClass(), "parent", null);
        setField(term74058, term74058.getClass(), "next", term74059);
        setField(term74058, term74058.getClass(), "first", null);
        setField(term74058, term74058.getClass(), "last", null);
        setField(term74058, term74058.getClass(), "propListHead", null);
        setIntField(term74058, term74058.getClass(), "sourcePosition", 0);
        setField(term74058, term74058.getClass(), "jsType", null);
        setField(term74058, term74058.getClass(), "parent", null);
        setField(term74057, term74057.getClass(), "first", term74058);
        setField(term74057, term74057.getClass(), "last", null);
        setField(term74057, term74057.getClass(), "propListHead", null);
        setIntField(term74057, term74057.getClass(), "sourcePosition", 0);
        setField(term74057, term74057.getClass(), "jsType", null);
        setField(term74057, term74057.getClass(), "parent", null);
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
        args[1] = term73539;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term73469, args);
        assertTrue(recursiveEquals(term73469, term74056));
        assertTrue(recursiveEquals(term73539, null));
    }

};


