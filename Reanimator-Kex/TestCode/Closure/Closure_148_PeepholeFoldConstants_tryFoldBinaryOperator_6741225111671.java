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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term429002;
     Object term429088;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term429002 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term429088 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term429174 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term429266 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term429266, term429266.getClass(), "type", 39);
        setField(term429174, term429174.getClass(), "next", term429266);
        setIntField(term429174, term429174.getClass(), "type", 39);
        setField(term429088, term429088.getClass(), "first", term429174);
        setIntField(term429088, term429088.getClass(), "type", 9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term429088;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term429002, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


