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

public class BeanPropertyWriter_init_599291025167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55772;
     Object term56164;
     Object term56271;
     Object term56278;
     Object term56283;

    public BeanPropertyWriter_init_599291025167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term55426 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term55526 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object[] term55229 = (Object[]) newArray("java.lang.Class", 0);
        Object term55644 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.BooleanSerializer"));
        setField(term55426, term55426.getClass(), "_member", null);
        setField(term55426, term55426.getClass(), "_contextAnnotations", null);
        setField(term55426, term55426.getClass(), "_name", null);
        setField(term55426, term55426.getClass(), "_wrapperName", null);
        setField(term55426, term55426.getClass(), "_metadata", term55526);
        setField(term55426, term55426.getClass(), "_includeInViews", term55229);
        setField(term55426, term55426.getClass(), "_declaredType", null);
        setField(term55426, term55426.getClass(), "_serializer", term55644);
        setField(term55426, term55426.getClass(), "_dynamicSerializers", null);
        setField(term55426, term55426.getClass(), "_typeSerializer", null);
        setField(term55426, term55426.getClass(), "_cfgSerializationType", null);
        term55772 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term55864 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term56044 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term55864, term55864.getClass(), "_simpleName", "");
        setField(term55772, term55772.getClass(), "_name", term55864);
        setBooleanField(term55772, term55772.getClass(), "_forSerialization", false);
        setField(term55772, term55772.getClass(), "_ctorParameters", null);
        setField(term55772, term55772.getClass(), "_setters", null);
        setField(term56044, term56044.getClass(), "value", null);
        setField(term56044, term56044.getClass(), "next", null);
        setField(term55772, term55772.getClass(), "_fields", term56044);
        setField(term55772, term55772.getClass(), "_annotationIntrospector", null);
        term56164 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        term56271 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term56272 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term56275 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term56276 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term56277 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term56272, term56272.getClass(), "_value", "");
        setField(term56272, term56272.getClass(), "_quotedUTF8Ref", null);
        setField(term56272, term56272.getClass(), "_unquotedUTF8Ref", null);
        setField(term56272, term56272.getClass(), "_quotedChars", null);
        setField(term56272, term56272.getClass(), "_jdkSerializeValue", null);
        setField(term56271, term56271.getClass(), "_name", term56272);
        setField(term56271, term56271.getClass(), "_wrapperName", null);
        setField(term56271, term56271.getClass(), "_declaredType", null);
        setField(term56271, term56271.getClass(), "_cfgSerializationType", null);
        setField(term56271, term56271.getClass(), "_nonTrivialBaseType", null);
        setField(term56271, term56271.getClass(), "_contextAnnotations", null);
        setField(term56275, term56275.getClass(), "_required", null);
        setField(term56275, term56275.getClass(), "_description", null);
        setField(term56275, term56275.getClass(), "_index", null);
        setField(term56275, term56275.getClass(), "_defaultValue", null);
        setField(term56271, term56271.getClass(), "_metadata", term56275);
        setField(term56271, term56271.getClass(), "_format", null);
        setField(term56276, term56276.getClass(), "_method", null);
        setField(term56276, term56276.getClass(), "_paramClasses", null);
        setField(term56276, term56276.getClass(), "_serialization", null);
        setField(term56276, term56276.getClass(), "_paramAnnotations", null);
        setField(term56276, term56276.getClass(), "_context", null);
        setField(term56276, term56276.getClass(), "_annotations", null);
        setField(term56271, term56271.getClass(), "_member", term56276);
        setField(term56271, term56271.getClass(), "_accessorMethod", null);
        setField(term56271, term56271.getClass(), "_field", null);
        setField(term56271, term56271.getClass(), "_serializer", null);
        setField(term56271, term56271.getClass(), "_nullSerializer", null);
        setField(term56271, term56271.getClass(), "_typeSerializer", null);
        setBooleanField(term56277, term56277.getClass(), "_resetWhenFull", false);
        setField(term56271, term56271.getClass(), "_dynamicSerializers", term56277);
        setBooleanField(term56271, term56271.getClass(), "_suppressNulls", false);
        setField(term56271, term56271.getClass(), "_suppressableValue", null);
        setField(term56271, term56271.getClass(), "_includeInViews", null);
        setField(term56271, term56271.getClass(), "_internalSettings", null);
        term56278 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term56279 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term56282 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term56278, term56278.getClass(), "_forSerialization", false);
        setField(term56278, term56278.getClass(), "_annotationIntrospector", null);
        setField(term56279, term56279.getClass(), "_simpleName", "");
        setField(term56279, term56279.getClass(), "_namespace", null);
        setField(term56279, term56279.getClass(), "_encodedSimple", null);
        setField(term56278, term56278.getClass(), "_name", term56279);
        setField(term56278, term56278.getClass(), "_internalName", null);
        setField(term56282, term56282.getClass(), "value", null);
        setField(term56282, term56282.getClass(), "next", null);
        setField(term56282, term56282.getClass(), "name", null);
        setBooleanField(term56282, term56282.getClass(), "isNameExplicit", false);
        setBooleanField(term56282, term56282.getClass(), "isVisible", false);
        setBooleanField(term56282, term56282.getClass(), "isMarkedIgnored", false);
        setField(term56278, term56278.getClass(), "_fields", term56282);
        setField(term56278, term56278.getClass(), "_ctorParameters", null);
        setField(term56278, term56278.getClass(), "_getters", null);
        setField(term56278, term56278.getClass(), "_setters", null);
        term56283 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term56283, term56283.getClass(), "_method", null);
        setField(term56283, term56283.getClass(), "_paramClasses", null);
        setField(term56283, term56283.getClass(), "_serialization", null);
        setField(term56283, term56283.getClass(), "_paramAnnotations", null);
        setField(term56283, term56283.getClass(), "_context", null);
        setField(term56283, term56283.getClass(), "_annotations", null);
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
        args[0] = term55772;
        args[1] = term56164;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term56271));
        assertTrue(recursiveEquals(term55772, term56278));
        assertTrue(recursiveEquals(term56164, term56283));
    }

};


