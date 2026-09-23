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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111690 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term434856;
     Object term434948;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111690() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term434856 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term434948 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term435038 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term435130 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term435130, term435130.getClass(), "type", 64);
        setField(term435038, term435038.getClass(), "next", term435130);
        setIntField(term435038, term435038.getClass(), "type", 0);
        setField(term434948, term434948.getClass(), "first", term435038);
        setIntField(term434948, term434948.getClass(), "type", 101);
        setField(term434948, term434948.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term434948;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term434856, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


