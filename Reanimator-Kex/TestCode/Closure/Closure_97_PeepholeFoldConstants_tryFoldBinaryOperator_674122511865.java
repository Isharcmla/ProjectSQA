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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245838;
     Object term245930;
     Object term246579;
     Object term246580;
     Object term246526;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245838 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term245930 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term246022 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term246114 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term246114, term246114.getClass(), "type", 106);
        setField(term246022, term246022.getClass(), "next", term246114);
        setIntField(term246022, term246022.getClass(), "type", 42);
        setField(term245930, term245930.getClass(), "first", term246022);
        setIntField(term245930, term245930.getClass(), "type", 14);
        term246579 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term246579, term246579.getClass(), "currentTraversal", null);
        term246580 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term246581 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term246582 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term246580, term246580.getClass(), "number", 0.0);
        setIntField(term246580, term246580.getClass(), "type", 14);
        setField(term246580, term246580.getClass(), "next", null);
        setDoubleField(term246581, term246581.getClass(), "number", 0.0);
        setIntField(term246581, term246581.getClass(), "type", 42);
        setField(term246582, term246582.getClass(), "str", null);
        setIntField(term246582, term246582.getClass(), "type", 106);
        setField(term246582, term246582.getClass(), "next", null);
        setField(term246582, term246582.getClass(), "first", null);
        setField(term246582, term246582.getClass(), "last", null);
        setField(term246582, term246582.getClass(), "propListHead", null);
        setIntField(term246582, term246582.getClass(), "sourcePosition", 0);
        setField(term246582, term246582.getClass(), "jsType", null);
        setField(term246582, term246582.getClass(), "parent", null);
        setField(term246581, term246581.getClass(), "next", term246582);
        setField(term246581, term246581.getClass(), "first", null);
        setField(term246581, term246581.getClass(), "last", null);
        setField(term246581, term246581.getClass(), "propListHead", null);
        setIntField(term246581, term246581.getClass(), "sourcePosition", 0);
        setField(term246581, term246581.getClass(), "jsType", null);
        setField(term246581, term246581.getClass(), "parent", null);
        setField(term246580, term246580.getClass(), "first", term246581);
        setField(term246580, term246580.getClass(), "last", null);
        setField(term246580, term246580.getClass(), "propListHead", null);
        setIntField(term246580, term246580.getClass(), "sourcePosition", 0);
        setField(term246580, term246580.getClass(), "jsType", null);
        setField(term246580, term246580.getClass(), "parent", null);
        term246526 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term246529 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term246532 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term246526, term246526.getClass(), "number", 0.0);
        setIntField(term246526, term246526.getClass(), "type", 14);
        setField(term246526, term246526.getClass(), "next", null);
        setDoubleField(term246529, term246529.getClass(), "number", 0.0);
        setIntField(term246529, term246529.getClass(), "type", 42);
        setField(term246532, term246532.getClass(), "str", null);
        setIntField(term246532, term246532.getClass(), "type", 106);
        setField(term246532, term246532.getClass(), "next", null);
        setField(term246532, term246532.getClass(), "first", null);
        setField(term246532, term246532.getClass(), "last", null);
        setField(term246532, term246532.getClass(), "propListHead", null);
        setIntField(term246532, term246532.getClass(), "sourcePosition", 0);
        setField(term246532, term246532.getClass(), "jsType", null);
        setField(term246532, term246532.getClass(), "parent", null);
        setField(term246529, term246529.getClass(), "next", term246532);
        setField(term246529, term246529.getClass(), "first", null);
        setField(term246529, term246529.getClass(), "last", null);
        setField(term246529, term246529.getClass(), "propListHead", null);
        setIntField(term246529, term246529.getClass(), "sourcePosition", 0);
        setField(term246529, term246529.getClass(), "jsType", null);
        setField(term246529, term246529.getClass(), "parent", null);
        setField(term246526, term246526.getClass(), "first", term246529);
        setField(term246526, term246526.getClass(), "last", null);
        setField(term246526, term246526.getClass(), "propListHead", null);
        setIntField(term246526, term246526.getClass(), "sourcePosition", 0);
        setField(term246526, term246526.getClass(), "jsType", null);
        setField(term246526, term246526.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term245930;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term245838, args);
        assertTrue(recursiveEquals(term245838, term246579));
        assertTrue(recursiveEquals(term245930, term246580));
        assertTrue(recursiveEquals(retValue, term246526));
    }

};


