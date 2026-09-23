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

public class FoldConstants_tryFoldBlock_1167048042391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111664;
     Object term111734;
     Object term112150;
     Object term112151;

    public FoldConstants_tryFoldBlock_1167048042391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111664 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term111734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111874 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111944 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term111944, term111944.getClass(), "next", term112014);
        setIntField(term111944, term111944.getClass(), "type", 126);
        setField(term111874, term111874.getClass(), "next", term111944);
        setIntField(term111874, term111874.getClass(), "type", 79);
        setField(term111804, term111804.getClass(), "next", term111874);
        setIntField(term111804, term111804.getClass(), "type", 60);
        setField(term111734, term111734.getClass(), "first", term111804);
        term112150 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term112150, term112150.getClass(), "compiler", null);
        term112151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112152 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term112151, term112151.getClass(), "type", 0);
        setField(term112151, term112151.getClass(), "next", null);
        setIntField(term112152, term112152.getClass(), "type", 60);
        setIntField(term112153, term112153.getClass(), "type", 79);
        setIntField(term112154, term112154.getClass(), "type", 126);
        setIntField(term112155, term112155.getClass(), "type", 0);
        setField(term112155, term112155.getClass(), "next", null);
        setField(term112155, term112155.getClass(), "first", null);
        setField(term112155, term112155.getClass(), "last", null);
        setField(term112155, term112155.getClass(), "propListHead", null);
        setIntField(term112155, term112155.getClass(), "sourcePosition", 0);
        setField(term112155, term112155.getClass(), "jsType", null);
        setField(term112155, term112155.getClass(), "parent", null);
        setField(term112154, term112154.getClass(), "next", term112155);
        setField(term112154, term112154.getClass(), "first", null);
        setField(term112154, term112154.getClass(), "last", null);
        setField(term112154, term112154.getClass(), "propListHead", null);
        setIntField(term112154, term112154.getClass(), "sourcePosition", 0);
        setField(term112154, term112154.getClass(), "jsType", null);
        setField(term112154, term112154.getClass(), "parent", null);
        setField(term112153, term112153.getClass(), "next", term112154);
        setField(term112153, term112153.getClass(), "first", null);
        setField(term112153, term112153.getClass(), "last", null);
        setField(term112153, term112153.getClass(), "propListHead", null);
        setIntField(term112153, term112153.getClass(), "sourcePosition", 0);
        setField(term112153, term112153.getClass(), "jsType", null);
        setField(term112153, term112153.getClass(), "parent", null);
        setField(term112152, term112152.getClass(), "next", term112153);
        setField(term112152, term112152.getClass(), "first", null);
        setField(term112152, term112152.getClass(), "last", null);
        setField(term112152, term112152.getClass(), "propListHead", null);
        setIntField(term112152, term112152.getClass(), "sourcePosition", 0);
        setField(term112152, term112152.getClass(), "jsType", null);
        setField(term112152, term112152.getClass(), "parent", null);
        setField(term112151, term112151.getClass(), "first", term112152);
        setField(term112151, term112151.getClass(), "last", null);
        setField(term112151, term112151.getClass(), "propListHead", null);
        setIntField(term112151, term112151.getClass(), "sourcePosition", 0);
        setField(term112151, term112151.getClass(), "jsType", null);
        setField(term112151, term112151.getClass(), "parent", null);
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
        args[1] = term111734;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term111664, args);
        assertTrue(recursiveEquals(term111664, term112150));
        assertTrue(recursiveEquals(term111734, null));
    }

};


