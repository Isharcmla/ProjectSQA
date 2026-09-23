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

public class BeanPropertyWriter_init_599291025264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125470;
     Object term125864;
     Object term126034;
     Object term126132;

    public BeanPropertyWriter_init_599291025264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term124890 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term125020 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Object term125118 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term125210 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term125336 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer"));
        setField(term124890, term124890.getClass(), "_member", term125020);
        setField(term124890, term124890.getClass(), "_contextAnnotations", null);
        setField(term124890, term124890.getClass(), "_name", term125118);
        setField(term124890, term124890.getClass(), "_wrapperName", null);
        setField(term124890, term124890.getClass(), "_metadata", null);
        setField(term124890, term124890.getClass(), "_includeInViews", null);
        setField(term124890, term124890.getClass(), "_declaredType", term125210);
        setField(term124890, term124890.getClass(), "_serializer", term125336);
        setField(term124890, term124890.getClass(), "_dynamicSerializers", null);
        setField(term124890, term124890.getClass(), "_typeSerializer", null);
        setField(term124890, term124890.getClass(), "_cfgSerializationType", null);
        term125470 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term125562 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term125744 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term125562, term125562.getClass(), "_simpleName", "");
        setField(term125470, term125470.getClass(), "_fullName", term125562);
        setField(term125470, term125470.getClass(), "_introspector", term125744);
        setField(term125470, term125470.getClass(), "_member", null);
        setField(term125470, term125470.getClass(), "_metadata", null);
        Class<? extends Object> term128770 = Class.forName((String) "com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
        Class<? extends Object> term129047 = Class.forName((String) "java.lang.Object");
        Class<? extends Object> term129090 = Class.forName((String) "com.fasterxml.jackson.core.JsonGenerator");
        Class<? extends Object> term129142 = Class.forName((String) "com.fasterxml.jackson.databind.SerializerProvider");
        Object[] term129143 = (Object[]) newArray("java.lang.Class", 3);
        setElement(term129143, 0, term129047);
        setElement(term129143, 1, term129090);
        setElement(term129143, 2, term129142);
        Method term125918 = ((Class) term128770).getDeclaredMethod((String) "serializeAsPlaceholder", (Class[]) term129143);
        ((Method) term125918).setAccessible(false);
        term125864 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term125864, term125864.getClass(), "_method", term125918);
        term126034 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term126132 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
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
        args[0] = term125470;
        args[1] = term125864;
        args[2] = term126034;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = term126132;
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


