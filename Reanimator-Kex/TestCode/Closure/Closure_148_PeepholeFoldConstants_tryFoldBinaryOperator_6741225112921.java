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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854006;
     Object term854092;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854006 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term854092 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term854178 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term854270 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term854270, term854270.getClass(), "type", 40);
        setField(term854270, term854270.getClass(), "str", "length");
        setField(term854178, term854178.getClass(), "next", term854270);
        setIntField(term854178, term854178.getClass(), "type", 63);
        setField(term854178, term854178.getClass(), "first", null);
        setField(term854092, term854092.getClass(), "first", term854178);
        setIntField(term854092, term854092.getClass(), "type", 33);
        setField(term854092, term854092.getClass(), "parent", term854178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term854092;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term854006, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


