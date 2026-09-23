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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term763759;
     Object term763851;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term763759 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term763851 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term763943 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term764035 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term764035, term764035.getClass(), "type", 47);
        setField(term763943, term763943.getClass(), "next", term764035);
        setIntField(term763943, term763943.getClass(), "type", 0);
        setField(term763851, term763851.getClass(), "first", term763943);
        setIntField(term763851, term763851.getClass(), "type", 100);
        setField(term763851, term763851.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term763851;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term763759, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


