package com.fasterxml.jackson.databind.deser.impl;

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
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class JavaUtilCollectionsDeserializers_converter_180689703410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term397093;
     Object term397457;

    public JavaUtilCollectionsDeserializers_converter_180689703410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term397129 = Class.forName((String) "org.vorpal.research.kex.intrinsics.internal.IntConsumer");
        term397093 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term397221 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term397325 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term397421 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term397093, term397093.getClass(), "_class", term397129);
        setField(term397221, term397221.getClass(), "_class", null);
        setField(term397325, term397325.getClass(), "_class", null);
        setField(term397325, term397325.getClass(), "_superClass", term397421);
        setField(term397221, term397221.getClass(), "_superClass", term397325);
        setField(term397093, term397093.getClass(), "_superClass", term397221);
        term397457 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.lang.Class");
        Object[] args = new Object[3];
        args[0] = 0;
        args[1] = term397093;
        args[2] = term397457;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


