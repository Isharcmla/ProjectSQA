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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term862919;
     Object term863011;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term862919 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term863011 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term863097 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term863167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term863237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term863167, term863167.getClass(), "type", 47);
        setField(term863097, term863097.getClass(), "next", term863167);
        setIntField(term863097, term863097.getClass(), "type", 0);
        setField(term863011, term863011.getClass(), "first", term863097);
        setIntField(term863011, term863011.getClass(), "type", 101);
        setIntField(term863237, term863237.getClass(), "type", 114);
        setField(term863011, term863011.getClass(), "parent", term863237);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term863011;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term862919, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


