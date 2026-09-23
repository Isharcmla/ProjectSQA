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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term473339;
     Object term473425;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term473339 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term473425 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term473511 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term473603 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term473603, term473603.getClass(), "type", 40);
        setField(term473603, term473603.getClass(), "str", "length");
        setField(term473511, term473511.getClass(), "next", term473603);
        setIntField(term473511, term473511.getClass(), "type", 40);
        setField(term473425, term473425.getClass(), "first", term473511);
        setIntField(term473425, term473425.getClass(), "type", 33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term473425;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term473339, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


