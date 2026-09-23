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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term864961;
     Object term865053;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term864961 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term865053 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term865143 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term865229 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term865229, term865229.getClass(), "type", 44);
        setField(term865143, term865143.getClass(), "next", term865229);
        setIntField(term865143, term865143.getClass(), "type", 0);
        setField(term865053, term865053.getClass(), "first", term865143);
        setIntField(term865053, term865053.getClass(), "type", 101);
        setField(term865053, term865053.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term865053;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term864961, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


