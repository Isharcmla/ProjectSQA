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

public class FoldConstants_tryFoldBlock_1167048042411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118242;
     Object term118312;
     Object term119210;
     Object term119211;

    public FoldConstants_tryFoldBlock_1167048042411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118242 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term118312 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term118382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term118452 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term118522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term118592 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term118662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term118592, term118592.getClass(), "next", term118662);
        setIntField(term118592, term118592.getClass(), "type", 74);
        setField(term118522, term118522.getClass(), "next", term118592);
        setIntField(term118522, term118522.getClass(), "type", 128);
        setField(term118452, term118452.getClass(), "next", term118522);
        setIntField(term118452, term118452.getClass(), "type", 81);
        setField(term118382, term118382.getClass(), "next", term118452);
        setIntField(term118382, term118382.getClass(), "type", 60);
        setField(term118312, term118312.getClass(), "first", term118382);
        term119210 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term119210, term119210.getClass(), "compiler", null);
        term119211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term119212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term119213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term119214 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term119215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term119211, term119211.getClass(), "type", 0);
        setField(term119211, term119211.getClass(), "next", null);
        setIntField(term119212, term119212.getClass(), "type", 60);
        setIntField(term119213, term119213.getClass(), "type", 81);
        setIntField(term119214, term119214.getClass(), "type", 128);
        setIntField(term119215, term119215.getClass(), "type", 74);
        setField(term119215, term119215.getClass(), "next", null);
        setField(term119215, term119215.getClass(), "first", null);
        setField(term119215, term119215.getClass(), "last", null);
        setField(term119215, term119215.getClass(), "propListHead", null);
        setIntField(term119215, term119215.getClass(), "sourcePosition", 0);
        setField(term119215, term119215.getClass(), "jsType", null);
        setField(term119215, term119215.getClass(), "parent", null);
        setField(term119214, term119214.getClass(), "next", term119215);
        setField(term119214, term119214.getClass(), "first", null);
        setField(term119214, term119214.getClass(), "last", null);
        setField(term119214, term119214.getClass(), "propListHead", null);
        setIntField(term119214, term119214.getClass(), "sourcePosition", 0);
        setField(term119214, term119214.getClass(), "jsType", null);
        setField(term119214, term119214.getClass(), "parent", null);
        setField(term119213, term119213.getClass(), "next", term119214);
        setField(term119213, term119213.getClass(), "first", null);
        setField(term119213, term119213.getClass(), "last", null);
        setField(term119213, term119213.getClass(), "propListHead", null);
        setIntField(term119213, term119213.getClass(), "sourcePosition", 0);
        setField(term119213, term119213.getClass(), "jsType", null);
        setField(term119213, term119213.getClass(), "parent", null);
        setField(term119212, term119212.getClass(), "next", term119213);
        setField(term119212, term119212.getClass(), "first", null);
        setField(term119212, term119212.getClass(), "last", null);
        setField(term119212, term119212.getClass(), "propListHead", null);
        setIntField(term119212, term119212.getClass(), "sourcePosition", 0);
        setField(term119212, term119212.getClass(), "jsType", null);
        setField(term119212, term119212.getClass(), "parent", null);
        setField(term119211, term119211.getClass(), "first", term119212);
        setField(term119211, term119211.getClass(), "last", null);
        setField(term119211, term119211.getClass(), "propListHead", null);
        setIntField(term119211, term119211.getClass(), "sourcePosition", 0);
        setField(term119211, term119211.getClass(), "jsType", null);
        setField(term119211, term119211.getClass(), "parent", null);
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
        args[1] = term118312;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term118242, args);
        assertTrue(recursiveEquals(term118242, term119210));
        assertTrue(recursiveEquals(term118312, null));
    }

};


