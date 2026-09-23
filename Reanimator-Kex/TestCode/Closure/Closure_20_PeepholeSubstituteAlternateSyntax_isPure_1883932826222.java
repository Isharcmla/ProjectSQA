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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52268;
     Object term52338;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52268 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term52338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term52338, term52338.getClass(), "type", 45);
        setIntField(term52408, term52408.getClass(), "type", 2);
        setIntField(term52478, term52478.getClass(), "type", 1);
        setField(term52478, term52478.getClass(), "first", null);
        setField(term52478, term52478.getClass(), "next", null);
        setField(term52408, term52408.getClass(), "first", term52478);
        setIntField(term52548, term52548.getClass(), "type", 0);
        setField(term52548, term52548.getClass(), "first", null);
        setField(term52548, term52548.getClass(), "next", null);
        setField(term52408, term52408.getClass(), "next", term52548);
        setField(term52338, term52338.getClass(), "first", term52408);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term52338;
        callMethod(klass, "isPure", argTypes, term52268, args);
    }

};


