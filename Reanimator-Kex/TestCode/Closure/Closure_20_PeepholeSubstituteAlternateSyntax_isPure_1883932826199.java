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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42860;
     Object term42930;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42860 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term42930 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43000 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43070 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42930, term42930.getClass(), "type", 93);
        setIntField(term43000, term43000.getClass(), "type", 2);
        setIntField(term43070, term43070.getClass(), "type", 1);
        setField(term43070, term43070.getClass(), "first", null);
        setField(term43070, term43070.getClass(), "next", null);
        setField(term43000, term43000.getClass(), "first", term43070);
        setIntField(term43140, term43140.getClass(), "type", 0);
        setField(term43140, term43140.getClass(), "first", null);
        setField(term43140, term43140.getClass(), "next", null);
        setField(term43000, term43000.getClass(), "next", term43140);
        setField(term42930, term42930.getClass(), "first", term43000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term42930;
        callMethod(klass, "isPure", argTypes, term42860, args);
    }

};


