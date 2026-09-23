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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term399978;
     Object term400064;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term399978 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term400064 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term400150 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term400242 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term400242, term400242.getClass(), "type", 39);
        setField(term400150, term400150.getClass(), "next", term400242);
        setIntField(term400150, term400150.getClass(), "type", 39);
        setField(term400064, term400064.getClass(), "first", term400150);
        setIntField(term400064, term400064.getClass(), "type", 9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term400064;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term399978, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


