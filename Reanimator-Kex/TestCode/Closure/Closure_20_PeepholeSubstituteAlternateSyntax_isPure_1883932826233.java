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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56900;
     Object term56970;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56900 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term56970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57040 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57180 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term56970, term56970.getClass(), "type", 92);
        setIntField(term57040, term57040.getClass(), "type", 2);
        setIntField(term57110, term57110.getClass(), "type", 1);
        setField(term57110, term57110.getClass(), "first", null);
        setField(term57110, term57110.getClass(), "next", null);
        setField(term57040, term57040.getClass(), "first", term57110);
        setIntField(term57180, term57180.getClass(), "type", 0);
        setField(term57180, term57180.getClass(), "first", null);
        setField(term57180, term57180.getClass(), "next", null);
        setField(term57040, term57040.getClass(), "next", term57180);
        setField(term56970, term56970.getClass(), "first", term57040);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term56970;
        callMethod(klass, "isPure", argTypes, term56900, args);
    }

};


