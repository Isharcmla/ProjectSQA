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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term735334;
     Object term735426;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term735334 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term735426 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term735518 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term735610 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term735718 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term735610, term735610.getClass(), "type", 40);
        setField(term735610, term735610.getClass(), "str", "length");
        setField(term735518, term735518.getClass(), "next", term735610);
        setIntField(term735518, term735518.getClass(), "type", 63);
        setField(term735518, term735518.getClass(), "first", null);
        setField(term735426, term735426.getClass(), "first", term735518);
        setIntField(term735426, term735426.getClass(), "type", 33);
        setField(term735426, term735426.getClass(), "parent", term735718);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term735426;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term735334, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


