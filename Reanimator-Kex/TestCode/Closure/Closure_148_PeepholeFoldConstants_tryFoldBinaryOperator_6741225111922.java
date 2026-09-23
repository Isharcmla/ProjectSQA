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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term510177;
     Object term510263;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term510177 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term510263 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term510349 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term510435 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term510521 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term510349, term510349.getClass(), "next", term510435);
        setIntField(term510349, term510349.getClass(), "type", 44);
        setField(term510263, term510263.getClass(), "first", term510349);
        setIntField(term510263, term510263.getClass(), "type", 101);
        setField(term510263, term510263.getClass(), "parent", term510521);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term510263;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term510177, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


