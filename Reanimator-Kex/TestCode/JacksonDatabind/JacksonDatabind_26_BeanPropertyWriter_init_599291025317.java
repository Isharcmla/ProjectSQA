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

public class BeanPropertyWriter_init_599291025317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174546;
     Object term175056;
     Object term175228;
     Object term177164;
     Object term177187;
     Object term177193;
     Object term177210;

    public BeanPropertyWriter_init_599291025317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term174326 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term174418 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object[] term174126 = (Object[]) newArray("java.lang.Class", 0);
        setField(term174326, term174326.getClass(), "_member", null);
        setField(term174326, term174326.getClass(), "_contextAnnotations", null);
        setField(term174326, term174326.getClass(), "_name", null);
        setField(term174326, term174326.getClass(), "_wrapperName", term174418);
        setField(term174326, term174326.getClass(), "_metadata", null);
        setField(term174326, term174326.getClass(), "_includeInViews", term174126);
        setField(term174326, term174326.getClass(), "_declaredType", null);
        setField(term174326, term174326.getClass(), "_serializer", null);
        setField(term174326, term174326.getClass(), "_dynamicSerializers", null);
        setField(term174326, term174326.getClass(), "_typeSerializer", null);
        setField(term174326, term174326.getClass(), "_cfgSerializationType", null);
        term174546 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term174638 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term174818 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term174936 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term174638, term174638.getClass(), "_simpleName", "");
        setField(term174546, term174546.getClass(), "_name", term174638);
        setBooleanField(term174546, term174546.getClass(), "_forSerialization", false);
        setField(term174546, term174546.getClass(), "_ctorParameters", null);
        setField(term174546, term174546.getClass(), "_setters", null);
        setField(term174818, term174818.getClass(), "value", term174936);
        setField(term174818, term174818.getClass(), "next", null);
        setField(term174546, term174546.getClass(), "_fields", term174818);
        setField(term174546, term174546.getClass(), "_annotationIntrospector", null);
        Class<? extends Object> term177272 = Class.forName((String) "java.util.concurrent.ConcurrentSkipListMap$EntrySpliterator");
        Object[] term177541 = (Object[]) newArray("java.lang.Class", 0);
        Method term175110 = ((Class) term177272).getDeclaredMethod((String) "characteristics", (Class[]) term177541);
        ((Method) term175110).setAccessible(false);
        term175056 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term175056, term175056.getClass(), "_method", term175110);
        term175228 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.EnumMapSerializer"));
        Class<? extends Object> term177594 = Class.forName((String) "java.util.SplittableRandom$RandomLongsSpliterator");
        Object[] term177821 = (Object[]) newArray("java.lang.Class", 0);
        Method term177170 = ((Class) term177594).getDeclaredMethod((String) "trySplit", (Class[]) term177821);
        ((Method) term177170).setAccessible(false);
        term177164 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term177165 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term177168 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term177169 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term177186 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.EnumMapSerializer"));
        setField(term177165, term177165.getClass(), "_value", "");
        setField(term177165, term177165.getClass(), "_quotedUTF8Ref", null);
        setField(term177165, term177165.getClass(), "_unquotedUTF8Ref", null);
        setField(term177165, term177165.getClass(), "_quotedChars", null);
        setField(term177165, term177165.getClass(), "_jdkSerializeValue", null);
        setField(term177164, term177164.getClass(), "_name", term177165);
        setField(term177164, term177164.getClass(), "_wrapperName", null);
        setField(term177164, term177164.getClass(), "_declaredType", null);
        setField(term177164, term177164.getClass(), "_cfgSerializationType", null);
        setField(term177164, term177164.getClass(), "_nonTrivialBaseType", null);
        setField(term177164, term177164.getClass(), "_contextAnnotations", null);
        setField(term177168, term177168.getClass(), "_required", null);
        setField(term177168, term177168.getClass(), "_description", null);
        setField(term177168, term177168.getClass(), "_index", null);
        setField(term177168, term177168.getClass(), "_defaultValue", null);
        setField(term177164, term177164.getClass(), "_metadata", term177168);
        setField(term177164, term177164.getClass(), "_format", null);
        setField(term177169, term177169.getClass(), "_method", term177170);
        setField(term177169, term177169.getClass(), "_paramClasses", null);
        setField(term177169, term177169.getClass(), "_serialization", null);
        setField(term177169, term177169.getClass(), "_paramAnnotations", null);
        setField(term177169, term177169.getClass(), "_context", null);
        setField(term177169, term177169.getClass(), "_annotations", null);
        setField(term177164, term177164.getClass(), "_member", term177169);
        setField(term177164, term177164.getClass(), "_accessorMethod", term177170);
        setField(term177164, term177164.getClass(), "_field", null);
        setBooleanField(term177186, term177186.getClass(), "_staticTyping", false);
        setField(term177186, term177186.getClass(), "_property", null);
        setField(term177186, term177186.getClass(), "_keyEnums", null);
        setField(term177186, term177186.getClass(), "_valueType", null);
        setField(term177186, term177186.getClass(), "_valueSerializer", null);
        setField(term177186, term177186.getClass(), "_valueTypeSerializer", null);
        setField(term177186, term177186.getClass(), "_handledType", null);
        setField(term177164, term177164.getClass(), "_serializer", term177186);
        setField(term177164, term177164.getClass(), "_nullSerializer", null);
        setField(term177164, term177164.getClass(), "_typeSerializer", null);
        setField(term177164, term177164.getClass(), "_dynamicSerializers", null);
        setBooleanField(term177164, term177164.getClass(), "_suppressNulls", false);
        setField(term177164, term177164.getClass(), "_suppressableValue", null);
        setField(term177164, term177164.getClass(), "_includeInViews", null);
        setField(term177164, term177164.getClass(), "_internalSettings", null);
        term177187 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term177188 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term177191 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term177192 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setBooleanField(term177187, term177187.getClass(), "_forSerialization", false);
        setField(term177187, term177187.getClass(), "_annotationIntrospector", null);
        setField(term177188, term177188.getClass(), "_simpleName", "");
        setField(term177188, term177188.getClass(), "_namespace", null);
        setField(term177188, term177188.getClass(), "_encodedSimple", null);
        setField(term177187, term177187.getClass(), "_name", term177188);
        setField(term177187, term177187.getClass(), "_internalName", null);
        setField(term177192, term177192.getClass(), "_field", null);
        setField(term177192, term177192.getClass(), "_serialization", null);
        setField(term177192, term177192.getClass(), "_context", null);
        setField(term177192, term177192.getClass(), "_annotations", null);
        setField(term177191, term177191.getClass(), "value", term177192);
        setField(term177191, term177191.getClass(), "next", null);
        setField(term177191, term177191.getClass(), "name", null);
        setBooleanField(term177191, term177191.getClass(), "isNameExplicit", false);
        setBooleanField(term177191, term177191.getClass(), "isVisible", false);
        setBooleanField(term177191, term177191.getClass(), "isMarkedIgnored", false);
        setField(term177187, term177187.getClass(), "_fields", term177191);
        setField(term177187, term177187.getClass(), "_ctorParameters", null);
        setField(term177187, term177187.getClass(), "_getters", null);
        setField(term177187, term177187.getClass(), "_setters", null);
        Class<? extends Object> term179377 = Class.forName((String) "com.fasterxml.jackson.databind.jsonschema.JsonSchema");
        Object[] term179616 = (Object[]) newArray("java.lang.Class", 0);
        Method term177194 = ((Class) term179377).getDeclaredMethod((String) "hashCode", (Class[]) term179616);
        ((Method) term177194).setAccessible(false);
        term177193 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term177193, term177193.getClass(), "_method", term177194);
        setField(term177193, term177193.getClass(), "_paramClasses", null);
        setField(term177193, term177193.getClass(), "_serialization", null);
        setField(term177193, term177193.getClass(), "_paramAnnotations", null);
        setField(term177193, term177193.getClass(), "_context", null);
        setField(term177193, term177193.getClass(), "_annotations", null);
        term177210 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.EnumMapSerializer"));
        setBooleanField(term177210, term177210.getClass(), "_staticTyping", false);
        setField(term177210, term177210.getClass(), "_property", null);
        setField(term177210, term177210.getClass(), "_keyEnums", null);
        setField(term177210, term177210.getClass(), "_valueType", null);
        setField(term177210, term177210.getClass(), "_valueSerializer", null);
        setField(term177210, term177210.getClass(), "_valueTypeSerializer", null);
        setField(term177210, term177210.getClass(), "_handledType", null);
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
        args[0] = term174546;
        args[1] = term175056;
        args[2] = null;
        args[3] = null;
        args[4] = term175228;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term177164));
        assertTrue(recursiveEquals(term174546, term177187));
        assertTrue(recursiveEquals(term175056, term177193));
        assertTrue(recursiveEquals(term175228, term177210));
    }

};


