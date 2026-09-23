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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term948989;
     Object term949075;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term948989 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term949075 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term949161 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term949247 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term949333 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term949247, term949247.getClass(), "type", 63);
        setField(term949161, term949161.getClass(), "next", term949247);
        setIntField(term949161, term949161.getClass(), "type", 0);
        setField(term949075, term949075.getClass(), "first", term949161);
        setIntField(term949075, term949075.getClass(), "type", 101);
        setIntField(term949333, term949333.getClass(), "type", 108);
        setField(term949075, term949075.getClass(), "parent", term949333);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term949075;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term948989, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


