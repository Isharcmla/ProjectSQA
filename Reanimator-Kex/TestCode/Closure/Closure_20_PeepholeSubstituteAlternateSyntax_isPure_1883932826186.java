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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38144;
     Object term38214;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38144 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term38214 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38214, term38214.getClass(), "type", 132);
        setIntField(term38284, term38284.getClass(), "type", 2);
        setIntField(term38354, term38354.getClass(), "type", 1);
        setField(term38354, term38354.getClass(), "first", null);
        setField(term38354, term38354.getClass(), "next", null);
        setField(term38284, term38284.getClass(), "first", term38354);
        setIntField(term38424, term38424.getClass(), "type", 0);
        setField(term38424, term38424.getClass(), "first", null);
        setField(term38424, term38424.getClass(), "next", null);
        setField(term38284, term38284.getClass(), "next", term38424);
        setField(term38214, term38214.getClass(), "first", term38284);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term38214;
        callMethod(klass, "isPure", argTypes, term38144, args);
    }

};


