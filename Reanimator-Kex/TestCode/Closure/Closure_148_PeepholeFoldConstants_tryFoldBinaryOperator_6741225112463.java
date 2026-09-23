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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term689049;
     Object term689135;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term689049 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term689135 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term689221 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term689307 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term689393 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term689307, term689307.getClass(), "type", 47);
        setField(term689221, term689221.getClass(), "next", term689307);
        setIntField(term689221, term689221.getClass(), "type", 0);
        setField(term689135, term689135.getClass(), "first", term689221);
        setIntField(term689135, term689135.getClass(), "type", 101);
        setIntField(term689393, term689393.getClass(), "type", 113);
        setField(term689135, term689135.getClass(), "parent", term689393);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term689135;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term689049, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


