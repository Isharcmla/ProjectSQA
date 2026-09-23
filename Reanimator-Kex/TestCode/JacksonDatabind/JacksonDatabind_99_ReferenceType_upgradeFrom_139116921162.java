package com.fasterxml.jackson.databind.type;

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
import static com.fasterxml.jackson.databind.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.type.EqualityUtils.*;
import java.lang.Object;

public class ReferenceType_upgradeFrom_139116921162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9377;
     Object term10173;
     Object term10174;
     Object term10164;

    public ReferenceType_upgradeFrom_139116921162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9377 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        term10173 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term10173, term10173.getClass(), "_componentType", null);
        setField(term10173, term10173.getClass(), "_emptyArray", null);
        setField(term10173, term10173.getClass(), "_superClass", null);
        setField(term10173, term10173.getClass(), "_superInterfaces", null);
        setField(term10173, term10173.getClass(), "_bindings", null);
        setField(term10173, term10173.getClass(), "_canonicalName", null);
        setField(term10173, term10173.getClass(), "_class", null);
        setIntField(term10173, term10173.getClass(), "_hash", 0);
        setField(term10173, term10173.getClass(), "_valueHandler", null);
        setField(term10173, term10173.getClass(), "_typeHandler", null);
        setBooleanField(term10173, term10173.getClass(), "_asStatic", false);
        term10174 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term10174, term10174.getClass(), "_componentType", null);
        setField(term10174, term10174.getClass(), "_emptyArray", null);
        setField(term10174, term10174.getClass(), "_superClass", null);
        setField(term10174, term10174.getClass(), "_superInterfaces", null);
        setField(term10174, term10174.getClass(), "_bindings", null);
        setField(term10174, term10174.getClass(), "_canonicalName", null);
        setField(term10174, term10174.getClass(), "_class", null);
        setIntField(term10174, term10174.getClass(), "_hash", 0);
        setField(term10174, term10174.getClass(), "_valueHandler", null);
        setField(term10174, term10174.getClass(), "_typeHandler", null);
        setBooleanField(term10174, term10174.getClass(), "_asStatic", false);
        term10164 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term10165 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term10165, term10165.getClass(), "_componentType", null);
        setField(term10165, term10165.getClass(), "_emptyArray", null);
        setField(term10165, term10165.getClass(), "_superClass", null);
        setField(term10165, term10165.getClass(), "_superInterfaces", null);
        setField(term10165, term10165.getClass(), "_bindings", null);
        setField(term10165, term10165.getClass(), "_canonicalName", null);
        setField(term10165, term10165.getClass(), "_class", null);
        setIntField(term10165, term10165.getClass(), "_hash", 0);
        setField(term10165, term10165.getClass(), "_valueHandler", null);
        setField(term10165, term10165.getClass(), "_typeHandler", null);
        setBooleanField(term10165, term10165.getClass(), "_asStatic", false);
        setField(term10164, term10164.getClass(), "_referencedType", term10165);
        setField(term10164, term10164.getClass(), "_anchorType", term10164);
        setField(term10164, term10164.getClass(), "_superClass", null);
        setField(term10164, term10164.getClass(), "_superInterfaces", null);
        setField(term10164, term10164.getClass(), "_bindings", null);
        setField(term10164, term10164.getClass(), "_canonicalName", null);
        setField(term10164, term10164.getClass(), "_class", null);
        setIntField(term10164, term10164.getClass(), "_hash", 0);
        setField(term10164, term10164.getClass(), "_valueHandler", null);
        setField(term10164, term10164.getClass(), "_typeHandler", null);
        setBooleanField(term10164, term10164.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.ReferenceType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = term9377;
        args[1] = term9377;
        Object retValue = callMethod(klass, "upgradeFrom", argTypes, null, args);
        assertTrue(recursiveEquals(term9377, term10173));
        assertTrue(recursiveEquals(term9377, term10174));
        assertTrue(recursiveEquals(retValue, term10164));
    }

};


