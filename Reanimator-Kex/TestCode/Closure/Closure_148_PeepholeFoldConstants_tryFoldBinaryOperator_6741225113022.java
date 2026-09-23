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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term889040;
     Object term889126;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term889040 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term889126 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term889212 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term889298 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term889384 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term889298, term889298.getClass(), "type", 47);
        setField(term889212, term889212.getClass(), "next", term889298);
        setIntField(term889212, term889212.getClass(), "type", 0);
        setField(term889126, term889126.getClass(), "first", term889212);
        setIntField(term889126, term889126.getClass(), "type", 101);
        setIntField(term889384, term889384.getClass(), "type", 114);
        setField(term889126, term889126.getClass(), "parent", term889384);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term889126;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term889040, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


