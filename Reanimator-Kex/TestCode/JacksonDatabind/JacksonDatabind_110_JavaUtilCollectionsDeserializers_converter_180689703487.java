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

public class JavaUtilCollectionsDeserializers_converter_180689703487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term499067;
     Object term499597;

    public JavaUtilCollectionsDeserializers_converter_180689703487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term499103 = Class.forName((String) "java.util.Collections$EmptyMap");
        Class<? extends Object> term499231 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$7");
        term499597 = Class.forName((String) "java.util.LinkedHashMap$LinkedHashIterator");
        term499067 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term499195 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term499323 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term499429 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term499543 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term499067, term499067.getClass(), "_class", term499103);
        setField(term499195, term499195.getClass(), "_class", term499231);
        setField(term499323, term499323.getClass(), "_class", null);
        setField(term499429, term499429.getClass(), "_class", null);
        setField(term499543, term499543.getClass(), "_class", term499597);
        setField(term499429, term499429.getClass(), "_superClass", term499543);
        setField(term499323, term499323.getClass(), "_superClass", term499429);
        setField(term499195, term499195.getClass(), "_superClass", term499323);
        setField(term499067, term499067.getClass(), "_superClass", term499195);
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
        args[1] = term499067;
        args[2] = term499597;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


