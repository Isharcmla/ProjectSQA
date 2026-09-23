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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term933450;
     Object term933542;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term933450 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term933542 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term933632 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term933724 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term933724, term933724.getClass(), "type", 63);
        setField(term933632, term933632.getClass(), "next", term933724);
        setIntField(term933632, term933632.getClass(), "type", 0);
        setField(term933542, term933542.getClass(), "first", term933632);
        setIntField(term933542, term933542.getClass(), "type", 101);
        setField(term933542, term933542.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term933542;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term933450, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


