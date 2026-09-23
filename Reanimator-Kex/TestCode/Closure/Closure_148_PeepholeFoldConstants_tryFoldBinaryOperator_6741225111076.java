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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111076 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251996;
     Object term252088;
     Object term253093;
     Object term253094;
     Object term253057;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111076() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term251996 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term252088 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term252180 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term252272 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term252180, term252180.getClass(), "next", term252272);
        setIntField(term252180, term252180.getClass(), "type", 39);
        setField(term252088, term252088.getClass(), "first", term252180);
        setIntField(term252088, term252088.getClass(), "type", 18);
        term253093 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term253093, term253093.getClass(), "currentTraversal", null);
        term253094 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term253095 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term253096 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term253094, term253094.getClass(), "number", 0.0);
        setIntField(term253094, term253094.getClass(), "type", 18);
        setField(term253094, term253094.getClass(), "next", null);
        setDoubleField(term253095, term253095.getClass(), "number", 0.0);
        setIntField(term253095, term253095.getClass(), "type", 39);
        setDoubleField(term253096, term253096.getClass(), "number", 0.0);
        setIntField(term253096, term253096.getClass(), "type", 0);
        setField(term253096, term253096.getClass(), "next", null);
        setField(term253096, term253096.getClass(), "first", null);
        setField(term253096, term253096.getClass(), "last", null);
        setField(term253096, term253096.getClass(), "propListHead", null);
        setIntField(term253096, term253096.getClass(), "sourcePosition", 0);
        setField(term253096, term253096.getClass(), "jsType", null);
        setField(term253096, term253096.getClass(), "parent", null);
        setField(term253095, term253095.getClass(), "next", term253096);
        setField(term253095, term253095.getClass(), "first", null);
        setField(term253095, term253095.getClass(), "last", null);
        setField(term253095, term253095.getClass(), "propListHead", null);
        setIntField(term253095, term253095.getClass(), "sourcePosition", 0);
        setField(term253095, term253095.getClass(), "jsType", null);
        setField(term253095, term253095.getClass(), "parent", null);
        setField(term253094, term253094.getClass(), "first", term253095);
        setField(term253094, term253094.getClass(), "last", null);
        setField(term253094, term253094.getClass(), "propListHead", null);
        setIntField(term253094, term253094.getClass(), "sourcePosition", 0);
        setField(term253094, term253094.getClass(), "jsType", null);
        setField(term253094, term253094.getClass(), "parent", null);
        term253057 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term253060 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term253063 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term253057, term253057.getClass(), "number", 0.0);
        setIntField(term253057, term253057.getClass(), "type", 18);
        setField(term253057, term253057.getClass(), "next", null);
        setDoubleField(term253060, term253060.getClass(), "number", 0.0);
        setIntField(term253060, term253060.getClass(), "type", 39);
        setDoubleField(term253063, term253063.getClass(), "number", 0.0);
        setIntField(term253063, term253063.getClass(), "type", 0);
        setField(term253063, term253063.getClass(), "next", null);
        setField(term253063, term253063.getClass(), "first", null);
        setField(term253063, term253063.getClass(), "last", null);
        setField(term253063, term253063.getClass(), "propListHead", null);
        setIntField(term253063, term253063.getClass(), "sourcePosition", 0);
        setField(term253063, term253063.getClass(), "jsType", null);
        setField(term253063, term253063.getClass(), "parent", null);
        setField(term253060, term253060.getClass(), "next", term253063);
        setField(term253060, term253060.getClass(), "first", null);
        setField(term253060, term253060.getClass(), "last", null);
        setField(term253060, term253060.getClass(), "propListHead", null);
        setIntField(term253060, term253060.getClass(), "sourcePosition", 0);
        setField(term253060, term253060.getClass(), "jsType", null);
        setField(term253060, term253060.getClass(), "parent", null);
        setField(term253057, term253057.getClass(), "first", term253060);
        setField(term253057, term253057.getClass(), "last", null);
        setField(term253057, term253057.getClass(), "propListHead", null);
        setIntField(term253057, term253057.getClass(), "sourcePosition", 0);
        setField(term253057, term253057.getClass(), "jsType", null);
        setField(term253057, term253057.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term252088;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term251996, args);
        assertTrue(recursiveEquals(term251996, term253093));
        assertTrue(recursiveEquals(term252088, term253094));
        assertTrue(recursiveEquals(retValue, term253057));
    }

};


