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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class TypeValidator_registerMismatch_581023849334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121416;
     Object term121564;
     Object term121660;
     Object term121707;
     Object term121713;
     Object term121714;

    public TypeValidator_registerMismatch_581023849334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term121468 = new ArrayList();
        term121416 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term121416, term121416.getClass(), "mismatches", term121468);
        term121564 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        term121660 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        Object term121710 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        Object term121711 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        Object term121712 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setBooleanField(term121711, term121711.getClass(), "resolved", false);
        setField(term121711, term121711.getClass(), "resolveResult", null);
        setField(term121711, term121711.getClass(), "registry", null);
        setField(term121710, term121710.getClass(), "typeA", term121711);
        setBooleanField(term121712, term121712.getClass(), "resolved", false);
        setField(term121712, term121712.getClass(), "resolveResult", null);
        setField(term121712, term121712.getClass(), "registry", null);
        setField(term121710, term121710.getClass(), "typeB", term121712);
        ArrayList term121708 = new ArrayList();
        ((ArrayList) term121708).add(term121710);
        term121707 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term121707, term121707.getClass(), "compiler", null);
        setField(term121707, term121707.getClass(), "typeRegistry", null);
        setField(term121707, term121707.getClass(), "allValueTypes", null);
        setBooleanField(term121707, term121707.getClass(), "shouldReport", false);
        setField(term121707, term121707.getClass(), "nullOrUndefined", null);
        setField(term121707, term121707.getClass(), "mismatches", term121708);
        term121713 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setBooleanField(term121713, term121713.getClass(), "resolved", false);
        setField(term121713, term121713.getClass(), "resolveResult", null);
        setField(term121713, term121713.getClass(), "registry", null);
        term121714 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setBooleanField(term121714, term121714.getClass(), "resolved", false);
        setField(term121714, term121714.getClass(), "resolveResult", null);
        setField(term121714, term121714.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term121564;
        args[1] = term121660;
        callMethod(klass, "registerMismatch", argTypes, term121416, args);
        assertTrue(recursiveEquals(term121416, term121707));
        assertTrue(recursiveEquals(term121564, term121713));
        assertTrue(recursiveEquals(term121660, term121714));
    }

};


