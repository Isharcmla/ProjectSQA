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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222611;
     Object term222703;
     Object term222937;
     Object term222938;
     Object term222896;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222611 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term222703 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term222795 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term222887 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term222795, term222795.getClass(), "next", term222887);
        setField(term222703, term222703.getClass(), "first", term222795);
        setIntField(term222703, term222703.getClass(), "type", 12);
        term222937 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term222937, term222937.getClass(), "currentTraversal", null);
        term222938 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term222939 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term222940 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term222938, term222938.getClass(), "number", 0.0);
        setIntField(term222938, term222938.getClass(), "type", 12);
        setField(term222938, term222938.getClass(), "next", null);
        setDoubleField(term222939, term222939.getClass(), "number", 0.0);
        setIntField(term222939, term222939.getClass(), "type", 0);
        setDoubleField(term222940, term222940.getClass(), "number", 0.0);
        setIntField(term222940, term222940.getClass(), "type", 0);
        setField(term222940, term222940.getClass(), "next", null);
        setField(term222940, term222940.getClass(), "first", null);
        setField(term222940, term222940.getClass(), "last", null);
        setField(term222940, term222940.getClass(), "propListHead", null);
        setIntField(term222940, term222940.getClass(), "sourcePosition", 0);
        setField(term222940, term222940.getClass(), "jsType", null);
        setField(term222940, term222940.getClass(), "parent", null);
        setField(term222939, term222939.getClass(), "next", term222940);
        setField(term222939, term222939.getClass(), "first", null);
        setField(term222939, term222939.getClass(), "last", null);
        setField(term222939, term222939.getClass(), "propListHead", null);
        setIntField(term222939, term222939.getClass(), "sourcePosition", 0);
        setField(term222939, term222939.getClass(), "jsType", null);
        setField(term222939, term222939.getClass(), "parent", null);
        setField(term222938, term222938.getClass(), "first", term222939);
        setField(term222938, term222938.getClass(), "last", null);
        setField(term222938, term222938.getClass(), "propListHead", null);
        setIntField(term222938, term222938.getClass(), "sourcePosition", 0);
        setField(term222938, term222938.getClass(), "jsType", null);
        setField(term222938, term222938.getClass(), "parent", null);
        term222896 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term222899 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term222902 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term222896, term222896.getClass(), "number", 0.0);
        setIntField(term222896, term222896.getClass(), "type", 12);
        setField(term222896, term222896.getClass(), "next", null);
        setDoubleField(term222899, term222899.getClass(), "number", 0.0);
        setIntField(term222899, term222899.getClass(), "type", 0);
        setDoubleField(term222902, term222902.getClass(), "number", 0.0);
        setIntField(term222902, term222902.getClass(), "type", 0);
        setField(term222902, term222902.getClass(), "next", null);
        setField(term222902, term222902.getClass(), "first", null);
        setField(term222902, term222902.getClass(), "last", null);
        setField(term222902, term222902.getClass(), "propListHead", null);
        setIntField(term222902, term222902.getClass(), "sourcePosition", 0);
        setField(term222902, term222902.getClass(), "jsType", null);
        setField(term222902, term222902.getClass(), "parent", null);
        setField(term222899, term222899.getClass(), "next", term222902);
        setField(term222899, term222899.getClass(), "first", null);
        setField(term222899, term222899.getClass(), "last", null);
        setField(term222899, term222899.getClass(), "propListHead", null);
        setIntField(term222899, term222899.getClass(), "sourcePosition", 0);
        setField(term222899, term222899.getClass(), "jsType", null);
        setField(term222899, term222899.getClass(), "parent", null);
        setField(term222896, term222896.getClass(), "first", term222899);
        setField(term222896, term222896.getClass(), "last", null);
        setField(term222896, term222896.getClass(), "propListHead", null);
        setIntField(term222896, term222896.getClass(), "sourcePosition", 0);
        setField(term222896, term222896.getClass(), "jsType", null);
        setField(term222896, term222896.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term222703;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term222611, args);
        assertTrue(recursiveEquals(term222611, term222937));
        assertTrue(recursiveEquals(term222703, term222938));
        assertTrue(recursiveEquals(retValue, term222896));
    }

};


