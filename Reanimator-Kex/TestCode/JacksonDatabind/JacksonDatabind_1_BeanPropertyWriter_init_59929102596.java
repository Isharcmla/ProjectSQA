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

public class BeanPropertyWriter_init_59929102596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23564;
     Object term23720;
     Object term23882;
     Object term25281;
     Object term25287;
     Object term25290;
     Object term25291;

    public BeanPropertyWriter_init_59929102596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term23332 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term23430 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term23332, term23332.getClass(), "_member", null);
        setField(term23332, term23332.getClass(), "_contextAnnotations", null);
        setField(term23332, term23332.getClass(), "_name", term23430);
        setField(term23332, term23332.getClass(), "_wrapperName", null);
        setField(term23332, term23332.getClass(), "_declaredType", null);
        setField(term23332, term23332.getClass(), "_serializer", null);
        setField(term23332, term23332.getClass(), "_dynamicSerializers", null);
        setField(term23332, term23332.getClass(), "_typeSerializer", null);
        setField(term23332, term23332.getClass(), "_cfgSerializationType", null);
        setBooleanField(term23332, term23332.getClass(), "_isRequired", false);
        term23564 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        setField(term23564, term23564.getClass(), "_name", "");
        setField(term23564, term23564.getClass(), "_introspector", null);
        term23720 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term23882 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$CalendarKeySerializer"));
        term25281 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term25282 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term25283 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term25286 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$CalendarKeySerializer"));
        setField(term25282, term25282.getClass(), "_field", null);
        setField(term25282, term25282.getClass(), "_serialization", null);
        setField(term25282, term25282.getClass(), "_annotations", null);
        setField(term25281, term25281.getClass(), "_member", term25282);
        setField(term25281, term25281.getClass(), "_contextAnnotations", null);
        setField(term25281, term25281.getClass(), "_declaredType", null);
        setField(term25281, term25281.getClass(), "_accessorMethod", null);
        setField(term25281, term25281.getClass(), "_field", null);
        setField(term25281, term25281.getClass(), "_internalSettings", null);
        setField(term25283, term25283.getClass(), "_value", "");
        setField(term25283, term25283.getClass(), "_quotedUTF8Ref", null);
        setField(term25283, term25283.getClass(), "_unquotedUTF8Ref", null);
        setField(term25283, term25283.getClass(), "_quotedChars", null);
        setField(term25283, term25283.getClass(), "_jdkSerializeValue", null);
        setField(term25281, term25281.getClass(), "_name", term25283);
        setField(term25281, term25281.getClass(), "_wrapperName", null);
        setField(term25281, term25281.getClass(), "_cfgSerializationType", null);
        setField(term25286, term25286.getClass(), "_handledType", null);
        setField(term25281, term25281.getClass(), "_serializer", term25286);
        setField(term25281, term25281.getClass(), "_nullSerializer", null);
        setField(term25281, term25281.getClass(), "_dynamicSerializers", null);
        setBooleanField(term25281, term25281.getClass(), "_suppressNulls", false);
        setField(term25281, term25281.getClass(), "_suppressableValue", null);
        setField(term25281, term25281.getClass(), "_includeInViews", null);
        setField(term25281, term25281.getClass(), "_typeSerializer", null);
        setField(term25281, term25281.getClass(), "_nonTrivialBaseType", null);
        setBooleanField(term25281, term25281.getClass(), "_isRequired", false);
        term25287 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        setField(term25287, term25287.getClass(), "_introspector", null);
        setField(term25287, term25287.getClass(), "_member", null);
        setField(term25287, term25287.getClass(), "_name", "");
        term25290 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term25290, term25290.getClass(), "_field", null);
        setField(term25290, term25290.getClass(), "_serialization", null);
        setField(term25290, term25290.getClass(), "_annotations", null);
        term25291 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$CalendarKeySerializer"));
        setField(term25291, term25291.getClass(), "_handledType", null);
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
        args[0] = term23564;
        args[1] = term23720;
        args[2] = null;
        args[3] = null;
        args[4] = term23882;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term25281));
        assertTrue(recursiveEquals(term23564, term25287));
        assertTrue(recursiveEquals(term23720, term25290));
        assertTrue(recursiveEquals(term23882, term25291));
    }

};
