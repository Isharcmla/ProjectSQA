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

public class BeanPropertyWriter_init_599291025460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term305592;
     Object term306422;
     Object term306538;

    public BeanPropertyWriter_init_599291025460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term305024 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term305158 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember"));
        Object term305274 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term305372 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term305464 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term305024, term305024.getClass(), "_member", term305158);
        setField(term305024, term305024.getClass(), "_contextAnnotations", term305274);
        setField(term305024, term305024.getClass(), "_name", term305372);
        setField(term305024, term305024.getClass(), "_wrapperName", term305464);
        term305592 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term305684 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term305864 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term306006 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term306148 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term306296 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term305684, term305684.getClass(), "_simpleName", "");
        setField(term305592, term305592.getClass(), "_name", term305684);
        setBooleanField(term305592, term305592.getClass(), "_forSerialization", false);
        setField(term305592, term305592.getClass(), "_ctorParameters", null);
        setField(term305592, term305592.getClass(), "_setters", null);
        setField(term305864, term305864.getClass(), "value", null);
        setField(term305864, term305864.getClass(), "next", null);
        setField(term305592, term305592.getClass(), "_fields", term305864);
        setField(term306148, term306148.getClass(), "_primary", term306296);
        setField(term306006, term306006.getClass(), "_primary", term306148);
        setField(term305592, term305592.getClass(), "_annotationIntrospector", term306006);
        term306422 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        term306538 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.util.Annotations");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JsonSerializer");
        argTypes[5] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeSerializer");
        argTypes[6] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[7] = boolean.class;
        argTypes[8] = Class.forName("java.lang.Object");
        Object[] args = new Object[9];
        args[0] = term305592;
        args[1] = term306422;
        args[2] = term306538;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


