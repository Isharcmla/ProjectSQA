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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112902 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term846787;
     Object term846873;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112902() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term846787 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term846873 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term846959 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term847029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term847115 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term846959, term846959.getClass(), "next", term847029);
        setIntField(term846959, term846959.getClass(), "type", 44);
        setField(term846873, term846873.getClass(), "first", term846959);
        setIntField(term846873, term846873.getClass(), "type", 101);
        setField(term846873, term846873.getClass(), "parent", term847115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term846873;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term846787, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


