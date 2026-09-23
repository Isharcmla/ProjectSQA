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
import java.lang.Object;

public class TypeBindings_init_352540534231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75351;
     Object term75352;
     Object term75958;
     Object term75965;
     Object term75966;

    public TypeBindings_init_352540534231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term75517 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term75517, term75517.getClass(), "_names", null);
        setField(term75517, term75517.getClass(), "_types", null);
        term75351 = (Object[]) newArray("java.lang.String", 4);
        term75352 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term75623 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term75719 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term75815 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term75915 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setIntField(term75623, term75623.getClass(), "_hash", 0);
        setElement(term75352, 0, term75623);
        setIntField(term75719, term75719.getClass(), "_hash", 0);
        setElement(term75352, 1, term75719);
        setIntField(term75815, term75815.getClass(), "_hash", 0);
        setElement(term75352, 2, term75815);
        setElement(term75352, 3, term75915);
        term75958 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term75959 = (Object[]) newArray("java.lang.String", 4);
        Object[] term75960 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term75961 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term75962 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term75963 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term75964 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term75958, term75958.getClass(), "_names", term75959);
        setField(term75961, term75961.getClass(), "_elementType", null);
        setField(term75961, term75961.getClass(), "_superClass", null);
        setField(term75961, term75961.getClass(), "_superInterfaces", null);
        setField(term75961, term75961.getClass(), "_bindings", null);
        setField(term75961, term75961.getClass(), "_canonicalName", null);
        setField(term75961, term75961.getClass(), "_class", null);
        setIntField(term75961, term75961.getClass(), "_hash", 0);
        setField(term75961, term75961.getClass(), "_valueHandler", null);
        setField(term75961, term75961.getClass(), "_typeHandler", null);
        setBooleanField(term75961, term75961.getClass(), "_asStatic", false);
        setElement(term75960, 0, term75961);
        setField(term75962, term75962.getClass(), "_componentType", null);
        setField(term75962, term75962.getClass(), "_emptyArray", null);
        setField(term75962, term75962.getClass(), "_superClass", null);
        setField(term75962, term75962.getClass(), "_superInterfaces", null);
        setField(term75962, term75962.getClass(), "_bindings", null);
        setField(term75962, term75962.getClass(), "_canonicalName", null);
        setField(term75962, term75962.getClass(), "_class", null);
        setIntField(term75962, term75962.getClass(), "_hash", 0);
        setField(term75962, term75962.getClass(), "_valueHandler", null);
        setField(term75962, term75962.getClass(), "_typeHandler", null);
        setBooleanField(term75962, term75962.getClass(), "_asStatic", false);
        setElement(term75960, 1, term75962);
        setField(term75963, term75963.getClass(), "_componentType", null);
        setField(term75963, term75963.getClass(), "_emptyArray", null);
        setField(term75963, term75963.getClass(), "_superClass", null);
        setField(term75963, term75963.getClass(), "_superInterfaces", null);
        setField(term75963, term75963.getClass(), "_bindings", null);
        setField(term75963, term75963.getClass(), "_canonicalName", null);
        setField(term75963, term75963.getClass(), "_class", null);
        setIntField(term75963, term75963.getClass(), "_hash", 0);
        setField(term75963, term75963.getClass(), "_valueHandler", null);
        setField(term75963, term75963.getClass(), "_typeHandler", null);
        setBooleanField(term75963, term75963.getClass(), "_asStatic", false);
        setElement(term75960, 2, term75963);
        setField(term75964, term75964.getClass(), "_keyType", null);
        setField(term75964, term75964.getClass(), "_valueType", null);
        setField(term75964, term75964.getClass(), "_superClass", null);
        setField(term75964, term75964.getClass(), "_superInterfaces", null);
        setField(term75964, term75964.getClass(), "_bindings", null);
        setField(term75964, term75964.getClass(), "_canonicalName", null);
        setField(term75964, term75964.getClass(), "_class", null);
        setIntField(term75964, term75964.getClass(), "_hash", 0);
        setField(term75964, term75964.getClass(), "_valueHandler", null);
        setField(term75964, term75964.getClass(), "_typeHandler", null);
        setBooleanField(term75964, term75964.getClass(), "_asStatic", false);
        setElement(term75960, 3, term75964);
        setField(term75958, term75958.getClass(), "_types", term75960);
        setField(term75958, term75958.getClass(), "_unboundVariables", null);
        setIntField(term75958, term75958.getClass(), "_hashCode", 1);
        term75965 = (Object[]) newArray("java.lang.String", 4);
        term75966 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term75967 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term75968 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term75969 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term75970 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term75967, term75967.getClass(), "_elementType", null);
        setField(term75967, term75967.getClass(), "_superClass", null);
        setField(term75967, term75967.getClass(), "_superInterfaces", null);
        setField(term75967, term75967.getClass(), "_bindings", null);
        setField(term75967, term75967.getClass(), "_canonicalName", null);
        setField(term75967, term75967.getClass(), "_class", null);
        setIntField(term75967, term75967.getClass(), "_hash", 0);
        setField(term75967, term75967.getClass(), "_valueHandler", null);
        setField(term75967, term75967.getClass(), "_typeHandler", null);
        setBooleanField(term75967, term75967.getClass(), "_asStatic", false);
        setElement(term75966, 0, term75967);
        setField(term75968, term75968.getClass(), "_componentType", null);
        setField(term75968, term75968.getClass(), "_emptyArray", null);
        setField(term75968, term75968.getClass(), "_superClass", null);
        setField(term75968, term75968.getClass(), "_superInterfaces", null);
        setField(term75968, term75968.getClass(), "_bindings", null);
        setField(term75968, term75968.getClass(), "_canonicalName", null);
        setField(term75968, term75968.getClass(), "_class", null);
        setIntField(term75968, term75968.getClass(), "_hash", 0);
        setField(term75968, term75968.getClass(), "_valueHandler", null);
        setField(term75968, term75968.getClass(), "_typeHandler", null);
        setBooleanField(term75968, term75968.getClass(), "_asStatic", false);
        setElement(term75966, 1, term75968);
        setField(term75969, term75969.getClass(), "_componentType", null);
        setField(term75969, term75969.getClass(), "_emptyArray", null);
        setField(term75969, term75969.getClass(), "_superClass", null);
        setField(term75969, term75969.getClass(), "_superInterfaces", null);
        setField(term75969, term75969.getClass(), "_bindings", null);
        setField(term75969, term75969.getClass(), "_canonicalName", null);
        setField(term75969, term75969.getClass(), "_class", null);
        setIntField(term75969, term75969.getClass(), "_hash", 0);
        setField(term75969, term75969.getClass(), "_valueHandler", null);
        setField(term75969, term75969.getClass(), "_typeHandler", null);
        setBooleanField(term75969, term75969.getClass(), "_asStatic", false);
        setElement(term75966, 2, term75969);
        setField(term75970, term75970.getClass(), "_keyType", null);
        setField(term75970, term75970.getClass(), "_valueType", null);
        setField(term75970, term75970.getClass(), "_superClass", null);
        setField(term75970, term75970.getClass(), "_superInterfaces", null);
        setField(term75970, term75970.getClass(), "_bindings", null);
        setField(term75970, term75970.getClass(), "_canonicalName", null);
        setField(term75970, term75970.getClass(), "_class", null);
        setIntField(term75970, term75970.getClass(), "_hash", 0);
        setField(term75970, term75970.getClass(), "_valueHandler", null);
        setField(term75970, term75970.getClass(), "_typeHandler", null);
        setBooleanField(term75970, term75970.getClass(), "_asStatic", false);
        setElement(term75966, 3, term75970);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term75351;
        args[1] = term75352;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term75958));
        assertTrue(recursiveEquals(term75351, term75965));
        assertTrue(recursiveEquals(term75352, term75966));
    }

};


