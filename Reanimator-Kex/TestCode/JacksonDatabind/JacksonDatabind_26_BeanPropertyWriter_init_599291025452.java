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

public class BeanPropertyWriter_init_599291025452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297871;
     Object term298119;
     Object term298287;

    public BeanPropertyWriter_init_599291025452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term299711 = Class.forName((String) "java.util.concurrent.ForkJoinPool$DefaultForkJoinWorkerThreadFactory$1");
        Object[] term300000 = (Object[]) newArray("java.lang.Class", 0);
        Method term297743 = ((Class) term299711).getDeclaredMethod((String) "run", (Class[]) term300000);
        ((Method) term297743).setAccessible(false);
        Object term297689 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object[] term297494 = (Object[]) newArray("java.lang.Class", 0);
        setField(term297689, term297689.getClass(), "_member", null);
        setField(term297689, term297689.getClass(), "_contextAnnotations", null);
        setField(term297689, term297689.getClass(), "_name", null);
        setField(term297689, term297689.getClass(), "_wrapperName", null);
        setField(term297689, term297689.getClass(), "_metadata", null);
        setField(term297689, term297689.getClass(), "_includeInViews", term297494);
        setField(term297689, term297689.getClass(), "_declaredType", null);
        setField(term297689, term297689.getClass(), "_serializer", null);
        setField(term297689, term297689.getClass(), "_dynamicSerializers", null);
        setField(term297689, term297689.getClass(), "_typeSerializer", null);
        setField(term297689, term297689.getClass(), "_cfgSerializationType", null);
        setField(term297689, term297689.getClass(), "_accessorMethod", term297743);
        term297871 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term297963 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term297963, term297963.getClass(), "_simpleName", "");
        setField(term297871, term297871.getClass(), "_name", term297963);
        setBooleanField(term297871, term297871.getClass(), "_forSerialization", true);
        setField(term297871, term297871.getClass(), "_getters", null);
        setField(term297871, term297871.getClass(), "_fields", null);
        setField(term297871, term297871.getClass(), "_annotationIntrospector", null);
        Class<? extends Object> term300002 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.BooleanSerializer");
        Field term298171 = ((Class) term300002).getDeclaredField((String) "serialVersionUID");
        ((Field) term298171).setAccessible(false);
        term298119 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term298119, term298119.getClass(), "_field", term298171);
        term298287 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
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
        args[0] = term297871;
        args[1] = term298119;
        args[2] = term298287;
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


