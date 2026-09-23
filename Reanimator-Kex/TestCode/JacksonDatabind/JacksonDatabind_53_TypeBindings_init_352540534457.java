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

public class TypeBindings_init_352540534457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177343;
     Object term177344;
     Object term177981;
     Object term177988;
     Object term177989;

    public TypeBindings_init_352540534457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term177508 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term177508, term177508.getClass(), "_names", null);
        setField(term177508, term177508.getClass(), "_types", null);
        term177343 = (Object[]) newArray("java.lang.String", 4);
        term177344 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term177614 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term177718 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term177818 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term177938 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setIntField(term177614, term177614.getClass(), "_hash", 0);
        setElement(term177344, 0, term177614);
        setIntField(term177718, term177718.getClass(), "_hash", 0);
        setElement(term177344, 1, term177718);
        setIntField(term177818, term177818.getClass(), "_hash", 0);
        setElement(term177344, 2, term177818);
        setElement(term177344, 3, term177938);
        term177981 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term177982 = (Object[]) newArray("java.lang.String", 4);
        Object[] term177983 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term177984 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term177985 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term177986 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term177987 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term177981, term177981.getClass(), "_names", term177982);
        setField(term177984, term177984.getClass(), "_elementType", null);
        setField(term177984, term177984.getClass(), "_superClass", null);
        setField(term177984, term177984.getClass(), "_superInterfaces", null);
        setField(term177984, term177984.getClass(), "_bindings", null);
        setField(term177984, term177984.getClass(), "_canonicalName", null);
        setField(term177984, term177984.getClass(), "_class", null);
        setIntField(term177984, term177984.getClass(), "_hash", 0);
        setField(term177984, term177984.getClass(), "_valueHandler", null);
        setField(term177984, term177984.getClass(), "_typeHandler", null);
        setBooleanField(term177984, term177984.getClass(), "_asStatic", false);
        setElement(term177983, 0, term177984);
        setField(term177985, term177985.getClass(), "_referencedType", null);
        setField(term177985, term177985.getClass(), "_superClass", null);
        setField(term177985, term177985.getClass(), "_superInterfaces", null);
        setField(term177985, term177985.getClass(), "_bindings", null);
        setField(term177985, term177985.getClass(), "_canonicalName", null);
        setField(term177985, term177985.getClass(), "_class", null);
        setIntField(term177985, term177985.getClass(), "_hash", 0);
        setField(term177985, term177985.getClass(), "_valueHandler", null);
        setField(term177985, term177985.getClass(), "_typeHandler", null);
        setBooleanField(term177985, term177985.getClass(), "_asStatic", false);
        setElement(term177983, 1, term177985);
        setField(term177986, term177986.getClass(), "_keyType", null);
        setField(term177986, term177986.getClass(), "_valueType", null);
        setField(term177986, term177986.getClass(), "_superClass", null);
        setField(term177986, term177986.getClass(), "_superInterfaces", null);
        setField(term177986, term177986.getClass(), "_bindings", null);
        setField(term177986, term177986.getClass(), "_canonicalName", null);
        setField(term177986, term177986.getClass(), "_class", null);
        setIntField(term177986, term177986.getClass(), "_hash", 0);
        setField(term177986, term177986.getClass(), "_valueHandler", null);
        setField(term177986, term177986.getClass(), "_typeHandler", null);
        setBooleanField(term177986, term177986.getClass(), "_asStatic", false);
        setElement(term177983, 2, term177986);
        setField(term177987, term177987.getClass(), "_referencedType", null);
        setField(term177987, term177987.getClass(), "_superClass", null);
        setField(term177987, term177987.getClass(), "_superInterfaces", null);
        setField(term177987, term177987.getClass(), "_bindings", null);
        setField(term177987, term177987.getClass(), "_canonicalName", null);
        setField(term177987, term177987.getClass(), "_class", null);
        setIntField(term177987, term177987.getClass(), "_hash", 0);
        setField(term177987, term177987.getClass(), "_valueHandler", null);
        setField(term177987, term177987.getClass(), "_typeHandler", null);
        setBooleanField(term177987, term177987.getClass(), "_asStatic", false);
        setElement(term177983, 3, term177987);
        setField(term177981, term177981.getClass(), "_types", term177983);
        setField(term177981, term177981.getClass(), "_unboundVariables", null);
        setIntField(term177981, term177981.getClass(), "_hashCode", 1);
        term177988 = (Object[]) newArray("java.lang.String", 4);
        term177989 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term177990 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term177991 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term177992 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term177993 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term177990, term177990.getClass(), "_elementType", null);
        setField(term177990, term177990.getClass(), "_superClass", null);
        setField(term177990, term177990.getClass(), "_superInterfaces", null);
        setField(term177990, term177990.getClass(), "_bindings", null);
        setField(term177990, term177990.getClass(), "_canonicalName", null);
        setField(term177990, term177990.getClass(), "_class", null);
        setIntField(term177990, term177990.getClass(), "_hash", 0);
        setField(term177990, term177990.getClass(), "_valueHandler", null);
        setField(term177990, term177990.getClass(), "_typeHandler", null);
        setBooleanField(term177990, term177990.getClass(), "_asStatic", false);
        setElement(term177989, 0, term177990);
        setField(term177991, term177991.getClass(), "_referencedType", null);
        setField(term177991, term177991.getClass(), "_superClass", null);
        setField(term177991, term177991.getClass(), "_superInterfaces", null);
        setField(term177991, term177991.getClass(), "_bindings", null);
        setField(term177991, term177991.getClass(), "_canonicalName", null);
        setField(term177991, term177991.getClass(), "_class", null);
        setIntField(term177991, term177991.getClass(), "_hash", 0);
        setField(term177991, term177991.getClass(), "_valueHandler", null);
        setField(term177991, term177991.getClass(), "_typeHandler", null);
        setBooleanField(term177991, term177991.getClass(), "_asStatic", false);
        setElement(term177989, 1, term177991);
        setField(term177992, term177992.getClass(), "_keyType", null);
        setField(term177992, term177992.getClass(), "_valueType", null);
        setField(term177992, term177992.getClass(), "_superClass", null);
        setField(term177992, term177992.getClass(), "_superInterfaces", null);
        setField(term177992, term177992.getClass(), "_bindings", null);
        setField(term177992, term177992.getClass(), "_canonicalName", null);
        setField(term177992, term177992.getClass(), "_class", null);
        setIntField(term177992, term177992.getClass(), "_hash", 0);
        setField(term177992, term177992.getClass(), "_valueHandler", null);
        setField(term177992, term177992.getClass(), "_typeHandler", null);
        setBooleanField(term177992, term177992.getClass(), "_asStatic", false);
        setElement(term177989, 2, term177992);
        setField(term177993, term177993.getClass(), "_referencedType", null);
        setField(term177993, term177993.getClass(), "_superClass", null);
        setField(term177993, term177993.getClass(), "_superInterfaces", null);
        setField(term177993, term177993.getClass(), "_bindings", null);
        setField(term177993, term177993.getClass(), "_canonicalName", null);
        setField(term177993, term177993.getClass(), "_class", null);
        setIntField(term177993, term177993.getClass(), "_hash", 0);
        setField(term177993, term177993.getClass(), "_valueHandler", null);
        setField(term177993, term177993.getClass(), "_typeHandler", null);
        setBooleanField(term177993, term177993.getClass(), "_asStatic", false);
        setElement(term177989, 3, term177993);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term177343;
        args[1] = term177344;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term177981));
        assertTrue(recursiveEquals(term177343, term177988));
        assertTrue(recursiveEquals(term177344, term177989));
    }

};


