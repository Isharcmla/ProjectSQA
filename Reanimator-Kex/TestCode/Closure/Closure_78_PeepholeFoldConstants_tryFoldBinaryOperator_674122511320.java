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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49792;
     Object term49862;
     Object term63266;
     Object term63267;
     Object term63243;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49792 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term49862 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term49862, term49862.getClass(), "first", term49862);
        setField(term49862, term49862.getClass(), "next", term49862);
        setIntField(term49862, term49862.getClass(), "type", 45);
        term63266 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term63266, term63266.getClass(), "currentTraversal", null);
        term63267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term63267, term63267.getClass(), "type", 45);
        setField(term63267, term63267.getClass(), "next", term63267);
        setField(term63267, term63267.getClass(), "first", term63267);
        setField(term63267, term63267.getClass(), "last", null);
        setField(term63267, term63267.getClass(), "propListHead", null);
        setIntField(term63267, term63267.getClass(), "sourcePosition", 0);
        setField(term63267, term63267.getClass(), "jsType", null);
        setField(term63267, term63267.getClass(), "parent", null);
        term63243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term63243, term63243.getClass(), "type", 45);
        setField(term63243, term63243.getClass(), "next", term63243);
        setField(term63243, term63243.getClass(), "first", term63243);
        setField(term63243, term63243.getClass(), "last", null);
        setField(term63243, term63243.getClass(), "propListHead", null);
        setIntField(term63243, term63243.getClass(), "sourcePosition", 0);
        setField(term63243, term63243.getClass(), "jsType", null);
        setField(term63243, term63243.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term49862;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term49792, args);
        assertTrue(recursiveEquals(term49792, term63266));
        assertTrue(recursiveEquals(term49862, term63267));
        assertTrue(recursiveEquals(retValue, term63243));
    }

};


