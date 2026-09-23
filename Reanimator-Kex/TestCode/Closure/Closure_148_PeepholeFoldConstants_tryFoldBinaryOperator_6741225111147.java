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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270005;
     Object term270097;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term270005 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term270097 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term270189 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term270279 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term270279, term270279.getClass(), "type", 39);
        setField(term270189, term270189.getClass(), "next", term270279);
        setIntField(term270189, term270189.getClass(), "type", 39);
        setField(term270097, term270097.getClass(), "first", term270189);
        setIntField(term270097, term270097.getClass(), "type", 11);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term270097;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term270005, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


