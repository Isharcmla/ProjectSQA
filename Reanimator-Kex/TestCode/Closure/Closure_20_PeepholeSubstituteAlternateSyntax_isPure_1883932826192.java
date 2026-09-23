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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40204;
     Object term40274;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40204 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term40274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40274, term40274.getClass(), "type", 52);
        setIntField(term40344, term40344.getClass(), "type", 2);
        setIntField(term40414, term40414.getClass(), "type", 1);
        setField(term40414, term40414.getClass(), "first", null);
        setField(term40414, term40414.getClass(), "next", null);
        setField(term40344, term40344.getClass(), "first", term40414);
        setIntField(term40484, term40484.getClass(), "type", 0);
        setField(term40484, term40484.getClass(), "first", null);
        setField(term40484, term40484.getClass(), "next", null);
        setField(term40344, term40344.getClass(), "next", term40484);
        setField(term40274, term40274.getClass(), "first", term40344);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term40274;
        callMethod(klass, "isPure", argTypes, term40204, args);
    }

};


