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

public class BeanPropertyWriter_init_599291025191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73349;
     Object term73739;
     Object term73853;
     Object term73973;
     Object term74079;
     Object term74087;
     Object term74092;
     Object term74093;
     Object term74094;

    public BeanPropertyWriter_init_599291025191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term73221 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object[] term73027 = (Object[]) newArray("java.lang.Class", 0);
        setField(term73221, term73221.getClass(), "_member", null);
        setField(term73221, term73221.getClass(), "_contextAnnotations", null);
        setField(term73221, term73221.getClass(), "_name", null);
        setField(term73221, term73221.getClass(), "_wrapperName", null);
        setField(term73221, term73221.getClass(), "_metadata", null);
        setField(term73221, term73221.getClass(), "_includeInViews", term73027);
        setField(term73221, term73221.getClass(), "_declaredType", null);
        setField(term73221, term73221.getClass(), "_serializer", null);
        setField(term73221, term73221.getClass(), "_dynamicSerializers", null);
        setField(term73221, term73221.getClass(), "_typeSerializer", null);
        setField(term73221, term73221.getClass(), "_cfgSerializationType", null);
        term73349 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term73441 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term73621 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term73441, term73441.getClass(), "_simpleName", "");
        setField(term73349, term73349.getClass(), "_name", term73441);
        setBooleanField(term73349, term73349.getClass(), "_forSerialization", false);
        setField(term73349, term73349.getClass(), "_ctorParameters", null);
        setField(term73349, term73349.getClass(), "_setters", null);
        setField(term73621, term73621.getClass(), "value", null);
        setField(term73621, term73621.getClass(), "next", null);
        setField(term73349, term73349.getClass(), "_fields", term73621);
        setField(term73349, term73349.getClass(), "_annotationIntrospector", null);
        term73739 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term73853 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        term73973 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.CalendarSerializer"));
        term74079 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term74080 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term74083 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term74084 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term74085 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term74086 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.CalendarSerializer"));
        setField(term74080, term74080.getClass(), "_value", "");
        setField(term74080, term74080.getClass(), "_quotedUTF8Ref", null);
        setField(term74080, term74080.getClass(), "_unquotedUTF8Ref", null);
        setField(term74080, term74080.getClass(), "_quotedChars", null);
        setField(term74080, term74080.getClass(), "_jdkSerializeValue", null);
        setField(term74079, term74079.getClass(), "_name", term74080);
        setField(term74079, term74079.getClass(), "_wrapperName", null);
        setField(term74083, term74083.getClass(), "_elementType", null);
        setField(term74083, term74083.getClass(), "_canonicalName", null);
        setField(term74083, term74083.getClass(), "_class", null);
        setIntField(term74083, term74083.getClass(), "_hash", 0);
        setField(term74083, term74083.getClass(), "_valueHandler", null);
        setField(term74083, term74083.getClass(), "_typeHandler", null);
        setBooleanField(term74083, term74083.getClass(), "_asStatic", false);
        setField(term74079, term74079.getClass(), "_declaredType", term74083);
        setField(term74079, term74079.getClass(), "_cfgSerializationType", null);
        setField(term74079, term74079.getClass(), "_nonTrivialBaseType", null);
        setField(term74079, term74079.getClass(), "_contextAnnotations", null);
        setField(term74084, term74084.getClass(), "_required", null);
        setField(term74084, term74084.getClass(), "_description", null);
        setField(term74084, term74084.getClass(), "_index", null);
        setField(term74084, term74084.getClass(), "_defaultValue", null);
        setField(term74079, term74079.getClass(), "_metadata", term74084);
        setField(term74079, term74079.getClass(), "_format", null);
        setField(term74085, term74085.getClass(), "_field", null);
        setField(term74085, term74085.getClass(), "_serialization", null);
        setField(term74085, term74085.getClass(), "_context", null);
        setField(term74085, term74085.getClass(), "_annotations", null);
        setField(term74079, term74079.getClass(), "_member", term74085);
        setField(term74079, term74079.getClass(), "_accessorMethod", null);
        setField(term74079, term74079.getClass(), "_field", null);
        setField(term74086, term74086.getClass(), "_useTimestamp", null);
        setField(term74086, term74086.getClass(), "_customFormat", null);
        setField(term74086, term74086.getClass(), "_handledType", null);
        setField(term74079, term74079.getClass(), "_serializer", term74086);
        setField(term74079, term74079.getClass(), "_nullSerializer", null);
        setField(term74079, term74079.getClass(), "_typeSerializer", null);
        setField(term74079, term74079.getClass(), "_dynamicSerializers", null);
        setBooleanField(term74079, term74079.getClass(), "_suppressNulls", false);
        setField(term74079, term74079.getClass(), "_suppressableValue", null);
        setField(term74079, term74079.getClass(), "_includeInViews", null);
        setField(term74079, term74079.getClass(), "_internalSettings", null);
        term74087 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term74088 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term74091 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term74087, term74087.getClass(), "_forSerialization", false);
        setField(term74087, term74087.getClass(), "_annotationIntrospector", null);
        setField(term74088, term74088.getClass(), "_simpleName", "");
        setField(term74088, term74088.getClass(), "_namespace", null);
        setField(term74088, term74088.getClass(), "_encodedSimple", null);
        setField(term74087, term74087.getClass(), "_name", term74088);
        setField(term74087, term74087.getClass(), "_internalName", null);
        setField(term74091, term74091.getClass(), "value", null);
        setField(term74091, term74091.getClass(), "next", null);
        setField(term74091, term74091.getClass(), "name", null);
        setBooleanField(term74091, term74091.getClass(), "isNameExplicit", false);
        setBooleanField(term74091, term74091.getClass(), "isVisible", false);
        setBooleanField(term74091, term74091.getClass(), "isMarkedIgnored", false);
        setField(term74087, term74087.getClass(), "_fields", term74091);
        setField(term74087, term74087.getClass(), "_ctorParameters", null);
        setField(term74087, term74087.getClass(), "_getters", null);
        setField(term74087, term74087.getClass(), "_setters", null);
        term74092 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term74092, term74092.getClass(), "_field", null);
        setField(term74092, term74092.getClass(), "_serialization", null);
        setField(term74092, term74092.getClass(), "_context", null);
        setField(term74092, term74092.getClass(), "_annotations", null);
        term74093 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term74093, term74093.getClass(), "_elementType", null);
        setField(term74093, term74093.getClass(), "_canonicalName", null);
        setField(term74093, term74093.getClass(), "_class", null);
        setIntField(term74093, term74093.getClass(), "_hash", 0);
        setField(term74093, term74093.getClass(), "_valueHandler", null);
        setField(term74093, term74093.getClass(), "_typeHandler", null);
        setBooleanField(term74093, term74093.getClass(), "_asStatic", false);
        term74094 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.CalendarSerializer"));
        setField(term74094, term74094.getClass(), "_useTimestamp", null);
        setField(term74094, term74094.getClass(), "_customFormat", null);
        setField(term74094, term74094.getClass(), "_handledType", null);
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
        args[0] = term73349;
        args[1] = term73739;
        args[2] = null;
        args[3] = term73853;
        args[4] = term73973;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term74079));
        assertTrue(recursiveEquals(term73349, term74087));
        assertTrue(recursiveEquals(term73739, term74092));
        assertTrue(recursiveEquals(term73853, term74093));
        assertTrue(recursiveEquals(term73973, term74094));
    }

};


