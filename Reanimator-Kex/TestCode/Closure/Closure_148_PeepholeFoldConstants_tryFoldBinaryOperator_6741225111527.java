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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term381759;
     Object term381851;
     Object term382545;
     Object term382546;
     Object term382507;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term381759 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term381851 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term381943 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term382035 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term381943, term381943.getClass(), "next", term382035);
        setField(term381851, term381851.getClass(), "first", term381943);
        setIntField(term381851, term381851.getClass(), "type", 35);
        term382545 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term382545, term382545.getClass(), "currentTraversal", null);
        term382546 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term382547 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term382548 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term382546, term382546.getClass(), "number", 0.0);
        setIntField(term382546, term382546.getClass(), "type", 35);
        setField(term382546, term382546.getClass(), "next", null);
        setDoubleField(term382547, term382547.getClass(), "number", 0.0);
        setIntField(term382547, term382547.getClass(), "type", 0);
        setDoubleField(term382548, term382548.getClass(), "number", 0.0);
        setIntField(term382548, term382548.getClass(), "type", 0);
        setField(term382548, term382548.getClass(), "next", null);
        setField(term382548, term382548.getClass(), "first", null);
        setField(term382548, term382548.getClass(), "last", null);
        setField(term382548, term382548.getClass(), "propListHead", null);
        setIntField(term382548, term382548.getClass(), "sourcePosition", 0);
        setField(term382548, term382548.getClass(), "jsType", null);
        setField(term382548, term382548.getClass(), "parent", null);
        setField(term382547, term382547.getClass(), "next", term382548);
        setField(term382547, term382547.getClass(), "first", null);
        setField(term382547, term382547.getClass(), "last", null);
        setField(term382547, term382547.getClass(), "propListHead", null);
        setIntField(term382547, term382547.getClass(), "sourcePosition", 0);
        setField(term382547, term382547.getClass(), "jsType", null);
        setField(term382547, term382547.getClass(), "parent", null);
        setField(term382546, term382546.getClass(), "first", term382547);
        setField(term382546, term382546.getClass(), "last", null);
        setField(term382546, term382546.getClass(), "propListHead", null);
        setIntField(term382546, term382546.getClass(), "sourcePosition", 0);
        setField(term382546, term382546.getClass(), "jsType", null);
        setField(term382546, term382546.getClass(), "parent", null);
        term382507 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term382510 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term382513 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term382507, term382507.getClass(), "number", 0.0);
        setIntField(term382507, term382507.getClass(), "type", 35);
        setField(term382507, term382507.getClass(), "next", null);
        setDoubleField(term382510, term382510.getClass(), "number", 0.0);
        setIntField(term382510, term382510.getClass(), "type", 0);
        setDoubleField(term382513, term382513.getClass(), "number", 0.0);
        setIntField(term382513, term382513.getClass(), "type", 0);
        setField(term382513, term382513.getClass(), "next", null);
        setField(term382513, term382513.getClass(), "first", null);
        setField(term382513, term382513.getClass(), "last", null);
        setField(term382513, term382513.getClass(), "propListHead", null);
        setIntField(term382513, term382513.getClass(), "sourcePosition", 0);
        setField(term382513, term382513.getClass(), "jsType", null);
        setField(term382513, term382513.getClass(), "parent", null);
        setField(term382510, term382510.getClass(), "next", term382513);
        setField(term382510, term382510.getClass(), "first", null);
        setField(term382510, term382510.getClass(), "last", null);
        setField(term382510, term382510.getClass(), "propListHead", null);
        setIntField(term382510, term382510.getClass(), "sourcePosition", 0);
        setField(term382510, term382510.getClass(), "jsType", null);
        setField(term382510, term382510.getClass(), "parent", null);
        setField(term382507, term382507.getClass(), "first", term382510);
        setField(term382507, term382507.getClass(), "last", null);
        setField(term382507, term382507.getClass(), "propListHead", null);
        setIntField(term382507, term382507.getClass(), "sourcePosition", 0);
        setField(term382507, term382507.getClass(), "jsType", null);
        setField(term382507, term382507.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term381851;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term381759, args);
        assertTrue(recursiveEquals(term381759, term382545));
        assertTrue(recursiveEquals(term381851, term382546));
        assertTrue(recursiveEquals(retValue, term382507));
    }

};


