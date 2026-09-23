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
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term736358;
     Object term736444;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term736358 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term736444 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term736530 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term736616 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term736616, term736616.getClass(), "type", 39);
        setField(term736530, term736530.getClass(), "next", term736616);
        setIntField(term736530, term736530.getClass(), "type", 39);
        setField(term736444, term736444.getClass(), "first", term736530);
        setIntField(term736444, term736444.getClass(), "type", 11);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term736444;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term736358, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


