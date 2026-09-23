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

public class PeepholeFoldConstants_tryFoldBinaryOperator_67412251192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16562;
     Object term16632;
     Object term16914;
     Object term16915;
     Object term16904;

    public PeepholeFoldConstants_tryFoldBinaryOperator_67412251192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16562 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term16632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term16632, term16632.getClass(), "first", term16632);
        setField(term16632, term16632.getClass(), "next", term16632);
        term16914 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term16914, term16914.getClass(), "currentTraversal", null);
        term16915 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16915, term16915.getClass(), "type", 0);
        setField(term16915, term16915.getClass(), "next", term16915);
        setField(term16915, term16915.getClass(), "first", term16915);
        setField(term16915, term16915.getClass(), "last", null);
        setField(term16915, term16915.getClass(), "propListHead", null);
        setIntField(term16915, term16915.getClass(), "sourcePosition", 0);
        setField(term16915, term16915.getClass(), "jsType", null);
        setField(term16915, term16915.getClass(), "parent", null);
        term16904 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16904, term16904.getClass(), "type", 0);
        setField(term16904, term16904.getClass(), "next", term16904);
        setField(term16904, term16904.getClass(), "first", term16904);
        setField(term16904, term16904.getClass(), "last", null);
        setField(term16904, term16904.getClass(), "propListHead", null);
        setIntField(term16904, term16904.getClass(), "sourcePosition", 0);
        setField(term16904, term16904.getClass(), "jsType", null);
        setField(term16904, term16904.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term16632;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term16562, args);
        assertTrue(recursiveEquals(term16562, term16914));
        assertTrue(recursiveEquals(term16632, term16915));
        assertTrue(recursiveEquals(retValue, term16904));
    }

};


