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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48319;
     Object term48389;
     Object term62871;
     Object term62872;
     Object term62843;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48319 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term48389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term48389, term48389.getClass(), "first", term48389);
        setField(term48389, term48389.getClass(), "next", term48389);
        setIntField(term48389, term48389.getClass(), "type", 100);
        term62871 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term62871, term62871.getClass(), "currentTraversal", null);
        term62872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term62872, term62872.getClass(), "type", 100);
        setField(term62872, term62872.getClass(), "next", term62872);
        setField(term62872, term62872.getClass(), "first", term62872);
        setField(term62872, term62872.getClass(), "last", null);
        setField(term62872, term62872.getClass(), "propListHead", null);
        setIntField(term62872, term62872.getClass(), "sourcePosition", 0);
        setField(term62872, term62872.getClass(), "jsType", null);
        setField(term62872, term62872.getClass(), "parent", null);
        term62843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term62843, term62843.getClass(), "type", 100);
        setField(term62843, term62843.getClass(), "next", term62843);
        setField(term62843, term62843.getClass(), "first", term62843);
        setField(term62843, term62843.getClass(), "last", null);
        setField(term62843, term62843.getClass(), "propListHead", null);
        setIntField(term62843, term62843.getClass(), "sourcePosition", 0);
        setField(term62843, term62843.getClass(), "jsType", null);
        setField(term62843, term62843.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term48389;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term48319, args);
        assertTrue(recursiveEquals(term48319, term62871));
        assertTrue(recursiveEquals(term48389, term62872));
        assertTrue(recursiveEquals(retValue, term62843));
    }

};


