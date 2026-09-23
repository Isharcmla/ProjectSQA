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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224846;
     Object term224932;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term224846 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term224932 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term225018 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term225104 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term225190 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term225260 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term225190, term225190.getClass(), "next", term225260);
        setField(term225104, term225104.getClass(), "first", term225190);
        setField(term225104, term225104.getClass(), "last", term225260);
        setField(term225018, term225018.getClass(), "next", term225104);
        setIntField(term225018, term225018.getClass(), "type", 93);
        setField(term224932, term224932.getClass(), "first", term225018);
        setIntField(term224932, term224932.getClass(), "type", 86);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term224932;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term224846, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


