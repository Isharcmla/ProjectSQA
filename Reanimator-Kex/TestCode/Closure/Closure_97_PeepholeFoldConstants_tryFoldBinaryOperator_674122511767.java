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
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219745;
     Object term219815;
     Object term220550;
     Object term220551;
     Object term220521;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term219745 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term219815 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term219885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term219955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term219885, term219885.getClass(), "next", term219955);
        setIntField(term219885, term219885.getClass(), "type", 39);
        setField(term219815, term219815.getClass(), "first", term219885);
        setIntField(term219815, term219815.getClass(), "type", 24);
        term220550 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term220550, term220550.getClass(), "currentTraversal", null);
        term220551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term220552 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term220553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term220551, term220551.getClass(), "type", 24);
        setField(term220551, term220551.getClass(), "next", null);
        setIntField(term220552, term220552.getClass(), "type", 39);
        setIntField(term220553, term220553.getClass(), "type", 0);
        setField(term220553, term220553.getClass(), "next", null);
        setField(term220553, term220553.getClass(), "first", null);
        setField(term220553, term220553.getClass(), "last", null);
        setField(term220553, term220553.getClass(), "propListHead", null);
        setIntField(term220553, term220553.getClass(), "sourcePosition", 0);
        setField(term220553, term220553.getClass(), "jsType", null);
        setField(term220553, term220553.getClass(), "parent", null);
        setField(term220552, term220552.getClass(), "next", term220553);
        setField(term220552, term220552.getClass(), "first", null);
        setField(term220552, term220552.getClass(), "last", null);
        setField(term220552, term220552.getClass(), "propListHead", null);
        setIntField(term220552, term220552.getClass(), "sourcePosition", 0);
        setField(term220552, term220552.getClass(), "jsType", null);
        setField(term220552, term220552.getClass(), "parent", null);
        setField(term220551, term220551.getClass(), "first", term220552);
        setField(term220551, term220551.getClass(), "last", null);
        setField(term220551, term220551.getClass(), "propListHead", null);
        setIntField(term220551, term220551.getClass(), "sourcePosition", 0);
        setField(term220551, term220551.getClass(), "jsType", null);
        setField(term220551, term220551.getClass(), "parent", null);
        term220521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term220523 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term220525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term220521, term220521.getClass(), "type", 24);
        setField(term220521, term220521.getClass(), "next", null);
        setIntField(term220523, term220523.getClass(), "type", 39);
        setIntField(term220525, term220525.getClass(), "type", 0);
        setField(term220525, term220525.getClass(), "next", null);
        setField(term220525, term220525.getClass(), "first", null);
        setField(term220525, term220525.getClass(), "last", null);
        setField(term220525, term220525.getClass(), "propListHead", null);
        setIntField(term220525, term220525.getClass(), "sourcePosition", 0);
        setField(term220525, term220525.getClass(), "jsType", null);
        setField(term220525, term220525.getClass(), "parent", null);
        setField(term220523, term220523.getClass(), "next", term220525);
        setField(term220523, term220523.getClass(), "first", null);
        setField(term220523, term220523.getClass(), "last", null);
        setField(term220523, term220523.getClass(), "propListHead", null);
        setIntField(term220523, term220523.getClass(), "sourcePosition", 0);
        setField(term220523, term220523.getClass(), "jsType", null);
        setField(term220523, term220523.getClass(), "parent", null);
        setField(term220521, term220521.getClass(), "first", term220523);
        setField(term220521, term220521.getClass(), "last", null);
        setField(term220521, term220521.getClass(), "propListHead", null);
        setIntField(term220521, term220521.getClass(), "sourcePosition", 0);
        setField(term220521, term220521.getClass(), "jsType", null);
        setField(term220521, term220521.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term219815;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term219745, args);
        assertTrue(recursiveEquals(term219745, term220550));
        assertTrue(recursiveEquals(term219815, term220551));
        assertTrue(recursiveEquals(retValue, term220521));
    }

};


