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

public class BeanPropertyWriter_init_599291025233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103012;
     Object term103546;
     Object term103716;

    public BeanPropertyWriter_init_599291025233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term102884 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        setField(term102884, term102884.getClass(), "_member", null);
        setField(term102884, term102884.getClass(), "_contextAnnotations", null);
        setField(term102884, term102884.getClass(), "_name", null);
        setField(term102884, term102884.getClass(), "_wrapperName", null);
        setField(term102884, term102884.getClass(), "_metadata", null);
        setField(term102884, term102884.getClass(), "_includeInViews", null);
        setField(term102884, term102884.getClass(), "_declaredType", null);
        setField(term102884, term102884.getClass(), "_serializer", null);
        setField(term102884, term102884.getClass(), "_dynamicSerializers", null);
        setField(term102884, term102884.getClass(), "_typeSerializer", null);
        setField(term102884, term102884.getClass(), "_cfgSerializationType", null);
        term103012 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term103104 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term103284 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term103426 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term103104, term103104.getClass(), "_simpleName", "");
        setField(term103012, term103012.getClass(), "_name", term103104);
        setBooleanField(term103012, term103012.getClass(), "_forSerialization", false);
        setField(term103012, term103012.getClass(), "_ctorParameters", null);
        setField(term103284, term103284.getClass(), "next", null);
        setField(term103284, term103284.getClass(), "value", null);
        setField(term103012, term103012.getClass(), "_setters", term103284);
        setField(term103426, term103426.getClass(), "value", null);
        setField(term103426, term103426.getClass(), "next", null);
        setField(term103012, term103012.getClass(), "_fields", term103426);
        setField(term103012, term103012.getClass(), "_annotationIntrospector", null);
        Class<? extends Object> term104780 = Class.forName((String) "java.lang.invoke.LambdaForm$NamedFunction");
        Object[] term104995 = (Object[]) newArray("java.lang.Class", 0);
        Method term103600 = ((Class) term104780).getDeclaredMethod((String) "assertMemberIsConsistent", (Class[]) term104995);
        ((Method) term103600).setAccessible(false);
        term103546 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term103546, term103546.getClass(), "_method", term103600);
        term103716 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
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
        args[0] = term103012;
        args[1] = term103546;
        args[2] = term103716;
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


