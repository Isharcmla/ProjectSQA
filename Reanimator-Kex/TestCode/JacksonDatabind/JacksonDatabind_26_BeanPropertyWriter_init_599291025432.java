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

public class BeanPropertyWriter_init_599291025432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278832;
     Object term279366;

    public BeanPropertyWriter_init_599291025432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term278516 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term278608 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object[] term278261 = (Object[]) newArray("java.lang.Class", 0);
        Object term278704 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term278516, term278516.getClass(), "_member", null);
        setField(term278516, term278516.getClass(), "_contextAnnotations", null);
        setField(term278516, term278516.getClass(), "_name", null);
        setField(term278516, term278516.getClass(), "_wrapperName", term278608);
        setField(term278516, term278516.getClass(), "_metadata", null);
        setField(term278516, term278516.getClass(), "_includeInViews", term278261);
        setField(term278516, term278516.getClass(), "_declaredType", term278704);
        setField(term278516, term278516.getClass(), "_serializer", null);
        setField(term278516, term278516.getClass(), "_dynamicSerializers", null);
        setField(term278516, term278516.getClass(), "_typeSerializer", null);
        setField(term278516, term278516.getClass(), "_cfgSerializationType", null);
        setField(term278516, term278516.getClass(), "_accessorMethod", null);
        term278832 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term278924 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term279104 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term279248 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term278924, term278924.getClass(), "_simpleName", "");
        setField(term278832, term278832.getClass(), "_name", term278924);
        setBooleanField(term278832, term278832.getClass(), "_forSerialization", false);
        setField(term278832, term278832.getClass(), "_ctorParameters", null);
        setField(term279104, term279104.getClass(), "next", null);
        setField(term279104, term279104.getClass(), "value", null);
        setField(term278832, term278832.getClass(), "_setters", term279104);
        setField(term278832, term278832.getClass(), "_fields", null);
        setField(term278832, term278832.getClass(), "_annotationIntrospector", term279248);
        Class<? extends Object> term280258 = Class.forName((String) "java.lang.Character");
        Field term279418 = ((Class) term280258).getDeclaredField((String) "DIRECTIONALITY_ARABIC_NUMBER");
        ((Field) term279418).setAccessible(false);
        term279366 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term279366, term279366.getClass(), "_field", term279418);
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
        args[0] = term278832;
        args[1] = term279366;
        args[2] = null;
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


