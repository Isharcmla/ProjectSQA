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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36554;
     Object term36624;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36554 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term36624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36694 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36834 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36624, term36624.getClass(), "type", 129);
        setIntField(term36694, term36694.getClass(), "type", 2);
        setIntField(term36764, term36764.getClass(), "type", 1);
        setField(term36764, term36764.getClass(), "first", null);
        setField(term36764, term36764.getClass(), "next", null);
        setField(term36694, term36694.getClass(), "first", term36764);
        setIntField(term36834, term36834.getClass(), "type", 0);
        setField(term36834, term36834.getClass(), "first", null);
        setField(term36834, term36834.getClass(), "next", null);
        setField(term36694, term36694.getClass(), "next", term36834);
        setField(term36624, term36624.getClass(), "first", term36694);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term36624;
        callMethod(klass, "isPure", argTypes, term36554, args);
    }

};


