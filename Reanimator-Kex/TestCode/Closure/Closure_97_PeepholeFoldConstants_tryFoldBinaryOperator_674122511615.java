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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160546;
     Object term160638;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160546 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term160638 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term160730 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term160638, term160638.getClass(), "first", term160638);
        setIntField(term160730, term160730.getClass(), "type", 40);
        setField(term160638, term160638.getClass(), "next", term160730);
        setIntField(term160638, term160638.getClass(), "type", 33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term160638;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term160546, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


