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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178568;
     Object term178638;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178568 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term178638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term178708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term178638, term178638.getClass(), "first", term178638);
        setIntField(term178708, term178708.getClass(), "type", 40);
        setField(term178638, term178638.getClass(), "next", term178708);
        setIntField(term178638, term178638.getClass(), "type", 33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term178638;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term178568, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


