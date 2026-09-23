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

public class TypeCheck_isPropertyTest_657275882262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74214;
     Object term74284;
     Object term74996;
     Object term74997;

    public TypeCheck_isPropertyTest_657275882262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74214 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term74284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term74284, term74284.getClass(), "parent", term74284);
        setIntField(term74284, term74284.getClass(), "type", 32);
        term74996 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term74996, term74996.getClass(), "compiler", null);
        setField(term74996, term74996.getClass(), "validator", null);
        setField(term74996, term74996.getClass(), "reverseInterpreter", null);
        setField(term74996, term74996.getClass(), "typeRegistry", null);
        setField(term74996, term74996.getClass(), "topScope", null);
        setField(term74996, term74996.getClass(), "scopeCreator", null);
        setField(term74996, term74996.getClass(), "reportMissingOverride", null);
        setField(term74996, term74996.getClass(), "reportUnknownTypes", null);
        setBooleanField(term74996, term74996.getClass(), "reportMissingProperties", false);
        setField(term74996, term74996.getClass(), "inferJSDocInfo", null);
        setIntField(term74996, term74996.getClass(), "typedCount", 0);
        setIntField(term74996, term74996.getClass(), "nullCount", 0);
        setIntField(term74996, term74996.getClass(), "unknownCount", 0);
        setBooleanField(term74996, term74996.getClass(), "inExterns", false);
        setIntField(term74996, term74996.getClass(), "noTypeCheckSection", 0);
        term74997 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term74997, term74997.getClass(), "type", 32);
        setField(term74997, term74997.getClass(), "next", null);
        setField(term74997, term74997.getClass(), "first", null);
        setField(term74997, term74997.getClass(), "last", null);
        setField(term74997, term74997.getClass(), "propListHead", null);
        setIntField(term74997, term74997.getClass(), "sourcePosition", 0);
        setField(term74997, term74997.getClass(), "jsType", null);
        setField(term74997, term74997.getClass(), "parent", term74997);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term74284;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term74214, args);
        assertTrue(recursiveEquals(term74214, term74996));
        assertTrue(recursiveEquals(term74284, term74997));
        assertTrue(recursiveEquals(retValue, true));
    }

};


