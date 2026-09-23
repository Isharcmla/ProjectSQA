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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term400378;
     Object term400464;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term400378 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term400464 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term400556 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term400464, term400464.getClass(), "first", term400464);
        setIntField(term400556, term400556.getClass(), "type", 40);
        setField(term400464, term400464.getClass(), "next", term400556);
        setIntField(term400464, term400464.getClass(), "type", 33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term400464;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term400378, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


