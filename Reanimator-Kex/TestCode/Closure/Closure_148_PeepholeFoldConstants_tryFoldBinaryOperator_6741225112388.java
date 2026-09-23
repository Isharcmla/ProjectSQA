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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term663218;
     Object term663310;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term663218 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term663310 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term663402 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term663494 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term663494, term663494.getClass(), "type", 39);
        setField(term663402, term663402.getClass(), "next", term663494);
        setIntField(term663402, term663402.getClass(), "type", 39);
        setField(term663310, term663310.getClass(), "first", term663402);
        setIntField(term663310, term663310.getClass(), "type", 24);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term663310;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term663218, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


