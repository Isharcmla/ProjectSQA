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

public class PeepholeFoldConstants_optimizeSubtree_1606506993208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31200;
     Object term31270;
     Object term32109;
     Object term32110;
     Object term32100;

    public PeepholeFoldConstants_optimizeSubtree_1606506993208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31200 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term31270 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31270, term31270.getClass(), "type", 34);
        term32109 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term32109, term32109.getClass(), "currentTraversal", null);
        term32110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32110, term32110.getClass(), "type", 34);
        setField(term32110, term32110.getClass(), "next", null);
        setField(term32110, term32110.getClass(), "first", null);
        setField(term32110, term32110.getClass(), "last", null);
        setField(term32110, term32110.getClass(), "propListHead", null);
        setIntField(term32110, term32110.getClass(), "sourcePosition", 0);
        setField(term32110, term32110.getClass(), "jsType", null);
        setField(term32110, term32110.getClass(), "parent", null);
        term32100 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32100, term32100.getClass(), "type", 34);
        setField(term32100, term32100.getClass(), "next", null);
        setField(term32100, term32100.getClass(), "first", null);
        setField(term32100, term32100.getClass(), "last", null);
        setField(term32100, term32100.getClass(), "propListHead", null);
        setIntField(term32100, term32100.getClass(), "sourcePosition", 0);
        setField(term32100, term32100.getClass(), "jsType", null);
        setField(term32100, term32100.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term31270;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term31200, args);
        assertTrue(recursiveEquals(term31200, term32109));
        assertTrue(recursiveEquals(term31270, term32110));
        assertTrue(recursiveEquals(retValue, term32100));
    }

};


