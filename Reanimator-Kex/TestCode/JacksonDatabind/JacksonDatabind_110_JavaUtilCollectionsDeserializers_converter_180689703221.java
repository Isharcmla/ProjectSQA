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

public class JavaUtilCollectionsDeserializers_converter_180689703221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164090;
     Object term164372;

    public JavaUtilCollectionsDeserializers_converter_180689703221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term164230 = Class.forName((String) "com.fasterxml.jackson.core.format.DataFormatMatcher");
        term164090 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term164194 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term164336 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term164090, term164090.getClass(), "_class", null);
        setField(term164194, term164194.getClass(), "_class", term164230);
        setField(term164194, term164194.getClass(), "_superClass", term164336);
        setField(term164090, term164090.getClass(), "_superClass", term164194);
        term164372 = Class.forName((String) "java.math.BigDecimal$1");
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
        args[1] = term164090;
        args[2] = term164372;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


