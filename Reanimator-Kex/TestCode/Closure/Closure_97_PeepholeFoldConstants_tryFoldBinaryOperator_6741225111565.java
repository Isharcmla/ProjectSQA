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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term572237;
     Object term572329;
     Object term573036;
     Object term573037;
     Object term572979;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term572237 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term572329 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term572421 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term572513 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term572421, term572421.getClass(), "next", term572513);
        setIntField(term572421, term572421.getClass(), "type", 0);
        setField(term572329, term572329.getClass(), "first", term572421);
        setIntField(term572329, term572329.getClass(), "type", 100);
        setField(term572329, term572329.getClass(), "parent", null);
        term573036 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term573036, term573036.getClass(), "currentTraversal", null);
        term573037 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term573038 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term573039 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term573037, term573037.getClass(), "number", 0.0);
        setIntField(term573037, term573037.getClass(), "type", 100);
        setField(term573037, term573037.getClass(), "next", null);
        setDoubleField(term573038, term573038.getClass(), "number", 0.0);
        setIntField(term573038, term573038.getClass(), "type", 0);
        setField(term573039, term573039.getClass(), "str", null);
        setIntField(term573039, term573039.getClass(), "type", 0);
        setField(term573039, term573039.getClass(), "next", null);
        setField(term573039, term573039.getClass(), "first", null);
        setField(term573039, term573039.getClass(), "last", null);
        setField(term573039, term573039.getClass(), "propListHead", null);
        setIntField(term573039, term573039.getClass(), "sourcePosition", 0);
        setField(term573039, term573039.getClass(), "jsType", null);
        setField(term573039, term573039.getClass(), "parent", null);
        setField(term573038, term573038.getClass(), "next", term573039);
        setField(term573038, term573038.getClass(), "first", null);
        setField(term573038, term573038.getClass(), "last", null);
        setField(term573038, term573038.getClass(), "propListHead", null);
        setIntField(term573038, term573038.getClass(), "sourcePosition", 0);
        setField(term573038, term573038.getClass(), "jsType", null);
        setField(term573038, term573038.getClass(), "parent", null);
        setField(term573037, term573037.getClass(), "first", term573038);
        setField(term573037, term573037.getClass(), "last", null);
        setField(term573037, term573037.getClass(), "propListHead", null);
        setIntField(term573037, term573037.getClass(), "sourcePosition", 0);
        setField(term573037, term573037.getClass(), "jsType", null);
        setField(term573037, term573037.getClass(), "parent", null);
        term572979 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term572982 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term572985 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term572979, term572979.getClass(), "number", 0.0);
        setIntField(term572979, term572979.getClass(), "type", 100);
        setField(term572979, term572979.getClass(), "next", null);
        setDoubleField(term572982, term572982.getClass(), "number", 0.0);
        setIntField(term572982, term572982.getClass(), "type", 0);
        setField(term572985, term572985.getClass(), "str", null);
        setIntField(term572985, term572985.getClass(), "type", 0);
        setField(term572985, term572985.getClass(), "next", null);
        setField(term572985, term572985.getClass(), "first", null);
        setField(term572985, term572985.getClass(), "last", null);
        setField(term572985, term572985.getClass(), "propListHead", null);
        setIntField(term572985, term572985.getClass(), "sourcePosition", 0);
        setField(term572985, term572985.getClass(), "jsType", null);
        setField(term572985, term572985.getClass(), "parent", null);
        setField(term572982, term572982.getClass(), "next", term572985);
        setField(term572982, term572982.getClass(), "first", null);
        setField(term572982, term572982.getClass(), "last", null);
        setField(term572982, term572982.getClass(), "propListHead", null);
        setIntField(term572982, term572982.getClass(), "sourcePosition", 0);
        setField(term572982, term572982.getClass(), "jsType", null);
        setField(term572982, term572982.getClass(), "parent", null);
        setField(term572979, term572979.getClass(), "first", term572982);
        setField(term572979, term572979.getClass(), "last", null);
        setField(term572979, term572979.getClass(), "propListHead", null);
        setIntField(term572979, term572979.getClass(), "sourcePosition", 0);
        setField(term572979, term572979.getClass(), "jsType", null);
        setField(term572979, term572979.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term572329;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term572237, args);
        assertTrue(recursiveEquals(term572237, term573036));
        assertTrue(recursiveEquals(term572329, term573037));
        assertTrue(recursiveEquals(retValue, term572979));
    }

};


