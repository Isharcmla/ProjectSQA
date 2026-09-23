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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term858515;
     Object term858601;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term858515 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term858601 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term858687 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term858773 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term858863 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term858773, term858773.getClass(), "type", 47);
        setField(term858687, term858687.getClass(), "next", term858773);
        setIntField(term858687, term858687.getClass(), "type", 0);
        setField(term858601, term858601.getClass(), "first", term858687);
        setIntField(term858601, term858601.getClass(), "type", 101);
        setIntField(term858863, term858863.getClass(), "type", 113);
        setField(term858601, term858601.getClass(), "parent", term858863);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term858601;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term858515, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


