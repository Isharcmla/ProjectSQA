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

public class JavaUtilCollectionsDeserializers_converter_180689703495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term511984;
     Object term512466;

    public JavaUtilCollectionsDeserializers_converter_180689703495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term512020 = Class.forName((String) "java.util.stream.StreamSpliterators$DelegatingSpliterator$OfInt");
        term511984 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term512112 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term512218 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term512324 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term512430 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term511984, term511984.getClass(), "_class", term512020);
        setField(term512112, term512112.getClass(), "_class", null);
        setField(term512218, term512218.getClass(), "_class", null);
        setField(term512324, term512324.getClass(), "_class", null);
        setField(term512324, term512324.getClass(), "_superClass", term512430);
        setField(term512218, term512218.getClass(), "_superClass", term512324);
        setField(term512112, term512112.getClass(), "_superClass", term512218);
        setField(term511984, term511984.getClass(), "_superClass", term512112);
        term512466 = Class.forName((String) "java.util.ServiceLoader$ModuleServicesLookupIterator");
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
        args[1] = term511984;
        args[2] = term512466;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


