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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term367340;
     Object term367432;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term367340 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term367432 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term367524 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term367616 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term367616, term367616.getClass(), "type", 63);
        setField(term367524, term367524.getClass(), "next", term367616);
        setIntField(term367524, term367524.getClass(), "type", 0);
        setField(term367432, term367432.getClass(), "first", term367524);
        setIntField(term367432, term367432.getClass(), "type", 101);
        setField(term367432, term367432.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term367432;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term367340, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


