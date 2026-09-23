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

public class FoldConstants_tryFoldBlock_1167048042200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50631;
     Object term50701;
     Object term51450;
     Object term51451;

    public FoldConstants_tryFoldBlock_1167048042200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50631 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term50701 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50771 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50841 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50911 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term50911, term50911.getClass(), "next", term50981);
        setIntField(term50911, term50911.getClass(), "type", 70);
        setField(term50841, term50841.getClass(), "next", term50911);
        setIntField(term50841, term50841.getClass(), "type", 62);
        setField(term50771, term50771.getClass(), "next", term50841);
        setIntField(term50771, term50771.getClass(), "type", 48);
        setField(term50701, term50701.getClass(), "first", term50771);
        term51450 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term51450, term51450.getClass(), "compiler", null);
        term51451 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51452 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term51451, term51451.getClass(), "type", 0);
        setField(term51451, term51451.getClass(), "next", null);
        setIntField(term51452, term51452.getClass(), "type", 48);
        setIntField(term51453, term51453.getClass(), "type", 62);
        setIntField(term51454, term51454.getClass(), "type", 70);
        setIntField(term51455, term51455.getClass(), "type", 0);
        setField(term51455, term51455.getClass(), "next", null);
        setField(term51455, term51455.getClass(), "first", null);
        setField(term51455, term51455.getClass(), "last", null);
        setField(term51455, term51455.getClass(), "propListHead", null);
        setIntField(term51455, term51455.getClass(), "sourcePosition", 0);
        setField(term51455, term51455.getClass(), "jsType", null);
        setField(term51455, term51455.getClass(), "parent", null);
        setField(term51454, term51454.getClass(), "next", term51455);
        setField(term51454, term51454.getClass(), "first", null);
        setField(term51454, term51454.getClass(), "last", null);
        setField(term51454, term51454.getClass(), "propListHead", null);
        setIntField(term51454, term51454.getClass(), "sourcePosition", 0);
        setField(term51454, term51454.getClass(), "jsType", null);
        setField(term51454, term51454.getClass(), "parent", null);
        setField(term51453, term51453.getClass(), "next", term51454);
        setField(term51453, term51453.getClass(), "first", null);
        setField(term51453, term51453.getClass(), "last", null);
        setField(term51453, term51453.getClass(), "propListHead", null);
        setIntField(term51453, term51453.getClass(), "sourcePosition", 0);
        setField(term51453, term51453.getClass(), "jsType", null);
        setField(term51453, term51453.getClass(), "parent", null);
        setField(term51452, term51452.getClass(), "next", term51453);
        setField(term51452, term51452.getClass(), "first", null);
        setField(term51452, term51452.getClass(), "last", null);
        setField(term51452, term51452.getClass(), "propListHead", null);
        setIntField(term51452, term51452.getClass(), "sourcePosition", 0);
        setField(term51452, term51452.getClass(), "jsType", null);
        setField(term51452, term51452.getClass(), "parent", null);
        setField(term51451, term51451.getClass(), "first", term51452);
        setField(term51451, term51451.getClass(), "last", null);
        setField(term51451, term51451.getClass(), "propListHead", null);
        setIntField(term51451, term51451.getClass(), "sourcePosition", 0);
        setField(term51451, term51451.getClass(), "jsType", null);
        setField(term51451, term51451.getClass(), "parent", null);
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
        args[1] = term50701;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term50631, args);
        assertTrue(recursiveEquals(term50631, term51450));
        assertTrue(recursiveEquals(term50701, null));
    }

};


