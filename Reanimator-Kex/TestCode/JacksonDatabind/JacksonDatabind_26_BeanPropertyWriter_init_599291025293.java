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

public class BeanPropertyWriter_init_599291025293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152752;
     Object term153284;
     Object term153446;
     Object term154536;
     Object term154543;
     Object term154549;
     Object term154550;

    public BeanPropertyWriter_init_599291025293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term152504 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term152624 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object[] term152260 = (Object[]) newArray("java.lang.Class", 0);
        setField(term152504, term152504.getClass(), "_member", term152624);
        setField(term152504, term152504.getClass(), "_contextAnnotations", null);
        setField(term152504, term152504.getClass(), "_name", null);
        setField(term152504, term152504.getClass(), "_wrapperName", null);
        setField(term152504, term152504.getClass(), "_metadata", null);
        setField(term152504, term152504.getClass(), "_includeInViews", term152260);
        setField(term152504, term152504.getClass(), "_declaredType", null);
        setField(term152504, term152504.getClass(), "_serializer", null);
        term152752 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term152844 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term153024 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term153168 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term152844, term152844.getClass(), "_simpleName", "");
        setField(term152752, term152752.getClass(), "_name", term152844);
        setBooleanField(term152752, term152752.getClass(), "_forSerialization", false);
        setField(term152752, term152752.getClass(), "_ctorParameters", null);
        setField(term152752, term152752.getClass(), "_setters", null);
        setField(term153024, term153024.getClass(), "value", null);
        setField(term153024, term153024.getClass(), "next", null);
        setField(term152752, term152752.getClass(), "_fields", term153024);
        setField(term152752, term152752.getClass(), "_annotationIntrospector", term153168);
        term153284 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term153446 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$CharArraySerializer"));
        term154536 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term154537 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term154540 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term154541 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term154542 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$CharArraySerializer"));
        setField(term154537, term154537.getClass(), "_value", "");
        setField(term154537, term154537.getClass(), "_quotedUTF8Ref", null);
        setField(term154537, term154537.getClass(), "_unquotedUTF8Ref", null);
        setField(term154537, term154537.getClass(), "_quotedChars", null);
        setField(term154537, term154537.getClass(), "_jdkSerializeValue", null);
        setField(term154536, term154536.getClass(), "_name", term154537);
        setField(term154536, term154536.getClass(), "_wrapperName", null);
        setField(term154536, term154536.getClass(), "_declaredType", null);
        setField(term154536, term154536.getClass(), "_cfgSerializationType", null);
        setField(term154536, term154536.getClass(), "_nonTrivialBaseType", null);
        setField(term154540, term154540.getClass(), "_annotations", null);
        setField(term154536, term154536.getClass(), "_contextAnnotations", term154540);
        setField(term154541, term154541.getClass(), "_required", null);
        setField(term154541, term154541.getClass(), "_description", null);
        setField(term154541, term154541.getClass(), "_index", null);
        setField(term154541, term154541.getClass(), "_defaultValue", null);
        setField(term154536, term154536.getClass(), "_metadata", term154541);
        setField(term154536, term154536.getClass(), "_format", null);
        setField(term154536, term154536.getClass(), "_member", null);
        setField(term154536, term154536.getClass(), "_accessorMethod", null);
        setField(term154536, term154536.getClass(), "_field", null);
        setField(term154542, term154542.getClass(), "_handledType", null);
        setField(term154536, term154536.getClass(), "_serializer", term154542);
        setField(term154536, term154536.getClass(), "_nullSerializer", null);
        setField(term154536, term154536.getClass(), "_typeSerializer", null);
        setField(term154536, term154536.getClass(), "_dynamicSerializers", null);
        setBooleanField(term154536, term154536.getClass(), "_suppressNulls", false);
        setField(term154536, term154536.getClass(), "_suppressableValue", null);
        setField(term154536, term154536.getClass(), "_includeInViews", null);
        setField(term154536, term154536.getClass(), "_internalSettings", null);
        term154543 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term154544 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term154545 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term154548 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term154543, term154543.getClass(), "_forSerialization", false);
        setField(term154543, term154543.getClass(), "_annotationIntrospector", term154544);
        setField(term154545, term154545.getClass(), "_simpleName", "");
        setField(term154545, term154545.getClass(), "_namespace", null);
        setField(term154545, term154545.getClass(), "_encodedSimple", null);
        setField(term154543, term154543.getClass(), "_name", term154545);
        setField(term154543, term154543.getClass(), "_internalName", null);
        setField(term154548, term154548.getClass(), "value", null);
        setField(term154548, term154548.getClass(), "next", null);
        setField(term154548, term154548.getClass(), "name", null);
        setBooleanField(term154548, term154548.getClass(), "isNameExplicit", false);
        setBooleanField(term154548, term154548.getClass(), "isVisible", false);
        setBooleanField(term154548, term154548.getClass(), "isMarkedIgnored", false);
        setField(term154543, term154543.getClass(), "_fields", term154548);
        setField(term154543, term154543.getClass(), "_ctorParameters", null);
        setField(term154543, term154543.getClass(), "_getters", null);
        setField(term154543, term154543.getClass(), "_setters", null);
        term154549 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term154549, term154549.getClass(), "_annotations", null);
        term154550 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$CharArraySerializer"));
        setField(term154550, term154550.getClass(), "_handledType", null);
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
        args[0] = term152752;
        args[1] = null;
        args[2] = term153284;
        args[3] = null;
        args[4] = term153446;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term154536));
        assertTrue(recursiveEquals(term152752, term154543));
        assertTrue(recursiveEquals(term153284, term154549));
        assertTrue(recursiveEquals(term153446, term154550));
    }

};


