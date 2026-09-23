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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171223;
     Object term171315;
     Object term172056;
     Object term172057;
     Object term172014;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term171223 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term171315 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term171407 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term171499 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term171407, term171407.getClass(), "next", term171499);
        setIntField(term171407, term171407.getClass(), "type", 39);
        setField(term171315, term171315.getClass(), "first", term171407);
        setIntField(term171315, term171315.getClass(), "type", 9);
        term172056 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term172056, term172056.getClass(), "currentTraversal", null);
        term172057 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term172058 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term172059 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term172057, term172057.getClass(), "number", 0.0);
        setIntField(term172057, term172057.getClass(), "type", 9);
        setField(term172057, term172057.getClass(), "next", null);
        setDoubleField(term172058, term172058.getClass(), "number", 0.0);
        setIntField(term172058, term172058.getClass(), "type", 39);
        setDoubleField(term172059, term172059.getClass(), "number", 0.0);
        setIntField(term172059, term172059.getClass(), "type", 0);
        setField(term172059, term172059.getClass(), "next", null);
        setField(term172059, term172059.getClass(), "first", null);
        setField(term172059, term172059.getClass(), "last", null);
        setField(term172059, term172059.getClass(), "propListHead", null);
        setIntField(term172059, term172059.getClass(), "sourcePosition", 0);
        setField(term172059, term172059.getClass(), "jsType", null);
        setField(term172059, term172059.getClass(), "parent", null);
        setField(term172058, term172058.getClass(), "next", term172059);
        setField(term172058, term172058.getClass(), "first", null);
        setField(term172058, term172058.getClass(), "last", null);
        setField(term172058, term172058.getClass(), "propListHead", null);
        setIntField(term172058, term172058.getClass(), "sourcePosition", 0);
        setField(term172058, term172058.getClass(), "jsType", null);
        setField(term172058, term172058.getClass(), "parent", null);
        setField(term172057, term172057.getClass(), "first", term172058);
        setField(term172057, term172057.getClass(), "last", null);
        setField(term172057, term172057.getClass(), "propListHead", null);
        setIntField(term172057, term172057.getClass(), "sourcePosition", 0);
        setField(term172057, term172057.getClass(), "jsType", null);
        setField(term172057, term172057.getClass(), "parent", null);
        term172014 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term172017 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term172020 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term172014, term172014.getClass(), "number", 0.0);
        setIntField(term172014, term172014.getClass(), "type", 9);
        setField(term172014, term172014.getClass(), "next", null);
        setDoubleField(term172017, term172017.getClass(), "number", 0.0);
        setIntField(term172017, term172017.getClass(), "type", 39);
        setDoubleField(term172020, term172020.getClass(), "number", 0.0);
        setIntField(term172020, term172020.getClass(), "type", 0);
        setField(term172020, term172020.getClass(), "next", null);
        setField(term172020, term172020.getClass(), "first", null);
        setField(term172020, term172020.getClass(), "last", null);
        setField(term172020, term172020.getClass(), "propListHead", null);
        setIntField(term172020, term172020.getClass(), "sourcePosition", 0);
        setField(term172020, term172020.getClass(), "jsType", null);
        setField(term172020, term172020.getClass(), "parent", null);
        setField(term172017, term172017.getClass(), "next", term172020);
        setField(term172017, term172017.getClass(), "first", null);
        setField(term172017, term172017.getClass(), "last", null);
        setField(term172017, term172017.getClass(), "propListHead", null);
        setIntField(term172017, term172017.getClass(), "sourcePosition", 0);
        setField(term172017, term172017.getClass(), "jsType", null);
        setField(term172017, term172017.getClass(), "parent", null);
        setField(term172014, term172014.getClass(), "first", term172017);
        setField(term172014, term172014.getClass(), "last", null);
        setField(term172014, term172014.getClass(), "propListHead", null);
        setIntField(term172014, term172014.getClass(), "sourcePosition", 0);
        setField(term172014, term172014.getClass(), "jsType", null);
        setField(term172014, term172014.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term171315;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term171223, args);
        assertTrue(recursiveEquals(term171223, term172056));
        assertTrue(recursiveEquals(term171315, term172057));
        assertTrue(recursiveEquals(retValue, term172014));
    }

};


