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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47582;
     Object term47652;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47582 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term47652 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47862 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47652, term47652.getClass(), "type", 148);
        setIntField(term47722, term47722.getClass(), "type", 2);
        setIntField(term47792, term47792.getClass(), "type", 1);
        setField(term47792, term47792.getClass(), "first", null);
        setField(term47792, term47792.getClass(), "next", null);
        setField(term47722, term47722.getClass(), "first", term47792);
        setIntField(term47862, term47862.getClass(), "type", 0);
        setField(term47862, term47862.getClass(), "first", null);
        setField(term47862, term47862.getClass(), "next", null);
        setField(term47722, term47722.getClass(), "next", term47862);
        setField(term47652, term47652.getClass(), "first", term47722);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term47652;
        callMethod(klass, "isPure", argTypes, term47582, args);
    }

};


