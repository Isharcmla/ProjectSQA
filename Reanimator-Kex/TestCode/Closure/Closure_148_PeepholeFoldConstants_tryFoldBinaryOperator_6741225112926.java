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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term856616;
     Object term856708;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term856616 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term856708 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term856800 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term856892 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term856892, term856892.getClass(), "type", 44);
        setField(term856800, term856800.getClass(), "next", term856892);
        setIntField(term856800, term856800.getClass(), "type", 0);
        setField(term856708, term856708.getClass(), "first", term856800);
        setIntField(term856708, term856708.getClass(), "type", 100);
        setField(term856708, term856708.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term856708;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term856616, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


