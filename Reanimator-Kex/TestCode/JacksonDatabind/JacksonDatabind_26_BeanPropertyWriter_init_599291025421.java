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

public class BeanPropertyWriter_init_599291025421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268496;
     Object term269030;
     Object term269128;
     Object term269262;
     Object term270471;
     Object term270479;
     Object term270485;
     Object term270486;
     Object term270487;

    public BeanPropertyWriter_init_599291025421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term268368 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object[] term268122 = (Object[]) newArray("java.lang.Class", 0);
        setField(term268368, term268368.getClass(), "_member", null);
        setField(term268368, term268368.getClass(), "_contextAnnotations", null);
        setField(term268368, term268368.getClass(), "_name", null);
        setField(term268368, term268368.getClass(), "_wrapperName", null);
        setField(term268368, term268368.getClass(), "_metadata", null);
        setField(term268368, term268368.getClass(), "_includeInViews", term268122);
        setField(term268368, term268368.getClass(), "_declaredType", null);
        setField(term268368, term268368.getClass(), "_serializer", null);
        setField(term268368, term268368.getClass(), "_dynamicSerializers", null);
        setField(term268368, term268368.getClass(), "_typeSerializer", null);
        setField(term268368, term268368.getClass(), "_cfgSerializationType", null);
        term268496 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term268588 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term268768 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term268912 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term268588, term268588.getClass(), "_simpleName", "");
        setField(term268496, term268496.getClass(), "_name", term268588);
        setBooleanField(term268496, term268496.getClass(), "_forSerialization", false);
        setField(term268496, term268496.getClass(), "_ctorParameters", null);
        setField(term268768, term268768.getClass(), "next", null);
        setField(term268768, term268768.getClass(), "value", null);
        setField(term268496, term268496.getClass(), "_setters", term268768);
        setField(term268496, term268496.getClass(), "_fields", null);
        setField(term268496, term268496.getClass(), "_annotationIntrospector", term268912);
        term269030 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term269128 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term269262 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default"));
        term270471 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term270472 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term270475 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term270476 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term270477 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term270478 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default"));
        setField(term270472, term270472.getClass(), "_value", "");
        setField(term270472, term270472.getClass(), "_quotedUTF8Ref", null);
        setField(term270472, term270472.getClass(), "_unquotedUTF8Ref", null);
        setField(term270472, term270472.getClass(), "_quotedChars", null);
        setField(term270472, term270472.getClass(), "_jdkSerializeValue", null);
        setField(term270471, term270471.getClass(), "_name", term270472);
        setField(term270471, term270471.getClass(), "_wrapperName", null);
        setField(term270475, term270475.getClass(), "_typeParametersFor", null);
        setField(term270475, term270475.getClass(), "_typeParameters", null);
        setField(term270475, term270475.getClass(), "_typeNames", null);
        setField(term270475, term270475.getClass(), "_canonicalName", null);
        setField(term270475, term270475.getClass(), "_class", null);
        setIntField(term270475, term270475.getClass(), "_hash", 0);
        setField(term270475, term270475.getClass(), "_valueHandler", null);
        setField(term270475, term270475.getClass(), "_typeHandler", null);
        setBooleanField(term270475, term270475.getClass(), "_asStatic", false);
        setField(term270471, term270471.getClass(), "_declaredType", term270475);
        setField(term270471, term270471.getClass(), "_cfgSerializationType", null);
        setField(term270471, term270471.getClass(), "_nonTrivialBaseType", null);
        setField(term270471, term270471.getClass(), "_contextAnnotations", null);
        setField(term270476, term270476.getClass(), "_required", null);
        setField(term270476, term270476.getClass(), "_description", null);
        setField(term270476, term270476.getClass(), "_index", null);
        setField(term270476, term270476.getClass(), "_defaultValue", null);
        setField(term270471, term270471.getClass(), "_metadata", term270476);
        setField(term270471, term270471.getClass(), "_format", null);
        setField(term270477, term270477.getClass(), "_field", null);
        setField(term270477, term270477.getClass(), "_serialization", null);
        setField(term270477, term270477.getClass(), "_context", null);
        setField(term270477, term270477.getClass(), "_annotations", null);
        setField(term270471, term270471.getClass(), "_member", term270477);
        setField(term270471, term270471.getClass(), "_accessorMethod", null);
        setField(term270471, term270471.getClass(), "_field", null);
        setIntField(term270478, term270478.getClass(), "_typeId", 0);
        setField(term270478, term270478.getClass(), "_handledType", null);
        setField(term270471, term270471.getClass(), "_serializer", term270478);
        setField(term270471, term270471.getClass(), "_nullSerializer", null);
        setField(term270471, term270471.getClass(), "_typeSerializer", null);
        setField(term270471, term270471.getClass(), "_dynamicSerializers", null);
        setBooleanField(term270471, term270471.getClass(), "_suppressNulls", false);
        setField(term270471, term270471.getClass(), "_suppressableValue", null);
        setField(term270471, term270471.getClass(), "_includeInViews", null);
        setField(term270471, term270471.getClass(), "_internalSettings", null);
        term270479 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term270480 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term270481 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term270484 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term270479, term270479.getClass(), "_forSerialization", false);
        setField(term270479, term270479.getClass(), "_annotationIntrospector", term270480);
        setField(term270481, term270481.getClass(), "_simpleName", "");
        setField(term270481, term270481.getClass(), "_namespace", null);
        setField(term270481, term270481.getClass(), "_encodedSimple", null);
        setField(term270479, term270479.getClass(), "_name", term270481);
        setField(term270479, term270479.getClass(), "_internalName", null);
        setField(term270479, term270479.getClass(), "_fields", null);
        setField(term270479, term270479.getClass(), "_ctorParameters", null);
        setField(term270479, term270479.getClass(), "_getters", null);
        setField(term270484, term270484.getClass(), "value", null);
        setField(term270484, term270484.getClass(), "next", null);
        setField(term270484, term270484.getClass(), "name", null);
        setBooleanField(term270484, term270484.getClass(), "isNameExplicit", false);
        setBooleanField(term270484, term270484.getClass(), "isVisible", false);
        setBooleanField(term270484, term270484.getClass(), "isMarkedIgnored", false);
        setField(term270479, term270479.getClass(), "_setters", term270484);
        term270485 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term270485, term270485.getClass(), "_field", null);
        setField(term270485, term270485.getClass(), "_serialization", null);
        setField(term270485, term270485.getClass(), "_context", null);
        setField(term270485, term270485.getClass(), "_annotations", null);
        term270486 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term270486, term270486.getClass(), "_typeParametersFor", null);
        setField(term270486, term270486.getClass(), "_typeParameters", null);
        setField(term270486, term270486.getClass(), "_typeNames", null);
        setField(term270486, term270486.getClass(), "_canonicalName", null);
        setField(term270486, term270486.getClass(), "_class", null);
        setIntField(term270486, term270486.getClass(), "_hash", 0);
        setField(term270486, term270486.getClass(), "_valueHandler", null);
        setField(term270486, term270486.getClass(), "_typeHandler", null);
        setBooleanField(term270486, term270486.getClass(), "_asStatic", false);
        term270487 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default"));
        setIntField(term270487, term270487.getClass(), "_typeId", 0);
        setField(term270487, term270487.getClass(), "_handledType", null);
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
        args[0] = term268496;
        args[1] = term269030;
        args[2] = null;
        args[3] = term269128;
        args[4] = term269262;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term270471));
        assertTrue(recursiveEquals(term268496, term270479));
        assertTrue(recursiveEquals(term269030, term270485));
        assertTrue(recursiveEquals(term269128, term270486));
        assertTrue(recursiveEquals(term269262, term270487));
    }

};


