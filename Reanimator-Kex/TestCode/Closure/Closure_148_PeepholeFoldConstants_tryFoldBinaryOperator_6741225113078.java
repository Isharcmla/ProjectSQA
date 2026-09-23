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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term908670;
     Object term908756;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term908670 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term908756 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term908842 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term908934 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term908934, term908934.getClass(), "type", 44);
        setField(term908842, term908842.getClass(), "next", term908934);
        setIntField(term908842, term908842.getClass(), "type", 0);
        setField(term908756, term908756.getClass(), "first", term908842);
        setIntField(term908756, term908756.getClass(), "type", 100);
        setField(term908756, term908756.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term908756;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term908670, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


