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

public class BeanPropertyWriter_init_599291025444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291087;
     Object term291739;

    public BeanPropertyWriter_init_599291025444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term290681 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term290799 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object[] term290423 = (Object[]) newArray("java.lang.Class", 0);
        Object term290959 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$IntArraySerializer"));
        setField(term290681, term290681.getClass(), "_member", term290799);
        setField(term290681, term290681.getClass(), "_contextAnnotations", null);
        setField(term290681, term290681.getClass(), "_name", null);
        setField(term290681, term290681.getClass(), "_wrapperName", null);
        setField(term290681, term290681.getClass(), "_metadata", null);
        setField(term290681, term290681.getClass(), "_includeInViews", term290423);
        setField(term290681, term290681.getClass(), "_declaredType", null);
        setField(term290681, term290681.getClass(), "_serializer", term290959);
        setField(term290681, term290681.getClass(), "_dynamicSerializers", null);
        setField(term290681, term290681.getClass(), "_typeSerializer", null);
        setField(term290681, term290681.getClass(), "_cfgSerializationType", null);
        setField(term290681, term290681.getClass(), "_accessorMethod", null);
        term291087 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term291179 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term291359 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term291477 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term291621 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term291179, term291179.getClass(), "_simpleName", "");
        setField(term291087, term291087.getClass(), "_name", term291179);
        setBooleanField(term291087, term291087.getClass(), "_forSerialization", false);
        setField(term291087, term291087.getClass(), "_ctorParameters", null);
        setField(term291087, term291087.getClass(), "_setters", null);
        setField(term291359, term291359.getClass(), "value", term291477);
        setField(term291359, term291359.getClass(), "next", null);
        setField(term291087, term291087.getClass(), "_fields", term291359);
        setField(term291087, term291087.getClass(), "_annotationIntrospector", term291621);
        Class<? extends Object> term292655 = Class.forName((String) "kex.java.util.LinkedList");
        Field term291791 = ((Class) term292655).getDeclaredField((String) "inner");
        ((Field) term291791).setAccessible(false);
        term291739 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term291739, term291739.getClass(), "_field", term291791);
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
        args[0] = term291087;
        args[1] = term291739;
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


