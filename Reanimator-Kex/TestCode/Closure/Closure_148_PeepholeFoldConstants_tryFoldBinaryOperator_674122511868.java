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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201431;
     Object term201501;
     Object term201520;
     Object term201521;
     Object term201505;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term201431 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term201501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term201501, term201501.getClass(), "first", term201501);
        setField(term201501, term201501.getClass(), "next", term201501);
        setIntField(term201501, term201501.getClass(), "type", 23);
        term201520 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term201520, term201520.getClass(), "currentTraversal", null);
        term201521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term201521, term201521.getClass(), "type", 23);
        setField(term201521, term201521.getClass(), "next", term201521);
        setField(term201521, term201521.getClass(), "first", term201521);
        setField(term201521, term201521.getClass(), "last", null);
        setField(term201521, term201521.getClass(), "propListHead", null);
        setIntField(term201521, term201521.getClass(), "sourcePosition", 0);
        setField(term201521, term201521.getClass(), "jsType", null);
        setField(term201521, term201521.getClass(), "parent", null);
        term201505 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term201505, term201505.getClass(), "type", 23);
        setField(term201505, term201505.getClass(), "next", term201505);
        setField(term201505, term201505.getClass(), "first", term201505);
        setField(term201505, term201505.getClass(), "last", null);
        setField(term201505, term201505.getClass(), "propListHead", null);
        setIntField(term201505, term201505.getClass(), "sourcePosition", 0);
        setField(term201505, term201505.getClass(), "jsType", null);
        setField(term201505, term201505.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term201501;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term201431, args);
        assertTrue(recursiveEquals(term201431, term201520));
        assertTrue(recursiveEquals(term201501, term201521));
        assertTrue(recursiveEquals(retValue, term201505));
    }

};


