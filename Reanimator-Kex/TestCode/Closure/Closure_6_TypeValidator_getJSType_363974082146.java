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

public class TypeValidator_getJSType_363974082146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35941;
     Object term36011;
     Object term36120;
     Object term36121;
     Object term36114;

    public TypeValidator_getJSType_363974082146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35941 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term36011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36107 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setField(term36011, term36011.getClass(), "jsType", term36107);
        term36120 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term36120, term36120.getClass(), "compiler", null);
        setField(term36120, term36120.getClass(), "typeRegistry", null);
        setField(term36120, term36120.getClass(), "allValueTypes", null);
        setBooleanField(term36120, term36120.getClass(), "shouldReport", false);
        setField(term36120, term36120.getClass(), "nullOrUndefined", null);
        setField(term36120, term36120.getClass(), "mismatches", null);
        term36121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36122 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setIntField(term36121, term36121.getClass(), "type", 0);
        setField(term36121, term36121.getClass(), "next", null);
        setField(term36121, term36121.getClass(), "first", null);
        setField(term36121, term36121.getClass(), "last", null);
        setField(term36121, term36121.getClass(), "propListHead", null);
        setIntField(term36121, term36121.getClass(), "sourcePosition", 0);
        setBooleanField(term36122, term36122.getClass(), "resolved", false);
        setField(term36122, term36122.getClass(), "resolveResult", null);
        setField(term36122, term36122.getClass(), "templateKeys", null);
        setField(term36122, term36122.getClass(), "templatizedTypes", null);
        setBooleanField(term36122, term36122.getClass(), "inTemplatedCheckVisit", false);
        setField(term36122, term36122.getClass(), "registry", null);
        setField(term36121, term36121.getClass(), "jsType", term36122);
        setField(term36121, term36121.getClass(), "parent", null);
        term36114 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setBooleanField(term36114, term36114.getClass(), "resolved", false);
        setField(term36114, term36114.getClass(), "resolveResult", null);
        setField(term36114, term36114.getClass(), "templateKeys", null);
        setField(term36114, term36114.getClass(), "templatizedTypes", null);
        setBooleanField(term36114, term36114.getClass(), "inTemplatedCheckVisit", false);
        setField(term36114, term36114.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term36011;
        Object retValue = callMethod(klass, "getJSType", argTypes, term35941, args);
        assertTrue(recursiveEquals(term35941, term36120));
        assertTrue(recursiveEquals(term36011, term36121));
        assertTrue(recursiveEquals(retValue, term36114));
    }

};


