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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111609 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term408489;
     Object term408575;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111609() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term408489 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term408575 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term408661 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term408747 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term408747, term408747.getClass(), "type", 64);
        setField(term408661, term408661.getClass(), "next", term408747);
        setIntField(term408661, term408661.getClass(), "type", 0);
        setField(term408575, term408575.getClass(), "first", term408661);
        setIntField(term408575, term408575.getClass(), "type", 100);
        setField(term408575, term408575.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term408575;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term408489, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


