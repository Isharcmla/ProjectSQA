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

public class BeanPropertyWriter_init_599291025163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53409;
     Object term53659;
     Object term53763;
     Object term54247;
     Object term54255;
     Object term54259;
     Object term54260;

    public BeanPropertyWriter_init_599291025163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term53139 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object[] term52950 = (Object[]) newArray("java.lang.Class", 0);
        Object term53281 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Double"));
        setField(term53139, term53139.getClass(), "_member", null);
        setField(term53139, term53139.getClass(), "_contextAnnotations", null);
        setField(term53139, term53139.getClass(), "_name", null);
        setField(term53139, term53139.getClass(), "_wrapperName", null);
        setField(term53139, term53139.getClass(), "_metadata", null);
        setField(term53139, term53139.getClass(), "_includeInViews", term52950);
        setField(term53139, term53139.getClass(), "_declaredType", null);
        setField(term53139, term53139.getClass(), "_serializer", null);
        setField(term53139, term53139.getClass(), "_dynamicSerializers", term53281);
        setField(term53139, term53139.getClass(), "_typeSerializer", null);
        setField(term53139, term53139.getClass(), "_cfgSerializationType", null);
        term53409 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term53501 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term53501, term53501.getClass(), "_simpleName", "");
        setField(term53409, term53409.getClass(), "_name", term53501);
        setBooleanField(term53409, term53409.getClass(), "_forSerialization", true);
        setField(term53409, term53409.getClass(), "_getters", null);
        setField(term53409, term53409.getClass(), "_fields", null);
        setField(term53409, term53409.getClass(), "_annotationIntrospector", null);
        term53659 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        term53763 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term54247 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term54248 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term54251 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term54252 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term54253 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term54254 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term54248, term54248.getClass(), "_value", "");
        setField(term54248, term54248.getClass(), "_quotedUTF8Ref", null);
        setField(term54248, term54248.getClass(), "_unquotedUTF8Ref", null);
        setField(term54248, term54248.getClass(), "_quotedChars", null);
        setField(term54248, term54248.getClass(), "_jdkSerializeValue", null);
        setField(term54247, term54247.getClass(), "_name", term54248);
        setField(term54247, term54247.getClass(), "_wrapperName", null);
        setField(term54247, term54247.getClass(), "_declaredType", null);
        setField(term54251, term54251.getClass(), "_referencedType", null);
        setField(term54251, term54251.getClass(), "_typeParametersFor", null);
        setField(term54251, term54251.getClass(), "_typeParameters", null);
        setField(term54251, term54251.getClass(), "_typeNames", null);
        setField(term54251, term54251.getClass(), "_canonicalName", null);
        setField(term54251, term54251.getClass(), "_class", null);
        setIntField(term54251, term54251.getClass(), "_hash", 0);
        setField(term54251, term54251.getClass(), "_valueHandler", null);
        setField(term54251, term54251.getClass(), "_typeHandler", null);
        setBooleanField(term54251, term54251.getClass(), "_asStatic", false);
        setField(term54247, term54247.getClass(), "_cfgSerializationType", term54251);
        setField(term54247, term54247.getClass(), "_nonTrivialBaseType", null);
        setField(term54247, term54247.getClass(), "_contextAnnotations", null);
        setField(term54252, term54252.getClass(), "_required", null);
        setField(term54252, term54252.getClass(), "_description", null);
        setField(term54252, term54252.getClass(), "_index", null);
        setField(term54252, term54252.getClass(), "_defaultValue", null);
        setField(term54247, term54247.getClass(), "_metadata", term54252);
        setField(term54247, term54247.getClass(), "_format", null);
        setField(term54253, term54253.getClass(), "_method", null);
        setField(term54253, term54253.getClass(), "_paramClasses", null);
        setField(term54253, term54253.getClass(), "_serialization", null);
        setField(term54253, term54253.getClass(), "_paramAnnotations", null);
        setField(term54253, term54253.getClass(), "_context", null);
        setField(term54253, term54253.getClass(), "_annotations", null);
        setField(term54247, term54247.getClass(), "_member", term54253);
        setField(term54247, term54247.getClass(), "_accessorMethod", null);
        setField(term54247, term54247.getClass(), "_field", null);
        setField(term54247, term54247.getClass(), "_serializer", null);
        setField(term54247, term54247.getClass(), "_nullSerializer", null);
        setField(term54247, term54247.getClass(), "_typeSerializer", null);
        setBooleanField(term54254, term54254.getClass(), "_resetWhenFull", false);
        setField(term54247, term54247.getClass(), "_dynamicSerializers", term54254);
        setBooleanField(term54247, term54247.getClass(), "_suppressNulls", false);
        setField(term54247, term54247.getClass(), "_suppressableValue", null);
        setField(term54247, term54247.getClass(), "_includeInViews", null);
        setField(term54247, term54247.getClass(), "_internalSettings", null);
        term54255 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term54256 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setBooleanField(term54255, term54255.getClass(), "_forSerialization", true);
        setField(term54255, term54255.getClass(), "_annotationIntrospector", null);
        setField(term54256, term54256.getClass(), "_simpleName", "");
        setField(term54256, term54256.getClass(), "_namespace", null);
        setField(term54256, term54256.getClass(), "_encodedSimple", null);
        setField(term54255, term54255.getClass(), "_name", term54256);
        setField(term54255, term54255.getClass(), "_internalName", null);
        setField(term54255, term54255.getClass(), "_fields", null);
        setField(term54255, term54255.getClass(), "_ctorParameters", null);
        setField(term54255, term54255.getClass(), "_getters", null);
        setField(term54255, term54255.getClass(), "_setters", null);
        term54259 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term54259, term54259.getClass(), "_method", null);
        setField(term54259, term54259.getClass(), "_paramClasses", null);
        setField(term54259, term54259.getClass(), "_serialization", null);
        setField(term54259, term54259.getClass(), "_paramAnnotations", null);
        setField(term54259, term54259.getClass(), "_context", null);
        setField(term54259, term54259.getClass(), "_annotations", null);
        term54260 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term54260, term54260.getClass(), "_referencedType", null);
        setField(term54260, term54260.getClass(), "_typeParametersFor", null);
        setField(term54260, term54260.getClass(), "_typeParameters", null);
        setField(term54260, term54260.getClass(), "_typeNames", null);
        setField(term54260, term54260.getClass(), "_canonicalName", null);
        setField(term54260, term54260.getClass(), "_class", null);
        setIntField(term54260, term54260.getClass(), "_hash", 0);
        setField(term54260, term54260.getClass(), "_valueHandler", null);
        setField(term54260, term54260.getClass(), "_typeHandler", null);
        setBooleanField(term54260, term54260.getClass(), "_asStatic", false);
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
        args[0] = term53409;
        args[1] = term53659;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = term53763;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term54247));
        assertTrue(recursiveEquals(term53409, term54255));
        assertTrue(recursiveEquals(term53659, term54259));
        assertTrue(recursiveEquals(term53763, term54260));
    }

};


