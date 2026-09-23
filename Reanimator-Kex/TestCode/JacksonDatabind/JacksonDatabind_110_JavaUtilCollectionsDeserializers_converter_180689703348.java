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
import java.lang.Object;
import java.lang.String;

public class JavaUtilCollectionsDeserializers_converter_180689703348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term321408;
     Object term321742;

    public JavaUtilCollectionsDeserializers_converter_180689703348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term321408 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term321500 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term321592 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term321706 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term321408, term321408.getClass(), "_class", null);
        setField(term321500, term321500.getClass(), "_class", null);
        setField(term321592, term321592.getClass(), "_class", null);
        setField(term321592, term321592.getClass(), "_superClass", term321706);
        setField(term321500, term321500.getClass(), "_superClass", term321592);
        setField(term321408, term321408.getClass(), "_superClass", term321500);
        term321742 = Class.forName((String) "java.util.Collections$CheckedRandomAccessList");
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
        args[1] = term321408;
        args[2] = term321742;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


