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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14116;
     Object term14186;
     Object term14405;
     Object term14406;
     Object term14380;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14116 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term14186 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term14186, term14186.getClass(), "first", term14186);
        setField(term14186, term14186.getClass(), "next", term14186);
        setIntField(term14186, term14186.getClass(), "type", 92);
        term14405 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setBooleanField(term14405, term14405.getClass(), "late", false);
        setField(term14405, term14405.getClass(), "compiler", null);
        term14406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14406, term14406.getClass(), "type", 92);
        setField(term14406, term14406.getClass(), "next", term14406);
        setField(term14406, term14406.getClass(), "first", term14406);
        setField(term14406, term14406.getClass(), "last", null);
        setField(term14406, term14406.getClass(), "propListHead", null);
        setIntField(term14406, term14406.getClass(), "sourcePosition", 0);
        setField(term14406, term14406.getClass(), "jsType", null);
        setField(term14406, term14406.getClass(), "parent", null);
        term14380 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14380, term14380.getClass(), "type", 92);
        setField(term14380, term14380.getClass(), "next", term14380);
        setField(term14380, term14380.getClass(), "first", term14380);
        setField(term14380, term14380.getClass(), "last", null);
        setField(term14380, term14380.getClass(), "propListHead", null);
        setIntField(term14380, term14380.getClass(), "sourcePosition", 0);
        setField(term14380, term14380.getClass(), "jsType", null);
        setField(term14380, term14380.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term14186;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term14116, args);
        assertTrue(recursiveEquals(term14116, term14405));
        assertTrue(recursiveEquals(term14186, term14406));
        assertTrue(recursiveEquals(retValue, term14380));
    }

};


