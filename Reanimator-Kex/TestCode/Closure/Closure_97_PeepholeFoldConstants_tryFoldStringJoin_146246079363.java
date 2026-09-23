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

public class PeepholeFoldConstants_tryFoldStringJoin_146246079363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10978;
     Object term11048;
     Object term11243;
     Object term11244;
     Object term11238;

    public PeepholeFoldConstants_tryFoldStringJoin_146246079363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10978 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term11048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term11048, term11048.getClass(), "first", null);
        term11243 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term11243, term11243.getClass(), "currentTraversal", null);
        term11244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11244, term11244.getClass(), "type", 0);
        setField(term11244, term11244.getClass(), "next", null);
        setField(term11244, term11244.getClass(), "first", null);
        setField(term11244, term11244.getClass(), "last", null);
        setField(term11244, term11244.getClass(), "propListHead", null);
        setIntField(term11244, term11244.getClass(), "sourcePosition", 0);
        setField(term11244, term11244.getClass(), "jsType", null);
        setField(term11244, term11244.getClass(), "parent", null);
        term11238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11238, term11238.getClass(), "type", 0);
        setField(term11238, term11238.getClass(), "next", null);
        setField(term11238, term11238.getClass(), "first", null);
        setField(term11238, term11238.getClass(), "last", null);
        setField(term11238, term11238.getClass(), "propListHead", null);
        setIntField(term11238, term11238.getClass(), "sourcePosition", 0);
        setField(term11238, term11238.getClass(), "jsType", null);
        setField(term11238, term11238.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term11048;
        Object retValue = callMethod(klass, "tryFoldStringJoin", argTypes, term10978, args);
        assertTrue(recursiveEquals(term10978, term11243));
        assertTrue(recursiveEquals(term11048, term11244));
        assertTrue(recursiveEquals(retValue, term11238));
    }

};


