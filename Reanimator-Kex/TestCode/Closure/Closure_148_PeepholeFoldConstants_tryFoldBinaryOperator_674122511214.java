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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40831;
     Object term40923;
     Object term41185;
     Object term41186;
     Object term41149;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40831 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term40923 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term41015 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term41107 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term41015, term41015.getClass(), "next", term41107);
        setIntField(term41015, term41015.getClass(), "type", 39);
        setField(term40923, term40923.getClass(), "first", term41015);
        setIntField(term40923, term40923.getClass(), "type", 20);
        term41185 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term41185, term41185.getClass(), "currentTraversal", null);
        term41186 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term41187 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term41188 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term41186, term41186.getClass(), "number", 0.0);
        setIntField(term41186, term41186.getClass(), "type", 20);
        setField(term41186, term41186.getClass(), "next", null);
        setDoubleField(term41187, term41187.getClass(), "number", 0.0);
        setIntField(term41187, term41187.getClass(), "type", 39);
        setDoubleField(term41188, term41188.getClass(), "number", 0.0);
        setIntField(term41188, term41188.getClass(), "type", 0);
        setField(term41188, term41188.getClass(), "next", null);
        setField(term41188, term41188.getClass(), "first", null);
        setField(term41188, term41188.getClass(), "last", null);
        setField(term41188, term41188.getClass(), "propListHead", null);
        setIntField(term41188, term41188.getClass(), "sourcePosition", 0);
        setField(term41188, term41188.getClass(), "jsType", null);
        setField(term41188, term41188.getClass(), "parent", null);
        setField(term41187, term41187.getClass(), "next", term41188);
        setField(term41187, term41187.getClass(), "first", null);
        setField(term41187, term41187.getClass(), "last", null);
        setField(term41187, term41187.getClass(), "propListHead", null);
        setIntField(term41187, term41187.getClass(), "sourcePosition", 0);
        setField(term41187, term41187.getClass(), "jsType", null);
        setField(term41187, term41187.getClass(), "parent", null);
        setField(term41186, term41186.getClass(), "first", term41187);
        setField(term41186, term41186.getClass(), "last", null);
        setField(term41186, term41186.getClass(), "propListHead", null);
        setIntField(term41186, term41186.getClass(), "sourcePosition", 0);
        setField(term41186, term41186.getClass(), "jsType", null);
        setField(term41186, term41186.getClass(), "parent", null);
        term41149 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term41152 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term41155 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term41149, term41149.getClass(), "number", 0.0);
        setIntField(term41149, term41149.getClass(), "type", 20);
        setField(term41149, term41149.getClass(), "next", null);
        setDoubleField(term41152, term41152.getClass(), "number", 0.0);
        setIntField(term41152, term41152.getClass(), "type", 39);
        setDoubleField(term41155, term41155.getClass(), "number", 0.0);
        setIntField(term41155, term41155.getClass(), "type", 0);
        setField(term41155, term41155.getClass(), "next", null);
        setField(term41155, term41155.getClass(), "first", null);
        setField(term41155, term41155.getClass(), "last", null);
        setField(term41155, term41155.getClass(), "propListHead", null);
        setIntField(term41155, term41155.getClass(), "sourcePosition", 0);
        setField(term41155, term41155.getClass(), "jsType", null);
        setField(term41155, term41155.getClass(), "parent", null);
        setField(term41152, term41152.getClass(), "next", term41155);
        setField(term41152, term41152.getClass(), "first", null);
        setField(term41152, term41152.getClass(), "last", null);
        setField(term41152, term41152.getClass(), "propListHead", null);
        setIntField(term41152, term41152.getClass(), "sourcePosition", 0);
        setField(term41152, term41152.getClass(), "jsType", null);
        setField(term41152, term41152.getClass(), "parent", null);
        setField(term41149, term41149.getClass(), "first", term41152);
        setField(term41149, term41149.getClass(), "last", null);
        setField(term41149, term41149.getClass(), "propListHead", null);
        setIntField(term41149, term41149.getClass(), "sourcePosition", 0);
        setField(term41149, term41149.getClass(), "jsType", null);
        setField(term41149, term41149.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term40923;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term40831, args);
        assertTrue(recursiveEquals(term40831, term41185));
        assertTrue(recursiveEquals(term40923, term41186));
        assertTrue(recursiveEquals(retValue, term41149));
    }

};


