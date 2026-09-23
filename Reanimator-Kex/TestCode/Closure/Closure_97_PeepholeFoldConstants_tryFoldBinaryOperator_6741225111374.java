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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term466683;
     Object term466773;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term466683 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term466773 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term466863 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term466953 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term466953, term466953.getClass(), "type", 39);
        setField(term466863, term466863.getClass(), "next", term466953);
        setIntField(term466863, term466863.getClass(), "type", 39);
        setField(term466773, term466773.getClass(), "first", term466863);
        setIntField(term466773, term466773.getClass(), "type", 24);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term466773;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term466683, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


