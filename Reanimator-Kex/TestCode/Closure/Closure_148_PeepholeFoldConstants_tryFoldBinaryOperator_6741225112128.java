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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term578962;
     Object term579054;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term578962 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term579054 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term579146 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term579238 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term579238, term579238.getClass(), "type", 44);
        setField(term579146, term579146.getClass(), "next", term579238);
        setIntField(term579146, term579146.getClass(), "type", 0);
        setField(term579054, term579054.getClass(), "first", term579146);
        setIntField(term579054, term579054.getClass(), "type", 101);
        setField(term579054, term579054.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term579054;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term578962, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


