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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term677852;
     Object term677938;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term677852 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term677938 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term678024 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term678116 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term678116, term678116.getClass(), "type", 39);
        setField(term678024, term678024.getClass(), "next", term678116);
        setIntField(term678024, term678024.getClass(), "type", 63);
        setField(term677938, term677938.getClass(), "first", term678024);
        setIntField(term677938, term677938.getClass(), "type", 35);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term677938;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term677852, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


