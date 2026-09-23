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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134557;
     Object term134627;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134557 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term134627 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term134697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term134767 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term134767, term134767.getClass(), "type", 39);
        setField(term134697, term134697.getClass(), "next", term134767);
        setIntField(term134697, term134697.getClass(), "type", 39);
        setField(term134627, term134627.getClass(), "first", term134697);
        setIntField(term134627, term134627.getClass(), "type", 22);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term134627;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term134557, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


