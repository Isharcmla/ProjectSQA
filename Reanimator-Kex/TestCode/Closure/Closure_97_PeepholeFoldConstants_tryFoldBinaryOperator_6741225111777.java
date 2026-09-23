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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term694073;
     Object term694159;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term694073 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term694159 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term694245 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term694331 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term694331, term694331.getClass(), "type", 39);
        setField(term694245, term694245.getClass(), "next", term694331);
        setIntField(term694245, term694245.getClass(), "type", 39);
        setField(term694159, term694159.getClass(), "first", term694245);
        setIntField(term694159, term694159.getClass(), "type", 18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term694159;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term694073, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


