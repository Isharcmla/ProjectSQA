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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34480;
     Object term34550;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34480 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term34550 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34620 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34690 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34760 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34550, term34550.getClass(), "type", 149);
        setIntField(term34620, term34620.getClass(), "type", 2);
        setIntField(term34690, term34690.getClass(), "type", 1);
        setField(term34690, term34690.getClass(), "first", null);
        setField(term34690, term34690.getClass(), "next", null);
        setField(term34620, term34620.getClass(), "first", term34690);
        setIntField(term34760, term34760.getClass(), "type", 0);
        setField(term34760, term34760.getClass(), "first", null);
        setField(term34760, term34760.getClass(), "next", null);
        setField(term34620, term34620.getClass(), "next", term34760);
        setField(term34550, term34550.getClass(), "first", term34620);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term34550;
        callMethod(klass, "isPure", argTypes, term34480, args);
    }

};


