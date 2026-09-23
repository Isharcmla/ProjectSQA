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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term434395;
     Object term434487;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term434395 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term434487 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term434577 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term434669 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term434669, term434669.getClass(), "type", 44);
        setField(term434577, term434577.getClass(), "next", term434669);
        setIntField(term434577, term434577.getClass(), "type", 0);
        setField(term434487, term434487.getClass(), "first", term434577);
        setIntField(term434487, term434487.getClass(), "type", 101);
        setField(term434487, term434487.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term434487;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term434395, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


