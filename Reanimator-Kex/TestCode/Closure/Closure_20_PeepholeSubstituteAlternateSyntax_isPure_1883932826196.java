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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41724;
     Object term41794;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41724 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term41794 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41864 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42004 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41794, term41794.getClass(), "type", 66);
        setIntField(term41864, term41864.getClass(), "type", 2);
        setIntField(term41934, term41934.getClass(), "type", 1);
        setField(term41934, term41934.getClass(), "first", null);
        setField(term41934, term41934.getClass(), "next", null);
        setField(term41864, term41864.getClass(), "first", term41934);
        setIntField(term42004, term42004.getClass(), "type", 0);
        setField(term42004, term42004.getClass(), "first", null);
        setField(term42004, term42004.getClass(), "next", null);
        setField(term41864, term41864.getClass(), "next", term42004);
        setField(term41794, term41794.getClass(), "first", term41864);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term41794;
        callMethod(klass, "isPure", argTypes, term41724, args);
    }

};


