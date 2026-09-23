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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term698436;
     Object term698528;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term698436 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term698528 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term698618 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term698710 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term698796 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term698710, term698710.getClass(), "type", 63);
        setField(term698618, term698618.getClass(), "next", term698710);
        setIntField(term698618, term698618.getClass(), "type", 0);
        setField(term698528, term698528.getClass(), "first", term698618);
        setIntField(term698528, term698528.getClass(), "type", 101);
        setIntField(term698796, term698796.getClass(), "type", 114);
        setField(term698528, term698528.getClass(), "parent", term698796);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term698528;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term698436, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


