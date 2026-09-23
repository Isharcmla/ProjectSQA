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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189936;
     Object term190028;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term189936 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term190028 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term190120 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term190210 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term190210, term190210.getClass(), "type", 39);
        setField(term190120, term190120.getClass(), "next", term190210);
        setIntField(term190120, term190120.getClass(), "type", 39);
        setField(term190028, term190028.getClass(), "first", term190120);
        setIntField(term190028, term190028.getClass(), "type", 20);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term190028;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term189936, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


