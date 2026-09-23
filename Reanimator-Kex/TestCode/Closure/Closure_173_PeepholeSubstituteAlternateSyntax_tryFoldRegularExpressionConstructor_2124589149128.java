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

public class PeepholeSubstituteAlternateSyntax_tryFoldRegularExpressionConstructor_2124589149128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210016;
     Object term210086;

    public PeepholeSubstituteAlternateSyntax_tryFoldRegularExpressionConstructor_2124589149128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210016 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term210086 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term210156 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term210226 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term210296 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term210366 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term210086, term210086.getClass(), "parent", term210156);
        setField(term210296, term210296.getClass(), "next", term210366);
        setField(term210226, term210226.getClass(), "next", term210296);
        setField(term210086, term210086.getClass(), "first", term210226);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term210086;
        callMethod(klass, "tryFoldRegularExpressionConstructor", argTypes, term210016, args);
    }

};


