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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term532146;
     Object term532232;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term532146 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term532232 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term532318 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term532318, term532318.getClass(), "next", term532318);
        setIntField(term532318, term532318.getClass(), "type", 47);
        setField(term532232, term532232.getClass(), "first", term532318);
        setIntField(term532232, term532232.getClass(), "type", 101);
        setField(term532232, term532232.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term532232;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term532146, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


