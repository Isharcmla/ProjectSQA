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

public class CollectionType_construct_27880605374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22565;
     Object term22657;
     Object term24888;
     Object term24889;
     Object term24710;

    public CollectionType_construct_27880605374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22565 = Class.forName((String) "java.nio.file.Files");
        term22657 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setIntField(term22657, term22657.getClass(), "_hash", 0);
        term24888 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term24888, term24888.getClass(), "_keyType", null);
        setField(term24888, term24888.getClass(), "_valueType", null);
        setField(term24888, term24888.getClass(), "_superClass", null);
        setField(term24888, term24888.getClass(), "_superInterfaces", null);
        setField(term24888, term24888.getClass(), "_bindings", null);
        setField(term24888, term24888.getClass(), "_canonicalName", null);
        setField(term24888, term24888.getClass(), "_class", null);
        setIntField(term24888, term24888.getClass(), "_hash", 0);
        setField(term24888, term24888.getClass(), "_valueHandler", null);
        setField(term24888, term24888.getClass(), "_typeHandler", null);
        setBooleanField(term24888, term24888.getClass(), "_asStatic", false);
        term24889 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringCtorKeyDeserializer");
        Class<? extends Object> term24715 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringCtorKeyDeserializer");
        term24710 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term24707 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term24711 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term24712 = (Object[]) newArray("java.lang.String", 0);
        Object[] term24713 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term24707, term24707.getClass(), "_keyType", null);
        setField(term24707, term24707.getClass(), "_valueType", null);
        setField(term24707, term24707.getClass(), "_superClass", null);
        setField(term24707, term24707.getClass(), "_superInterfaces", null);
        setField(term24707, term24707.getClass(), "_bindings", null);
        setField(term24707, term24707.getClass(), "_canonicalName", null);
        setField(term24707, term24707.getClass(), "_class", null);
        setIntField(term24707, term24707.getClass(), "_hash", 0);
        setField(term24707, term24707.getClass(), "_valueHandler", null);
        setField(term24707, term24707.getClass(), "_typeHandler", null);
        setBooleanField(term24707, term24707.getClass(), "_asStatic", false);
        setField(term24710, term24710.getClass(), "_elementType", term24707);
        setField(term24710, term24710.getClass(), "_superClass", null);
        setField(term24710, term24710.getClass(), "_superInterfaces", null);
        setField(term24711, term24711.getClass(), "_names", term24712);
        setField(term24711, term24711.getClass(), "_types", term24713);
        setField(term24711, term24711.getClass(), "_unboundVariables", null);
        setIntField(term24711, term24711.getClass(), "_hashCode", 1);
        setField(term24710, term24710.getClass(), "_bindings", term24711);
        setField(term24710, term24710.getClass(), "_canonicalName", null);
        setField(term24710, term24710.getClass(), "_class", term24715);
        setIntField(term24710, term24710.getClass(), "_hash", 1541879409);
        setField(term24710, term24710.getClass(), "_valueHandler", null);
        setField(term24710, term24710.getClass(), "_typeHandler", null);
        setBooleanField(term24710, term24710.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.CollectionType");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[5];
        args[0] = term22565;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term22657;
        Object retValue = callMethod(klass, "construct", argTypes, null, args);
        assertTrue(recursiveEquals(term22565, term24888));
        assertTrue(recursiveEquals(term22657, null));
        assertTrue(recursiveEquals(retValue, term24710));
    }

};


