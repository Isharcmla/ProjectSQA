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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term456187;
     Object term456279;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term456187 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term456279 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term456369 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term456439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term456439, term456439.getClass(), "type", 64);
        setField(term456369, term456369.getClass(), "next", term456439);
        setIntField(term456369, term456369.getClass(), "type", 0);
        setField(term456279, term456279.getClass(), "first", term456369);
        setIntField(term456279, term456279.getClass(), "type", 101);
        setField(term456279, term456279.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term456279;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term456187, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


