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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48509;
     Object term48579;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48509 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term48579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48649 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48789 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48579, term48579.getClass(), "type", 113);
        setIntField(term48649, term48649.getClass(), "type", 2);
        setIntField(term48719, term48719.getClass(), "type", 1);
        setField(term48719, term48719.getClass(), "first", null);
        setField(term48719, term48719.getClass(), "next", null);
        setField(term48649, term48649.getClass(), "first", term48719);
        setIntField(term48789, term48789.getClass(), "type", 0);
        setField(term48789, term48789.getClass(), "first", null);
        setField(term48789, term48789.getClass(), "next", null);
        setField(term48649, term48649.getClass(), "next", term48789);
        setField(term48579, term48579.getClass(), "first", term48649);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term48579;
        callMethod(klass, "isPure", argTypes, term48509, args);
    }

};


