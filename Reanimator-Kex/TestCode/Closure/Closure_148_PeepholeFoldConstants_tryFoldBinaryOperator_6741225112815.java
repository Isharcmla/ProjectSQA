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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term816888;
     Object term816980;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term816888 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term816980 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term817066 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term817158 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term817158, term817158.getClass(), "type", 39);
        setField(term817066, term817066.getClass(), "next", term817158);
        setIntField(term817066, term817066.getClass(), "type", 39);
        setField(term816980, term816980.getClass(), "first", term817066);
        setIntField(term816980, term816980.getClass(), "type", 22);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term816980;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term816888, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


