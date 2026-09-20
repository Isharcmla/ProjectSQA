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
import java.lang.IllegalArgumentException;
import static com.fasterxml.jackson.databind.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BeanPropertyWriter_init_599291025159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68694;
     Object term69004;
     Object term69120;
     Object term69396;
     Object term69350;

    public BeanPropertyWriter_init_599291025159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term67588 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term67708 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term67824 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term67922 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term68014 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term68128 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term68282 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$DateKeySerializer"));
        Object term68422 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        Object term68566 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer"));
        setField(term67588, term67588.getClass(), "_member", term67708);
        setField(term67588, term67588.getClass(), "_contextAnnotations", term67824);
        setField(term67588, term67588.getClass(), "_name", term67922);
        setField(term67588, term67588.getClass(), "_wrapperName", term68014);
        setField(term67588, term67588.getClass(), "_declaredType", term68128);
        setField(term67588, term67588.getClass(), "_serializer", term68282);
        setField(term67588, term67588.getClass(), "_dynamicSerializers", term68422);
        setField(term67588, term67588.getClass(), "_typeSerializer", term68566);
        setField(term67588, term67588.getClass(), "_cfgSerializationType", term68128);
        setBooleanField(term67588, term67588.getClass(), "_isRequired", false);
        term68694 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term68874 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term68694, term68694.getClass(), "_name", "");
        setBooleanField(term68694, term68694.getClass(), "_forSerialization", false);
        setField(term68694, term68694.getClass(), "_ctorParameters", null);
        setField(term68694, term68694.getClass(), "_setters", null);
        setField(term68874, term68874.getClass(), "value", null);
        setField(term68874, term68874.getClass(), "next", null);
        setField(term68694, term68694.getClass(), "_fields", term68874);
        setField(term68694, term68694.getClass(), "_annotationIntrospector", null);
        term69004 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        term69120 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term69396 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term69350 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer"));
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
        args[0] = term68694;
        args[1] = term69004;
        args[2] = term69120;
        args[3] = term69396;
        args[4] = null;
        args[5] = term69350;
        args[6] = term69396;
        args[7] = false;
        args[8] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};
