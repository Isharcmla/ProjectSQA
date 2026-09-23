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

public class TypeCheck_getTypedPercent_6213520186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52276;
     Object term52813;

    public TypeCheck_getTypedPercent_6213520186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52276 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setIntField(term52276, term52276.getClass(), "nullCount", -1);
        setIntField(term52276, term52276.getClass(), "unknownCount", 0);
        setIntField(term52276, term52276.getClass(), "typedCount", 0);
        term52813 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term52813, term52813.getClass(), "compiler", null);
        setField(term52813, term52813.getClass(), "validator", null);
        setField(term52813, term52813.getClass(), "reverseInterpreter", null);
        setField(term52813, term52813.getClass(), "typeRegistry", null);
        setField(term52813, term52813.getClass(), "topScope", null);
        setField(term52813, term52813.getClass(), "scopeCreator", null);
        setField(term52813, term52813.getClass(), "reportMissingOverride", null);
        setField(term52813, term52813.getClass(), "reportUnknownTypes", null);
        setBooleanField(term52813, term52813.getClass(), "reportMissingProperties", false);
        setField(term52813, term52813.getClass(), "inferJSDocInfo", null);
        setIntField(term52813, term52813.getClass(), "typedCount", 0);
        setIntField(term52813, term52813.getClass(), "nullCount", -1);
        setIntField(term52813, term52813.getClass(), "unknownCount", 0);
        setBooleanField(term52813, term52813.getClass(), "inExterns", false);
        setIntField(term52813, term52813.getClass(), "noTypeCheckSection", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getTypedPercent", argTypes, term52276, args);
        assertTrue(recursiveEquals(term52276, term52813));
        assertTrue(recursiveEquals(retValue, -0.0));
    }

};


