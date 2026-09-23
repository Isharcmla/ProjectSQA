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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46204;
     Object term46274;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46204 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term46274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46274, term46274.getClass(), "type", 90);
        setIntField(term46344, term46344.getClass(), "type", 2);
        setIntField(term46414, term46414.getClass(), "type", 1);
        setField(term46414, term46414.getClass(), "first", null);
        setField(term46414, term46414.getClass(), "next", null);
        setField(term46344, term46344.getClass(), "first", term46414);
        setIntField(term46484, term46484.getClass(), "type", 0);
        setField(term46484, term46484.getClass(), "first", null);
        setField(term46484, term46484.getClass(), "next", null);
        setField(term46344, term46344.getClass(), "next", term46484);
        setField(term46274, term46274.getClass(), "first", term46344);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term46274;
        callMethod(klass, "isPure", argTypes, term46204, args);
    }

};


