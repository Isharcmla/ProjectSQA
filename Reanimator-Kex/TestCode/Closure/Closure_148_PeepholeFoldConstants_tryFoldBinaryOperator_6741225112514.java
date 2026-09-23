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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term707621;
     Object term707713;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term707621 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term707713 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term707805 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term707891 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term707891, term707891.getClass(), "type", 39);
        setField(term707805, term707805.getClass(), "next", term707891);
        setIntField(term707805, term707805.getClass(), "type", 63);
        setField(term707713, term707713.getClass(), "first", term707805);
        setIntField(term707713, term707713.getClass(), "type", 35);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term707713;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term707621, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


