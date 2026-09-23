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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term765140;
     Object term765210;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term765140 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term765210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term765300 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term765390 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term765476 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term765390, term765390.getClass(), "type", 44);
        setField(term765300, term765300.getClass(), "next", term765390);
        setIntField(term765300, term765300.getClass(), "type", 0);
        setField(term765210, term765210.getClass(), "first", term765300);
        setIntField(term765210, term765210.getClass(), "type", 101);
        setIntField(term765476, term765476.getClass(), "type", 114);
        setField(term765210, term765210.getClass(), "parent", term765476);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term765210;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term765140, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


