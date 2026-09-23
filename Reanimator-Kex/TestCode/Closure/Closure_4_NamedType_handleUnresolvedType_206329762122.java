package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NamedType_handleUnresolvedType_206329762122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25797;
     Object term26045;

    public NamedType_handleUnresolvedType_206329762122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25797 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term25901 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term25901, term25901.getClass(), "lastGeneration", true);
        setField(term25797, term25797.getClass(), "registry", term25901);
        setField(term25797, term25797.getClass(), "reference", null);
        setField(term25797, term25797.getClass(), "sourceName", null);
        setIntField(term25797, term25797.getClass(), "lineno", 0);
        setIntField(term25797, term25797.getClass(), "charno", 0);
        term26045 = newInstance(Class.forName("com.google.javascript.jscomp.RhinoErrorReporter$OldRhinoErrorReporter"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term26045;
        args[1] = false;
        try {
            callMethod(klass, "handleUnresolvedType", argTypes, term25797, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


