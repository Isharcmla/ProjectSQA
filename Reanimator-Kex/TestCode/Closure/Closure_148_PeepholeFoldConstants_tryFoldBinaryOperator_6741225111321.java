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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318860;
     Object term318946;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term318860 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term318946 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term319032 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term319118 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term319204 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term319032, term319032.getClass(), "next", term319118);
        setIntField(term319032, term319032.getClass(), "type", 47);
        setField(term318946, term318946.getClass(), "first", term319032);
        setIntField(term318946, term318946.getClass(), "type", 100);
        setField(term318946, term318946.getClass(), "parent", term319204);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term318946;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term318860, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


