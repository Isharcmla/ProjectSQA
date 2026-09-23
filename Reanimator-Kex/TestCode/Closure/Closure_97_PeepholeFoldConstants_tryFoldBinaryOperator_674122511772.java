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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511772 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221937;
     Object term222007;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511772() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221937 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term222007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term222077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term222147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term222147, term222147.getClass(), "type", 39);
        setField(term222077, term222077.getClass(), "next", term222147);
        setIntField(term222077, term222077.getClass(), "type", 39);
        setField(term222007, term222007.getClass(), "first", term222077);
        setIntField(term222007, term222007.getClass(), "type", 22);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term222007;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term221937, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


