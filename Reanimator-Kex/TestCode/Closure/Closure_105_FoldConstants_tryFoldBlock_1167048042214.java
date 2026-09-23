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

public class FoldConstants_tryFoldBlock_1167048042214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54810;
     Object term54880;
     Object term55719;
     Object term55720;

    public FoldConstants_tryFoldBlock_1167048042214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54810 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term54880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54950 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55020 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term54950, term54950.getClass(), "next", term54880);
        setIntField(term54950, term54950.getClass(), "type", 129);
        setField(term54880, term54880.getClass(), "first", term54950);
        setField(term54880, term54880.getClass(), "next", term55020);
        setIntField(term54880, term54880.getClass(), "type", 35);
        term55719 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term55719, term55719.getClass(), "compiler", null);
        term55720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55721 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term55720, term55720.getClass(), "type", 35);
        setIntField(term55721, term55721.getClass(), "type", 0);
        setField(term55721, term55721.getClass(), "next", null);
        setField(term55721, term55721.getClass(), "first", null);
        setField(term55721, term55721.getClass(), "last", null);
        setField(term55721, term55721.getClass(), "propListHead", null);
        setIntField(term55721, term55721.getClass(), "sourcePosition", 0);
        setField(term55721, term55721.getClass(), "jsType", null);
        setField(term55721, term55721.getClass(), "parent", null);
        setField(term55720, term55720.getClass(), "next", term55721);
        setIntField(term55722, term55722.getClass(), "type", 129);
        setField(term55722, term55722.getClass(), "next", term55720);
        setField(term55722, term55722.getClass(), "first", null);
        setField(term55722, term55722.getClass(), "last", null);
        setField(term55722, term55722.getClass(), "propListHead", null);
        setIntField(term55722, term55722.getClass(), "sourcePosition", 0);
        setField(term55722, term55722.getClass(), "jsType", null);
        setField(term55722, term55722.getClass(), "parent", null);
        setField(term55720, term55720.getClass(), "first", term55722);
        setField(term55720, term55720.getClass(), "last", null);
        setField(term55720, term55720.getClass(), "propListHead", null);
        setIntField(term55720, term55720.getClass(), "sourcePosition", 0);
        setField(term55720, term55720.getClass(), "jsType", null);
        setField(term55720, term55720.getClass(), "parent", null);
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
        args[1] = term54880;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term54810, args);
        assertTrue(recursiveEquals(term54810, term55719));
        assertTrue(recursiveEquals(term54880, null));
    }

};


