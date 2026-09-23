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

public class CollectionType_construct_27880605377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25806;
     Object term25910;
     Object term26902;
     Object term26903;
     Object term26771;

    public CollectionType_construct_27880605377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25806 = Class.forName((String) "java.io.ExpiringCache");
        term25910 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term25910, term25910.getClass(), "_hash", 0);
        term26902 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term26902, term26902.getClass(), "_referencedType", null);
        setField(term26902, term26902.getClass(), "_superClass", null);
        setField(term26902, term26902.getClass(), "_superInterfaces", null);
        setField(term26902, term26902.getClass(), "_bindings", null);
        setField(term26902, term26902.getClass(), "_canonicalName", null);
        setField(term26902, term26902.getClass(), "_class", null);
        setIntField(term26902, term26902.getClass(), "_hash", 0);
        setField(term26902, term26902.getClass(), "_valueHandler", null);
        setField(term26902, term26902.getClass(), "_typeHandler", null);
        setBooleanField(term26902, term26902.getClass(), "_asStatic", false);
        term26903 = Class.forName((String) "kex.java.util.concurrent.atomic.AtomicLongArray");
        Class<? extends Object> term26776 = Class.forName((String) "kex.java.util.concurrent.atomic.AtomicLongArray");
        term26771 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term26768 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term26772 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term26773 = (Object[]) newArray("java.lang.String", 0);
        Object[] term26774 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term26768, term26768.getClass(), "_referencedType", null);
        setField(term26768, term26768.getClass(), "_superClass", null);
        setField(term26768, term26768.getClass(), "_superInterfaces", null);
        setField(term26768, term26768.getClass(), "_bindings", null);
        setField(term26768, term26768.getClass(), "_canonicalName", null);
        setField(term26768, term26768.getClass(), "_class", null);
        setIntField(term26768, term26768.getClass(), "_hash", 0);
        setField(term26768, term26768.getClass(), "_valueHandler", null);
        setField(term26768, term26768.getClass(), "_typeHandler", null);
        setBooleanField(term26768, term26768.getClass(), "_asStatic", false);
        setField(term26771, term26771.getClass(), "_elementType", term26768);
        setField(term26771, term26771.getClass(), "_superClass", null);
        setField(term26771, term26771.getClass(), "_superInterfaces", null);
        setField(term26772, term26772.getClass(), "_names", term26773);
        setField(term26772, term26772.getClass(), "_types", term26774);
        setField(term26772, term26772.getClass(), "_unboundVariables", null);
        setIntField(term26772, term26772.getClass(), "_hashCode", 1);
        setField(term26771, term26771.getClass(), "_bindings", term26772);
        setField(term26771, term26771.getClass(), "_canonicalName", null);
        setField(term26771, term26771.getClass(), "_class", term26776);
        setIntField(term26771, term26771.getClass(), "_hash", 2003334742);
        setField(term26771, term26771.getClass(), "_valueHandler", null);
        setField(term26771, term26771.getClass(), "_typeHandler", null);
        setBooleanField(term26771, term26771.getClass(), "_asStatic", false);
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
        args[0] = term25806;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term25910;
        Object retValue = callMethod(klass, "construct", argTypes, null, args);
        assertTrue(recursiveEquals(term25806, term26902));
        assertTrue(recursiveEquals(term25910, null));
        assertTrue(recursiveEquals(retValue, term26771));
    }

};


