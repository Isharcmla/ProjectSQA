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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111607 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term408036;
     Object term408128;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111607() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term408036 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term408128 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term408218 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term408304 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term408304, term408304.getClass(), "type", 64);
        setField(term408218, term408218.getClass(), "next", term408304);
        setIntField(term408218, term408218.getClass(), "type", 0);
        setField(term408128, term408128.getClass(), "first", term408218);
        setIntField(term408128, term408128.getClass(), "type", 101);
        setField(term408128, term408128.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term408128;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term408036, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


