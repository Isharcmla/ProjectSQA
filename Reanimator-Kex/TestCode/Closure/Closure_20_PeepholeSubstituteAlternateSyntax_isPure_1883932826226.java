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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53858;
     Object term53928;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53858 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term53928 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54068 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term53928, term53928.getClass(), "type", 85);
        setIntField(term53998, term53998.getClass(), "type", 2);
        setIntField(term54068, term54068.getClass(), "type", 1);
        setField(term54068, term54068.getClass(), "first", null);
        setField(term54068, term54068.getClass(), "next", null);
        setField(term53998, term53998.getClass(), "first", term54068);
        setIntField(term54138, term54138.getClass(), "type", 0);
        setField(term54138, term54138.getClass(), "first", null);
        setField(term54138, term54138.getClass(), "next", null);
        setField(term53998, term53998.getClass(), "next", term54138);
        setField(term53928, term53928.getClass(), "first", term53998);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term53928;
        callMethod(klass, "isPure", argTypes, term53858, args);
    }

};


