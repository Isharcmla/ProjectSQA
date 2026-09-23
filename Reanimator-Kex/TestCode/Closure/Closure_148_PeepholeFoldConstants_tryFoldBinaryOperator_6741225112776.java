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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112776 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term801037;
     Object term801123;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112776() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term801037 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term801123 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term801209 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term801295 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term801381 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term801295, term801295.getClass(), "type", 47);
        setField(term801209, term801209.getClass(), "next", term801295);
        setIntField(term801209, term801209.getClass(), "type", 0);
        setField(term801123, term801123.getClass(), "first", term801209);
        setIntField(term801123, term801123.getClass(), "type", 101);
        setIntField(term801381, term801381.getClass(), "type", 108);
        setField(term801123, term801123.getClass(), "parent", term801381);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term801123;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term801037, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


