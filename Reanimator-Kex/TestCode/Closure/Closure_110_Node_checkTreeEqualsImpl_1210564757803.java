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

public class Node_checkTreeEqualsImpl_1210564757803 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90906;
     Object term90941;

    public Node_checkTreeEqualsImpl_1210564757803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term90906, term90906.getClass(), "type", 0);
        setField(term90906, term90906.getClass(), "first", null);
        term90941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term90941, term90941.getClass(), "type", 0);
        setField(term90941, term90941.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term90941;
        callMethod(klass, "checkTreeEqualsImpl", argTypes, term90906, args);
    }

};


