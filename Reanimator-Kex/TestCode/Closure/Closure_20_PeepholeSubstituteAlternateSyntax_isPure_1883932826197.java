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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42183;
     Object term42253;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42183 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term42253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42253, term42253.getClass(), "type", 104);
        setIntField(term42323, term42323.getClass(), "type", 2);
        setIntField(term42393, term42393.getClass(), "type", 1);
        setField(term42393, term42393.getClass(), "first", null);
        setField(term42393, term42393.getClass(), "next", null);
        setField(term42323, term42323.getClass(), "first", term42393);
        setIntField(term42463, term42463.getClass(), "type", 0);
        setField(term42463, term42463.getClass(), "first", null);
        setField(term42463, term42463.getClass(), "next", null);
        setField(term42323, term42323.getClass(), "next", term42463);
        setField(term42253, term42253.getClass(), "first", term42323);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term42253;
        callMethod(klass, "isPure", argTypes, term42183, args);
    }

};


