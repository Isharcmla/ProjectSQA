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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27858;
     Object term27928;
     Object term27974;
     Object term27975;
     Object term27959;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27858 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term27928 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term27928, term27928.getClass(), "first", term27928);
        setField(term27928, term27928.getClass(), "next", term27928);
        setIntField(term27928, term27928.getClass(), "type", 24);
        term27974 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term27974, term27974.getClass(), "currentTraversal", null);
        term27975 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27975, term27975.getClass(), "type", 24);
        setField(term27975, term27975.getClass(), "next", term27975);
        setField(term27975, term27975.getClass(), "first", term27975);
        setField(term27975, term27975.getClass(), "last", null);
        setField(term27975, term27975.getClass(), "propListHead", null);
        setIntField(term27975, term27975.getClass(), "sourcePosition", 0);
        setField(term27975, term27975.getClass(), "jsType", null);
        setField(term27975, term27975.getClass(), "parent", null);
        term27959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27959, term27959.getClass(), "type", 24);
        setField(term27959, term27959.getClass(), "next", term27959);
        setField(term27959, term27959.getClass(), "first", term27959);
        setField(term27959, term27959.getClass(), "last", null);
        setField(term27959, term27959.getClass(), "propListHead", null);
        setIntField(term27959, term27959.getClass(), "sourcePosition", 0);
        setField(term27959, term27959.getClass(), "jsType", null);
        setField(term27959, term27959.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term27928;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term27858, args);
        assertTrue(recursiveEquals(term27858, term27974));
        assertTrue(recursiveEquals(term27928, term27975));
        assertTrue(recursiveEquals(retValue, term27959));
    }

};


