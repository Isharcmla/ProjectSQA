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

public class PeepholeFoldConstants_optimizeSubtree_1606506993207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34012;
     Object term34082;
     Object term34093;
     Object term34094;
     Object term34084;

    public PeepholeFoldConstants_optimizeSubtree_1606506993207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34012 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term34082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34082, term34082.getClass(), "type", 15);
        term34093 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term34093, term34093.getClass(), "currentTraversal", null);
        term34094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34094, term34094.getClass(), "type", 15);
        setField(term34094, term34094.getClass(), "next", null);
        setField(term34094, term34094.getClass(), "first", null);
        setField(term34094, term34094.getClass(), "last", null);
        setField(term34094, term34094.getClass(), "propListHead", null);
        setIntField(term34094, term34094.getClass(), "sourcePosition", 0);
        setField(term34094, term34094.getClass(), "jsType", null);
        setField(term34094, term34094.getClass(), "parent", null);
        term34084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34084, term34084.getClass(), "type", 15);
        setField(term34084, term34084.getClass(), "next", null);
        setField(term34084, term34084.getClass(), "first", null);
        setField(term34084, term34084.getClass(), "last", null);
        setField(term34084, term34084.getClass(), "propListHead", null);
        setIntField(term34084, term34084.getClass(), "sourcePosition", 0);
        setField(term34084, term34084.getClass(), "jsType", null);
        setField(term34084, term34084.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term34082;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term34012, args);
        assertTrue(recursiveEquals(term34012, term34093));
        assertTrue(recursiveEquals(term34082, term34094));
        assertTrue(recursiveEquals(retValue, term34084));
    }

};


