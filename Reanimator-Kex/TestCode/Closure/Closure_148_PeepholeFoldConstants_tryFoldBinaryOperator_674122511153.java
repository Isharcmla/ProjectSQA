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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27585;
     Object term27655;
     Object term27954;
     Object term27955;
     Object term27932;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27585 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term27655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term27655, term27655.getClass(), "first", term27655);
        setField(term27655, term27655.getClass(), "next", term27655);
        setIntField(term27655, term27655.getClass(), "type", 13);
        term27954 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term27954, term27954.getClass(), "currentTraversal", null);
        term27955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27955, term27955.getClass(), "type", 13);
        setField(term27955, term27955.getClass(), "next", term27955);
        setField(term27955, term27955.getClass(), "first", term27955);
        setField(term27955, term27955.getClass(), "last", null);
        setField(term27955, term27955.getClass(), "propListHead", null);
        setIntField(term27955, term27955.getClass(), "sourcePosition", 0);
        setField(term27955, term27955.getClass(), "jsType", null);
        setField(term27955, term27955.getClass(), "parent", null);
        term27932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27932, term27932.getClass(), "type", 13);
        setField(term27932, term27932.getClass(), "next", term27932);
        setField(term27932, term27932.getClass(), "first", term27932);
        setField(term27932, term27932.getClass(), "last", null);
        setField(term27932, term27932.getClass(), "propListHead", null);
        setIntField(term27932, term27932.getClass(), "sourcePosition", 0);
        setField(term27932, term27932.getClass(), "jsType", null);
        setField(term27932, term27932.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term27655;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term27585, args);
        assertTrue(recursiveEquals(term27585, term27954));
        assertTrue(recursiveEquals(term27655, term27955));
        assertTrue(recursiveEquals(retValue, term27932));
    }

};


