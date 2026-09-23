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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270544;
     Object term270636;
     Object term271646;
     Object term271647;
     Object term271604;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term270544 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term270636 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term270728 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term270820 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term270728, term270728.getClass(), "next", term270820);
        setIntField(term270728, term270728.getClass(), "type", 39);
        setField(term270636, term270636.getClass(), "first", term270728);
        setIntField(term270636, term270636.getClass(), "type", 9);
        term271646 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term271646, term271646.getClass(), "currentTraversal", null);
        term271647 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term271648 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term271649 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term271647, term271647.getClass(), "number", 0.0);
        setIntField(term271647, term271647.getClass(), "type", 9);
        setField(term271647, term271647.getClass(), "next", null);
        setDoubleField(term271648, term271648.getClass(), "number", 0.0);
        setIntField(term271648, term271648.getClass(), "type", 39);
        setDoubleField(term271649, term271649.getClass(), "number", 0.0);
        setIntField(term271649, term271649.getClass(), "type", 0);
        setField(term271649, term271649.getClass(), "next", null);
        setField(term271649, term271649.getClass(), "first", null);
        setField(term271649, term271649.getClass(), "last", null);
        setField(term271649, term271649.getClass(), "propListHead", null);
        setIntField(term271649, term271649.getClass(), "sourcePosition", 0);
        setField(term271649, term271649.getClass(), "jsType", null);
        setField(term271649, term271649.getClass(), "parent", null);
        setField(term271648, term271648.getClass(), "next", term271649);
        setField(term271648, term271648.getClass(), "first", null);
        setField(term271648, term271648.getClass(), "last", null);
        setField(term271648, term271648.getClass(), "propListHead", null);
        setIntField(term271648, term271648.getClass(), "sourcePosition", 0);
        setField(term271648, term271648.getClass(), "jsType", null);
        setField(term271648, term271648.getClass(), "parent", null);
        setField(term271647, term271647.getClass(), "first", term271648);
        setField(term271647, term271647.getClass(), "last", null);
        setField(term271647, term271647.getClass(), "propListHead", null);
        setIntField(term271647, term271647.getClass(), "sourcePosition", 0);
        setField(term271647, term271647.getClass(), "jsType", null);
        setField(term271647, term271647.getClass(), "parent", null);
        term271604 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term271607 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term271610 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term271604, term271604.getClass(), "number", 0.0);
        setIntField(term271604, term271604.getClass(), "type", 9);
        setField(term271604, term271604.getClass(), "next", null);
        setDoubleField(term271607, term271607.getClass(), "number", 0.0);
        setIntField(term271607, term271607.getClass(), "type", 39);
        setDoubleField(term271610, term271610.getClass(), "number", 0.0);
        setIntField(term271610, term271610.getClass(), "type", 0);
        setField(term271610, term271610.getClass(), "next", null);
        setField(term271610, term271610.getClass(), "first", null);
        setField(term271610, term271610.getClass(), "last", null);
        setField(term271610, term271610.getClass(), "propListHead", null);
        setIntField(term271610, term271610.getClass(), "sourcePosition", 0);
        setField(term271610, term271610.getClass(), "jsType", null);
        setField(term271610, term271610.getClass(), "parent", null);
        setField(term271607, term271607.getClass(), "next", term271610);
        setField(term271607, term271607.getClass(), "first", null);
        setField(term271607, term271607.getClass(), "last", null);
        setField(term271607, term271607.getClass(), "propListHead", null);
        setIntField(term271607, term271607.getClass(), "sourcePosition", 0);
        setField(term271607, term271607.getClass(), "jsType", null);
        setField(term271607, term271607.getClass(), "parent", null);
        setField(term271604, term271604.getClass(), "first", term271607);
        setField(term271604, term271604.getClass(), "last", null);
        setField(term271604, term271604.getClass(), "propListHead", null);
        setIntField(term271604, term271604.getClass(), "sourcePosition", 0);
        setField(term271604, term271604.getClass(), "jsType", null);
        setField(term271604, term271604.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term270636;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term270544, args);
        assertTrue(recursiveEquals(term270544, term271646));
        assertTrue(recursiveEquals(term270636, term271647));
        assertTrue(recursiveEquals(retValue, term271604));
    }

};


