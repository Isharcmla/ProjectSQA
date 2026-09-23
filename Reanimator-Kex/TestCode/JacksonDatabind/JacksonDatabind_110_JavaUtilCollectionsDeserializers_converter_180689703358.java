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

public class JavaUtilCollectionsDeserializers_converter_180689703358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331676;
     Object term332128;

    public JavaUtilCollectionsDeserializers_converter_180689703358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term331712 = Class.forName((String) "com.fasterxml.jackson.databind.Module$SetupContext");
        Class<? extends Object> term331852 = Class.forName((String) "java.util.stream.SortedOps$AbstractIntSortingSink");
        term331676 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term331816 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term331972 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term332092 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term331676, term331676.getClass(), "_class", term331712);
        setField(term331816, term331816.getClass(), "_class", term331852);
        setField(term331972, term331972.getClass(), "_class", null);
        setField(term331972, term331972.getClass(), "_superClass", term332092);
        setField(term331816, term331816.getClass(), "_superClass", term331972);
        setField(term331676, term331676.getClass(), "_superClass", term331816);
        term332128 = Class.forName((String) "java.lang.ProcessHandleImpl$Info");
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
        args[1] = term331676;
        args[2] = term332128;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


