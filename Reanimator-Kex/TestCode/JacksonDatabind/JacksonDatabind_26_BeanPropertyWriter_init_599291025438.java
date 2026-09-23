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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class BeanPropertyWriter_init_599291025438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284774;
     Object term285432;
     Object term285602;
     Object term285752;

    public BeanPropertyWriter_init_599291025438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term284646 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        setField(term284646, term284646.getClass(), "_member", null);
        setField(term284646, term284646.getClass(), "_contextAnnotations", null);
        setField(term284646, term284646.getClass(), "_name", null);
        setField(term284646, term284646.getClass(), "_wrapperName", null);
        setField(term284646, term284646.getClass(), "_metadata", null);
        setField(term284646, term284646.getClass(), "_includeInViews", null);
        setField(term284646, term284646.getClass(), "_declaredType", null);
        setField(term284646, term284646.getClass(), "_serializer", null);
        setField(term284646, term284646.getClass(), "_dynamicSerializers", null);
        setField(term284646, term284646.getClass(), "_typeSerializer", null);
        setField(term284646, term284646.getClass(), "_cfgSerializationType", null);
        term284774 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term284866 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term285046 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term285164 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term285312 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term284866, term284866.getClass(), "_simpleName", "");
        setField(term284774, term284774.getClass(), "_name", term284866);
        setBooleanField(term284774, term284774.getClass(), "_forSerialization", false);
        setField(term284774, term284774.getClass(), "_ctorParameters", null);
        setField(term284774, term284774.getClass(), "_setters", null);
        setField(term285164, term285164.getClass(), "_annotations", null);
        setField(term285046, term285046.getClass(), "value", term285164);
        setField(term285046, term285046.getClass(), "next", null);
        setField(term284774, term284774.getClass(), "_fields", term285046);
        setField(term284774, term284774.getClass(), "_annotationIntrospector", term285312);
        Class<? extends Object> term287558 = Class.forName((String) "java.util.zip.GZIPInputStream$1");
        Object[] term287695 = (Object[]) newArray("java.lang.Class", 0);
        Method term285486 = ((Class) term287558).getDeclaredMethod((String) "close", (Class[]) term287695);
        ((Method) term285486).setAccessible(false);
        term285432 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term285432, term285432.getClass(), "_method", term285486);
        term285602 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term285752 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.NumberSerializers$FloatSerializer"));
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
        args[0] = term284774;
        args[1] = term285432;
        args[2] = term285602;
        args[3] = null;
        args[4] = term285752;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


