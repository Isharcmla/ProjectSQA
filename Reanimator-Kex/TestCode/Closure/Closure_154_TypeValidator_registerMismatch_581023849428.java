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
import java.lang.Object;

public class TypeValidator_registerMismatch_581023849428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205355;
     Object term205600;
     Object term205688;
     Object term205689;
     Object term205691;

    public TypeValidator_registerMismatch_581023849428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term205355 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term205600 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term205649 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setField(term205600, term205600.getClass(), "referencedType", term205649);
        term205688 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term205688, term205688.getClass(), "compiler", null);
        setField(term205688, term205688.getClass(), "typeRegistry", null);
        setField(term205688, term205688.getClass(), "allValueTypes", null);
        setBooleanField(term205688, term205688.getClass(), "shouldReport", false);
        setField(term205688, term205688.getClass(), "nullOrUndefined", null);
        setField(term205688, term205688.getClass(), "mismatches", null);
        term205689 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term205690 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setField(term205689, term205689.getClass(), "indexType", null);
        setBooleanField(term205690, term205690.getClass(), "resolved", false);
        setField(term205690, term205690.getClass(), "resolveResult", null);
        setField(term205690, term205690.getClass(), "registry", null);
        setField(term205689, term205689.getClass(), "referencedType", term205690);
        setField(term205689, term205689.getClass(), "referencedObjType", null);
        setBooleanField(term205689, term205689.getClass(), "visited", false);
        setField(term205689, term205689.getClass(), "docInfo", null);
        setBooleanField(term205689, term205689.getClass(), "unknown", false);
        setBooleanField(term205689, term205689.getClass(), "resolved", false);
        setField(term205689, term205689.getClass(), "resolveResult", null);
        setField(term205689, term205689.getClass(), "registry", null);
        term205691 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term205692 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setField(term205691, term205691.getClass(), "indexType", null);
        setBooleanField(term205692, term205692.getClass(), "resolved", false);
        setField(term205692, term205692.getClass(), "resolveResult", null);
        setField(term205692, term205692.getClass(), "registry", null);
        setField(term205691, term205691.getClass(), "referencedType", term205692);
        setField(term205691, term205691.getClass(), "referencedObjType", null);
        setBooleanField(term205691, term205691.getClass(), "visited", false);
        setField(term205691, term205691.getClass(), "docInfo", null);
        setBooleanField(term205691, term205691.getClass(), "unknown", false);
        setBooleanField(term205691, term205691.getClass(), "resolved", false);
        setField(term205691, term205691.getClass(), "resolveResult", null);
        setField(term205691, term205691.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term205600;
        args[1] = term205600;
        callMethod(klass, "registerMismatch", argTypes, term205355, args);
        assertTrue(recursiveEquals(term205355, term205688));
        assertTrue(recursiveEquals(term205600, term205689));
        assertTrue(recursiveEquals(term205600, term205691));
    }

};


