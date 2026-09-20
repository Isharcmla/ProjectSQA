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

public class BeanPropertyWriter_init_599291025126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42727;
     Object term43031;
     Object term43147;
     Object term43257;
     Object term44928;
     Object term44935;
     Object term44939;
     Object term44940;
     Object term44941;

    public BeanPropertyWriter_init_599291025126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term42593 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        setField(term42593, term42593.getClass(), "_member", null);
        setField(term42593, term42593.getClass(), "_contextAnnotations", null);
        setField(term42593, term42593.getClass(), "_name", null);
        setField(term42593, term42593.getClass(), "_wrapperName", null);
        setField(term42593, term42593.getClass(), "_declaredType", null);
        setField(term42593, term42593.getClass(), "_serializer", null);
        setField(term42593, term42593.getClass(), "_dynamicSerializers", null);
        setField(term42593, term42593.getClass(), "_typeSerializer", null);
        setField(term42593, term42593.getClass(), "_cfgSerializationType", null);
        setBooleanField(term42593, term42593.getClass(), "_isRequired", false);
        term42727 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term42913 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term42727, term42727.getClass(), "_name", "");
        setField(term42727, term42727.getClass(), "_introspector", term42913);
        setField(term42727, term42727.getClass(), "_member", null);
        term43031 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term43147 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term43257 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.RawSerializer"));
        term44928 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term44929 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term44930 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term44931 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term44934 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.RawSerializer"));
        setField(term44929, term44929.getClass(), "_field", null);
        setField(term44929, term44929.getClass(), "_serialization", null);
        setField(term44929, term44929.getClass(), "_annotations", null);
        setField(term44928, term44928.getClass(), "_member", term44929);
        setField(term44930, term44930.getClass(), "_annotations", null);
        setField(term44928, term44928.getClass(), "_contextAnnotations", term44930);
        setField(term44928, term44928.getClass(), "_declaredType", null);
        setField(term44928, term44928.getClass(), "_accessorMethod", null);
        setField(term44928, term44928.getClass(), "_field", null);
        setField(term44928, term44928.getClass(), "_internalSettings", null);
        setField(term44931, term44931.getClass(), "_value", "");
        setField(term44931, term44931.getClass(), "_quotedUTF8Ref", null);
        setField(term44931, term44931.getClass(), "_unquotedUTF8Ref", null);
        setField(term44931, term44931.getClass(), "_quotedChars", null);
        setField(term44931, term44931.getClass(), "_jdkSerializeValue", null);
        setField(term44928, term44928.getClass(), "_name", term44931);
        setField(term44928, term44928.getClass(), "_wrapperName", null);
        setField(term44928, term44928.getClass(), "_cfgSerializationType", null);
        setField(term44934, term44934.getClass(), "_handledType", null);
        setField(term44928, term44928.getClass(), "_serializer", term44934);
        setField(term44928, term44928.getClass(), "_nullSerializer", null);
        setField(term44928, term44928.getClass(), "_dynamicSerializers", null);
        setBooleanField(term44928, term44928.getClass(), "_suppressNulls", false);
        setField(term44928, term44928.getClass(), "_suppressableValue", null);
        setField(term44928, term44928.getClass(), "_includeInViews", null);
        setField(term44928, term44928.getClass(), "_typeSerializer", null);
        setField(term44928, term44928.getClass(), "_nonTrivialBaseType", null);
        setBooleanField(term44928, term44928.getClass(), "_isRequired", false);
        term44935 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term44936 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term44935, term44935.getClass(), "_introspector", term44936);
        setField(term44935, term44935.getClass(), "_member", null);
        setField(term44935, term44935.getClass(), "_name", "");
        term44939 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term44939, term44939.getClass(), "_field", null);
        setField(term44939, term44939.getClass(), "_serialization", null);
        setField(term44939, term44939.getClass(), "_annotations", null);
        term44940 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term44940, term44940.getClass(), "_annotations", null);
        term44941 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.RawSerializer"));
        setField(term44941, term44941.getClass(), "_handledType", null);
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
        args[0] = term42727;
        args[1] = term43031;
        args[2] = term43147;
        args[3] = null;
        args[4] = term43257;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term44928));
        assertTrue(recursiveEquals(term42727, term44935));
        assertTrue(recursiveEquals(term43031, term44939));
        assertTrue(recursiveEquals(term43147, term44940));
        assertTrue(recursiveEquals(term43257, term44941));
    }

};
