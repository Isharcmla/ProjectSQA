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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276377;
     Object term276469;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term276377 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term276469 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term276561 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term276653 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term276653, term276653.getClass(), "type", 39);
        setField(term276561, term276561.getClass(), "next", term276653);
        setIntField(term276561, term276561.getClass(), "type", 39);
        setField(term276469, term276469.getClass(), "first", term276561);
        setIntField(term276469, term276469.getClass(), "type", 20);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term276469;
        callMethod(klass, "tryFoldBinaryOperator", argTypes, term276377, args);
    }

};


