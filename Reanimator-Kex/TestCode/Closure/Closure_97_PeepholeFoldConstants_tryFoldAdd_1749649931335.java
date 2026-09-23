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

public class PeepholeFoldConstants_tryFoldAdd_1749649931335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63871;
     Object term63963;
     Object term64055;
     Object term64147;
     Object term80805;
     Object term80806;
     Object term80807;
     Object term80808;
     Object term80775;

    public PeepholeFoldConstants_tryFoldAdd_1749649931335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63871 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term63963 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term63963, term63963.getClass(), "type", 21);
        term64055 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term64055, term64055.getClass(), "type", 21);
        term64147 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term80805 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term80805, term80805.getClass(), "currentTraversal", null);
        term80806 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term80806, term80806.getClass(), "number", 0.0);
        setIntField(term80806, term80806.getClass(), "type", 21);
        setField(term80806, term80806.getClass(), "next", null);
        setField(term80806, term80806.getClass(), "first", null);
        setField(term80806, term80806.getClass(), "last", null);
        setField(term80806, term80806.getClass(), "propListHead", null);
        setIntField(term80806, term80806.getClass(), "sourcePosition", 0);
        setField(term80806, term80806.getClass(), "jsType", null);
        setField(term80806, term80806.getClass(), "parent", null);
        term80807 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term80807, term80807.getClass(), "number", 0.0);
        setIntField(term80807, term80807.getClass(), "type", 21);
        setField(term80807, term80807.getClass(), "next", null);
        setField(term80807, term80807.getClass(), "first", null);
        setField(term80807, term80807.getClass(), "last", null);
        setField(term80807, term80807.getClass(), "propListHead", null);
        setIntField(term80807, term80807.getClass(), "sourcePosition", 0);
        setField(term80807, term80807.getClass(), "jsType", null);
        setField(term80807, term80807.getClass(), "parent", null);
        term80808 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term80808, term80808.getClass(), "number", 0.0);
        setIntField(term80808, term80808.getClass(), "type", 0);
        setField(term80808, term80808.getClass(), "next", null);
        setField(term80808, term80808.getClass(), "first", null);
        setField(term80808, term80808.getClass(), "last", null);
        setField(term80808, term80808.getClass(), "propListHead", null);
        setIntField(term80808, term80808.getClass(), "sourcePosition", 0);
        setField(term80808, term80808.getClass(), "jsType", null);
        setField(term80808, term80808.getClass(), "parent", null);
        term80775 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term80775, term80775.getClass(), "number", 0.0);
        setIntField(term80775, term80775.getClass(), "type", 21);
        setField(term80775, term80775.getClass(), "next", null);
        setField(term80775, term80775.getClass(), "first", null);
        setField(term80775, term80775.getClass(), "last", null);
        setField(term80775, term80775.getClass(), "propListHead", null);
        setIntField(term80775, term80775.getClass(), "sourcePosition", 0);
        setField(term80775, term80775.getClass(), "jsType", null);
        setField(term80775, term80775.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term63963;
        args[1] = term64055;
        args[2] = term64147;
        Object retValue = callMethod(klass, "tryFoldAdd", argTypes, term63871, args);
        assertTrue(recursiveEquals(term63871, term80805));
        assertTrue(recursiveEquals(term63963, term80806));
        assertTrue(recursiveEquals(term64055, term80807));
        assertTrue(recursiveEquals(term64147, term80808));
        assertTrue(recursiveEquals(retValue, term80775));
    }

};


