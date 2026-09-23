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

public class TypeBindings_init_352540534212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69652;
     Object term69653;
     Object term70723;
     Object term70730;
     Object term70731;

    public TypeBindings_init_352540534212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term69818 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term69818, term69818.getClass(), "_names", null);
        setField(term69818, term69818.getClass(), "_types", null);
        term69652 = (Object[]) newArray("java.lang.String", 4);
        term69653 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term69924 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term70028 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term70132 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term70228 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setIntField(term69924, term69924.getClass(), "_hash", 0);
        setElement(term69653, 0, term69924);
        setIntField(term70028, term70028.getClass(), "_hash", 0);
        setElement(term69653, 1, term70028);
        setIntField(term70132, term70132.getClass(), "_hash", 0);
        setElement(term69653, 2, term70132);
        setElement(term69653, 3, term70228);
        term70723 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term70724 = (Object[]) newArray("java.lang.String", 4);
        Object[] term70725 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term70726 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term70727 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term70728 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term70729 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term70723, term70723.getClass(), "_names", term70724);
        setField(term70726, term70726.getClass(), "_elementType", null);
        setField(term70726, term70726.getClass(), "_superClass", null);
        setField(term70726, term70726.getClass(), "_superInterfaces", null);
        setField(term70726, term70726.getClass(), "_bindings", null);
        setField(term70726, term70726.getClass(), "_canonicalName", null);
        setField(term70726, term70726.getClass(), "_class", null);
        setIntField(term70726, term70726.getClass(), "_hash", 0);
        setField(term70726, term70726.getClass(), "_valueHandler", null);
        setField(term70726, term70726.getClass(), "_typeHandler", null);
        setBooleanField(term70726, term70726.getClass(), "_asStatic", false);
        setElement(term70725, 0, term70726);
        setField(term70727, term70727.getClass(), "_referencedType", null);
        setField(term70727, term70727.getClass(), "_superClass", null);
        setField(term70727, term70727.getClass(), "_superInterfaces", null);
        setField(term70727, term70727.getClass(), "_bindings", null);
        setField(term70727, term70727.getClass(), "_canonicalName", null);
        setField(term70727, term70727.getClass(), "_class", null);
        setIntField(term70727, term70727.getClass(), "_hash", 0);
        setField(term70727, term70727.getClass(), "_valueHandler", null);
        setField(term70727, term70727.getClass(), "_typeHandler", null);
        setBooleanField(term70727, term70727.getClass(), "_asStatic", false);
        setElement(term70725, 1, term70727);
        setField(term70728, term70728.getClass(), "_referencedType", null);
        setField(term70728, term70728.getClass(), "_superClass", null);
        setField(term70728, term70728.getClass(), "_superInterfaces", null);
        setField(term70728, term70728.getClass(), "_bindings", null);
        setField(term70728, term70728.getClass(), "_canonicalName", null);
        setField(term70728, term70728.getClass(), "_class", null);
        setIntField(term70728, term70728.getClass(), "_hash", 0);
        setField(term70728, term70728.getClass(), "_valueHandler", null);
        setField(term70728, term70728.getClass(), "_typeHandler", null);
        setBooleanField(term70728, term70728.getClass(), "_asStatic", false);
        setElement(term70725, 2, term70728);
        setField(term70729, term70729.getClass(), "_componentType", null);
        setField(term70729, term70729.getClass(), "_emptyArray", null);
        setField(term70729, term70729.getClass(), "_superClass", null);
        setField(term70729, term70729.getClass(), "_superInterfaces", null);
        setField(term70729, term70729.getClass(), "_bindings", null);
        setField(term70729, term70729.getClass(), "_canonicalName", null);
        setField(term70729, term70729.getClass(), "_class", null);
        setIntField(term70729, term70729.getClass(), "_hash", 0);
        setField(term70729, term70729.getClass(), "_valueHandler", null);
        setField(term70729, term70729.getClass(), "_typeHandler", null);
        setBooleanField(term70729, term70729.getClass(), "_asStatic", false);
        setElement(term70725, 3, term70729);
        setField(term70723, term70723.getClass(), "_types", term70725);
        setField(term70723, term70723.getClass(), "_unboundVariables", null);
        setIntField(term70723, term70723.getClass(), "_hashCode", 1);
        term70730 = (Object[]) newArray("java.lang.String", 4);
        term70731 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term70732 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term70733 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term70734 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term70735 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term70732, term70732.getClass(), "_elementType", null);
        setField(term70732, term70732.getClass(), "_superClass", null);
        setField(term70732, term70732.getClass(), "_superInterfaces", null);
        setField(term70732, term70732.getClass(), "_bindings", null);
        setField(term70732, term70732.getClass(), "_canonicalName", null);
        setField(term70732, term70732.getClass(), "_class", null);
        setIntField(term70732, term70732.getClass(), "_hash", 0);
        setField(term70732, term70732.getClass(), "_valueHandler", null);
        setField(term70732, term70732.getClass(), "_typeHandler", null);
        setBooleanField(term70732, term70732.getClass(), "_asStatic", false);
        setElement(term70731, 0, term70732);
        setField(term70733, term70733.getClass(), "_referencedType", null);
        setField(term70733, term70733.getClass(), "_superClass", null);
        setField(term70733, term70733.getClass(), "_superInterfaces", null);
        setField(term70733, term70733.getClass(), "_bindings", null);
        setField(term70733, term70733.getClass(), "_canonicalName", null);
        setField(term70733, term70733.getClass(), "_class", null);
        setIntField(term70733, term70733.getClass(), "_hash", 0);
        setField(term70733, term70733.getClass(), "_valueHandler", null);
        setField(term70733, term70733.getClass(), "_typeHandler", null);
        setBooleanField(term70733, term70733.getClass(), "_asStatic", false);
        setElement(term70731, 1, term70733);
        setField(term70734, term70734.getClass(), "_referencedType", null);
        setField(term70734, term70734.getClass(), "_superClass", null);
        setField(term70734, term70734.getClass(), "_superInterfaces", null);
        setField(term70734, term70734.getClass(), "_bindings", null);
        setField(term70734, term70734.getClass(), "_canonicalName", null);
        setField(term70734, term70734.getClass(), "_class", null);
        setIntField(term70734, term70734.getClass(), "_hash", 0);
        setField(term70734, term70734.getClass(), "_valueHandler", null);
        setField(term70734, term70734.getClass(), "_typeHandler", null);
        setBooleanField(term70734, term70734.getClass(), "_asStatic", false);
        setElement(term70731, 2, term70734);
        setField(term70735, term70735.getClass(), "_componentType", null);
        setField(term70735, term70735.getClass(), "_emptyArray", null);
        setField(term70735, term70735.getClass(), "_superClass", null);
        setField(term70735, term70735.getClass(), "_superInterfaces", null);
        setField(term70735, term70735.getClass(), "_bindings", null);
        setField(term70735, term70735.getClass(), "_canonicalName", null);
        setField(term70735, term70735.getClass(), "_class", null);
        setIntField(term70735, term70735.getClass(), "_hash", 0);
        setField(term70735, term70735.getClass(), "_valueHandler", null);
        setField(term70735, term70735.getClass(), "_typeHandler", null);
        setBooleanField(term70735, term70735.getClass(), "_asStatic", false);
        setElement(term70731, 3, term70735);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term69652;
        args[1] = term69653;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term70723));
        assertTrue(recursiveEquals(term69652, term70730));
        assertTrue(recursiveEquals(term69653, term70731));
    }

};


