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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term427707;
     Object term427777;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term427707 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term427777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term427847 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term427917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term427917, term427917.getClass(), "type", 39);
        setField(term427847, term427847.getClass(), "next", term427917);
        setIntField(term427847, term427847.getClass(), "type", 39);
        setField(term427777, term427777.getClass(), "first", term427847);
        setIntField(term427777, term427777.getClass(), "type", 19);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term427777;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term427707, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


