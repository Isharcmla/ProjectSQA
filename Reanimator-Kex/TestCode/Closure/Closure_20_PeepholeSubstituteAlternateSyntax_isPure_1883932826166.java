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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31333;
     Object term31403;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31333 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term31403 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31473 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31543 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31613 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31403, term31403.getClass(), "type", 65);
        setIntField(term31473, term31473.getClass(), "type", 2);
        setIntField(term31543, term31543.getClass(), "type", 1);
        setField(term31543, term31543.getClass(), "first", null);
        setField(term31543, term31543.getClass(), "next", null);
        setField(term31473, term31473.getClass(), "first", term31543);
        setIntField(term31613, term31613.getClass(), "type", 0);
        setField(term31613, term31613.getClass(), "first", null);
        setField(term31613, term31613.getClass(), "next", null);
        setField(term31473, term31473.getClass(), "next", term31613);
        setField(term31403, term31403.getClass(), "first", term31473);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term31403;
        callMethod(klass, "isPure", argTypes, term31333, args);
    }

};


