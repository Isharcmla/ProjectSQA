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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term747370;
     Object term747462;
     Object term747701;
     Object term747702;
     Object term747654;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term747370 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term747462 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term747554 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term747646 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term747646, term747646.getClass(), "type", 42);
        setField(term747554, term747554.getClass(), "next", term747646);
        setIntField(term747554, term747554.getClass(), "type", 42);
        setField(term747462, term747462.getClass(), "first", term747554);
        setIntField(term747462, term747462.getClass(), "type", 16);
        term747701 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term747701, term747701.getClass(), "currentTraversal", null);
        term747702 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term747703 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term747704 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term747702, term747702.getClass(), "str", null);
        setIntField(term747702, term747702.getClass(), "type", 16);
        setField(term747702, term747702.getClass(), "next", null);
        setField(term747703, term747703.getClass(), "str", null);
        setIntField(term747703, term747703.getClass(), "type", 42);
        setDoubleField(term747704, term747704.getClass(), "number", 0.0);
        setIntField(term747704, term747704.getClass(), "type", 42);
        setField(term747704, term747704.getClass(), "next", null);
        setField(term747704, term747704.getClass(), "first", null);
        setField(term747704, term747704.getClass(), "last", null);
        setField(term747704, term747704.getClass(), "propListHead", null);
        setIntField(term747704, term747704.getClass(), "sourcePosition", 0);
        setField(term747704, term747704.getClass(), "jsType", null);
        setField(term747704, term747704.getClass(), "parent", null);
        setField(term747703, term747703.getClass(), "next", term747704);
        setField(term747703, term747703.getClass(), "first", null);
        setField(term747703, term747703.getClass(), "last", null);
        setField(term747703, term747703.getClass(), "propListHead", null);
        setIntField(term747703, term747703.getClass(), "sourcePosition", 0);
        setField(term747703, term747703.getClass(), "jsType", null);
        setField(term747703, term747703.getClass(), "parent", null);
        setField(term747702, term747702.getClass(), "first", term747703);
        setField(term747702, term747702.getClass(), "last", null);
        setField(term747702, term747702.getClass(), "propListHead", null);
        setIntField(term747702, term747702.getClass(), "sourcePosition", 0);
        setField(term747702, term747702.getClass(), "jsType", null);
        setField(term747702, term747702.getClass(), "parent", null);
        term747654 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term747656 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term747658 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term747654, term747654.getClass(), "str", null);
        setIntField(term747654, term747654.getClass(), "type", 16);
        setField(term747654, term747654.getClass(), "next", null);
        setField(term747656, term747656.getClass(), "str", null);
        setIntField(term747656, term747656.getClass(), "type", 42);
        setDoubleField(term747658, term747658.getClass(), "number", 0.0);
        setIntField(term747658, term747658.getClass(), "type", 42);
        setField(term747658, term747658.getClass(), "next", null);
        setField(term747658, term747658.getClass(), "first", null);
        setField(term747658, term747658.getClass(), "last", null);
        setField(term747658, term747658.getClass(), "propListHead", null);
        setIntField(term747658, term747658.getClass(), "sourcePosition", 0);
        setField(term747658, term747658.getClass(), "jsType", null);
        setField(term747658, term747658.getClass(), "parent", null);
        setField(term747656, term747656.getClass(), "next", term747658);
        setField(term747656, term747656.getClass(), "first", null);
        setField(term747656, term747656.getClass(), "last", null);
        setField(term747656, term747656.getClass(), "propListHead", null);
        setIntField(term747656, term747656.getClass(), "sourcePosition", 0);
        setField(term747656, term747656.getClass(), "jsType", null);
        setField(term747656, term747656.getClass(), "parent", null);
        setField(term747654, term747654.getClass(), "first", term747656);
        setField(term747654, term747654.getClass(), "last", null);
        setField(term747654, term747654.getClass(), "propListHead", null);
        setIntField(term747654, term747654.getClass(), "sourcePosition", 0);
        setField(term747654, term747654.getClass(), "jsType", null);
        setField(term747654, term747654.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term747462;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term747370, args);
        assertTrue(recursiveEquals(term747370, term747701));
        assertTrue(recursiveEquals(term747462, term747702));
        assertTrue(recursiveEquals(retValue, term747654));
    }

};


