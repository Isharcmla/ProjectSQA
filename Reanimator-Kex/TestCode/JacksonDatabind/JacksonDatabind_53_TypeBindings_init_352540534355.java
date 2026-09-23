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

public class TypeBindings_init_352540534355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123532;
     Object term123533;
     Object term124185;
     Object term124192;
     Object term124193;

    public TypeBindings_init_352540534355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term123703 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term123538 = (Object[]) newArray("java.lang.String", 0);
        setField(term123703, term123703.getClass(), "_names", term123538);
        setField(term123703, term123703.getClass(), "_types", null);
        term123532 = (Object[]) newArray("java.lang.String", 5);
        term123533 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 5);
        Object term123809 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term123913 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term124017 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term124137 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setIntField(term123809, term123809.getClass(), "_hash", 0);
        setElement(term123533, 0, term123809);
        setIntField(term123913, term123913.getClass(), "_hash", 0);
        setElement(term123533, 1, term123913);
        setIntField(term124017, term124017.getClass(), "_hash", 0);
        setElement(term123533, 2, term124017);
        setIntField(term124137, term124137.getClass(), "_hash", 0);
        setElement(term123533, 3, term124137);
        setElement(term123533, 4, term123913);
        term124185 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term124186 = (Object[]) newArray("java.lang.String", 5);
        Object[] term124187 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 5);
        Object term124188 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term124189 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term124190 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term124191 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term124185, term124185.getClass(), "_names", term124186);
        setField(term124188, term124188.getClass(), "_elementType", null);
        setField(term124188, term124188.getClass(), "_superClass", null);
        setField(term124188, term124188.getClass(), "_superInterfaces", null);
        setField(term124188, term124188.getClass(), "_bindings", null);
        setField(term124188, term124188.getClass(), "_canonicalName", null);
        setField(term124188, term124188.getClass(), "_class", null);
        setIntField(term124188, term124188.getClass(), "_hash", 0);
        setField(term124188, term124188.getClass(), "_valueHandler", null);
        setField(term124188, term124188.getClass(), "_typeHandler", null);
        setBooleanField(term124188, term124188.getClass(), "_asStatic", false);
        setElement(term124187, 0, term124188);
        setField(term124189, term124189.getClass(), "_referencedType", null);
        setField(term124189, term124189.getClass(), "_superClass", null);
        setField(term124189, term124189.getClass(), "_superInterfaces", null);
        setField(term124189, term124189.getClass(), "_bindings", null);
        setField(term124189, term124189.getClass(), "_canonicalName", null);
        setField(term124189, term124189.getClass(), "_class", null);
        setIntField(term124189, term124189.getClass(), "_hash", 0);
        setField(term124189, term124189.getClass(), "_valueHandler", null);
        setField(term124189, term124189.getClass(), "_typeHandler", null);
        setBooleanField(term124189, term124189.getClass(), "_asStatic", false);
        setElement(term124187, 1, term124189);
        setField(term124190, term124190.getClass(), "_referencedType", null);
        setField(term124190, term124190.getClass(), "_superClass", null);
        setField(term124190, term124190.getClass(), "_superInterfaces", null);
        setField(term124190, term124190.getClass(), "_bindings", null);
        setField(term124190, term124190.getClass(), "_canonicalName", null);
        setField(term124190, term124190.getClass(), "_class", null);
        setIntField(term124190, term124190.getClass(), "_hash", 0);
        setField(term124190, term124190.getClass(), "_valueHandler", null);
        setField(term124190, term124190.getClass(), "_typeHandler", null);
        setBooleanField(term124190, term124190.getClass(), "_asStatic", false);
        setElement(term124187, 2, term124190);
        setField(term124191, term124191.getClass(), "_referencedType", null);
        setField(term124191, term124191.getClass(), "_superClass", null);
        setField(term124191, term124191.getClass(), "_superInterfaces", null);
        setField(term124191, term124191.getClass(), "_bindings", null);
        setField(term124191, term124191.getClass(), "_canonicalName", null);
        setField(term124191, term124191.getClass(), "_class", null);
        setIntField(term124191, term124191.getClass(), "_hash", 0);
        setField(term124191, term124191.getClass(), "_valueHandler", null);
        setField(term124191, term124191.getClass(), "_typeHandler", null);
        setBooleanField(term124191, term124191.getClass(), "_asStatic", false);
        setElement(term124187, 3, term124191);
        setElement(term124187, 4, term124189);
        setField(term124185, term124185.getClass(), "_types", term124187);
        setField(term124185, term124185.getClass(), "_unboundVariables", null);
        setIntField(term124185, term124185.getClass(), "_hashCode", 1);
        term124192 = (Object[]) newArray("java.lang.String", 5);
        term124193 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 5);
        Object term124194 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term124195 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term124196 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term124197 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term124194, term124194.getClass(), "_elementType", null);
        setField(term124194, term124194.getClass(), "_superClass", null);
        setField(term124194, term124194.getClass(), "_superInterfaces", null);
        setField(term124194, term124194.getClass(), "_bindings", null);
        setField(term124194, term124194.getClass(), "_canonicalName", null);
        setField(term124194, term124194.getClass(), "_class", null);
        setIntField(term124194, term124194.getClass(), "_hash", 0);
        setField(term124194, term124194.getClass(), "_valueHandler", null);
        setField(term124194, term124194.getClass(), "_typeHandler", null);
        setBooleanField(term124194, term124194.getClass(), "_asStatic", false);
        setElement(term124193, 0, term124194);
        setField(term124195, term124195.getClass(), "_referencedType", null);
        setField(term124195, term124195.getClass(), "_superClass", null);
        setField(term124195, term124195.getClass(), "_superInterfaces", null);
        setField(term124195, term124195.getClass(), "_bindings", null);
        setField(term124195, term124195.getClass(), "_canonicalName", null);
        setField(term124195, term124195.getClass(), "_class", null);
        setIntField(term124195, term124195.getClass(), "_hash", 0);
        setField(term124195, term124195.getClass(), "_valueHandler", null);
        setField(term124195, term124195.getClass(), "_typeHandler", null);
        setBooleanField(term124195, term124195.getClass(), "_asStatic", false);
        setElement(term124193, 1, term124195);
        setField(term124196, term124196.getClass(), "_referencedType", null);
        setField(term124196, term124196.getClass(), "_superClass", null);
        setField(term124196, term124196.getClass(), "_superInterfaces", null);
        setField(term124196, term124196.getClass(), "_bindings", null);
        setField(term124196, term124196.getClass(), "_canonicalName", null);
        setField(term124196, term124196.getClass(), "_class", null);
        setIntField(term124196, term124196.getClass(), "_hash", 0);
        setField(term124196, term124196.getClass(), "_valueHandler", null);
        setField(term124196, term124196.getClass(), "_typeHandler", null);
        setBooleanField(term124196, term124196.getClass(), "_asStatic", false);
        setElement(term124193, 2, term124196);
        setField(term124197, term124197.getClass(), "_referencedType", null);
        setField(term124197, term124197.getClass(), "_superClass", null);
        setField(term124197, term124197.getClass(), "_superInterfaces", null);
        setField(term124197, term124197.getClass(), "_bindings", null);
        setField(term124197, term124197.getClass(), "_canonicalName", null);
        setField(term124197, term124197.getClass(), "_class", null);
        setIntField(term124197, term124197.getClass(), "_hash", 0);
        setField(term124197, term124197.getClass(), "_valueHandler", null);
        setField(term124197, term124197.getClass(), "_typeHandler", null);
        setBooleanField(term124197, term124197.getClass(), "_asStatic", false);
        setElement(term124193, 3, term124197);
        setElement(term124193, 4, term124195);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term123532;
        args[1] = term123533;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term124185));
        assertTrue(recursiveEquals(term123532, term124192));
        assertTrue(recursiveEquals(term123533, term124193));
    }

};


