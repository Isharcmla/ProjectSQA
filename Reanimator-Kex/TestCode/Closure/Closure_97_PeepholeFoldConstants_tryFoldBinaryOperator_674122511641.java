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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166507;
     Object term166599;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166507 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term166599 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term166691 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term166783 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term166783, term166783.getClass(), "type", 39);
        setField(term166691, term166691.getClass(), "next", term166783);
        setIntField(term166691, term166691.getClass(), "type", 39);
        setField(term166599, term166599.getClass(), "first", term166691);
        setIntField(term166599, term166599.getClass(), "type", 9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term166599;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term166507, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


