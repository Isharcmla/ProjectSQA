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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term919729;
     Object term919815;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term919729 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term919815 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term919901 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term919993 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term919993, term919993.getClass(), "type", 39);
        setField(term919901, term919901.getClass(), "next", term919993);
        setIntField(term919901, term919901.getClass(), "type", 39);
        setField(term919815, term919815.getClass(), "first", term919901);
        setIntField(term919815, term919815.getClass(), "type", 18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term919815;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term919729, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


