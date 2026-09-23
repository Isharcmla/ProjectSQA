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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term649697;
     Object term649789;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term649697 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term649789 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term649879 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term649971 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term649971, term649971.getClass(), "type", 63);
        setField(term649879, term649879.getClass(), "next", term649971);
        setIntField(term649879, term649879.getClass(), "type", 0);
        setField(term649789, term649789.getClass(), "first", term649879);
        setIntField(term649789, term649789.getClass(), "type", 101);
        setField(term649789, term649789.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term649789;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term649697, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


