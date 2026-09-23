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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111708 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term674880;
     Object term674950;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111708() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term674880 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term674950 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term675020 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term675090 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term675090, term675090.getClass(), "type", 39);
        setField(term675020, term675020.getClass(), "next", term675090);
        setIntField(term675020, term675020.getClass(), "type", 39);
        setField(term674950, term674950.getClass(), "first", term675020);
        setIntField(term674950, term674950.getClass(), "type", 11);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term674950;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term674880, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


