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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290341;
     Object term290431;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290341 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term290431 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term290521 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term290611 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term290611, term290611.getClass(), "type", 39);
        setField(term290521, term290521.getClass(), "next", term290611);
        setIntField(term290521, term290521.getClass(), "type", 39);
        setField(term290431, term290431.getClass(), "first", term290521);
        setIntField(term290431, term290431.getClass(), "type", 18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term290431;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term290341, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


