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

public class PeepholeFoldConstants_tryFoldBinaryOperator_67412251183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14954;
     Object term15024;
     Object term15258;
     Object term15259;
     Object term15217;

    public PeepholeFoldConstants_tryFoldBinaryOperator_67412251183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14954 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term15024 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term15024, term15024.getClass(), "first", term15024);
        setField(term15024, term15024.getClass(), "next", term15024);
        setIntField(term15024, term15024.getClass(), "type", 101);
        term15258 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term15258, term15258.getClass(), "currentTraversal", null);
        term15259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15259, term15259.getClass(), "type", 101);
        setField(term15259, term15259.getClass(), "next", term15259);
        setField(term15259, term15259.getClass(), "first", term15259);
        setField(term15259, term15259.getClass(), "last", null);
        setField(term15259, term15259.getClass(), "propListHead", null);
        setIntField(term15259, term15259.getClass(), "sourcePosition", 0);
        setField(term15259, term15259.getClass(), "jsType", null);
        setField(term15259, term15259.getClass(), "parent", null);
        term15217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15217, term15217.getClass(), "type", 101);
        setField(term15217, term15217.getClass(), "next", term15217);
        setField(term15217, term15217.getClass(), "first", term15217);
        setField(term15217, term15217.getClass(), "last", null);
        setField(term15217, term15217.getClass(), "propListHead", null);
        setIntField(term15217, term15217.getClass(), "sourcePosition", 0);
        setField(term15217, term15217.getClass(), "jsType", null);
        setField(term15217, term15217.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term15024;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term14954, args);
        assertTrue(recursiveEquals(term14954, term15258));
        assertTrue(recursiveEquals(term15024, term15259));
        assertTrue(recursiveEquals(retValue, term15217));
    }

};


