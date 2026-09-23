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

public class BeanPropertyWriter_init_599291025195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75523;
     Object term75917;
     Object term76758;
     Object term76764;
     Object term76769;

    public BeanPropertyWriter_init_599291025195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term75063 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term75183 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term75299 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object[] term74876 = (Object[]) newArray("java.lang.Class", 0);
        Object term75395 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term75063, term75063.getClass(), "_member", term75183);
        setField(term75063, term75063.getClass(), "_contextAnnotations", term75299);
        setField(term75063, term75063.getClass(), "_name", null);
        setField(term75063, term75063.getClass(), "_wrapperName", null);
        setField(term75063, term75063.getClass(), "_metadata", null);
        setField(term75063, term75063.getClass(), "_includeInViews", term74876);
        setField(term75063, term75063.getClass(), "_declaredType", term75395);
        setField(term75063, term75063.getClass(), "_serializer", null);
        term75523 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term75615 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term75795 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term75615, term75615.getClass(), "_simpleName", "");
        setField(term75523, term75523.getClass(), "_name", term75615);
        setBooleanField(term75523, term75523.getClass(), "_forSerialization", true);
        setField(term75523, term75523.getClass(), "_getters", null);
        setField(term75795, term75795.getClass(), "value", null);
        setField(term75795, term75795.getClass(), "next", null);
        setField(term75523, term75523.getClass(), "_fields", term75795);
        setField(term75523, term75523.getClass(), "_annotationIntrospector", null);
        term75917 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer"));
        term76758 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term76759 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term76762 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term76763 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer"));
        setField(term76759, term76759.getClass(), "_value", "");
        setField(term76759, term76759.getClass(), "_quotedUTF8Ref", null);
        setField(term76759, term76759.getClass(), "_unquotedUTF8Ref", null);
        setField(term76759, term76759.getClass(), "_quotedChars", null);
        setField(term76759, term76759.getClass(), "_jdkSerializeValue", null);
        setField(term76758, term76758.getClass(), "_name", term76759);
        setField(term76758, term76758.getClass(), "_wrapperName", null);
        setField(term76758, term76758.getClass(), "_declaredType", null);
        setField(term76758, term76758.getClass(), "_cfgSerializationType", null);
        setField(term76758, term76758.getClass(), "_nonTrivialBaseType", null);
        setField(term76758, term76758.getClass(), "_contextAnnotations", null);
        setField(term76762, term76762.getClass(), "_required", null);
        setField(term76762, term76762.getClass(), "_description", null);
        setField(term76762, term76762.getClass(), "_index", null);
        setField(term76762, term76762.getClass(), "_defaultValue", null);
        setField(term76758, term76758.getClass(), "_metadata", term76762);
        setField(term76758, term76758.getClass(), "_format", null);
        setField(term76758, term76758.getClass(), "_member", null);
        setField(term76758, term76758.getClass(), "_accessorMethod", null);
        setField(term76758, term76758.getClass(), "_field", null);
        setField(term76763, term76763.getClass(), "_property", null);
        setBooleanField(term76763, term76763.getClass(), "_valueTypeIsStatic", false);
        setField(term76763, term76763.getClass(), "_entryType", null);
        setField(term76763, term76763.getClass(), "_keyType", null);
        setField(term76763, term76763.getClass(), "_valueType", null);
        setField(term76763, term76763.getClass(), "_keySerializer", null);
        setField(term76763, term76763.getClass(), "_valueSerializer", null);
        setField(term76763, term76763.getClass(), "_valueTypeSerializer", null);
        setField(term76763, term76763.getClass(), "_dynamicValueSerializers", null);
        setField(term76763, term76763.getClass(), "_handledType", null);
        setField(term76758, term76758.getClass(), "_serializer", term76763);
        setField(term76758, term76758.getClass(), "_nullSerializer", null);
        setField(term76758, term76758.getClass(), "_typeSerializer", null);
        setField(term76758, term76758.getClass(), "_dynamicSerializers", null);
        setBooleanField(term76758, term76758.getClass(), "_suppressNulls", false);
        setField(term76758, term76758.getClass(), "_suppressableValue", null);
        setField(term76758, term76758.getClass(), "_includeInViews", null);
        setField(term76758, term76758.getClass(), "_internalSettings", null);
        term76764 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term76765 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term76768 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term76764, term76764.getClass(), "_forSerialization", true);
        setField(term76764, term76764.getClass(), "_annotationIntrospector", null);
        setField(term76765, term76765.getClass(), "_simpleName", "");
        setField(term76765, term76765.getClass(), "_namespace", null);
        setField(term76765, term76765.getClass(), "_encodedSimple", null);
        setField(term76764, term76764.getClass(), "_name", term76765);
        setField(term76764, term76764.getClass(), "_internalName", null);
        setField(term76768, term76768.getClass(), "value", null);
        setField(term76768, term76768.getClass(), "next", null);
        setField(term76768, term76768.getClass(), "name", null);
        setBooleanField(term76768, term76768.getClass(), "isNameExplicit", false);
        setBooleanField(term76768, term76768.getClass(), "isVisible", false);
        setBooleanField(term76768, term76768.getClass(), "isMarkedIgnored", false);
        setField(term76764, term76764.getClass(), "_fields", term76768);
        setField(term76764, term76764.getClass(), "_ctorParameters", null);
        setField(term76764, term76764.getClass(), "_getters", null);
        setField(term76764, term76764.getClass(), "_setters", null);
        term76769 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer"));
        setField(term76769, term76769.getClass(), "_property", null);
        setBooleanField(term76769, term76769.getClass(), "_valueTypeIsStatic", false);
        setField(term76769, term76769.getClass(), "_entryType", null);
        setField(term76769, term76769.getClass(), "_keyType", null);
        setField(term76769, term76769.getClass(), "_valueType", null);
        setField(term76769, term76769.getClass(), "_keySerializer", null);
        setField(term76769, term76769.getClass(), "_valueSerializer", null);
        setField(term76769, term76769.getClass(), "_valueTypeSerializer", null);
        setField(term76769, term76769.getClass(), "_dynamicValueSerializers", null);
        setField(term76769, term76769.getClass(), "_handledType", null);
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
        args[0] = term75523;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term75917;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term76758));
        assertTrue(recursiveEquals(term75523, term76764));
        assertTrue(recursiveEquals(term75917, term76769));
    }

};


