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

public class BeanPropertyWriter_init_599291025221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94368;
     Object term94616;
     Object term94736;
     Object term94842;
     Object term96659;
     Object term96667;
     Object term96671;
     Object term96672;
     Object term96673;

    public BeanPropertyWriter_init_599291025221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term93748 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term93848 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object[] term93557 = (Object[]) newArray("java.lang.Class", 0);
        Object term93940 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term94100 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicLongSerializer"));
        Object term94240 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term93748, term93748.getClass(), "_member", null);
        setField(term93748, term93748.getClass(), "_contextAnnotations", null);
        setField(term93748, term93748.getClass(), "_name", null);
        setField(term93748, term93748.getClass(), "_wrapperName", null);
        setField(term93748, term93748.getClass(), "_metadata", term93848);
        setField(term93748, term93748.getClass(), "_includeInViews", term93557);
        setField(term93748, term93748.getClass(), "_declaredType", term93940);
        setField(term93748, term93748.getClass(), "_serializer", term94100);
        setField(term93748, term93748.getClass(), "_dynamicSerializers", term94240);
        setField(term93748, term93748.getClass(), "_typeSerializer", null);
        setField(term93748, term93748.getClass(), "_cfgSerializationType", null);
        term94368 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term94460 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term94460, term94460.getClass(), "_simpleName", "");
        setField(term94368, term94368.getClass(), "_name", term94460);
        setBooleanField(term94368, term94368.getClass(), "_forSerialization", true);
        setField(term94368, term94368.getClass(), "_getters", null);
        setField(term94368, term94368.getClass(), "_fields", null);
        setField(term94368, term94368.getClass(), "_annotationIntrospector", null);
        term94616 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term94736 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.FailingSerializer"));
        term94842 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term96659 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term96660 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term96663 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term96664 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term96665 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term96666 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.FailingSerializer"));
        setField(term96660, term96660.getClass(), "_value", "");
        setField(term96660, term96660.getClass(), "_quotedUTF8Ref", null);
        setField(term96660, term96660.getClass(), "_unquotedUTF8Ref", null);
        setField(term96660, term96660.getClass(), "_quotedChars", null);
        setField(term96660, term96660.getClass(), "_jdkSerializeValue", null);
        setField(term96659, term96659.getClass(), "_name", term96660);
        setField(term96659, term96659.getClass(), "_wrapperName", null);
        setField(term96659, term96659.getClass(), "_declaredType", null);
        setField(term96663, term96663.getClass(), "_elementType", null);
        setField(term96663, term96663.getClass(), "_canonicalName", null);
        setField(term96663, term96663.getClass(), "_class", null);
        setIntField(term96663, term96663.getClass(), "_hash", 0);
        setField(term96663, term96663.getClass(), "_valueHandler", null);
        setField(term96663, term96663.getClass(), "_typeHandler", null);
        setBooleanField(term96663, term96663.getClass(), "_asStatic", false);
        setField(term96659, term96659.getClass(), "_cfgSerializationType", term96663);
        setField(term96659, term96659.getClass(), "_nonTrivialBaseType", null);
        setField(term96659, term96659.getClass(), "_contextAnnotations", null);
        setField(term96664, term96664.getClass(), "_required", null);
        setField(term96664, term96664.getClass(), "_description", null);
        setField(term96664, term96664.getClass(), "_index", null);
        setField(term96664, term96664.getClass(), "_defaultValue", null);
        setField(term96659, term96659.getClass(), "_metadata", term96664);
        setField(term96659, term96659.getClass(), "_format", null);
        setField(term96665, term96665.getClass(), "_field", null);
        setField(term96665, term96665.getClass(), "_serialization", null);
        setField(term96665, term96665.getClass(), "_context", null);
        setField(term96665, term96665.getClass(), "_annotations", null);
        setField(term96659, term96659.getClass(), "_member", term96665);
        setField(term96659, term96659.getClass(), "_accessorMethod", null);
        setField(term96659, term96659.getClass(), "_field", null);
        setField(term96666, term96666.getClass(), "_msg", null);
        setField(term96666, term96666.getClass(), "_handledType", null);
        setField(term96659, term96659.getClass(), "_serializer", term96666);
        setField(term96659, term96659.getClass(), "_nullSerializer", null);
        setField(term96659, term96659.getClass(), "_typeSerializer", null);
        setField(term96659, term96659.getClass(), "_dynamicSerializers", null);
        setBooleanField(term96659, term96659.getClass(), "_suppressNulls", false);
        setField(term96659, term96659.getClass(), "_suppressableValue", null);
        setField(term96659, term96659.getClass(), "_includeInViews", null);
        setField(term96659, term96659.getClass(), "_internalSettings", null);
        term96667 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term96668 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setBooleanField(term96667, term96667.getClass(), "_forSerialization", true);
        setField(term96667, term96667.getClass(), "_annotationIntrospector", null);
        setField(term96668, term96668.getClass(), "_simpleName", "");
        setField(term96668, term96668.getClass(), "_namespace", null);
        setField(term96668, term96668.getClass(), "_encodedSimple", null);
        setField(term96667, term96667.getClass(), "_name", term96668);
        setField(term96667, term96667.getClass(), "_internalName", null);
        setField(term96667, term96667.getClass(), "_fields", null);
        setField(term96667, term96667.getClass(), "_ctorParameters", null);
        setField(term96667, term96667.getClass(), "_getters", null);
        setField(term96667, term96667.getClass(), "_setters", null);
        term96671 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term96671, term96671.getClass(), "_field", null);
        setField(term96671, term96671.getClass(), "_serialization", null);
        setField(term96671, term96671.getClass(), "_context", null);
        setField(term96671, term96671.getClass(), "_annotations", null);
        term96672 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.FailingSerializer"));
        setField(term96672, term96672.getClass(), "_msg", null);
        setField(term96672, term96672.getClass(), "_handledType", null);
        term96673 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term96673, term96673.getClass(), "_elementType", null);
        setField(term96673, term96673.getClass(), "_canonicalName", null);
        setField(term96673, term96673.getClass(), "_class", null);
        setIntField(term96673, term96673.getClass(), "_hash", 0);
        setField(term96673, term96673.getClass(), "_valueHandler", null);
        setField(term96673, term96673.getClass(), "_typeHandler", null);
        setBooleanField(term96673, term96673.getClass(), "_asStatic", false);
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
        args[0] = term94368;
        args[1] = term94616;
        args[2] = null;
        args[3] = null;
        args[4] = term94736;
        args[5] = null;
        args[6] = term94842;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term96659));
        assertTrue(recursiveEquals(term94368, term96667));
        assertTrue(recursiveEquals(term94616, term96671));
        assertTrue(recursiveEquals(term94736, term96672));
        assertTrue(recursiveEquals(term94842, term96673));
    }

};


