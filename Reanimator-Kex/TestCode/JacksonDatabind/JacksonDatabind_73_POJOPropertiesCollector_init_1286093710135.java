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

public class POJOPropertiesCollector_init_1286093710135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68388;

    public POJOPropertiesCollector_init_1286093710135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term67978 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term68096 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term68278 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term67978, term67978.getClass(), "_config", null);
        setBooleanField(term67978, term67978.getClass(), "_stdBeanNaming", false);
        setBooleanField(term67978, term67978.getClass(), "_forSerialization", false);
        setField(term67978, term67978.getClass(), "_type", null);
        setField(term67978, term67978.getClass(), "_classDef", term68096);
        setField(term67978, term67978.getClass(), "_mutatorPrefix", "");
        setField(term67978, term67978.getClass(), "_annotationIntrospector", term68278);
        term68388 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term68488 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term68630 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term68762 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std"));
        setIntField(term68388, term68388.getClass(), "_mapperFeatures", -1);
        setField(term68488, term68488.getClass(), "_annotationIntrospector", term68630);
        setField(term68488, term68488.getClass(), "_visibilityChecker", term68762);
        setField(term68388, term68388.getClass(), "_base", term68488);
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
        args[0] = term68388;
        args[1] = true;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


