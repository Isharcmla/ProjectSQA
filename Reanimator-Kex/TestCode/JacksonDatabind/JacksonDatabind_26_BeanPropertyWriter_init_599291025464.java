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

public class BeanPropertyWriter_init_599291025464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309685;
     Object term310221;
     Object term310439;
     Object term310553;

    public BeanPropertyWriter_init_599291025464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term309343 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term309459 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object[] term309088 = (Object[]) newArray("java.lang.Class", 0);
        Object term309557 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term309343, term309343.getClass(), "_member", null);
        setField(term309343, term309343.getClass(), "_contextAnnotations", term309459);
        setField(term309343, term309343.getClass(), "_name", null);
        setField(term309343, term309343.getClass(), "_wrapperName", null);
        setField(term309343, term309343.getClass(), "_metadata", null);
        setField(term309343, term309343.getClass(), "_includeInViews", term309088);
        setField(term309343, term309343.getClass(), "_declaredType", term309557);
        setField(term309343, term309343.getClass(), "_serializer", null);
        setField(term309343, term309343.getClass(), "_dynamicSerializers", null);
        setField(term309343, term309343.getClass(), "_typeSerializer", null);
        setField(term309343, term309343.getClass(), "_cfgSerializationType", null);
        term309685 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term309777 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term309957 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term310101 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term309777, term309777.getClass(), "_simpleName", "");
        setField(term309685, term309685.getClass(), "_name", term309777);
        setBooleanField(term309685, term309685.getClass(), "_forSerialization", false);
        setField(term309685, term309685.getClass(), "_ctorParameters", null);
        setField(term309957, term309957.getClass(), "next", null);
        setField(term309957, term309957.getClass(), "value", null);
        setField(term309685, term309685.getClass(), "_setters", term309957);
        setField(term309685, term309685.getClass(), "_fields", null);
        setField(term309685, term309685.getClass(), "_annotationIntrospector", term310101);
        Class<? extends Object> term311420 = Class.forName((String) "java.util.zip.DeflaterInputStream");
        Object[] term311573 = (Object[]) newArray("java.lang.Class", 0);
        Method term310275 = ((Class) term311420).getDeclaredMethod((String) "available", (Class[]) term311573);
        ((Method) term310275).setAccessible(false);
        term310221 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term310221, term310221.getClass(), "_method", term310275);
        term310439 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$FloatArraySerializer"));
        term310553 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
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
        args[0] = term309685;
        args[1] = term310221;
        args[2] = null;
        args[3] = null;
        args[4] = term310439;
        args[5] = null;
        args[6] = term310553;
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


