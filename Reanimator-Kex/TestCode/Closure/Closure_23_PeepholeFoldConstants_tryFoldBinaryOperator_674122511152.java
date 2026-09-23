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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24812;
     Object term24882;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24812 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term24882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term24882, term24882.getClass(), "first", term24882);
        setField(term24882, term24882.getClass(), "next", term24882);
        setIntField(term24882, term24882.getClass(), "type", 9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term24882;
        callMethod(klass, "tryFoldBinaryOperator", argTypes, term24812, args);
    }

};


