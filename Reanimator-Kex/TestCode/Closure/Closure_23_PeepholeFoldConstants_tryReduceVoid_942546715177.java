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

public class PeepholeFoldConstants_tryReduceVoid_942546715177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31381;
     Object term31531;

    public PeepholeFoldConstants_tryReduceVoid_942546715177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31381 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term31461 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term31381, term31381.getClass(), "compiler", term31461);
        term31531 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31601, term31601.getClass(), "type", 113);
        setField(term31531, term31531.getClass(), "first", term31601);
        setIntField(term31531, term31531.getClass(), "type", 113);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term31531;
        callMethod(klass, "tryReduceVoid", argTypes, term31381, args);
    }

};


