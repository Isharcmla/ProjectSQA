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

public class PeepholeSubstituteAlternateSyntax_addParameterAfter_2082690943165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86457;
     Object term86549;

    public PeepholeSubstituteAlternateSyntax_addParameterAfter_2082690943165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86457 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term86549 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term86641 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term86733 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term86733, term86733.getClass(), "next", null);
        setField(term86641, term86641.getClass(), "next", term86733);
        setField(term86549, term86549.getClass(), "next", term86641);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term86549;
        args[1] = null;
        try {
            callMethod(klass, "addParameterAfter", argTypes, term86457, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


