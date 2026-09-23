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

public class BeanPropertyWriter_init_599291025436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282495;
     Object term282865;
     Object term283035;
     Object term283177;
     Object term283277;

    public BeanPropertyWriter_init_599291025436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term282157 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term282257 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term282361 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term282157, term282157.getClass(), "_member", null);
        setField(term282157, term282157.getClass(), "_contextAnnotations", null);
        setField(term282157, term282157.getClass(), "_name", null);
        setField(term282157, term282157.getClass(), "_wrapperName", null);
        setField(term282157, term282157.getClass(), "_metadata", term282257);
        setField(term282157, term282157.getClass(), "_includeInViews", null);
        setField(term282157, term282157.getClass(), "_declaredType", null);
        setField(term282157, term282157.getClass(), "_serializer", null);
        setField(term282157, term282157.getClass(), "_dynamicSerializers", null);
        setField(term282157, term282157.getClass(), "_typeSerializer", null);
        setField(term282157, term282157.getClass(), "_cfgSerializationType", term282361);
        term282495 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term282587 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term282745 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term282587, term282587.getClass(), "_simpleName", "");
        setField(term282495, term282495.getClass(), "_fullName", term282587);
        setField(term282495, term282495.getClass(), "_introspector", null);
        setField(term282495, term282495.getClass(), "_member", term282745);
        setField(term282495, term282495.getClass(), "_metadata", null);
        Class<? extends Object> term284239 = Class.forName((String) "java.util.jar.Pack200");
        Object[] term284348 = (Object[]) newArray("java.lang.Class", 0);
        Method term282919 = ((Class) term284239).getDeclaredMethod((String) "newUnpacker", (Class[]) term284348);
        ((Method) term282919).setAccessible(false);
        term282865 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term282865, term282865.getClass(), "_method", term282919);
        term283035 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term283177 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer"));
        term283277 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
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
        args[0] = term282495;
        args[1] = term282865;
        args[2] = term283035;
        args[3] = null;
        args[4] = null;
        args[5] = term283177;
        args[6] = term283277;
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


