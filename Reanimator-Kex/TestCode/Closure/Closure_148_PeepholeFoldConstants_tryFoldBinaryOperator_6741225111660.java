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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term426196;
     Object term426288;
     Object term426517;
     Object term426518;
     Object term426481;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term426196 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term426288 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term426380 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term426472 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term426380, term426380.getClass(), "next", term426472);
        setIntField(term426380, term426380.getClass(), "type", 39);
        setField(term426288, term426288.getClass(), "first", term426380);
        setIntField(term426288, term426288.getClass(), "type", 23);
        term426517 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term426517, term426517.getClass(), "currentTraversal", null);
        term426518 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term426519 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term426520 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term426518, term426518.getClass(), "number", 0.0);
        setIntField(term426518, term426518.getClass(), "type", 23);
        setField(term426518, term426518.getClass(), "next", null);
        setDoubleField(term426519, term426519.getClass(), "number", 0.0);
        setIntField(term426519, term426519.getClass(), "type", 39);
        setDoubleField(term426520, term426520.getClass(), "number", 0.0);
        setIntField(term426520, term426520.getClass(), "type", 0);
        setField(term426520, term426520.getClass(), "next", null);
        setField(term426520, term426520.getClass(), "first", null);
        setField(term426520, term426520.getClass(), "last", null);
        setField(term426520, term426520.getClass(), "propListHead", null);
        setIntField(term426520, term426520.getClass(), "sourcePosition", 0);
        setField(term426520, term426520.getClass(), "jsType", null);
        setField(term426520, term426520.getClass(), "parent", null);
        setField(term426519, term426519.getClass(), "next", term426520);
        setField(term426519, term426519.getClass(), "first", null);
        setField(term426519, term426519.getClass(), "last", null);
        setField(term426519, term426519.getClass(), "propListHead", null);
        setIntField(term426519, term426519.getClass(), "sourcePosition", 0);
        setField(term426519, term426519.getClass(), "jsType", null);
        setField(term426519, term426519.getClass(), "parent", null);
        setField(term426518, term426518.getClass(), "first", term426519);
        setField(term426518, term426518.getClass(), "last", null);
        setField(term426518, term426518.getClass(), "propListHead", null);
        setIntField(term426518, term426518.getClass(), "sourcePosition", 0);
        setField(term426518, term426518.getClass(), "jsType", null);
        setField(term426518, term426518.getClass(), "parent", null);
        term426481 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term426484 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term426487 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term426481, term426481.getClass(), "number", 0.0);
        setIntField(term426481, term426481.getClass(), "type", 23);
        setField(term426481, term426481.getClass(), "next", null);
        setDoubleField(term426484, term426484.getClass(), "number", 0.0);
        setIntField(term426484, term426484.getClass(), "type", 39);
        setDoubleField(term426487, term426487.getClass(), "number", 0.0);
        setIntField(term426487, term426487.getClass(), "type", 0);
        setField(term426487, term426487.getClass(), "next", null);
        setField(term426487, term426487.getClass(), "first", null);
        setField(term426487, term426487.getClass(), "last", null);
        setField(term426487, term426487.getClass(), "propListHead", null);
        setIntField(term426487, term426487.getClass(), "sourcePosition", 0);
        setField(term426487, term426487.getClass(), "jsType", null);
        setField(term426487, term426487.getClass(), "parent", null);
        setField(term426484, term426484.getClass(), "next", term426487);
        setField(term426484, term426484.getClass(), "first", null);
        setField(term426484, term426484.getClass(), "last", null);
        setField(term426484, term426484.getClass(), "propListHead", null);
        setIntField(term426484, term426484.getClass(), "sourcePosition", 0);
        setField(term426484, term426484.getClass(), "jsType", null);
        setField(term426484, term426484.getClass(), "parent", null);
        setField(term426481, term426481.getClass(), "first", term426484);
        setField(term426481, term426481.getClass(), "last", null);
        setField(term426481, term426481.getClass(), "propListHead", null);
        setIntField(term426481, term426481.getClass(), "sourcePosition", 0);
        setField(term426481, term426481.getClass(), "jsType", null);
        setField(term426481, term426481.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term426288;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term426196, args);
        assertTrue(recursiveEquals(term426196, term426517));
        assertTrue(recursiveEquals(term426288, term426518));
        assertTrue(recursiveEquals(retValue, term426481));
    }

};


