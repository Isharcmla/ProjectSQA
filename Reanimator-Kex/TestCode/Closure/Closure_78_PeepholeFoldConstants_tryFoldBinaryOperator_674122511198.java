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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32407;
     Object term32477;
     Object term32785;
     Object term32786;
     Object term32775;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32407 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term32477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term32477, term32477.getClass(), "first", term32477);
        setField(term32477, term32477.getClass(), "next", term32477);
        term32785 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term32785, term32785.getClass(), "currentTraversal", null);
        term32786 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32786, term32786.getClass(), "type", 0);
        setField(term32786, term32786.getClass(), "next", term32786);
        setField(term32786, term32786.getClass(), "first", term32786);
        setField(term32786, term32786.getClass(), "last", null);
        setField(term32786, term32786.getClass(), "propListHead", null);
        setIntField(term32786, term32786.getClass(), "sourcePosition", 0);
        setField(term32786, term32786.getClass(), "jsType", null);
        setField(term32786, term32786.getClass(), "parent", null);
        term32775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32775, term32775.getClass(), "type", 0);
        setField(term32775, term32775.getClass(), "next", term32775);
        setField(term32775, term32775.getClass(), "first", term32775);
        setField(term32775, term32775.getClass(), "last", null);
        setField(term32775, term32775.getClass(), "propListHead", null);
        setIntField(term32775, term32775.getClass(), "sourcePosition", 0);
        setField(term32775, term32775.getClass(), "jsType", null);
        setField(term32775, term32775.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term32477;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term32407, args);
        assertTrue(recursiveEquals(term32407, term32785));
        assertTrue(recursiveEquals(term32477, term32786));
        assertTrue(recursiveEquals(retValue, term32775));
    }

};


