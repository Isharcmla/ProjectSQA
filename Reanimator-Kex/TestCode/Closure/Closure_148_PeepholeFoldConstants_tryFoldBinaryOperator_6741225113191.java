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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term947135;
     Object term947227;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term947135 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term947227 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term947319 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term947409 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term947409, term947409.getClass(), "type", 40);
        setField(term947319, term947319.getClass(), "next", term947409);
        setField(term947227, term947227.getClass(), "first", term947319);
        setIntField(term947227, term947227.getClass(), "type", 33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term947227;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term947135, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


