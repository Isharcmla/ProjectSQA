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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511996 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232909;
     Object term232995;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term232909 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term232995 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term233087 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term232995, term232995.getClass(), "first", term232995);
        setIntField(term233087, term233087.getClass(), "type", 40);
        setField(term232995, term232995.getClass(), "next", term233087);
        setIntField(term232995, term232995.getClass(), "type", 33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term232995;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term232909, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


