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

public class TypeBindings_init_352540534228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74327;
     Object term74328;
     Object term75294;
     Object term75300;
     Object term75301;

    public TypeBindings_init_352540534228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term74484 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term74332 = (Object[]) newArray("java.lang.String", 0);
        Object[] term74333 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term74484, term74484.getClass(), "_names", term74332);
        setField(term74484, term74484.getClass(), "_types", term74333);
        term74327 = (Object[]) newArray("java.lang.String", 3);
        term74328 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term74590 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term74694 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term74798 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term74590, term74590.getClass(), "_hash", 0);
        setElement(term74328, 0, term74590);
        setIntField(term74694, term74694.getClass(), "_hash", 0);
        setElement(term74328, 1, term74694);
        setElement(term74328, 2, term74798);
        term75294 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term75295 = (Object[]) newArray("java.lang.String", 3);
        Object[] term75296 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term75297 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term75298 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term75299 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term75294, term75294.getClass(), "_names", term75295);
        setField(term75297, term75297.getClass(), "_elementType", null);
        setField(term75297, term75297.getClass(), "_superClass", null);
        setField(term75297, term75297.getClass(), "_superInterfaces", null);
        setField(term75297, term75297.getClass(), "_bindings", null);
        setField(term75297, term75297.getClass(), "_canonicalName", null);
        setField(term75297, term75297.getClass(), "_class", null);
        setIntField(term75297, term75297.getClass(), "_hash", 0);
        setField(term75297, term75297.getClass(), "_valueHandler", null);
        setField(term75297, term75297.getClass(), "_typeHandler", null);
        setBooleanField(term75297, term75297.getClass(), "_asStatic", false);
        setElement(term75296, 0, term75297);
        setField(term75298, term75298.getClass(), "_referencedType", null);
        setField(term75298, term75298.getClass(), "_superClass", null);
        setField(term75298, term75298.getClass(), "_superInterfaces", null);
        setField(term75298, term75298.getClass(), "_bindings", null);
        setField(term75298, term75298.getClass(), "_canonicalName", null);
        setField(term75298, term75298.getClass(), "_class", null);
        setIntField(term75298, term75298.getClass(), "_hash", 0);
        setField(term75298, term75298.getClass(), "_valueHandler", null);
        setField(term75298, term75298.getClass(), "_typeHandler", null);
        setBooleanField(term75298, term75298.getClass(), "_asStatic", false);
        setElement(term75296, 1, term75298);
        setField(term75299, term75299.getClass(), "_referencedType", null);
        setField(term75299, term75299.getClass(), "_superClass", null);
        setField(term75299, term75299.getClass(), "_superInterfaces", null);
        setField(term75299, term75299.getClass(), "_bindings", null);
        setField(term75299, term75299.getClass(), "_canonicalName", null);
        setField(term75299, term75299.getClass(), "_class", null);
        setIntField(term75299, term75299.getClass(), "_hash", 0);
        setField(term75299, term75299.getClass(), "_valueHandler", null);
        setField(term75299, term75299.getClass(), "_typeHandler", null);
        setBooleanField(term75299, term75299.getClass(), "_asStatic", false);
        setElement(term75296, 2, term75299);
        setField(term75294, term75294.getClass(), "_types", term75296);
        setField(term75294, term75294.getClass(), "_unboundVariables", null);
        setIntField(term75294, term75294.getClass(), "_hashCode", 1);
        term75300 = (Object[]) newArray("java.lang.String", 3);
        term75301 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term75302 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term75303 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term75304 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term75302, term75302.getClass(), "_elementType", null);
        setField(term75302, term75302.getClass(), "_superClass", null);
        setField(term75302, term75302.getClass(), "_superInterfaces", null);
        setField(term75302, term75302.getClass(), "_bindings", null);
        setField(term75302, term75302.getClass(), "_canonicalName", null);
        setField(term75302, term75302.getClass(), "_class", null);
        setIntField(term75302, term75302.getClass(), "_hash", 0);
        setField(term75302, term75302.getClass(), "_valueHandler", null);
        setField(term75302, term75302.getClass(), "_typeHandler", null);
        setBooleanField(term75302, term75302.getClass(), "_asStatic", false);
        setElement(term75301, 0, term75302);
        setField(term75303, term75303.getClass(), "_referencedType", null);
        setField(term75303, term75303.getClass(), "_superClass", null);
        setField(term75303, term75303.getClass(), "_superInterfaces", null);
        setField(term75303, term75303.getClass(), "_bindings", null);
        setField(term75303, term75303.getClass(), "_canonicalName", null);
        setField(term75303, term75303.getClass(), "_class", null);
        setIntField(term75303, term75303.getClass(), "_hash", 0);
        setField(term75303, term75303.getClass(), "_valueHandler", null);
        setField(term75303, term75303.getClass(), "_typeHandler", null);
        setBooleanField(term75303, term75303.getClass(), "_asStatic", false);
        setElement(term75301, 1, term75303);
        setField(term75304, term75304.getClass(), "_referencedType", null);
        setField(term75304, term75304.getClass(), "_superClass", null);
        setField(term75304, term75304.getClass(), "_superInterfaces", null);
        setField(term75304, term75304.getClass(), "_bindings", null);
        setField(term75304, term75304.getClass(), "_canonicalName", null);
        setField(term75304, term75304.getClass(), "_class", null);
        setIntField(term75304, term75304.getClass(), "_hash", 0);
        setField(term75304, term75304.getClass(), "_valueHandler", null);
        setField(term75304, term75304.getClass(), "_typeHandler", null);
        setBooleanField(term75304, term75304.getClass(), "_asStatic", false);
        setElement(term75301, 2, term75304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term74327;
        args[1] = term74328;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term75294));
        assertTrue(recursiveEquals(term74327, term75300));
        assertTrue(recursiveEquals(term74328, term75301));
    }

};


