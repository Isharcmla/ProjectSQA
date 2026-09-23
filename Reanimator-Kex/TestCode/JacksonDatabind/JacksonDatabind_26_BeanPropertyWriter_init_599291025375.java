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

public class BeanPropertyWriter_init_599291025375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223589;
     Object term224097;
     Object term224259;
     Object term225632;
     Object term225639;
     Object term225645;
     Object term225646;

    public BeanPropertyWriter_init_599291025375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term223341 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term223461 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.TimeZoneSerializer"));
        setField(term223341, term223341.getClass(), "_member", null);
        setField(term223341, term223341.getClass(), "_contextAnnotations", null);
        setField(term223341, term223341.getClass(), "_name", null);
        setField(term223341, term223341.getClass(), "_wrapperName", null);
        setField(term223341, term223341.getClass(), "_metadata", null);
        setField(term223341, term223341.getClass(), "_includeInViews", null);
        setField(term223341, term223341.getClass(), "_declaredType", null);
        setField(term223341, term223341.getClass(), "_serializer", term223461);
        setField(term223341, term223341.getClass(), "_dynamicSerializers", null);
        setField(term223341, term223341.getClass(), "_typeSerializer", null);
        setField(term223341, term223341.getClass(), "_cfgSerializationType", null);
        term223589 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term223681 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term223861 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term224005 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term223681, term223681.getClass(), "_simpleName", "");
        setField(term223589, term223589.getClass(), "_name", term223681);
        setBooleanField(term223589, term223589.getClass(), "_forSerialization", true);
        setField(term223589, term223589.getClass(), "_getters", null);
        setField(term223861, term223861.getClass(), "value", null);
        setField(term223861, term223861.getClass(), "next", null);
        setField(term223589, term223589.getClass(), "_fields", term223861);
        setField(term223589, term223589.getClass(), "_annotationIntrospector", term224005);
        term224097 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term224259 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$CharArraySerializer"));
        term225632 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term225633 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term225636 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term225637 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term225638 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$CharArraySerializer"));
        setField(term225633, term225633.getClass(), "_value", "");
        setField(term225633, term225633.getClass(), "_quotedUTF8Ref", null);
        setField(term225633, term225633.getClass(), "_unquotedUTF8Ref", null);
        setField(term225633, term225633.getClass(), "_quotedChars", null);
        setField(term225633, term225633.getClass(), "_jdkSerializeValue", null);
        setField(term225632, term225632.getClass(), "_name", term225633);
        setField(term225632, term225632.getClass(), "_wrapperName", null);
        setField(term225636, term225636.getClass(), "_keyType", null);
        setField(term225636, term225636.getClass(), "_valueType", null);
        setField(term225636, term225636.getClass(), "_canonicalName", null);
        setField(term225636, term225636.getClass(), "_class", null);
        setIntField(term225636, term225636.getClass(), "_hash", 0);
        setField(term225636, term225636.getClass(), "_valueHandler", null);
        setField(term225636, term225636.getClass(), "_typeHandler", null);
        setBooleanField(term225636, term225636.getClass(), "_asStatic", false);
        setField(term225632, term225632.getClass(), "_declaredType", term225636);
        setField(term225632, term225632.getClass(), "_cfgSerializationType", null);
        setField(term225632, term225632.getClass(), "_nonTrivialBaseType", null);
        setField(term225632, term225632.getClass(), "_contextAnnotations", null);
        setField(term225637, term225637.getClass(), "_required", null);
        setField(term225637, term225637.getClass(), "_description", null);
        setField(term225637, term225637.getClass(), "_index", null);
        setField(term225637, term225637.getClass(), "_defaultValue", null);
        setField(term225632, term225632.getClass(), "_metadata", term225637);
        setField(term225632, term225632.getClass(), "_format", null);
        setField(term225632, term225632.getClass(), "_member", null);
        setField(term225632, term225632.getClass(), "_accessorMethod", null);
        setField(term225632, term225632.getClass(), "_field", null);
        setField(term225638, term225638.getClass(), "_handledType", null);
        setField(term225632, term225632.getClass(), "_serializer", term225638);
        setField(term225632, term225632.getClass(), "_nullSerializer", null);
        setField(term225632, term225632.getClass(), "_typeSerializer", null);
        setField(term225632, term225632.getClass(), "_dynamicSerializers", null);
        setBooleanField(term225632, term225632.getClass(), "_suppressNulls", false);
        setField(term225632, term225632.getClass(), "_suppressableValue", null);
        setField(term225632, term225632.getClass(), "_includeInViews", null);
        setField(term225632, term225632.getClass(), "_internalSettings", null);
        term225639 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term225640 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term225641 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term225644 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term225639, term225639.getClass(), "_forSerialization", true);
        setField(term225639, term225639.getClass(), "_annotationIntrospector", term225640);
        setField(term225641, term225641.getClass(), "_simpleName", "");
        setField(term225641, term225641.getClass(), "_namespace", null);
        setField(term225641, term225641.getClass(), "_encodedSimple", null);
        setField(term225639, term225639.getClass(), "_name", term225641);
        setField(term225639, term225639.getClass(), "_internalName", null);
        setField(term225644, term225644.getClass(), "value", null);
        setField(term225644, term225644.getClass(), "next", null);
        setField(term225644, term225644.getClass(), "name", null);
        setBooleanField(term225644, term225644.getClass(), "isNameExplicit", false);
        setBooleanField(term225644, term225644.getClass(), "isVisible", false);
        setBooleanField(term225644, term225644.getClass(), "isMarkedIgnored", false);
        setField(term225639, term225639.getClass(), "_fields", term225644);
        setField(term225639, term225639.getClass(), "_ctorParameters", null);
        setField(term225639, term225639.getClass(), "_getters", null);
        setField(term225639, term225639.getClass(), "_setters", null);
        term225645 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term225645, term225645.getClass(), "_keyType", null);
        setField(term225645, term225645.getClass(), "_valueType", null);
        setField(term225645, term225645.getClass(), "_canonicalName", null);
        setField(term225645, term225645.getClass(), "_class", null);
        setIntField(term225645, term225645.getClass(), "_hash", 0);
        setField(term225645, term225645.getClass(), "_valueHandler", null);
        setField(term225645, term225645.getClass(), "_typeHandler", null);
        setBooleanField(term225645, term225645.getClass(), "_asStatic", false);
        term225646 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$CharArraySerializer"));
        setField(term225646, term225646.getClass(), "_handledType", null);
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
        args[0] = term223589;
        args[1] = null;
        args[2] = null;
        args[3] = term224097;
        args[4] = term224259;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term225632));
        assertTrue(recursiveEquals(term223589, term225639));
        assertTrue(recursiveEquals(term224097, term225645));
        assertTrue(recursiveEquals(term224259, term225646));
    }

};


