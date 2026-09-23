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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164456;
     Object term164548;
     Object term165076;
     Object term165077;
     Object term165023;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164456 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term164548 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term164640 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term164732 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term164732, term164732.getClass(), "type", 42);
        setField(term164640, term164640.getClass(), "next", term164732);
        setIntField(term164640, term164640.getClass(), "type", 42);
        setField(term164548, term164548.getClass(), "first", term164640);
        setIntField(term164548, term164548.getClass(), "type", 14);
        term165076 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term165076, term165076.getClass(), "currentTraversal", null);
        term165077 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term165078 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term165079 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term165077, term165077.getClass(), "number", 0.0);
        setIntField(term165077, term165077.getClass(), "type", 14);
        setField(term165077, term165077.getClass(), "next", null);
        setDoubleField(term165078, term165078.getClass(), "number", 0.0);
        setIntField(term165078, term165078.getClass(), "type", 42);
        setDoubleField(term165079, term165079.getClass(), "number", 0.0);
        setIntField(term165079, term165079.getClass(), "type", 42);
        setField(term165079, term165079.getClass(), "next", null);
        setField(term165079, term165079.getClass(), "first", null);
        setField(term165079, term165079.getClass(), "last", null);
        setField(term165079, term165079.getClass(), "propListHead", null);
        setIntField(term165079, term165079.getClass(), "sourcePosition", 0);
        setField(term165079, term165079.getClass(), "jsType", null);
        setField(term165079, term165079.getClass(), "parent", null);
        setField(term165078, term165078.getClass(), "next", term165079);
        setField(term165078, term165078.getClass(), "first", null);
        setField(term165078, term165078.getClass(), "last", null);
        setField(term165078, term165078.getClass(), "propListHead", null);
        setIntField(term165078, term165078.getClass(), "sourcePosition", 0);
        setField(term165078, term165078.getClass(), "jsType", null);
        setField(term165078, term165078.getClass(), "parent", null);
        setField(term165077, term165077.getClass(), "first", term165078);
        setField(term165077, term165077.getClass(), "last", null);
        setField(term165077, term165077.getClass(), "propListHead", null);
        setIntField(term165077, term165077.getClass(), "sourcePosition", 0);
        setField(term165077, term165077.getClass(), "jsType", null);
        setField(term165077, term165077.getClass(), "parent", null);
        term165023 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term165026 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term165029 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term165023, term165023.getClass(), "number", 0.0);
        setIntField(term165023, term165023.getClass(), "type", 14);
        setField(term165023, term165023.getClass(), "next", null);
        setDoubleField(term165026, term165026.getClass(), "number", 0.0);
        setIntField(term165026, term165026.getClass(), "type", 42);
        setDoubleField(term165029, term165029.getClass(), "number", 0.0);
        setIntField(term165029, term165029.getClass(), "type", 42);
        setField(term165029, term165029.getClass(), "next", null);
        setField(term165029, term165029.getClass(), "first", null);
        setField(term165029, term165029.getClass(), "last", null);
        setField(term165029, term165029.getClass(), "propListHead", null);
        setIntField(term165029, term165029.getClass(), "sourcePosition", 0);
        setField(term165029, term165029.getClass(), "jsType", null);
        setField(term165029, term165029.getClass(), "parent", null);
        setField(term165026, term165026.getClass(), "next", term165029);
        setField(term165026, term165026.getClass(), "first", null);
        setField(term165026, term165026.getClass(), "last", null);
        setField(term165026, term165026.getClass(), "propListHead", null);
        setIntField(term165026, term165026.getClass(), "sourcePosition", 0);
        setField(term165026, term165026.getClass(), "jsType", null);
        setField(term165026, term165026.getClass(), "parent", null);
        setField(term165023, term165023.getClass(), "first", term165026);
        setField(term165023, term165023.getClass(), "last", null);
        setField(term165023, term165023.getClass(), "propListHead", null);
        setIntField(term165023, term165023.getClass(), "sourcePosition", 0);
        setField(term165023, term165023.getClass(), "jsType", null);
        setField(term165023, term165023.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term164548;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term164456, args);
        assertTrue(recursiveEquals(term164456, term165076));
        assertTrue(recursiveEquals(term164548, term165077));
        assertTrue(recursiveEquals(retValue, term165023));
    }

};


