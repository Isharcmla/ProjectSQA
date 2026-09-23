package com.fasterxml.jackson.databind.ser;

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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BasicSerializerFactory_modifySecondaryTypesByAnnotation_162360997091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19576;
     Object term19768;

    public BasicSerializerFactory_modifySecondaryTypesByAnnotation_162360997091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19576 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term19676 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setIntField(term19576, term19576.getClass(), "_mapperFeatures", -1);
        setField(term19676, term19676.getClass(), "_annotationIntrospector", null);
        setField(term19576, term19576.getClass(), "_base", term19676);
        term19768 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.introspect.Annotated");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[3];
        args[0] = term19576;
        args[1] = null;
        args[2] = term19768;
        try {
            callMethod(klass, "modifySecondaryTypesByAnnotation", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


