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

public class POJOPropertiesCollector_init_1286093710119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48777;
     Object term49119;
     Object term49237;

    public POJOPropertiesCollector_init_1286093710119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term48401 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term48511 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term48629 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term48401, term48401.getClass(), "_config", term48511);
        setBooleanField(term48401, term48401.getClass(), "_stdBeanNaming", false);
        setBooleanField(term48401, term48401.getClass(), "_forSerialization", false);
        setField(term48401, term48401.getClass(), "_type", null);
        setField(term48401, term48401.getClass(), "_classDef", term48629);
        setField(term48401, term48401.getClass(), "_mutatorPrefix", "");
        setField(term48401, term48401.getClass(), "_annotationIntrospector", null);
        term48777 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term48877 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term49019 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setIntField(term48777, term48777.getClass(), "_mapperFeatures", -1);
        setField(term48877, term48877.getClass(), "_annotationIntrospector", term49019);
        setField(term48877, term48877.getClass(), "_visibilityChecker", null);
        setField(term48777, term48777.getClass(), "_base", term48877);
        term49119 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        term49237 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
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
        args[0] = term48777;
        args[1] = true;
        args[2] = term49119;
        args[3] = term49237;
        args[4] = "USE_ANNOTATIONS";
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


