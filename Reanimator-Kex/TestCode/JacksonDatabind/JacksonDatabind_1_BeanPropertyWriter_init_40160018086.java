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

public class BeanPropertyWriter_init_40160018086 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12186;
     Object term12962;

    public BeanPropertyWriter_init_40160018086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17680 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.JdkDeserializers$LocaleDeserializer");
        Class<? extends Object> term18029 = Class.forName((String) "java.lang.String");
        Class<? extends Object> term18085 = Class.forName((String) "com.fasterxml.jackson.databind.DeserializationContext");
        Object[] term18086 = (Object[]) newArray("java.lang.Class", 2);
        setElement(term18086, 0, term18029);
        setElement(term18086, 1, term18085);
        Method term12022 = ((Class) term17680).getDeclaredMethod((String) "_deserialize", (Class[]) term18086);
        ((Method) term12022).setAccessible(false);
        Class<? extends Object> term18295 = Class.forName((String) "kex.java.lang.Character$UnicodeScript");
        Field term12074 = ((Class) term18295).getDeclaredField((String) "LYCIAN");
        ((Field) term12074).setAccessible(false);
        Object term11442 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term11540 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term11632 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term11752 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term11868 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term12444 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term11442, term11442.getClass(), "_name", term11540);
        setField(term11442, term11442.getClass(), "_wrapperName", term11632);
        setField(term11442, term11442.getClass(), "_member", term11752);
        setField(term11442, term11442.getClass(), "_contextAnnotations", term11868);
        setField(term11442, term11442.getClass(), "_declaredType", term12444);
        setField(term11442, term11442.getClass(), "_accessorMethod", term12022);
        setField(term11442, term11442.getClass(), "_field", term12074);
        setField(term11442, term11442.getClass(), "_serializer", null);
        setField(term11442, term11442.getClass(), "_nullSerializer", null);
        Class<? extends Object> term18509 = Class.forName((String) "com.fasterxml.jackson.databind.node.ObjectNode");
        Object[] term18704 = (Object[]) newArray("java.lang.Class", 0);
        Method term12498 = ((Class) term18509).getDeclaredMethod((String) "size", (Class[]) term18704);
        ((Method) term12498).setAccessible(false);
        Class<? extends Object> term18706 = Class.forName((String) "java.lang.invoke.VarHandleShorts$FieldInstanceReadOnly");
        Field term12550 = ((Class) term18706).getDeclaredField((String) "receiverType");
        ((Field) term12550).setAccessible(false);
        HashMap term12864 = new HashMap();
        term12186 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term12278 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term12394 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term12698 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$FileSerializer"));
        Object term12816 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.EnumSetSerializer"));
        setField(term12186, term12186.getClass(), "_wrapperName", term12278);
        setField(term12186, term12186.getClass(), "_member", null);
        setField(term12186, term12186.getClass(), "_contextAnnotations", term12394);
        setField(term12186, term12186.getClass(), "_declaredType", term12444);
        setField(term12186, term12186.getClass(), "_accessorMethod", term12498);
        setField(term12186, term12186.getClass(), "_field", term12550);
        setField(term12186, term12186.getClass(), "_serializer", term12698);
        setField(term12186, term12186.getClass(), "_nullSerializer", term12816);
        setField(term12186, term12186.getClass(), "_internalSettings", term12864);
        term12962 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.io.SerializedString");
        Object[] args = new Object[2];
        args[0] = term12186;
        args[1] = term12962;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};
