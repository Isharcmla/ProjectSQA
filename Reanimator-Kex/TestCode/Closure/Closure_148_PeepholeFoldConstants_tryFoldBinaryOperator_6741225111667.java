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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term427751;
     Object term427843;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term427751 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term427843 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term427933 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term428003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term428003, term428003.getClass(), "type", 63);
        setField(term427933, term427933.getClass(), "next", term428003);
        setIntField(term427933, term427933.getClass(), "type", 0);
        setField(term427843, term427843.getClass(), "first", term427933);
        setIntField(term427843, term427843.getClass(), "type", 101);
        setField(term427843, term427843.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term427843;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term427751, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


