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

public class TypeCheck_isPropertyTest_657275882263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116013;
     Object term116083;
     Object term116892;
     Object term116893;

    public TypeCheck_isPropertyTest_657275882263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116013 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term116083 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term116083, term116083.getClass(), "parent", term116083);
        setIntField(term116083, term116083.getClass(), "type", 32);
        term116892 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term116892, term116892.getClass(), "compiler", null);
        setField(term116892, term116892.getClass(), "validator", null);
        setField(term116892, term116892.getClass(), "reverseInterpreter", null);
        setField(term116892, term116892.getClass(), "typeRegistry", null);
        setField(term116892, term116892.getClass(), "topScope", null);
        setField(term116892, term116892.getClass(), "scopeCreator", null);
        setField(term116892, term116892.getClass(), "reportMissingOverride", null);
        setField(term116892, term116892.getClass(), "reportUnknownTypes", null);
        setBooleanField(term116892, term116892.getClass(), "reportMissingProperties", false);
        setField(term116892, term116892.getClass(), "inferJSDocInfo", null);
        setIntField(term116892, term116892.getClass(), "typedCount", 0);
        setIntField(term116892, term116892.getClass(), "nullCount", 0);
        setIntField(term116892, term116892.getClass(), "unknownCount", 0);
        setBooleanField(term116892, term116892.getClass(), "inExterns", false);
        setIntField(term116892, term116892.getClass(), "noTypeCheckSection", 0);
        term116893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term116893, term116893.getClass(), "type", 32);
        setField(term116893, term116893.getClass(), "next", null);
        setField(term116893, term116893.getClass(), "first", null);
        setField(term116893, term116893.getClass(), "last", null);
        setField(term116893, term116893.getClass(), "propListHead", null);
        setIntField(term116893, term116893.getClass(), "sourcePosition", 0);
        setField(term116893, term116893.getClass(), "jsType", null);
        setField(term116893, term116893.getClass(), "parent", term116893);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term116083;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term116013, args);
        assertTrue(recursiveEquals(term116013, term116892));
        assertTrue(recursiveEquals(term116083, term116893));
        assertTrue(recursiveEquals(retValue, true));
    }

};


