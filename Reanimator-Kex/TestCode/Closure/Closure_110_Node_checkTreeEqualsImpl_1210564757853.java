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

public class Node_checkTreeEqualsImpl_1210564757853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98076;
     Object term98111;

    public Node_checkTreeEqualsImpl_1210564757853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term98076, term98076.getClass(), "type", 103);
        setField(term98076, term98076.getClass(), "first", null);
        term98111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term98111, term98111.getClass(), "type", 103);
        setField(term98111, term98111.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term98111;
        callMethod(klass, "checkTreeEqualsImpl", argTypes, term98076, args);
    }

};


