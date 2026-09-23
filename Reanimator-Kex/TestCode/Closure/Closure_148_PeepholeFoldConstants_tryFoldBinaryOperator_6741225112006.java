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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112006 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term537072;
     Object term537164;
     Object term537278;
     Object term537279;
     Object term537248;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112006() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term537072 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term537164 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term537234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term537164, term537164.getClass(), "first", term537164);
        setField(term537164, term537164.getClass(), "next", term537234);
        setIntField(term537164, term537164.getClass(), "type", 52);
        term537278 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term537278, term537278.getClass(), "currentTraversal", null);
        term537279 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term537280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term537279, term537279.getClass(), "number", 0.0);
        setIntField(term537279, term537279.getClass(), "type", 52);
        setIntField(term537280, term537280.getClass(), "type", 0);
        setField(term537280, term537280.getClass(), "next", null);
        setField(term537280, term537280.getClass(), "first", null);
        setField(term537280, term537280.getClass(), "last", null);
        setField(term537280, term537280.getClass(), "propListHead", null);
        setIntField(term537280, term537280.getClass(), "sourcePosition", 0);
        setField(term537280, term537280.getClass(), "jsType", null);
        setField(term537280, term537280.getClass(), "parent", null);
        setField(term537279, term537279.getClass(), "next", term537280);
        setField(term537279, term537279.getClass(), "first", term537279);
        setField(term537279, term537279.getClass(), "last", null);
        setField(term537279, term537279.getClass(), "propListHead", null);
        setIntField(term537279, term537279.getClass(), "sourcePosition", 0);
        setField(term537279, term537279.getClass(), "jsType", null);
        setField(term537279, term537279.getClass(), "parent", null);
        term537248 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term537251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term537248, term537248.getClass(), "number", 0.0);
        setIntField(term537248, term537248.getClass(), "type", 52);
        setIntField(term537251, term537251.getClass(), "type", 0);
        setField(term537251, term537251.getClass(), "next", null);
        setField(term537251, term537251.getClass(), "first", null);
        setField(term537251, term537251.getClass(), "last", null);
        setField(term537251, term537251.getClass(), "propListHead", null);
        setIntField(term537251, term537251.getClass(), "sourcePosition", 0);
        setField(term537251, term537251.getClass(), "jsType", null);
        setField(term537251, term537251.getClass(), "parent", null);
        setField(term537248, term537248.getClass(), "next", term537251);
        setField(term537248, term537248.getClass(), "first", term537248);
        setField(term537248, term537248.getClass(), "last", null);
        setField(term537248, term537248.getClass(), "propListHead", null);
        setIntField(term537248, term537248.getClass(), "sourcePosition", 0);
        setField(term537248, term537248.getClass(), "jsType", null);
        setField(term537248, term537248.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term537164;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term537072, args);
        assertTrue(recursiveEquals(term537072, term537278));
        assertTrue(recursiveEquals(term537164, term537279));
        assertTrue(recursiveEquals(retValue, term537248));
    }

};


