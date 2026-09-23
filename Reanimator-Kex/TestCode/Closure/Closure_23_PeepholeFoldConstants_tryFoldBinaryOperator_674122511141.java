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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22028;
     Object term22098;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22028 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term22098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term22098, term22098.getClass(), "first", term22098);
        setField(term22098, term22098.getClass(), "next", term22098);
        setIntField(term22098, term22098.getClass(), "type", 13);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term22098;
        callMethod(klass, "tryFoldBinaryOperator", argTypes, term22028, args);
    }

};


