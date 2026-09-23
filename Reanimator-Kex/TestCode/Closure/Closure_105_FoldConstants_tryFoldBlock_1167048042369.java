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

public class FoldConstants_tryFoldBlock_1167048042369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104192;
     Object term104262;
     Object term104790;
     Object term104791;

    public FoldConstants_tryFoldBlock_1167048042369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104192 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term104262 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104402 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104472 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104542 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104612 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term104542, term104542.getClass(), "next", term104612);
        setIntField(term104542, term104542.getClass(), "type", 48);
        setField(term104472, term104472.getClass(), "next", term104542);
        setIntField(term104472, term104472.getClass(), "type", 117);
        setField(term104402, term104402.getClass(), "next", term104472);
        setIntField(term104402, term104402.getClass(), "type", 55);
        setField(term104332, term104332.getClass(), "next", term104402);
        setIntField(term104332, term104332.getClass(), "type", 31);
        setField(term104262, term104262.getClass(), "first", term104332);
        term104790 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term104790, term104790.getClass(), "compiler", null);
        term104791 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104793 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104794 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104795 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term104791, term104791.getClass(), "type", 0);
        setField(term104791, term104791.getClass(), "next", null);
        setIntField(term104792, term104792.getClass(), "type", 31);
        setIntField(term104793, term104793.getClass(), "type", 55);
        setIntField(term104794, term104794.getClass(), "type", 117);
        setIntField(term104795, term104795.getClass(), "type", 48);
        setField(term104795, term104795.getClass(), "next", null);
        setField(term104795, term104795.getClass(), "first", null);
        setField(term104795, term104795.getClass(), "last", null);
        setField(term104795, term104795.getClass(), "propListHead", null);
        setIntField(term104795, term104795.getClass(), "sourcePosition", 0);
        setField(term104795, term104795.getClass(), "jsType", null);
        setField(term104795, term104795.getClass(), "parent", null);
        setField(term104794, term104794.getClass(), "next", term104795);
        setField(term104794, term104794.getClass(), "first", null);
        setField(term104794, term104794.getClass(), "last", null);
        setField(term104794, term104794.getClass(), "propListHead", null);
        setIntField(term104794, term104794.getClass(), "sourcePosition", 0);
        setField(term104794, term104794.getClass(), "jsType", null);
        setField(term104794, term104794.getClass(), "parent", null);
        setField(term104793, term104793.getClass(), "next", term104794);
        setField(term104793, term104793.getClass(), "first", null);
        setField(term104793, term104793.getClass(), "last", null);
        setField(term104793, term104793.getClass(), "propListHead", null);
        setIntField(term104793, term104793.getClass(), "sourcePosition", 0);
        setField(term104793, term104793.getClass(), "jsType", null);
        setField(term104793, term104793.getClass(), "parent", null);
        setField(term104792, term104792.getClass(), "next", term104793);
        setField(term104792, term104792.getClass(), "first", null);
        setField(term104792, term104792.getClass(), "last", null);
        setField(term104792, term104792.getClass(), "propListHead", null);
        setIntField(term104792, term104792.getClass(), "sourcePosition", 0);
        setField(term104792, term104792.getClass(), "jsType", null);
        setField(term104792, term104792.getClass(), "parent", null);
        setField(term104791, term104791.getClass(), "first", term104792);
        setField(term104791, term104791.getClass(), "last", null);
        setField(term104791, term104791.getClass(), "propListHead", null);
        setIntField(term104791, term104791.getClass(), "sourcePosition", 0);
        setField(term104791, term104791.getClass(), "jsType", null);
        setField(term104791, term104791.getClass(), "parent", null);
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
        args[1] = term104262;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term104192, args);
        assertTrue(recursiveEquals(term104192, term104790));
        assertTrue(recursiveEquals(term104262, null));
    }

};


