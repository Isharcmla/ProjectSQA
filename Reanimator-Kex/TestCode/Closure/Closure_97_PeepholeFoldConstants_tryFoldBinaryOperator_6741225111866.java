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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111866 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term717059;
     Object term717151;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111866() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term717059 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term717151 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term717243 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term717329 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term717329, term717329.getClass(), "type", 39);
        setField(term717243, term717243.getClass(), "next", term717329);
        setIntField(term717243, term717243.getClass(), "type", 39);
        setField(term717151, term717151.getClass(), "first", term717243);
        setIntField(term717151, term717151.getClass(), "type", 24);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term717151;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term717059, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


