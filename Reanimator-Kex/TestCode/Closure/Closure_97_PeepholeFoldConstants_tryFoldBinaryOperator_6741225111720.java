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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term678625;
     Object term678717;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term678625 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term678717 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term678809 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term678901 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term678901, term678901.getClass(), "type", 39);
        setField(term678809, term678809.getClass(), "next", term678901);
        setIntField(term678809, term678809.getClass(), "type", 39);
        setField(term678717, term678717.getClass(), "first", term678809);
        setIntField(term678717, term678717.getClass(), "type", 18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term678717;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term678625, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


