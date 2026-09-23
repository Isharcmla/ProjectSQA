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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511502 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134882;
     Object term134952;
     Object term135076;
     Object term135077;
     Object term135061;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511502() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134882 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term134952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term134952, term134952.getClass(), "first", term134952);
        setField(term134952, term134952.getClass(), "next", term134952);
        setIntField(term134952, term134952.getClass(), "type", 18);
        term135076 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term135076, term135076.getClass(), "currentTraversal", null);
        term135077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term135077, term135077.getClass(), "type", 18);
        setField(term135077, term135077.getClass(), "next", term135077);
        setField(term135077, term135077.getClass(), "first", term135077);
        setField(term135077, term135077.getClass(), "last", null);
        setField(term135077, term135077.getClass(), "propListHead", null);
        setIntField(term135077, term135077.getClass(), "sourcePosition", 0);
        setField(term135077, term135077.getClass(), "jsType", null);
        setField(term135077, term135077.getClass(), "parent", null);
        term135061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term135061, term135061.getClass(), "type", 18);
        setField(term135061, term135061.getClass(), "next", term135061);
        setField(term135061, term135061.getClass(), "first", term135061);
        setField(term135061, term135061.getClass(), "last", null);
        setField(term135061, term135061.getClass(), "propListHead", null);
        setIntField(term135061, term135061.getClass(), "sourcePosition", 0);
        setField(term135061, term135061.getClass(), "jsType", null);
        setField(term135061, term135061.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term134952;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term134882, args);
        assertTrue(recursiveEquals(term134882, term135076));
        assertTrue(recursiveEquals(term134952, term135077));
        assertTrue(recursiveEquals(retValue, term135061));
    }

};


