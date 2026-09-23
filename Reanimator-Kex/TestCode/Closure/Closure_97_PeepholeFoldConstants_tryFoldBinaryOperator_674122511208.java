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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40599;
     Object term40669;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40599 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term40669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term40669, term40669.getClass(), "first", term40669);
        setIntField(term40739, term40739.getClass(), "type", 40);
        setField(term40669, term40669.getClass(), "next", term40739);
        setIntField(term40669, term40669.getClass(), "type", 33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term40669;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term40599, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


