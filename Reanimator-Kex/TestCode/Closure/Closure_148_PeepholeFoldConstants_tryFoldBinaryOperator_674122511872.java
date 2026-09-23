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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202160;
     Object term202252;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term202160 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term202252 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term202344 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term202436 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term202436, term202436.getClass(), "type", 39);
        setField(term202344, term202344.getClass(), "next", term202436);
        setIntField(term202344, term202344.getClass(), "type", 39);
        setField(term202252, term202252.getClass(), "first", term202344);
        setIntField(term202252, term202252.getClass(), "type", 23);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term202252;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term202160, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


