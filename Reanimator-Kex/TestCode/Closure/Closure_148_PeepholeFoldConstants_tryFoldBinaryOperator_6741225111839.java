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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term482029;
     Object term482121;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term482029 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term482121 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term482211 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term482303 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term482389 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term482303, term482303.getClass(), "type", 44);
        setField(term482211, term482211.getClass(), "next", term482303);
        setIntField(term482211, term482211.getClass(), "type", 0);
        setField(term482121, term482121.getClass(), "first", term482211);
        setIntField(term482121, term482121.getClass(), "type", 101);
        setIntField(term482389, term482389.getClass(), "type", 113);
        setField(term482121, term482121.getClass(), "parent", term482389);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term482121;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term482029, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


