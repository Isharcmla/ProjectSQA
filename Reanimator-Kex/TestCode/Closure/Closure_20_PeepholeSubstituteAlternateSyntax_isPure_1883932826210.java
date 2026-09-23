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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47123;
     Object term47193;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47123 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term47193 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47333 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47403 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47193, term47193.getClass(), "type", 102);
        setIntField(term47263, term47263.getClass(), "type", 2);
        setIntField(term47333, term47333.getClass(), "type", 1);
        setField(term47333, term47333.getClass(), "first", null);
        setField(term47333, term47333.getClass(), "next", null);
        setField(term47263, term47263.getClass(), "first", term47333);
        setIntField(term47403, term47403.getClass(), "type", 0);
        setField(term47403, term47403.getClass(), "first", null);
        setField(term47403, term47403.getClass(), "next", null);
        setField(term47263, term47263.getClass(), "next", term47403);
        setField(term47193, term47193.getClass(), "first", term47263);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term47193;
        callMethod(klass, "isPure", argTypes, term47123, args);
    }

};


