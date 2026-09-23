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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term340747;
     Object term340839;
     Object term341057;
     Object term341058;
     Object term341030;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term340747 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term340839 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term340931 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term341023 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term340931, term340931.getClass(), "next", term341023);
        setField(term340839, term340839.getClass(), "first", term340931);
        setIntField(term340839, term340839.getClass(), "type", 18);
        term341057 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term341057, term341057.getClass(), "currentTraversal", null);
        term341058 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term341059 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term341060 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term341058, term341058.getClass(), "str", null);
        setIntField(term341058, term341058.getClass(), "type", 18);
        setField(term341058, term341058.getClass(), "next", null);
        setField(term341059, term341059.getClass(), "str", null);
        setIntField(term341059, term341059.getClass(), "type", 0);
        setField(term341060, term341060.getClass(), "str", null);
        setIntField(term341060, term341060.getClass(), "type", 0);
        setField(term341060, term341060.getClass(), "next", null);
        setField(term341060, term341060.getClass(), "first", null);
        setField(term341060, term341060.getClass(), "last", null);
        setField(term341060, term341060.getClass(), "propListHead", null);
        setIntField(term341060, term341060.getClass(), "sourcePosition", 0);
        setField(term341060, term341060.getClass(), "jsType", null);
        setField(term341060, term341060.getClass(), "parent", null);
        setField(term341059, term341059.getClass(), "next", term341060);
        setField(term341059, term341059.getClass(), "first", null);
        setField(term341059, term341059.getClass(), "last", null);
        setField(term341059, term341059.getClass(), "propListHead", null);
        setIntField(term341059, term341059.getClass(), "sourcePosition", 0);
        setField(term341059, term341059.getClass(), "jsType", null);
        setField(term341059, term341059.getClass(), "parent", null);
        setField(term341058, term341058.getClass(), "first", term341059);
        setField(term341058, term341058.getClass(), "last", null);
        setField(term341058, term341058.getClass(), "propListHead", null);
        setIntField(term341058, term341058.getClass(), "sourcePosition", 0);
        setField(term341058, term341058.getClass(), "jsType", null);
        setField(term341058, term341058.getClass(), "parent", null);
        term341030 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term341032 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term341034 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term341030, term341030.getClass(), "str", null);
        setIntField(term341030, term341030.getClass(), "type", 18);
        setField(term341030, term341030.getClass(), "next", null);
        setField(term341032, term341032.getClass(), "str", null);
        setIntField(term341032, term341032.getClass(), "type", 0);
        setField(term341034, term341034.getClass(), "str", null);
        setIntField(term341034, term341034.getClass(), "type", 0);
        setField(term341034, term341034.getClass(), "next", null);
        setField(term341034, term341034.getClass(), "first", null);
        setField(term341034, term341034.getClass(), "last", null);
        setField(term341034, term341034.getClass(), "propListHead", null);
        setIntField(term341034, term341034.getClass(), "sourcePosition", 0);
        setField(term341034, term341034.getClass(), "jsType", null);
        setField(term341034, term341034.getClass(), "parent", null);
        setField(term341032, term341032.getClass(), "next", term341034);
        setField(term341032, term341032.getClass(), "first", null);
        setField(term341032, term341032.getClass(), "last", null);
        setField(term341032, term341032.getClass(), "propListHead", null);
        setIntField(term341032, term341032.getClass(), "sourcePosition", 0);
        setField(term341032, term341032.getClass(), "jsType", null);
        setField(term341032, term341032.getClass(), "parent", null);
        setField(term341030, term341030.getClass(), "first", term341032);
        setField(term341030, term341030.getClass(), "last", null);
        setField(term341030, term341030.getClass(), "propListHead", null);
        setIntField(term341030, term341030.getClass(), "sourcePosition", 0);
        setField(term341030, term341030.getClass(), "jsType", null);
        setField(term341030, term341030.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term340839;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term340747, args);
        assertTrue(recursiveEquals(term340747, term341057));
        assertTrue(recursiveEquals(term340839, term341058));
        assertTrue(recursiveEquals(retValue, term341030));
    }

};


