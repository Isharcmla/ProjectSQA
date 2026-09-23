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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98692;
     Object term98762;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98692 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term98762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98832 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98902 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term98902, term98902.getClass(), "type", 39);
        setField(term98832, term98832.getClass(), "next", term98902);
        setIntField(term98832, term98832.getClass(), "type", 39);
        setField(term98762, term98762.getClass(), "first", term98832);
        setIntField(term98762, term98762.getClass(), "type", 11);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term98762;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term98692, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


