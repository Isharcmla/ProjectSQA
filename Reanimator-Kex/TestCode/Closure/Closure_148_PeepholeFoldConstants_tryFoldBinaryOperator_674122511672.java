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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148458;
     Object term148550;
     Object term149110;
     Object term149111;
     Object term149083;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148458 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term148550 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term148620 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term148550, term148550.getClass(), "first", term148550);
        setField(term148550, term148550.getClass(), "next", term148620);
        setIntField(term148550, term148550.getClass(), "type", 33);
        term149110 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term149110, term149110.getClass(), "currentTraversal", null);
        term149111 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term149112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term149111, term149111.getClass(), "number", 0.0);
        setIntField(term149111, term149111.getClass(), "type", 33);
        setIntField(term149112, term149112.getClass(), "type", 0);
        setField(term149112, term149112.getClass(), "next", null);
        setField(term149112, term149112.getClass(), "first", null);
        setField(term149112, term149112.getClass(), "last", null);
        setField(term149112, term149112.getClass(), "propListHead", null);
        setIntField(term149112, term149112.getClass(), "sourcePosition", 0);
        setField(term149112, term149112.getClass(), "jsType", null);
        setField(term149112, term149112.getClass(), "parent", null);
        setField(term149111, term149111.getClass(), "next", term149112);
        setField(term149111, term149111.getClass(), "first", term149111);
        setField(term149111, term149111.getClass(), "last", null);
        setField(term149111, term149111.getClass(), "propListHead", null);
        setIntField(term149111, term149111.getClass(), "sourcePosition", 0);
        setField(term149111, term149111.getClass(), "jsType", null);
        setField(term149111, term149111.getClass(), "parent", null);
        term149083 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term149086 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term149083, term149083.getClass(), "number", 0.0);
        setIntField(term149083, term149083.getClass(), "type", 33);
        setIntField(term149086, term149086.getClass(), "type", 0);
        setField(term149086, term149086.getClass(), "next", null);
        setField(term149086, term149086.getClass(), "first", null);
        setField(term149086, term149086.getClass(), "last", null);
        setField(term149086, term149086.getClass(), "propListHead", null);
        setIntField(term149086, term149086.getClass(), "sourcePosition", 0);
        setField(term149086, term149086.getClass(), "jsType", null);
        setField(term149086, term149086.getClass(), "parent", null);
        setField(term149083, term149083.getClass(), "next", term149086);
        setField(term149083, term149083.getClass(), "first", term149083);
        setField(term149083, term149083.getClass(), "last", null);
        setField(term149083, term149083.getClass(), "propListHead", null);
        setIntField(term149083, term149083.getClass(), "sourcePosition", 0);
        setField(term149083, term149083.getClass(), "jsType", null);
        setField(term149083, term149083.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term148550;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term148458, args);
        assertTrue(recursiveEquals(term148458, term149110));
        assertTrue(recursiveEquals(term148550, term149111));
        assertTrue(recursiveEquals(retValue, term149083));
    }

};


