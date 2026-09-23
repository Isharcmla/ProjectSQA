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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term372309;
     Object term372379;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term372309 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term372379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term372469 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term372559 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term372559, term372559.getClass(), "type", 44);
        setField(term372469, term372469.getClass(), "next", term372559);
        setIntField(term372469, term372469.getClass(), "type", 0);
        setField(term372379, term372379.getClass(), "first", term372469);
        setIntField(term372379, term372379.getClass(), "type", 101);
        setField(term372379, term372379.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term372379;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term372309, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


