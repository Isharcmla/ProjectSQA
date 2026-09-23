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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25727;
     Object term25797;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25727 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term25797 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25867 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25797, term25797.getClass(), "type", 84);
        setIntField(term25867, term25867.getClass(), "type", 2);
        setIntField(term25937, term25937.getClass(), "type", 1);
        setField(term25937, term25937.getClass(), "first", null);
        setField(term25937, term25937.getClass(), "next", null);
        setField(term25867, term25867.getClass(), "first", term25937);
        setIntField(term26007, term26007.getClass(), "type", 0);
        setField(term26007, term26007.getClass(), "first", null);
        setField(term26007, term26007.getClass(), "next", null);
        setField(term25867, term25867.getClass(), "next", term26007);
        setField(term25797, term25797.getClass(), "first", term25867);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term25797;
        callMethod(klass, "isPure", argTypes, term25727, args);
    }

};


