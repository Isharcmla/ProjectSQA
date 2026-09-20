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
import static com.fasterxml.jackson.databind.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class BeanPropertyWriter_init_599291025150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61701;
     Object term62005;
     Object term62157;
     Object term62317;
     Object term62415;

    public BeanPropertyWriter_init_599291025150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term62450 = Class.forName((String) "java.util.TreeMap$KeySpliterator");
        Object[] term62611 = (Object[]) newArray("java.lang.Class", 0);
        Method term61567 = ((Class) term62450).getDeclaredMethod((String) "characteristics", (Class[]) term62611);
        ((Method) term61567).setAccessible(false);
        Object term61271 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term61369 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term61513 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeSerializer"));
        setField(term61271, term61271.getClass(), "_member", null);
        setField(term61271, term61271.getClass(), "_contextAnnotations", null);
        setField(term61271, term61271.getClass(), "_name", term61369);
        setField(term61271, term61271.getClass(), "_wrapperName", null);
        setField(term61271, term61271.getClass(), "_declaredType", null);
        setField(term61271, term61271.getClass(), "_serializer", null);
        setField(term61271, term61271.getClass(), "_dynamicSerializers", null);
        setField(term61271, term61271.getClass(), "_typeSerializer", term61513);
        setField(term61271, term61271.getClass(), "_cfgSerializationType", null);
        setBooleanField(term61271, term61271.getClass(), "_isRequired", false);
        setField(term61271, term61271.getClass(), "_accessorMethod", term61567);
        term61701 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term61887 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term61701, term61701.getClass(), "_name", "");
        setField(term61701, term61701.getClass(), "_introspector", term61887);
        setField(term61701, term61701.getClass(), "_member", null);
        Class<? extends Object> term62613 = Class.forName((String) "java.nio.HeapFloatBufferR");
        Field term62057 = ((Class) term62613).getDeclaredField((String) "ARRAY_BASE_OFFSET");
        ((Field) term62057).setAccessible(false);
        term62005 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term62005, term62005.getClass(), "_field", term62057);
        term62157 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        term62317 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$IntArraySerializer"));
        term62415 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
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
        args[0] = term61701;
        args[1] = term62005;
        args[2] = null;
        args[3] = term62157;
        args[4] = term62317;
        args[5] = null;
        args[6] = term62415;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};
