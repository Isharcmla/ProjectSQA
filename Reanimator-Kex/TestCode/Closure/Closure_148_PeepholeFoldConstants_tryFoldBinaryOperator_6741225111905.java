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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111905 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term503896;
     Object term503988;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111905() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term503896 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term503988 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term504074 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term504144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term504230 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term504074, term504074.getClass(), "next", term504144);
        setIntField(term504074, term504074.getClass(), "type", 63);
        setField(term503988, term503988.getClass(), "first", term504074);
        setIntField(term503988, term503988.getClass(), "type", 101);
        setField(term503988, term503988.getClass(), "parent", term504230);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term503988;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term503896, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


