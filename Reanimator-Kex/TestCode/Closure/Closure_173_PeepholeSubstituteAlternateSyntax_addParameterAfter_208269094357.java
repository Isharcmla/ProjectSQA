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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeSubstituteAlternateSyntax_addParameterAfter_208269094357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4740;
     Object term4832;

    public PeepholeSubstituteAlternateSyntax_addParameterAfter_208269094357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4740 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term4832 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4924 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term5016 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term5108 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term5108, term5108.getClass(), "next", term5016);
        setField(term5016, term5016.getClass(), "next", term5108);
        setField(term4924, term4924.getClass(), "next", term5016);
        setField(term4832, term4832.getClass(), "next", term4924);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term4832;
        args[1] = null;
        try {
            callMethod(klass, "addParameterAfter", argTypes, term4740, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


