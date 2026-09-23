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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112850 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term829371;
     Object term829463;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112850() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term829371 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term829463 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term829549 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term829619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term829705 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term829619, term829619.getClass(), "type", 47);
        setField(term829549, term829549.getClass(), "next", term829619);
        setIntField(term829549, term829549.getClass(), "type", 0);
        setField(term829463, term829463.getClass(), "first", term829549);
        setIntField(term829463, term829463.getClass(), "type", 101);
        setIntField(term829705, term829705.getClass(), "type", 114);
        setField(term829463, term829463.getClass(), "parent", term829705);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term829463;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term829371, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


