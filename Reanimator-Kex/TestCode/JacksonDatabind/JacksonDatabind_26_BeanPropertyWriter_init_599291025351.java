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

public class BeanPropertyWriter_init_599291025351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205100;
     Object term205920;
     Object term206132;

    public BeanPropertyWriter_init_599291025351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term204650 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term204770 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term204868 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object[] term204390 = (Object[]) newArray("java.lang.Class", 0);
        Object term204972 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term204650, term204650.getClass(), "_member", term204770);
        setField(term204650, term204650.getClass(), "_contextAnnotations", null);
        setField(term204650, term204650.getClass(), "_name", term204868);
        setField(term204650, term204650.getClass(), "_wrapperName", null);
        setField(term204650, term204650.getClass(), "_metadata", null);
        setField(term204650, term204650.getClass(), "_includeInViews", term204390);
        setField(term204650, term204650.getClass(), "_declaredType", null);
        setField(term204650, term204650.getClass(), "_serializer", null);
        setField(term204650, term204650.getClass(), "_dynamicSerializers", null);
        setField(term204650, term204650.getClass(), "_typeSerializer", null);
        setField(term204650, term204650.getClass(), "_cfgSerializationType", term204972);
        setField(term204650, term204650.getClass(), "_accessorMethod", null);
        term205100 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term205192 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term205372 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term205514 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term205658 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term205802 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term205192, term205192.getClass(), "_simpleName", "");
        setField(term205100, term205100.getClass(), "_name", term205192);
        setBooleanField(term205100, term205100.getClass(), "_forSerialization", true);
        setField(term205100, term205100.getClass(), "_getters", null);
        setField(term205372, term205372.getClass(), "value", null);
        setField(term205372, term205372.getClass(), "next", null);
        setField(term205100, term205100.getClass(), "_fields", term205372);
        setField(term205514, term205514.getClass(), "_primary", term205658);
        setField(term205514, term205514.getClass(), "_secondary", term205802);
        setField(term205100, term205100.getClass(), "_annotationIntrospector", term205514);
        Class<? extends Object> term208351 = Class.forName((String) "java.util.AbstractMap$2");
        Field term205972 = ((Class) term208351).getDeclaredField((String) "this$0");
        ((Field) term205972).setAccessible(false);
        term205920 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term205920, term205920.getClass(), "_field", term205972);
        term206132 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer"));
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
        args[0] = term205100;
        args[1] = term205920;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = term206132;
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


