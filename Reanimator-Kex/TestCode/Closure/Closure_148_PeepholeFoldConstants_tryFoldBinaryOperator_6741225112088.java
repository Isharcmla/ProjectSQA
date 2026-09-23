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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112088 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term565408;
     Object term565500;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term565408 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term565500 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term565586 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term565676 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term565676, term565676.getClass(), "type", 47);
        setField(term565586, term565586.getClass(), "next", term565676);
        setIntField(term565586, term565586.getClass(), "type", 0);
        setField(term565500, term565500.getClass(), "first", term565586);
        setIntField(term565500, term565500.getClass(), "type", 101);
        setField(term565500, term565500.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term565500;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term565408, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


