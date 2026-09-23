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

public class BeanPropertyWriter_init_599291025257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120304;
     Object term120670;
     Object term120780;
     Object term120878;

    public BeanPropertyWriter_init_599291025257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term121917 = Class.forName((String) "java.util.stream.WhileOps$DropWhileSink");
        Object[] term122100 = (Object[]) newArray("java.lang.Class", 0);
        Method term120170 = ((Class) term121917).getDeclaredMethod((String) "getDropCount", (Class[]) term122100);
        ((Method) term120170).setAccessible(false);
        Object term119214 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term119340 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        term120780 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term119548 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term119648 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term119744 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term119872 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer"));
        Object term120012 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Multi"));
        Object term120116 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term119214, term119214.getClass(), "_member", term119340);
        setField(term119214, term119214.getClass(), "_contextAnnotations", term120780);
        setField(term119214, term119214.getClass(), "_name", null);
        setField(term119214, term119214.getClass(), "_wrapperName", term119548);
        setField(term119214, term119214.getClass(), "_metadata", term119648);
        setField(term119214, term119214.getClass(), "_includeInViews", null);
        setField(term119214, term119214.getClass(), "_declaredType", term119744);
        setField(term119214, term119214.getClass(), "_serializer", term119872);
        setField(term119214, term119214.getClass(), "_dynamicSerializers", term120012);
        setField(term119214, term119214.getClass(), "_typeSerializer", null);
        setField(term119214, term119214.getClass(), "_cfgSerializationType", term120116);
        setField(term119214, term119214.getClass(), "_accessorMethod", term120170);
        term120304 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term120396 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term120552 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term120396, term120396.getClass(), "_simpleName", "");
        setField(term120304, term120304.getClass(), "_fullName", term120396);
        setField(term120304, term120304.getClass(), "_introspector", null);
        setField(term120304, term120304.getClass(), "_member", term120552);
        setField(term120304, term120304.getClass(), "_metadata", null);
        Class<? extends Object> term122102 = Class.forName((String) "java.lang.invoke.AbstractConstantGroup$BSCIWithCache");
        Field term120722 = ((Class) term122102).getDeclaredField((String) "name");
        ((Field) term120722).setAccessible(false);
        term120670 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term120670, term120670.getClass(), "_field", term120722);
        term120878 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
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
        args[0] = term120304;
        args[1] = term120670;
        args[2] = term120780;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = term120878;
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


