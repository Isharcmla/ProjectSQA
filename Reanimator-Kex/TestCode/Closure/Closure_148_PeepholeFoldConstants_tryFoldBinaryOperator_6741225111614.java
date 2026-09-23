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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term411012;
     Object term411104;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term411012 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term411104 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term411190 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term411282 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term411282, term411282.getClass(), "type", 44);
        setField(term411190, term411190.getClass(), "next", term411282);
        setIntField(term411190, term411190.getClass(), "type", 0);
        setField(term411104, term411104.getClass(), "first", term411190);
        setIntField(term411104, term411104.getClass(), "type", 101);
        setField(term411104, term411104.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term411104;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term411012, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


