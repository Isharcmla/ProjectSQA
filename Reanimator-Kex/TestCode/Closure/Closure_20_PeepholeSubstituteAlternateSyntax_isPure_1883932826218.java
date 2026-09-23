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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50410;
     Object term50480;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50410 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term50480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50550 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50620 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50690 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50480, term50480.getClass(), "type", 103);
        setIntField(term50550, term50550.getClass(), "type", 2);
        setIntField(term50620, term50620.getClass(), "type", 1);
        setField(term50620, term50620.getClass(), "first", null);
        setField(term50620, term50620.getClass(), "next", null);
        setField(term50550, term50550.getClass(), "first", term50620);
        setIntField(term50690, term50690.getClass(), "type", 0);
        setField(term50690, term50690.getClass(), "first", null);
        setField(term50690, term50690.getClass(), "next", null);
        setField(term50550, term50550.getClass(), "next", term50690);
        setField(term50480, term50480.getClass(), "first", term50550);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term50480;
        callMethod(klass, "isPure", argTypes, term50410, args);
    }

};


