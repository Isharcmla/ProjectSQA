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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511973 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227299;
     Object term227391;
     Object term228008;
     Object term228009;
     Object term227974;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511973() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227299 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term227391 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term227483 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term227575 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term227483, term227483.getClass(), "next", term227575);
        setField(term227391, term227391.getClass(), "first", term227483);
        setIntField(term227391, term227391.getClass(), "type", 17);
        term228008 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term228008, term228008.getClass(), "currentTraversal", null);
        term228009 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term228010 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term228011 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term228009, term228009.getClass(), "str", null);
        setIntField(term228009, term228009.getClass(), "type", 17);
        setField(term228009, term228009.getClass(), "next", null);
        setField(term228010, term228010.getClass(), "str", null);
        setIntField(term228010, term228010.getClass(), "type", 0);
        setField(term228011, term228011.getClass(), "str", null);
        setIntField(term228011, term228011.getClass(), "type", 0);
        setField(term228011, term228011.getClass(), "next", null);
        setField(term228011, term228011.getClass(), "first", null);
        setField(term228011, term228011.getClass(), "last", null);
        setField(term228011, term228011.getClass(), "propListHead", null);
        setIntField(term228011, term228011.getClass(), "sourcePosition", 0);
        setField(term228011, term228011.getClass(), "jsType", null);
        setField(term228011, term228011.getClass(), "parent", null);
        setField(term228010, term228010.getClass(), "next", term228011);
        setField(term228010, term228010.getClass(), "first", null);
        setField(term228010, term228010.getClass(), "last", null);
        setField(term228010, term228010.getClass(), "propListHead", null);
        setIntField(term228010, term228010.getClass(), "sourcePosition", 0);
        setField(term228010, term228010.getClass(), "jsType", null);
        setField(term228010, term228010.getClass(), "parent", null);
        setField(term228009, term228009.getClass(), "first", term228010);
        setField(term228009, term228009.getClass(), "last", null);
        setField(term228009, term228009.getClass(), "propListHead", null);
        setIntField(term228009, term228009.getClass(), "sourcePosition", 0);
        setField(term228009, term228009.getClass(), "jsType", null);
        setField(term228009, term228009.getClass(), "parent", null);
        term227974 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term227976 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term227978 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term227974, term227974.getClass(), "str", null);
        setIntField(term227974, term227974.getClass(), "type", 17);
        setField(term227974, term227974.getClass(), "next", null);
        setField(term227976, term227976.getClass(), "str", null);
        setIntField(term227976, term227976.getClass(), "type", 0);
        setField(term227978, term227978.getClass(), "str", null);
        setIntField(term227978, term227978.getClass(), "type", 0);
        setField(term227978, term227978.getClass(), "next", null);
        setField(term227978, term227978.getClass(), "first", null);
        setField(term227978, term227978.getClass(), "last", null);
        setField(term227978, term227978.getClass(), "propListHead", null);
        setIntField(term227978, term227978.getClass(), "sourcePosition", 0);
        setField(term227978, term227978.getClass(), "jsType", null);
        setField(term227978, term227978.getClass(), "parent", null);
        setField(term227976, term227976.getClass(), "next", term227978);
        setField(term227976, term227976.getClass(), "first", null);
        setField(term227976, term227976.getClass(), "last", null);
        setField(term227976, term227976.getClass(), "propListHead", null);
        setIntField(term227976, term227976.getClass(), "sourcePosition", 0);
        setField(term227976, term227976.getClass(), "jsType", null);
        setField(term227976, term227976.getClass(), "parent", null);
        setField(term227974, term227974.getClass(), "first", term227976);
        setField(term227974, term227974.getClass(), "last", null);
        setField(term227974, term227974.getClass(), "propListHead", null);
        setIntField(term227974, term227974.getClass(), "sourcePosition", 0);
        setField(term227974, term227974.getClass(), "jsType", null);
        setField(term227974, term227974.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term227391;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term227299, args);
        assertTrue(recursiveEquals(term227299, term228008));
        assertTrue(recursiveEquals(term227391, term228009));
        assertTrue(recursiveEquals(retValue, term227974));
    }

};


