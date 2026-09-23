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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23127;
     Object term23197;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23127 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term23197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23197, term23197.getClass(), "type", 140);
        setIntField(term23267, term23267.getClass(), "type", 2);
        setIntField(term23337, term23337.getClass(), "type", 1);
        setField(term23337, term23337.getClass(), "first", null);
        setField(term23337, term23337.getClass(), "next", null);
        setField(term23267, term23267.getClass(), "first", term23337);
        setIntField(term23407, term23407.getClass(), "type", 0);
        setField(term23407, term23407.getClass(), "first", null);
        setField(term23407, term23407.getClass(), "next", null);
        setField(term23267, term23267.getClass(), "next", term23407);
        setField(term23197, term23197.getClass(), "first", term23267);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term23197;
        callMethod(klass, "isPure", argTypes, term23127, args);
    }

};


