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

public class TypeCheck_getTypedPercent_6213520134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31951;
     Object term31961;

    public TypeCheck_getTypedPercent_6213520134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31951 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setIntField(term31951, term31951.getClass(), "nullCount", -1);
        setIntField(term31951, term31951.getClass(), "unknownCount", 0);
        setIntField(term31951, term31951.getClass(), "typedCount", 0);
        term31961 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term31961, term31961.getClass(), "compiler", null);
        setField(term31961, term31961.getClass(), "validator", null);
        setField(term31961, term31961.getClass(), "reverseInterpreter", null);
        setField(term31961, term31961.getClass(), "typeRegistry", null);
        setField(term31961, term31961.getClass(), "topScope", null);
        setField(term31961, term31961.getClass(), "scopeCreator", null);
        setField(term31961, term31961.getClass(), "reportMissingOverride", null);
        setField(term31961, term31961.getClass(), "reportUnknownTypes", null);
        setBooleanField(term31961, term31961.getClass(), "reportMissingProperties", false);
        setField(term31961, term31961.getClass(), "inferJSDocInfo", null);
        setIntField(term31961, term31961.getClass(), "typedCount", 0);
        setIntField(term31961, term31961.getClass(), "nullCount", -1);
        setIntField(term31961, term31961.getClass(), "unknownCount", 0);
        setBooleanField(term31961, term31961.getClass(), "inExterns", false);
        setIntField(term31961, term31961.getClass(), "noTypeCheckSection", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getTypedPercent", argTypes, term31951, args);
        assertTrue(recursiveEquals(term31951, term31961));
        assertTrue(recursiveEquals(retValue, -0.0));
    }

};


