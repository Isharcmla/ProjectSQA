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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112590 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term735007;
     Object term735093;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112590() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term735007 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term735093 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term735179 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term735265 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term735351 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term735265, term735265.getClass(), "type", 47);
        setField(term735179, term735179.getClass(), "next", term735265);
        setIntField(term735179, term735179.getClass(), "type", 0);
        setField(term735093, term735093.getClass(), "first", term735179);
        setIntField(term735093, term735093.getClass(), "type", 101);
        setIntField(term735351, term735351.getClass(), "type", 113);
        setField(term735093, term735093.getClass(), "parent", term735351);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term735093;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term735007, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


