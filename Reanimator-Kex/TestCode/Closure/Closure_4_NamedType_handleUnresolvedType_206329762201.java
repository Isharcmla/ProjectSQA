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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.Object;
import java.util.HashSet;

public class NamedType_handleUnresolvedType_206329762201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52783;
     Object term53281;
     Object term53382;
     Object term53387;

    public NamedType_handleUnresolvedType_206329762201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term52935 = new HashSet();
        term52783 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term52887 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term52887, term52887.getClass(), "lastGeneration", true);
        setField(term52887, term52887.getClass(), "forwardDeclaredTypes", term52935);
        setField(term52783, term52783.getClass(), "registry", term52887);
        setField(term52783, term52783.getClass(), "reference", null);
        setField(term52783, term52783.getClass(), "sourceName", "");
        setIntField(term52783, term52783.getClass(), "lineno", 0);
        setIntField(term52783, term52783.getClass(), "charno", 0);
        term53281 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.NullErrorReporter$OldRhinoNullReporter"));
        term53382 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.NullErrorReporter$OldRhinoNullReporter"));
        term53387 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.NullErrorReporter$OldRhinoNullReporter"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term53281;
        args[1] = true;
        callMethod(klass, "handleUnresolvedType", argTypes, term52783, args);
        assertTrue(recursiveEquals(term52783, term53382));
        assertTrue(recursiveEquals(term53281, "Bad type annotation. Unknown type null"));
    }

};


