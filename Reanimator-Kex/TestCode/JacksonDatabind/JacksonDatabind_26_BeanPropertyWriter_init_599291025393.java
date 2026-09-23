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

public class BeanPropertyWriter_init_599291025393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241968;
     Object term242434;
     Object term242592;
     Object term242758;

    public BeanPropertyWriter_init_599291025393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term245394 = Class.forName((String) "java.util.stream.ReduceOps$16");
        Object[] term245529 = (Object[]) newArray("java.lang.Class", 0);
        Method term241834 = ((Class) term245394).getDeclaredMethod((String) "makeSink", (Class[]) term245529);
        ((Method) term241834).setAccessible(false);
        Object term241078 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term241176 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term241268 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term241368 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term241502 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default"));
        Object term241642 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        Object term241780 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer"));
        setField(term241078, term241078.getClass(), "_member", null);
        setField(term241078, term241078.getClass(), "_contextAnnotations", null);
        setField(term241078, term241078.getClass(), "_name", term241176);
        setField(term241078, term241078.getClass(), "_wrapperName", term241268);
        setField(term241078, term241078.getClass(), "_metadata", term241368);
        setField(term241078, term241078.getClass(), "_includeInViews", null);
        setField(term241078, term241078.getClass(), "_declaredType", null);
        setField(term241078, term241078.getClass(), "_serializer", term241502);
        setField(term241078, term241078.getClass(), "_dynamicSerializers", term241642);
        setField(term241078, term241078.getClass(), "_typeSerializer", term241780);
        setField(term241078, term241078.getClass(), "_cfgSerializationType", null);
        setField(term241078, term241078.getClass(), "_accessorMethod", term241834);
        term241968 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term242060 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term242216 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term242316 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term242060, term242060.getClass(), "_simpleName", "");
        setField(term241968, term241968.getClass(), "_fullName", term242060);
        setField(term241968, term241968.getClass(), "_introspector", null);
        setField(term241968, term241968.getClass(), "_member", term242216);
        setField(term241968, term241968.getClass(), "_metadata", term242316);
        Class<? extends Object> term245531 = Class.forName((String) "java.lang.invoke.BootstrapMethodInvoker$PushAdapter");
        Field term242486 = ((Class) term245531).getDeclaredField((String) "MH_pushToBootstrapMethod");
        ((Field) term242486).setAccessible(false);
        term242434 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term242434, term242434.getClass(), "_field", term242486);
        term242592 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term242758 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$DoubleArraySerializer"));
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
        args[0] = term241968;
        args[1] = term242434;
        args[2] = null;
        args[3] = term242592;
        args[4] = term242758;
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


