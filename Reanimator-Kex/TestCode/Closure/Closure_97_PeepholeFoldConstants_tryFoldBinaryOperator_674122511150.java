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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28882;
     Object term28952;
     Object term29532;
     Object term29533;
     Object term29491;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28882 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term28952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term28952, term28952.getClass(), "first", term28952);
        setField(term28952, term28952.getClass(), "next", term28952);
        setIntField(term28952, term28952.getClass(), "type", 101);
        term29532 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term29532, term29532.getClass(), "currentTraversal", null);
        term29533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29533, term29533.getClass(), "type", 101);
        setField(term29533, term29533.getClass(), "next", term29533);
        setField(term29533, term29533.getClass(), "first", term29533);
        setField(term29533, term29533.getClass(), "last", null);
        setField(term29533, term29533.getClass(), "propListHead", null);
        setIntField(term29533, term29533.getClass(), "sourcePosition", 0);
        setField(term29533, term29533.getClass(), "jsType", null);
        setField(term29533, term29533.getClass(), "parent", null);
        term29491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29491, term29491.getClass(), "type", 101);
        setField(term29491, term29491.getClass(), "next", term29491);
        setField(term29491, term29491.getClass(), "first", term29491);
        setField(term29491, term29491.getClass(), "last", null);
        setField(term29491, term29491.getClass(), "propListHead", null);
        setIntField(term29491, term29491.getClass(), "sourcePosition", 0);
        setField(term29491, term29491.getClass(), "jsType", null);
        setField(term29491, term29491.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term28952;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term28882, args);
        assertTrue(recursiveEquals(term28882, term29532));
        assertTrue(recursiveEquals(term28952, term29533));
        assertTrue(recursiveEquals(retValue, term29491));
    }

};


