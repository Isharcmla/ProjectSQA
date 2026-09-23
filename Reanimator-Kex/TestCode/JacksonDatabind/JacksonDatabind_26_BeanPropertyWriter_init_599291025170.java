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

public class BeanPropertyWriter_init_599291025170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56771;
     Object term57163;

    public BeanPropertyWriter_init_599291025170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term56499 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object[] term56299 = (Object[]) newArray("java.lang.Class", 0);
        Object term56643 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer"));
        setField(term56499, term56499.getClass(), "_member", null);
        setField(term56499, term56499.getClass(), "_contextAnnotations", null);
        setField(term56499, term56499.getClass(), "_name", null);
        setField(term56499, term56499.getClass(), "_wrapperName", null);
        setField(term56499, term56499.getClass(), "_metadata", null);
        setField(term56499, term56499.getClass(), "_includeInViews", term56299);
        setField(term56499, term56499.getClass(), "_declaredType", null);
        setField(term56499, term56499.getClass(), "_serializer", null);
        setField(term56499, term56499.getClass(), "_dynamicSerializers", null);
        setField(term56499, term56499.getClass(), "_typeSerializer", term56643);
        setField(term56499, term56499.getClass(), "_cfgSerializationType", null);
        term56771 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term56863 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term57043 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term56863, term56863.getClass(), "_simpleName", "");
        setField(term56771, term56771.getClass(), "_name", term56863);
        setBooleanField(term56771, term56771.getClass(), "_forSerialization", true);
        setField(term56771, term56771.getClass(), "_getters", null);
        setField(term57043, term57043.getClass(), "value", null);
        setField(term57043, term57043.getClass(), "next", null);
        setField(term56771, term56771.getClass(), "_fields", term57043);
        setField(term56771, term56771.getClass(), "_annotationIntrospector", null);
        Class<? extends Object> term59227 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty");
        Class<? extends Object> term59494 = Class.forName((String) "java.lang.Object");
        Class<? extends Object> term59513 = Class.forName((String) "java.lang.Object");
        Object[] term59514 = (Object[]) newArray("java.lang.Class", 2);
        setElement(term59514, 0, term59494);
        setElement(term59514, 1, term59513);
        Method term57217 = ((Class) term59227).getDeclaredMethod((String) "set", (Class[]) term59514);
        ((Method) term57217).setAccessible(false);
        term57163 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term57163, term57163.getClass(), "_method", term57217);
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
        args[0] = term56771;
        args[1] = term57163;
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


