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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58277;
     Object term58347;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58277 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term58347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term58347, term58347.getClass(), "type", 133);
        setIntField(term58417, term58417.getClass(), "type", 2);
        setIntField(term58487, term58487.getClass(), "type", 1);
        setField(term58487, term58487.getClass(), "first", null);
        setField(term58487, term58487.getClass(), "next", null);
        setField(term58417, term58417.getClass(), "first", term58487);
        setIntField(term58557, term58557.getClass(), "type", 0);
        setField(term58557, term58557.getClass(), "first", null);
        setField(term58557, term58557.getClass(), "next", null);
        setField(term58417, term58417.getClass(), "next", term58557);
        setField(term58347, term58347.getClass(), "first", term58417);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term58347;
        callMethod(klass, "isPure", argTypes, term58277, args);
    }

};


