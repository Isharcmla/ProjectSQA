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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111807 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term470898;
     Object term470990;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111807() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term470898 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term470990 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term471076 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term470990, term470990.getClass(), "first", term470990);
        setIntField(term471076, term471076.getClass(), "type", 40);
        setField(term470990, term470990.getClass(), "next", term471076);
        setIntField(term470990, term470990.getClass(), "type", 33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term470990;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term470898, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


