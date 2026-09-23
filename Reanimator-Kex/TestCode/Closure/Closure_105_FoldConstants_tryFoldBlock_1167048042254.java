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

public class FoldConstants_tryFoldBlock_1167048042254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67246;
     Object term67316;
     Object term68046;
     Object term68047;

    public FoldConstants_tryFoldBlock_1167048042254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67246 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term67316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67456 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term67386, term67386.getClass(), "next", term67316);
        setIntField(term67386, term67386.getClass(), "type", 103);
        setField(term67316, term67316.getClass(), "first", term67386);
        setField(term67316, term67316.getClass(), "next", term67456);
        setIntField(term67316, term67316.getClass(), "type", 128);
        term68046 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term68046, term68046.getClass(), "compiler", null);
        term68047 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term68047, term68047.getClass(), "type", 128);
        setIntField(term68048, term68048.getClass(), "type", 0);
        setField(term68048, term68048.getClass(), "next", null);
        setField(term68048, term68048.getClass(), "first", null);
        setField(term68048, term68048.getClass(), "last", null);
        setField(term68048, term68048.getClass(), "propListHead", null);
        setIntField(term68048, term68048.getClass(), "sourcePosition", 0);
        setField(term68048, term68048.getClass(), "jsType", null);
        setField(term68048, term68048.getClass(), "parent", null);
        setField(term68047, term68047.getClass(), "next", term68048);
        setIntField(term68049, term68049.getClass(), "type", 103);
        setField(term68049, term68049.getClass(), "next", term68047);
        setField(term68049, term68049.getClass(), "first", null);
        setField(term68049, term68049.getClass(), "last", null);
        setField(term68049, term68049.getClass(), "propListHead", null);
        setIntField(term68049, term68049.getClass(), "sourcePosition", 0);
        setField(term68049, term68049.getClass(), "jsType", null);
        setField(term68049, term68049.getClass(), "parent", null);
        setField(term68047, term68047.getClass(), "first", term68049);
        setField(term68047, term68047.getClass(), "last", null);
        setField(term68047, term68047.getClass(), "propListHead", null);
        setIntField(term68047, term68047.getClass(), "sourcePosition", 0);
        setField(term68047, term68047.getClass(), "jsType", null);
        setField(term68047, term68047.getClass(), "parent", null);
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
        args[1] = term67316;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term67246, args);
        assertTrue(recursiveEquals(term67246, term68046));
        assertTrue(recursiveEquals(term67316, null));
    }

};


