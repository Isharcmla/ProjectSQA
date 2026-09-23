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

public class PeepholeFoldConstants_tryFoldComparison_8484431791146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term352900;
     Object term352992;
     Object term353084;
     Object term353176;
     Object term353209;
     Object term353210;
     Object term353211;
     Object term353212;
     Object term353187;

    public PeepholeFoldConstants_tryFoldComparison_8484431791146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term352900 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term352992 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term352992, term352992.getClass(), "type", 14);
        term353084 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term353084, term353084.getClass(), "type", 14);
        term353176 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term353209 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term353209, term353209.getClass(), "currentTraversal", null);
        term353210 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term353210, term353210.getClass(), "number", 0.0);
        setIntField(term353210, term353210.getClass(), "type", 14);
        setField(term353210, term353210.getClass(), "next", null);
        setField(term353210, term353210.getClass(), "first", null);
        setField(term353210, term353210.getClass(), "last", null);
        setField(term353210, term353210.getClass(), "propListHead", null);
        setIntField(term353210, term353210.getClass(), "sourcePosition", 0);
        setField(term353210, term353210.getClass(), "jsType", null);
        setField(term353210, term353210.getClass(), "parent", null);
        term353211 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term353211, term353211.getClass(), "number", 0.0);
        setIntField(term353211, term353211.getClass(), "type", 14);
        setField(term353211, term353211.getClass(), "next", null);
        setField(term353211, term353211.getClass(), "first", null);
        setField(term353211, term353211.getClass(), "last", null);
        setField(term353211, term353211.getClass(), "propListHead", null);
        setIntField(term353211, term353211.getClass(), "sourcePosition", 0);
        setField(term353211, term353211.getClass(), "jsType", null);
        setField(term353211, term353211.getClass(), "parent", null);
        term353212 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term353212, term353212.getClass(), "number", 0.0);
        setIntField(term353212, term353212.getClass(), "type", 0);
        setField(term353212, term353212.getClass(), "next", null);
        setField(term353212, term353212.getClass(), "first", null);
        setField(term353212, term353212.getClass(), "last", null);
        setField(term353212, term353212.getClass(), "propListHead", null);
        setIntField(term353212, term353212.getClass(), "sourcePosition", 0);
        setField(term353212, term353212.getClass(), "jsType", null);
        setField(term353212, term353212.getClass(), "parent", null);
        term353187 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term353187, term353187.getClass(), "number", 0.0);
        setIntField(term353187, term353187.getClass(), "type", 14);
        setField(term353187, term353187.getClass(), "next", null);
        setField(term353187, term353187.getClass(), "first", null);
        setField(term353187, term353187.getClass(), "last", null);
        setField(term353187, term353187.getClass(), "propListHead", null);
        setIntField(term353187, term353187.getClass(), "sourcePosition", 0);
        setField(term353187, term353187.getClass(), "jsType", null);
        setField(term353187, term353187.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term352992;
        args[1] = term353084;
        args[2] = term353176;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term352900, args);
        assertTrue(recursiveEquals(term352900, term353209));
        assertTrue(recursiveEquals(term352992, term353210));
        assertTrue(recursiveEquals(term353084, term353211));
        assertTrue(recursiveEquals(term353176, term353212));
        assertTrue(recursiveEquals(retValue, term353187));
    }

};


