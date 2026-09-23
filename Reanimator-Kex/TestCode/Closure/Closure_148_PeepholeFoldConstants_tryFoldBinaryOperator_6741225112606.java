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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112606 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term740841;
     Object term740927;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112606() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term740841 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term740927 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term741013 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term741013, term741013.getClass(), "next", term741013);
        setIntField(term741013, term741013.getClass(), "type", 64);
        setField(term740927, term740927.getClass(), "first", term741013);
        setIntField(term740927, term740927.getClass(), "type", 101);
        setField(term740927, term740927.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term740927;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term740841, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


