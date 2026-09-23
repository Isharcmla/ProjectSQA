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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148863;
     Object term148955;
     Object term149540;
     Object term149541;
     Object term149513;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148863 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term148955 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term149047 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term149139 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term149047, term149047.getClass(), "next", term149139);
        setField(term148955, term148955.getClass(), "first", term149047);
        setIntField(term148955, term148955.getClass(), "type", 19);
        term149540 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term149540, term149540.getClass(), "currentTraversal", null);
        term149541 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term149542 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term149543 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term149541, term149541.getClass(), "str", null);
        setIntField(term149541, term149541.getClass(), "type", 19);
        setField(term149541, term149541.getClass(), "next", null);
        setField(term149542, term149542.getClass(), "str", null);
        setIntField(term149542, term149542.getClass(), "type", 0);
        setField(term149543, term149543.getClass(), "str", null);
        setIntField(term149543, term149543.getClass(), "type", 0);
        setField(term149543, term149543.getClass(), "next", null);
        setField(term149543, term149543.getClass(), "first", null);
        setField(term149543, term149543.getClass(), "last", null);
        setField(term149543, term149543.getClass(), "propListHead", null);
        setIntField(term149543, term149543.getClass(), "sourcePosition", 0);
        setField(term149543, term149543.getClass(), "jsType", null);
        setField(term149543, term149543.getClass(), "parent", null);
        setField(term149542, term149542.getClass(), "next", term149543);
        setField(term149542, term149542.getClass(), "first", null);
        setField(term149542, term149542.getClass(), "last", null);
        setField(term149542, term149542.getClass(), "propListHead", null);
        setIntField(term149542, term149542.getClass(), "sourcePosition", 0);
        setField(term149542, term149542.getClass(), "jsType", null);
        setField(term149542, term149542.getClass(), "parent", null);
        setField(term149541, term149541.getClass(), "first", term149542);
        setField(term149541, term149541.getClass(), "last", null);
        setField(term149541, term149541.getClass(), "propListHead", null);
        setIntField(term149541, term149541.getClass(), "sourcePosition", 0);
        setField(term149541, term149541.getClass(), "jsType", null);
        setField(term149541, term149541.getClass(), "parent", null);
        term149513 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term149515 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term149517 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term149513, term149513.getClass(), "str", null);
        setIntField(term149513, term149513.getClass(), "type", 19);
        setField(term149513, term149513.getClass(), "next", null);
        setField(term149515, term149515.getClass(), "str", null);
        setIntField(term149515, term149515.getClass(), "type", 0);
        setField(term149517, term149517.getClass(), "str", null);
        setIntField(term149517, term149517.getClass(), "type", 0);
        setField(term149517, term149517.getClass(), "next", null);
        setField(term149517, term149517.getClass(), "first", null);
        setField(term149517, term149517.getClass(), "last", null);
        setField(term149517, term149517.getClass(), "propListHead", null);
        setIntField(term149517, term149517.getClass(), "sourcePosition", 0);
        setField(term149517, term149517.getClass(), "jsType", null);
        setField(term149517, term149517.getClass(), "parent", null);
        setField(term149515, term149515.getClass(), "next", term149517);
        setField(term149515, term149515.getClass(), "first", null);
        setField(term149515, term149515.getClass(), "last", null);
        setField(term149515, term149515.getClass(), "propListHead", null);
        setIntField(term149515, term149515.getClass(), "sourcePosition", 0);
        setField(term149515, term149515.getClass(), "jsType", null);
        setField(term149515, term149515.getClass(), "parent", null);
        setField(term149513, term149513.getClass(), "first", term149515);
        setField(term149513, term149513.getClass(), "last", null);
        setField(term149513, term149513.getClass(), "propListHead", null);
        setIntField(term149513, term149513.getClass(), "sourcePosition", 0);
        setField(term149513, term149513.getClass(), "jsType", null);
        setField(term149513, term149513.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term148955;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term148863, args);
        assertTrue(recursiveEquals(term148863, term149540));
        assertTrue(recursiveEquals(term148955, term149541));
        assertTrue(recursiveEquals(retValue, term149513));
    }

};


