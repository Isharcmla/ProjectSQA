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

public class BeanPropertyWriter_init_599291025235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105564;
     Object term106072;
     Object term106240;

    public BeanPropertyWriter_init_599291025235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term105218 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term105336 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term105436 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object[] term105016 = (Object[]) newArray("java.lang.Class", 0);
        setField(term105218, term105218.getClass(), "_member", term105336);
        setField(term105218, term105218.getClass(), "_contextAnnotations", null);
        setField(term105218, term105218.getClass(), "_name", null);
        setField(term105218, term105218.getClass(), "_wrapperName", null);
        setField(term105218, term105218.getClass(), "_metadata", term105436);
        setField(term105218, term105218.getClass(), "_includeInViews", term105016);
        setField(term105218, term105218.getClass(), "_declaredType", null);
        setField(term105218, term105218.getClass(), "_serializer", null);
        setField(term105218, term105218.getClass(), "_dynamicSerializers", null);
        setField(term105218, term105218.getClass(), "_typeSerializer", null);
        setField(term105218, term105218.getClass(), "_cfgSerializationType", null);
        setField(term105218, term105218.getClass(), "_accessorMethod", null);
        term105564 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term105656 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term105836 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term105954 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term105656, term105656.getClass(), "_simpleName", "");
        setField(term105564, term105564.getClass(), "_name", term105656);
        setBooleanField(term105564, term105564.getClass(), "_forSerialization", false);
        setField(term105564, term105564.getClass(), "_ctorParameters", null);
        setField(term105564, term105564.getClass(), "_setters", null);
        setField(term105836, term105836.getClass(), "value", term105954);
        setField(term105836, term105836.getClass(), "next", null);
        setField(term105564, term105564.getClass(), "_fields", term105836);
        setField(term105564, term105564.getClass(), "_annotationIntrospector", null);
        Class<? extends Object> term107179 = Class.forName((String) "java.util.MissingResourceException");
        Field term106124 = ((Class) term107179).getDeclaredField((String) "className");
        ((Field) term106124).setAccessible(false);
        term106072 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term106072, term106072.getClass(), "_field", term106124);
        term106240 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
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
        args[0] = term105564;
        args[1] = term106072;
        args[2] = term106240;
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
        catch (InaccessibleObjectException e) {
        }

    }

};


