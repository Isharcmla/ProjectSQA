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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25268;
     Object term25338;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25268 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term25338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25338, term25338.getClass(), "type", 68);
        setIntField(term25408, term25408.getClass(), "type", 2);
        setIntField(term25478, term25478.getClass(), "type", 1);
        setField(term25478, term25478.getClass(), "first", null);
        setField(term25478, term25478.getClass(), "next", null);
        setField(term25408, term25408.getClass(), "first", term25478);
        setIntField(term25548, term25548.getClass(), "type", 0);
        setField(term25548, term25548.getClass(), "first", null);
        setField(term25548, term25548.getClass(), "next", null);
        setField(term25408, term25408.getClass(), "next", term25548);
        setField(term25338, term25338.getClass(), "first", term25408);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term25338;
        callMethod(klass, "isPure", argTypes, term25268, args);
    }

};


