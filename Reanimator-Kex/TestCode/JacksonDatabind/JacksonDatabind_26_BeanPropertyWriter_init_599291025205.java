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

public class BeanPropertyWriter_init_599291025205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81947;
     Object term82319;
     Object term83245;
     Object term83250;
     Object term83255;

    public BeanPropertyWriter_init_599291025205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term81421 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term81555 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember"));
        Object term81653 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term81813 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$IntArraySerializer"));
        setField(term81421, term81421.getClass(), "_member", term81555);
        setField(term81421, term81421.getClass(), "_contextAnnotations", null);
        setField(term81421, term81421.getClass(), "_name", term81653);
        setField(term81421, term81421.getClass(), "_wrapperName", null);
        setField(term81421, term81421.getClass(), "_metadata", null);
        setField(term81421, term81421.getClass(), "_includeInViews", null);
        setField(term81421, term81421.getClass(), "_declaredType", null);
        setField(term81421, term81421.getClass(), "_serializer", term81813);
        term81947 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term82039 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term82207 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        setField(term82039, term82039.getClass(), "_simpleName", "");
        setField(term81947, term81947.getClass(), "_fullName", term82039);
        setField(term81947, term81947.getClass(), "_introspector", null);
        setField(term81947, term81947.getClass(), "_member", term82207);
        setField(term81947, term81947.getClass(), "_metadata", null);
        term82319 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.DateSerializer"));
        term83245 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term83246 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term83249 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.DateSerializer"));
        setField(term83246, term83246.getClass(), "_value", "");
        setField(term83246, term83246.getClass(), "_quotedUTF8Ref", null);
        setField(term83246, term83246.getClass(), "_unquotedUTF8Ref", null);
        setField(term83246, term83246.getClass(), "_quotedChars", null);
        setField(term83246, term83246.getClass(), "_jdkSerializeValue", null);
        setField(term83245, term83245.getClass(), "_name", term83246);
        setField(term83245, term83245.getClass(), "_wrapperName", null);
        setField(term83245, term83245.getClass(), "_declaredType", null);
        setField(term83245, term83245.getClass(), "_cfgSerializationType", null);
        setField(term83245, term83245.getClass(), "_nonTrivialBaseType", null);
        setField(term83245, term83245.getClass(), "_contextAnnotations", null);
        setField(term83245, term83245.getClass(), "_metadata", null);
        setField(term83245, term83245.getClass(), "_format", null);
        setField(term83245, term83245.getClass(), "_member", null);
        setField(term83245, term83245.getClass(), "_accessorMethod", null);
        setField(term83245, term83245.getClass(), "_field", null);
        setField(term83249, term83249.getClass(), "_useTimestamp", null);
        setField(term83249, term83249.getClass(), "_customFormat", null);
        setField(term83249, term83249.getClass(), "_handledType", null);
        setField(term83245, term83245.getClass(), "_serializer", term83249);
        setField(term83245, term83245.getClass(), "_nullSerializer", null);
        setField(term83245, term83245.getClass(), "_typeSerializer", null);
        setField(term83245, term83245.getClass(), "_dynamicSerializers", null);
        setBooleanField(term83245, term83245.getClass(), "_suppressNulls", false);
        setField(term83245, term83245.getClass(), "_suppressableValue", null);
        setField(term83245, term83245.getClass(), "_includeInViews", null);
        setField(term83245, term83245.getClass(), "_internalSettings", null);
        term83250 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term83251 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Object term83252 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term83250, term83250.getClass(), "_introspector", null);
        setField(term83251, term83251.getClass(), "_constructor", null);
        setField(term83251, term83251.getClass(), "_serialization", null);
        setField(term83251, term83251.getClass(), "_paramAnnotations", null);
        setField(term83251, term83251.getClass(), "_context", null);
        setField(term83251, term83251.getClass(), "_annotations", null);
        setField(term83250, term83250.getClass(), "_member", term83251);
        setField(term83250, term83250.getClass(), "_metadata", null);
        setField(term83252, term83252.getClass(), "_simpleName", "");
        setField(term83252, term83252.getClass(), "_namespace", null);
        setField(term83252, term83252.getClass(), "_encodedSimple", null);
        setField(term83250, term83250.getClass(), "_fullName", term83252);
        setField(term83250, term83250.getClass(), "_inclusion", null);
        setField(term83250, term83250.getClass(), "_name", null);
        term83255 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.DateSerializer"));
        setField(term83255, term83255.getClass(), "_useTimestamp", null);
        setField(term83255, term83255.getClass(), "_customFormat", null);
        setField(term83255, term83255.getClass(), "_handledType", null);
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
        args[0] = term81947;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term82319;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term83245));
        assertTrue(recursiveEquals(term81947, term83250));
        assertTrue(recursiveEquals(term82319, term83255));
    }

};


