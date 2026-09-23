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

public class BeanPropertyWriter_init_599291025297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156849;
     Object term157239;
     Object term157387;

    public BeanPropertyWriter_init_599291025297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term156721 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object[] term156488 = (Object[]) newArray("java.lang.Class", 0);
        setField(term156721, term156721.getClass(), "_member", null);
        setField(term156721, term156721.getClass(), "_contextAnnotations", null);
        setField(term156721, term156721.getClass(), "_name", null);
        setField(term156721, term156721.getClass(), "_wrapperName", null);
        setField(term156721, term156721.getClass(), "_metadata", null);
        setField(term156721, term156721.getClass(), "_includeInViews", term156488);
        setField(term156721, term156721.getClass(), "_declaredType", null);
        setField(term156721, term156721.getClass(), "_serializer", null);
        setField(term156721, term156721.getClass(), "_dynamicSerializers", null);
        setField(term156721, term156721.getClass(), "_typeSerializer", null);
        setField(term156721, term156721.getClass(), "_cfgSerializationType", null);
        setField(term156721, term156721.getClass(), "_accessorMethod", null);
        term156849 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term156941 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term157121 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(term156941, term156941.getClass(), "_simpleName", "");
        setField(term156849, term156849.getClass(), "_name", term156941);
        setBooleanField(term156849, term156849.getClass(), "_forSerialization", false);
        setField(term156849, term156849.getClass(), "_ctorParameters", null);
        setField(term156849, term156849.getClass(), "_setters", null);
        setField(term156849, term156849.getClass(), "_fields", null);
        setField(term156849, term156849.getClass(), "_annotationIntrospector", term157121);
        Class<? extends Object> term158286 = Class.forName((String) "java.util.stream.LongPipeline$8$1");
        Field term157291 = ((Class) term158286).getDeclaredField((String) "this$1");
        ((Field) term157291).setAccessible(false);
        term157239 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term157239, term157239.getClass(), "_field", term157291);
        term157387 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
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
        args[0] = term156849;
        args[1] = term157239;
        args[2] = null;
        args[3] = term157387;
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


