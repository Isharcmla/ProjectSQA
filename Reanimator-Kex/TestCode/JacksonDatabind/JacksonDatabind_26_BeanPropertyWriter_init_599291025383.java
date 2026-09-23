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

public class BeanPropertyWriter_init_599291025383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229931;
     Object term230441;

    public BeanPropertyWriter_init_599291025383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term229683 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term229803 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object[] term229480 = (Object[]) newArray("java.lang.Class", 0);
        setField(term229683, term229683.getClass(), "_member", term229803);
        setField(term229683, term229683.getClass(), "_contextAnnotations", null);
        setField(term229683, term229683.getClass(), "_name", null);
        setField(term229683, term229683.getClass(), "_wrapperName", null);
        setField(term229683, term229683.getClass(), "_metadata", null);
        setField(term229683, term229683.getClass(), "_includeInViews", term229480);
        setField(term229683, term229683.getClass(), "_declaredType", null);
        setField(term229683, term229683.getClass(), "_serializer", null);
        setField(term229683, term229683.getClass(), "_dynamicSerializers", null);
        setField(term229683, term229683.getClass(), "_typeSerializer", null);
        setField(term229683, term229683.getClass(), "_cfgSerializationType", null);
        term229931 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term230023 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term230203 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term230321 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term230023, term230023.getClass(), "_simpleName", "");
        setField(term229931, term229931.getClass(), "_name", term230023);
        setBooleanField(term229931, term229931.getClass(), "_forSerialization", false);
        setField(term229931, term229931.getClass(), "_ctorParameters", null);
        setField(term229931, term229931.getClass(), "_setters", null);
        setField(term230203, term230203.getClass(), "value", term230321);
        setField(term230203, term230203.getClass(), "next", null);
        setField(term229931, term229931.getClass(), "_fields", term230203);
        setField(term229931, term229931.getClass(), "_annotationIntrospector", null);
        Class<? extends Object> term232628 = Class.forName((String) "java.lang.reflect.ReflectAccess");
        Class<? extends Object> term232830 = Class.forName((String) "java.lang.reflect.Constructor");
        Class<? extends Object> term232873 = Class.forName((String) "jdk.internal.reflect.ConstructorAccessor");
        Object[] term232874 = (Object[]) newArray("java.lang.Class", 2);
        setElement(term232874, 0, term232830);
        setElement(term232874, 1, term232873);
        Method term230495 = ((Class) term232628).getDeclaredMethod((String) "setConstructorAccessor", (Class[]) term232874);
        ((Method) term230495).setAccessible(false);
        term230441 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term230441, term230441.getClass(), "_method", term230495);
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
        args[0] = term229931;
        args[1] = term230441;
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


