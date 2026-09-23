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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112898 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term846025;
     Object term846117;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112898() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term846025 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term846117 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term846203 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term846273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term846273, term846273.getClass(), "type", 39);
        setField(term846203, term846203.getClass(), "next", term846273);
        setIntField(term846203, term846203.getClass(), "type", 39);
        setField(term846117, term846117.getClass(), "first", term846203);
        setIntField(term846117, term846117.getClass(), "type", 9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term846117;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term846025, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


