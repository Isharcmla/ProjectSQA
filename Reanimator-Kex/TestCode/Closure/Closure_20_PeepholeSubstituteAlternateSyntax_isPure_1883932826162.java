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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30052;
     Object term30122;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30052 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term30122 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30192 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30262 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30122, term30122.getClass(), "type", 75);
        setIntField(term30192, term30192.getClass(), "type", 2);
        setIntField(term30262, term30262.getClass(), "type", 1);
        setField(term30262, term30262.getClass(), "first", null);
        setField(term30262, term30262.getClass(), "next", null);
        setField(term30192, term30192.getClass(), "first", term30262);
        setIntField(term30332, term30332.getClass(), "type", 0);
        setField(term30332, term30332.getClass(), "first", null);
        setField(term30332, term30332.getClass(), "next", null);
        setField(term30192, term30192.getClass(), "next", term30332);
        setField(term30122, term30122.getClass(), "first", term30192);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term30122;
        callMethod(klass, "isPure", argTypes, term30052, args);
    }

};


