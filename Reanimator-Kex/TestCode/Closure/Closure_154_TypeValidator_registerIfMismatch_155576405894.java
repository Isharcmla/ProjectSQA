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

public class TypeValidator_registerIfMismatch_155576405894 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22702;
     Object term22808;
     Object term23078;
     Object term23079;

    public TypeValidator_registerIfMismatch_155576405894() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22702 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term22808 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        term23078 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term23078, term23078.getClass(), "compiler", null);
        setField(term23078, term23078.getClass(), "typeRegistry", null);
        setField(term23078, term23078.getClass(), "allValueTypes", null);
        setBooleanField(term23078, term23078.getClass(), "shouldReport", false);
        setField(term23078, term23078.getClass(), "nullOrUndefined", null);
        setField(term23078, term23078.getClass(), "mismatches", null);
        term23079 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term23079, term23079.getClass(), "referencedType", null);
        setField(term23079, term23079.getClass(), "referencedObjType", null);
        setBooleanField(term23079, term23079.getClass(), "visited", false);
        setField(term23079, term23079.getClass(), "docInfo", null);
        setBooleanField(term23079, term23079.getClass(), "unknown", false);
        setBooleanField(term23079, term23079.getClass(), "resolved", false);
        setField(term23079, term23079.getClass(), "resolveResult", null);
        setField(term23079, term23079.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term22808;
        args[1] = null;
        callMethod(klass, "registerIfMismatch", argTypes, term22702, args);
        assertTrue(recursiveEquals(term22702, term23078));
        assertTrue(recursiveEquals(term22808, term23079));
    }

};


