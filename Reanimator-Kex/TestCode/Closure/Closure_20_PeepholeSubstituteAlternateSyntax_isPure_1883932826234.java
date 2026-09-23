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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57359;
     Object term57429;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57359 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term57429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57499 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57569 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57429, term57429.getClass(), "type", 119);
        setIntField(term57499, term57499.getClass(), "type", 2);
        setIntField(term57569, term57569.getClass(), "type", 1);
        setField(term57569, term57569.getClass(), "first", null);
        setField(term57569, term57569.getClass(), "next", null);
        setField(term57499, term57499.getClass(), "first", term57569);
        setIntField(term57639, term57639.getClass(), "type", 0);
        setField(term57639, term57639.getClass(), "first", null);
        setField(term57639, term57639.getClass(), "next", null);
        setField(term57499, term57499.getClass(), "next", term57639);
        setField(term57429, term57429.getClass(), "first", term57499);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term57429;
        callMethod(klass, "isPure", argTypes, term57359, args);
    }

};


