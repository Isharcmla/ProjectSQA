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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term910744;
     Object term910836;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term910744 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term910836 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term910926 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term911018 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term911110 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term911018, term911018.getClass(), "type", 64);
        setField(term910926, term910926.getClass(), "next", term911018);
        setIntField(term910926, term910926.getClass(), "type", 0);
        setField(term910836, term910836.getClass(), "first", term910926);
        setIntField(term910836, term910836.getClass(), "type", 101);
        setIntField(term911110, term911110.getClass(), "type", 114);
        setField(term910836, term910836.getClass(), "parent", term911110);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term910836;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term910744, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


