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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124172;
     Object term124242;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124172 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term124242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term124312 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term124382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term124382, term124382.getClass(), "type", 39);
        setField(term124312, term124312.getClass(), "next", term124382);
        setIntField(term124312, term124312.getClass(), "type", 39);
        setField(term124242, term124242.getClass(), "first", term124312);
        setIntField(term124242, term124242.getClass(), "type", 20);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term124242;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term124172, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


