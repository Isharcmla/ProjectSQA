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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112788 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term806367;
     Object term806453;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112788() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term806367 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term806453 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term806539 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term806625 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term806625, term806625.getClass(), "type", 39);
        setField(term806539, term806539.getClass(), "next", term806625);
        setIntField(term806539, term806539.getClass(), "type", 39);
        setField(term806453, term806453.getClass(), "first", term806539);
        setIntField(term806453, term806453.getClass(), "type", 18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term806453;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term806367, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


