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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112058 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term554553;
     Object term554623;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112058() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term554553 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term554623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term554713 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term554799 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term554799, term554799.getClass(), "type", 63);
        setField(term554713, term554713.getClass(), "next", term554799);
        setIntField(term554713, term554713.getClass(), "type", 0);
        setField(term554623, term554623.getClass(), "first", term554713);
        setIntField(term554623, term554623.getClass(), "type", 101);
        setField(term554623, term554623.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term554623;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term554553, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


