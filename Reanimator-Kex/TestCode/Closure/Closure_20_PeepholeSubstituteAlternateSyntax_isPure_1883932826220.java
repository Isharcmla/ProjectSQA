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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51328;
     Object term51398;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51328 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term51398 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51468 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51538 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term51398, term51398.getClass(), "type", 94);
        setIntField(term51468, term51468.getClass(), "type", 2);
        setIntField(term51538, term51538.getClass(), "type", 1);
        setField(term51538, term51538.getClass(), "first", null);
        setField(term51538, term51538.getClass(), "next", null);
        setField(term51468, term51468.getClass(), "first", term51538);
        setIntField(term51608, term51608.getClass(), "type", 0);
        setField(term51608, term51608.getClass(), "first", null);
        setField(term51608, term51608.getClass(), "next", null);
        setField(term51468, term51468.getClass(), "next", term51608);
        setField(term51398, term51398.getClass(), "first", term51468);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term51398;
        callMethod(klass, "isPure", argTypes, term51328, args);
    }

};


