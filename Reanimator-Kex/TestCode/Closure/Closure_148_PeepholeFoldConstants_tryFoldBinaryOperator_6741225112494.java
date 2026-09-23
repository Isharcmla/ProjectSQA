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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term700237;
     Object term700329;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term700237 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term700329 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term700415 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term700485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term700571 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term700415, term700415.getClass(), "next", term700485);
        setIntField(term700415, term700415.getClass(), "type", 44);
        setField(term700329, term700329.getClass(), "first", term700415);
        setIntField(term700329, term700329.getClass(), "type", 101);
        setField(term700329, term700329.getClass(), "parent", term700571);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term700329;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term700237, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


