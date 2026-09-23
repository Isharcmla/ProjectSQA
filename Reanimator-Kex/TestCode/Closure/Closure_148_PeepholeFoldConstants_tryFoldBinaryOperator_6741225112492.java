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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term698989;
     Object term699059;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term698989 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term699059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term699149 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term699239 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term699239, term699239.getClass(), "type", 47);
        setField(term699149, term699149.getClass(), "next", term699239);
        setIntField(term699149, term699149.getClass(), "type", 0);
        setField(term699059, term699059.getClass(), "first", term699149);
        setIntField(term699059, term699059.getClass(), "type", 101);
        setField(term699059, term699059.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term699059;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term698989, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


