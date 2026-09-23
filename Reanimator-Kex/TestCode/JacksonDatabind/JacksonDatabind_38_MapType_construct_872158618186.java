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

public class MapType_construct_872158618186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66807;
     Object term66947;
     Object term67043;
     Object term67149;
     Object term67432;
     Object term67433;
     Object term67434;
     Object term67458;
     Object term67293;

    public MapType_construct_872158618186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66807 = Class.forName((String) "com.fasterxml.jackson.databind.type.ArrayType");
        term66947 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        term67043 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setIntField(term67043, term67043.getClass(), "_hash", 0);
        term67149 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setIntField(term67149, term67149.getClass(), "_hash", 0);
        term67432 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term67432, term67432.getClass(), "_componentType", null);
        setField(term67432, term67432.getClass(), "_emptyArray", null);
        setField(term67432, term67432.getClass(), "_superClass", null);
        setField(term67432, term67432.getClass(), "_superInterfaces", null);
        setField(term67432, term67432.getClass(), "_bindings", null);
        setField(term67432, term67432.getClass(), "_canonicalName", null);
        setField(term67432, term67432.getClass(), "_class", null);
        setIntField(term67432, term67432.getClass(), "_hash", 0);
        setField(term67432, term67432.getClass(), "_valueHandler", null);
        setField(term67432, term67432.getClass(), "_typeHandler", null);
        setBooleanField(term67432, term67432.getClass(), "_asStatic", false);
        term67433 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term67433, term67433.getClass(), "_elementType", null);
        setField(term67433, term67433.getClass(), "_superClass", null);
        setField(term67433, term67433.getClass(), "_superInterfaces", null);
        setField(term67433, term67433.getClass(), "_bindings", null);
        setField(term67433, term67433.getClass(), "_canonicalName", null);
        setField(term67433, term67433.getClass(), "_class", null);
        setIntField(term67433, term67433.getClass(), "_hash", 0);
        setField(term67433, term67433.getClass(), "_valueHandler", null);
        setField(term67433, term67433.getClass(), "_typeHandler", null);
        setBooleanField(term67433, term67433.getClass(), "_asStatic", false);
        term67434 = Class.forName((String) "com.fasterxml.jackson.databind.type.ArrayType");
        term67458 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term67458, term67458.getClass(), "_names", null);
        setField(term67458, term67458.getClass(), "_types", null);
        setField(term67458, term67458.getClass(), "_unboundVariables", null);
        setIntField(term67458, term67458.getClass(), "_hashCode", 0);
        Class<? extends Object> term67296 = Class.forName((String) "com.fasterxml.jackson.databind.type.ArrayType");
        term67293 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term67286 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term67290 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term67294 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term67286, term67286.getClass(), "_componentType", null);
        setField(term67286, term67286.getClass(), "_emptyArray", null);
        setField(term67286, term67286.getClass(), "_superClass", null);
        setField(term67286, term67286.getClass(), "_superInterfaces", null);
        setField(term67286, term67286.getClass(), "_bindings", null);
        setField(term67286, term67286.getClass(), "_canonicalName", null);
        setField(term67286, term67286.getClass(), "_class", null);
        setIntField(term67286, term67286.getClass(), "_hash", 0);
        setField(term67286, term67286.getClass(), "_valueHandler", null);
        setField(term67286, term67286.getClass(), "_typeHandler", null);
        setBooleanField(term67286, term67286.getClass(), "_asStatic", false);
        setField(term67293, term67293.getClass(), "_keyType", term67286);
        setField(term67290, term67290.getClass(), "_elementType", null);
        setField(term67290, term67290.getClass(), "_superClass", null);
        setField(term67290, term67290.getClass(), "_superInterfaces", null);
        setField(term67290, term67290.getClass(), "_bindings", null);
        setField(term67290, term67290.getClass(), "_canonicalName", null);
        setField(term67290, term67290.getClass(), "_class", null);
        setIntField(term67290, term67290.getClass(), "_hash", 0);
        setField(term67290, term67290.getClass(), "_valueHandler", null);
        setField(term67290, term67290.getClass(), "_typeHandler", null);
        setBooleanField(term67290, term67290.getClass(), "_asStatic", false);
        setField(term67293, term67293.getClass(), "_valueType", term67290);
        setField(term67293, term67293.getClass(), "_superClass", null);
        setField(term67293, term67293.getClass(), "_superInterfaces", null);
        setField(term67294, term67294.getClass(), "_names", null);
        setField(term67294, term67294.getClass(), "_types", null);
        setField(term67294, term67294.getClass(), "_unboundVariables", null);
        setIntField(term67294, term67294.getClass(), "_hashCode", 0);
        setField(term67293, term67293.getClass(), "_bindings", term67294);
        setField(term67293, term67293.getClass(), "_canonicalName", null);
        setField(term67293, term67293.getClass(), "_class", term67296);
        setIntField(term67293, term67293.getClass(), "_hash", 451297534);
        setField(term67293, term67293.getClass(), "_valueHandler", null);
        setField(term67293, term67293.getClass(), "_typeHandler", null);
        setBooleanField(term67293, term67293.getClass(), "_asStatic", false);
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
        args[0] = term66807;
        args[1] = term66947;
        args[2] = null;
        args[3] = null;
        args[4] = term67043;
        args[5] = term67149;
        Object retValue = callMethod(klass, "construct", argTypes, null, args);
        assertTrue(recursiveEquals(term66807, term67432));
        assertTrue(recursiveEquals(term66947, term67433));
        assertTrue(recursiveEquals(term67043, null));
        assertTrue(recursiveEquals(term67149, null));
        assertTrue(recursiveEquals(retValue, term67293));
    }

};


