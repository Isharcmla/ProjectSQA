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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50869;
     Object term50939;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50869 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term50939 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51079 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50939, term50939.getClass(), "type", 82);
        setIntField(term51009, term51009.getClass(), "type", 2);
        setIntField(term51079, term51079.getClass(), "type", 1);
        setField(term51079, term51079.getClass(), "first", null);
        setField(term51079, term51079.getClass(), "next", null);
        setField(term51009, term51009.getClass(), "first", term51079);
        setIntField(term51149, term51149.getClass(), "type", 0);
        setField(term51149, term51149.getClass(), "first", null);
        setField(term51149, term51149.getClass(), "next", null);
        setField(term51009, term51009.getClass(), "next", term51149);
        setField(term50939, term50939.getClass(), "first", term51009);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term50939;
        callMethod(klass, "isPure", argTypes, term50869, args);
    }

};


