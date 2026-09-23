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

public class TypeValidator_getReadableJSTypeName_850599436224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64024;
     Object term64116;
     Object term64319;
     Object term64320;

    public TypeValidator_getReadableJSTypeName_850599436224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64024 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term64116 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term64208 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setIntField(term64116, term64116.getClass(), "type", -34);
        setField(term64116, term64116.getClass(), "jsType", term64208);
        term64319 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term64319, term64319.getClass(), "compiler", null);
        setField(term64319, term64319.getClass(), "typeRegistry", null);
        setField(term64319, term64319.getClass(), "allValueTypes", null);
        setBooleanField(term64319, term64319.getClass(), "shouldReport", false);
        setField(term64319, term64319.getClass(), "nullOrUndefined", null);
        setField(term64319, term64319.getClass(), "mismatches", null);
        term64320 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term64321 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term64320, term64320.getClass(), "str", null);
        setIntField(term64320, term64320.getClass(), "type", -34);
        setField(term64320, term64320.getClass(), "next", null);
        setField(term64320, term64320.getClass(), "first", null);
        setField(term64320, term64320.getClass(), "last", null);
        setField(term64320, term64320.getClass(), "propListHead", null);
        setIntField(term64320, term64320.getClass(), "sourcePosition", 0);
        setField(term64321, term64321.getClass(), "source", null);
        setField(term64321, term64321.getClass(), "elementsType", null);
        setField(term64321, term64321.getClass(), "elements", null);
        setField(term64321, term64321.getClass(), "className", null);
        setField(term64321, term64321.getClass(), "properties", null);
        setBooleanField(term64321, term64321.getClass(), "nativeType", false);
        setField(term64321, term64321.getClass(), "implicitPrototypeFallback", null);
        setField(term64321, term64321.getClass(), "ownerFunction", null);
        setBooleanField(term64321, term64321.getClass(), "prettyPrint", false);
        setBooleanField(term64321, term64321.getClass(), "visited", false);
        setField(term64321, term64321.getClass(), "docInfo", null);
        setBooleanField(term64321, term64321.getClass(), "unknown", false);
        setBooleanField(term64321, term64321.getClass(), "resolved", false);
        setField(term64321, term64321.getClass(), "resolveResult", null);
        setField(term64321, term64321.getClass(), "templateKeys", null);
        setField(term64321, term64321.getClass(), "templatizedTypes", null);
        setBooleanField(term64321, term64321.getClass(), "inTemplatedCheckVisit", false);
        setField(term64321, term64321.getClass(), "registry", null);
        setField(term64320, term64320.getClass(), "jsType", term64321);
        setField(term64320, term64320.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term64116;
        args[1] = true;
        Object retValue = callMethod(klass, "getReadableJSTypeName", argTypes, term64024, args);
        assertTrue(recursiveEquals(term64024, term64319));
        assertTrue(recursiveEquals(term64116, term64320));
        assertTrue(recursiveEquals(retValue, null));
    }

};


