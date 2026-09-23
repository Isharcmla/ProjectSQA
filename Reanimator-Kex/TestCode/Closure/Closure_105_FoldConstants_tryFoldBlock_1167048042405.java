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

public class FoldConstants_tryFoldBlock_1167048042405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116558;
     Object term116628;
     Object term117156;
     Object term117157;

    public FoldConstants_tryFoldBlock_1167048042405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116558 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term116628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term116698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term116768 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term116838 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term116908 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term116978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term116908, term116908.getClass(), "next", term116978);
        setIntField(term116908, term116908.getClass(), "type", 69);
        setField(term116838, term116838.getClass(), "next", term116908);
        setIntField(term116838, term116838.getClass(), "type", 128);
        setField(term116768, term116768.getClass(), "next", term116838);
        setIntField(term116768, term116768.getClass(), "type", 81);
        setField(term116698, term116698.getClass(), "next", term116768);
        setIntField(term116698, term116698.getClass(), "type", 60);
        setField(term116628, term116628.getClass(), "first", term116698);
        term117156 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term117156, term117156.getClass(), "compiler", null);
        term117157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term117158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term117159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term117160 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term117161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term117157, term117157.getClass(), "type", 0);
        setField(term117157, term117157.getClass(), "next", null);
        setIntField(term117158, term117158.getClass(), "type", 60);
        setIntField(term117159, term117159.getClass(), "type", 81);
        setIntField(term117160, term117160.getClass(), "type", 128);
        setIntField(term117161, term117161.getClass(), "type", 69);
        setField(term117161, term117161.getClass(), "next", null);
        setField(term117161, term117161.getClass(), "first", null);
        setField(term117161, term117161.getClass(), "last", null);
        setField(term117161, term117161.getClass(), "propListHead", null);
        setIntField(term117161, term117161.getClass(), "sourcePosition", 0);
        setField(term117161, term117161.getClass(), "jsType", null);
        setField(term117161, term117161.getClass(), "parent", null);
        setField(term117160, term117160.getClass(), "next", term117161);
        setField(term117160, term117160.getClass(), "first", null);
        setField(term117160, term117160.getClass(), "last", null);
        setField(term117160, term117160.getClass(), "propListHead", null);
        setIntField(term117160, term117160.getClass(), "sourcePosition", 0);
        setField(term117160, term117160.getClass(), "jsType", null);
        setField(term117160, term117160.getClass(), "parent", null);
        setField(term117159, term117159.getClass(), "next", term117160);
        setField(term117159, term117159.getClass(), "first", null);
        setField(term117159, term117159.getClass(), "last", null);
        setField(term117159, term117159.getClass(), "propListHead", null);
        setIntField(term117159, term117159.getClass(), "sourcePosition", 0);
        setField(term117159, term117159.getClass(), "jsType", null);
        setField(term117159, term117159.getClass(), "parent", null);
        setField(term117158, term117158.getClass(), "next", term117159);
        setField(term117158, term117158.getClass(), "first", null);
        setField(term117158, term117158.getClass(), "last", null);
        setField(term117158, term117158.getClass(), "propListHead", null);
        setIntField(term117158, term117158.getClass(), "sourcePosition", 0);
        setField(term117158, term117158.getClass(), "jsType", null);
        setField(term117158, term117158.getClass(), "parent", null);
        setField(term117157, term117157.getClass(), "first", term117158);
        setField(term117157, term117157.getClass(), "last", null);
        setField(term117157, term117157.getClass(), "propListHead", null);
        setIntField(term117157, term117157.getClass(), "sourcePosition", 0);
        setField(term117157, term117157.getClass(), "jsType", null);
        setField(term117157, term117157.getClass(), "parent", null);
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
        args[1] = term116628;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term116558, args);
        assertTrue(recursiveEquals(term116558, term117156));
        assertTrue(recursiveEquals(term116628, null));
    }

};


