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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39040;
     Object term39110;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39040 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term39110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39180 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39250 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39320 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39110, term39110.getClass(), "type", 58);
        setIntField(term39180, term39180.getClass(), "type", 2);
        setIntField(term39250, term39250.getClass(), "type", 1);
        setField(term39250, term39250.getClass(), "first", null);
        setField(term39250, term39250.getClass(), "next", null);
        setField(term39180, term39180.getClass(), "first", term39250);
        setIntField(term39320, term39320.getClass(), "type", 0);
        setField(term39320, term39320.getClass(), "first", null);
        setField(term39320, term39320.getClass(), "next", null);
        setField(term39180, term39180.getClass(), "next", term39320);
        setField(term39110, term39110.getClass(), "first", term39180);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term39110;
        callMethod(klass, "isPure", argTypes, term39040, args);
    }

};


