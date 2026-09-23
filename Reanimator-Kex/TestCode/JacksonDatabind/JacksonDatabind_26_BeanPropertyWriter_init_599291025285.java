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
import static com.fasterxml.jackson.databind.ser.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class BeanPropertyWriter_init_599291025285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145472;
     Object term145864;
     Object term146040;
     Object term146865;
     Object term146885;
     Object term146890;
     Object term146904;

    public BeanPropertyWriter_init_599291025285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term145220 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term145344 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.ByteBufferSerializer"));
        setField(term145220, term145220.getClass(), "_member", null);
        setField(term145220, term145220.getClass(), "_contextAnnotations", null);
        setField(term145220, term145220.getClass(), "_name", null);
        setField(term145220, term145220.getClass(), "_wrapperName", null);
        setField(term145220, term145220.getClass(), "_metadata", null);
        setField(term145220, term145220.getClass(), "_includeInViews", null);
        setField(term145220, term145220.getClass(), "_declaredType", null);
        setField(term145220, term145220.getClass(), "_serializer", term145344);
        setField(term145220, term145220.getClass(), "_dynamicSerializers", null);
        setField(term145220, term145220.getClass(), "_typeSerializer", null);
        setField(term145220, term145220.getClass(), "_cfgSerializationType", null);
        setField(term145220, term145220.getClass(), "_accessorMethod", null);
        term145472 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term145564 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term145746 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term145564, term145564.getClass(), "_simpleName", "");
        setField(term145472, term145472.getClass(), "_name", term145564);
        setBooleanField(term145472, term145472.getClass(), "_forSerialization", false);
        setField(term145472, term145472.getClass(), "_ctorParameters", null);
        setField(term145472, term145472.getClass(), "_setters", null);
        setField(term145472, term145472.getClass(), "_fields", null);
        setField(term145472, term145472.getClass(), "_annotationIntrospector", term145746);
        Class<? extends Object> term146905 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer");
        Field term145916 = ((Class) term146905).getDeclaredField((String) "instance");
        ((Field) term145916).setAccessible(false);
        term145864 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term145864, term145864.getClass(), "_field", term145916);
        term146040 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.CollectionSerializer"));
        Class<? extends Object> term146872 = Class.forName((String) "java.util.concurrent.CompletableFuture$Timeout");
        Field term146871 = ((Class) term146872).getDeclaredField((String) "f");
        ((Field) term146871).setAccessible(false);
        term146865 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term146866 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term146869 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term146870 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term146884 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.CollectionSerializer"));
        setField(term146866, term146866.getClass(), "_value", "");
        setField(term146866, term146866.getClass(), "_quotedUTF8Ref", null);
        setField(term146866, term146866.getClass(), "_unquotedUTF8Ref", null);
        setField(term146866, term146866.getClass(), "_quotedChars", null);
        setField(term146866, term146866.getClass(), "_jdkSerializeValue", null);
        setField(term146865, term146865.getClass(), "_name", term146866);
        setField(term146865, term146865.getClass(), "_wrapperName", null);
        setField(term146865, term146865.getClass(), "_declaredType", null);
        setField(term146865, term146865.getClass(), "_cfgSerializationType", null);
        setField(term146865, term146865.getClass(), "_nonTrivialBaseType", null);
        setField(term146865, term146865.getClass(), "_contextAnnotations", null);
        setField(term146869, term146869.getClass(), "_required", null);
        setField(term146869, term146869.getClass(), "_description", null);
        setField(term146869, term146869.getClass(), "_index", null);
        setField(term146869, term146869.getClass(), "_defaultValue", null);
        setField(term146865, term146865.getClass(), "_metadata", term146869);
        setField(term146865, term146865.getClass(), "_format", null);
        setField(term146870, term146870.getClass(), "_field", term146871);
        setField(term146870, term146870.getClass(), "_serialization", null);
        setField(term146870, term146870.getClass(), "_context", null);
        setField(term146870, term146870.getClass(), "_annotations", null);
        setField(term146865, term146865.getClass(), "_member", term146870);
        setField(term146865, term146865.getClass(), "_accessorMethod", null);
        setField(term146865, term146865.getClass(), "_field", term146871);
        setField(term146884, term146884.getClass(), "_elementType", null);
        setField(term146884, term146884.getClass(), "_property", null);
        setBooleanField(term146884, term146884.getClass(), "_staticTyping", false);
        setField(term146884, term146884.getClass(), "_unwrapSingle", null);
        setField(term146884, term146884.getClass(), "_valueTypeSerializer", null);
        setField(term146884, term146884.getClass(), "_elementSerializer", null);
        setField(term146884, term146884.getClass(), "_dynamicSerializers", null);
        setField(term146884, term146884.getClass(), "_handledType", null);
        setField(term146865, term146865.getClass(), "_serializer", term146884);
        setField(term146865, term146865.getClass(), "_nullSerializer", null);
        setField(term146865, term146865.getClass(), "_typeSerializer", null);
        setField(term146865, term146865.getClass(), "_dynamicSerializers", null);
        setBooleanField(term146865, term146865.getClass(), "_suppressNulls", false);
        setField(term146865, term146865.getClass(), "_suppressableValue", null);
        setField(term146865, term146865.getClass(), "_includeInViews", null);
        setField(term146865, term146865.getClass(), "_internalSettings", null);
        term146885 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term146886 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term146887 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setBooleanField(term146885, term146885.getClass(), "_forSerialization", false);
        setField(term146885, term146885.getClass(), "_annotationIntrospector", term146886);
        setField(term146887, term146887.getClass(), "_simpleName", "");
        setField(term146887, term146887.getClass(), "_namespace", null);
        setField(term146887, term146887.getClass(), "_encodedSimple", null);
        setField(term146885, term146885.getClass(), "_name", term146887);
        setField(term146885, term146885.getClass(), "_internalName", null);
        setField(term146885, term146885.getClass(), "_fields", null);
        setField(term146885, term146885.getClass(), "_ctorParameters", null);
        setField(term146885, term146885.getClass(), "_getters", null);
        setField(term146885, term146885.getClass(), "_setters", null);
        Class<? extends Object> term146892 = Class.forName((String) "java.lang.Short$ShortCache");
        Field term146891 = ((Class) term146892).getDeclaredField((String) "cache");
        ((Field) term146891).setAccessible(false);
        term146890 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term146890, term146890.getClass(), "_field", term146891);
        setField(term146890, term146890.getClass(), "_serialization", null);
        setField(term146890, term146890.getClass(), "_context", null);
        setField(term146890, term146890.getClass(), "_annotations", null);
        term146904 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.CollectionSerializer"));
        setField(term146904, term146904.getClass(), "_elementType", null);
        setField(term146904, term146904.getClass(), "_property", null);
        setBooleanField(term146904, term146904.getClass(), "_staticTyping", false);
        setField(term146904, term146904.getClass(), "_unwrapSingle", null);
        setField(term146904, term146904.getClass(), "_valueTypeSerializer", null);
        setField(term146904, term146904.getClass(), "_elementSerializer", null);
        setField(term146904, term146904.getClass(), "_dynamicSerializers", null);
        setField(term146904, term146904.getClass(), "_handledType", null);
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
        args[0] = term145472;
        args[1] = term145864;
        args[2] = null;
        args[3] = null;
        args[4] = term146040;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term146865));
        assertTrue(recursiveEquals(term145472, term146885));
        assertTrue(recursiveEquals(term145864, term146890));
        assertTrue(recursiveEquals(term146040, term146904));
    }

};


