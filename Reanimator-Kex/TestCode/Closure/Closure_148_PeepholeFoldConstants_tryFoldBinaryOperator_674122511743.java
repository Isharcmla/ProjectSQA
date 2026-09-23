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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166049;
     Object term166119;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166049 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term166119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term166189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term166259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term166259, term166259.getClass(), "type", 39);
        setField(term166189, term166189.getClass(), "next", term166259);
        setIntField(term166189, term166189.getClass(), "type", 39);
        setField(term166119, term166119.getClass(), "first", term166189);
        setIntField(term166119, term166119.getClass(), "type", 24);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term166119;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term166049, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


