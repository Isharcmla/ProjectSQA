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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeSubstituteAlternateSyntax_addParameterAfter_2082690943126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11169;
     Object term11261;

    public PeepholeSubstituteAlternateSyntax_addParameterAfter_2082690943126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11169 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term11261 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term11353 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term11445 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term11537 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term11537, term11537.getClass(), "next", term11445);
        setField(term11445, term11445.getClass(), "next", term11537);
        setField(term11353, term11353.getClass(), "next", term11445);
        setField(term11261, term11261.getClass(), "next", term11353);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term11261;
        args[1] = null;
        try {
            callMethod(klass, "addParameterAfter", argTypes, term11169, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


