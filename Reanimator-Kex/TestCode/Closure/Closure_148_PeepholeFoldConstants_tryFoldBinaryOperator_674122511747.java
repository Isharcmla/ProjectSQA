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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167818;
     Object term167910;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167818 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term167910 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term168002 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term168094 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term168094, term168094.getClass(), "type", 40);
        setField(term168002, term168002.getClass(), "next", term168094);
        setField(term167910, term167910.getClass(), "first", term168002);
        setIntField(term167910, term167910.getClass(), "type", 33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term167910;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term167818, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


