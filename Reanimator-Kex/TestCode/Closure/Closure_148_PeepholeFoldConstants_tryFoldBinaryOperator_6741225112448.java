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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term684116;
     Object term684208;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term684116 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term684208 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term684294 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term684364 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term684364, term684364.getClass(), "type", 63);
        setField(term684294, term684294.getClass(), "next", term684364);
        setIntField(term684294, term684294.getClass(), "type", 0);
        setField(term684208, term684208.getClass(), "first", term684294);
        setIntField(term684208, term684208.getClass(), "type", 101);
        setField(term684208, term684208.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term684208;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term684116, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


