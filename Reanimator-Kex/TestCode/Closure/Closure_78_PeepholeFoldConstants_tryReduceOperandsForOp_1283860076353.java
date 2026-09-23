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

public class PeepholeFoldConstants_tryReduceOperandsForOp_1283860076353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81792;
     Object term81862;
     Object term93105;
     Object term93106;

    public PeepholeFoldConstants_tryReduceOperandsForOp_1283860076353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81792 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term81862 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term81862, term81862.getClass(), "type", 11);
        term93105 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term93105, term93105.getClass(), "currentTraversal", null);
        term93106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term93106, term93106.getClass(), "type", 11);
        setField(term93106, term93106.getClass(), "next", null);
        setField(term93106, term93106.getClass(), "first", null);
        setField(term93106, term93106.getClass(), "last", null);
        setField(term93106, term93106.getClass(), "propListHead", null);
        setIntField(term93106, term93106.getClass(), "sourcePosition", 0);
        setField(term93106, term93106.getClass(), "jsType", null);
        setField(term93106, term93106.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term81862;
        callMethod(klass, "tryReduceOperandsForOp", argTypes, term81792, args);
        assertTrue(recursiveEquals(term81792, term93105));
        assertTrue(recursiveEquals(term81862, term93106));
    }

};


