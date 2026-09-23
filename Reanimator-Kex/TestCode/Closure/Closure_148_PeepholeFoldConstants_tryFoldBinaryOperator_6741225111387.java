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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term339295;
     Object term339387;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term339295 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term339387 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term339473 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term339543 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term339629 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term339473, term339473.getClass(), "next", term339543);
        setIntField(term339473, term339473.getClass(), "type", 44);
        setField(term339387, term339387.getClass(), "first", term339473);
        setIntField(term339387, term339387.getClass(), "type", 101);
        setField(term339387, term339387.getClass(), "parent", term339629);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term339387;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term339295, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


