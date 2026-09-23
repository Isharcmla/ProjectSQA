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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168899;
     Object term168969;
     Object term169520;
     Object term169521;
     Object term169487;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168899 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term168969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term169039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term169109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term169039, term169039.getClass(), "next", term169109);
        setIntField(term169039, term169039.getClass(), "type", 39);
        setField(term168969, term168969.getClass(), "first", term169039);
        setIntField(term168969, term168969.getClass(), "type", 11);
        term169520 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term169520, term169520.getClass(), "currentTraversal", null);
        term169521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term169522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term169523 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term169521, term169521.getClass(), "type", 11);
        setField(term169521, term169521.getClass(), "next", null);
        setIntField(term169522, term169522.getClass(), "type", 39);
        setIntField(term169523, term169523.getClass(), "type", 0);
        setField(term169523, term169523.getClass(), "next", null);
        setField(term169523, term169523.getClass(), "first", null);
        setField(term169523, term169523.getClass(), "last", null);
        setField(term169523, term169523.getClass(), "propListHead", null);
        setIntField(term169523, term169523.getClass(), "sourcePosition", 0);
        setField(term169523, term169523.getClass(), "jsType", null);
        setField(term169523, term169523.getClass(), "parent", null);
        setField(term169522, term169522.getClass(), "next", term169523);
        setField(term169522, term169522.getClass(), "first", null);
        setField(term169522, term169522.getClass(), "last", null);
        setField(term169522, term169522.getClass(), "propListHead", null);
        setIntField(term169522, term169522.getClass(), "sourcePosition", 0);
        setField(term169522, term169522.getClass(), "jsType", null);
        setField(term169522, term169522.getClass(), "parent", null);
        setField(term169521, term169521.getClass(), "first", term169522);
        setField(term169521, term169521.getClass(), "last", null);
        setField(term169521, term169521.getClass(), "propListHead", null);
        setIntField(term169521, term169521.getClass(), "sourcePosition", 0);
        setField(term169521, term169521.getClass(), "jsType", null);
        setField(term169521, term169521.getClass(), "parent", null);
        term169487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term169489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term169491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term169487, term169487.getClass(), "type", 11);
        setField(term169487, term169487.getClass(), "next", null);
        setIntField(term169489, term169489.getClass(), "type", 39);
        setIntField(term169491, term169491.getClass(), "type", 0);
        setField(term169491, term169491.getClass(), "next", null);
        setField(term169491, term169491.getClass(), "first", null);
        setField(term169491, term169491.getClass(), "last", null);
        setField(term169491, term169491.getClass(), "propListHead", null);
        setIntField(term169491, term169491.getClass(), "sourcePosition", 0);
        setField(term169491, term169491.getClass(), "jsType", null);
        setField(term169491, term169491.getClass(), "parent", null);
        setField(term169489, term169489.getClass(), "next", term169491);
        setField(term169489, term169489.getClass(), "first", null);
        setField(term169489, term169489.getClass(), "last", null);
        setField(term169489, term169489.getClass(), "propListHead", null);
        setIntField(term169489, term169489.getClass(), "sourcePosition", 0);
        setField(term169489, term169489.getClass(), "jsType", null);
        setField(term169489, term169489.getClass(), "parent", null);
        setField(term169487, term169487.getClass(), "first", term169489);
        setField(term169487, term169487.getClass(), "last", null);
        setField(term169487, term169487.getClass(), "propListHead", null);
        setIntField(term169487, term169487.getClass(), "sourcePosition", 0);
        setField(term169487, term169487.getClass(), "jsType", null);
        setField(term169487, term169487.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term168969;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term168899, args);
        assertTrue(recursiveEquals(term168899, term169520));
        assertTrue(recursiveEquals(term168969, term169521));
        assertTrue(recursiveEquals(retValue, term169487));
    }

};


