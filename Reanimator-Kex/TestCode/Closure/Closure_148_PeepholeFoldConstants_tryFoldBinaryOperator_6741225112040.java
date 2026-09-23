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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term548381;
     Object term548473;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term548381 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term548473 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term548565 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term548657 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term548657, term548657.getClass(), "type", 44);
        setField(term548565, term548565.getClass(), "next", term548657);
        setIntField(term548565, term548565.getClass(), "type", 0);
        setField(term548473, term548473.getClass(), "first", term548565);
        setIntField(term548473, term548473.getClass(), "type", 101);
        setField(term548473, term548473.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term548473;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term548381, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


