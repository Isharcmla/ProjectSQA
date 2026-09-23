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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41265;
     Object term41335;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41265 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term41335 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41335, term41335.getClass(), "type", 70);
        setIntField(term41405, term41405.getClass(), "type", 2);
        setIntField(term41475, term41475.getClass(), "type", 1);
        setField(term41475, term41475.getClass(), "first", null);
        setField(term41475, term41475.getClass(), "next", null);
        setField(term41405, term41405.getClass(), "first", term41475);
        setIntField(term41545, term41545.getClass(), "type", 0);
        setField(term41545, term41545.getClass(), "first", null);
        setField(term41545, term41545.getClass(), "next", null);
        setField(term41405, term41405.getClass(), "next", term41545);
        setField(term41335, term41335.getClass(), "first", term41405);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term41335;
        callMethod(klass, "isPure", argTypes, term41265, args);
    }

};


