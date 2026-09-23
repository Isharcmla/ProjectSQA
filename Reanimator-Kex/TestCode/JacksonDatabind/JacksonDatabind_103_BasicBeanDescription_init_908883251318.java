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
import java.lang.StackOverflowError;
import static com.fasterxml.jackson.databind.introspect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BasicBeanDescription_init_908883251318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148591;

    public BasicBeanDescription_init_908883251318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term148257 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term148349 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term148455 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term148257, term148257.getClass(), "_type", term148349);
        setField(term148257, term148257.getClass(), "_propCollector", null);
        setField(term148257, term148257.getClass(), "_config", term148455);
        setField(term148257, term148257.getClass(), "_annotationIntrospector", null);
        setField(term148257, term148257.getClass(), "_classInfo", null);
        term148591 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term148733 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(term148591, term148591.getClass(), "_type", null);
        setField(term148591, term148591.getClass(), "_classDef", null);
        setField(term148591, term148591.getClass(), "_config", null);
        setField(term148733, term148733.getClass(), "_primary", term148733);
        setField(term148591, term148591.getClass(), "_annotationIntrospector", term148733);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
        Object[] args = new Object[1];
        args[0] = term148591;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


