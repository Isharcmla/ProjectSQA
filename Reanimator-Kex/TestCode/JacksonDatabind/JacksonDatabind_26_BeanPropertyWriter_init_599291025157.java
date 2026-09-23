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
import java.lang.String;

public class BeanPropertyWriter_init_599291025157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46275;
     Object term46525;
     Object term46739;
     Object term48873;
     Object term48899;
     Object term48903;
     Object term48922;

    public BeanPropertyWriter_init_599291025157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term46147 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        setField(term46147, term46147.getClass(), "_member", null);
        setField(term46147, term46147.getClass(), "_contextAnnotations", null);
        setField(term46147, term46147.getClass(), "_name", null);
        setField(term46147, term46147.getClass(), "_wrapperName", null);
        setField(term46147, term46147.getClass(), "_metadata", null);
        setField(term46147, term46147.getClass(), "_includeInViews", null);
        setField(term46147, term46147.getClass(), "_declaredType", null);
        setField(term46147, term46147.getClass(), "_serializer", null);
        setField(term46147, term46147.getClass(), "_dynamicSerializers", null);
        setField(term46147, term46147.getClass(), "_typeSerializer", null);
        setField(term46147, term46147.getClass(), "_cfgSerializationType", null);
        term46275 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term46367 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term46367, term46367.getClass(), "_simpleName", "");
        setField(term46275, term46275.getClass(), "_name", term46367);
        setBooleanField(term46275, term46275.getClass(), "_forSerialization", false);
        setField(term46275, term46275.getClass(), "_ctorParameters", null);
        setField(term46275, term46275.getClass(), "_setters", null);
        setField(term46275, term46275.getClass(), "_fields", null);
        setField(term46275, term46275.getClass(), "_annotationIntrospector", null);
        Class<? extends Object> term48951 = Class.forName((String) "java.util.Calendar$Builder");
        Class term49085 = int.class;
        Class term49091 = int.class;
        Class term49097 = int.class;
        Object[] term49098 = (Object[]) newArray("java.lang.Class", 3);
        setElement(term49098, 0, term49085);
        setElement(term49098, 1, term49091);
        setElement(term49098, 2, term49097);
        Method term46579 = ((Class) term48951).getDeclaredMethod((String) "setWeekDate", (Class[]) term49098);
        ((Method) term46579).setAccessible(false);
        term46525 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term46525, term46525.getClass(), "_method", term46579);
        term46739 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer"));
        Class<? extends Object> term49901 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.InetAddressSerializer");
        Class<? extends Object> term50192 = Class.forName((String) "java.lang.Object");
        Class<? extends Object> term50235 = Class.forName((String) "com.fasterxml.jackson.core.JsonGenerator");
        Class<? extends Object> term50287 = Class.forName((String) "com.fasterxml.jackson.databind.SerializerProvider");
        Object[] term50288 = (Object[]) newArray("java.lang.Class", 3);
        setElement(term50288, 0, term50192);
        setElement(term50288, 1, term50235);
        setElement(term50288, 2, term50287);
        Method term48879 = ((Class) term49901).getDeclaredMethod((String) "serialize", (Class[]) term50288);
        ((Method) term48879).setAccessible(false);
        term48873 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term48874 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term48877 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term48878 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term48897 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer"));
        Object term48898 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term48874, term48874.getClass(), "_value", "");
        setField(term48874, term48874.getClass(), "_quotedUTF8Ref", null);
        setField(term48874, term48874.getClass(), "_unquotedUTF8Ref", null);
        setField(term48874, term48874.getClass(), "_quotedChars", null);
        setField(term48874, term48874.getClass(), "_jdkSerializeValue", null);
        setField(term48873, term48873.getClass(), "_name", term48874);
        setField(term48873, term48873.getClass(), "_wrapperName", null);
        setField(term48873, term48873.getClass(), "_declaredType", null);
        setField(term48873, term48873.getClass(), "_cfgSerializationType", null);
        setField(term48873, term48873.getClass(), "_nonTrivialBaseType", null);
        setField(term48873, term48873.getClass(), "_contextAnnotations", null);
        setField(term48877, term48877.getClass(), "_required", null);
        setField(term48877, term48877.getClass(), "_description", null);
        setField(term48877, term48877.getClass(), "_index", null);
        setField(term48877, term48877.getClass(), "_defaultValue", null);
        setField(term48873, term48873.getClass(), "_metadata", term48877);
        setField(term48873, term48873.getClass(), "_format", null);
        setField(term48878, term48878.getClass(), "_method", term48879);
        setField(term48878, term48878.getClass(), "_paramClasses", null);
        setField(term48878, term48878.getClass(), "_serialization", null);
        setField(term48878, term48878.getClass(), "_paramAnnotations", null);
        setField(term48878, term48878.getClass(), "_context", null);
        setField(term48878, term48878.getClass(), "_annotations", null);
        setField(term48873, term48873.getClass(), "_member", term48878);
        setField(term48873, term48873.getClass(), "_accessorMethod", term48879);
        setField(term48873, term48873.getClass(), "_field", null);
        setField(term48873, term48873.getClass(), "_serializer", null);
        setField(term48873, term48873.getClass(), "_nullSerializer", null);
        setField(term48897, term48897.getClass(), "_typePropertyName", null);
        setField(term48897, term48897.getClass(), "_idResolver", null);
        setField(term48897, term48897.getClass(), "_property", null);
        setField(term48873, term48873.getClass(), "_typeSerializer", term48897);
        setBooleanField(term48898, term48898.getClass(), "_resetWhenFull", false);
        setField(term48873, term48873.getClass(), "_dynamicSerializers", term48898);
        setBooleanField(term48873, term48873.getClass(), "_suppressNulls", false);
        setField(term48873, term48873.getClass(), "_suppressableValue", null);
        setField(term48873, term48873.getClass(), "_includeInViews", null);
        setField(term48873, term48873.getClass(), "_internalSettings", null);
        term48899 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term48900 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setBooleanField(term48899, term48899.getClass(), "_forSerialization", false);
        setField(term48899, term48899.getClass(), "_annotationIntrospector", null);
        setField(term48900, term48900.getClass(), "_simpleName", "");
        setField(term48900, term48900.getClass(), "_namespace", null);
        setField(term48900, term48900.getClass(), "_encodedSimple", null);
        setField(term48899, term48899.getClass(), "_name", term48900);
        setField(term48899, term48899.getClass(), "_internalName", null);
        setField(term48899, term48899.getClass(), "_fields", null);
        setField(term48899, term48899.getClass(), "_ctorParameters", null);
        setField(term48899, term48899.getClass(), "_getters", null);
        setField(term48899, term48899.getClass(), "_setters", null);
        Class<? extends Object> term50982 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer$CollectionReferringAccumulator");
        Class<? extends Object> term51488 = Class.forName((String) "com.fasterxml.jackson.databind.deser.UnresolvedForwardReference");
        Object[] term51489 = (Object[]) newArray("java.lang.Class", 1);
        setElement(term51489, 0, term51488);
        Method term48904 = ((Class) term50982).getDeclaredMethod((String) "handleUnresolvedReference", (Class[]) term51489);
        ((Method) term48904).setAccessible(false);
        term48903 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term48903, term48903.getClass(), "_method", term48904);
        setField(term48903, term48903.getClass(), "_paramClasses", null);
        setField(term48903, term48903.getClass(), "_serialization", null);
        setField(term48903, term48903.getClass(), "_paramAnnotations", null);
        setField(term48903, term48903.getClass(), "_context", null);
        setField(term48903, term48903.getClass(), "_annotations", null);
        term48922 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer"));
        setField(term48922, term48922.getClass(), "_typePropertyName", null);
        setField(term48922, term48922.getClass(), "_idResolver", null);
        setField(term48922, term48922.getClass(), "_property", null);
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
        args[0] = term46275;
        args[1] = term46525;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = term46739;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term48873));
        assertTrue(recursiveEquals(term46275, term48899));
        assertTrue(recursiveEquals(term46525, term48903));
        assertTrue(recursiveEquals(term46739, term48922));
    }

};


