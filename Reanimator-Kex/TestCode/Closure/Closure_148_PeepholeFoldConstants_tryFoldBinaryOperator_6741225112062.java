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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term555833;
     Object term555919;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term555833 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term555919 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term556005 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term556097 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term556097, term556097.getClass(), "type", 47);
        setField(term556005, term556005.getClass(), "next", term556097);
        setIntField(term556005, term556005.getClass(), "type", 0);
        setField(term555919, term555919.getClass(), "first", term556005);
        setIntField(term555919, term555919.getClass(), "type", 101);
        setField(term555919, term555919.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term555919;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term555833, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


