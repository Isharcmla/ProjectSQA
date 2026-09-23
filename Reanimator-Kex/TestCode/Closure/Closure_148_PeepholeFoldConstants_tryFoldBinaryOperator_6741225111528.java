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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term382170;
     Object term382256;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term382170 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term382256 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term382342 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term382412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term382498 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term382342, term382342.getClass(), "next", term382412);
        setIntField(term382342, term382342.getClass(), "type", 47);
        setField(term382256, term382256.getClass(), "first", term382342);
        setIntField(term382256, term382256.getClass(), "type", 101);
        setField(term382256, term382256.getClass(), "parent", term382498);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term382256;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term382170, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


