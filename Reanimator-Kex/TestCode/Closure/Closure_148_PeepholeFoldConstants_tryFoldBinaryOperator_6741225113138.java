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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term928983;
     Object term929075;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term928983 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term929075 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term929167 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term929259 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term929259, term929259.getClass(), "type", 39);
        setField(term929167, term929167.getClass(), "next", term929259);
        setIntField(term929167, term929167.getClass(), "type", 39);
        setField(term929075, term929075.getClass(), "first", term929167);
        setIntField(term929075, term929075.getClass(), "type", 24);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term929075;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term928983, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


