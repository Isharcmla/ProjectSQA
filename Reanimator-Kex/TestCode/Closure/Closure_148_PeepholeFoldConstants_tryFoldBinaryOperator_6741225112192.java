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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term598980;
     Object term599072;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term598980 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term599072 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term599164 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term599250 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term599250, term599250.getClass(), "type", 63);
        setField(term599164, term599164.getClass(), "next", term599250);
        setIntField(term599164, term599164.getClass(), "type", 0);
        setField(term599072, term599072.getClass(), "first", term599164);
        setIntField(term599072, term599072.getClass(), "type", 101);
        setField(term599072, term599072.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term599072;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term598980, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


