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
import java.util.HashMap;

public class BeanPropertyWriter_init_563115496127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28351;
     Object term29085;

    public BeanPropertyWriter_init_563115496127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30476 = Class.forName((String) "java.lang.SecurityException");
        Field term27967 = ((Class) term30476).getDeclaredField((String) "serialVersionUID");
        ((Field) term27967).setAccessible(false);
        Object term27507 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term27605 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term27697 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term27797 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term27915 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term28079 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.UUIDSerializer"));
        Object term28239 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicLongSerializer"));
        setField(term27507, term27507.getClass(), "_name", term27605);
        setField(term27507, term27507.getClass(), "_wrapperName", term27697);
        setField(term27507, term27507.getClass(), "_contextAnnotations", null);
        setField(term27507, term27507.getClass(), "_declaredType", term27797);
        setField(term27507, term27507.getClass(), "_member", term27915);
        setField(term27507, term27507.getClass(), "_accessorMethod", null);
        setField(term27507, term27507.getClass(), "_field", term27967);
        setField(term27507, term27507.getClass(), "_serializer", term28079);
        setField(term27507, term27507.getClass(), "_nullSerializer", term28239);
        Class<? extends Object> term30691 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
        Object[] term30976 = (Object[]) newArray("java.lang.Class", 0);
        Method term28719 = ((Class) term30691).getDeclaredMethod((String) "version", (Class[]) term30976);
        ((Method) term28719).setAccessible(false);
        HashMap term28993 = new HashMap();
        term28351 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term28443 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term28547 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term28665 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term28823 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        Object term28945 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        setField(term28351, term28351.getClass(), "_wrapperName", term28443);
        setField(term28351, term28351.getClass(), "_contextAnnotations", null);
        setField(term28351, term28351.getClass(), "_declaredType", term28547);
        setField(term28351, term28351.getClass(), "_member", term28665);
        setField(term28351, term28351.getClass(), "_accessorMethod", term28719);
        setField(term28351, term28351.getClass(), "_field", null);
        setField(term28351, term28351.getClass(), "_serializer", term28823);
        setField(term28351, term28351.getClass(), "_nullSerializer", term28945);
        setField(term28351, term28351.getClass(), "_internalSettings", term28993);
        term29085 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term29085, term29085.getClass(), "_simpleName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyName");
        Object[] args = new Object[2];
        args[0] = term28351;
        args[1] = term29085;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


