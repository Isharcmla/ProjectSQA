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

public class JavaUtilCollectionsDeserializers_converter_180689703302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259996;
     Object term260454;

    public JavaUtilCollectionsDeserializers_converter_180689703302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term259996 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term260100 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term260206 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term260312 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term260418 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term259996, term259996.getClass(), "_class", null);
        setField(term260100, term260100.getClass(), "_class", null);
        setField(term260206, term260206.getClass(), "_class", null);
        setField(term260312, term260312.getClass(), "_class", null);
        setField(term260312, term260312.getClass(), "_superClass", term260418);
        setField(term260206, term260206.getClass(), "_superClass", term260312);
        setField(term260100, term260100.getClass(), "_superClass", term260206);
        setField(term259996, term259996.getClass(), "_superClass", term260100);
        term260454 = Class.forName((String) "java.lang.module.ModuleDescriptor$Modifier");
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
        args[1] = term259996;
        args[2] = term260454;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


