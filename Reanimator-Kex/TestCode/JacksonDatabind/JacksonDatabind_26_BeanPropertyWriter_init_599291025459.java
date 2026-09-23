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

public class BeanPropertyWriter_init_599291025459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term303771;
     Object term304423;
     Object term306702;
     Object term306709;
     Object term306716;

    public BeanPropertyWriter_init_599291025459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term303643 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object[] term303390 = (Object[]) newArray("java.lang.Class", 0);
        setField(term303643, term303643.getClass(), "_member", null);
        setField(term303643, term303643.getClass(), "_contextAnnotations", null);
        setField(term303643, term303643.getClass(), "_name", null);
        setField(term303643, term303643.getClass(), "_wrapperName", null);
        setField(term303643, term303643.getClass(), "_metadata", null);
        setField(term303643, term303643.getClass(), "_includeInViews", term303390);
        setField(term303643, term303643.getClass(), "_declaredType", null);
        setField(term303643, term303643.getClass(), "_serializer", null);
        setField(term303643, term303643.getClass(), "_dynamicSerializers", null);
        setField(term303643, term303643.getClass(), "_typeSerializer", null);
        setField(term303643, term303643.getClass(), "_cfgSerializationType", null);
        term303771 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term303863 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term304043 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term304161 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term304305 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term303863, term303863.getClass(), "_simpleName", "");
        setField(term303771, term303771.getClass(), "_name", term303863);
        setBooleanField(term303771, term303771.getClass(), "_forSerialization", false);
        setField(term303771, term303771.getClass(), "_ctorParameters", null);
        setField(term303771, term303771.getClass(), "_setters", null);
        setField(term304043, term304043.getClass(), "value", term304161);
        setField(term304043, term304043.getClass(), "next", null);
        setField(term303771, term303771.getClass(), "_fields", term304043);
        setField(term303771, term303771.getClass(), "_annotationIntrospector", term304305);
        term304423 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term306702 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term306703 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term306706 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term306707 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term306708 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term306703, term306703.getClass(), "_value", "");
        setField(term306703, term306703.getClass(), "_quotedUTF8Ref", null);
        setField(term306703, term306703.getClass(), "_unquotedUTF8Ref", null);
        setField(term306703, term306703.getClass(), "_quotedChars", null);
        setField(term306703, term306703.getClass(), "_jdkSerializeValue", null);
        setField(term306702, term306702.getClass(), "_name", term306703);
        setField(term306702, term306702.getClass(), "_wrapperName", null);
        setField(term306702, term306702.getClass(), "_declaredType", null);
        setField(term306702, term306702.getClass(), "_cfgSerializationType", null);
        setField(term306702, term306702.getClass(), "_nonTrivialBaseType", null);
        setField(term306702, term306702.getClass(), "_contextAnnotations", null);
        setField(term306706, term306706.getClass(), "_required", null);
        setField(term306706, term306706.getClass(), "_description", null);
        setField(term306706, term306706.getClass(), "_index", null);
        setField(term306706, term306706.getClass(), "_defaultValue", null);
        setField(term306702, term306702.getClass(), "_metadata", term306706);
        setField(term306702, term306702.getClass(), "_format", null);
        setField(term306707, term306707.getClass(), "_field", null);
        setField(term306707, term306707.getClass(), "_serialization", null);
        setField(term306707, term306707.getClass(), "_context", null);
        setField(term306707, term306707.getClass(), "_annotations", null);
        setField(term306702, term306702.getClass(), "_member", term306707);
        setField(term306702, term306702.getClass(), "_accessorMethod", null);
        setField(term306702, term306702.getClass(), "_field", null);
        setField(term306702, term306702.getClass(), "_serializer", null);
        setField(term306702, term306702.getClass(), "_nullSerializer", null);
        setField(term306702, term306702.getClass(), "_typeSerializer", null);
        setBooleanField(term306708, term306708.getClass(), "_resetWhenFull", false);
        setField(term306702, term306702.getClass(), "_dynamicSerializers", term306708);
        setBooleanField(term306702, term306702.getClass(), "_suppressNulls", false);
        setField(term306702, term306702.getClass(), "_suppressableValue", null);
        setField(term306702, term306702.getClass(), "_includeInViews", null);
        setField(term306702, term306702.getClass(), "_internalSettings", null);
        term306709 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term306710 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term306711 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term306714 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term306715 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setBooleanField(term306709, term306709.getClass(), "_forSerialization", false);
        setField(term306709, term306709.getClass(), "_annotationIntrospector", term306710);
        setField(term306711, term306711.getClass(), "_simpleName", "");
        setField(term306711, term306711.getClass(), "_namespace", null);
        setField(term306711, term306711.getClass(), "_encodedSimple", null);
        setField(term306709, term306709.getClass(), "_name", term306711);
        setField(term306709, term306709.getClass(), "_internalName", null);
        setField(term306715, term306715.getClass(), "_field", null);
        setField(term306715, term306715.getClass(), "_serialization", null);
        setField(term306715, term306715.getClass(), "_context", null);
        setField(term306715, term306715.getClass(), "_annotations", null);
        setField(term306714, term306714.getClass(), "value", term306715);
        setField(term306714, term306714.getClass(), "next", null);
        setField(term306714, term306714.getClass(), "name", null);
        setBooleanField(term306714, term306714.getClass(), "isNameExplicit", false);
        setBooleanField(term306714, term306714.getClass(), "isVisible", false);
        setBooleanField(term306714, term306714.getClass(), "isMarkedIgnored", false);
        setField(term306709, term306709.getClass(), "_fields", term306714);
        setField(term306709, term306709.getClass(), "_ctorParameters", null);
        setField(term306709, term306709.getClass(), "_getters", null);
        setField(term306709, term306709.getClass(), "_setters", null);
        term306716 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term306716, term306716.getClass(), "_field", null);
        setField(term306716, term306716.getClass(), "_serialization", null);
        setField(term306716, term306716.getClass(), "_context", null);
        setField(term306716, term306716.getClass(), "_annotations", null);
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
        args[0] = term303771;
        args[1] = term304423;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term306702));
        assertTrue(recursiveEquals(term303771, term306709));
        assertTrue(recursiveEquals(term304423, term306716));
    }

};


