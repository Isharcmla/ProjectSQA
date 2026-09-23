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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term534539;
     Object term534631;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term534539 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term534631 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term534723 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term534815 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term534815, term534815.getClass(), "type", 39);
        setField(term534723, term534723.getClass(), "next", term534815);
        setIntField(term534723, term534723.getClass(), "type", 39);
        setField(term534631, term534631.getClass(), "first", term534723);
        setIntField(term534631, term534631.getClass(), "type", 24);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term534631;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term534539, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


