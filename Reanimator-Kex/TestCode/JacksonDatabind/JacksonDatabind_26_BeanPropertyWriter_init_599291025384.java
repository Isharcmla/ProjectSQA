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

public class BeanPropertyWriter_init_599291025384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231395;
     Object term231939;
     Object term233214;
     Object term233221;
     Object term233227;

    public BeanPropertyWriter_init_599291025384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term230937 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term231071 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember"));
        Object[] term230733 = (Object[]) newArray("java.lang.Class", 0);
        Object term231175 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term231267 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term230937, term230937.getClass(), "_member", term231071);
        setField(term230937, term230937.getClass(), "_contextAnnotations", null);
        setField(term230937, term230937.getClass(), "_name", null);
        setField(term230937, term230937.getClass(), "_wrapperName", null);
        setField(term230937, term230937.getClass(), "_metadata", null);
        setField(term230937, term230937.getClass(), "_includeInViews", term230733);
        setField(term230937, term230937.getClass(), "_declaredType", term231175);
        setField(term230937, term230937.getClass(), "_serializer", null);
        setField(term230937, term230937.getClass(), "_dynamicSerializers", null);
        setField(term230937, term230937.getClass(), "_typeSerializer", null);
        setField(term230937, term230937.getClass(), "_cfgSerializationType", term231267);
        term231395 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term231487 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term231667 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term231809 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term231487, term231487.getClass(), "_simpleName", "");
        setField(term231395, term231395.getClass(), "_name", term231487);
        setBooleanField(term231395, term231395.getClass(), "_forSerialization", false);
        setField(term231395, term231395.getClass(), "_ctorParameters", null);
        setField(term231667, term231667.getClass(), "next", null);
        setField(term231667, term231667.getClass(), "value", null);
        setField(term231395, term231395.getClass(), "_setters", term231667);
        setField(term231809, term231809.getClass(), "value", null);
        setField(term231809, term231809.getClass(), "next", null);
        setField(term231395, term231395.getClass(), "_fields", term231809);
        setField(term231395, term231395.getClass(), "_annotationIntrospector", null);
        term231939 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        term233214 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term233215 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term233218 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term233219 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Object term233220 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term233215, term233215.getClass(), "_value", "");
        setField(term233215, term233215.getClass(), "_quotedUTF8Ref", null);
        setField(term233215, term233215.getClass(), "_unquotedUTF8Ref", null);
        setField(term233215, term233215.getClass(), "_quotedChars", null);
        setField(term233215, term233215.getClass(), "_jdkSerializeValue", null);
        setField(term233214, term233214.getClass(), "_name", term233215);
        setField(term233214, term233214.getClass(), "_wrapperName", null);
        setField(term233214, term233214.getClass(), "_declaredType", null);
        setField(term233214, term233214.getClass(), "_cfgSerializationType", null);
        setField(term233214, term233214.getClass(), "_nonTrivialBaseType", null);
        setField(term233214, term233214.getClass(), "_contextAnnotations", null);
        setField(term233218, term233218.getClass(), "_required", null);
        setField(term233218, term233218.getClass(), "_description", null);
        setField(term233218, term233218.getClass(), "_index", null);
        setField(term233218, term233218.getClass(), "_defaultValue", null);
        setField(term233214, term233214.getClass(), "_metadata", term233218);
        setField(term233214, term233214.getClass(), "_format", null);
        setField(term233219, term233219.getClass(), "_constructor", null);
        setField(term233219, term233219.getClass(), "_serialization", null);
        setField(term233219, term233219.getClass(), "_paramAnnotations", null);
        setField(term233219, term233219.getClass(), "_context", null);
        setField(term233219, term233219.getClass(), "_annotations", null);
        setField(term233214, term233214.getClass(), "_member", term233219);
        setField(term233214, term233214.getClass(), "_accessorMethod", null);
        setField(term233214, term233214.getClass(), "_field", null);
        setField(term233214, term233214.getClass(), "_serializer", null);
        setField(term233214, term233214.getClass(), "_nullSerializer", null);
        setField(term233214, term233214.getClass(), "_typeSerializer", null);
        setBooleanField(term233220, term233220.getClass(), "_resetWhenFull", false);
        setField(term233214, term233214.getClass(), "_dynamicSerializers", term233220);
        setBooleanField(term233214, term233214.getClass(), "_suppressNulls", false);
        setField(term233214, term233214.getClass(), "_suppressableValue", null);
        setField(term233214, term233214.getClass(), "_includeInViews", null);
        setField(term233214, term233214.getClass(), "_internalSettings", null);
        term233221 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term233222 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term233225 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term233226 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term233221, term233221.getClass(), "_forSerialization", false);
        setField(term233221, term233221.getClass(), "_annotationIntrospector", null);
        setField(term233222, term233222.getClass(), "_simpleName", "");
        setField(term233222, term233222.getClass(), "_namespace", null);
        setField(term233222, term233222.getClass(), "_encodedSimple", null);
        setField(term233221, term233221.getClass(), "_name", term233222);
        setField(term233221, term233221.getClass(), "_internalName", null);
        setField(term233225, term233225.getClass(), "value", null);
        setField(term233225, term233225.getClass(), "next", null);
        setField(term233225, term233225.getClass(), "name", null);
        setBooleanField(term233225, term233225.getClass(), "isNameExplicit", false);
        setBooleanField(term233225, term233225.getClass(), "isVisible", false);
        setBooleanField(term233225, term233225.getClass(), "isMarkedIgnored", false);
        setField(term233221, term233221.getClass(), "_fields", term233225);
        setField(term233221, term233221.getClass(), "_ctorParameters", null);
        setField(term233221, term233221.getClass(), "_getters", null);
        setField(term233226, term233226.getClass(), "value", null);
        setField(term233226, term233226.getClass(), "next", null);
        setField(term233226, term233226.getClass(), "name", null);
        setBooleanField(term233226, term233226.getClass(), "isNameExplicit", false);
        setBooleanField(term233226, term233226.getClass(), "isVisible", false);
        setBooleanField(term233226, term233226.getClass(), "isMarkedIgnored", false);
        setField(term233221, term233221.getClass(), "_setters", term233226);
        term233227 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        setField(term233227, term233227.getClass(), "_constructor", null);
        setField(term233227, term233227.getClass(), "_serialization", null);
        setField(term233227, term233227.getClass(), "_paramAnnotations", null);
        setField(term233227, term233227.getClass(), "_context", null);
        setField(term233227, term233227.getClass(), "_annotations", null);
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
        args[0] = term231395;
        args[1] = term231939;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term233214));
        assertTrue(recursiveEquals(term231395, term233221));
        assertTrue(recursiveEquals(term231939, term233227));
    }

};


