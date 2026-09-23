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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term347506;
     Object term347598;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term347506 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term347598 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term347690 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term347782 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term347782, term347782.getClass(), "type", 39);
        setField(term347690, term347690.getClass(), "next", term347782);
        setIntField(term347690, term347690.getClass(), "type", 39);
        setField(term347598, term347598.getClass(), "first", term347690);
        setIntField(term347598, term347598.getClass(), "type", 24);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term347598;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term347506, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


