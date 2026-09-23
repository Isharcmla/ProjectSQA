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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term871143;
     Object term871235;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term871143 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term871235 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term871305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term871397 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term871489 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term871397, term871397.getClass(), "type", 44);
        setField(term871305, term871305.getClass(), "next", term871397);
        setIntField(term871305, term871305.getClass(), "type", 0);
        setField(term871235, term871235.getClass(), "first", term871305);
        setIntField(term871235, term871235.getClass(), "type", 101);
        setIntField(term871489, term871489.getClass(), "type", 114);
        setField(term871235, term871235.getClass(), "parent", term871489);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term871235;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term871143, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


