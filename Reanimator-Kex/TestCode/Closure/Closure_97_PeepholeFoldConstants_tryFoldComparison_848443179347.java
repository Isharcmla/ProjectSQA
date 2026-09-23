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

public class PeepholeFoldConstants_tryFoldComparison_848443179347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68412;
     Object term68504;
     Object term68596;
     Object term68688;
     Object term81814;
     Object term81815;
     Object term81816;
     Object term81817;
     Object term81794;

    public PeepholeFoldConstants_tryFoldComparison_848443179347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68412 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term68504 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term68504, term68504.getClass(), "type", 16);
        term68596 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term68596, term68596.getClass(), "type", 42);
        term68688 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term68688, term68688.getClass(), "type", 42);
        term81814 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term81814, term81814.getClass(), "currentTraversal", null);
        term81815 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term81815, term81815.getClass(), "str", null);
        setIntField(term81815, term81815.getClass(), "type", 42);
        setField(term81815, term81815.getClass(), "next", null);
        setField(term81815, term81815.getClass(), "first", null);
        setField(term81815, term81815.getClass(), "last", null);
        setField(term81815, term81815.getClass(), "propListHead", null);
        setIntField(term81815, term81815.getClass(), "sourcePosition", 0);
        setField(term81815, term81815.getClass(), "jsType", null);
        setField(term81815, term81815.getClass(), "parent", null);
        term81816 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term81816, term81816.getClass(), "str", null);
        setIntField(term81816, term81816.getClass(), "type", 16);
        setField(term81816, term81816.getClass(), "next", null);
        setField(term81816, term81816.getClass(), "first", null);
        setField(term81816, term81816.getClass(), "last", null);
        setField(term81816, term81816.getClass(), "propListHead", null);
        setIntField(term81816, term81816.getClass(), "sourcePosition", 0);
        setField(term81816, term81816.getClass(), "jsType", null);
        setField(term81816, term81816.getClass(), "parent", null);
        term81817 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term81817, term81817.getClass(), "str", null);
        setIntField(term81817, term81817.getClass(), "type", 42);
        setField(term81817, term81817.getClass(), "next", null);
        setField(term81817, term81817.getClass(), "first", null);
        setField(term81817, term81817.getClass(), "last", null);
        setField(term81817, term81817.getClass(), "propListHead", null);
        setIntField(term81817, term81817.getClass(), "sourcePosition", 0);
        setField(term81817, term81817.getClass(), "jsType", null);
        setField(term81817, term81817.getClass(), "parent", null);
        term81794 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term81794, term81794.getClass(), "str", null);
        setIntField(term81794, term81794.getClass(), "type", 16);
        setField(term81794, term81794.getClass(), "next", null);
        setField(term81794, term81794.getClass(), "first", null);
        setField(term81794, term81794.getClass(), "last", null);
        setField(term81794, term81794.getClass(), "propListHead", null);
        setIntField(term81794, term81794.getClass(), "sourcePosition", 0);
        setField(term81794, term81794.getClass(), "jsType", null);
        setField(term81794, term81794.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term68504;
        args[1] = term68596;
        args[2] = term68688;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term68412, args);
        assertTrue(recursiveEquals(term68412, term81814));
        assertTrue(recursiveEquals(term68504, term81815));
        assertTrue(recursiveEquals(term68596, term81816));
        assertTrue(recursiveEquals(term68688, term81817));
        assertTrue(recursiveEquals(retValue, term81794));
    }

};


