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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111705 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term673575;
     Object term673661;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111705() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term673575 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term673661 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term673747 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term673839 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term673839, term673839.getClass(), "type", 39);
        setField(term673747, term673747.getClass(), "next", term673839);
        setIntField(term673747, term673747.getClass(), "type", 63);
        setField(term673661, term673661.getClass(), "first", term673747);
        setIntField(term673661, term673661.getClass(), "type", 35);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term673661;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term673575, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


