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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51787;
     Object term51857;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51787 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term51857 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51997 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52067 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term51857, term51857.getClass(), "type", 97);
        setIntField(term51927, term51927.getClass(), "type", 2);
        setIntField(term51997, term51997.getClass(), "type", 1);
        setField(term51997, term51997.getClass(), "first", null);
        setField(term51997, term51997.getClass(), "next", null);
        setField(term51927, term51927.getClass(), "first", term51997);
        setIntField(term52067, term52067.getClass(), "type", 0);
        setField(term52067, term52067.getClass(), "first", null);
        setField(term52067, term52067.getClass(), "next", null);
        setField(term51927, term51927.getClass(), "next", term52067);
        setField(term51857, term51857.getClass(), "first", term51927);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term51857;
        callMethod(klass, "isPure", argTypes, term51787, args);
    }

};


