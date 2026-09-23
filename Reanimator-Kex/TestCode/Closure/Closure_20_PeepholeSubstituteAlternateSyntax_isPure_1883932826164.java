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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30639;
     Object term30709;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30639 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term30709 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30779 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30849 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30941 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term30709, term30709.getClass(), "type", 4);
        setIntField(term30779, term30779.getClass(), "type", 1);
        setIntField(term30849, term30849.getClass(), "type", 0);
        setField(term30849, term30849.getClass(), "first", null);
        setField(term30849, term30849.getClass(), "next", null);
        setField(term30779, term30779.getClass(), "first", term30849);
        setField(term30779, term30779.getClass(), "next", term30941);
        setField(term30709, term30709.getClass(), "first", term30779);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term30709;
        callMethod(klass, "isPure", argTypes, term30639, args);
    }

};


