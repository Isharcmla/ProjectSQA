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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111890 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term499632;
     Object term499724;
     Object term500167;
     Object term500168;
     Object term500092;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111890() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term499632 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term499724 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term499816 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term499908 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term499978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term499908, term499908.getClass(), "type", 63);
        setField(term499816, term499816.getClass(), "next", term499908);
        setIntField(term499816, term499816.getClass(), "type", 0);
        setField(term499724, term499724.getClass(), "first", term499816);
        setIntField(term499724, term499724.getClass(), "type", 101);
        setField(term499724, term499724.getClass(), "parent", term499978);
        term500167 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term500167, term500167.getClass(), "currentTraversal", null);
        term500168 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term500169 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term500170 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term500171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term500168, term500168.getClass(), "number", 0.0);
        setIntField(term500168, term500168.getClass(), "type", 101);
        setField(term500168, term500168.getClass(), "next", null);
        setDoubleField(term500169, term500169.getClass(), "number", 0.0);
        setIntField(term500169, term500169.getClass(), "type", 0);
        setDoubleField(term500170, term500170.getClass(), "number", 0.0);
        setIntField(term500170, term500170.getClass(), "type", 63);
        setField(term500170, term500170.getClass(), "next", null);
        setField(term500170, term500170.getClass(), "first", null);
        setField(term500170, term500170.getClass(), "last", null);
        setField(term500170, term500170.getClass(), "propListHead", null);
        setIntField(term500170, term500170.getClass(), "sourcePosition", 0);
        setField(term500170, term500170.getClass(), "jsType", null);
        setField(term500170, term500170.getClass(), "parent", null);
        setField(term500169, term500169.getClass(), "next", term500170);
        setField(term500169, term500169.getClass(), "first", null);
        setField(term500169, term500169.getClass(), "last", null);
        setField(term500169, term500169.getClass(), "propListHead", null);
        setIntField(term500169, term500169.getClass(), "sourcePosition", 0);
        setField(term500169, term500169.getClass(), "jsType", null);
        setField(term500169, term500169.getClass(), "parent", null);
        setField(term500168, term500168.getClass(), "first", term500169);
        setField(term500168, term500168.getClass(), "last", null);
        setField(term500168, term500168.getClass(), "propListHead", null);
        setIntField(term500168, term500168.getClass(), "sourcePosition", 0);
        setField(term500168, term500168.getClass(), "jsType", null);
        setIntField(term500171, term500171.getClass(), "type", 0);
        setField(term500171, term500171.getClass(), "next", null);
        setField(term500171, term500171.getClass(), "first", null);
        setField(term500171, term500171.getClass(), "last", null);
        setField(term500171, term500171.getClass(), "propListHead", null);
        setIntField(term500171, term500171.getClass(), "sourcePosition", 0);
        setField(term500171, term500171.getClass(), "jsType", null);
        setField(term500171, term500171.getClass(), "parent", null);
        setField(term500168, term500168.getClass(), "parent", term500171);
        term500092 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term500095 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term500098 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term500104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term500092, term500092.getClass(), "number", 0.0);
        setIntField(term500092, term500092.getClass(), "type", 101);
        setField(term500092, term500092.getClass(), "next", null);
        setDoubleField(term500095, term500095.getClass(), "number", 0.0);
        setIntField(term500095, term500095.getClass(), "type", 0);
        setDoubleField(term500098, term500098.getClass(), "number", 0.0);
        setIntField(term500098, term500098.getClass(), "type", 63);
        setField(term500098, term500098.getClass(), "next", null);
        setField(term500098, term500098.getClass(), "first", null);
        setField(term500098, term500098.getClass(), "last", null);
        setField(term500098, term500098.getClass(), "propListHead", null);
        setIntField(term500098, term500098.getClass(), "sourcePosition", 0);
        setField(term500098, term500098.getClass(), "jsType", null);
        setField(term500098, term500098.getClass(), "parent", null);
        setField(term500095, term500095.getClass(), "next", term500098);
        setField(term500095, term500095.getClass(), "first", null);
        setField(term500095, term500095.getClass(), "last", null);
        setField(term500095, term500095.getClass(), "propListHead", null);
        setIntField(term500095, term500095.getClass(), "sourcePosition", 0);
        setField(term500095, term500095.getClass(), "jsType", null);
        setField(term500095, term500095.getClass(), "parent", null);
        setField(term500092, term500092.getClass(), "first", term500095);
        setField(term500092, term500092.getClass(), "last", null);
        setField(term500092, term500092.getClass(), "propListHead", null);
        setIntField(term500092, term500092.getClass(), "sourcePosition", 0);
        setField(term500092, term500092.getClass(), "jsType", null);
        setIntField(term500104, term500104.getClass(), "type", 0);
        setField(term500104, term500104.getClass(), "next", null);
        setField(term500104, term500104.getClass(), "first", null);
        setField(term500104, term500104.getClass(), "last", null);
        setField(term500104, term500104.getClass(), "propListHead", null);
        setIntField(term500104, term500104.getClass(), "sourcePosition", 0);
        setField(term500104, term500104.getClass(), "jsType", null);
        setField(term500104, term500104.getClass(), "parent", null);
        setField(term500092, term500092.getClass(), "parent", term500104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term499724;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term499632, args);
        assertTrue(recursiveEquals(term499632, term500167));
        assertTrue(recursiveEquals(term499724, term500168));
        assertTrue(recursiveEquals(retValue, term500092));
    }

};


