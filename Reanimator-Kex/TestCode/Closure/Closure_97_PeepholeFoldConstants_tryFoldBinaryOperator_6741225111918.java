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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term730811;
     Object term730903;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term730811 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term730903 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term730989 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term731081 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term731081, term731081.getClass(), "type", 39);
        setField(term730989, term730989.getClass(), "next", term731081);
        setIntField(term730989, term730989.getClass(), "type", 39);
        setField(term730903, term730903.getClass(), "first", term730989);
        setIntField(term730903, term730903.getClass(), "type", 22);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term730903;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term730811, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


