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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149697;
     Object term149789;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149697 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term149789 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term149881 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term149973 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term149973, term149973.getClass(), "type", 39);
        setField(term149881, term149881.getClass(), "next", term149973);
        setIntField(term149881, term149881.getClass(), "type", 39);
        setField(term149789, term149789.getClass(), "first", term149881);
        setIntField(term149789, term149789.getClass(), "type", 11);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term149789;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term149697, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


