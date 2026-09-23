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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term486905;
     Object term486997;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term486905 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term486997 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term487089 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term487181 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term487273 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term487089, term487089.getClass(), "next", term487181);
        setIntField(term487089, term487089.getClass(), "type", 64);
        setField(term486997, term486997.getClass(), "first", term487089);
        setIntField(term486997, term486997.getClass(), "type", 101);
        setField(term486997, term486997.getClass(), "parent", term487273);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term486997;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term486905, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


