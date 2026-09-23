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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term562427;
     Object term562519;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term562427 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term562519 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term562611 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term562703 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term562703, term562703.getClass(), "type", 47);
        setField(term562611, term562611.getClass(), "next", term562703);
        setIntField(term562611, term562611.getClass(), "type", 0);
        setField(term562519, term562519.getClass(), "first", term562611);
        setIntField(term562519, term562519.getClass(), "type", 101);
        setField(term562519, term562519.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term562519;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term562427, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


