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

public class TypeBindings_init_352540534487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191236;
     Object term191237;
     Object term192080;
     Object term192087;
     Object term192088;

    public TypeBindings_init_352540534487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term191395 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        term191237 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term191876 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term191924 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term191977 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term192037 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term191395, term191395.getClass(), "_names", null);
        setIntField(term191876, term191876.getClass(), "_hash", 0);
        setElement(term191237, 0, term191876);
        setIntField(term191924, term191924.getClass(), "_hash", 0);
        setElement(term191237, 1, term191924);
        setIntField(term191977, term191977.getClass(), "_hash", 0);
        setElement(term191237, 2, term191977);
        setElement(term191237, 3, term192037);
        setField(term191395, term191395.getClass(), "_types", term191237);
        term191236 = (Object[]) newArray("java.lang.String", 4);
        term192080 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term192081 = (Object[]) newArray("java.lang.String", 4);
        Object[] term192082 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term192083 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term192084 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term192085 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term192086 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term192080, term192080.getClass(), "_names", term192081);
        setField(term192083, term192083.getClass(), "_elementType", null);
        setField(term192083, term192083.getClass(), "_superClass", null);
        setField(term192083, term192083.getClass(), "_superInterfaces", null);
        setField(term192083, term192083.getClass(), "_bindings", null);
        setField(term192083, term192083.getClass(), "_canonicalName", null);
        setField(term192083, term192083.getClass(), "_class", null);
        setIntField(term192083, term192083.getClass(), "_hash", 0);
        setField(term192083, term192083.getClass(), "_valueHandler", null);
        setField(term192083, term192083.getClass(), "_typeHandler", null);
        setBooleanField(term192083, term192083.getClass(), "_asStatic", false);
        setElement(term192082, 0, term192083);
        setField(term192084, term192084.getClass(), "_componentType", null);
        setField(term192084, term192084.getClass(), "_emptyArray", null);
        setField(term192084, term192084.getClass(), "_superClass", null);
        setField(term192084, term192084.getClass(), "_superInterfaces", null);
        setField(term192084, term192084.getClass(), "_bindings", null);
        setField(term192084, term192084.getClass(), "_canonicalName", null);
        setField(term192084, term192084.getClass(), "_class", null);
        setIntField(term192084, term192084.getClass(), "_hash", 0);
        setField(term192084, term192084.getClass(), "_valueHandler", null);
        setField(term192084, term192084.getClass(), "_typeHandler", null);
        setBooleanField(term192084, term192084.getClass(), "_asStatic", false);
        setElement(term192082, 1, term192084);
        setField(term192085, term192085.getClass(), "_elementType", null);
        setField(term192085, term192085.getClass(), "_superClass", null);
        setField(term192085, term192085.getClass(), "_superInterfaces", null);
        setField(term192085, term192085.getClass(), "_bindings", null);
        setField(term192085, term192085.getClass(), "_canonicalName", null);
        setField(term192085, term192085.getClass(), "_class", null);
        setIntField(term192085, term192085.getClass(), "_hash", 0);
        setField(term192085, term192085.getClass(), "_valueHandler", null);
        setField(term192085, term192085.getClass(), "_typeHandler", null);
        setBooleanField(term192085, term192085.getClass(), "_asStatic", false);
        setElement(term192082, 2, term192085);
        setField(term192086, term192086.getClass(), "_referencedType", null);
        setField(term192086, term192086.getClass(), "_superClass", null);
        setField(term192086, term192086.getClass(), "_superInterfaces", null);
        setField(term192086, term192086.getClass(), "_bindings", null);
        setField(term192086, term192086.getClass(), "_canonicalName", null);
        setField(term192086, term192086.getClass(), "_class", null);
        setIntField(term192086, term192086.getClass(), "_hash", 0);
        setField(term192086, term192086.getClass(), "_valueHandler", null);
        setField(term192086, term192086.getClass(), "_typeHandler", null);
        setBooleanField(term192086, term192086.getClass(), "_asStatic", false);
        setElement(term192082, 3, term192086);
        setField(term192080, term192080.getClass(), "_types", term192082);
        setField(term192080, term192080.getClass(), "_unboundVariables", null);
        setIntField(term192080, term192080.getClass(), "_hashCode", 1);
        term192087 = (Object[]) newArray("java.lang.String", 4);
        term192088 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term192089 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term192090 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term192091 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term192092 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term192089, term192089.getClass(), "_elementType", null);
        setField(term192089, term192089.getClass(), "_superClass", null);
        setField(term192089, term192089.getClass(), "_superInterfaces", null);
        setField(term192089, term192089.getClass(), "_bindings", null);
        setField(term192089, term192089.getClass(), "_canonicalName", null);
        setField(term192089, term192089.getClass(), "_class", null);
        setIntField(term192089, term192089.getClass(), "_hash", 0);
        setField(term192089, term192089.getClass(), "_valueHandler", null);
        setField(term192089, term192089.getClass(), "_typeHandler", null);
        setBooleanField(term192089, term192089.getClass(), "_asStatic", false);
        setElement(term192088, 0, term192089);
        setField(term192090, term192090.getClass(), "_componentType", null);
        setField(term192090, term192090.getClass(), "_emptyArray", null);
        setField(term192090, term192090.getClass(), "_superClass", null);
        setField(term192090, term192090.getClass(), "_superInterfaces", null);
        setField(term192090, term192090.getClass(), "_bindings", null);
        setField(term192090, term192090.getClass(), "_canonicalName", null);
        setField(term192090, term192090.getClass(), "_class", null);
        setIntField(term192090, term192090.getClass(), "_hash", 0);
        setField(term192090, term192090.getClass(), "_valueHandler", null);
        setField(term192090, term192090.getClass(), "_typeHandler", null);
        setBooleanField(term192090, term192090.getClass(), "_asStatic", false);
        setElement(term192088, 1, term192090);
        setField(term192091, term192091.getClass(), "_elementType", null);
        setField(term192091, term192091.getClass(), "_superClass", null);
        setField(term192091, term192091.getClass(), "_superInterfaces", null);
        setField(term192091, term192091.getClass(), "_bindings", null);
        setField(term192091, term192091.getClass(), "_canonicalName", null);
        setField(term192091, term192091.getClass(), "_class", null);
        setIntField(term192091, term192091.getClass(), "_hash", 0);
        setField(term192091, term192091.getClass(), "_valueHandler", null);
        setField(term192091, term192091.getClass(), "_typeHandler", null);
        setBooleanField(term192091, term192091.getClass(), "_asStatic", false);
        setElement(term192088, 2, term192091);
        setField(term192092, term192092.getClass(), "_referencedType", null);
        setField(term192092, term192092.getClass(), "_superClass", null);
        setField(term192092, term192092.getClass(), "_superInterfaces", null);
        setField(term192092, term192092.getClass(), "_bindings", null);
        setField(term192092, term192092.getClass(), "_canonicalName", null);
        setField(term192092, term192092.getClass(), "_class", null);
        setIntField(term192092, term192092.getClass(), "_hash", 0);
        setField(term192092, term192092.getClass(), "_valueHandler", null);
        setField(term192092, term192092.getClass(), "_typeHandler", null);
        setBooleanField(term192092, term192092.getClass(), "_asStatic", false);
        setElement(term192088, 3, term192092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term191236;
        args[1] = term191237;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term192080));
        assertTrue(recursiveEquals(term191236, term192087));
        assertTrue(recursiveEquals(term191237, term192088));
    }

};


