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

public class BeanPropertyWriter_init_599291025412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259913;
     Object term260449;
     Object term260575;
     Object term262740;
     Object term262747;
     Object term262753;
     Object term262754;

    public BeanPropertyWriter_init_599291025412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term259553 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term259669 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term259785 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdKeySerializer"));
        setField(term259553, term259553.getClass(), "_member", null);
        setField(term259553, term259553.getClass(), "_contextAnnotations", term259669);
        setField(term259553, term259553.getClass(), "_name", null);
        setField(term259553, term259553.getClass(), "_wrapperName", null);
        setField(term259553, term259553.getClass(), "_metadata", null);
        setField(term259553, term259553.getClass(), "_includeInViews", null);
        setField(term259553, term259553.getClass(), "_declaredType", null);
        setField(term259553, term259553.getClass(), "_serializer", term259785);
        setField(term259553, term259553.getClass(), "_dynamicSerializers", null);
        setField(term259553, term259553.getClass(), "_typeSerializer", null);
        setField(term259553, term259553.getClass(), "_cfgSerializationType", null);
        term259913 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term260005 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term260185 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term260329 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term260005, term260005.getClass(), "_simpleName", "");
        setField(term259913, term259913.getClass(), "_name", term260005);
        setBooleanField(term259913, term259913.getClass(), "_forSerialization", false);
        setField(term259913, term259913.getClass(), "_ctorParameters", null);
        setField(term260185, term260185.getClass(), "next", null);
        setField(term260185, term260185.getClass(), "value", null);
        setField(term259913, term259913.getClass(), "_setters", term260185);
        setField(term259913, term259913.getClass(), "_fields", null);
        setField(term259913, term259913.getClass(), "_annotationIntrospector", term260329);
        term260449 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        term260575 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer"));
        term262740 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term262741 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term262744 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term262745 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term262746 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer"));
        setField(term262741, term262741.getClass(), "_value", "");
        setField(term262741, term262741.getClass(), "_quotedUTF8Ref", null);
        setField(term262741, term262741.getClass(), "_unquotedUTF8Ref", null);
        setField(term262741, term262741.getClass(), "_quotedChars", null);
        setField(term262741, term262741.getClass(), "_jdkSerializeValue", null);
        setField(term262740, term262740.getClass(), "_name", term262741);
        setField(term262740, term262740.getClass(), "_wrapperName", null);
        setField(term262740, term262740.getClass(), "_declaredType", null);
        setField(term262740, term262740.getClass(), "_cfgSerializationType", null);
        setField(term262740, term262740.getClass(), "_nonTrivialBaseType", null);
        setField(term262740, term262740.getClass(), "_contextAnnotations", null);
        setField(term262744, term262744.getClass(), "_required", null);
        setField(term262744, term262744.getClass(), "_description", null);
        setField(term262744, term262744.getClass(), "_index", null);
        setField(term262744, term262744.getClass(), "_defaultValue", null);
        setField(term262740, term262740.getClass(), "_metadata", term262744);
        setField(term262740, term262740.getClass(), "_format", null);
        setField(term262745, term262745.getClass(), "_method", null);
        setField(term262745, term262745.getClass(), "_paramClasses", null);
        setField(term262745, term262745.getClass(), "_serialization", null);
        setField(term262745, term262745.getClass(), "_paramAnnotations", null);
        setField(term262745, term262745.getClass(), "_context", null);
        setField(term262745, term262745.getClass(), "_annotations", null);
        setField(term262740, term262740.getClass(), "_member", term262745);
        setField(term262740, term262740.getClass(), "_accessorMethod", null);
        setField(term262740, term262740.getClass(), "_field", null);
        setField(term262746, term262746.getClass(), "_handledType", null);
        setField(term262740, term262740.getClass(), "_serializer", term262746);
        setField(term262740, term262740.getClass(), "_nullSerializer", null);
        setField(term262740, term262740.getClass(), "_typeSerializer", null);
        setField(term262740, term262740.getClass(), "_dynamicSerializers", null);
        setBooleanField(term262740, term262740.getClass(), "_suppressNulls", false);
        setField(term262740, term262740.getClass(), "_suppressableValue", null);
        setField(term262740, term262740.getClass(), "_includeInViews", null);
        setField(term262740, term262740.getClass(), "_internalSettings", null);
        term262747 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term262748 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term262749 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term262752 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term262747, term262747.getClass(), "_forSerialization", false);
        setField(term262747, term262747.getClass(), "_annotationIntrospector", term262748);
        setField(term262749, term262749.getClass(), "_simpleName", "");
        setField(term262749, term262749.getClass(), "_namespace", null);
        setField(term262749, term262749.getClass(), "_encodedSimple", null);
        setField(term262747, term262747.getClass(), "_name", term262749);
        setField(term262747, term262747.getClass(), "_internalName", null);
        setField(term262747, term262747.getClass(), "_fields", null);
        setField(term262747, term262747.getClass(), "_ctorParameters", null);
        setField(term262747, term262747.getClass(), "_getters", null);
        setField(term262752, term262752.getClass(), "value", null);
        setField(term262752, term262752.getClass(), "next", null);
        setField(term262752, term262752.getClass(), "name", null);
        setBooleanField(term262752, term262752.getClass(), "isNameExplicit", false);
        setBooleanField(term262752, term262752.getClass(), "isVisible", false);
        setBooleanField(term262752, term262752.getClass(), "isMarkedIgnored", false);
        setField(term262747, term262747.getClass(), "_setters", term262752);
        term262753 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term262753, term262753.getClass(), "_method", null);
        setField(term262753, term262753.getClass(), "_paramClasses", null);
        setField(term262753, term262753.getClass(), "_serialization", null);
        setField(term262753, term262753.getClass(), "_paramAnnotations", null);
        setField(term262753, term262753.getClass(), "_context", null);
        setField(term262753, term262753.getClass(), "_annotations", null);
        term262754 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer"));
        setField(term262754, term262754.getClass(), "_handledType", null);
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
        args[0] = term259913;
        args[1] = term260449;
        args[2] = null;
        args[3] = null;
        args[4] = term260575;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term262740));
        assertTrue(recursiveEquals(term259913, term262747));
        assertTrue(recursiveEquals(term260449, term262753));
        assertTrue(recursiveEquals(term260575, term262754));
    }

};


