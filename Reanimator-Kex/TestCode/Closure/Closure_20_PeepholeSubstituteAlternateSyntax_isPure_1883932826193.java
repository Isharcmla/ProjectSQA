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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40663;
     Object term40733;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40663 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term40733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40803 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40943 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40733, term40733.getClass(), "type", 72);
        setIntField(term40803, term40803.getClass(), "type", 2);
        setIntField(term40873, term40873.getClass(), "type", 1);
        setField(term40873, term40873.getClass(), "first", null);
        setField(term40873, term40873.getClass(), "next", null);
        setField(term40803, term40803.getClass(), "first", term40873);
        setIntField(term40943, term40943.getClass(), "type", 0);
        setField(term40943, term40943.getClass(), "first", null);
        setField(term40943, term40943.getClass(), "next", null);
        setField(term40803, term40803.getClass(), "next", term40943);
        setField(term40733, term40733.getClass(), "first", term40803);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term40733;
        callMethod(klass, "isPure", argTypes, term40663, args);
    }

};


