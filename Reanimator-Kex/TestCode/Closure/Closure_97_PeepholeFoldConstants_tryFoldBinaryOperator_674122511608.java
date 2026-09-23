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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511608 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159230;
     Object term159322;
     Object term159614;
     Object term159615;
     Object term159556;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511608() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159230 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term159322 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term159392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term159484 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term159392, term159392.getClass(), "next", term159484);
        setIntField(term159392, term159392.getClass(), "type", 0);
        setField(term159322, term159322.getClass(), "first", term159392);
        setIntField(term159322, term159322.getClass(), "type", 100);
        setField(term159322, term159322.getClass(), "parent", null);
        term159614 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term159614, term159614.getClass(), "currentTraversal", null);
        term159615 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term159616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term159617 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term159615, term159615.getClass(), "number", 0.0);
        setIntField(term159615, term159615.getClass(), "type", 100);
        setField(term159615, term159615.getClass(), "next", null);
        setIntField(term159616, term159616.getClass(), "type", 0);
        setDoubleField(term159617, term159617.getClass(), "number", 0.0);
        setIntField(term159617, term159617.getClass(), "type", 0);
        setField(term159617, term159617.getClass(), "next", null);
        setField(term159617, term159617.getClass(), "first", null);
        setField(term159617, term159617.getClass(), "last", null);
        setField(term159617, term159617.getClass(), "propListHead", null);
        setIntField(term159617, term159617.getClass(), "sourcePosition", 0);
        setField(term159617, term159617.getClass(), "jsType", null);
        setField(term159617, term159617.getClass(), "parent", null);
        setField(term159616, term159616.getClass(), "next", term159617);
        setField(term159616, term159616.getClass(), "first", null);
        setField(term159616, term159616.getClass(), "last", null);
        setField(term159616, term159616.getClass(), "propListHead", null);
        setIntField(term159616, term159616.getClass(), "sourcePosition", 0);
        setField(term159616, term159616.getClass(), "jsType", null);
        setField(term159616, term159616.getClass(), "parent", null);
        setField(term159615, term159615.getClass(), "first", term159616);
        setField(term159615, term159615.getClass(), "last", null);
        setField(term159615, term159615.getClass(), "propListHead", null);
        setIntField(term159615, term159615.getClass(), "sourcePosition", 0);
        setField(term159615, term159615.getClass(), "jsType", null);
        setField(term159615, term159615.getClass(), "parent", null);
        term159556 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term159559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term159561 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term159556, term159556.getClass(), "number", 0.0);
        setIntField(term159556, term159556.getClass(), "type", 100);
        setField(term159556, term159556.getClass(), "next", null);
        setIntField(term159559, term159559.getClass(), "type", 0);
        setDoubleField(term159561, term159561.getClass(), "number", 0.0);
        setIntField(term159561, term159561.getClass(), "type", 0);
        setField(term159561, term159561.getClass(), "next", null);
        setField(term159561, term159561.getClass(), "first", null);
        setField(term159561, term159561.getClass(), "last", null);
        setField(term159561, term159561.getClass(), "propListHead", null);
        setIntField(term159561, term159561.getClass(), "sourcePosition", 0);
        setField(term159561, term159561.getClass(), "jsType", null);
        setField(term159561, term159561.getClass(), "parent", null);
        setField(term159559, term159559.getClass(), "next", term159561);
        setField(term159559, term159559.getClass(), "first", null);
        setField(term159559, term159559.getClass(), "last", null);
        setField(term159559, term159559.getClass(), "propListHead", null);
        setIntField(term159559, term159559.getClass(), "sourcePosition", 0);
        setField(term159559, term159559.getClass(), "jsType", null);
        setField(term159559, term159559.getClass(), "parent", null);
        setField(term159556, term159556.getClass(), "first", term159559);
        setField(term159556, term159556.getClass(), "last", null);
        setField(term159556, term159556.getClass(), "propListHead", null);
        setIntField(term159556, term159556.getClass(), "sourcePosition", 0);
        setField(term159556, term159556.getClass(), "jsType", null);
        setField(term159556, term159556.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term159322;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term159230, args);
        assertTrue(recursiveEquals(term159230, term159614));
        assertTrue(recursiveEquals(term159322, term159615));
        assertTrue(recursiveEquals(retValue, term159556));
    }

};


