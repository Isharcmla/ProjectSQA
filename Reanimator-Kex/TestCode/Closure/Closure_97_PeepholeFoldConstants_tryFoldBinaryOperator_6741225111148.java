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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term353349;
     Object term353439;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term353349 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term353439 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term353529 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term353619 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term353619, term353619.getClass(), "type", 39);
        setField(term353529, term353529.getClass(), "next", term353619);
        setIntField(term353529, term353529.getClass(), "type", 39);
        setField(term353439, term353439.getClass(), "first", term353529);
        setIntField(term353439, term353439.getClass(), "type", 22);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term353439;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term353349, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


