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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term526709;
     Object term526779;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term526709 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term526779 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term526849 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term526919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term526989 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term526849, term526849.getClass(), "next", term526919);
        setIntField(term526849, term526849.getClass(), "type", 63);
        setField(term526779, term526779.getClass(), "first", term526849);
        setIntField(term526779, term526779.getClass(), "type", 101);
        setField(term526779, term526779.getClass(), "parent", term526989);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term526779;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term526709, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


