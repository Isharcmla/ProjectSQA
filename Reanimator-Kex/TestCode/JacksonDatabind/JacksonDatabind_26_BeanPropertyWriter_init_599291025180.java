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

public class BeanPropertyWriter_init_599291025180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63918;
     Object term64308;
     Object term64452;

    public BeanPropertyWriter_init_599291025180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term63570 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term63690 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term63790 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object[] term63369 = (Object[]) newArray("java.lang.Class", 0);
        setField(term63570, term63570.getClass(), "_member", term63690);
        setField(term63570, term63570.getClass(), "_contextAnnotations", null);
        setField(term63570, term63570.getClass(), "_name", null);
        setField(term63570, term63570.getClass(), "_wrapperName", null);
        setField(term63570, term63570.getClass(), "_metadata", term63790);
        setField(term63570, term63570.getClass(), "_includeInViews", term63369);
        setField(term63570, term63570.getClass(), "_declaredType", null);
        setField(term63570, term63570.getClass(), "_serializer", null);
        setField(term63570, term63570.getClass(), "_dynamicSerializers", null);
        setField(term63570, term63570.getClass(), "_typeSerializer", null);
        setField(term63570, term63570.getClass(), "_cfgSerializationType", null);
        setField(term63570, term63570.getClass(), "_accessorMethod", null);
        term63918 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term64010 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term64190 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term64010, term64010.getClass(), "_simpleName", "");
        setField(term63918, term63918.getClass(), "_name", term64010);
        setBooleanField(term63918, term63918.getClass(), "_forSerialization", false);
        setField(term63918, term63918.getClass(), "_ctorParameters", null);
        setField(term63918, term63918.getClass(), "_setters", null);
        setField(term64190, term64190.getClass(), "value", null);
        setField(term64190, term64190.getClass(), "next", null);
        setField(term63918, term63918.getClass(), "_fields", term64190);
        setField(term63918, term63918.getClass(), "_annotationIntrospector", null);
        Class<? extends Object> term66358 = Class.forName((String) "java.util.TreeMap$DescendingSubMap");
        Field term64360 = ((Class) term66358).getDeclaredField((String) "serialVersionUID");
        ((Field) term64360).setAccessible(false);
        term64308 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term64308, term64308.getClass(), "_field", term64360);
        term64452 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
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
        args[0] = term63918;
        args[1] = term64308;
        args[2] = null;
        args[3] = term64452;
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


