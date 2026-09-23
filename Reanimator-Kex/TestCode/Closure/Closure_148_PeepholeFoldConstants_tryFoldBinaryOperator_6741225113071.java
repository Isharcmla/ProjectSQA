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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term906839;
     Object term906931;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term906839 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term906931 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term907023 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term907115 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term907115, term907115.getClass(), "type", 39);
        setField(term907023, term907023.getClass(), "next", term907115);
        setIntField(term907023, term907023.getClass(), "type", 39);
        setField(term906931, term906931.getClass(), "first", term907023);
        setIntField(term906931, term906931.getClass(), "type", 11);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term906931;
        callMethod(klass, "tryFoldBinaryOperator", argTypes, term906839, args);
    }

};


