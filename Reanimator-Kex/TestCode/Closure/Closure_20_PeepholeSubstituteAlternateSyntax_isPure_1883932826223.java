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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52727;
     Object term52797;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52727 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term52797 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52867 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term52797, term52797.getClass(), "type", 55);
        setIntField(term52867, term52867.getClass(), "type", 2);
        setIntField(term52937, term52937.getClass(), "type", 1);
        setField(term52937, term52937.getClass(), "first", null);
        setField(term52937, term52937.getClass(), "next", null);
        setField(term52867, term52867.getClass(), "first", term52937);
        setIntField(term53007, term53007.getClass(), "type", 0);
        setField(term53007, term53007.getClass(), "first", null);
        setField(term53007, term53007.getClass(), "next", null);
        setField(term52867, term52867.getClass(), "next", term53007);
        setField(term52797, term52797.getClass(), "first", term52867);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term52797;
        callMethod(klass, "isPure", argTypes, term52727, args);
    }

};


