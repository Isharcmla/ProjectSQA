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

public class BeanPropertyWriter_init_599291025137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34763;
     Object term35013;
     Object term35133;
     Object term35231;
     Object term35409;
     Object term35417;
     Object term35421;
     Object term35422;
     Object term35423;

    public BeanPropertyWriter_init_599291025137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term34635 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        setField(term34635, term34635.getClass(), "_member", null);
        setField(term34635, term34635.getClass(), "_contextAnnotations", null);
        setField(term34635, term34635.getClass(), "_name", null);
        setField(term34635, term34635.getClass(), "_wrapperName", null);
        setField(term34635, term34635.getClass(), "_metadata", null);
        setField(term34635, term34635.getClass(), "_includeInViews", null);
        setField(term34635, term34635.getClass(), "_declaredType", null);
        setField(term34635, term34635.getClass(), "_serializer", null);
        setField(term34635, term34635.getClass(), "_dynamicSerializers", null);
        setField(term34635, term34635.getClass(), "_typeSerializer", null);
        setField(term34635, term34635.getClass(), "_cfgSerializationType", null);
        term34763 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term34855 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term34855, term34855.getClass(), "_simpleName", "");
        setField(term34763, term34763.getClass(), "_name", term34855);
        setBooleanField(term34763, term34763.getClass(), "_forSerialization", false);
        setField(term34763, term34763.getClass(), "_ctorParameters", null);
        setField(term34763, term34763.getClass(), "_setters", null);
        setField(term34763, term34763.getClass(), "_fields", null);
        setField(term34763, term34763.getClass(), "_annotationIntrospector", null);
        term35013 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        term35133 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.CalendarSerializer"));
        term35231 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term35409 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term35410 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term35413 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term35414 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term35415 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term35416 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.CalendarSerializer"));
        setField(term35410, term35410.getClass(), "_value", "");
        setField(term35410, term35410.getClass(), "_quotedUTF8Ref", null);
        setField(term35410, term35410.getClass(), "_unquotedUTF8Ref", null);
        setField(term35410, term35410.getClass(), "_quotedChars", null);
        setField(term35410, term35410.getClass(), "_jdkSerializeValue", null);
        setField(term35409, term35409.getClass(), "_name", term35410);
        setField(term35409, term35409.getClass(), "_wrapperName", null);
        setField(term35409, term35409.getClass(), "_declaredType", null);
        setField(term35413, term35413.getClass(), "_typeParametersFor", null);
        setField(term35413, term35413.getClass(), "_typeParameters", null);
        setField(term35413, term35413.getClass(), "_typeNames", null);
        setField(term35413, term35413.getClass(), "_canonicalName", null);
        setField(term35413, term35413.getClass(), "_class", null);
        setIntField(term35413, term35413.getClass(), "_hash", 0);
        setField(term35413, term35413.getClass(), "_valueHandler", null);
        setField(term35413, term35413.getClass(), "_typeHandler", null);
        setBooleanField(term35413, term35413.getClass(), "_asStatic", false);
        setField(term35409, term35409.getClass(), "_cfgSerializationType", term35413);
        setField(term35409, term35409.getClass(), "_nonTrivialBaseType", null);
        setField(term35409, term35409.getClass(), "_contextAnnotations", null);
        setField(term35414, term35414.getClass(), "_required", null);
        setField(term35414, term35414.getClass(), "_description", null);
        setField(term35414, term35414.getClass(), "_index", null);
        setField(term35414, term35414.getClass(), "_defaultValue", null);
        setField(term35409, term35409.getClass(), "_metadata", term35414);
        setField(term35409, term35409.getClass(), "_format", null);
        setField(term35415, term35415.getClass(), "_method", null);
        setField(term35415, term35415.getClass(), "_paramClasses", null);
        setField(term35415, term35415.getClass(), "_serialization", null);
        setField(term35415, term35415.getClass(), "_paramAnnotations", null);
        setField(term35415, term35415.getClass(), "_context", null);
        setField(term35415, term35415.getClass(), "_annotations", null);
        setField(term35409, term35409.getClass(), "_member", term35415);
        setField(term35409, term35409.getClass(), "_accessorMethod", null);
        setField(term35409, term35409.getClass(), "_field", null);
        setField(term35416, term35416.getClass(), "_useTimestamp", null);
        setField(term35416, term35416.getClass(), "_customFormat", null);
        setField(term35416, term35416.getClass(), "_handledType", null);
        setField(term35409, term35409.getClass(), "_serializer", term35416);
        setField(term35409, term35409.getClass(), "_nullSerializer", null);
        setField(term35409, term35409.getClass(), "_typeSerializer", null);
        setField(term35409, term35409.getClass(), "_dynamicSerializers", null);
        setBooleanField(term35409, term35409.getClass(), "_suppressNulls", false);
        setField(term35409, term35409.getClass(), "_suppressableValue", null);
        setField(term35409, term35409.getClass(), "_includeInViews", null);
        setField(term35409, term35409.getClass(), "_internalSettings", null);
        term35417 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term35418 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setBooleanField(term35417, term35417.getClass(), "_forSerialization", false);
        setField(term35417, term35417.getClass(), "_annotationIntrospector", null);
        setField(term35418, term35418.getClass(), "_simpleName", "");
        setField(term35418, term35418.getClass(), "_namespace", null);
        setField(term35418, term35418.getClass(), "_encodedSimple", null);
        setField(term35417, term35417.getClass(), "_name", term35418);
        setField(term35417, term35417.getClass(), "_internalName", null);
        setField(term35417, term35417.getClass(), "_fields", null);
        setField(term35417, term35417.getClass(), "_ctorParameters", null);
        setField(term35417, term35417.getClass(), "_getters", null);
        setField(term35417, term35417.getClass(), "_setters", null);
        term35421 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term35421, term35421.getClass(), "_method", null);
        setField(term35421, term35421.getClass(), "_paramClasses", null);
        setField(term35421, term35421.getClass(), "_serialization", null);
        setField(term35421, term35421.getClass(), "_paramAnnotations", null);
        setField(term35421, term35421.getClass(), "_context", null);
        setField(term35421, term35421.getClass(), "_annotations", null);
        term35422 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.CalendarSerializer"));
        setField(term35422, term35422.getClass(), "_useTimestamp", null);
        setField(term35422, term35422.getClass(), "_customFormat", null);
        setField(term35422, term35422.getClass(), "_handledType", null);
        term35423 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term35423, term35423.getClass(), "_typeParametersFor", null);
        setField(term35423, term35423.getClass(), "_typeParameters", null);
        setField(term35423, term35423.getClass(), "_typeNames", null);
        setField(term35423, term35423.getClass(), "_canonicalName", null);
        setField(term35423, term35423.getClass(), "_class", null);
        setIntField(term35423, term35423.getClass(), "_hash", 0);
        setField(term35423, term35423.getClass(), "_valueHandler", null);
        setField(term35423, term35423.getClass(), "_typeHandler", null);
        setBooleanField(term35423, term35423.getClass(), "_asStatic", false);
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
        args[0] = term34763;
        args[1] = term35013;
        args[2] = null;
        args[3] = null;
        args[4] = term35133;
        args[5] = null;
        args[6] = term35231;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term35409));
        assertTrue(recursiveEquals(term34763, term35417));
        assertTrue(recursiveEquals(term35013, term35421));
        assertTrue(recursiveEquals(term35133, term35422));
        assertTrue(recursiveEquals(term35231, term35423));
    }

};


