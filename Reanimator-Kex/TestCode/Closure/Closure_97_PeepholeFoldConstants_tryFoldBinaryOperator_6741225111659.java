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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term661952;
     Object term662044;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term661952 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term662044 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term662136 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term662228 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term662228, term662228.getClass(), "type", 40);
        setField(term662228, term662228.getClass(), "str", "length");
        setField(term662136, term662136.getClass(), "next", term662228);
        setIntField(term662136, term662136.getClass(), "type", 63);
        setField(term662044, term662044.getClass(), "first", term662136);
        setIntField(term662044, term662044.getClass(), "type", 33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term662044;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term661952, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


