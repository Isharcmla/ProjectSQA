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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term475859;
     Object term475951;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term475859 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term475951 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term476043 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term476129 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term476129, term476129.getClass(), "type", 44);
        setField(term476043, term476043.getClass(), "next", term476129);
        setIntField(term476043, term476043.getClass(), "type", 0);
        setField(term475951, term475951.getClass(), "first", term476043);
        setIntField(term475951, term475951.getClass(), "type", 101);
        setField(term475951, term475951.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term475951;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term475859, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


