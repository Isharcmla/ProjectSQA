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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term449544;
     Object term449630;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term449544 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term449630 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term449716 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term449786 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term449872 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term449716, term449716.getClass(), "next", term449786);
        setIntField(term449716, term449716.getClass(), "type", 64);
        setField(term449630, term449630.getClass(), "first", term449716);
        setIntField(term449630, term449630.getClass(), "type", 101);
        setField(term449630, term449630.getClass(), "parent", term449872);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term449630;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term449544, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


