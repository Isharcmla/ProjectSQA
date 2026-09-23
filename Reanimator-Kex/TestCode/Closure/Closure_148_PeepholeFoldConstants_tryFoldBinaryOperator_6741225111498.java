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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term373553;
     Object term373623;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term373553 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term373623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term373713 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term373805 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term373805, term373805.getClass(), "type", 47);
        setField(term373713, term373713.getClass(), "next", term373805);
        setIntField(term373713, term373713.getClass(), "type", 0);
        setField(term373623, term373623.getClass(), "first", term373713);
        setIntField(term373623, term373623.getClass(), "type", 101);
        setField(term373623, term373623.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term373623;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term373553, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


