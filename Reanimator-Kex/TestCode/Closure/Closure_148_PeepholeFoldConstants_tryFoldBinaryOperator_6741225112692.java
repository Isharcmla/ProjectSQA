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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112692 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term771072;
     Object term771158;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112692() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term771072 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term771158 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term771244 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term771336 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term771336, term771336.getClass(), "type", 40);
        setField(term771336, term771336.getClass(), "str", "length");
        setField(term771244, term771244.getClass(), "next", term771336);
        setIntField(term771244, term771244.getClass(), "type", 63);
        setField(term771158, term771158.getClass(), "first", term771244);
        setIntField(term771158, term771158.getClass(), "type", 33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term771158;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term771072, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


