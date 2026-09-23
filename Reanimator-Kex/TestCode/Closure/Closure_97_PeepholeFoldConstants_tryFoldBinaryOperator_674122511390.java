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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90885;
     Object term90955;
     Object term90974;
     Object term90975;
     Object term90959;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90885 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term90955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term90955, term90955.getClass(), "first", term90955);
        setField(term90955, term90955.getClass(), "next", term90955);
        setIntField(term90955, term90955.getClass(), "type", 24);
        term90974 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term90974, term90974.getClass(), "currentTraversal", null);
        term90975 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term90975, term90975.getClass(), "type", 24);
        setField(term90975, term90975.getClass(), "next", term90975);
        setField(term90975, term90975.getClass(), "first", term90975);
        setField(term90975, term90975.getClass(), "last", null);
        setField(term90975, term90975.getClass(), "propListHead", null);
        setIntField(term90975, term90975.getClass(), "sourcePosition", 0);
        setField(term90975, term90975.getClass(), "jsType", null);
        setField(term90975, term90975.getClass(), "parent", null);
        term90959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term90959, term90959.getClass(), "type", 24);
        setField(term90959, term90959.getClass(), "next", term90959);
        setField(term90959, term90959.getClass(), "first", term90959);
        setField(term90959, term90959.getClass(), "last", null);
        setField(term90959, term90959.getClass(), "propListHead", null);
        setIntField(term90959, term90959.getClass(), "sourcePosition", 0);
        setField(term90959, term90959.getClass(), "jsType", null);
        setField(term90959, term90959.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term90955;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term90885, args);
        assertTrue(recursiveEquals(term90885, term90974));
        assertTrue(recursiveEquals(term90955, term90975));
        assertTrue(recursiveEquals(retValue, term90959));
    }

};


