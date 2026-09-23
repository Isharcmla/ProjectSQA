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

public class BeanPropertyWriter_init_599291025390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236657;
     Object term237167;
     Object term239789;
     Object term239815;
     Object term239821;

    public BeanPropertyWriter_init_599291025390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term236389 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object[] term236189 = (Object[]) newArray("java.lang.Class", 0);
        Object term236529 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Multi"));
        setField(term236389, term236389.getClass(), "_member", null);
        setField(term236389, term236389.getClass(), "_contextAnnotations", null);
        setField(term236389, term236389.getClass(), "_name", null);
        setField(term236389, term236389.getClass(), "_wrapperName", null);
        setField(term236389, term236389.getClass(), "_metadata", null);
        setField(term236389, term236389.getClass(), "_includeInViews", term236189);
        setField(term236389, term236389.getClass(), "_declaredType", null);
        setField(term236389, term236389.getClass(), "_serializer", null);
        setField(term236389, term236389.getClass(), "_dynamicSerializers", term236529);
        setField(term236389, term236389.getClass(), "_typeSerializer", null);
        setField(term236389, term236389.getClass(), "_cfgSerializationType", null);
        term236657 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term236749 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term236929 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term237047 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term236749, term236749.getClass(), "_simpleName", "");
        setField(term236657, term236657.getClass(), "_name", term236749);
        setBooleanField(term236657, term236657.getClass(), "_forSerialization", true);
        setField(term236657, term236657.getClass(), "_getters", null);
        setField(term236929, term236929.getClass(), "value", term237047);
        setField(term236929, term236929.getClass(), "next", null);
        setField(term236657, term236657.getClass(), "_fields", term236929);
        setField(term236657, term236657.getClass(), "_annotationIntrospector", null);
        Class<? extends Object> term239863 = Class.forName((String) "java.nio.ShortBuffer");
        Object[] term239954 = (Object[]) newArray("java.lang.Class", 0);
        Method term237221 = ((Class) term239863).getDeclaredMethod((String) "flip", (Class[]) term239954);
        ((Method) term237221).setAccessible(false);
        term237167 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term237167, term237167.getClass(), "_method", term237221);
        Class<? extends Object> term239986 = Class.forName((String) "java.util.stream.StreamShape");
        Class<? extends Object> term240152 = Class.forName((String) "java.lang.String");
        Object[] term240153 = (Object[]) newArray("java.lang.Class", 1);
        setElement(term240153, 0, term240152);
        Method term239795 = ((Class) term239986).getDeclaredMethod((String) "valueOf", (Class[]) term240153);
        ((Method) term239795).setAccessible(false);
        term239789 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term239790 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term239793 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term239794 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term239814 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term239790, term239790.getClass(), "_value", "");
        setField(term239790, term239790.getClass(), "_quotedUTF8Ref", null);
        setField(term239790, term239790.getClass(), "_unquotedUTF8Ref", null);
        setField(term239790, term239790.getClass(), "_quotedChars", null);
        setField(term239790, term239790.getClass(), "_jdkSerializeValue", null);
        setField(term239789, term239789.getClass(), "_name", term239790);
        setField(term239789, term239789.getClass(), "_wrapperName", null);
        setField(term239789, term239789.getClass(), "_declaredType", null);
        setField(term239789, term239789.getClass(), "_cfgSerializationType", null);
        setField(term239789, term239789.getClass(), "_nonTrivialBaseType", null);
        setField(term239789, term239789.getClass(), "_contextAnnotations", null);
        setField(term239793, term239793.getClass(), "_required", null);
        setField(term239793, term239793.getClass(), "_description", null);
        setField(term239793, term239793.getClass(), "_index", null);
        setField(term239793, term239793.getClass(), "_defaultValue", null);
        setField(term239789, term239789.getClass(), "_metadata", term239793);
        setField(term239789, term239789.getClass(), "_format", null);
        setField(term239794, term239794.getClass(), "_method", term239795);
        setField(term239794, term239794.getClass(), "_paramClasses", null);
        setField(term239794, term239794.getClass(), "_serialization", null);
        setField(term239794, term239794.getClass(), "_paramAnnotations", null);
        setField(term239794, term239794.getClass(), "_context", null);
        setField(term239794, term239794.getClass(), "_annotations", null);
        setField(term239789, term239789.getClass(), "_member", term239794);
        setField(term239789, term239789.getClass(), "_accessorMethod", term239795);
        setField(term239789, term239789.getClass(), "_field", null);
        setField(term239789, term239789.getClass(), "_serializer", null);
        setField(term239789, term239789.getClass(), "_nullSerializer", null);
        setField(term239789, term239789.getClass(), "_typeSerializer", null);
        setBooleanField(term239814, term239814.getClass(), "_resetWhenFull", false);
        setField(term239789, term239789.getClass(), "_dynamicSerializers", term239814);
        setBooleanField(term239789, term239789.getClass(), "_suppressNulls", false);
        setField(term239789, term239789.getClass(), "_suppressableValue", null);
        setField(term239789, term239789.getClass(), "_includeInViews", null);
        setField(term239789, term239789.getClass(), "_internalSettings", null);
        term239815 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term239816 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term239819 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term239820 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setBooleanField(term239815, term239815.getClass(), "_forSerialization", true);
        setField(term239815, term239815.getClass(), "_annotationIntrospector", null);
        setField(term239816, term239816.getClass(), "_simpleName", "");
        setField(term239816, term239816.getClass(), "_namespace", null);
        setField(term239816, term239816.getClass(), "_encodedSimple", null);
        setField(term239815, term239815.getClass(), "_name", term239816);
        setField(term239815, term239815.getClass(), "_internalName", null);
        setField(term239820, term239820.getClass(), "_field", null);
        setField(term239820, term239820.getClass(), "_serialization", null);
        setField(term239820, term239820.getClass(), "_context", null);
        setField(term239820, term239820.getClass(), "_annotations", null);
        setField(term239819, term239819.getClass(), "value", term239820);
        setField(term239819, term239819.getClass(), "next", null);
        setField(term239819, term239819.getClass(), "name", null);
        setBooleanField(term239819, term239819.getClass(), "isNameExplicit", false);
        setBooleanField(term239819, term239819.getClass(), "isVisible", false);
        setBooleanField(term239819, term239819.getClass(), "isMarkedIgnored", false);
        setField(term239815, term239815.getClass(), "_fields", term239819);
        setField(term239815, term239815.getClass(), "_ctorParameters", null);
        setField(term239815, term239815.getClass(), "_getters", null);
        setField(term239815, term239815.getClass(), "_setters", null);
        Class<? extends Object> term240643 = Class.forName((String) "java.util.stream.SortedOps$AbstractIntSortingSink");
        Object[] term240903 = (Object[]) newArray("java.lang.Class", 0);
        Method term239822 = ((Class) term240643).getDeclaredMethod((String) "cancellationRequested", (Class[]) term240903);
        ((Method) term239822).setAccessible(false);
        term239821 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term239821, term239821.getClass(), "_method", term239822);
        setField(term239821, term239821.getClass(), "_paramClasses", null);
        setField(term239821, term239821.getClass(), "_serialization", null);
        setField(term239821, term239821.getClass(), "_paramAnnotations", null);
        setField(term239821, term239821.getClass(), "_context", null);
        setField(term239821, term239821.getClass(), "_annotations", null);
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
        args[0] = term236657;
        args[1] = term237167;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term239789));
        assertTrue(recursiveEquals(term236657, term239815));
        assertTrue(recursiveEquals(term237167, term239821));
    }

};


