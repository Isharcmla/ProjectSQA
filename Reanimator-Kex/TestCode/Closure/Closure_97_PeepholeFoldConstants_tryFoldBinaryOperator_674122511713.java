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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182908;
     Object term183000;
     Object term183404;
     Object term183405;
     Object term183365;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182908 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term183000 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term183070 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term183000, term183000.getClass(), "first", term183000);
        setField(term183000, term183000.getClass(), "next", term183070);
        setIntField(term183000, term183000.getClass(), "type", 21);
        term183404 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term183404, term183404.getClass(), "currentTraversal", null);
        term183405 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term183406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term183405, term183405.getClass(), "str", null);
        setIntField(term183405, term183405.getClass(), "type", 21);
        setIntField(term183406, term183406.getClass(), "type", 0);
        setField(term183406, term183406.getClass(), "next", null);
        setField(term183406, term183406.getClass(), "first", null);
        setField(term183406, term183406.getClass(), "last", null);
        setField(term183406, term183406.getClass(), "propListHead", null);
        setIntField(term183406, term183406.getClass(), "sourcePosition", 0);
        setField(term183406, term183406.getClass(), "jsType", null);
        setField(term183406, term183406.getClass(), "parent", null);
        setField(term183405, term183405.getClass(), "next", term183406);
        setField(term183405, term183405.getClass(), "first", term183405);
        setField(term183405, term183405.getClass(), "last", null);
        setField(term183405, term183405.getClass(), "propListHead", null);
        setIntField(term183405, term183405.getClass(), "sourcePosition", 0);
        setField(term183405, term183405.getClass(), "jsType", null);
        setField(term183405, term183405.getClass(), "parent", null);
        term183365 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term183367 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term183365, term183365.getClass(), "str", null);
        setIntField(term183365, term183365.getClass(), "type", 21);
        setIntField(term183367, term183367.getClass(), "type", 0);
        setField(term183367, term183367.getClass(), "next", null);
        setField(term183367, term183367.getClass(), "first", null);
        setField(term183367, term183367.getClass(), "last", null);
        setField(term183367, term183367.getClass(), "propListHead", null);
        setIntField(term183367, term183367.getClass(), "sourcePosition", 0);
        setField(term183367, term183367.getClass(), "jsType", null);
        setField(term183367, term183367.getClass(), "parent", null);
        setField(term183365, term183365.getClass(), "next", term183367);
        setField(term183365, term183365.getClass(), "first", term183365);
        setField(term183365, term183365.getClass(), "last", null);
        setField(term183365, term183365.getClass(), "propListHead", null);
        setIntField(term183365, term183365.getClass(), "sourcePosition", 0);
        setField(term183365, term183365.getClass(), "jsType", null);
        setField(term183365, term183365.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term183000;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term182908, args);
        assertTrue(recursiveEquals(term182908, term183404));
        assertTrue(recursiveEquals(term183000, term183405));
        assertTrue(recursiveEquals(retValue, term183365));
    }

};


