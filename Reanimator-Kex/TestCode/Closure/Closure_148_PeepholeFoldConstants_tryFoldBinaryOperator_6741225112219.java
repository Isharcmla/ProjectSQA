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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term607600;
     Object term607692;
     Object term608535;
     Object term608536;
     Object term608467;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term607600 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term607692 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term607784 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term607876 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term607946 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term607876, term607876.getClass(), "type", 64);
        setField(term607784, term607784.getClass(), "next", term607876);
        setIntField(term607784, term607784.getClass(), "type", 0);
        setField(term607692, term607692.getClass(), "first", term607784);
        setIntField(term607692, term607692.getClass(), "type", 100);
        setField(term607692, term607692.getClass(), "parent", term607946);
        term608535 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term608535, term608535.getClass(), "currentTraversal", null);
        term608536 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term608537 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term608538 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term608539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term608536, term608536.getClass(), "str", null);
        setIntField(term608536, term608536.getClass(), "type", 100);
        setField(term608536, term608536.getClass(), "next", null);
        setField(term608537, term608537.getClass(), "str", null);
        setIntField(term608537, term608537.getClass(), "type", 0);
        setField(term608538, term608538.getClass(), "str", null);
        setIntField(term608538, term608538.getClass(), "type", 64);
        setField(term608538, term608538.getClass(), "next", null);
        setField(term608538, term608538.getClass(), "first", null);
        setField(term608538, term608538.getClass(), "last", null);
        setField(term608538, term608538.getClass(), "propListHead", null);
        setIntField(term608538, term608538.getClass(), "sourcePosition", 0);
        setField(term608538, term608538.getClass(), "jsType", null);
        setField(term608538, term608538.getClass(), "parent", null);
        setField(term608537, term608537.getClass(), "next", term608538);
        setField(term608537, term608537.getClass(), "first", null);
        setField(term608537, term608537.getClass(), "last", null);
        setField(term608537, term608537.getClass(), "propListHead", null);
        setIntField(term608537, term608537.getClass(), "sourcePosition", 0);
        setField(term608537, term608537.getClass(), "jsType", null);
        setField(term608537, term608537.getClass(), "parent", null);
        setField(term608536, term608536.getClass(), "first", term608537);
        setField(term608536, term608536.getClass(), "last", null);
        setField(term608536, term608536.getClass(), "propListHead", null);
        setIntField(term608536, term608536.getClass(), "sourcePosition", 0);
        setField(term608536, term608536.getClass(), "jsType", null);
        setIntField(term608539, term608539.getClass(), "type", 0);
        setField(term608539, term608539.getClass(), "next", null);
        setField(term608539, term608539.getClass(), "first", null);
        setField(term608539, term608539.getClass(), "last", null);
        setField(term608539, term608539.getClass(), "propListHead", null);
        setIntField(term608539, term608539.getClass(), "sourcePosition", 0);
        setField(term608539, term608539.getClass(), "jsType", null);
        setField(term608539, term608539.getClass(), "parent", null);
        setField(term608536, term608536.getClass(), "parent", term608539);
        term608467 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term608469 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term608471 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term608476 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term608467, term608467.getClass(), "str", null);
        setIntField(term608467, term608467.getClass(), "type", 100);
        setField(term608467, term608467.getClass(), "next", null);
        setField(term608469, term608469.getClass(), "str", null);
        setIntField(term608469, term608469.getClass(), "type", 0);
        setField(term608471, term608471.getClass(), "str", null);
        setIntField(term608471, term608471.getClass(), "type", 64);
        setField(term608471, term608471.getClass(), "next", null);
        setField(term608471, term608471.getClass(), "first", null);
        setField(term608471, term608471.getClass(), "last", null);
        setField(term608471, term608471.getClass(), "propListHead", null);
        setIntField(term608471, term608471.getClass(), "sourcePosition", 0);
        setField(term608471, term608471.getClass(), "jsType", null);
        setField(term608471, term608471.getClass(), "parent", null);
        setField(term608469, term608469.getClass(), "next", term608471);
        setField(term608469, term608469.getClass(), "first", null);
        setField(term608469, term608469.getClass(), "last", null);
        setField(term608469, term608469.getClass(), "propListHead", null);
        setIntField(term608469, term608469.getClass(), "sourcePosition", 0);
        setField(term608469, term608469.getClass(), "jsType", null);
        setField(term608469, term608469.getClass(), "parent", null);
        setField(term608467, term608467.getClass(), "first", term608469);
        setField(term608467, term608467.getClass(), "last", null);
        setField(term608467, term608467.getClass(), "propListHead", null);
        setIntField(term608467, term608467.getClass(), "sourcePosition", 0);
        setField(term608467, term608467.getClass(), "jsType", null);
        setIntField(term608476, term608476.getClass(), "type", 0);
        setField(term608476, term608476.getClass(), "next", null);
        setField(term608476, term608476.getClass(), "first", null);
        setField(term608476, term608476.getClass(), "last", null);
        setField(term608476, term608476.getClass(), "propListHead", null);
        setIntField(term608476, term608476.getClass(), "sourcePosition", 0);
        setField(term608476, term608476.getClass(), "jsType", null);
        setField(term608476, term608476.getClass(), "parent", null);
        setField(term608467, term608467.getClass(), "parent", term608476);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term607692;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term607600, args);
        assertTrue(recursiveEquals(term607600, term608535));
        assertTrue(recursiveEquals(term607692, term608536));
        assertTrue(recursiveEquals(retValue, term608467));
    }

};


