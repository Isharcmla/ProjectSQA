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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53186;
     Object term53256;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53186 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term53256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term53256, term53256.getClass(), "type", 73);
        setIntField(term53326, term53326.getClass(), "type", 2);
        setIntField(term53396, term53396.getClass(), "type", 1);
        setField(term53396, term53396.getClass(), "first", null);
        setField(term53396, term53396.getClass(), "next", null);
        setField(term53326, term53326.getClass(), "first", term53396);
        setIntField(term53466, term53466.getClass(), "type", 0);
        setField(term53466, term53466.getClass(), "first", null);
        setField(term53466, term53466.getClass(), "next", null);
        setField(term53326, term53326.getClass(), "next", term53466);
        setField(term53256, term53256.getClass(), "first", term53326);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term53256;
        callMethod(klass, "isPure", argTypes, term53186, args);
    }

};


