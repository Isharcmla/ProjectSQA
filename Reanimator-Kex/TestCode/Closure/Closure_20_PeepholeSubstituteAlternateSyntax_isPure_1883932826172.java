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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33349;
     Object term33419;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33349 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term33419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33419, term33419.getClass(), "type", 112);
        setIntField(term33489, term33489.getClass(), "type", 2);
        setIntField(term33559, term33559.getClass(), "type", 1);
        setField(term33559, term33559.getClass(), "first", null);
        setField(term33559, term33559.getClass(), "next", null);
        setField(term33489, term33489.getClass(), "first", term33559);
        setIntField(term33629, term33629.getClass(), "type", 0);
        setField(term33629, term33629.getClass(), "first", null);
        setField(term33629, term33629.getClass(), "next", null);
        setField(term33489, term33489.getClass(), "next", term33629);
        setField(term33419, term33419.getClass(), "first", term33489);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term33419;
        callMethod(klass, "isPure", argTypes, term33349, args);
    }

};


