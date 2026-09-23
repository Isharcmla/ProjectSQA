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

public class TypeCheck_getTypedPercent_6213520172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41744;
     Object term42005;

    public TypeCheck_getTypedPercent_6213520172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41744 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setIntField(term41744, term41744.getClass(), "nullCount", -1);
        setIntField(term41744, term41744.getClass(), "unknownCount", 0);
        setIntField(term41744, term41744.getClass(), "typedCount", 0);
        term42005 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term42005, term42005.getClass(), "compiler", null);
        setField(term42005, term42005.getClass(), "validator", null);
        setField(term42005, term42005.getClass(), "reverseInterpreter", null);
        setField(term42005, term42005.getClass(), "typeRegistry", null);
        setField(term42005, term42005.getClass(), "topScope", null);
        setField(term42005, term42005.getClass(), "scopeCreator", null);
        setField(term42005, term42005.getClass(), "reportMissingOverride", null);
        setBooleanField(term42005, term42005.getClass(), "reportUnknownTypes", false);
        setBooleanField(term42005, term42005.getClass(), "reportMissingProperties", false);
        setField(term42005, term42005.getClass(), "inferJSDocInfo", null);
        setIntField(term42005, term42005.getClass(), "typedCount", 0);
        setIntField(term42005, term42005.getClass(), "nullCount", -1);
        setIntField(term42005, term42005.getClass(), "unknownCount", 0);
        setBooleanField(term42005, term42005.getClass(), "inExterns", false);
        setIntField(term42005, term42005.getClass(), "noTypeCheckSection", 0);
        setField(term42005, term42005.getClass(), "editDistance", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getTypedPercent", argTypes, term41744, args);
        assertTrue(recursiveEquals(term41744, term42005));
        assertTrue(recursiveEquals(retValue, -0.0));
    }

};


