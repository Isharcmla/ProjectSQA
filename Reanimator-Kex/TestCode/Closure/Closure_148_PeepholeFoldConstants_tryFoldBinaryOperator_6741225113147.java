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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term931824;
     Object term931910;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term931824 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term931910 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term931996 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term932088 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term932088, term932088.getClass(), "type", 39);
        setField(term931996, term931996.getClass(), "next", term932088);
        setIntField(term931996, term931996.getClass(), "type", 39);
        setField(term931910, term931910.getClass(), "first", term931996);
        setIntField(term931910, term931910.getClass(), "type", 18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term931910;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term931824, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


