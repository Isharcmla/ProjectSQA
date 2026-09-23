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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112960 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term868167;
     Object term868253;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112960() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term868167 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term868253 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term868339 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term868431 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term868431, term868431.getClass(), "type", 39);
        setDoubleField(term868431, term868431.getClass(), "number", -4.490080994501591E18);
        setField(term868339, term868339.getClass(), "next", term868431);
        setIntField(term868339, term868339.getClass(), "type", 63);
        setField(term868253, term868253.getClass(), "first", term868339);
        setIntField(term868253, term868253.getClass(), "type", 35);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term868253;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term868167, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


