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

public class JavaUtilCollectionsDeserializers_converter_180689703506 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term526132;
     Object term526646;

    public JavaUtilCollectionsDeserializers_converter_180689703506() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term526168 = Class.forName((String) "java.util.ServiceLoader$LazyClassPathLookupIterator$2");
        term526646 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer");
        term526132 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term526260 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term526366 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term526472 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term526592 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term526132, term526132.getClass(), "_class", term526168);
        setField(term526260, term526260.getClass(), "_class", null);
        setField(term526366, term526366.getClass(), "_class", null);
        setField(term526472, term526472.getClass(), "_class", null);
        setField(term526592, term526592.getClass(), "_class", term526646);
        setField(term526472, term526472.getClass(), "_superClass", term526592);
        setField(term526366, term526366.getClass(), "_superClass", term526472);
        setField(term526260, term526260.getClass(), "_superClass", term526366);
        setField(term526132, term526132.getClass(), "_superClass", term526260);
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
        args[1] = term526132;
        args[2] = term526646;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


