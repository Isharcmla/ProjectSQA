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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27566;
     Object term27636;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27566 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term27636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27776 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27846 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27636, term27636.getClass(), "type", 99);
        setIntField(term27706, term27706.getClass(), "type", 2);
        setIntField(term27776, term27776.getClass(), "type", 1);
        setField(term27776, term27776.getClass(), "first", null);
        setField(term27776, term27776.getClass(), "next", null);
        setField(term27706, term27706.getClass(), "first", term27776);
        setIntField(term27846, term27846.getClass(), "type", 0);
        setField(term27846, term27846.getClass(), "first", null);
        setField(term27846, term27846.getClass(), "next", null);
        setField(term27706, term27706.getClass(), "next", term27846);
        setField(term27636, term27636.getClass(), "first", term27706);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term27636;
        callMethod(klass, "isPure", argTypes, term27566, args);
    }

};


