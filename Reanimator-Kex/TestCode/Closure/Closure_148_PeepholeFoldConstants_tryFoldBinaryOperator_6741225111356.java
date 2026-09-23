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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term329961;
     Object term330053;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term329961 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term330053 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term330145 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term330237 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term330237, term330237.getClass(), "type", 39);
        setField(term330145, term330145.getClass(), "next", term330237);
        setIntField(term330145, term330145.getClass(), "type", 63);
        setField(term330053, term330053.getClass(), "first", term330145);
        setIntField(term330053, term330053.getClass(), "type", 35);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term330053;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term329961, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


