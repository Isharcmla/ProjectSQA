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

public class BeanPropertyWriter_init_599291025153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43163;
     Object term43413;
     Object term43619;

    public BeanPropertyWriter_init_599291025153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term42937 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term43035 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object[] term42743 = (Object[]) newArray("java.lang.Class", 0);
        setField(term42937, term42937.getClass(), "_member", null);
        setField(term42937, term42937.getClass(), "_contextAnnotations", null);
        setField(term42937, term42937.getClass(), "_name", term43035);
        setField(term42937, term42937.getClass(), "_wrapperName", null);
        setField(term42937, term42937.getClass(), "_metadata", null);
        setField(term42937, term42937.getClass(), "_includeInViews", term42743);
        setField(term42937, term42937.getClass(), "_declaredType", null);
        setField(term42937, term42937.getClass(), "_serializer", null);
        setField(term42937, term42937.getClass(), "_dynamicSerializers", null);
        setField(term42937, term42937.getClass(), "_typeSerializer", null);
        setField(term42937, term42937.getClass(), "_cfgSerializationType", null);
        term43163 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term43255 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term43255, term43255.getClass(), "_simpleName", "");
        setField(term43163, term43163.getClass(), "_name", term43255);
        setBooleanField(term43163, term43163.getClass(), "_forSerialization", false);
        setField(term43163, term43163.getClass(), "_ctorParameters", null);
        setField(term43163, term43163.getClass(), "_setters", null);
        setField(term43163, term43163.getClass(), "_fields", null);
        setField(term43163, term43163.getClass(), "_annotationIntrospector", null);
        Class<? extends Object> term44470 = Class.forName((String) "java.lang.ClassLoader$NativeLibrary$Unloader");
        Object[] term44655 = (Object[]) newArray("java.lang.Class", 0);
        Method term43467 = ((Class) term44470).getDeclaredMethod((String) "run", (Class[]) term44655);
        ((Method) term43467).setAccessible(false);
        term43413 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term43413, term43413.getClass(), "_method", term43467);
        term43619 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.NumberSerializers$DoubleSerializer"));
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
        args[0] = term43163;
        args[1] = term43413;
        args[2] = null;
        args[3] = null;
        args[4] = term43619;
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


