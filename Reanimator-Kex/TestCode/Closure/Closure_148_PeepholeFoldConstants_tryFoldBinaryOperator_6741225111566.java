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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term394658;
     Object term394750;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term394658 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term394750 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term394836 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term394906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term394906, term394906.getClass(), "type", 44);
        setField(term394836, term394836.getClass(), "next", term394906);
        setIntField(term394836, term394836.getClass(), "type", 0);
        setField(term394750, term394750.getClass(), "first", term394836);
        setIntField(term394750, term394750.getClass(), "type", 101);
        setField(term394750, term394750.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term394750;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term394658, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


