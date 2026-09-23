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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term837154;
     Object term837246;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term837154 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term837246 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term837338 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term837430 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term837522 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term837430, term837430.getClass(), "type", 63);
        setField(term837338, term837338.getClass(), "next", term837430);
        setIntField(term837338, term837338.getClass(), "type", 0);
        setField(term837246, term837246.getClass(), "first", term837338);
        setIntField(term837246, term837246.getClass(), "type", 101);
        setIntField(term837522, term837522.getClass(), "type", 108);
        setField(term837246, term837246.getClass(), "parent", term837522);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term837246;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term837154, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


