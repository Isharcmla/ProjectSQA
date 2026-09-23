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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term537232;
     Object term537324;
     Object term537548;
     Object term537549;
     Object term537515;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term537232 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term537324 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term537416 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term537508 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term537416, term537416.getClass(), "next", term537508);
        setIntField(term537416, term537416.getClass(), "type", 39);
        setField(term537324, term537324.getClass(), "first", term537416);
        setIntField(term537324, term537324.getClass(), "type", 11);
        term537548 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term537548, term537548.getClass(), "currentTraversal", null);
        term537549 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term537550 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term537551 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term537549, term537549.getClass(), "str", null);
        setIntField(term537549, term537549.getClass(), "type", 11);
        setField(term537549, term537549.getClass(), "next", null);
        setField(term537550, term537550.getClass(), "str", null);
        setIntField(term537550, term537550.getClass(), "type", 39);
        setField(term537551, term537551.getClass(), "str", null);
        setIntField(term537551, term537551.getClass(), "type", 0);
        setField(term537551, term537551.getClass(), "next", null);
        setField(term537551, term537551.getClass(), "first", null);
        setField(term537551, term537551.getClass(), "last", null);
        setField(term537551, term537551.getClass(), "propListHead", null);
        setIntField(term537551, term537551.getClass(), "sourcePosition", 0);
        setField(term537551, term537551.getClass(), "jsType", null);
        setField(term537551, term537551.getClass(), "parent", null);
        setField(term537550, term537550.getClass(), "next", term537551);
        setField(term537550, term537550.getClass(), "first", null);
        setField(term537550, term537550.getClass(), "last", null);
        setField(term537550, term537550.getClass(), "propListHead", null);
        setIntField(term537550, term537550.getClass(), "sourcePosition", 0);
        setField(term537550, term537550.getClass(), "jsType", null);
        setField(term537550, term537550.getClass(), "parent", null);
        setField(term537549, term537549.getClass(), "first", term537550);
        setField(term537549, term537549.getClass(), "last", null);
        setField(term537549, term537549.getClass(), "propListHead", null);
        setIntField(term537549, term537549.getClass(), "sourcePosition", 0);
        setField(term537549, term537549.getClass(), "jsType", null);
        setField(term537549, term537549.getClass(), "parent", null);
        term537515 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term537517 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term537519 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term537515, term537515.getClass(), "str", null);
        setIntField(term537515, term537515.getClass(), "type", 11);
        setField(term537515, term537515.getClass(), "next", null);
        setField(term537517, term537517.getClass(), "str", null);
        setIntField(term537517, term537517.getClass(), "type", 39);
        setField(term537519, term537519.getClass(), "str", null);
        setIntField(term537519, term537519.getClass(), "type", 0);
        setField(term537519, term537519.getClass(), "next", null);
        setField(term537519, term537519.getClass(), "first", null);
        setField(term537519, term537519.getClass(), "last", null);
        setField(term537519, term537519.getClass(), "propListHead", null);
        setIntField(term537519, term537519.getClass(), "sourcePosition", 0);
        setField(term537519, term537519.getClass(), "jsType", null);
        setField(term537519, term537519.getClass(), "parent", null);
        setField(term537517, term537517.getClass(), "next", term537519);
        setField(term537517, term537517.getClass(), "first", null);
        setField(term537517, term537517.getClass(), "last", null);
        setField(term537517, term537517.getClass(), "propListHead", null);
        setIntField(term537517, term537517.getClass(), "sourcePosition", 0);
        setField(term537517, term537517.getClass(), "jsType", null);
        setField(term537517, term537517.getClass(), "parent", null);
        setField(term537515, term537515.getClass(), "first", term537517);
        setField(term537515, term537515.getClass(), "last", null);
        setField(term537515, term537515.getClass(), "propListHead", null);
        setIntField(term537515, term537515.getClass(), "sourcePosition", 0);
        setField(term537515, term537515.getClass(), "jsType", null);
        setField(term537515, term537515.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term537324;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term537232, args);
        assertTrue(recursiveEquals(term537232, term537548));
        assertTrue(recursiveEquals(term537324, term537549));
        assertTrue(recursiveEquals(retValue, term537515));
    }

};


