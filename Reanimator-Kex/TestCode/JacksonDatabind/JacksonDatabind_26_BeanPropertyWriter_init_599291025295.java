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

public class BeanPropertyWriter_init_599291025295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155541;
     Object term156053;
     Object term156173;
     Object term156317;
     Object term156417;
     Object term156454;
     Object term156462;
     Object term156468;
     Object term156469;
     Object term156470;
     Object term156471;

    public BeanPropertyWriter_init_599291025295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term154721 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term154837 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term154935 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term155035 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term155151 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.NumberSerializer"));
        Object term155293 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Single"));
        Object term155407 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term154721, term154721.getClass(), "_member", null);
        setField(term154721, term154721.getClass(), "_contextAnnotations", term154837);
        setField(term154721, term154721.getClass(), "_name", term154935);
        setField(term154721, term154721.getClass(), "_wrapperName", null);
        setField(term154721, term154721.getClass(), "_metadata", term155035);
        setField(term154721, term154721.getClass(), "_includeInViews", null);
        setField(term154721, term154721.getClass(), "_declaredType", null);
        setField(term154721, term154721.getClass(), "_serializer", term155151);
        setField(term154721, term154721.getClass(), "_dynamicSerializers", term155293);
        setField(term154721, term154721.getClass(), "_typeSerializer", null);
        setField(term154721, term154721.getClass(), "_cfgSerializationType", term155407);
        term155541 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term155633 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term155815 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term155935 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term155633, term155633.getClass(), "_simpleName", "");
        setField(term155541, term155541.getClass(), "_fullName", term155633);
        setField(term155541, term155541.getClass(), "_introspector", term155815);
        setField(term155541, term155541.getClass(), "_member", term155935);
        setField(term155541, term155541.getClass(), "_metadata", null);
        term156053 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term156173 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.CalendarSerializer"));
        term156317 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer"));
        term156417 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        term156454 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term156455 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term156458 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term156459 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term156460 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.CalendarSerializer"));
        Object term156461 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer"));
        setField(term156455, term156455.getClass(), "_value", "");
        setField(term156455, term156455.getClass(), "_quotedUTF8Ref", null);
        setField(term156455, term156455.getClass(), "_unquotedUTF8Ref", null);
        setField(term156455, term156455.getClass(), "_quotedChars", null);
        setField(term156455, term156455.getClass(), "_jdkSerializeValue", null);
        setField(term156454, term156454.getClass(), "_name", term156455);
        setField(term156454, term156454.getClass(), "_wrapperName", null);
        setField(term156454, term156454.getClass(), "_declaredType", null);
        setField(term156458, term156458.getClass(), "_keyType", null);
        setField(term156458, term156458.getClass(), "_valueType", null);
        setField(term156458, term156458.getClass(), "_canonicalName", null);
        setField(term156458, term156458.getClass(), "_class", null);
        setIntField(term156458, term156458.getClass(), "_hash", 0);
        setField(term156458, term156458.getClass(), "_valueHandler", null);
        setField(term156458, term156458.getClass(), "_typeHandler", null);
        setBooleanField(term156458, term156458.getClass(), "_asStatic", false);
        setField(term156454, term156454.getClass(), "_cfgSerializationType", term156458);
        setField(term156454, term156454.getClass(), "_nonTrivialBaseType", null);
        setField(term156454, term156454.getClass(), "_contextAnnotations", null);
        setField(term156454, term156454.getClass(), "_metadata", null);
        setField(term156454, term156454.getClass(), "_format", null);
        setField(term156459, term156459.getClass(), "_field", null);
        setField(term156459, term156459.getClass(), "_serialization", null);
        setField(term156459, term156459.getClass(), "_context", null);
        setField(term156459, term156459.getClass(), "_annotations", null);
        setField(term156454, term156454.getClass(), "_member", term156459);
        setField(term156454, term156454.getClass(), "_accessorMethod", null);
        setField(term156454, term156454.getClass(), "_field", null);
        setField(term156460, term156460.getClass(), "_useTimestamp", null);
        setField(term156460, term156460.getClass(), "_customFormat", null);
        setField(term156460, term156460.getClass(), "_handledType", null);
        setField(term156454, term156454.getClass(), "_serializer", term156460);
        setField(term156454, term156454.getClass(), "_nullSerializer", null);
        setField(term156461, term156461.getClass(), "_typePropertyName", null);
        setField(term156461, term156461.getClass(), "_idResolver", null);
        setField(term156461, term156461.getClass(), "_property", null);
        setField(term156454, term156454.getClass(), "_typeSerializer", term156461);
        setField(term156454, term156454.getClass(), "_dynamicSerializers", null);
        setBooleanField(term156454, term156454.getClass(), "_suppressNulls", false);
        setField(term156454, term156454.getClass(), "_suppressableValue", null);
        setField(term156454, term156454.getClass(), "_includeInViews", null);
        setField(term156454, term156454.getClass(), "_internalSettings", null);
        term156462 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term156463 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term156464 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term156465 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term156462, term156462.getClass(), "_introspector", term156463);
        setField(term156464, term156464.getClass(), "_method", null);
        setField(term156464, term156464.getClass(), "_paramClasses", null);
        setField(term156464, term156464.getClass(), "_serialization", null);
        setField(term156464, term156464.getClass(), "_paramAnnotations", null);
        setField(term156464, term156464.getClass(), "_context", null);
        setField(term156464, term156464.getClass(), "_annotations", null);
        setField(term156462, term156462.getClass(), "_member", term156464);
        setField(term156462, term156462.getClass(), "_metadata", null);
        setField(term156465, term156465.getClass(), "_simpleName", "");
        setField(term156465, term156465.getClass(), "_namespace", null);
        setField(term156465, term156465.getClass(), "_encodedSimple", null);
        setField(term156462, term156462.getClass(), "_fullName", term156465);
        setField(term156462, term156462.getClass(), "_inclusion", null);
        setField(term156462, term156462.getClass(), "_name", null);
        term156468 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term156468, term156468.getClass(), "_field", null);
        setField(term156468, term156468.getClass(), "_serialization", null);
        setField(term156468, term156468.getClass(), "_context", null);
        setField(term156468, term156468.getClass(), "_annotations", null);
        term156469 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.CalendarSerializer"));
        setField(term156469, term156469.getClass(), "_useTimestamp", null);
        setField(term156469, term156469.getClass(), "_customFormat", null);
        setField(term156469, term156469.getClass(), "_handledType", null);
        term156470 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer"));
        setField(term156470, term156470.getClass(), "_typePropertyName", null);
        setField(term156470, term156470.getClass(), "_idResolver", null);
        setField(term156470, term156470.getClass(), "_property", null);
        term156471 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term156471, term156471.getClass(), "_keyType", null);
        setField(term156471, term156471.getClass(), "_valueType", null);
        setField(term156471, term156471.getClass(), "_canonicalName", null);
        setField(term156471, term156471.getClass(), "_class", null);
        setIntField(term156471, term156471.getClass(), "_hash", 0);
        setField(term156471, term156471.getClass(), "_valueHandler", null);
        setField(term156471, term156471.getClass(), "_typeHandler", null);
        setBooleanField(term156471, term156471.getClass(), "_asStatic", false);
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
        args[0] = term155541;
        args[1] = term156053;
        args[2] = null;
        args[3] = null;
        args[4] = term156173;
        args[5] = term156317;
        args[6] = term156417;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term156454));
        assertTrue(recursiveEquals(term155541, term156462));
        assertTrue(recursiveEquals(term156053, term156468));
        assertTrue(recursiveEquals(term156173, term156469));
        assertTrue(recursiveEquals(term156317, term156470));
        assertTrue(recursiveEquals(term156417, term156471));
    }

};


