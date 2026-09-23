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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term643143;
     Object term643235;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term643143 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term643235 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term643327 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term643419 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term643511 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term643327, term643327.getClass(), "next", term643419);
        setIntField(term643327, term643327.getClass(), "type", 47);
        setField(term643235, term643235.getClass(), "first", term643327);
        setIntField(term643235, term643235.getClass(), "type", 101);
        setField(term643235, term643235.getClass(), "parent", term643511);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term643235;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term643143, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


