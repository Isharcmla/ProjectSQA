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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29134;
     Object term29204;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29134 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term29204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29204, term29204.getClass(), "type", 116);
        setIntField(term29274, term29274.getClass(), "type", 2);
        setIntField(term29344, term29344.getClass(), "type", 1);
        setField(term29344, term29344.getClass(), "first", null);
        setField(term29344, term29344.getClass(), "next", null);
        setField(term29274, term29274.getClass(), "first", term29344);
        setIntField(term29414, term29414.getClass(), "type", 0);
        setField(term29414, term29414.getClass(), "first", null);
        setField(term29414, term29414.getClass(), "next", null);
        setField(term29274, term29274.getClass(), "next", term29414);
        setField(term29204, term29204.getClass(), "first", term29274);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term29204;
        callMethod(klass, "isPure", argTypes, term29134, args);
    }

};


