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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term335038;
     Object term335130;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term335038 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term335130 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term335216 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term335302 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term335302, term335302.getClass(), "type", 44);
        setField(term335216, term335216.getClass(), "next", term335302);
        setIntField(term335216, term335216.getClass(), "type", 0);
        setField(term335130, term335130.getClass(), "first", term335216);
        setIntField(term335130, term335130.getClass(), "type", 101);
        setField(term335130, term335130.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term335130;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term335038, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


