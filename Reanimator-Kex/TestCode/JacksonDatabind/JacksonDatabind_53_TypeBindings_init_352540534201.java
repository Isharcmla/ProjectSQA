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

public class TypeBindings_init_352540534201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66880;
     Object term66881;
     Object term67397;
     Object term67403;
     Object term67404;

    public TypeBindings_init_352540534201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term67043 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term66885 = (Object[]) newArray("java.lang.String", 0);
        setField(term67043, term67043.getClass(), "_names", term66885);
        setField(term67043, term67043.getClass(), "_types", null);
        term66880 = (Object[]) newArray("java.lang.String", 4);
        term66881 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term67149 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term67253 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term67357 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term67149, term67149.getClass(), "_hash", 0);
        setElement(term66881, 0, term67149);
        setIntField(term67253, term67253.getClass(), "_hash", 0);
        setElement(term66881, 1, term67253);
        setIntField(term67357, term67357.getClass(), "_hash", 0);
        setElement(term66881, 2, term67357);
        setElement(term66881, 3, term67149);
        term67397 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term67398 = (Object[]) newArray("java.lang.String", 4);
        Object[] term67399 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term67400 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term67401 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term67402 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term67397, term67397.getClass(), "_names", term67398);
        setField(term67400, term67400.getClass(), "_elementType", null);
        setField(term67400, term67400.getClass(), "_superClass", null);
        setField(term67400, term67400.getClass(), "_superInterfaces", null);
        setField(term67400, term67400.getClass(), "_bindings", null);
        setField(term67400, term67400.getClass(), "_canonicalName", null);
        setField(term67400, term67400.getClass(), "_class", null);
        setIntField(term67400, term67400.getClass(), "_hash", 0);
        setField(term67400, term67400.getClass(), "_valueHandler", null);
        setField(term67400, term67400.getClass(), "_typeHandler", null);
        setBooleanField(term67400, term67400.getClass(), "_asStatic", false);
        setElement(term67399, 0, term67400);
        setField(term67401, term67401.getClass(), "_referencedType", null);
        setField(term67401, term67401.getClass(), "_superClass", null);
        setField(term67401, term67401.getClass(), "_superInterfaces", null);
        setField(term67401, term67401.getClass(), "_bindings", null);
        setField(term67401, term67401.getClass(), "_canonicalName", null);
        setField(term67401, term67401.getClass(), "_class", null);
        setIntField(term67401, term67401.getClass(), "_hash", 0);
        setField(term67401, term67401.getClass(), "_valueHandler", null);
        setField(term67401, term67401.getClass(), "_typeHandler", null);
        setBooleanField(term67401, term67401.getClass(), "_asStatic", false);
        setElement(term67399, 1, term67401);
        setField(term67402, term67402.getClass(), "_referencedType", null);
        setField(term67402, term67402.getClass(), "_superClass", null);
        setField(term67402, term67402.getClass(), "_superInterfaces", null);
        setField(term67402, term67402.getClass(), "_bindings", null);
        setField(term67402, term67402.getClass(), "_canonicalName", null);
        setField(term67402, term67402.getClass(), "_class", null);
        setIntField(term67402, term67402.getClass(), "_hash", 0);
        setField(term67402, term67402.getClass(), "_valueHandler", null);
        setField(term67402, term67402.getClass(), "_typeHandler", null);
        setBooleanField(term67402, term67402.getClass(), "_asStatic", false);
        setElement(term67399, 2, term67402);
        setElement(term67399, 3, term67400);
        setField(term67397, term67397.getClass(), "_types", term67399);
        setField(term67397, term67397.getClass(), "_unboundVariables", null);
        setIntField(term67397, term67397.getClass(), "_hashCode", 1);
        term67403 = (Object[]) newArray("java.lang.String", 4);
        term67404 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term67405 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term67406 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term67407 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term67405, term67405.getClass(), "_elementType", null);
        setField(term67405, term67405.getClass(), "_superClass", null);
        setField(term67405, term67405.getClass(), "_superInterfaces", null);
        setField(term67405, term67405.getClass(), "_bindings", null);
        setField(term67405, term67405.getClass(), "_canonicalName", null);
        setField(term67405, term67405.getClass(), "_class", null);
        setIntField(term67405, term67405.getClass(), "_hash", 0);
        setField(term67405, term67405.getClass(), "_valueHandler", null);
        setField(term67405, term67405.getClass(), "_typeHandler", null);
        setBooleanField(term67405, term67405.getClass(), "_asStatic", false);
        setElement(term67404, 0, term67405);
        setField(term67406, term67406.getClass(), "_referencedType", null);
        setField(term67406, term67406.getClass(), "_superClass", null);
        setField(term67406, term67406.getClass(), "_superInterfaces", null);
        setField(term67406, term67406.getClass(), "_bindings", null);
        setField(term67406, term67406.getClass(), "_canonicalName", null);
        setField(term67406, term67406.getClass(), "_class", null);
        setIntField(term67406, term67406.getClass(), "_hash", 0);
        setField(term67406, term67406.getClass(), "_valueHandler", null);
        setField(term67406, term67406.getClass(), "_typeHandler", null);
        setBooleanField(term67406, term67406.getClass(), "_asStatic", false);
        setElement(term67404, 1, term67406);
        setField(term67407, term67407.getClass(), "_referencedType", null);
        setField(term67407, term67407.getClass(), "_superClass", null);
        setField(term67407, term67407.getClass(), "_superInterfaces", null);
        setField(term67407, term67407.getClass(), "_bindings", null);
        setField(term67407, term67407.getClass(), "_canonicalName", null);
        setField(term67407, term67407.getClass(), "_class", null);
        setIntField(term67407, term67407.getClass(), "_hash", 0);
        setField(term67407, term67407.getClass(), "_valueHandler", null);
        setField(term67407, term67407.getClass(), "_typeHandler", null);
        setBooleanField(term67407, term67407.getClass(), "_asStatic", false);
        setElement(term67404, 2, term67407);
        setElement(term67404, 3, term67405);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term66880;
        args[1] = term66881;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term67397));
        assertTrue(recursiveEquals(term66880, term67403));
        assertTrue(recursiveEquals(term66881, term67404));
    }

};


