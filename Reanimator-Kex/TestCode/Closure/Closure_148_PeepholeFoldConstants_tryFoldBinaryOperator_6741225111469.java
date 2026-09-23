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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term364453;
     Object term364539;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term364453 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term364539 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term364609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term364695 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term364695, term364695.getClass(), "type", 44);
        setField(term364609, term364609.getClass(), "next", term364695);
        setIntField(term364609, term364609.getClass(), "type", 0);
        setField(term364539, term364539.getClass(), "first", term364609);
        setIntField(term364539, term364539.getClass(), "type", 101);
        setField(term364539, term364539.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term364539;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term364453, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


