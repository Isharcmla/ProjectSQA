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

public class FoldConstants_tryFoldBlock_1167048042321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87578;
     Object term87648;
     Object term88176;
     Object term88177;

    public FoldConstants_tryFoldBlock_1167048042321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87578 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term87648 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87718 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87858 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87928 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term87928, term87928.getClass(), "next", term87998);
        setIntField(term87928, term87928.getClass(), "type", 109);
        setField(term87858, term87858.getClass(), "next", term87928);
        setIntField(term87858, term87858.getClass(), "type", 123);
        setField(term87788, term87788.getClass(), "next", term87858);
        setIntField(term87788, term87788.getClass(), "type", 55);
        setField(term87718, term87718.getClass(), "next", term87788);
        setIntField(term87718, term87718.getClass(), "type", 31);
        setField(term87648, term87648.getClass(), "first", term87718);
        term88176 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term88176, term88176.getClass(), "compiler", null);
        term88177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88180 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term88177, term88177.getClass(), "type", 0);
        setField(term88177, term88177.getClass(), "next", null);
        setIntField(term88178, term88178.getClass(), "type", 31);
        setIntField(term88179, term88179.getClass(), "type", 55);
        setIntField(term88180, term88180.getClass(), "type", 123);
        setIntField(term88181, term88181.getClass(), "type", 109);
        setField(term88181, term88181.getClass(), "next", null);
        setField(term88181, term88181.getClass(), "first", null);
        setField(term88181, term88181.getClass(), "last", null);
        setField(term88181, term88181.getClass(), "propListHead", null);
        setIntField(term88181, term88181.getClass(), "sourcePosition", 0);
        setField(term88181, term88181.getClass(), "jsType", null);
        setField(term88181, term88181.getClass(), "parent", null);
        setField(term88180, term88180.getClass(), "next", term88181);
        setField(term88180, term88180.getClass(), "first", null);
        setField(term88180, term88180.getClass(), "last", null);
        setField(term88180, term88180.getClass(), "propListHead", null);
        setIntField(term88180, term88180.getClass(), "sourcePosition", 0);
        setField(term88180, term88180.getClass(), "jsType", null);
        setField(term88180, term88180.getClass(), "parent", null);
        setField(term88179, term88179.getClass(), "next", term88180);
        setField(term88179, term88179.getClass(), "first", null);
        setField(term88179, term88179.getClass(), "last", null);
        setField(term88179, term88179.getClass(), "propListHead", null);
        setIntField(term88179, term88179.getClass(), "sourcePosition", 0);
        setField(term88179, term88179.getClass(), "jsType", null);
        setField(term88179, term88179.getClass(), "parent", null);
        setField(term88178, term88178.getClass(), "next", term88179);
        setField(term88178, term88178.getClass(), "first", null);
        setField(term88178, term88178.getClass(), "last", null);
        setField(term88178, term88178.getClass(), "propListHead", null);
        setIntField(term88178, term88178.getClass(), "sourcePosition", 0);
        setField(term88178, term88178.getClass(), "jsType", null);
        setField(term88178, term88178.getClass(), "parent", null);
        setField(term88177, term88177.getClass(), "first", term88178);
        setField(term88177, term88177.getClass(), "last", null);
        setField(term88177, term88177.getClass(), "propListHead", null);
        setIntField(term88177, term88177.getClass(), "sourcePosition", 0);
        setField(term88177, term88177.getClass(), "jsType", null);
        setField(term88177, term88177.getClass(), "parent", null);
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
        args[1] = term87648;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term87578, args);
        assertTrue(recursiveEquals(term87578, term88176));
        assertTrue(recursiveEquals(term87648, null));
    }

};


