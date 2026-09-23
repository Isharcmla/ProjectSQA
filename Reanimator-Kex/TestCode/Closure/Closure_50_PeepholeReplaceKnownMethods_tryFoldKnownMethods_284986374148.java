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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38272;
     Object term38364;
     Object term38378;
     Object term38379;
     Object term38365;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38272 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term38364 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term38364, term38364.getClass(), "first", null);
        term38378 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term38378, term38378.getClass(), "currentTraversal", null);
        term38379 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term38379, term38379.getClass(), "str", null);
        setIntField(term38379, term38379.getClass(), "type", 0);
        setField(term38379, term38379.getClass(), "next", null);
        setField(term38379, term38379.getClass(), "first", null);
        setField(term38379, term38379.getClass(), "last", null);
        setField(term38379, term38379.getClass(), "propListHead", null);
        setIntField(term38379, term38379.getClass(), "sourcePosition", 0);
        setField(term38379, term38379.getClass(), "jsType", null);
        setField(term38379, term38379.getClass(), "parent", null);
        term38365 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term38365, term38365.getClass(), "str", null);
        setIntField(term38365, term38365.getClass(), "type", 0);
        setField(term38365, term38365.getClass(), "next", null);
        setField(term38365, term38365.getClass(), "first", null);
        setField(term38365, term38365.getClass(), "last", null);
        setField(term38365, term38365.getClass(), "propListHead", null);
        setIntField(term38365, term38365.getClass(), "sourcePosition", 0);
        setField(term38365, term38365.getClass(), "jsType", null);
        setField(term38365, term38365.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term38364;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term38272, args);
        assertTrue(recursiveEquals(term38272, term38378));
        assertTrue(recursiveEquals(term38364, term38379));
        assertTrue(recursiveEquals(retValue, term38365));
    }

};


