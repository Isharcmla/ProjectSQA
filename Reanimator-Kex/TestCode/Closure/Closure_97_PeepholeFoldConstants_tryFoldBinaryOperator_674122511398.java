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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92343;
     Object term92435;
     Object term92633;
     Object term92634;
     Object term92603;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92343 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term92435 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term92527 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term92435, term92435.getClass(), "first", term92435);
        setField(term92435, term92435.getClass(), "next", term92527);
        setIntField(term92435, term92435.getClass(), "type", 33);
        term92633 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term92633, term92633.getClass(), "currentTraversal", null);
        term92634 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term92635 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term92634, term92634.getClass(), "number", 0.0);
        setIntField(term92634, term92634.getClass(), "type", 33);
        setDoubleField(term92635, term92635.getClass(), "number", 0.0);
        setIntField(term92635, term92635.getClass(), "type", 0);
        setField(term92635, term92635.getClass(), "next", null);
        setField(term92635, term92635.getClass(), "first", null);
        setField(term92635, term92635.getClass(), "last", null);
        setField(term92635, term92635.getClass(), "propListHead", null);
        setIntField(term92635, term92635.getClass(), "sourcePosition", 0);
        setField(term92635, term92635.getClass(), "jsType", null);
        setField(term92635, term92635.getClass(), "parent", null);
        setField(term92634, term92634.getClass(), "next", term92635);
        setField(term92634, term92634.getClass(), "first", term92634);
        setField(term92634, term92634.getClass(), "last", null);
        setField(term92634, term92634.getClass(), "propListHead", null);
        setIntField(term92634, term92634.getClass(), "sourcePosition", 0);
        setField(term92634, term92634.getClass(), "jsType", null);
        setField(term92634, term92634.getClass(), "parent", null);
        term92603 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term92606 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term92603, term92603.getClass(), "number", 0.0);
        setIntField(term92603, term92603.getClass(), "type", 33);
        setDoubleField(term92606, term92606.getClass(), "number", 0.0);
        setIntField(term92606, term92606.getClass(), "type", 0);
        setField(term92606, term92606.getClass(), "next", null);
        setField(term92606, term92606.getClass(), "first", null);
        setField(term92606, term92606.getClass(), "last", null);
        setField(term92606, term92606.getClass(), "propListHead", null);
        setIntField(term92606, term92606.getClass(), "sourcePosition", 0);
        setField(term92606, term92606.getClass(), "jsType", null);
        setField(term92606, term92606.getClass(), "parent", null);
        setField(term92603, term92603.getClass(), "next", term92606);
        setField(term92603, term92603.getClass(), "first", term92603);
        setField(term92603, term92603.getClass(), "last", null);
        setField(term92603, term92603.getClass(), "propListHead", null);
        setIntField(term92603, term92603.getClass(), "sourcePosition", 0);
        setField(term92603, term92603.getClass(), "jsType", null);
        setField(term92603, term92603.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term92435;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term92343, args);
        assertTrue(recursiveEquals(term92343, term92633));
        assertTrue(recursiveEquals(term92435, term92634));
        assertTrue(recursiveEquals(retValue, term92603));
    }

};


