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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111604 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term621453;
     Object term621539;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111604() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term621453 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term621539 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term621625 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term621717 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term621717, term621717.getClass(), "type", 39);
        setField(term621625, term621625.getClass(), "next", term621717);
        setIntField(term621625, term621625.getClass(), "type", 39);
        setField(term621539, term621539.getClass(), "first", term621625);
        setIntField(term621539, term621539.getClass(), "type", 22);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term621539;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term621453, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


