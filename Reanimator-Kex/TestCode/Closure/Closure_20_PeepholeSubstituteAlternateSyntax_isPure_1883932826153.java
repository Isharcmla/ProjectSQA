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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26186;
     Object term26256;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26186 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term26256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26256, term26256.getClass(), "type", 107);
        setIntField(term26326, term26326.getClass(), "type", 2);
        setIntField(term26396, term26396.getClass(), "type", 1);
        setField(term26396, term26396.getClass(), "first", null);
        setField(term26396, term26396.getClass(), "next", null);
        setField(term26326, term26326.getClass(), "first", term26396);
        setIntField(term26466, term26466.getClass(), "type", 0);
        setField(term26466, term26466.getClass(), "first", null);
        setField(term26466, term26466.getClass(), "next", null);
        setField(term26326, term26326.getClass(), "next", term26466);
        setField(term26256, term26256.getClass(), "first", term26326);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term26256;
        callMethod(klass, "isPure", argTypes, term26186, args);
    }

};


