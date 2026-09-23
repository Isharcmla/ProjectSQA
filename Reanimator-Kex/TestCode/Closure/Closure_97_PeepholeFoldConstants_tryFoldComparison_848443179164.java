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

public class PeepholeFoldConstants_tryFoldComparison_848443179164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31867;
     Object term31937;
     Object term32007;
     Object term32077;
     Object term32122;
     Object term32123;
     Object term32124;
     Object term32125;
     Object term32102;

    public PeepholeFoldConstants_tryFoldComparison_848443179164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31867 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term31937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31937, term31937.getClass(), "type", 16);
        term32007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32007, term32007.getClass(), "type", 42);
        term32077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32077, term32077.getClass(), "type", 42);
        term32122 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term32122, term32122.getClass(), "currentTraversal", null);
        term32123 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32123, term32123.getClass(), "type", 42);
        setField(term32123, term32123.getClass(), "next", null);
        setField(term32123, term32123.getClass(), "first", null);
        setField(term32123, term32123.getClass(), "last", null);
        setField(term32123, term32123.getClass(), "propListHead", null);
        setIntField(term32123, term32123.getClass(), "sourcePosition", 0);
        setField(term32123, term32123.getClass(), "jsType", null);
        setField(term32123, term32123.getClass(), "parent", null);
        term32124 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32124, term32124.getClass(), "type", 16);
        setField(term32124, term32124.getClass(), "next", null);
        setField(term32124, term32124.getClass(), "first", null);
        setField(term32124, term32124.getClass(), "last", null);
        setField(term32124, term32124.getClass(), "propListHead", null);
        setIntField(term32124, term32124.getClass(), "sourcePosition", 0);
        setField(term32124, term32124.getClass(), "jsType", null);
        setField(term32124, term32124.getClass(), "parent", null);
        term32125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32125, term32125.getClass(), "type", 42);
        setField(term32125, term32125.getClass(), "next", null);
        setField(term32125, term32125.getClass(), "first", null);
        setField(term32125, term32125.getClass(), "last", null);
        setField(term32125, term32125.getClass(), "propListHead", null);
        setIntField(term32125, term32125.getClass(), "sourcePosition", 0);
        setField(term32125, term32125.getClass(), "jsType", null);
        setField(term32125, term32125.getClass(), "parent", null);
        term32102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32102, term32102.getClass(), "type", 16);
        setField(term32102, term32102.getClass(), "next", null);
        setField(term32102, term32102.getClass(), "first", null);
        setField(term32102, term32102.getClass(), "last", null);
        setField(term32102, term32102.getClass(), "propListHead", null);
        setIntField(term32102, term32102.getClass(), "sourcePosition", 0);
        setField(term32102, term32102.getClass(), "jsType", null);
        setField(term32102, term32102.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term31937;
        args[1] = term32007;
        args[2] = term32077;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term31867, args);
        assertTrue(recursiveEquals(term31867, term32122));
        assertTrue(recursiveEquals(term31937, term32123));
        assertTrue(recursiveEquals(term32007, term32124));
        assertTrue(recursiveEquals(term32077, term32125));
        assertTrue(recursiveEquals(retValue, term32102));
    }

};


