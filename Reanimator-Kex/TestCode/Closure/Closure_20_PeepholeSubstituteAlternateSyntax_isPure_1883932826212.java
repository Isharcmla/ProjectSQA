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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48041;
     Object term48111;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48041 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term48111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48111, term48111.getClass(), "type", 80);
        setIntField(term48181, term48181.getClass(), "type", 2);
        setIntField(term48251, term48251.getClass(), "type", 1);
        setField(term48251, term48251.getClass(), "first", null);
        setField(term48251, term48251.getClass(), "next", null);
        setField(term48181, term48181.getClass(), "first", term48251);
        setIntField(term48321, term48321.getClass(), "type", 0);
        setField(term48321, term48321.getClass(), "first", null);
        setField(term48321, term48321.getClass(), "next", null);
        setField(term48181, term48181.getClass(), "next", term48321);
        setField(term48111, term48111.getClass(), "first", term48181);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term48111;
        callMethod(klass, "isPure", argTypes, term48041, args);
    }

};


