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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511604 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131148;
     Object term131240;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511604() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131148 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term131240 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term131332 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term131424 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term131424, term131424.getClass(), "type", 39);
        setField(term131332, term131332.getClass(), "next", term131424);
        setIntField(term131332, term131332.getClass(), "type", 63);
        setField(term131240, term131240.getClass(), "first", term131332);
        setIntField(term131240, term131240.getClass(), "type", 35);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term131240;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term131148, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


