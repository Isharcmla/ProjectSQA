package com.fasterxml.jackson.databind.jsontype.impl;

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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.jsontype.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class AsWrapperTypeDeserializer_init_198407507379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63801;
     Object term63979;

    public AsWrapperTypeDeserializer_init_198407507379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term63695 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(term63695, term63695.getClass(), "_baseType", null);
        setField(term63695, term63695.getClass(), "_idResolver", null);
        setField(term63695, term63695.getClass(), "_typePropertyName", null);
        setBooleanField(term63695, term63695.getClass(), "_typeIdVisible", false);
        setField(term63695, term63695.getClass(), "_deserializers", null);
        Class<? extends Object> term63837 = Class.forName((String) "java.nio.file.attribute.PosixFilePermissions$1");
        term63801 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term63943 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term63801, term63801.getClass(), "_class", term63837);
        setField(term63801, term63801.getClass(), "_elementType", term63943);
        setBooleanField(term63801, term63801.getClass(), "_asStatic", false);
        term63979 = Class.forName((String) "java.util.regex.Pattern$BranchConn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeIdResolver");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = boolean.class;
        argTypes[4] = Class.forName("java.lang.Class");
        Object[] args = new Object[5];
        args[0] = term63801;
        args[1] = null;
        args[2] = null;
        args[3] = true;
        args[4] = term63979;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


