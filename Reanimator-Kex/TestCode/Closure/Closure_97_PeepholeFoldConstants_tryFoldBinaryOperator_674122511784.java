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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511784 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225935;
     Object term226021;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511784() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term225935 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term226021 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term226107 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term226193 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term226193, term226193.getClass(), "type", 40);
        setField(term226107, term226107.getClass(), "next", term226193);
        setField(term226021, term226021.getClass(), "first", term226107);
        setIntField(term226021, term226021.getClass(), "type", 33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term226021;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term225935, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


