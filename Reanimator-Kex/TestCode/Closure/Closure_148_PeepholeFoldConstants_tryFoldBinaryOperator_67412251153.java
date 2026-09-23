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

public class PeepholeFoldConstants_tryFoldBinaryOperator_67412251153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8839;
     Object term8909;
     Object term9399;
     Object term9400;
     Object term9389;

    public PeepholeFoldConstants_tryFoldBinaryOperator_67412251153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8839 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term8909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term8909, term8909.getClass(), "first", term8909);
        setField(term8909, term8909.getClass(), "next", term8909);
        term9399 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term9399, term9399.getClass(), "currentTraversal", null);
        term9400 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9400, term9400.getClass(), "type", 0);
        setField(term9400, term9400.getClass(), "next", term9400);
        setField(term9400, term9400.getClass(), "first", term9400);
        setField(term9400, term9400.getClass(), "last", null);
        setField(term9400, term9400.getClass(), "propListHead", null);
        setIntField(term9400, term9400.getClass(), "sourcePosition", 0);
        setField(term9400, term9400.getClass(), "jsType", null);
        setField(term9400, term9400.getClass(), "parent", null);
        term9389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9389, term9389.getClass(), "type", 0);
        setField(term9389, term9389.getClass(), "next", term9389);
        setField(term9389, term9389.getClass(), "first", term9389);
        setField(term9389, term9389.getClass(), "last", null);
        setField(term9389, term9389.getClass(), "propListHead", null);
        setIntField(term9389, term9389.getClass(), "sourcePosition", 0);
        setField(term9389, term9389.getClass(), "jsType", null);
        setField(term9389, term9389.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term8909;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term8839, args);
        assertTrue(recursiveEquals(term8839, term9399));
        assertTrue(recursiveEquals(term8909, term9400));
        assertTrue(recursiveEquals(retValue, term9389));
    }

};


