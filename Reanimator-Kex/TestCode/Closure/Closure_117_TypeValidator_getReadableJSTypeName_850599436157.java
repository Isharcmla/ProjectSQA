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

public class TypeValidator_getReadableJSTypeName_850599436157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54197;
     Object term54267;
     Object term54520;
     Object term54521;

    public TypeValidator_getReadableJSTypeName_850599436157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54197 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term54267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54363 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setIntField(term54267, term54267.getClass(), "type", -34);
        setField(term54267, term54267.getClass(), "jsType", term54363);
        term54520 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term54520, term54520.getClass(), "compiler", null);
        setField(term54520, term54520.getClass(), "typeRegistry", null);
        setField(term54520, term54520.getClass(), "allValueTypes", null);
        setBooleanField(term54520, term54520.getClass(), "shouldReport", false);
        setField(term54520, term54520.getClass(), "nullOrUndefined", null);
        setField(term54520, term54520.getClass(), "mismatches", null);
        term54521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54522 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setIntField(term54521, term54521.getClass(), "type", -34);
        setField(term54521, term54521.getClass(), "next", null);
        setField(term54521, term54521.getClass(), "first", null);
        setField(term54521, term54521.getClass(), "last", null);
        setField(term54521, term54521.getClass(), "propListHead", null);
        setIntField(term54521, term54521.getClass(), "sourcePosition", 0);
        setBooleanField(term54522, term54522.getClass(), "declared", false);
        setBooleanField(term54522, term54522.getClass(), "isFrozen", false);
        setField(term54522, term54522.getClass(), "className", null);
        setField(term54522, term54522.getClass(), "properties", null);
        setBooleanField(term54522, term54522.getClass(), "nativeType", false);
        setField(term54522, term54522.getClass(), "implicitPrototypeFallback", null);
        setField(term54522, term54522.getClass(), "ownerFunction", null);
        setBooleanField(term54522, term54522.getClass(), "prettyPrint", false);
        setBooleanField(term54522, term54522.getClass(), "visited", false);
        setField(term54522, term54522.getClass(), "docInfo", null);
        setBooleanField(term54522, term54522.getClass(), "unknown", false);
        setBooleanField(term54522, term54522.getClass(), "resolved", false);
        setField(term54522, term54522.getClass(), "resolveResult", null);
        setField(term54522, term54522.getClass(), "templateTypeMap", null);
        setBooleanField(term54522, term54522.getClass(), "inTemplatedCheckVisit", false);
        setField(term54522, term54522.getClass(), "registry", null);
        setField(term54521, term54521.getClass(), "jsType", term54522);
        setField(term54521, term54521.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term54267;
        args[1] = true;
        Object retValue = callMethod(klass, "getReadableJSTypeName", argTypes, term54197, args);
        assertTrue(recursiveEquals(term54197, term54520));
        assertTrue(recursiveEquals(term54267, term54521));
        assertTrue(recursiveEquals(retValue, "{...}"));
    }

};


