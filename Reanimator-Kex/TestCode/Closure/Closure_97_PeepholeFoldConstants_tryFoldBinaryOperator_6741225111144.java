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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term352131;
     Object term352223;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term352131 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term352223 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term352315 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term352405 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term352405, term352405.getClass(), "type", 40);
        setField(term352315, term352315.getClass(), "next", term352405);
        setField(term352223, term352223.getClass(), "first", term352315);
        setIntField(term352223, term352223.getClass(), "type", 33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term352223;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term352131, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


