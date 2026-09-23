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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111500 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term555595;
     Object term555687;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111500() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term555595 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term555687 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term555779 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term555779, term555779.getClass(), "next", term555779);
        setIntField(term555779, term555779.getClass(), "type", 39);
        setDoubleField(term555779, term555779.getClass(), "number", 4.503599627370497E15);
        setField(term555687, term555687.getClass(), "first", term555779);
        setIntField(term555687, term555687.getClass(), "type", 24);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term555687;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term555595, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


