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

public class PeepholeFoldConstants_tryFoldAndOr_425870290132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23444;
     Object term23582;
     Object term23674;
     Object term23755;
     Object term23756;
     Object term23757;
     Object term23758;
     Object term23718;

    public PeepholeFoldConstants_tryFoldAndOr_425870290132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23444 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term23582 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term23582, term23582.getClass(), "parent", null);
        setIntField(term23582, term23582.getClass(), "type", 0);
        term23674 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term23755 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term23755, term23755.getClass(), "currentTraversal", null);
        term23756 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term23756, term23756.getClass(), "number", 0.0);
        setIntField(term23756, term23756.getClass(), "type", 0);
        setField(term23756, term23756.getClass(), "next", null);
        setField(term23756, term23756.getClass(), "first", null);
        setField(term23756, term23756.getClass(), "last", null);
        setField(term23756, term23756.getClass(), "propListHead", null);
        setIntField(term23756, term23756.getClass(), "sourcePosition", 0);
        setField(term23756, term23756.getClass(), "jsType", null);
        setField(term23756, term23756.getClass(), "parent", null);
        term23757 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term23757, term23757.getClass(), "number", 0.0);
        setIntField(term23757, term23757.getClass(), "type", 0);
        setField(term23757, term23757.getClass(), "next", null);
        setField(term23757, term23757.getClass(), "first", null);
        setField(term23757, term23757.getClass(), "last", null);
        setField(term23757, term23757.getClass(), "propListHead", null);
        setIntField(term23757, term23757.getClass(), "sourcePosition", 0);
        setField(term23757, term23757.getClass(), "jsType", null);
        setField(term23757, term23757.getClass(), "parent", null);
        term23758 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term23758, term23758.getClass(), "number", 0.0);
        setIntField(term23758, term23758.getClass(), "type", 0);
        setField(term23758, term23758.getClass(), "next", null);
        setField(term23758, term23758.getClass(), "first", null);
        setField(term23758, term23758.getClass(), "last", null);
        setField(term23758, term23758.getClass(), "propListHead", null);
        setIntField(term23758, term23758.getClass(), "sourcePosition", 0);
        setField(term23758, term23758.getClass(), "jsType", null);
        setField(term23758, term23758.getClass(), "parent", null);
        term23718 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term23718, term23718.getClass(), "number", 0.0);
        setIntField(term23718, term23718.getClass(), "type", 0);
        setField(term23718, term23718.getClass(), "next", null);
        setField(term23718, term23718.getClass(), "first", null);
        setField(term23718, term23718.getClass(), "last", null);
        setField(term23718, term23718.getClass(), "propListHead", null);
        setIntField(term23718, term23718.getClass(), "sourcePosition", 0);
        setField(term23718, term23718.getClass(), "jsType", null);
        setField(term23718, term23718.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term23582;
        args[1] = term23582;
        args[2] = term23674;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term23444, args);
        assertTrue(recursiveEquals(term23444, term23755));
        assertTrue(recursiveEquals(term23582, term23756));
        assertTrue(recursiveEquals(term23582, term23757));
        assertTrue(recursiveEquals(term23674, term23758));
        assertTrue(recursiveEquals(retValue, term23718));
    }

};


