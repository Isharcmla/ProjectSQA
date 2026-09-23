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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35656;
     Object term35726;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35656 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term35726 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35796 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35866 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35936 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35726, term35726.getClass(), "type", 91);
        setIntField(term35796, term35796.getClass(), "type", 2);
        setIntField(term35866, term35866.getClass(), "type", 1);
        setField(term35866, term35866.getClass(), "first", null);
        setField(term35866, term35866.getClass(), "next", null);
        setField(term35796, term35796.getClass(), "first", term35866);
        setIntField(term35936, term35936.getClass(), "type", 0);
        setField(term35936, term35936.getClass(), "first", null);
        setField(term35936, term35936.getClass(), "next", null);
        setField(term35796, term35796.getClass(), "next", term35936);
        setField(term35726, term35726.getClass(), "first", term35796);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term35726;
        callMethod(klass, "isPure", argTypes, term35656, args);
    }

};


