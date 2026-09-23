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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term558321;
     Object term558413;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term558321 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term558413 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term558499 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term558585 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term558655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term558585, term558585.getClass(), "type", 47);
        setField(term558499, term558499.getClass(), "next", term558585);
        setIntField(term558499, term558499.getClass(), "type", 0);
        setField(term558413, term558413.getClass(), "first", term558499);
        setIntField(term558413, term558413.getClass(), "type", 101);
        setIntField(term558655, term558655.getClass(), "type", 113);
        setField(term558413, term558413.getClass(), "parent", term558655);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term558413;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term558321, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


