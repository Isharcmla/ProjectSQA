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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term418030;
     Object term418116;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term418030 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term418116 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term418202 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term418294 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term418294, term418294.getClass(), "type", 63);
        setField(term418202, term418202.getClass(), "next", term418294);
        setIntField(term418202, term418202.getClass(), "type", 0);
        setField(term418116, term418116.getClass(), "first", term418202);
        setIntField(term418116, term418116.getClass(), "type", 100);
        setField(term418116, term418116.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term418116;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term418030, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


