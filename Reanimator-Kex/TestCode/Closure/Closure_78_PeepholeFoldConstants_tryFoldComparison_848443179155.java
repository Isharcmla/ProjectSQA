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

public class PeepholeFoldConstants_tryFoldComparison_848443179155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25614;
     Object term25706;
     Object term25798;
     Object term26106;
     Object term26107;
     Object term26108;
     Object term26099;

    public PeepholeFoldConstants_tryFoldComparison_848443179155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25614 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term25706 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term25798 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term25798, term25798.getClass(), "type", 0);
        term26106 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term26106, term26106.getClass(), "currentTraversal", null);
        term26107 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term26107, term26107.getClass(), "str", null);
        setIntField(term26107, term26107.getClass(), "type", 0);
        setField(term26107, term26107.getClass(), "next", null);
        setField(term26107, term26107.getClass(), "first", null);
        setField(term26107, term26107.getClass(), "last", null);
        setField(term26107, term26107.getClass(), "propListHead", null);
        setIntField(term26107, term26107.getClass(), "sourcePosition", 0);
        setField(term26107, term26107.getClass(), "jsType", null);
        setField(term26107, term26107.getClass(), "parent", null);
        term26108 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term26108, term26108.getClass(), "str", null);
        setIntField(term26108, term26108.getClass(), "type", 0);
        setField(term26108, term26108.getClass(), "next", null);
        setField(term26108, term26108.getClass(), "first", null);
        setField(term26108, term26108.getClass(), "last", null);
        setField(term26108, term26108.getClass(), "propListHead", null);
        setIntField(term26108, term26108.getClass(), "sourcePosition", 0);
        setField(term26108, term26108.getClass(), "jsType", null);
        setField(term26108, term26108.getClass(), "parent", null);
        term26099 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term26099, term26099.getClass(), "str", null);
        setIntField(term26099, term26099.getClass(), "type", 0);
        setField(term26099, term26099.getClass(), "next", null);
        setField(term26099, term26099.getClass(), "first", null);
        setField(term26099, term26099.getClass(), "last", null);
        setField(term26099, term26099.getClass(), "propListHead", null);
        setIntField(term26099, term26099.getClass(), "sourcePosition", 0);
        setField(term26099, term26099.getClass(), "jsType", null);
        setField(term26099, term26099.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term25706;
        args[1] = term25798;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term25614, args);
        assertTrue(recursiveEquals(term25614, term26106));
        assertTrue(recursiveEquals(term25706, term26107));
        assertTrue(recursiveEquals(term25798, term26108));
        assertTrue(recursiveEquals(retValue, term26099));
    }

};


