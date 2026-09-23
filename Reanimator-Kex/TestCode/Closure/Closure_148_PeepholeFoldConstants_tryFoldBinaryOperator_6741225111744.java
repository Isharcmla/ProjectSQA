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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term452049;
     Object term452135;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term452049 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term452135 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term452221 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term452311 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term452311, term452311.getClass(), "type", 64);
        setField(term452221, term452221.getClass(), "next", term452311);
        setIntField(term452221, term452221.getClass(), "type", 0);
        setField(term452135, term452135.getClass(), "first", term452221);
        setIntField(term452135, term452135.getClass(), "type", 101);
        setField(term452135, term452135.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term452135;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term452049, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


