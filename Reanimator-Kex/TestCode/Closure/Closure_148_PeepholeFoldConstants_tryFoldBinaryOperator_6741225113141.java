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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term929801;
     Object term929893;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term929801 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term929893 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term929979 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term930065 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term930135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term930065, term930065.getClass(), "type", 64);
        setField(term929979, term929979.getClass(), "next", term930065);
        setIntField(term929979, term929979.getClass(), "type", 0);
        setField(term929893, term929893.getClass(), "first", term929979);
        setIntField(term929893, term929893.getClass(), "type", 101);
        setIntField(term930135, term930135.getClass(), "type", 114);
        setField(term929893, term929893.getClass(), "parent", term930135);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term929893;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term929801, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


