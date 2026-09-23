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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term586161;
     Object term586253;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term586161 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term586253 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term586339 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term586425 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term586495 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term586425, term586425.getClass(), "type", 64);
        setField(term586339, term586339.getClass(), "next", term586425);
        setIntField(term586339, term586339.getClass(), "type", 0);
        setField(term586253, term586253.getClass(), "first", term586339);
        setIntField(term586253, term586253.getClass(), "type", 101);
        setIntField(term586495, term586495.getClass(), "type", 108);
        setField(term586253, term586253.getClass(), "parent", term586495);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term586253;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term586161, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


