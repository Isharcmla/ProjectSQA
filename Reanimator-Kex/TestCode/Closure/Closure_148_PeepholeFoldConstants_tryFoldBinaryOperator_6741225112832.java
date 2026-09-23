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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term823509;
     Object term823601;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term823509 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term823601 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term823691 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term823783 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term823869 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term823783, term823783.getClass(), "type", 44);
        setField(term823691, term823691.getClass(), "next", term823783);
        setIntField(term823691, term823691.getClass(), "type", 0);
        setField(term823601, term823601.getClass(), "first", term823691);
        setIntField(term823601, term823601.getClass(), "type", 101);
        setIntField(term823869, term823869.getClass(), "type", 98);
        setField(term823869, term823869.getClass(), "first", term823601);
        setField(term823601, term823601.getClass(), "parent", term823869);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term823601;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term823509, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


