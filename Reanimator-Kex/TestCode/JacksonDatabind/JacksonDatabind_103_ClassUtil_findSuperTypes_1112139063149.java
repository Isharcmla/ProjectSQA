package com.fasterxml.jackson.databind.util;

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
import static com.fasterxml.jackson.databind.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.util.EqualityUtils.*;

public class ClassUtil_findSuperTypes_1112139063149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76160;
     Object term135889;
     Object term135886;

    public ClassUtil_findSuperTypes_1112139063149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76160 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term135889 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term135889, term135889.getClass(), "_referencedType", null);
        setField(term135889, term135889.getClass(), "_anchorType", null);
        setField(term135889, term135889.getClass(), "_superClass", null);
        setField(term135889, term135889.getClass(), "_superInterfaces", null);
        setField(term135889, term135889.getClass(), "_bindings", null);
        setField(term135889, term135889.getClass(), "_canonicalName", null);
        setField(term135889, term135889.getClass(), "_class", null);
        setIntField(term135889, term135889.getClass(), "_hash", 0);
        setField(term135889, term135889.getClass(), "_valueHandler", null);
        setField(term135889, term135889.getClass(), "_typeHandler", null);
        setBooleanField(term135889, term135889.getClass(), "_asStatic", false);
        term135886 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setIntField(term135886, term135886.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("java.lang.Class");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term76160;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "findSuperTypes", argTypes, null, args);
        assertTrue(recursiveEquals(term76160, term135889));
        assertTrue(recursiveEquals(retValue, term135886));
    }

};


