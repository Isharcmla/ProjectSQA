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

public class BeanPropertyWriter_init_599291025323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181938;
     Object term182606;
     Object term182758;
     Object term182921;
     Object term182928;
     Object term182935;
     Object term182936;

    public BeanPropertyWriter_init_599291025323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term181810 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        setField(term181810, term181810.getClass(), "_member", null);
        setField(term181810, term181810.getClass(), "_contextAnnotations", null);
        setField(term181810, term181810.getClass(), "_name", null);
        setField(term181810, term181810.getClass(), "_wrapperName", null);
        setField(term181810, term181810.getClass(), "_metadata", null);
        setField(term181810, term181810.getClass(), "_includeInViews", null);
        setField(term181810, term181810.getClass(), "_declaredType", null);
        setField(term181810, term181810.getClass(), "_serializer", null);
        term181938 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term182030 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term182210 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term182328 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term182472 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term182030, term182030.getClass(), "_simpleName", "");
        setField(term181938, term181938.getClass(), "_name", term182030);
        setBooleanField(term181938, term181938.getClass(), "_forSerialization", false);
        setField(term181938, term181938.getClass(), "_ctorParameters", null);
        setField(term181938, term181938.getClass(), "_setters", null);
        setField(term182210, term182210.getClass(), "value", term182328);
        setField(term182210, term182210.getClass(), "next", null);
        setField(term181938, term181938.getClass(), "_fields", term182210);
        setField(term181938, term181938.getClass(), "_annotationIntrospector", term182472);
        term182606 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember"));
        term182758 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.NumberSerializers$DoubleSerializer"));
        term182921 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term182922 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term182925 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term182926 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember"));
        Object term182927 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.NumberSerializers$DoubleSerializer"));
        setField(term182922, term182922.getClass(), "_value", "");
        setField(term182922, term182922.getClass(), "_quotedUTF8Ref", null);
        setField(term182922, term182922.getClass(), "_unquotedUTF8Ref", null);
        setField(term182922, term182922.getClass(), "_quotedChars", null);
        setField(term182922, term182922.getClass(), "_jdkSerializeValue", null);
        setField(term182921, term182921.getClass(), "_name", term182922);
        setField(term182921, term182921.getClass(), "_wrapperName", null);
        setField(term182921, term182921.getClass(), "_declaredType", null);
        setField(term182921, term182921.getClass(), "_cfgSerializationType", null);
        setField(term182921, term182921.getClass(), "_nonTrivialBaseType", null);
        setField(term182921, term182921.getClass(), "_contextAnnotations", null);
        setField(term182925, term182925.getClass(), "_required", null);
        setField(term182925, term182925.getClass(), "_description", null);
        setField(term182925, term182925.getClass(), "_index", null);
        setField(term182925, term182925.getClass(), "_defaultValue", null);
        setField(term182921, term182921.getClass(), "_metadata", term182925);
        setField(term182921, term182921.getClass(), "_format", null);
        setField(term182926, term182926.getClass(), "_declaringClass", null);
        setField(term182926, term182926.getClass(), "_rawType", null);
        setField(term182926, term182926.getClass(), "_name", null);
        setField(term182926, term182926.getClass(), "_context", null);
        setField(term182926, term182926.getClass(), "_annotations", null);
        setField(term182921, term182921.getClass(), "_member", term182926);
        setField(term182921, term182921.getClass(), "_accessorMethod", null);
        setField(term182921, term182921.getClass(), "_field", null);
        setField(term182927, term182927.getClass(), "_numberType", null);
        setField(term182927, term182927.getClass(), "_schemaType", null);
        setBooleanField(term182927, term182927.getClass(), "_isInt", false);
        setField(term182927, term182927.getClass(), "_handledType", null);
        setField(term182921, term182921.getClass(), "_serializer", term182927);
        setField(term182921, term182921.getClass(), "_nullSerializer", null);
        setField(term182921, term182921.getClass(), "_typeSerializer", null);
        setField(term182921, term182921.getClass(), "_dynamicSerializers", null);
        setBooleanField(term182921, term182921.getClass(), "_suppressNulls", false);
        setField(term182921, term182921.getClass(), "_suppressableValue", null);
        setField(term182921, term182921.getClass(), "_includeInViews", null);
        setField(term182921, term182921.getClass(), "_internalSettings", null);
        term182928 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term182929 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term182930 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term182933 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term182934 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setBooleanField(term182928, term182928.getClass(), "_forSerialization", false);
        setField(term182928, term182928.getClass(), "_annotationIntrospector", term182929);
        setField(term182930, term182930.getClass(), "_simpleName", "");
        setField(term182930, term182930.getClass(), "_namespace", null);
        setField(term182930, term182930.getClass(), "_encodedSimple", null);
        setField(term182928, term182928.getClass(), "_name", term182930);
        setField(term182928, term182928.getClass(), "_internalName", null);
        setField(term182934, term182934.getClass(), "_field", null);
        setField(term182934, term182934.getClass(), "_serialization", null);
        setField(term182934, term182934.getClass(), "_context", null);
        setField(term182934, term182934.getClass(), "_annotations", null);
        setField(term182933, term182933.getClass(), "value", term182934);
        setField(term182933, term182933.getClass(), "next", null);
        setField(term182933, term182933.getClass(), "name", null);
        setBooleanField(term182933, term182933.getClass(), "isNameExplicit", false);
        setBooleanField(term182933, term182933.getClass(), "isVisible", false);
        setBooleanField(term182933, term182933.getClass(), "isMarkedIgnored", false);
        setField(term182928, term182928.getClass(), "_fields", term182933);
        setField(term182928, term182928.getClass(), "_ctorParameters", null);
        setField(term182928, term182928.getClass(), "_getters", null);
        setField(term182928, term182928.getClass(), "_setters", null);
        term182935 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember"));
        setField(term182935, term182935.getClass(), "_declaringClass", null);
        setField(term182935, term182935.getClass(), "_rawType", null);
        setField(term182935, term182935.getClass(), "_name", null);
        setField(term182935, term182935.getClass(), "_context", null);
        setField(term182935, term182935.getClass(), "_annotations", null);
        term182936 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.NumberSerializers$DoubleSerializer"));
        setField(term182936, term182936.getClass(), "_numberType", null);
        setField(term182936, term182936.getClass(), "_schemaType", null);
        setBooleanField(term182936, term182936.getClass(), "_isInt", false);
        setField(term182936, term182936.getClass(), "_handledType", null);
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
        args[0] = term181938;
        args[1] = term182606;
        args[2] = null;
        args[3] = null;
        args[4] = term182758;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term182921));
        assertTrue(recursiveEquals(term181938, term182928));
        assertTrue(recursiveEquals(term182606, term182935));
        assertTrue(recursiveEquals(term182758, term182936));
    }

};


