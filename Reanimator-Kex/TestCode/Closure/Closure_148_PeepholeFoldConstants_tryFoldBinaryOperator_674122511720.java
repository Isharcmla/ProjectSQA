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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160283;
     Object term160369;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160283 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term160369 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term160455 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term160541 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term160541, term160541.getClass(), "type", 39);
        setField(term160455, term160455.getClass(), "next", term160541);
        setIntField(term160455, term160455.getClass(), "type", 39);
        setField(term160369, term160369.getClass(), "first", term160455);
        setIntField(term160369, term160369.getClass(), "type", 22);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term160369;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term160283, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


