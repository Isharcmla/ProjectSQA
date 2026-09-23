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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44555;
     Object term44625;
     Object term44926;
     Object term44927;
     Object term44911;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44555 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term44625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term44625, term44625.getClass(), "first", term44625);
        setField(term44625, term44625.getClass(), "next", term44625);
        setIntField(term44625, term44625.getClass(), "type", 18);
        term44926 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term44926, term44926.getClass(), "currentTraversal", null);
        term44927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44927, term44927.getClass(), "type", 18);
        setField(term44927, term44927.getClass(), "next", term44927);
        setField(term44927, term44927.getClass(), "first", term44927);
        setField(term44927, term44927.getClass(), "last", null);
        setField(term44927, term44927.getClass(), "propListHead", null);
        setIntField(term44927, term44927.getClass(), "sourcePosition", 0);
        setField(term44927, term44927.getClass(), "jsType", null);
        setField(term44927, term44927.getClass(), "parent", null);
        term44911 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44911, term44911.getClass(), "type", 18);
        setField(term44911, term44911.getClass(), "next", term44911);
        setField(term44911, term44911.getClass(), "first", term44911);
        setField(term44911, term44911.getClass(), "last", null);
        setField(term44911, term44911.getClass(), "propListHead", null);
        setIntField(term44911, term44911.getClass(), "sourcePosition", 0);
        setField(term44911, term44911.getClass(), "jsType", null);
        setField(term44911, term44911.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term44625;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term44555, args);
        assertTrue(recursiveEquals(term44555, term44926));
        assertTrue(recursiveEquals(term44625, term44927));
        assertTrue(recursiveEquals(retValue, term44911));
    }

};


