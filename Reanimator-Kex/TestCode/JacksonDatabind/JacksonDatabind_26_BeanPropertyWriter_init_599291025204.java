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

public class BeanPropertyWriter_init_599291025204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80521;
     Object term80913;

    public BeanPropertyWriter_init_599291025204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term80295 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term80393 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object[] term80094 = (Object[]) newArray("java.lang.Class", 0);
        setField(term80295, term80295.getClass(), "_member", null);
        setField(term80295, term80295.getClass(), "_contextAnnotations", null);
        setField(term80295, term80295.getClass(), "_name", term80393);
        setField(term80295, term80295.getClass(), "_wrapperName", null);
        setField(term80295, term80295.getClass(), "_metadata", null);
        setField(term80295, term80295.getClass(), "_includeInViews", term80094);
        setField(term80295, term80295.getClass(), "_declaredType", null);
        setField(term80295, term80295.getClass(), "_serializer", null);
        setField(term80295, term80295.getClass(), "_dynamicSerializers", null);
        setField(term80295, term80295.getClass(), "_typeSerializer", null);
        setField(term80295, term80295.getClass(), "_cfgSerializationType", null);
        term80521 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term80613 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term80793 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term80613, term80613.getClass(), "_simpleName", "");
        setField(term80521, term80521.getClass(), "_name", term80613);
        setBooleanField(term80521, term80521.getClass(), "_forSerialization", false);
        setField(term80521, term80521.getClass(), "_ctorParameters", null);
        setField(term80521, term80521.getClass(), "_setters", null);
        setField(term80793, term80793.getClass(), "value", null);
        setField(term80793, term80793.getClass(), "next", null);
        setField(term80521, term80521.getClass(), "_fields", term80793);
        setField(term80521, term80521.getClass(), "_annotationIntrospector", null);
        Class<? extends Object> term83012 = Class.forName((String) "com.fasterxml.jackson.core.json.PackageVersion");
        Object[] term83213 = (Object[]) newArray("java.lang.Class", 0);
        Method term80967 = ((Class) term83012).getDeclaredMethod((String) "version", (Class[]) term83213);
        ((Method) term80967).setAccessible(false);
        term80913 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term80913, term80913.getClass(), "_method", term80967);
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
        args[0] = term80521;
        args[1] = term80913;
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


