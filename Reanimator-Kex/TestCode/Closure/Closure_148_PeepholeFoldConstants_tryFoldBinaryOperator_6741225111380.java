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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term337400;
     Object term337492;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term337400 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term337492 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term337582 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term337668 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term337668, term337668.getClass(), "type", 44);
        setField(term337582, term337582.getClass(), "next", term337668);
        setIntField(term337582, term337582.getClass(), "type", 0);
        setField(term337492, term337492.getClass(), "first", term337582);
        setIntField(term337492, term337492.getClass(), "type", 101);
        setField(term337492, term337492.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term337492;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term337400, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


