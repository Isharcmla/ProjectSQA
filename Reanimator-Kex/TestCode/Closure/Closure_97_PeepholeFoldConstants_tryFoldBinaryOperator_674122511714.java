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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183196;
     Object term183288;
     Object term183440;
     Object term183441;
     Object term183419;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term183196 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term183288 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term183358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term183288, term183288.getClass(), "first", term183288);
        setField(term183288, term183288.getClass(), "next", term183358);
        setIntField(term183288, term183288.getClass(), "type", 22);
        term183440 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term183440, term183440.getClass(), "currentTraversal", null);
        term183441 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term183442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term183441, term183441.getClass(), "str", null);
        setIntField(term183441, term183441.getClass(), "type", 22);
        setIntField(term183442, term183442.getClass(), "type", 0);
        setField(term183442, term183442.getClass(), "next", null);
        setField(term183442, term183442.getClass(), "first", null);
        setField(term183442, term183442.getClass(), "last", null);
        setField(term183442, term183442.getClass(), "propListHead", null);
        setIntField(term183442, term183442.getClass(), "sourcePosition", 0);
        setField(term183442, term183442.getClass(), "jsType", null);
        setField(term183442, term183442.getClass(), "parent", null);
        setField(term183441, term183441.getClass(), "next", term183442);
        setField(term183441, term183441.getClass(), "first", term183441);
        setField(term183441, term183441.getClass(), "last", null);
        setField(term183441, term183441.getClass(), "propListHead", null);
        setIntField(term183441, term183441.getClass(), "sourcePosition", 0);
        setField(term183441, term183441.getClass(), "jsType", null);
        setField(term183441, term183441.getClass(), "parent", null);
        term183419 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term183421 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term183419, term183419.getClass(), "str", null);
        setIntField(term183419, term183419.getClass(), "type", 22);
        setIntField(term183421, term183421.getClass(), "type", 0);
        setField(term183421, term183421.getClass(), "next", null);
        setField(term183421, term183421.getClass(), "first", null);
        setField(term183421, term183421.getClass(), "last", null);
        setField(term183421, term183421.getClass(), "propListHead", null);
        setIntField(term183421, term183421.getClass(), "sourcePosition", 0);
        setField(term183421, term183421.getClass(), "jsType", null);
        setField(term183421, term183421.getClass(), "parent", null);
        setField(term183419, term183419.getClass(), "next", term183421);
        setField(term183419, term183419.getClass(), "first", term183419);
        setField(term183419, term183419.getClass(), "last", null);
        setField(term183419, term183419.getClass(), "propListHead", null);
        setIntField(term183419, term183419.getClass(), "sourcePosition", 0);
        setField(term183419, term183419.getClass(), "jsType", null);
        setField(term183419, term183419.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term183288;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term183196, args);
        assertTrue(recursiveEquals(term183196, term183440));
        assertTrue(recursiveEquals(term183288, term183441));
        assertTrue(recursiveEquals(retValue, term183419));
    }

};


