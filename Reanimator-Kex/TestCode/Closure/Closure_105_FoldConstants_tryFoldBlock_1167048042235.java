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

public class FoldConstants_tryFoldBlock_1167048042235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61655;
     Object term61725;
     Object term62124;
     Object term62125;

    public FoldConstants_tryFoldBlock_1167048042235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61655 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term61725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61795 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61865 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term61795, term61795.getClass(), "next", term61725);
        setIntField(term61795, term61795.getClass(), "type", 129);
        setField(term61725, term61725.getClass(), "first", term61795);
        setField(term61725, term61725.getClass(), "next", term61865);
        setIntField(term61725, term61725.getClass(), "type", 96);
        term62124 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term62124, term62124.getClass(), "compiler", null);
        term62125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62126 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term62125, term62125.getClass(), "type", 96);
        setIntField(term62126, term62126.getClass(), "type", 0);
        setField(term62126, term62126.getClass(), "next", null);
        setField(term62126, term62126.getClass(), "first", null);
        setField(term62126, term62126.getClass(), "last", null);
        setField(term62126, term62126.getClass(), "propListHead", null);
        setIntField(term62126, term62126.getClass(), "sourcePosition", 0);
        setField(term62126, term62126.getClass(), "jsType", null);
        setField(term62126, term62126.getClass(), "parent", null);
        setField(term62125, term62125.getClass(), "next", term62126);
        setIntField(term62127, term62127.getClass(), "type", 129);
        setField(term62127, term62127.getClass(), "next", term62125);
        setField(term62127, term62127.getClass(), "first", null);
        setField(term62127, term62127.getClass(), "last", null);
        setField(term62127, term62127.getClass(), "propListHead", null);
        setIntField(term62127, term62127.getClass(), "sourcePosition", 0);
        setField(term62127, term62127.getClass(), "jsType", null);
        setField(term62127, term62127.getClass(), "parent", null);
        setField(term62125, term62125.getClass(), "first", term62127);
        setField(term62125, term62125.getClass(), "last", null);
        setField(term62125, term62125.getClass(), "propListHead", null);
        setIntField(term62125, term62125.getClass(), "sourcePosition", 0);
        setField(term62125, term62125.getClass(), "jsType", null);
        setField(term62125, term62125.getClass(), "parent", null);
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
        args[1] = term61725;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term61655, args);
        assertTrue(recursiveEquals(term61655, term62124));
        assertTrue(recursiveEquals(term61725, null));
    }

};


