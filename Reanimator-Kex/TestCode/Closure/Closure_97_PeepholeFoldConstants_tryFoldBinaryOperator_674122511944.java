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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278784;
     Object term278876;
     Object term303461;
     Object term303462;
     Object term303425;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term278784 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term278876 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term278968 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term279060 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term278968, term278968.getClass(), "next", term279060);
        setIntField(term278968, term278968.getClass(), "type", 39);
        setField(term278876, term278876.getClass(), "first", term278968);
        setIntField(term278876, term278876.getClass(), "type", 22);
        term303461 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term303461, term303461.getClass(), "currentTraversal", null);
        term303462 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term303463 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term303464 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term303462, term303462.getClass(), "number", 0.0);
        setIntField(term303462, term303462.getClass(), "type", 22);
        setField(term303462, term303462.getClass(), "next", null);
        setDoubleField(term303463, term303463.getClass(), "number", 0.0);
        setIntField(term303463, term303463.getClass(), "type", 39);
        setDoubleField(term303464, term303464.getClass(), "number", 0.0);
        setIntField(term303464, term303464.getClass(), "type", 0);
        setField(term303464, term303464.getClass(), "next", null);
        setField(term303464, term303464.getClass(), "first", null);
        setField(term303464, term303464.getClass(), "last", null);
        setField(term303464, term303464.getClass(), "propListHead", null);
        setIntField(term303464, term303464.getClass(), "sourcePosition", 0);
        setField(term303464, term303464.getClass(), "jsType", null);
        setField(term303464, term303464.getClass(), "parent", null);
        setField(term303463, term303463.getClass(), "next", term303464);
        setField(term303463, term303463.getClass(), "first", null);
        setField(term303463, term303463.getClass(), "last", null);
        setField(term303463, term303463.getClass(), "propListHead", null);
        setIntField(term303463, term303463.getClass(), "sourcePosition", 0);
        setField(term303463, term303463.getClass(), "jsType", null);
        setField(term303463, term303463.getClass(), "parent", null);
        setField(term303462, term303462.getClass(), "first", term303463);
        setField(term303462, term303462.getClass(), "last", null);
        setField(term303462, term303462.getClass(), "propListHead", null);
        setIntField(term303462, term303462.getClass(), "sourcePosition", 0);
        setField(term303462, term303462.getClass(), "jsType", null);
        setField(term303462, term303462.getClass(), "parent", null);
        term303425 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term303428 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term303431 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term303425, term303425.getClass(), "number", 0.0);
        setIntField(term303425, term303425.getClass(), "type", 22);
        setField(term303425, term303425.getClass(), "next", null);
        setDoubleField(term303428, term303428.getClass(), "number", 0.0);
        setIntField(term303428, term303428.getClass(), "type", 39);
        setDoubleField(term303431, term303431.getClass(), "number", 0.0);
        setIntField(term303431, term303431.getClass(), "type", 0);
        setField(term303431, term303431.getClass(), "next", null);
        setField(term303431, term303431.getClass(), "first", null);
        setField(term303431, term303431.getClass(), "last", null);
        setField(term303431, term303431.getClass(), "propListHead", null);
        setIntField(term303431, term303431.getClass(), "sourcePosition", 0);
        setField(term303431, term303431.getClass(), "jsType", null);
        setField(term303431, term303431.getClass(), "parent", null);
        setField(term303428, term303428.getClass(), "next", term303431);
        setField(term303428, term303428.getClass(), "first", null);
        setField(term303428, term303428.getClass(), "last", null);
        setField(term303428, term303428.getClass(), "propListHead", null);
        setIntField(term303428, term303428.getClass(), "sourcePosition", 0);
        setField(term303428, term303428.getClass(), "jsType", null);
        setField(term303428, term303428.getClass(), "parent", null);
        setField(term303425, term303425.getClass(), "first", term303428);
        setField(term303425, term303425.getClass(), "last", null);
        setField(term303425, term303425.getClass(), "propListHead", null);
        setIntField(term303425, term303425.getClass(), "sourcePosition", 0);
        setField(term303425, term303425.getClass(), "jsType", null);
        setField(term303425, term303425.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term278876;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term278784, args);
        assertTrue(recursiveEquals(term278784, term303461));
        assertTrue(recursiveEquals(term278876, term303462));
        assertTrue(recursiveEquals(retValue, term303425));
    }

};


