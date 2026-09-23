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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32890;
     Object term32960;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32890 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term32960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33030 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33100 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32960, term32960.getClass(), "type", 81);
        setIntField(term33030, term33030.getClass(), "type", 2);
        setIntField(term33100, term33100.getClass(), "type", 1);
        setField(term33100, term33100.getClass(), "first", null);
        setField(term33100, term33100.getClass(), "next", null);
        setField(term33030, term33030.getClass(), "first", term33100);
        setIntField(term33170, term33170.getClass(), "type", 0);
        setField(term33170, term33170.getClass(), "first", null);
        setField(term33170, term33170.getClass(), "next", null);
        setField(term33030, term33030.getClass(), "next", term33170);
        setField(term32960, term32960.getClass(), "first", term33030);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term32960;
        callMethod(klass, "isPure", argTypes, term32890, args);
    }

};


