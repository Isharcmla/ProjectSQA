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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term860807;
     Object term860893;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term860807 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term860893 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term860979 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term861065 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term861065, term861065.getClass(), "type", 40);
        setField(term860979, term860979.getClass(), "next", term861065);
        setField(term860893, term860893.getClass(), "first", term860979);
        setIntField(term860893, term860893.getClass(), "type", 33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term860893;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term860807, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


