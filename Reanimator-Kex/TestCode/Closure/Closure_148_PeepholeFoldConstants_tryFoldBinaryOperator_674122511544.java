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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116254;
     Object term116340;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116254 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term116340 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term116426 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term116512 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term116512, term116512.getClass(), "type", 39);
        setField(term116426, term116426.getClass(), "next", term116512);
        setIntField(term116426, term116426.getClass(), "type", 39);
        setField(term116340, term116340.getClass(), "first", term116426);
        setIntField(term116340, term116340.getClass(), "type", 20);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term116340;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term116254, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


