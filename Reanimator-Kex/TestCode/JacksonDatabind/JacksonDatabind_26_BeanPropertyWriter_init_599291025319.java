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

public class BeanPropertyWriter_init_599291025319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178421;
     Object term178791;
     Object term178895;
     Object term179059;
     Object term179651;
     Object term179658;
     Object term179663;
     Object term179664;
     Object term179665;

    public BeanPropertyWriter_init_599291025319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term177987 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term178079 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term178171 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term178287 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StringSerializer"));
        setField(term177987, term177987.getClass(), "_member", null);
        setField(term177987, term177987.getClass(), "_contextAnnotations", null);
        setField(term177987, term177987.getClass(), "_name", null);
        setField(term177987, term177987.getClass(), "_wrapperName", term178079);
        setField(term177987, term177987.getClass(), "_metadata", null);
        setField(term177987, term177987.getClass(), "_includeInViews", null);
        setField(term177987, term177987.getClass(), "_declaredType", term178171);
        setField(term177987, term177987.getClass(), "_serializer", term178287);
        setField(term177987, term177987.getClass(), "_dynamicSerializers", null);
        setField(term177987, term177987.getClass(), "_typeSerializer", null);
        setField(term177987, term177987.getClass(), "_cfgSerializationType", null);
        term178421 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term178513 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term178671 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term178513, term178513.getClass(), "_simpleName", "");
        setField(term178421, term178421.getClass(), "_fullName", term178513);
        setField(term178421, term178421.getClass(), "_introspector", null);
        setField(term178421, term178421.getClass(), "_member", term178671);
        setField(term178421, term178421.getClass(), "_metadata", null);
        term178791 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        term178895 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term179059 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$ShortArraySerializer"));
        term179651 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term179652 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term179655 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term179656 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term179657 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$ShortArraySerializer"));
        setField(term179652, term179652.getClass(), "_value", "");
        setField(term179652, term179652.getClass(), "_quotedUTF8Ref", null);
        setField(term179652, term179652.getClass(), "_unquotedUTF8Ref", null);
        setField(term179652, term179652.getClass(), "_quotedChars", null);
        setField(term179652, term179652.getClass(), "_jdkSerializeValue", null);
        setField(term179651, term179651.getClass(), "_name", term179652);
        setField(term179651, term179651.getClass(), "_wrapperName", null);
        setField(term179655, term179655.getClass(), "_referencedType", null);
        setField(term179655, term179655.getClass(), "_typeParametersFor", null);
        setField(term179655, term179655.getClass(), "_typeParameters", null);
        setField(term179655, term179655.getClass(), "_typeNames", null);
        setField(term179655, term179655.getClass(), "_canonicalName", null);
        setField(term179655, term179655.getClass(), "_class", null);
        setIntField(term179655, term179655.getClass(), "_hash", 0);
        setField(term179655, term179655.getClass(), "_valueHandler", null);
        setField(term179655, term179655.getClass(), "_typeHandler", null);
        setBooleanField(term179655, term179655.getClass(), "_asStatic", false);
        setField(term179651, term179651.getClass(), "_declaredType", term179655);
        setField(term179651, term179651.getClass(), "_cfgSerializationType", null);
        setField(term179651, term179651.getClass(), "_nonTrivialBaseType", null);
        setField(term179651, term179651.getClass(), "_contextAnnotations", null);
        setField(term179651, term179651.getClass(), "_metadata", null);
        setField(term179651, term179651.getClass(), "_format", null);
        setField(term179656, term179656.getClass(), "_method", null);
        setField(term179656, term179656.getClass(), "_paramClasses", null);
        setField(term179656, term179656.getClass(), "_serialization", null);
        setField(term179656, term179656.getClass(), "_paramAnnotations", null);
        setField(term179656, term179656.getClass(), "_context", null);
        setField(term179656, term179656.getClass(), "_annotations", null);
        setField(term179651, term179651.getClass(), "_member", term179656);
        setField(term179651, term179651.getClass(), "_accessorMethod", null);
        setField(term179651, term179651.getClass(), "_field", null);
        setField(term179657, term179657.getClass(), "_valueTypeSerializer", null);
        setField(term179657, term179657.getClass(), "_property", null);
        setField(term179657, term179657.getClass(), "_unwrapSingle", null);
        setField(term179657, term179657.getClass(), "_handledType", null);
        setField(term179651, term179651.getClass(), "_serializer", term179657);
        setField(term179651, term179651.getClass(), "_nullSerializer", null);
        setField(term179651, term179651.getClass(), "_typeSerializer", null);
        setField(term179651, term179651.getClass(), "_dynamicSerializers", null);
        setBooleanField(term179651, term179651.getClass(), "_suppressNulls", false);
        setField(term179651, term179651.getClass(), "_suppressableValue", null);
        setField(term179651, term179651.getClass(), "_includeInViews", null);
        setField(term179651, term179651.getClass(), "_internalSettings", null);
        term179658 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term179659 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term179660 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term179658, term179658.getClass(), "_introspector", null);
        setField(term179659, term179659.getClass(), "_method", null);
        setField(term179659, term179659.getClass(), "_paramClasses", null);
        setField(term179659, term179659.getClass(), "_serialization", null);
        setField(term179659, term179659.getClass(), "_paramAnnotations", null);
        setField(term179659, term179659.getClass(), "_context", null);
        setField(term179659, term179659.getClass(), "_annotations", null);
        setField(term179658, term179658.getClass(), "_member", term179659);
        setField(term179658, term179658.getClass(), "_metadata", null);
        setField(term179660, term179660.getClass(), "_simpleName", "");
        setField(term179660, term179660.getClass(), "_namespace", null);
        setField(term179660, term179660.getClass(), "_encodedSimple", null);
        setField(term179658, term179658.getClass(), "_fullName", term179660);
        setField(term179658, term179658.getClass(), "_inclusion", null);
        setField(term179658, term179658.getClass(), "_name", null);
        term179663 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term179663, term179663.getClass(), "_method", null);
        setField(term179663, term179663.getClass(), "_paramClasses", null);
        setField(term179663, term179663.getClass(), "_serialization", null);
        setField(term179663, term179663.getClass(), "_paramAnnotations", null);
        setField(term179663, term179663.getClass(), "_context", null);
        setField(term179663, term179663.getClass(), "_annotations", null);
        term179664 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term179664, term179664.getClass(), "_referencedType", null);
        setField(term179664, term179664.getClass(), "_typeParametersFor", null);
        setField(term179664, term179664.getClass(), "_typeParameters", null);
        setField(term179664, term179664.getClass(), "_typeNames", null);
        setField(term179664, term179664.getClass(), "_canonicalName", null);
        setField(term179664, term179664.getClass(), "_class", null);
        setIntField(term179664, term179664.getClass(), "_hash", 0);
        setField(term179664, term179664.getClass(), "_valueHandler", null);
        setField(term179664, term179664.getClass(), "_typeHandler", null);
        setBooleanField(term179664, term179664.getClass(), "_asStatic", false);
        term179665 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$ShortArraySerializer"));
        setField(term179665, term179665.getClass(), "_valueTypeSerializer", null);
        setField(term179665, term179665.getClass(), "_property", null);
        setField(term179665, term179665.getClass(), "_unwrapSingle", null);
        setField(term179665, term179665.getClass(), "_handledType", null);
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
        args[0] = term178421;
        args[1] = term178791;
        args[2] = null;
        args[3] = term178895;
        args[4] = term179059;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term179651));
        assertTrue(recursiveEquals(term178421, term179658));
        assertTrue(recursiveEquals(term178791, term179663));
        assertTrue(recursiveEquals(term178895, term179664));
        assertTrue(recursiveEquals(term179059, term179665));
    }

};


