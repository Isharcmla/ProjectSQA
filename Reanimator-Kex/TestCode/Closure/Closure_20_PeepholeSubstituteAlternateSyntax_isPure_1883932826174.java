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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34021;
     Object term34091;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34021 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term34091 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34231 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34091, term34091.getClass(), "type", 151);
        setIntField(term34161, term34161.getClass(), "type", 2);
        setIntField(term34231, term34231.getClass(), "type", 1);
        setField(term34231, term34231.getClass(), "first", null);
        setField(term34231, term34231.getClass(), "next", null);
        setField(term34161, term34161.getClass(), "first", term34231);
        setIntField(term34301, term34301.getClass(), "type", 0);
        setField(term34301, term34301.getClass(), "first", null);
        setField(term34301, term34301.getClass(), "next", null);
        setField(term34161, term34161.getClass(), "next", term34301);
        setField(term34091, term34091.getClass(), "first", term34161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term34091;
        callMethod(klass, "isPure", argTypes, term34021, args);
    }

};


