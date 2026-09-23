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

public class Node_checkTreeEqualsImpl_1210564757824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94616;
     Object term94651;

    public Node_checkTreeEqualsImpl_1210564757824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term94616, term94616.getClass(), "type", 37);
        setField(term94616, term94616.getClass(), "first", null);
        term94651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term94651, term94651.getClass(), "type", 37);
        setField(term94651, term94651.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term94651;
        callMethod(klass, "checkTreeEqualsImpl", argTypes, term94616, args);
    }

};


