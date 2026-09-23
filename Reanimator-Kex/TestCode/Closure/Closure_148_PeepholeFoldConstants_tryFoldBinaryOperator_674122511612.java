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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134093;
     Object term134185;
     Object term134419;
     Object term134420;
     Object term134378;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134093 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term134185 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term134277 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term134369 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term134277, term134277.getClass(), "next", term134369);
        setField(term134185, term134185.getClass(), "first", term134277);
        setIntField(term134185, term134185.getClass(), "type", 17);
        term134419 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term134419, term134419.getClass(), "currentTraversal", null);
        term134420 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term134421 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term134422 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term134420, term134420.getClass(), "number", 0.0);
        setIntField(term134420, term134420.getClass(), "type", 17);
        setField(term134420, term134420.getClass(), "next", null);
        setDoubleField(term134421, term134421.getClass(), "number", 0.0);
        setIntField(term134421, term134421.getClass(), "type", 0);
        setDoubleField(term134422, term134422.getClass(), "number", 0.0);
        setIntField(term134422, term134422.getClass(), "type", 0);
        setField(term134422, term134422.getClass(), "next", null);
        setField(term134422, term134422.getClass(), "first", null);
        setField(term134422, term134422.getClass(), "last", null);
        setField(term134422, term134422.getClass(), "propListHead", null);
        setIntField(term134422, term134422.getClass(), "sourcePosition", 0);
        setField(term134422, term134422.getClass(), "jsType", null);
        setField(term134422, term134422.getClass(), "parent", null);
        setField(term134421, term134421.getClass(), "next", term134422);
        setField(term134421, term134421.getClass(), "first", null);
        setField(term134421, term134421.getClass(), "last", null);
        setField(term134421, term134421.getClass(), "propListHead", null);
        setIntField(term134421, term134421.getClass(), "sourcePosition", 0);
        setField(term134421, term134421.getClass(), "jsType", null);
        setField(term134421, term134421.getClass(), "parent", null);
        setField(term134420, term134420.getClass(), "first", term134421);
        setField(term134420, term134420.getClass(), "last", null);
        setField(term134420, term134420.getClass(), "propListHead", null);
        setIntField(term134420, term134420.getClass(), "sourcePosition", 0);
        setField(term134420, term134420.getClass(), "jsType", null);
        setField(term134420, term134420.getClass(), "parent", null);
        term134378 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term134381 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term134384 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term134378, term134378.getClass(), "number", 0.0);
        setIntField(term134378, term134378.getClass(), "type", 17);
        setField(term134378, term134378.getClass(), "next", null);
        setDoubleField(term134381, term134381.getClass(), "number", 0.0);
        setIntField(term134381, term134381.getClass(), "type", 0);
        setDoubleField(term134384, term134384.getClass(), "number", 0.0);
        setIntField(term134384, term134384.getClass(), "type", 0);
        setField(term134384, term134384.getClass(), "next", null);
        setField(term134384, term134384.getClass(), "first", null);
        setField(term134384, term134384.getClass(), "last", null);
        setField(term134384, term134384.getClass(), "propListHead", null);
        setIntField(term134384, term134384.getClass(), "sourcePosition", 0);
        setField(term134384, term134384.getClass(), "jsType", null);
        setField(term134384, term134384.getClass(), "parent", null);
        setField(term134381, term134381.getClass(), "next", term134384);
        setField(term134381, term134381.getClass(), "first", null);
        setField(term134381, term134381.getClass(), "last", null);
        setField(term134381, term134381.getClass(), "propListHead", null);
        setIntField(term134381, term134381.getClass(), "sourcePosition", 0);
        setField(term134381, term134381.getClass(), "jsType", null);
        setField(term134381, term134381.getClass(), "parent", null);
        setField(term134378, term134378.getClass(), "first", term134381);
        setField(term134378, term134378.getClass(), "last", null);
        setField(term134378, term134378.getClass(), "propListHead", null);
        setIntField(term134378, term134378.getClass(), "sourcePosition", 0);
        setField(term134378, term134378.getClass(), "jsType", null);
        setField(term134378, term134378.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term134185;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term134093, args);
        assertTrue(recursiveEquals(term134093, term134419));
        assertTrue(recursiveEquals(term134185, term134420));
        assertTrue(recursiveEquals(retValue, term134378));
    }

};


