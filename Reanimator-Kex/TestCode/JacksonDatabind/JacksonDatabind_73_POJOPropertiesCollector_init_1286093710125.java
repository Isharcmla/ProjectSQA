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

public class POJOPropertiesCollector_init_1286093710125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56147;
     Object term56507;

    public POJOPropertiesCollector_init_1286093710125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term55771 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term55881 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term55999 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term55771, term55771.getClass(), "_config", term55881);
        setBooleanField(term55771, term55771.getClass(), "_stdBeanNaming", false);
        setBooleanField(term55771, term55771.getClass(), "_forSerialization", false);
        setField(term55771, term55771.getClass(), "_type", null);
        setField(term55771, term55771.getClass(), "_classDef", term55999);
        setField(term55771, term55771.getClass(), "_mutatorPrefix", "");
        setField(term55771, term55771.getClass(), "_annotationIntrospector", null);
        term56147 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term56247 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term56389 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setIntField(term56147, term56147.getClass(), "_mapperFeatures", -1);
        setField(term56247, term56247.getClass(), "_annotationIntrospector", term56389);
        setField(term56247, term56247.getClass(), "_visibilityChecker", null);
        setField(term56147, term56147.getClass(), "_base", term56247);
        term56507 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
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
        args[0] = term56147;
        args[1] = true;
        args[2] = null;
        args[3] = term56507;
        args[4] = "";
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


