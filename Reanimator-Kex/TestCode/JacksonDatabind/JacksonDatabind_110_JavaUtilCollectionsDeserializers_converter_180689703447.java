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

public class JavaUtilCollectionsDeserializers_converter_180689703447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term445594;
     Object term446436;

    public JavaUtilCollectionsDeserializers_converter_180689703447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term445630 = Class.forName((String) "com.fasterxml.jackson.core.ObjectCodec");
        Class<? extends Object> term445770 = Class.forName((String) "java.lang.invoke.MethodHandleImpl$ArrayAccessor$1");
        Class<? extends Object> term445912 = Class.forName((String) "java.util.stream.SortedOps$AbstractLongSortingSink");
        Class<? extends Object> term446054 = Class.forName((String) "com.fasterxml.jackson.databind.type.CollectionType");
        Class<? extends Object> term446194 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer");
        term445594 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term445734 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term445876 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term446018 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term446158 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term446286 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term446400 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term445594, term445594.getClass(), "_class", term445630);
        setField(term445734, term445734.getClass(), "_class", term445770);
        setField(term445876, term445876.getClass(), "_class", term445912);
        setField(term446018, term446018.getClass(), "_class", term446054);
        setField(term446158, term446158.getClass(), "_class", term446194);
        setField(term446286, term446286.getClass(), "_class", null);
        setField(term446286, term446286.getClass(), "_superClass", term446400);
        setField(term446158, term446158.getClass(), "_superClass", term446286);
        setField(term446018, term446018.getClass(), "_superClass", term446158);
        setField(term445876, term445876.getClass(), "_superClass", term446018);
        setField(term445734, term445734.getClass(), "_superClass", term445876);
        setField(term445594, term445594.getClass(), "_superClass", term445734);
        term446436 = Class.forName((String) "java.lang.Runnable");
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
        args[1] = term445594;
        args[2] = term446436;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


