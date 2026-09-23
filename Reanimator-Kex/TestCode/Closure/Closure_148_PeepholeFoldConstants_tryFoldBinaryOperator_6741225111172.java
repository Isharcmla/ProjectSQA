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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276773;
     Object term276859;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term276773 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term276859 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term276945 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term277037 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term277037, term277037.getClass(), "type", 39);
        setField(term276945, term276945.getClass(), "next", term277037);
        setIntField(term276945, term276945.getClass(), "type", 39);
        setField(term276859, term276859.getClass(), "first", term276945);
        setIntField(term276859, term276859.getClass(), "type", 24);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term276859;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term276773, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


