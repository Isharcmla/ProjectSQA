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

public class TypeValidator_getReadableJSTypeName_85059943697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39424;
     Object term39494;
     Object term39952;
     Object term39953;

    public TypeValidator_getReadableJSTypeName_85059943697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39424 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term39494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39588 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setIntField(term39494, term39494.getClass(), "type", -34);
        setField(term39494, term39494.getClass(), "jsType", term39588);
        term39952 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term39952, term39952.getClass(), "compiler", null);
        setField(term39952, term39952.getClass(), "typeRegistry", null);
        setField(term39952, term39952.getClass(), "allValueTypes", null);
        setBooleanField(term39952, term39952.getClass(), "shouldReport", false);
        setField(term39952, term39952.getClass(), "nullOrUndefined", null);
        setField(term39952, term39952.getClass(), "mismatches", null);
        term39953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39954 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setIntField(term39953, term39953.getClass(), "type", -34);
        setField(term39953, term39953.getClass(), "next", null);
        setField(term39953, term39953.getClass(), "first", null);
        setField(term39953, term39953.getClass(), "last", null);
        setField(term39953, term39953.getClass(), "propListHead", null);
        setIntField(term39953, term39953.getClass(), "sourcePosition", 0);
        setField(term39954, term39954.getClass(), "parameters", null);
        setField(term39954, term39954.getClass(), "returnType", null);
        setBooleanField(term39954, term39954.getClass(), "returnTypeInferred", false);
        setBooleanField(term39954, term39954.getClass(), "resolved", false);
        setField(term39954, term39954.getClass(), "resolveResult", null);
        setField(term39954, term39954.getClass(), "templateTypeMap", null);
        setBooleanField(term39954, term39954.getClass(), "inTemplatedCheckVisit", false);
        setField(term39954, term39954.getClass(), "registry", null);
        setField(term39953, term39953.getClass(), "jsType", term39954);
        setField(term39953, term39953.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term39494;
        args[1] = false;
        Object retValue = callMethod(klass, "getReadableJSTypeName", argTypes, term39424, args);
        assertTrue(recursiveEquals(term39424, term39952));
        assertTrue(recursiveEquals(term39494, term39953));
        assertTrue(recursiveEquals(retValue, "[ArrowType]"));
    }

};


