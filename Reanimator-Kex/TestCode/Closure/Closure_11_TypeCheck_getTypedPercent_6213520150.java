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

public class TypeCheck_getTypedPercent_6213520150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33896;
     Object term34296;

    public TypeCheck_getTypedPercent_6213520150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33896 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setIntField(term33896, term33896.getClass(), "nullCount", -1);
        setIntField(term33896, term33896.getClass(), "unknownCount", 0);
        setIntField(term33896, term33896.getClass(), "typedCount", 0);
        term34296 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term34296, term34296.getClass(), "compiler", null);
        setField(term34296, term34296.getClass(), "validator", null);
        setField(term34296, term34296.getClass(), "reverseInterpreter", null);
        setField(term34296, term34296.getClass(), "typeRegistry", null);
        setField(term34296, term34296.getClass(), "topScope", null);
        setField(term34296, term34296.getClass(), "scopeCreator", null);
        setField(term34296, term34296.getClass(), "reportMissingOverride", null);
        setField(term34296, term34296.getClass(), "reportUnknownTypes", null);
        setBooleanField(term34296, term34296.getClass(), "reportMissingProperties", false);
        setField(term34296, term34296.getClass(), "inferJSDocInfo", null);
        setIntField(term34296, term34296.getClass(), "typedCount", 0);
        setIntField(term34296, term34296.getClass(), "nullCount", -1);
        setIntField(term34296, term34296.getClass(), "unknownCount", 0);
        setBooleanField(term34296, term34296.getClass(), "inExterns", false);
        setIntField(term34296, term34296.getClass(), "noTypeCheckSection", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getTypedPercent", argTypes, term33896, args);
        assertTrue(recursiveEquals(term33896, term34296));
        assertTrue(recursiveEquals(retValue, -0.0));
    }

};


