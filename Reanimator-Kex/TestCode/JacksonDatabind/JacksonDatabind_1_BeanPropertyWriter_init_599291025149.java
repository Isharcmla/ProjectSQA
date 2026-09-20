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

public class BeanPropertyWriter_init_599291025149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59159;
     Object term59581;
     Object term59735;

    public BeanPropertyWriter_init_599291025149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term58673 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term58789 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term58887 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term59025 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer"));
        setField(term58673, term58673.getClass(), "_member", null);
        setField(term58673, term58673.getClass(), "_contextAnnotations", term58789);
        setField(term58673, term58673.getClass(), "_name", term58887);
        setField(term58673, term58673.getClass(), "_wrapperName", null);
        setField(term58673, term58673.getClass(), "_declaredType", null);
        setField(term58673, term58673.getClass(), "_serializer", null);
        setField(term58673, term58673.getClass(), "_dynamicSerializers", null);
        setField(term58673, term58673.getClass(), "_typeSerializer", term59025);
        setField(term58673, term58673.getClass(), "_cfgSerializationType", null);
        setBooleanField(term58673, term58673.getClass(), "_isRequired", false);
        term59159 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term59341 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term59461 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term59159, term59159.getClass(), "_name", "");
        setField(term59159, term59159.getClass(), "_introspector", term59341);
        setField(term59159, term59159.getClass(), "_member", term59461);
        Class<? extends Object> term60875 = Class.forName((String) "java.util.function.ToLongFunction");
        Class<? extends Object> term61050 = Class.forName((String) "java.lang.Object");
        Object[] term61051 = (Object[]) newArray("java.lang.Class", 1);
        setElement(term61051, 0, term61050);
        Method term59635 = ((Class) term60875).getDeclaredMethod((String) "applyAsLong", (Class[]) term61051);
        ((Method) term59635).setAccessible(false);
        term59581 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term59581, term59581.getClass(), "_method", term59635);
        term59735 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
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
        args[0] = term59159;
        args[1] = term59581;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = term59735;
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
