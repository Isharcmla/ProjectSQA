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

public class PeepholeFoldConstants_optimizeSubtree_16065069931011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316664;
     Object term316734;
     Object term317431;
     Object term317432;
     Object term317383;

    public PeepholeFoldConstants_optimizeSubtree_16065069931011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term316664 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term316734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term316804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term316874 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term316734, term316734.getClass(), "type", 35);
        setField(term316804, term316804.getClass(), "next", term316874);
        setIntField(term316804, term316804.getClass(), "type", 63);
        setField(term316734, term316734.getClass(), "first", term316804);
        term317431 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term317431, term317431.getClass(), "currentTraversal", null);
        term317432 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term317433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term317434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term317432, term317432.getClass(), "type", 35);
        setField(term317432, term317432.getClass(), "next", null);
        setIntField(term317433, term317433.getClass(), "type", 63);
        setIntField(term317434, term317434.getClass(), "type", 0);
        setField(term317434, term317434.getClass(), "next", null);
        setField(term317434, term317434.getClass(), "first", null);
        setField(term317434, term317434.getClass(), "last", null);
        setField(term317434, term317434.getClass(), "propListHead", null);
        setIntField(term317434, term317434.getClass(), "sourcePosition", 0);
        setField(term317434, term317434.getClass(), "jsType", null);
        setField(term317434, term317434.getClass(), "parent", null);
        setField(term317433, term317433.getClass(), "next", term317434);
        setField(term317433, term317433.getClass(), "first", null);
        setField(term317433, term317433.getClass(), "last", null);
        setField(term317433, term317433.getClass(), "propListHead", null);
        setIntField(term317433, term317433.getClass(), "sourcePosition", 0);
        setField(term317433, term317433.getClass(), "jsType", null);
        setField(term317433, term317433.getClass(), "parent", null);
        setField(term317432, term317432.getClass(), "first", term317433);
        setField(term317432, term317432.getClass(), "last", null);
        setField(term317432, term317432.getClass(), "propListHead", null);
        setIntField(term317432, term317432.getClass(), "sourcePosition", 0);
        setField(term317432, term317432.getClass(), "jsType", null);
        setField(term317432, term317432.getClass(), "parent", null);
        term317383 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term317385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term317387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term317383, term317383.getClass(), "type", 35);
        setField(term317383, term317383.getClass(), "next", null);
        setIntField(term317385, term317385.getClass(), "type", 63);
        setIntField(term317387, term317387.getClass(), "type", 0);
        setField(term317387, term317387.getClass(), "next", null);
        setField(term317387, term317387.getClass(), "first", null);
        setField(term317387, term317387.getClass(), "last", null);
        setField(term317387, term317387.getClass(), "propListHead", null);
        setIntField(term317387, term317387.getClass(), "sourcePosition", 0);
        setField(term317387, term317387.getClass(), "jsType", null);
        setField(term317387, term317387.getClass(), "parent", null);
        setField(term317385, term317385.getClass(), "next", term317387);
        setField(term317385, term317385.getClass(), "first", null);
        setField(term317385, term317385.getClass(), "last", null);
        setField(term317385, term317385.getClass(), "propListHead", null);
        setIntField(term317385, term317385.getClass(), "sourcePosition", 0);
        setField(term317385, term317385.getClass(), "jsType", null);
        setField(term317385, term317385.getClass(), "parent", null);
        setField(term317383, term317383.getClass(), "first", term317385);
        setField(term317383, term317383.getClass(), "last", null);
        setField(term317383, term317383.getClass(), "propListHead", null);
        setIntField(term317383, term317383.getClass(), "sourcePosition", 0);
        setField(term317383, term317383.getClass(), "jsType", null);
        setField(term317383, term317383.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term316734;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term316664, args);
        assertTrue(recursiveEquals(term316664, term317431));
        assertTrue(recursiveEquals(term316734, term317432));
        assertTrue(recursiveEquals(retValue, term317383));
    }

};


