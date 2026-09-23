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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term330073;
     Object term330165;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term330073 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term330165 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term330257 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term330349 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term330349, term330349.getClass(), "type", 39);
        setField(term330257, term330257.getClass(), "next", term330349);
        setIntField(term330257, term330257.getClass(), "type", 63);
        setField(term330165, term330165.getClass(), "first", term330257);
        setIntField(term330165, term330165.getClass(), "type", 35);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term330165;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term330073, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


