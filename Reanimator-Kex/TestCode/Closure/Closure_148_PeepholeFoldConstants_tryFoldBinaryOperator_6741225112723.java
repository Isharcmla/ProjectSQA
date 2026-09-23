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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term781776;
     Object term781868;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term781776 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term781868 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term781954 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term782040 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term782040, term782040.getClass(), "type", 40);
        setField(term781954, term781954.getClass(), "next", term782040);
        setField(term781868, term781868.getClass(), "first", term781954);
        setIntField(term781868, term781868.getClass(), "type", 33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term781868;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term781776, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


