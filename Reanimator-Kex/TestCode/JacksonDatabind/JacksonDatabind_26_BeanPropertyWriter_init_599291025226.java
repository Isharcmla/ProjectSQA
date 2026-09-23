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

public class BeanPropertyWriter_init_599291025226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97816;
     Object term98322;
     Object term98434;
     Object term99720;
     Object term99727;
     Object term99733;
     Object term99734;

    public BeanPropertyWriter_init_599291025226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term97688 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        setField(term97688, term97688.getClass(), "_member", null);
        setField(term97688, term97688.getClass(), "_contextAnnotations", null);
        setField(term97688, term97688.getClass(), "_name", null);
        setField(term97688, term97688.getClass(), "_wrapperName", null);
        setField(term97688, term97688.getClass(), "_metadata", null);
        setField(term97688, term97688.getClass(), "_includeInViews", null);
        setField(term97688, term97688.getClass(), "_declaredType", null);
        setField(term97688, term97688.getClass(), "_serializer", null);
        term97816 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term97908 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term98088 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term98206 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term97908, term97908.getClass(), "_simpleName", "");
        setField(term97816, term97816.getClass(), "_name", term97908);
        setBooleanField(term97816, term97816.getClass(), "_forSerialization", false);
        setField(term97816, term97816.getClass(), "_ctorParameters", null);
        setField(term97816, term97816.getClass(), "_setters", null);
        setField(term98088, term98088.getClass(), "value", term98206);
        setField(term98088, term98088.getClass(), "next", null);
        setField(term97816, term97816.getClass(), "_fields", term98088);
        setField(term97816, term97816.getClass(), "_annotationIntrospector", null);
        term98322 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term98434 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.DateSerializer"));
        term99720 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term99721 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term99724 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term99725 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term99726 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.DateSerializer"));
        setField(term99721, term99721.getClass(), "_value", "");
        setField(term99721, term99721.getClass(), "_quotedUTF8Ref", null);
        setField(term99721, term99721.getClass(), "_unquotedUTF8Ref", null);
        setField(term99721, term99721.getClass(), "_quotedChars", null);
        setField(term99721, term99721.getClass(), "_jdkSerializeValue", null);
        setField(term99720, term99720.getClass(), "_name", term99721);
        setField(term99720, term99720.getClass(), "_wrapperName", null);
        setField(term99720, term99720.getClass(), "_declaredType", null);
        setField(term99720, term99720.getClass(), "_cfgSerializationType", null);
        setField(term99720, term99720.getClass(), "_nonTrivialBaseType", null);
        setField(term99724, term99724.getClass(), "_annotations", null);
        setField(term99720, term99720.getClass(), "_contextAnnotations", term99724);
        setField(term99725, term99725.getClass(), "_required", null);
        setField(term99725, term99725.getClass(), "_description", null);
        setField(term99725, term99725.getClass(), "_index", null);
        setField(term99725, term99725.getClass(), "_defaultValue", null);
        setField(term99720, term99720.getClass(), "_metadata", term99725);
        setField(term99720, term99720.getClass(), "_format", null);
        setField(term99720, term99720.getClass(), "_member", null);
        setField(term99720, term99720.getClass(), "_accessorMethod", null);
        setField(term99720, term99720.getClass(), "_field", null);
        setField(term99726, term99726.getClass(), "_useTimestamp", null);
        setField(term99726, term99726.getClass(), "_customFormat", null);
        setField(term99726, term99726.getClass(), "_handledType", null);
        setField(term99720, term99720.getClass(), "_serializer", term99726);
        setField(term99720, term99720.getClass(), "_nullSerializer", null);
        setField(term99720, term99720.getClass(), "_typeSerializer", null);
        setField(term99720, term99720.getClass(), "_dynamicSerializers", null);
        setBooleanField(term99720, term99720.getClass(), "_suppressNulls", false);
        setField(term99720, term99720.getClass(), "_suppressableValue", null);
        setField(term99720, term99720.getClass(), "_includeInViews", null);
        setField(term99720, term99720.getClass(), "_internalSettings", null);
        term99727 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term99728 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term99731 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term99732 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setBooleanField(term99727, term99727.getClass(), "_forSerialization", false);
        setField(term99727, term99727.getClass(), "_annotationIntrospector", null);
        setField(term99728, term99728.getClass(), "_simpleName", "");
        setField(term99728, term99728.getClass(), "_namespace", null);
        setField(term99728, term99728.getClass(), "_encodedSimple", null);
        setField(term99727, term99727.getClass(), "_name", term99728);
        setField(term99727, term99727.getClass(), "_internalName", null);
        setField(term99732, term99732.getClass(), "_field", null);
        setField(term99732, term99732.getClass(), "_serialization", null);
        setField(term99732, term99732.getClass(), "_context", null);
        setField(term99732, term99732.getClass(), "_annotations", null);
        setField(term99731, term99731.getClass(), "value", term99732);
        setField(term99731, term99731.getClass(), "next", null);
        setField(term99731, term99731.getClass(), "name", null);
        setBooleanField(term99731, term99731.getClass(), "isNameExplicit", false);
        setBooleanField(term99731, term99731.getClass(), "isVisible", false);
        setBooleanField(term99731, term99731.getClass(), "isMarkedIgnored", false);
        setField(term99727, term99727.getClass(), "_fields", term99731);
        setField(term99727, term99727.getClass(), "_ctorParameters", null);
        setField(term99727, term99727.getClass(), "_getters", null);
        setField(term99727, term99727.getClass(), "_setters", null);
        term99733 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term99733, term99733.getClass(), "_annotations", null);
        term99734 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.DateSerializer"));
        setField(term99734, term99734.getClass(), "_useTimestamp", null);
        setField(term99734, term99734.getClass(), "_customFormat", null);
        setField(term99734, term99734.getClass(), "_handledType", null);
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
        args[0] = term97816;
        args[1] = null;
        args[2] = term98322;
        args[3] = null;
        args[4] = term98434;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term99720));
        assertTrue(recursiveEquals(term97816, term99727));
        assertTrue(recursiveEquals(term98322, term99733));
        assertTrue(recursiveEquals(term98434, term99734));
    }

};


