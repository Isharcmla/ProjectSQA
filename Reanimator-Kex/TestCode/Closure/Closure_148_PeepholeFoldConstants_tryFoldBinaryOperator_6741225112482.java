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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term695774;
     Object term695844;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term695774 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term695844 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term695934 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term696024 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term696024, term696024.getClass(), "type", 63);
        setField(term695934, term695934.getClass(), "next", term696024);
        setIntField(term695934, term695934.getClass(), "type", 0);
        setField(term695844, term695844.getClass(), "first", term695934);
        setIntField(term695844, term695844.getClass(), "type", 101);
        setField(term695844, term695844.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term695844;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term695774, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


