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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511804 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231643;
     Object term231713;
     Object term231889;
     Object term231890;
     Object term231860;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511804() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term231643 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term231713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term231783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term231853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term231783, term231783.getClass(), "next", term231853);
        setIntField(term231783, term231783.getClass(), "type", 39);
        setField(term231713, term231713.getClass(), "first", term231783);
        setIntField(term231713, term231713.getClass(), "type", 18);
        term231889 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term231889, term231889.getClass(), "currentTraversal", null);
        term231890 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term231891 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term231892 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term231890, term231890.getClass(), "type", 18);
        setField(term231890, term231890.getClass(), "next", null);
        setIntField(term231891, term231891.getClass(), "type", 39);
        setIntField(term231892, term231892.getClass(), "type", 0);
        setField(term231892, term231892.getClass(), "next", null);
        setField(term231892, term231892.getClass(), "first", null);
        setField(term231892, term231892.getClass(), "last", null);
        setField(term231892, term231892.getClass(), "propListHead", null);
        setIntField(term231892, term231892.getClass(), "sourcePosition", 0);
        setField(term231892, term231892.getClass(), "jsType", null);
        setField(term231892, term231892.getClass(), "parent", null);
        setField(term231891, term231891.getClass(), "next", term231892);
        setField(term231891, term231891.getClass(), "first", null);
        setField(term231891, term231891.getClass(), "last", null);
        setField(term231891, term231891.getClass(), "propListHead", null);
        setIntField(term231891, term231891.getClass(), "sourcePosition", 0);
        setField(term231891, term231891.getClass(), "jsType", null);
        setField(term231891, term231891.getClass(), "parent", null);
        setField(term231890, term231890.getClass(), "first", term231891);
        setField(term231890, term231890.getClass(), "last", null);
        setField(term231890, term231890.getClass(), "propListHead", null);
        setIntField(term231890, term231890.getClass(), "sourcePosition", 0);
        setField(term231890, term231890.getClass(), "jsType", null);
        setField(term231890, term231890.getClass(), "parent", null);
        term231860 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term231862 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term231864 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term231860, term231860.getClass(), "type", 18);
        setField(term231860, term231860.getClass(), "next", null);
        setIntField(term231862, term231862.getClass(), "type", 39);
        setIntField(term231864, term231864.getClass(), "type", 0);
        setField(term231864, term231864.getClass(), "next", null);
        setField(term231864, term231864.getClass(), "first", null);
        setField(term231864, term231864.getClass(), "last", null);
        setField(term231864, term231864.getClass(), "propListHead", null);
        setIntField(term231864, term231864.getClass(), "sourcePosition", 0);
        setField(term231864, term231864.getClass(), "jsType", null);
        setField(term231864, term231864.getClass(), "parent", null);
        setField(term231862, term231862.getClass(), "next", term231864);
        setField(term231862, term231862.getClass(), "first", null);
        setField(term231862, term231862.getClass(), "last", null);
        setField(term231862, term231862.getClass(), "propListHead", null);
        setIntField(term231862, term231862.getClass(), "sourcePosition", 0);
        setField(term231862, term231862.getClass(), "jsType", null);
        setField(term231862, term231862.getClass(), "parent", null);
        setField(term231860, term231860.getClass(), "first", term231862);
        setField(term231860, term231860.getClass(), "last", null);
        setField(term231860, term231860.getClass(), "propListHead", null);
        setIntField(term231860, term231860.getClass(), "sourcePosition", 0);
        setField(term231860, term231860.getClass(), "jsType", null);
        setField(term231860, term231860.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term231713;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term231643, args);
        assertTrue(recursiveEquals(term231643, term231889));
        assertTrue(recursiveEquals(term231713, term231890));
        assertTrue(recursiveEquals(retValue, term231860));
    }

};


