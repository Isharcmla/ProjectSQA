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

public class BeanPropertyWriter_init_599291025275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137975;
     Object term138223;
     Object term138391;
     Object term138513;
     Object term138657;

    public BeanPropertyWriter_init_599291025275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term137607 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term137741 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember"));
        Object[] term137411 = (Object[]) newArray("java.lang.Class", 0);
        Object term137847 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term137607, term137607.getClass(), "_member", term137741);
        setField(term137607, term137607.getClass(), "_contextAnnotations", null);
        setField(term137607, term137607.getClass(), "_name", null);
        setField(term137607, term137607.getClass(), "_wrapperName", null);
        setField(term137607, term137607.getClass(), "_metadata", null);
        setField(term137607, term137607.getClass(), "_includeInViews", term137411);
        setField(term137607, term137607.getClass(), "_declaredType", term137847);
        setField(term137607, term137607.getClass(), "_serializer", null);
        setField(term137607, term137607.getClass(), "_dynamicSerializers", null);
        setField(term137607, term137607.getClass(), "_typeSerializer", null);
        setField(term137607, term137607.getClass(), "_cfgSerializationType", null);
        setField(term137607, term137607.getClass(), "_accessorMethod", null);
        term137975 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term138067 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term138067, term138067.getClass(), "_simpleName", "");
        setField(term137975, term137975.getClass(), "_name", term138067);
        setBooleanField(term137975, term137975.getClass(), "_forSerialization", false);
        setField(term137975, term137975.getClass(), "_ctorParameters", null);
        setField(term137975, term137975.getClass(), "_setters", null);
        setField(term137975, term137975.getClass(), "_fields", null);
        setField(term137975, term137975.getClass(), "_annotationIntrospector", null);
        Class<? extends Object> term139421 = Class.forName((String) "com.fasterxml.jackson.databind.cfg.PackageVersion");
        Field term138275 = ((Class) term139421).getDeclaredField((String) "VERSION");
        ((Field) term138275).setAccessible(false);
        term138223 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term138223, term138223.getClass(), "_field", term138275);
        term138391 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term138513 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        term138657 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeSerializer"));
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
        args[0] = term137975;
        args[1] = term138223;
        args[2] = term138391;
        args[3] = null;
        args[4] = term138513;
        args[5] = term138657;
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


