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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218213;
     Object term218305;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term218213 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term218305 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term218397 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term218487 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term218487, term218487.getClass(), "type", 39);
        setField(term218397, term218397.getClass(), "next", term218487);
        setIntField(term218397, term218397.getClass(), "type", 39);
        setField(term218305, term218305.getClass(), "first", term218397);
        setIntField(term218305, term218305.getClass(), "type", 22);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term218305;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term218213, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


