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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896869;
     Object term896961;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896869 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term896961 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term897047 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term897139 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term897139, term897139.getClass(), "type", 40);
        setField(term897047, term897047.getClass(), "next", term897139);
        setField(term896961, term896961.getClass(), "first", term897047);
        setIntField(term896961, term896961.getClass(), "type", 33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term896961;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term896869, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


