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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112890 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term843004;
     Object term843096;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112890() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term843004 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term843096 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term843182 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term843274 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term843274, term843274.getClass(), "type", 39);
        setField(term843182, term843182.getClass(), "next", term843274);
        setIntField(term843182, term843182.getClass(), "type", 39);
        setField(term843096, term843096.getClass(), "first", term843182);
        setIntField(term843096, term843096.getClass(), "type", 22);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term843096;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term843004, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


