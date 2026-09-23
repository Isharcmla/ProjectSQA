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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37013;
     Object term37083;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37013 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term37083 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37293 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37083, term37083.getClass(), "type", 53);
        setIntField(term37153, term37153.getClass(), "type", 2);
        setIntField(term37223, term37223.getClass(), "type", 1);
        setField(term37223, term37223.getClass(), "first", null);
        setField(term37223, term37223.getClass(), "next", null);
        setField(term37153, term37153.getClass(), "first", term37223);
        setIntField(term37293, term37293.getClass(), "type", 0);
        setField(term37293, term37293.getClass(), "first", null);
        setField(term37293, term37293.getClass(), "next", null);
        setField(term37153, term37153.getClass(), "next", term37293);
        setField(term37083, term37083.getClass(), "first", term37153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term37083;
        callMethod(klass, "isPure", argTypes, term37013, args);
    }

};


