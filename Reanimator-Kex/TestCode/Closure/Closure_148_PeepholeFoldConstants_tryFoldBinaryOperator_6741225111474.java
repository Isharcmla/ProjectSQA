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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366170;
     Object term366256;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term366170 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term366256 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term366342 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term366428 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term366428, term366428.getClass(), "type", 44);
        setField(term366342, term366342.getClass(), "next", term366428);
        setIntField(term366342, term366342.getClass(), "type", 0);
        setField(term366256, term366256.getClass(), "first", term366342);
        setIntField(term366256, term366256.getClass(), "type", 100);
        setField(term366256, term366256.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term366256;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term366170, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


