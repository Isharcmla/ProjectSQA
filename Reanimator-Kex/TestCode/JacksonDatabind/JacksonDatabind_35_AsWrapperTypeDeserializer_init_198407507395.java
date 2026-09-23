package com.fasterxml.jackson.databind.jsontype.impl;

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
import static com.fasterxml.jackson.databind.jsontype.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.jsontype.impl.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class AsWrapperTypeDeserializer_init_198407507395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84481;
     Object term84809;
     Object term84883;
     Object term85741;
     Object term85757;
     Object term85764;
     Object term85767;

    public AsWrapperTypeDeserializer_init_198407507395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term84241 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        Object term84389 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver"));
        setField(term84241, term84241.getClass(), "_baseType", null);
        setField(term84241, term84241.getClass(), "_idResolver", term84389);
        setField(term84241, term84241.getClass(), "_typePropertyName", null);
        setBooleanField(term84241, term84241.getClass(), "_typeIdVisible", false);
        setField(term84241, term84241.getClass(), "_deserializers", null);
        term84481 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term84577 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term84675 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term84481, term84481.getClass(), "_class", null);
        setIntField(term84577, term84577.getClass(), "_hash", 0);
        setField(term84481, term84481.getClass(), "_keyType", term84577);
        setField(term84481, term84481.getClass(), "_valueType", term84675);
        setField(term84481, term84481.getClass(), "_valueHandler", null);
        setField(term84481, term84481.getClass(), "_typeHandler", null);
        setBooleanField(term84481, term84481.getClass(), "_asStatic", false);
        term84809 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        term84883 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$8");
        Class<? extends Object> term85747 = Class.forName((String) "com.fasterxml.jackson.databind.util.NameTransformer$1");
        HashMap term85756 = new HashMap();
        term85741 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        Object term85742 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        Object term85743 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term85744 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term85745 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term85746 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term85742, term85742.getClass(), "_typeFactory", null);
        setField(term85742, term85742.getClass(), "_baseType", null);
        setField(term85741, term85741.getClass(), "_idResolver", term85742);
        setField(term85744, term85744.getClass(), "_componentType", null);
        setField(term85744, term85744.getClass(), "_emptyArray", null);
        setField(term85744, term85744.getClass(), "_canonicalName", null);
        setField(term85744, term85744.getClass(), "_class", null);
        setIntField(term85744, term85744.getClass(), "_hash", 0);
        setField(term85744, term85744.getClass(), "_valueHandler", null);
        setField(term85744, term85744.getClass(), "_typeHandler", null);
        setBooleanField(term85744, term85744.getClass(), "_asStatic", false);
        setField(term85743, term85743.getClass(), "_keyType", term85744);
        setField(term85745, term85745.getClass(), "_typeParametersFor", null);
        setField(term85745, term85745.getClass(), "_typeParameters", null);
        setField(term85745, term85745.getClass(), "_typeNames", null);
        setField(term85745, term85745.getClass(), "_canonicalName", null);
        setField(term85745, term85745.getClass(), "_class", null);
        setIntField(term85745, term85745.getClass(), "_hash", 0);
        setField(term85745, term85745.getClass(), "_valueHandler", null);
        setField(term85745, term85745.getClass(), "_typeHandler", null);
        setBooleanField(term85745, term85745.getClass(), "_asStatic", false);
        setField(term85743, term85743.getClass(), "_valueType", term85745);
        setField(term85743, term85743.getClass(), "_canonicalName", null);
        setField(term85743, term85743.getClass(), "_class", null);
        setIntField(term85743, term85743.getClass(), "_hash", 0);
        setField(term85743, term85743.getClass(), "_valueHandler", null);
        setField(term85743, term85743.getClass(), "_typeHandler", null);
        setBooleanField(term85743, term85743.getClass(), "_asStatic", false);
        setField(term85741, term85741.getClass(), "_baseType", term85743);
        setField(term85741, term85741.getClass(), "_property", null);
        setField(term85746, term85746.getClass(), "_keyType", term85744);
        setField(term85746, term85746.getClass(), "_valueType", term85745);
        setField(term85746, term85746.getClass(), "_canonicalName", null);
        setField(term85746, term85746.getClass(), "_class", term85747);
        setIntField(term85746, term85746.getClass(), "_hash", 1246708270);
        setField(term85746, term85746.getClass(), "_valueHandler", null);
        setField(term85746, term85746.getClass(), "_typeHandler", null);
        setBooleanField(term85746, term85746.getClass(), "_asStatic", false);
        setField(term85741, term85741.getClass(), "_defaultImpl", term85746);
        setField(term85741, term85741.getClass(), "_typePropertyName", "");
        setBooleanField(term85741, term85741.getClass(), "_typeIdVisible", true);
        setField(term85741, term85741.getClass(), "_deserializers", term85756);
        setField(term85741, term85741.getClass(), "_defaultImplDeserializer", null);
        term85757 = Class.forName((String) "com.fasterxml.jackson.databind.util.NameTransformer$1");
        term85764 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term85765 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term85766 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term85765, term85765.getClass(), "_componentType", null);
        setField(term85765, term85765.getClass(), "_emptyArray", null);
        setField(term85765, term85765.getClass(), "_canonicalName", null);
        setField(term85765, term85765.getClass(), "_class", null);
        setIntField(term85765, term85765.getClass(), "_hash", 0);
        setField(term85765, term85765.getClass(), "_valueHandler", null);
        setField(term85765, term85765.getClass(), "_typeHandler", null);
        setBooleanField(term85765, term85765.getClass(), "_asStatic", false);
        setField(term85764, term85764.getClass(), "_keyType", term85765);
        setField(term85766, term85766.getClass(), "_typeParametersFor", null);
        setField(term85766, term85766.getClass(), "_typeParameters", null);
        setField(term85766, term85766.getClass(), "_typeNames", null);
        setField(term85766, term85766.getClass(), "_canonicalName", null);
        setField(term85766, term85766.getClass(), "_class", null);
        setIntField(term85766, term85766.getClass(), "_hash", 0);
        setField(term85766, term85766.getClass(), "_valueHandler", null);
        setField(term85766, term85766.getClass(), "_typeHandler", null);
        setBooleanField(term85766, term85766.getClass(), "_asStatic", false);
        setField(term85764, term85764.getClass(), "_valueType", term85766);
        setField(term85764, term85764.getClass(), "_canonicalName", null);
        setField(term85764, term85764.getClass(), "_class", null);
        setIntField(term85764, term85764.getClass(), "_hash", 0);
        setField(term85764, term85764.getClass(), "_valueHandler", null);
        setField(term85764, term85764.getClass(), "_typeHandler", null);
        setBooleanField(term85764, term85764.getClass(), "_asStatic", false);
        term85767 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        setField(term85767, term85767.getClass(), "_typeFactory", null);
        setField(term85767, term85767.getClass(), "_baseType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeIdResolver");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = boolean.class;
        argTypes[4] = Class.forName("java.lang.Class");
        Object[] args = new Object[5];
        args[0] = term84481;
        args[1] = term84809;
        args[2] = "";
        args[3] = true;
        args[4] = term84883;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term85741));
        assertTrue(recursiveEquals(term84481, term85757));
        assertTrue(recursiveEquals(term84809, term85764));
        assertTrue(recursiveEquals(term84883, true));
    }

};


