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

public class PeepholeFoldConstants_tryFoldInstanceof_18306864081326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term438539;
     Object term438631;
     Object term438723;
     Object term438741;
     Object term438742;
     Object term438743;
     Object term438725;

    public PeepholeFoldConstants_tryFoldInstanceof_18306864081326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term438539 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term438631 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term438631, term438631.getClass(), "type", 52);
        term438723 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term438741 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term438741, term438741.getClass(), "currentTraversal", null);
        term438742 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term438742, term438742.getClass(), "number", 0.0);
        setIntField(term438742, term438742.getClass(), "type", 52);
        setField(term438742, term438742.getClass(), "next", null);
        setField(term438742, term438742.getClass(), "first", null);
        setField(term438742, term438742.getClass(), "last", null);
        setField(term438742, term438742.getClass(), "propListHead", null);
        setIntField(term438742, term438742.getClass(), "sourcePosition", 0);
        setField(term438742, term438742.getClass(), "jsType", null);
        setField(term438742, term438742.getClass(), "parent", null);
        term438743 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term438743, term438743.getClass(), "str", null);
        setIntField(term438743, term438743.getClass(), "type", 0);
        setField(term438743, term438743.getClass(), "next", null);
        setField(term438743, term438743.getClass(), "first", null);
        setField(term438743, term438743.getClass(), "last", null);
        setField(term438743, term438743.getClass(), "propListHead", null);
        setIntField(term438743, term438743.getClass(), "sourcePosition", 0);
        setField(term438743, term438743.getClass(), "jsType", null);
        setField(term438743, term438743.getClass(), "parent", null);
        term438725 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term438725, term438725.getClass(), "number", 0.0);
        setIntField(term438725, term438725.getClass(), "type", 52);
        setField(term438725, term438725.getClass(), "next", null);
        setField(term438725, term438725.getClass(), "first", null);
        setField(term438725, term438725.getClass(), "last", null);
        setField(term438725, term438725.getClass(), "propListHead", null);
        setIntField(term438725, term438725.getClass(), "sourcePosition", 0);
        setField(term438725, term438725.getClass(), "jsType", null);
        setField(term438725, term438725.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term438631;
        args[1] = term438723;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldInstanceof", argTypes, term438539, args);
        assertTrue(recursiveEquals(term438539, term438741));
        assertTrue(recursiveEquals(term438631, term438742));
        assertTrue(recursiveEquals(term438723, term438743));
        assertTrue(recursiveEquals(retValue, term438725));
    }

};


