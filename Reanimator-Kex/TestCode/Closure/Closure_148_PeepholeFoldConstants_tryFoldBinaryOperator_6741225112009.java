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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112009 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term537423;
     Object term537509;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112009() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term537423 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term537509 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term537595 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term537687 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term537687, term537687.getClass(), "type", 39);
        setField(term537595, term537595.getClass(), "next", term537687);
        setIntField(term537595, term537595.getClass(), "type", 39);
        setField(term537509, term537509.getClass(), "first", term537595);
        setIntField(term537509, term537509.getClass(), "type", 24);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term537509;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term537423, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


