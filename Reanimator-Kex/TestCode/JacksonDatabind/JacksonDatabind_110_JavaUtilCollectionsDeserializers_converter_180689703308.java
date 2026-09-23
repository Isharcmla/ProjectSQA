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

public class JavaUtilCollectionsDeserializers_converter_180689703308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267406;
     Object term267964;

    public JavaUtilCollectionsDeserializers_converter_180689703308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term267442 = Class.forName((String) "java.util.stream.DoublePipeline$6");
        Class<? extends Object> term267582 = Class.forName((String) "java.util.ResourceBundle$KeyElementReference");
        Class<? extends Object> term267724 = Class.forName((String) "com.fasterxml.jackson.databind.type.SimpleType");
        term267406 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term267546 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term267688 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term267830 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term267928 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term267406, term267406.getClass(), "_class", term267442);
        setField(term267546, term267546.getClass(), "_class", term267582);
        setField(term267688, term267688.getClass(), "_class", term267724);
        setField(term267830, term267830.getClass(), "_class", null);
        setField(term267830, term267830.getClass(), "_superClass", term267928);
        setField(term267688, term267688.getClass(), "_superClass", term267830);
        setField(term267546, term267546.getClass(), "_superClass", term267688);
        setField(term267406, term267406.getClass(), "_superClass", term267546);
        term267964 = Class.forName((String) "java.lang.module.ModuleDescriptor$Builder");
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
        args[1] = term267406;
        args[2] = term267964;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


