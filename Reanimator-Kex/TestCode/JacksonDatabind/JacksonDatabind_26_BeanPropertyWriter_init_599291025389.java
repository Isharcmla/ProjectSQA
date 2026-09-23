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

public class BeanPropertyWriter_init_599291025389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234978;
     Object term235368;
     Object term235518;
     Object term235622;

    public BeanPropertyWriter_init_599291025389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term234746 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object[] term234548 = (Object[]) newArray("java.lang.Class", 0);
        Object term234850 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term234746, term234746.getClass(), "_member", null);
        setField(term234746, term234746.getClass(), "_contextAnnotations", null);
        setField(term234746, term234746.getClass(), "_name", null);
        setField(term234746, term234746.getClass(), "_wrapperName", null);
        setField(term234746, term234746.getClass(), "_metadata", null);
        setField(term234746, term234746.getClass(), "_includeInViews", term234548);
        setField(term234746, term234746.getClass(), "_declaredType", null);
        setField(term234746, term234746.getClass(), "_serializer", null);
        setField(term234746, term234746.getClass(), "_dynamicSerializers", null);
        setField(term234746, term234746.getClass(), "_typeSerializer", null);
        setField(term234746, term234746.getClass(), "_cfgSerializationType", term234850);
        setField(term234746, term234746.getClass(), "_accessorMethod", null);
        term234978 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term235070 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term235250 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term235070, term235070.getClass(), "_simpleName", "");
        setField(term234978, term234978.getClass(), "_name", term235070);
        setBooleanField(term234978, term234978.getClass(), "_forSerialization", true);
        setField(term234978, term234978.getClass(), "_getters", null);
        setField(term235250, term235250.getClass(), "value", null);
        setField(term235250, term235250.getClass(), "next", null);
        setField(term234978, term234978.getClass(), "_fields", term235250);
        setField(term234978, term234978.getClass(), "_annotationIntrospector", null);
        Class<? extends Object> term238598 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer");
        Field term235420 = ((Class) term238598).getDeclaredField((String) "_property");
        ((Field) term235420).setAccessible(false);
        term235368 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term235368, term235368.getClass(), "_field", term235420);
        term235518 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term235622 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
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
        args[0] = term234978;
        args[1] = term235368;
        args[2] = null;
        args[3] = term235518;
        args[4] = null;
        args[5] = null;
        args[6] = term235622;
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


