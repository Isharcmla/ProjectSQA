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

public class POJOPropertiesCollector_init_1286093710133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65762;

    public POJOPropertiesCollector_init_1286093710133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term65390 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term65496 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term65614 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term65390, term65390.getClass(), "_config", term65496);
        setBooleanField(term65390, term65390.getClass(), "_stdBeanNaming", false);
        setBooleanField(term65390, term65390.getClass(), "_forSerialization", false);
        setField(term65390, term65390.getClass(), "_type", null);
        setField(term65390, term65390.getClass(), "_classDef", term65614);
        setField(term65390, term65390.getClass(), "_mutatorPrefix", "");
        setField(term65390, term65390.getClass(), "_annotationIntrospector", null);
        term65762 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term65862 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term66004 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term66148 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term66280 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std"));
        setIntField(term65762, term65762.getClass(), "_mapperFeatures", -1);
        setField(term66004, term66004.getClass(), "_secondary", term66148);
        setField(term65862, term65862.getClass(), "_annotationIntrospector", term66004);
        setField(term65862, term65862.getClass(), "_visibilityChecker", term66280);
        setField(term65762, term65762.getClass(), "_base", term65862);
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
        args[0] = term65762;
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


