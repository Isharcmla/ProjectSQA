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

public class BeanPropertyWriter_init_599291025214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87979;
     Object term88371;
     Object term88545;
     Object term91059;
     Object term91081;
     Object term91086;
     Object term91102;

    public BeanPropertyWriter_init_599291025214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term87851 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object[] term87651 = (Object[]) newArray("java.lang.Class", 0);
        setField(term87851, term87851.getClass(), "_member", null);
        setField(term87851, term87851.getClass(), "_contextAnnotations", null);
        setField(term87851, term87851.getClass(), "_name", null);
        setField(term87851, term87851.getClass(), "_wrapperName", null);
        setField(term87851, term87851.getClass(), "_metadata", null);
        setField(term87851, term87851.getClass(), "_includeInViews", term87651);
        setField(term87851, term87851.getClass(), "_declaredType", null);
        setField(term87851, term87851.getClass(), "_serializer", null);
        setField(term87851, term87851.getClass(), "_dynamicSerializers", null);
        setField(term87851, term87851.getClass(), "_typeSerializer", null);
        setField(term87851, term87851.getClass(), "_cfgSerializationType", null);
        term87979 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term88071 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term88251 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term88071, term88071.getClass(), "_simpleName", "");
        setField(term87979, term87979.getClass(), "_name", term88071);
        setBooleanField(term87979, term87979.getClass(), "_forSerialization", false);
        setField(term87979, term87979.getClass(), "_ctorParameters", null);
        setField(term87979, term87979.getClass(), "_setters", null);
        setField(term88251, term88251.getClass(), "value", null);
        setField(term88251, term88251.getClass(), "next", null);
        setField(term87979, term87979.getClass(), "_fields", term88251);
        setField(term87979, term87979.getClass(), "_annotationIntrospector", null);
        Class<? extends Object> term91168 = Class.forName((String) "com.fasterxml.jackson.databind.deser.UnresolvedForwardReference");
        Object[] term91455 = (Object[]) newArray("java.lang.Class", 0);
        Method term88425 = ((Class) term91168).getDeclaredMethod((String) "getUnresolvedIds", (Class[]) term91455);
        ((Method) term88425).setAccessible(false);
        term88371 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term88371, term88371.getClass(), "_method", term88425);
        term88545 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.CalendarSerializer"));
        Class<? extends Object> term91497 = Class.forName((String) "java.util.stream.SpinedBuffer$OfDouble");
        Object[] term91701 = (Object[]) newArray("java.lang.Class", 0);
        Method term91065 = ((Class) term91497).getDeclaredMethod((String) "spliterator", (Class[]) term91701);
        ((Method) term91065).setAccessible(false);
        term91059 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term91060 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term91063 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term91064 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term91080 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.CalendarSerializer"));
        setField(term91060, term91060.getClass(), "_value", "");
        setField(term91060, term91060.getClass(), "_quotedUTF8Ref", null);
        setField(term91060, term91060.getClass(), "_unquotedUTF8Ref", null);
        setField(term91060, term91060.getClass(), "_quotedChars", null);
        setField(term91060, term91060.getClass(), "_jdkSerializeValue", null);
        setField(term91059, term91059.getClass(), "_name", term91060);
        setField(term91059, term91059.getClass(), "_wrapperName", null);
        setField(term91059, term91059.getClass(), "_declaredType", null);
        setField(term91059, term91059.getClass(), "_cfgSerializationType", null);
        setField(term91059, term91059.getClass(), "_nonTrivialBaseType", null);
        setField(term91059, term91059.getClass(), "_contextAnnotations", null);
        setField(term91063, term91063.getClass(), "_required", null);
        setField(term91063, term91063.getClass(), "_description", null);
        setField(term91063, term91063.getClass(), "_index", null);
        setField(term91063, term91063.getClass(), "_defaultValue", null);
        setField(term91059, term91059.getClass(), "_metadata", term91063);
        setField(term91059, term91059.getClass(), "_format", null);
        setField(term91064, term91064.getClass(), "_method", term91065);
        setField(term91064, term91064.getClass(), "_paramClasses", null);
        setField(term91064, term91064.getClass(), "_serialization", null);
        setField(term91064, term91064.getClass(), "_paramAnnotations", null);
        setField(term91064, term91064.getClass(), "_context", null);
        setField(term91064, term91064.getClass(), "_annotations", null);
        setField(term91059, term91059.getClass(), "_member", term91064);
        setField(term91059, term91059.getClass(), "_accessorMethod", term91065);
        setField(term91059, term91059.getClass(), "_field", null);
        setField(term91080, term91080.getClass(), "_useTimestamp", null);
        setField(term91080, term91080.getClass(), "_customFormat", null);
        setField(term91080, term91080.getClass(), "_handledType", null);
        setField(term91059, term91059.getClass(), "_serializer", term91080);
        setField(term91059, term91059.getClass(), "_nullSerializer", null);
        setField(term91059, term91059.getClass(), "_typeSerializer", null);
        setField(term91059, term91059.getClass(), "_dynamicSerializers", null);
        setBooleanField(term91059, term91059.getClass(), "_suppressNulls", false);
        setField(term91059, term91059.getClass(), "_suppressableValue", null);
        setField(term91059, term91059.getClass(), "_includeInViews", null);
        setField(term91059, term91059.getClass(), "_internalSettings", null);
        term91081 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term91082 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term91085 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term91081, term91081.getClass(), "_forSerialization", false);
        setField(term91081, term91081.getClass(), "_annotationIntrospector", null);
        setField(term91082, term91082.getClass(), "_simpleName", "");
        setField(term91082, term91082.getClass(), "_namespace", null);
        setField(term91082, term91082.getClass(), "_encodedSimple", null);
        setField(term91081, term91081.getClass(), "_name", term91082);
        setField(term91081, term91081.getClass(), "_internalName", null);
        setField(term91085, term91085.getClass(), "value", null);
        setField(term91085, term91085.getClass(), "next", null);
        setField(term91085, term91085.getClass(), "name", null);
        setBooleanField(term91085, term91085.getClass(), "isNameExplicit", false);
        setBooleanField(term91085, term91085.getClass(), "isVisible", false);
        setBooleanField(term91085, term91085.getClass(), "isMarkedIgnored", false);
        setField(term91081, term91081.getClass(), "_fields", term91085);
        setField(term91081, term91081.getClass(), "_ctorParameters", null);
        setField(term91081, term91081.getClass(), "_getters", null);
        setField(term91081, term91081.getClass(), "_setters", null);
        Class<? extends Object> term92171 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$MapReduceKeysToDoubleTask");
        Object[] term92481 = (Object[]) newArray("java.lang.Class", 0);
        Method term91087 = ((Class) term92171).getDeclaredMethod((String) "getRawResult", (Class[]) term92481);
        ((Method) term91087).setAccessible(false);
        term91086 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term91086, term91086.getClass(), "_method", term91087);
        setField(term91086, term91086.getClass(), "_paramClasses", null);
        setField(term91086, term91086.getClass(), "_serialization", null);
        setField(term91086, term91086.getClass(), "_paramAnnotations", null);
        setField(term91086, term91086.getClass(), "_context", null);
        setField(term91086, term91086.getClass(), "_annotations", null);
        term91102 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.CalendarSerializer"));
        setField(term91102, term91102.getClass(), "_useTimestamp", null);
        setField(term91102, term91102.getClass(), "_customFormat", null);
        setField(term91102, term91102.getClass(), "_handledType", null);
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
        args[0] = term87979;
        args[1] = term88371;
        args[2] = null;
        args[3] = null;
        args[4] = term88545;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term91059));
        assertTrue(recursiveEquals(term87979, term91081));
        assertTrue(recursiveEquals(term88371, term91086));
        assertTrue(recursiveEquals(term88545, term91102));
    }

};


