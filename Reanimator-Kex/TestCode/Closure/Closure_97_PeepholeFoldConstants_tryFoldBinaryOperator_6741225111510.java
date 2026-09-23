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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term557965;
     Object term558057;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term557965 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term558057 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term558149 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term558239 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term558239, term558239.getClass(), "type", 39);
        setField(term558149, term558149.getClass(), "next", term558239);
        setIntField(term558149, term558149.getClass(), "type", 39);
        setField(term558057, term558057.getClass(), "first", term558149);
        setIntField(term558057, term558057.getClass(), "type", 22);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term558057;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term557965, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


