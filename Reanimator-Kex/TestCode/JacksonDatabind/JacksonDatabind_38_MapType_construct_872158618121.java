package com.fasterxml.jackson.databind.type;

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
import static com.fasterxml.jackson.databind.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.type.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class MapType_construct_872158618121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33663;
     Object term33759;
     Object term33865;
     Object term34555;
     Object term34556;
     Object term34557;
     Object term34388;

    public MapType_construct_872158618121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33663 = Class.forName((String) "java.util.spi.AbstractResourceBundleProvider");
        term33759 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setIntField(term33759, term33759.getClass(), "_hash", 0);
        term33865 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setIntField(term33865, term33865.getClass(), "_hash", 0);
        term34555 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term34555, term34555.getClass(), "_componentType", null);
        setField(term34555, term34555.getClass(), "_emptyArray", null);
        setField(term34555, term34555.getClass(), "_superClass", null);
        setField(term34555, term34555.getClass(), "_superInterfaces", null);
        setField(term34555, term34555.getClass(), "_bindings", null);
        setField(term34555, term34555.getClass(), "_canonicalName", null);
        setField(term34555, term34555.getClass(), "_class", null);
        setIntField(term34555, term34555.getClass(), "_hash", 0);
        setField(term34555, term34555.getClass(), "_valueHandler", null);
        setField(term34555, term34555.getClass(), "_typeHandler", null);
        setBooleanField(term34555, term34555.getClass(), "_asStatic", false);
        term34556 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term34556, term34556.getClass(), "_elementType", null);
        setField(term34556, term34556.getClass(), "_superClass", null);
        setField(term34556, term34556.getClass(), "_superInterfaces", null);
        setField(term34556, term34556.getClass(), "_bindings", null);
        setField(term34556, term34556.getClass(), "_canonicalName", null);
        setField(term34556, term34556.getClass(), "_class", null);
        setIntField(term34556, term34556.getClass(), "_hash", 0);
        setField(term34556, term34556.getClass(), "_valueHandler", null);
        setField(term34556, term34556.getClass(), "_typeHandler", null);
        setBooleanField(term34556, term34556.getClass(), "_asStatic", false);
        term34557 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver");
        Class<? extends Object> term34393 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver");
        term34388 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term34381 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term34385 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term34389 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term34390 = (Object[]) newArray("java.lang.String", 0);
        Object[] term34391 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term34381, term34381.getClass(), "_componentType", null);
        setField(term34381, term34381.getClass(), "_emptyArray", null);
        setField(term34381, term34381.getClass(), "_superClass", null);
        setField(term34381, term34381.getClass(), "_superInterfaces", null);
        setField(term34381, term34381.getClass(), "_bindings", null);
        setField(term34381, term34381.getClass(), "_canonicalName", null);
        setField(term34381, term34381.getClass(), "_class", null);
        setIntField(term34381, term34381.getClass(), "_hash", 0);
        setField(term34381, term34381.getClass(), "_valueHandler", null);
        setField(term34381, term34381.getClass(), "_typeHandler", null);
        setBooleanField(term34381, term34381.getClass(), "_asStatic", false);
        setField(term34388, term34388.getClass(), "_keyType", term34381);
        setField(term34385, term34385.getClass(), "_elementType", null);
        setField(term34385, term34385.getClass(), "_superClass", null);
        setField(term34385, term34385.getClass(), "_superInterfaces", null);
        setField(term34385, term34385.getClass(), "_bindings", null);
        setField(term34385, term34385.getClass(), "_canonicalName", null);
        setField(term34385, term34385.getClass(), "_class", null);
        setIntField(term34385, term34385.getClass(), "_hash", 0);
        setField(term34385, term34385.getClass(), "_valueHandler", null);
        setField(term34385, term34385.getClass(), "_typeHandler", null);
        setBooleanField(term34385, term34385.getClass(), "_asStatic", false);
        setField(term34388, term34388.getClass(), "_valueType", term34385);
        setField(term34388, term34388.getClass(), "_superClass", null);
        setField(term34388, term34388.getClass(), "_superInterfaces", null);
        setField(term34389, term34389.getClass(), "_names", term34390);
        setField(term34389, term34389.getClass(), "_types", term34391);
        setField(term34389, term34389.getClass(), "_unboundVariables", null);
        setIntField(term34389, term34389.getClass(), "_hashCode", 1);
        setField(term34388, term34388.getClass(), "_bindings", term34389);
        setField(term34388, term34388.getClass(), "_canonicalName", null);
        setField(term34388, term34388.getClass(), "_class", term34393);
        setIntField(term34388, term34388.getClass(), "_hash", -770527831);
        setField(term34388, term34388.getClass(), "_valueHandler", null);
        setField(term34388, term34388.getClass(), "_typeHandler", null);
        setBooleanField(term34388, term34388.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.MapType");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[5] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[6];
        args[0] = term33663;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term33759;
        args[5] = term33865;
        Object retValue = callMethod(klass, "construct", argTypes, null, args);
        assertTrue(recursiveEquals(term33663, term34555));
        assertTrue(recursiveEquals(term33759, null));
        assertTrue(recursiveEquals(term33865, null));
        assertTrue(recursiveEquals(retValue, term34388));
    }

};


