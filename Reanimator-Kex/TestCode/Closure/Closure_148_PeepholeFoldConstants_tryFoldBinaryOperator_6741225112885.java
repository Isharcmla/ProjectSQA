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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term840520;
     Object term840612;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term840520 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term840612 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term840698 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term840784 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term840876 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term840784, term840784.getClass(), "type", 64);
        setField(term840698, term840698.getClass(), "next", term840784);
        setIntField(term840698, term840698.getClass(), "type", 0);
        setField(term840612, term840612.getClass(), "first", term840698);
        setIntField(term840612, term840612.getClass(), "type", 101);
        setIntField(term840876, term840876.getClass(), "type", 113);
        setField(term840612, term840612.getClass(), "parent", term840876);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term840612;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term840520, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


