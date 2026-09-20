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

public class BeanPropertyWriter_init_599291025118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38378;
     Object term38536;
     Object term38682;

    public BeanPropertyWriter_init_599291025118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term38020 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term38146 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        Object term38244 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term38020, term38020.getClass(), "_member", term38146);
        setField(term38020, term38020.getClass(), "_contextAnnotations", null);
        setField(term38020, term38020.getClass(), "_name", term38244);
        setField(term38020, term38020.getClass(), "_wrapperName", null);
        setField(term38020, term38020.getClass(), "_declaredType", null);
        setField(term38020, term38020.getClass(), "_serializer", null);
        setField(term38020, term38020.getClass(), "_dynamicSerializers", null);
        setField(term38020, term38020.getClass(), "_typeSerializer", null);
        setField(term38020, term38020.getClass(), "_cfgSerializationType", null);
        setBooleanField(term38020, term38020.getClass(), "_isRequired", false);
        term38378 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        setField(term38378, term38378.getClass(), "_name", "");
        setField(term38378, term38378.getClass(), "_introspector", null);
        Class<? extends Object> term41277 = Class.forName((String) "java.lang.StackStreamFactory$AbstractStackWalker");
        Object[] term41504 = (Object[]) newArray("java.lang.Class", 0);
        Method term38590 = ((Class) term41277).getDeclaredMethod((String) "getNextBatchSize", (Class[]) term41504);
        ((Method) term38590).setAccessible(false);
        term38536 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term38536, term38536.getClass(), "_method", term38590);
        term38682 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
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
        args[0] = term38378;
        args[1] = term38536;
        args[2] = null;
        args[3] = term38682;
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
