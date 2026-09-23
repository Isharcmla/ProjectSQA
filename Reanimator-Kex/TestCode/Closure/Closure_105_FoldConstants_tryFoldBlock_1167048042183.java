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

public class FoldConstants_tryFoldBlock_1167048042183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38295;
     Object term38365;
     Object term47594;
     Object term47595;

    public FoldConstants_tryFoldBlock_1167048042183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38295 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term38365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38505 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term38435, term38435.getClass(), "next", term38365);
        setIntField(term38435, term38435.getClass(), "type", 82);
        setField(term38365, term38365.getClass(), "first", term38435);
        setField(term38365, term38365.getClass(), "next", term38505);
        setIntField(term38365, term38365.getClass(), "type", 78);
        term47594 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term47594, term47594.getClass(), "compiler", null);
        term47595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47596 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47595, term47595.getClass(), "type", 78);
        setIntField(term47596, term47596.getClass(), "type", 0);
        setField(term47596, term47596.getClass(), "next", null);
        setField(term47596, term47596.getClass(), "first", null);
        setField(term47596, term47596.getClass(), "last", null);
        setField(term47596, term47596.getClass(), "propListHead", null);
        setIntField(term47596, term47596.getClass(), "sourcePosition", 0);
        setField(term47596, term47596.getClass(), "jsType", null);
        setField(term47596, term47596.getClass(), "parent", null);
        setField(term47595, term47595.getClass(), "next", term47596);
        setIntField(term47597, term47597.getClass(), "type", 82);
        setField(term47597, term47597.getClass(), "next", term47595);
        setField(term47597, term47597.getClass(), "first", null);
        setField(term47597, term47597.getClass(), "last", null);
        setField(term47597, term47597.getClass(), "propListHead", null);
        setIntField(term47597, term47597.getClass(), "sourcePosition", 0);
        setField(term47597, term47597.getClass(), "jsType", null);
        setField(term47597, term47597.getClass(), "parent", null);
        setField(term47595, term47595.getClass(), "first", term47597);
        setField(term47595, term47595.getClass(), "last", null);
        setField(term47595, term47595.getClass(), "propListHead", null);
        setIntField(term47595, term47595.getClass(), "sourcePosition", 0);
        setField(term47595, term47595.getClass(), "jsType", null);
        setField(term47595, term47595.getClass(), "parent", null);
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
        args[1] = term38365;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term38295, args);
        assertTrue(recursiveEquals(term38295, term47594));
        assertTrue(recursiveEquals(term38365, null));
    }

};


