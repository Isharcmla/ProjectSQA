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

public class BeanPropertyWriter_init_599291025229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100263;
     Object term100653;
     Object term100769;
     Object term100865;
     Object term101755;
     Object term101764;
     Object term101769;
     Object term101770;
     Object term101771;

    public BeanPropertyWriter_init_599291025229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term99945 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term100037 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object[] term99753 = (Object[]) newArray("java.lang.Class", 0);
        Object term100135 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term99945, term99945.getClass(), "_member", null);
        setField(term99945, term99945.getClass(), "_contextAnnotations", null);
        setField(term99945, term99945.getClass(), "_name", null);
        setField(term99945, term99945.getClass(), "_wrapperName", term100037);
        setField(term99945, term99945.getClass(), "_metadata", null);
        setField(term99945, term99945.getClass(), "_includeInViews", term99753);
        setField(term99945, term99945.getClass(), "_declaredType", null);
        setField(term99945, term99945.getClass(), "_serializer", null);
        setField(term99945, term99945.getClass(), "_dynamicSerializers", null);
        setField(term99945, term99945.getClass(), "_typeSerializer", null);
        setField(term99945, term99945.getClass(), "_cfgSerializationType", term100135);
        term100263 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term100355 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term100535 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term100355, term100355.getClass(), "_simpleName", "");
        setField(term100263, term100263.getClass(), "_name", term100355);
        setBooleanField(term100263, term100263.getClass(), "_forSerialization", true);
        setField(term100263, term100263.getClass(), "_getters", null);
        setField(term100535, term100535.getClass(), "value", null);
        setField(term100535, term100535.getClass(), "next", null);
        setField(term100263, term100263.getClass(), "_fields", term100535);
        setField(term100263, term100263.getClass(), "_annotationIntrospector", null);
        term100653 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term100769 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term100865 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        term101755 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term101756 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term101759 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term101760 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term101761 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term101762 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        Object term101763 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term101756, term101756.getClass(), "_value", "");
        setField(term101756, term101756.getClass(), "_quotedUTF8Ref", null);
        setField(term101756, term101756.getClass(), "_unquotedUTF8Ref", null);
        setField(term101756, term101756.getClass(), "_quotedChars", null);
        setField(term101756, term101756.getClass(), "_jdkSerializeValue", null);
        setField(term101755, term101755.getClass(), "_name", term101756);
        setField(term101755, term101755.getClass(), "_wrapperName", null);
        setField(term101759, term101759.getClass(), "_componentType", null);
        setField(term101759, term101759.getClass(), "_emptyArray", null);
        setField(term101759, term101759.getClass(), "_canonicalName", null);
        setField(term101759, term101759.getClass(), "_class", null);
        setIntField(term101759, term101759.getClass(), "_hash", 0);
        setField(term101759, term101759.getClass(), "_valueHandler", null);
        setField(term101759, term101759.getClass(), "_typeHandler", null);
        setBooleanField(term101759, term101759.getClass(), "_asStatic", false);
        setField(term101755, term101755.getClass(), "_declaredType", term101759);
        setField(term101755, term101755.getClass(), "_cfgSerializationType", null);
        setField(term101755, term101755.getClass(), "_nonTrivialBaseType", null);
        setField(term101760, term101760.getClass(), "_annotations", null);
        setField(term101755, term101755.getClass(), "_contextAnnotations", term101760);
        setField(term101761, term101761.getClass(), "_required", null);
        setField(term101761, term101761.getClass(), "_description", null);
        setField(term101761, term101761.getClass(), "_index", null);
        setField(term101761, term101761.getClass(), "_defaultValue", null);
        setField(term101755, term101755.getClass(), "_metadata", term101761);
        setField(term101755, term101755.getClass(), "_format", null);
        setField(term101762, term101762.getClass(), "_field", null);
        setField(term101762, term101762.getClass(), "_serialization", null);
        setField(term101762, term101762.getClass(), "_context", null);
        setField(term101762, term101762.getClass(), "_annotations", null);
        setField(term101755, term101755.getClass(), "_member", term101762);
        setField(term101755, term101755.getClass(), "_accessorMethod", null);
        setField(term101755, term101755.getClass(), "_field", null);
        setField(term101755, term101755.getClass(), "_serializer", null);
        setField(term101755, term101755.getClass(), "_nullSerializer", null);
        setField(term101755, term101755.getClass(), "_typeSerializer", null);
        setBooleanField(term101763, term101763.getClass(), "_resetWhenFull", false);
        setField(term101755, term101755.getClass(), "_dynamicSerializers", term101763);
        setBooleanField(term101755, term101755.getClass(), "_suppressNulls", false);
        setField(term101755, term101755.getClass(), "_suppressableValue", null);
        setField(term101755, term101755.getClass(), "_includeInViews", null);
        setField(term101755, term101755.getClass(), "_internalSettings", null);
        term101764 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term101765 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term101768 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term101764, term101764.getClass(), "_forSerialization", true);
        setField(term101764, term101764.getClass(), "_annotationIntrospector", null);
        setField(term101765, term101765.getClass(), "_simpleName", "");
        setField(term101765, term101765.getClass(), "_namespace", null);
        setField(term101765, term101765.getClass(), "_encodedSimple", null);
        setField(term101764, term101764.getClass(), "_name", term101765);
        setField(term101764, term101764.getClass(), "_internalName", null);
        setField(term101768, term101768.getClass(), "value", null);
        setField(term101768, term101768.getClass(), "next", null);
        setField(term101768, term101768.getClass(), "name", null);
        setBooleanField(term101768, term101768.getClass(), "isNameExplicit", false);
        setBooleanField(term101768, term101768.getClass(), "isVisible", false);
        setBooleanField(term101768, term101768.getClass(), "isMarkedIgnored", false);
        setField(term101764, term101764.getClass(), "_fields", term101768);
        setField(term101764, term101764.getClass(), "_ctorParameters", null);
        setField(term101764, term101764.getClass(), "_getters", null);
        setField(term101764, term101764.getClass(), "_setters", null);
        term101769 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term101769, term101769.getClass(), "_field", null);
        setField(term101769, term101769.getClass(), "_serialization", null);
        setField(term101769, term101769.getClass(), "_context", null);
        setField(term101769, term101769.getClass(), "_annotations", null);
        term101770 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term101770, term101770.getClass(), "_annotations", null);
        term101771 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term101771, term101771.getClass(), "_componentType", null);
        setField(term101771, term101771.getClass(), "_emptyArray", null);
        setField(term101771, term101771.getClass(), "_canonicalName", null);
        setField(term101771, term101771.getClass(), "_class", null);
        setIntField(term101771, term101771.getClass(), "_hash", 0);
        setField(term101771, term101771.getClass(), "_valueHandler", null);
        setField(term101771, term101771.getClass(), "_typeHandler", null);
        setBooleanField(term101771, term101771.getClass(), "_asStatic", false);
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
        args[0] = term100263;
        args[1] = term100653;
        args[2] = term100769;
        args[3] = term100865;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term101755));
        assertTrue(recursiveEquals(term100263, term101764));
        assertTrue(recursiveEquals(term100653, term101769));
        assertTrue(recursiveEquals(term100769, term101770));
        assertTrue(recursiveEquals(term100865, term101771));
    }

};


