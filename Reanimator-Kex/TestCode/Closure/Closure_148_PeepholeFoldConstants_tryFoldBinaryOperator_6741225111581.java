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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term399069;
     Object term399155;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term399069 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term399155 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term399241 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term399327 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term399327, term399327.getClass(), "type", 47);
        setField(term399241, term399241.getClass(), "next", term399327);
        setIntField(term399241, term399241.getClass(), "type", 0);
        setField(term399155, term399155.getClass(), "first", term399241);
        setIntField(term399155, term399155.getClass(), "type", 100);
        setField(term399155, term399155.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term399155;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term399069, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


