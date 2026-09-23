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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511770 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220915;
     Object term221001;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511770() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term220915 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term221001 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term221087 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term221173 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term221259 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term221329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term221259, term221259.getClass(), "next", term221329);
        setField(term221173, term221173.getClass(), "first", term221259);
        setField(term221173, term221173.getClass(), "last", term221329);
        setField(term221087, term221087.getClass(), "next", term221173);
        setIntField(term221087, term221087.getClass(), "type", 87);
        setField(term221001, term221001.getClass(), "first", term221087);
        setIntField(term221001, term221001.getClass(), "type", 86);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term221001;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term220915, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


