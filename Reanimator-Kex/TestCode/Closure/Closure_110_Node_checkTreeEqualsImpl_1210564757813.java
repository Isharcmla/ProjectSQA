package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Node_checkTreeEqualsImpl_1210564757813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92774;
     Object term92809;

    public Node_checkTreeEqualsImpl_1210564757813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92774 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term92774, term92774.getClass(), "type", 40);
        setField(term92774, term92774.getClass(), "first", null);
        term92809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term92809, term92809.getClass(), "type", 40);
        setField(term92809, term92809.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term92809;
        callMethod(klass, "checkTreeEqualsImpl", argTypes, term92774, args);
    }

};


