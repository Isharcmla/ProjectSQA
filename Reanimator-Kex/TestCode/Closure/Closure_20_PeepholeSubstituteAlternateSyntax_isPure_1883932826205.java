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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45316;
     Object term45386;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45316 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term45386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45456 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45526 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45596 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45386, term45386.getClass(), "type", 138);
        setIntField(term45456, term45456.getClass(), "type", 2);
        setIntField(term45526, term45526.getClass(), "type", 1);
        setField(term45526, term45526.getClass(), "first", null);
        setField(term45526, term45526.getClass(), "next", null);
        setField(term45456, term45456.getClass(), "first", term45526);
        setIntField(term45596, term45596.getClass(), "type", 0);
        setField(term45596, term45596.getClass(), "first", null);
        setField(term45596, term45596.getClass(), "next", null);
        setField(term45456, term45456.getClass(), "next", term45596);
        setField(term45386, term45386.getClass(), "first", term45456);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term45386;
        callMethod(klass, "isPure", argTypes, term45316, args);
    }

};


