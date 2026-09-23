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

public class PeepholeFoldConstants_tryFoldComparison_848443179738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165291;
     Object term165383;
     Object term165475;
     Object term165567;
     Object term165600;
     Object term165601;
     Object term165602;
     Object term165603;
     Object term165578;

    public PeepholeFoldConstants_tryFoldComparison_848443179738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165291 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term165383 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term165383, term165383.getClass(), "type", 16);
        term165475 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term165475, term165475.getClass(), "type", 42);
        term165567 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term165567, term165567.getClass(), "type", 42);
        term165600 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term165600, term165600.getClass(), "currentTraversal", null);
        term165601 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term165601, term165601.getClass(), "number", 0.0);
        setIntField(term165601, term165601.getClass(), "type", 42);
        setField(term165601, term165601.getClass(), "next", null);
        setField(term165601, term165601.getClass(), "first", null);
        setField(term165601, term165601.getClass(), "last", null);
        setField(term165601, term165601.getClass(), "propListHead", null);
        setIntField(term165601, term165601.getClass(), "sourcePosition", 0);
        setField(term165601, term165601.getClass(), "jsType", null);
        setField(term165601, term165601.getClass(), "parent", null);
        term165602 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term165602, term165602.getClass(), "number", 0.0);
        setIntField(term165602, term165602.getClass(), "type", 16);
        setField(term165602, term165602.getClass(), "next", null);
        setField(term165602, term165602.getClass(), "first", null);
        setField(term165602, term165602.getClass(), "last", null);
        setField(term165602, term165602.getClass(), "propListHead", null);
        setIntField(term165602, term165602.getClass(), "sourcePosition", 0);
        setField(term165602, term165602.getClass(), "jsType", null);
        setField(term165602, term165602.getClass(), "parent", null);
        term165603 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term165603, term165603.getClass(), "number", 0.0);
        setIntField(term165603, term165603.getClass(), "type", 42);
        setField(term165603, term165603.getClass(), "next", null);
        setField(term165603, term165603.getClass(), "first", null);
        setField(term165603, term165603.getClass(), "last", null);
        setField(term165603, term165603.getClass(), "propListHead", null);
        setIntField(term165603, term165603.getClass(), "sourcePosition", 0);
        setField(term165603, term165603.getClass(), "jsType", null);
        setField(term165603, term165603.getClass(), "parent", null);
        term165578 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term165578, term165578.getClass(), "number", 0.0);
        setIntField(term165578, term165578.getClass(), "type", 16);
        setField(term165578, term165578.getClass(), "next", null);
        setField(term165578, term165578.getClass(), "first", null);
        setField(term165578, term165578.getClass(), "last", null);
        setField(term165578, term165578.getClass(), "propListHead", null);
        setIntField(term165578, term165578.getClass(), "sourcePosition", 0);
        setField(term165578, term165578.getClass(), "jsType", null);
        setField(term165578, term165578.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term165383;
        args[1] = term165475;
        args[2] = term165567;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term165291, args);
        assertTrue(recursiveEquals(term165291, term165600));
        assertTrue(recursiveEquals(term165383, term165601));
        assertTrue(recursiveEquals(term165475, term165602));
        assertTrue(recursiveEquals(term165567, term165603));
        assertTrue(recursiveEquals(retValue, term165578));
    }

};


