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

public class TypeBindings_init_352540534327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109862;
     Object term109863;
     Object term110369;
     Object term110375;
     Object term110376;

    public TypeBindings_init_352540534327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term110018 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term109867 = (Object[]) newArray("java.lang.String", 0);
        setField(term110018, term110018.getClass(), "_names", term109867);
        setField(term110018, term110018.getClass(), "_types", null);
        term109862 = (Object[]) newArray("java.lang.String", 3);
        term109863 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term110138 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term110242 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term110334 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setIntField(term110138, term110138.getClass(), "_hash", 0);
        setElement(term109863, 0, term110138);
        setIntField(term110242, term110242.getClass(), "_hash", 0);
        setElement(term109863, 1, term110242);
        setElement(term109863, 2, term110334);
        term110369 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term110370 = (Object[]) newArray("java.lang.String", 3);
        Object[] term110371 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term110372 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term110373 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term110374 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term110369, term110369.getClass(), "_names", term110370);
        setField(term110372, term110372.getClass(), "_referencedType", null);
        setField(term110372, term110372.getClass(), "_superClass", null);
        setField(term110372, term110372.getClass(), "_superInterfaces", null);
        setField(term110372, term110372.getClass(), "_bindings", null);
        setField(term110372, term110372.getClass(), "_canonicalName", null);
        setField(term110372, term110372.getClass(), "_class", null);
        setIntField(term110372, term110372.getClass(), "_hash", 0);
        setField(term110372, term110372.getClass(), "_valueHandler", null);
        setField(term110372, term110372.getClass(), "_typeHandler", null);
        setBooleanField(term110372, term110372.getClass(), "_asStatic", false);
        setElement(term110371, 0, term110372);
        setField(term110373, term110373.getClass(), "_referencedType", null);
        setField(term110373, term110373.getClass(), "_superClass", null);
        setField(term110373, term110373.getClass(), "_superInterfaces", null);
        setField(term110373, term110373.getClass(), "_bindings", null);
        setField(term110373, term110373.getClass(), "_canonicalName", null);
        setField(term110373, term110373.getClass(), "_class", null);
        setIntField(term110373, term110373.getClass(), "_hash", 0);
        setField(term110373, term110373.getClass(), "_valueHandler", null);
        setField(term110373, term110373.getClass(), "_typeHandler", null);
        setBooleanField(term110373, term110373.getClass(), "_asStatic", false);
        setElement(term110371, 1, term110373);
        setField(term110374, term110374.getClass(), "_keyType", null);
        setField(term110374, term110374.getClass(), "_valueType", null);
        setField(term110374, term110374.getClass(), "_superClass", null);
        setField(term110374, term110374.getClass(), "_superInterfaces", null);
        setField(term110374, term110374.getClass(), "_bindings", null);
        setField(term110374, term110374.getClass(), "_canonicalName", null);
        setField(term110374, term110374.getClass(), "_class", null);
        setIntField(term110374, term110374.getClass(), "_hash", 0);
        setField(term110374, term110374.getClass(), "_valueHandler", null);
        setField(term110374, term110374.getClass(), "_typeHandler", null);
        setBooleanField(term110374, term110374.getClass(), "_asStatic", false);
        setElement(term110371, 2, term110374);
        setField(term110369, term110369.getClass(), "_types", term110371);
        setField(term110369, term110369.getClass(), "_unboundVariables", null);
        setIntField(term110369, term110369.getClass(), "_hashCode", 1);
        term110375 = (Object[]) newArray("java.lang.String", 3);
        term110376 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term110377 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term110378 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term110379 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term110377, term110377.getClass(), "_referencedType", null);
        setField(term110377, term110377.getClass(), "_superClass", null);
        setField(term110377, term110377.getClass(), "_superInterfaces", null);
        setField(term110377, term110377.getClass(), "_bindings", null);
        setField(term110377, term110377.getClass(), "_canonicalName", null);
        setField(term110377, term110377.getClass(), "_class", null);
        setIntField(term110377, term110377.getClass(), "_hash", 0);
        setField(term110377, term110377.getClass(), "_valueHandler", null);
        setField(term110377, term110377.getClass(), "_typeHandler", null);
        setBooleanField(term110377, term110377.getClass(), "_asStatic", false);
        setElement(term110376, 0, term110377);
        setField(term110378, term110378.getClass(), "_referencedType", null);
        setField(term110378, term110378.getClass(), "_superClass", null);
        setField(term110378, term110378.getClass(), "_superInterfaces", null);
        setField(term110378, term110378.getClass(), "_bindings", null);
        setField(term110378, term110378.getClass(), "_canonicalName", null);
        setField(term110378, term110378.getClass(), "_class", null);
        setIntField(term110378, term110378.getClass(), "_hash", 0);
        setField(term110378, term110378.getClass(), "_valueHandler", null);
        setField(term110378, term110378.getClass(), "_typeHandler", null);
        setBooleanField(term110378, term110378.getClass(), "_asStatic", false);
        setElement(term110376, 1, term110378);
        setField(term110379, term110379.getClass(), "_keyType", null);
        setField(term110379, term110379.getClass(), "_valueType", null);
        setField(term110379, term110379.getClass(), "_superClass", null);
        setField(term110379, term110379.getClass(), "_superInterfaces", null);
        setField(term110379, term110379.getClass(), "_bindings", null);
        setField(term110379, term110379.getClass(), "_canonicalName", null);
        setField(term110379, term110379.getClass(), "_class", null);
        setIntField(term110379, term110379.getClass(), "_hash", 0);
        setField(term110379, term110379.getClass(), "_valueHandler", null);
        setField(term110379, term110379.getClass(), "_typeHandler", null);
        setBooleanField(term110379, term110379.getClass(), "_asStatic", false);
        setElement(term110376, 2, term110379);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term109862;
        args[1] = term109863;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term110369));
        assertTrue(recursiveEquals(term109862, term110375));
        assertTrue(recursiveEquals(term109863, term110376));
    }

};


