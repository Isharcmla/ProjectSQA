package com.fasterxml.jackson.databind.introspect;

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
import static com.fasterxml.jackson.databind.introspect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class POJOPropertiesCollector_init_1286093710157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92819;

    public POJOPropertiesCollector_init_1286093710157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term92499 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term92609 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term92713 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term92499, term92499.getClass(), "_config", term92609);
        setBooleanField(term92499, term92499.getClass(), "_stdBeanNaming", false);
        setBooleanField(term92499, term92499.getClass(), "_forSerialization", false);
        setField(term92499, term92499.getClass(), "_type", term92713);
        setField(term92499, term92499.getClass(), "_classDef", null);
        setField(term92499, term92499.getClass(), "_mutatorPrefix", null);
        term92819 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setIntField(term92819, term92819.getClass(), "_mapperFeatures", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.cfg.MapperConfig");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term92819;
        args[1] = true;
        args[2] = null;
        args[3] = null;
        args[4] = "";
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


