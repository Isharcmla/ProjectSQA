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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315975;
     Object term316067;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term315975 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term316067 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term316153 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term316239 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term316239, term316239.getClass(), "type", 47);
        setField(term316153, term316153.getClass(), "next", term316239);
        setIntField(term316153, term316153.getClass(), "type", 0);
        setField(term316067, term316067.getClass(), "first", term316153);
        setIntField(term316067, term316067.getClass(), "type", 101);
        setField(term316067, term316067.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term316067;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term315975, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


