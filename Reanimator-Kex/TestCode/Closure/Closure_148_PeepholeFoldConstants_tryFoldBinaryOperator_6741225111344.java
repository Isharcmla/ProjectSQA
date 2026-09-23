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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326037;
     Object term326129;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term326037 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term326129 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term326219 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term326311 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term326311, term326311.getClass(), "type", 44);
        setField(term326219, term326219.getClass(), "next", term326311);
        setIntField(term326219, term326219.getClass(), "type", 0);
        setField(term326129, term326129.getClass(), "first", term326219);
        setIntField(term326129, term326129.getClass(), "type", 101);
        setField(term326129, term326129.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term326129;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term326037, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


