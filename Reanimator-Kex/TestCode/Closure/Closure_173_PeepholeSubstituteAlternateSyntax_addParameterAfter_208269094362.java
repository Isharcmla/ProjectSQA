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

public class PeepholeSubstituteAlternateSyntax_addParameterAfter_208269094362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6130;
     Object term6222;
     Object term6682;

    public PeepholeSubstituteAlternateSyntax_addParameterAfter_208269094362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6130 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term6222 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term6314 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term6406 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term6498 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term6590 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term6590, term6590.getClass(), "next", null);
        setField(term6498, term6498.getClass(), "next", term6590);
        setField(term6406, term6406.getClass(), "next", term6498);
        setField(term6314, term6314.getClass(), "next", term6406);
        setField(term6222, term6222.getClass(), "next", term6314);
        term6682 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term6222;
        args[1] = term6682;
        try {
            callMethod(klass, "addParameterAfter", argTypes, term6130, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


