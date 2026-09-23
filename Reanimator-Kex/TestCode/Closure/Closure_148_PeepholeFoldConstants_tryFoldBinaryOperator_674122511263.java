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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50321;
     Object term50391;
     Object term50763;
     Object term50764;
     Object term50730;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50321 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term50391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50531 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term50461, term50461.getClass(), "next", term50531);
        setIntField(term50461, term50461.getClass(), "type", 39);
        setField(term50391, term50391.getClass(), "first", term50461);
        setIntField(term50391, term50391.getClass(), "type", 11);
        term50763 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term50763, term50763.getClass(), "currentTraversal", null);
        term50764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50765 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50766 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50764, term50764.getClass(), "type", 11);
        setField(term50764, term50764.getClass(), "next", null);
        setIntField(term50765, term50765.getClass(), "type", 39);
        setIntField(term50766, term50766.getClass(), "type", 0);
        setField(term50766, term50766.getClass(), "next", null);
        setField(term50766, term50766.getClass(), "first", null);
        setField(term50766, term50766.getClass(), "last", null);
        setField(term50766, term50766.getClass(), "propListHead", null);
        setIntField(term50766, term50766.getClass(), "sourcePosition", 0);
        setField(term50766, term50766.getClass(), "jsType", null);
        setField(term50766, term50766.getClass(), "parent", null);
        setField(term50765, term50765.getClass(), "next", term50766);
        setField(term50765, term50765.getClass(), "first", null);
        setField(term50765, term50765.getClass(), "last", null);
        setField(term50765, term50765.getClass(), "propListHead", null);
        setIntField(term50765, term50765.getClass(), "sourcePosition", 0);
        setField(term50765, term50765.getClass(), "jsType", null);
        setField(term50765, term50765.getClass(), "parent", null);
        setField(term50764, term50764.getClass(), "first", term50765);
        setField(term50764, term50764.getClass(), "last", null);
        setField(term50764, term50764.getClass(), "propListHead", null);
        setIntField(term50764, term50764.getClass(), "sourcePosition", 0);
        setField(term50764, term50764.getClass(), "jsType", null);
        setField(term50764, term50764.getClass(), "parent", null);
        term50730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50732 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50730, term50730.getClass(), "type", 11);
        setField(term50730, term50730.getClass(), "next", null);
        setIntField(term50732, term50732.getClass(), "type", 39);
        setIntField(term50734, term50734.getClass(), "type", 0);
        setField(term50734, term50734.getClass(), "next", null);
        setField(term50734, term50734.getClass(), "first", null);
        setField(term50734, term50734.getClass(), "last", null);
        setField(term50734, term50734.getClass(), "propListHead", null);
        setIntField(term50734, term50734.getClass(), "sourcePosition", 0);
        setField(term50734, term50734.getClass(), "jsType", null);
        setField(term50734, term50734.getClass(), "parent", null);
        setField(term50732, term50732.getClass(), "next", term50734);
        setField(term50732, term50732.getClass(), "first", null);
        setField(term50732, term50732.getClass(), "last", null);
        setField(term50732, term50732.getClass(), "propListHead", null);
        setIntField(term50732, term50732.getClass(), "sourcePosition", 0);
        setField(term50732, term50732.getClass(), "jsType", null);
        setField(term50732, term50732.getClass(), "parent", null);
        setField(term50730, term50730.getClass(), "first", term50732);
        setField(term50730, term50730.getClass(), "last", null);
        setField(term50730, term50730.getClass(), "propListHead", null);
        setIntField(term50730, term50730.getClass(), "sourcePosition", 0);
        setField(term50730, term50730.getClass(), "jsType", null);
        setField(term50730, term50730.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term50391;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term50321, args);
        assertTrue(recursiveEquals(term50321, term50763));
        assertTrue(recursiveEquals(term50391, term50764));
        assertTrue(recursiveEquals(retValue, term50730));
    }

};


