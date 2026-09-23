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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58313;
     Object term58405;
     Object term58632;
     Object term58633;
     Object term58598;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58313 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term58405 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term58497 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term58589 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term58497, term58497.getClass(), "next", term58589);
        setField(term58405, term58405.getClass(), "first", term58497);
        setIntField(term58405, term58405.getClass(), "type", 18);
        term58632 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term58632, term58632.getClass(), "currentTraversal", null);
        term58633 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term58634 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term58635 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term58633, term58633.getClass(), "number", 0.0);
        setIntField(term58633, term58633.getClass(), "type", 18);
        setField(term58633, term58633.getClass(), "next", null);
        setDoubleField(term58634, term58634.getClass(), "number", 0.0);
        setIntField(term58634, term58634.getClass(), "type", 0);
        setDoubleField(term58635, term58635.getClass(), "number", 0.0);
        setIntField(term58635, term58635.getClass(), "type", 0);
        setField(term58635, term58635.getClass(), "next", null);
        setField(term58635, term58635.getClass(), "first", null);
        setField(term58635, term58635.getClass(), "last", null);
        setField(term58635, term58635.getClass(), "propListHead", null);
        setIntField(term58635, term58635.getClass(), "sourcePosition", 0);
        setField(term58635, term58635.getClass(), "jsType", null);
        setField(term58635, term58635.getClass(), "parent", null);
        setField(term58634, term58634.getClass(), "next", term58635);
        setField(term58634, term58634.getClass(), "first", null);
        setField(term58634, term58634.getClass(), "last", null);
        setField(term58634, term58634.getClass(), "propListHead", null);
        setIntField(term58634, term58634.getClass(), "sourcePosition", 0);
        setField(term58634, term58634.getClass(), "jsType", null);
        setField(term58634, term58634.getClass(), "parent", null);
        setField(term58633, term58633.getClass(), "first", term58634);
        setField(term58633, term58633.getClass(), "last", null);
        setField(term58633, term58633.getClass(), "propListHead", null);
        setIntField(term58633, term58633.getClass(), "sourcePosition", 0);
        setField(term58633, term58633.getClass(), "jsType", null);
        setField(term58633, term58633.getClass(), "parent", null);
        term58598 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term58601 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term58604 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term58598, term58598.getClass(), "number", 0.0);
        setIntField(term58598, term58598.getClass(), "type", 18);
        setField(term58598, term58598.getClass(), "next", null);
        setDoubleField(term58601, term58601.getClass(), "number", 0.0);
        setIntField(term58601, term58601.getClass(), "type", 0);
        setDoubleField(term58604, term58604.getClass(), "number", 0.0);
        setIntField(term58604, term58604.getClass(), "type", 0);
        setField(term58604, term58604.getClass(), "next", null);
        setField(term58604, term58604.getClass(), "first", null);
        setField(term58604, term58604.getClass(), "last", null);
        setField(term58604, term58604.getClass(), "propListHead", null);
        setIntField(term58604, term58604.getClass(), "sourcePosition", 0);
        setField(term58604, term58604.getClass(), "jsType", null);
        setField(term58604, term58604.getClass(), "parent", null);
        setField(term58601, term58601.getClass(), "next", term58604);
        setField(term58601, term58601.getClass(), "first", null);
        setField(term58601, term58601.getClass(), "last", null);
        setField(term58601, term58601.getClass(), "propListHead", null);
        setIntField(term58601, term58601.getClass(), "sourcePosition", 0);
        setField(term58601, term58601.getClass(), "jsType", null);
        setField(term58601, term58601.getClass(), "parent", null);
        setField(term58598, term58598.getClass(), "first", term58601);
        setField(term58598, term58598.getClass(), "last", null);
        setField(term58598, term58598.getClass(), "propListHead", null);
        setIntField(term58598, term58598.getClass(), "sourcePosition", 0);
        setField(term58598, term58598.getClass(), "jsType", null);
        setField(term58598, term58598.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term58405;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term58313, args);
        assertTrue(recursiveEquals(term58313, term58632));
        assertTrue(recursiveEquals(term58405, term58633));
        assertTrue(recursiveEquals(retValue, term58598));
    }

};


