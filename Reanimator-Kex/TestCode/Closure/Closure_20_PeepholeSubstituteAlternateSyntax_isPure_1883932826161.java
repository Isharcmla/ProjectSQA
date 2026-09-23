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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29593;
     Object term29663;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29593 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term29663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29803 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29663, term29663.getClass(), "type", 50);
        setIntField(term29733, term29733.getClass(), "type", 2);
        setIntField(term29803, term29803.getClass(), "type", 1);
        setField(term29803, term29803.getClass(), "first", null);
        setField(term29803, term29803.getClass(), "next", null);
        setField(term29733, term29733.getClass(), "first", term29803);
        setIntField(term29873, term29873.getClass(), "type", 0);
        setField(term29873, term29873.getClass(), "first", null);
        setField(term29873, term29873.getClass(), "next", null);
        setField(term29733, term29733.getClass(), "next", term29873);
        setField(term29663, term29663.getClass(), "first", term29733);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term29663;
        callMethod(klass, "isPure", argTypes, term29593, args);
    }

};


