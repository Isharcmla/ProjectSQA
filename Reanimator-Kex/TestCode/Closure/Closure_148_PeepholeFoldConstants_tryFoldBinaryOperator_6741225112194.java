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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term599817;
     Object term599909;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term599817 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term599909 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term599999 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term600085 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term600171 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term600085, term600085.getClass(), "type", 44);
        setField(term599999, term599999.getClass(), "next", term600085);
        setIntField(term599999, term599999.getClass(), "type", 0);
        setField(term599909, term599909.getClass(), "first", term599999);
        setIntField(term599909, term599909.getClass(), "type", 101);
        setIntField(term600171, term600171.getClass(), "type", 113);
        setField(term599909, term599909.getClass(), "parent", term600171);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term599909;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term599817, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


