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

public class TypeValidator_registerIfMismatch_196302127496 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39218;
     Object term39312;
     Object term39872;
     Object term39873;

    public TypeValidator_registerIfMismatch_196302127496() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39218 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term39312 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        term39872 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term39872, term39872.getClass(), "compiler", null);
        setField(term39872, term39872.getClass(), "typeRegistry", null);
        setField(term39872, term39872.getClass(), "allValueTypes", null);
        setBooleanField(term39872, term39872.getClass(), "shouldReport", false);
        setField(term39872, term39872.getClass(), "nullOrUndefined", null);
        setField(term39872, term39872.getClass(), "mismatches", null);
        term39873 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term39873, term39873.getClass(), "parameters", null);
        setField(term39873, term39873.getClass(), "returnType", null);
        setBooleanField(term39873, term39873.getClass(), "returnTypeInferred", false);
        setBooleanField(term39873, term39873.getClass(), "resolved", false);
        setField(term39873, term39873.getClass(), "resolveResult", null);
        setField(term39873, term39873.getClass(), "templateTypeMap", null);
        setBooleanField(term39873, term39873.getClass(), "inTemplatedCheckVisit", false);
        setField(term39873, term39873.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[3];
        args[0] = term39312;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "registerIfMismatch", argTypes, term39218, args);
        assertTrue(recursiveEquals(term39218, term39872));
        assertTrue(recursiveEquals(term39312, term39873));
    }

};


