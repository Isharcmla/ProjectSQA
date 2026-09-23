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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28025;
     Object term28095;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28025 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term28095 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28165 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28095, term28095.getClass(), "type", 88);
        setIntField(term28165, term28165.getClass(), "type", 2);
        setIntField(term28235, term28235.getClass(), "type", 1);
        setField(term28235, term28235.getClass(), "first", null);
        setField(term28235, term28235.getClass(), "next", null);
        setField(term28165, term28165.getClass(), "first", term28235);
        setIntField(term28305, term28305.getClass(), "type", 0);
        setField(term28305, term28305.getClass(), "first", null);
        setField(term28305, term28305.getClass(), "next", null);
        setField(term28165, term28165.getClass(), "next", term28305);
        setField(term28095, term28095.getClass(), "first", term28165);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term28095;
        callMethod(klass, "isPure", argTypes, term28025, args);
    }

};


