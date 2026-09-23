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

public class BeanPropertyWriter_init_599291025427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term272763;
     Object term273011;
     Object term273181;

    public BeanPropertyWriter_init_599291025427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term272375 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term272491 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object[] term272185 = (Object[]) newArray("java.lang.Class", 0);
        Object term272635 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeSerializer"));
        setField(term272375, term272375.getClass(), "_member", null);
        setField(term272375, term272375.getClass(), "_contextAnnotations", term272491);
        setField(term272375, term272375.getClass(), "_name", null);
        setField(term272375, term272375.getClass(), "_wrapperName", null);
        setField(term272375, term272375.getClass(), "_metadata", null);
        setField(term272375, term272375.getClass(), "_includeInViews", term272185);
        setField(term272375, term272375.getClass(), "_declaredType", null);
        setField(term272375, term272375.getClass(), "_serializer", null);
        setField(term272375, term272375.getClass(), "_dynamicSerializers", null);
        setField(term272375, term272375.getClass(), "_typeSerializer", term272635);
        setField(term272375, term272375.getClass(), "_cfgSerializationType", null);
        setField(term272375, term272375.getClass(), "_accessorMethod", null);
        term272763 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term272855 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term272855, term272855.getClass(), "_simpleName", "");
        setField(term272763, term272763.getClass(), "_name", term272855);
        setBooleanField(term272763, term272763.getClass(), "_forSerialization", true);
        setField(term272763, term272763.getClass(), "_getters", null);
        setField(term272763, term272763.getClass(), "_fields", null);
        setField(term272763, term272763.getClass(), "_annotationIntrospector", null);
        Class<? extends Object> term275263 = Class.forName((String) "java.util.EnumSet$SerializationProxy");
        Field term273063 = ((Class) term275263).getDeclaredField((String) "serialVersionUID");
        ((Field) term273063).setAccessible(false);
        term273011 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term273011, term273011.getClass(), "_field", term273063);
        term273181 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.SqlDateSerializer"));
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
        args[0] = term272763;
        args[1] = term273011;
        args[2] = null;
        args[3] = null;
        args[4] = term273181;
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


