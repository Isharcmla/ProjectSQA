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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term709036;
     Object term709128;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term709036 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term709128 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term709220 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term709306 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term709306, term709306.getClass(), "type", 47);
        setField(term709220, term709220.getClass(), "next", term709306);
        setIntField(term709220, term709220.getClass(), "type", 0);
        setField(term709128, term709128.getClass(), "first", term709220);
        setIntField(term709128, term709128.getClass(), "type", 100);
        setField(term709128, term709128.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term709128;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term709036, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


