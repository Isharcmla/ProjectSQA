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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511986 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term311813;
     Object term311905;
     Object term312186;
     Object term312187;
     Object term312146;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511986() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term311813 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term311905 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term311997 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term312089 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term311997, term311997.getClass(), "next", term312089);
        setIntField(term311997, term311997.getClass(), "type", 63);
        setField(term311905, term311905.getClass(), "first", term311997);
        setIntField(term311905, term311905.getClass(), "type", 35);
        term312186 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term312186, term312186.getClass(), "currentTraversal", null);
        term312187 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term312188 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term312189 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term312187, term312187.getClass(), "number", 0.0);
        setIntField(term312187, term312187.getClass(), "type", 35);
        setField(term312187, term312187.getClass(), "next", null);
        setDoubleField(term312188, term312188.getClass(), "number", 0.0);
        setIntField(term312188, term312188.getClass(), "type", 63);
        setDoubleField(term312189, term312189.getClass(), "number", 0.0);
        setIntField(term312189, term312189.getClass(), "type", 0);
        setField(term312189, term312189.getClass(), "next", null);
        setField(term312189, term312189.getClass(), "first", null);
        setField(term312189, term312189.getClass(), "last", null);
        setField(term312189, term312189.getClass(), "propListHead", null);
        setIntField(term312189, term312189.getClass(), "sourcePosition", 0);
        setField(term312189, term312189.getClass(), "jsType", null);
        setField(term312189, term312189.getClass(), "parent", null);
        setField(term312188, term312188.getClass(), "next", term312189);
        setField(term312188, term312188.getClass(), "first", null);
        setField(term312188, term312188.getClass(), "last", null);
        setField(term312188, term312188.getClass(), "propListHead", null);
        setIntField(term312188, term312188.getClass(), "sourcePosition", 0);
        setField(term312188, term312188.getClass(), "jsType", null);
        setField(term312188, term312188.getClass(), "parent", null);
        setField(term312187, term312187.getClass(), "first", term312188);
        setField(term312187, term312187.getClass(), "last", null);
        setField(term312187, term312187.getClass(), "propListHead", null);
        setIntField(term312187, term312187.getClass(), "sourcePosition", 0);
        setField(term312187, term312187.getClass(), "jsType", null);
        setField(term312187, term312187.getClass(), "parent", null);
        term312146 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term312149 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term312152 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term312146, term312146.getClass(), "number", 0.0);
        setIntField(term312146, term312146.getClass(), "type", 35);
        setField(term312146, term312146.getClass(), "next", null);
        setDoubleField(term312149, term312149.getClass(), "number", 0.0);
        setIntField(term312149, term312149.getClass(), "type", 63);
        setDoubleField(term312152, term312152.getClass(), "number", 0.0);
        setIntField(term312152, term312152.getClass(), "type", 0);
        setField(term312152, term312152.getClass(), "next", null);
        setField(term312152, term312152.getClass(), "first", null);
        setField(term312152, term312152.getClass(), "last", null);
        setField(term312152, term312152.getClass(), "propListHead", null);
        setIntField(term312152, term312152.getClass(), "sourcePosition", 0);
        setField(term312152, term312152.getClass(), "jsType", null);
        setField(term312152, term312152.getClass(), "parent", null);
        setField(term312149, term312149.getClass(), "next", term312152);
        setField(term312149, term312149.getClass(), "first", null);
        setField(term312149, term312149.getClass(), "last", null);
        setField(term312149, term312149.getClass(), "propListHead", null);
        setIntField(term312149, term312149.getClass(), "sourcePosition", 0);
        setField(term312149, term312149.getClass(), "jsType", null);
        setField(term312149, term312149.getClass(), "parent", null);
        setField(term312146, term312146.getClass(), "first", term312149);
        setField(term312146, term312146.getClass(), "last", null);
        setField(term312146, term312146.getClass(), "propListHead", null);
        setIntField(term312146, term312146.getClass(), "sourcePosition", 0);
        setField(term312146, term312146.getClass(), "jsType", null);
        setField(term312146, term312146.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term311905;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term311813, args);
        assertTrue(recursiveEquals(term311813, term312186));
        assertTrue(recursiveEquals(term311905, term312187));
        assertTrue(recursiveEquals(retValue, term312146));
    }

};


