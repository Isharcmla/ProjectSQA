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

public class BeanPropertyWriter_init_599291025143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55497;
     Object term55655;
     Object term55773;
     Object term55871;
     Object term55967;
     Object term55974;
     Object term55977;
     Object term55978;
     Object term55979;

    public BeanPropertyWriter_init_599291025143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term55149 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term55265 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term55363 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term55149, term55149.getClass(), "_member", null);
        setField(term55149, term55149.getClass(), "_contextAnnotations", term55265);
        setField(term55149, term55149.getClass(), "_name", term55363);
        setField(term55149, term55149.getClass(), "_wrapperName", null);
        setField(term55149, term55149.getClass(), "_declaredType", null);
        setField(term55149, term55149.getClass(), "_serializer", null);
        setField(term55149, term55149.getClass(), "_dynamicSerializers", null);
        setField(term55149, term55149.getClass(), "_typeSerializer", null);
        setField(term55149, term55149.getClass(), "_cfgSerializationType", null);
        setBooleanField(term55149, term55149.getClass(), "_isRequired", false);
        term55497 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        setField(term55497, term55497.getClass(), "_name", "");
        setField(term55497, term55497.getClass(), "_introspector", null);
        term55655 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        term55773 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.BooleanSerializer"));
        term55871 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term55967 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term55968 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term55969 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term55972 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term55973 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.BooleanSerializer"));
        setField(term55968, term55968.getClass(), "_method", null);
        setField(term55968, term55968.getClass(), "_paramClasses", null);
        setField(term55968, term55968.getClass(), "_serialization", null);
        setField(term55968, term55968.getClass(), "_paramAnnotations", null);
        setField(term55968, term55968.getClass(), "_annotations", null);
        setField(term55967, term55967.getClass(), "_member", term55968);
        setField(term55967, term55967.getClass(), "_contextAnnotations", null);
        setField(term55967, term55967.getClass(), "_declaredType", null);
        setField(term55967, term55967.getClass(), "_accessorMethod", null);
        setField(term55967, term55967.getClass(), "_field", null);
        setField(term55967, term55967.getClass(), "_internalSettings", null);
        setField(term55969, term55969.getClass(), "_value", "");
        setField(term55969, term55969.getClass(), "_quotedUTF8Ref", null);
        setField(term55969, term55969.getClass(), "_unquotedUTF8Ref", null);
        setField(term55969, term55969.getClass(), "_quotedChars", null);
        setField(term55969, term55969.getClass(), "_jdkSerializeValue", null);
        setField(term55967, term55967.getClass(), "_name", term55969);
        setField(term55967, term55967.getClass(), "_wrapperName", null);
        setField(term55972, term55972.getClass(), "_typeParameters", null);
        setField(term55972, term55972.getClass(), "_typeNames", null);
        setField(term55972, term55972.getClass(), "_canonicalName", null);
        setField(term55972, term55972.getClass(), "_class", null);
        setIntField(term55972, term55972.getClass(), "_hashCode", 0);
        setField(term55972, term55972.getClass(), "_valueHandler", null);
        setField(term55972, term55972.getClass(), "_typeHandler", null);
        setBooleanField(term55972, term55972.getClass(), "_asStatic", false);
        setField(term55967, term55967.getClass(), "_cfgSerializationType", term55972);
        setBooleanField(term55973, term55973.getClass(), "_forPrimitive", false);
        setField(term55973, term55973.getClass(), "_handledType", null);
        setField(term55967, term55967.getClass(), "_serializer", term55973);
        setField(term55967, term55967.getClass(), "_nullSerializer", null);
        setField(term55967, term55967.getClass(), "_dynamicSerializers", null);
        setBooleanField(term55967, term55967.getClass(), "_suppressNulls", false);
        setField(term55967, term55967.getClass(), "_suppressableValue", null);
        setField(term55967, term55967.getClass(), "_includeInViews", null);
        setField(term55967, term55967.getClass(), "_typeSerializer", null);
        setField(term55967, term55967.getClass(), "_nonTrivialBaseType", null);
        setBooleanField(term55967, term55967.getClass(), "_isRequired", false);
        term55974 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        setField(term55974, term55974.getClass(), "_introspector", null);
        setField(term55974, term55974.getClass(), "_member", null);
        setField(term55974, term55974.getClass(), "_name", "");
        term55977 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term55977, term55977.getClass(), "_method", null);
        setField(term55977, term55977.getClass(), "_paramClasses", null);
        setField(term55977, term55977.getClass(), "_serialization", null);
        setField(term55977, term55977.getClass(), "_paramAnnotations", null);
        setField(term55977, term55977.getClass(), "_annotations", null);
        term55978 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.BooleanSerializer"));
        setBooleanField(term55978, term55978.getClass(), "_forPrimitive", false);
        setField(term55978, term55978.getClass(), "_handledType", null);
        term55979 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term55979, term55979.getClass(), "_typeParameters", null);
        setField(term55979, term55979.getClass(), "_typeNames", null);
        setField(term55979, term55979.getClass(), "_canonicalName", null);
        setField(term55979, term55979.getClass(), "_class", null);
        setIntField(term55979, term55979.getClass(), "_hashCode", 0);
        setField(term55979, term55979.getClass(), "_valueHandler", null);
        setField(term55979, term55979.getClass(), "_typeHandler", null);
        setBooleanField(term55979, term55979.getClass(), "_asStatic", false);
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
        args[0] = term55497;
        args[1] = term55655;
        args[2] = null;
        args[3] = null;
        args[4] = term55773;
        args[5] = null;
        args[6] = term55871;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term55967));
        assertTrue(recursiveEquals(term55497, term55974));
        assertTrue(recursiveEquals(term55655, term55977));
        assertTrue(recursiveEquals(term55773, term55978));
        assertTrue(recursiveEquals(term55871, term55979));
    }

};
