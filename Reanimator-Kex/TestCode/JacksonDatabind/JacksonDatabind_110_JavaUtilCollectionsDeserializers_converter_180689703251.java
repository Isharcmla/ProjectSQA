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

public class JavaUtilCollectionsDeserializers_converter_180689703251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199829;
     Object term200239;

    public JavaUtilCollectionsDeserializers_converter_180689703251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term199865 = Class.forName((String) "java.util.TooManyListenersException");
        Class<? extends Object> term200005 = Class.forName((String) "java.util.Collections$EmptyIterator");
        term199829 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term199969 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term200111 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term200203 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term199829, term199829.getClass(), "_class", term199865);
        setField(term199969, term199969.getClass(), "_class", term200005);
        setField(term200111, term200111.getClass(), "_class", null);
        setField(term200111, term200111.getClass(), "_superClass", term200203);
        setField(term199969, term199969.getClass(), "_superClass", term200111);
        setField(term199829, term199829.getClass(), "_superClass", term199969);
        term200239 = Class.forName((String) "java.util.TreeSet");
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
        args[1] = term199829;
        args[2] = term200239;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


