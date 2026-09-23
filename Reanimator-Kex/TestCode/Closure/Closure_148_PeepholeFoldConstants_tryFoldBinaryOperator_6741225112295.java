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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term631524;
     Object term631610;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term631524 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term631610 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term631696 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term631786 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term631856 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term631786, term631786.getClass(), "type", 63);
        setField(term631696, term631696.getClass(), "next", term631786);
        setIntField(term631696, term631696.getClass(), "type", 0);
        setField(term631610, term631610.getClass(), "first", term631696);
        setIntField(term631610, term631610.getClass(), "type", 101);
        setIntField(term631856, term631856.getClass(), "type", 114);
        setField(term631610, term631610.getClass(), "parent", term631856);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term631610;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term631524, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


