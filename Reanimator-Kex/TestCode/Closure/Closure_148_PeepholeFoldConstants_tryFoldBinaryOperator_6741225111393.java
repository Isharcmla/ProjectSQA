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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term341772;
     Object term341864;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term341772 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term341864 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term341950 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term342020 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term342106 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term341950, term341950.getClass(), "next", term342020);
        setIntField(term341950, term341950.getClass(), "type", 47);
        setField(term341864, term341864.getClass(), "first", term341950);
        setIntField(term341864, term341864.getClass(), "type", 101);
        setField(term341864, term341864.getClass(), "parent", term342106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term341864;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term341772, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


