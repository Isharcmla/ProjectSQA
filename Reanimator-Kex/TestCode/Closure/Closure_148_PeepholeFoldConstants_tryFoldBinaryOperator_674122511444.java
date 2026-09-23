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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90735;
     Object term90821;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90735 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term90821 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term90907 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term90999 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term90999, term90999.getClass(), "type", 39);
        setField(term90907, term90907.getClass(), "next", term90999);
        setIntField(term90907, term90907.getClass(), "type", 39);
        setField(term90821, term90821.getClass(), "first", term90907);
        setIntField(term90821, term90821.getClass(), "type", 20);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term90821;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term90735, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


