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

public class PeepholeSubstituteAlternateSyntax_addParameterAfter_2082690943138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20204;
     Object term20274;

    public PeepholeSubstituteAlternateSyntax_addParameterAfter_2082690943138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20204 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term20274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term20414, term20414.getClass(), "next", null);
        setField(term20344, term20344.getClass(), "next", term20414);
        setField(term20274, term20274.getClass(), "next", term20344);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term20274;
        args[1] = null;
        try {
            callMethod(klass, "addParameterAfter", argTypes, term20204, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


