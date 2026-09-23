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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term544694;
     Object term544786;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term544694 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term544786 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term544856 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term544948 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term544948, term544948.getClass(), "type", 47);
        setField(term544856, term544856.getClass(), "next", term544948);
        setIntField(term544856, term544856.getClass(), "type", 0);
        setField(term544786, term544786.getClass(), "first", term544856);
        setIntField(term544786, term544786.getClass(), "type", 101);
        setField(term544786, term544786.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term544786;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term544694, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


