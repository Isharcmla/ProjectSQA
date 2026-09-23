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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term433294;
     Object term433364;
     Object term433390;
     Object term433391;
     Object term433368;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term433294 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term433364 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term433364, term433364.getClass(), "first", term433364);
        setField(term433364, term433364.getClass(), "next", term433364);
        setIntField(term433364, term433364.getClass(), "type", 52);
        term433390 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term433390, term433390.getClass(), "currentTraversal", null);
        term433391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term433391, term433391.getClass(), "type", 52);
        setField(term433391, term433391.getClass(), "next", term433391);
        setField(term433391, term433391.getClass(), "first", term433391);
        setField(term433391, term433391.getClass(), "last", null);
        setField(term433391, term433391.getClass(), "propListHead", null);
        setIntField(term433391, term433391.getClass(), "sourcePosition", 0);
        setField(term433391, term433391.getClass(), "jsType", null);
        setField(term433391, term433391.getClass(), "parent", null);
        term433368 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term433368, term433368.getClass(), "type", 52);
        setField(term433368, term433368.getClass(), "next", term433368);
        setField(term433368, term433368.getClass(), "first", term433368);
        setField(term433368, term433368.getClass(), "last", null);
        setField(term433368, term433368.getClass(), "propListHead", null);
        setIntField(term433368, term433368.getClass(), "sourcePosition", 0);
        setField(term433368, term433368.getClass(), "jsType", null);
        setField(term433368, term433368.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term433364;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term433294, args);
        assertTrue(recursiveEquals(term433294, term433390));
        assertTrue(recursiveEquals(term433364, term433391));
        assertTrue(recursiveEquals(retValue, term433368));
    }

};


