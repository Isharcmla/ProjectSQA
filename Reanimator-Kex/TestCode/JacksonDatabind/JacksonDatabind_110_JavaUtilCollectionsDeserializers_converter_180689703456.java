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

public class JavaUtilCollectionsDeserializers_converter_180689703456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term458421;
     Object term459413;

    public JavaUtilCollectionsDeserializers_converter_180689703456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term458561 = Class.forName((String) "java.util.AbstractList$Itr");
        Class<? extends Object> term458703 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition");
        Class<? extends Object> term458845 = Class.forName((String) "com.fasterxml.jackson.core.type.ResolvedType");
        Class<? extends Object> term458985 = Class.forName((String) "java.util.regex.ASCII");
        Class<? extends Object> term459113 = Class.forName((String) "java.lang.CharacterData00");
        Class<? extends Object> term459263 = Class.forName((String) "java.lang.invoke.BoundMethodHandle$Specializer");
        term458421 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term458525 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term458667 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term458809 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term458949 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term459077 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term459227 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term459377 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term458421, term458421.getClass(), "_class", null);
        setField(term458525, term458525.getClass(), "_class", term458561);
        setField(term458667, term458667.getClass(), "_class", term458703);
        setField(term458809, term458809.getClass(), "_class", term458845);
        setField(term458949, term458949.getClass(), "_class", term458985);
        setField(term459077, term459077.getClass(), "_class", term459113);
        setField(term459227, term459227.getClass(), "_class", term459263);
        setField(term459227, term459227.getClass(), "_superClass", term459377);
        setField(term459077, term459077.getClass(), "_superClass", term459227);
        setField(term458949, term458949.getClass(), "_superClass", term459077);
        setField(term458809, term458809.getClass(), "_superClass", term458949);
        setField(term458667, term458667.getClass(), "_superClass", term458809);
        setField(term458525, term458525.getClass(), "_superClass", term458667);
        setField(term458421, term458421.getClass(), "_superClass", term458525);
        term459413 = Class.forName((String) "java.util.Spliterators$DoubleIteratorSpliterator");
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
        args[1] = term458421;
        args[2] = term459413;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


