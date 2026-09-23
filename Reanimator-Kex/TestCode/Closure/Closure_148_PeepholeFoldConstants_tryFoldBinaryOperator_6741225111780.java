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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111780 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term463011;
     Object term463103;
     Object term463462;
     Object term463463;
     Object term463387;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111780() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term463011 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term463103 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term463195 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term463287 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term463379 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term463287, term463287.getClass(), "type", 44);
        setField(term463195, term463195.getClass(), "next", term463287);
        setIntField(term463195, term463195.getClass(), "type", 0);
        setField(term463103, term463103.getClass(), "first", term463195);
        setIntField(term463103, term463103.getClass(), "type", 101);
        setField(term463103, term463103.getClass(), "parent", term463379);
        term463462 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term463462, term463462.getClass(), "currentTraversal", null);
        term463463 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term463464 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term463465 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term463466 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term463463, term463463.getClass(), "str", null);
        setIntField(term463463, term463463.getClass(), "type", 101);
        setField(term463463, term463463.getClass(), "next", null);
        setField(term463464, term463464.getClass(), "str", null);
        setIntField(term463464, term463464.getClass(), "type", 0);
        setDoubleField(term463465, term463465.getClass(), "number", 0.0);
        setIntField(term463465, term463465.getClass(), "type", 44);
        setField(term463465, term463465.getClass(), "next", null);
        setField(term463465, term463465.getClass(), "first", null);
        setField(term463465, term463465.getClass(), "last", null);
        setField(term463465, term463465.getClass(), "propListHead", null);
        setIntField(term463465, term463465.getClass(), "sourcePosition", 0);
        setField(term463465, term463465.getClass(), "jsType", null);
        setField(term463465, term463465.getClass(), "parent", null);
        setField(term463464, term463464.getClass(), "next", term463465);
        setField(term463464, term463464.getClass(), "first", null);
        setField(term463464, term463464.getClass(), "last", null);
        setField(term463464, term463464.getClass(), "propListHead", null);
        setIntField(term463464, term463464.getClass(), "sourcePosition", 0);
        setField(term463464, term463464.getClass(), "jsType", null);
        setField(term463464, term463464.getClass(), "parent", null);
        setField(term463463, term463463.getClass(), "first", term463464);
        setField(term463463, term463463.getClass(), "last", null);
        setField(term463463, term463463.getClass(), "propListHead", null);
        setIntField(term463463, term463463.getClass(), "sourcePosition", 0);
        setField(term463463, term463463.getClass(), "jsType", null);
        setDoubleField(term463466, term463466.getClass(), "number", 0.0);
        setIntField(term463466, term463466.getClass(), "type", 0);
        setField(term463466, term463466.getClass(), "next", null);
        setField(term463466, term463466.getClass(), "first", null);
        setField(term463466, term463466.getClass(), "last", null);
        setField(term463466, term463466.getClass(), "propListHead", null);
        setIntField(term463466, term463466.getClass(), "sourcePosition", 0);
        setField(term463466, term463466.getClass(), "jsType", null);
        setField(term463466, term463466.getClass(), "parent", null);
        setField(term463463, term463463.getClass(), "parent", term463466);
        term463387 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term463389 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term463391 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term463397 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term463387, term463387.getClass(), "str", null);
        setIntField(term463387, term463387.getClass(), "type", 101);
        setField(term463387, term463387.getClass(), "next", null);
        setField(term463389, term463389.getClass(), "str", null);
        setIntField(term463389, term463389.getClass(), "type", 0);
        setDoubleField(term463391, term463391.getClass(), "number", 0.0);
        setIntField(term463391, term463391.getClass(), "type", 44);
        setField(term463391, term463391.getClass(), "next", null);
        setField(term463391, term463391.getClass(), "first", null);
        setField(term463391, term463391.getClass(), "last", null);
        setField(term463391, term463391.getClass(), "propListHead", null);
        setIntField(term463391, term463391.getClass(), "sourcePosition", 0);
        setField(term463391, term463391.getClass(), "jsType", null);
        setField(term463391, term463391.getClass(), "parent", null);
        setField(term463389, term463389.getClass(), "next", term463391);
        setField(term463389, term463389.getClass(), "first", null);
        setField(term463389, term463389.getClass(), "last", null);
        setField(term463389, term463389.getClass(), "propListHead", null);
        setIntField(term463389, term463389.getClass(), "sourcePosition", 0);
        setField(term463389, term463389.getClass(), "jsType", null);
        setField(term463389, term463389.getClass(), "parent", null);
        setField(term463387, term463387.getClass(), "first", term463389);
        setField(term463387, term463387.getClass(), "last", null);
        setField(term463387, term463387.getClass(), "propListHead", null);
        setIntField(term463387, term463387.getClass(), "sourcePosition", 0);
        setField(term463387, term463387.getClass(), "jsType", null);
        setDoubleField(term463397, term463397.getClass(), "number", 0.0);
        setIntField(term463397, term463397.getClass(), "type", 0);
        setField(term463397, term463397.getClass(), "next", null);
        setField(term463397, term463397.getClass(), "first", null);
        setField(term463397, term463397.getClass(), "last", null);
        setField(term463397, term463397.getClass(), "propListHead", null);
        setIntField(term463397, term463397.getClass(), "sourcePosition", 0);
        setField(term463397, term463397.getClass(), "jsType", null);
        setField(term463397, term463397.getClass(), "parent", null);
        setField(term463387, term463387.getClass(), "parent", term463397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term463103;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term463011, args);
        assertTrue(recursiveEquals(term463011, term463462));
        assertTrue(recursiveEquals(term463103, term463463));
        assertTrue(recursiveEquals(retValue, term463387));
    }

};


