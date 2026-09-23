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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term728910;
     Object term729002;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term728910 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term729002 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term729092 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term729184 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term729184, term729184.getClass(), "type", 47);
        setField(term729092, term729092.getClass(), "next", term729184);
        setIntField(term729092, term729092.getClass(), "type", 0);
        setField(term729002, term729002.getClass(), "first", term729092);
        setIntField(term729002, term729002.getClass(), "type", 101);
        setField(term729002, term729002.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term729002;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term728910, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


