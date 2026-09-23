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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108539;
     Object term108625;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108539 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term108625 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term108711 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term108797 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term108797, term108797.getClass(), "type", 39);
        setField(term108711, term108711.getClass(), "next", term108797);
        setIntField(term108711, term108711.getClass(), "type", 39);
        setField(term108625, term108625.getClass(), "first", term108711);
        setIntField(term108625, term108625.getClass(), "type", 23);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term108625;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term108539, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


