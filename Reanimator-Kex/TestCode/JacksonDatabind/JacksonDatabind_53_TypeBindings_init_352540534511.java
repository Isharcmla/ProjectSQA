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

public class TypeBindings_init_352540534511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203031;
     Object term203036;
     Object term203919;
     Object term203934;
     Object term203943;

    public TypeBindings_init_352540534511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term203206 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        term203031 = (Object[]) newArray("java.lang.String", 4);
        setElement(term203031, 0, "");
        setElement(term203031, 1, "");
        setElement(term203031, 2, "");
        setElement(term203031, 3, "");
        setField(term203206, term203206.getClass(), "_names", term203031);
        setField(term203206, term203206.getClass(), "_types", null);
        term203036 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term203540 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term203636 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term203756 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term203860 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term203540, term203540.getClass(), "_hash", 0);
        setElement(term203036, 0, term203540);
        setIntField(term203636, term203636.getClass(), "_hash", 0);
        setElement(term203036, 1, term203636);
        setIntField(term203756, term203756.getClass(), "_hash", 0);
        setElement(term203036, 2, term203756);
        setIntField(term203860, term203860.getClass(), "_hash", 0);
        setElement(term203036, 3, term203860);
        term203919 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term203920 = (Object[]) newArray("java.lang.String", 4);
        Object[] term203929 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term203930 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term203931 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term203932 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term203933 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setElement(term203920, 0, "");
        setElement(term203920, 1, "");
        setElement(term203920, 2, "");
        setElement(term203920, 3, "");
        setField(term203919, term203919.getClass(), "_names", term203920);
        setField(term203930, term203930.getClass(), "_elementType", null);
        setField(term203930, term203930.getClass(), "_superClass", null);
        setField(term203930, term203930.getClass(), "_superInterfaces", null);
        setField(term203930, term203930.getClass(), "_bindings", null);
        setField(term203930, term203930.getClass(), "_canonicalName", null);
        setField(term203930, term203930.getClass(), "_class", null);
        setIntField(term203930, term203930.getClass(), "_hash", 0);
        setField(term203930, term203930.getClass(), "_valueHandler", null);
        setField(term203930, term203930.getClass(), "_typeHandler", null);
        setBooleanField(term203930, term203930.getClass(), "_asStatic", false);
        setElement(term203929, 0, term203930);
        setField(term203931, term203931.getClass(), "_componentType", null);
        setField(term203931, term203931.getClass(), "_emptyArray", null);
        setField(term203931, term203931.getClass(), "_superClass", null);
        setField(term203931, term203931.getClass(), "_superInterfaces", null);
        setField(term203931, term203931.getClass(), "_bindings", null);
        setField(term203931, term203931.getClass(), "_canonicalName", null);
        setField(term203931, term203931.getClass(), "_class", null);
        setIntField(term203931, term203931.getClass(), "_hash", 0);
        setField(term203931, term203931.getClass(), "_valueHandler", null);
        setField(term203931, term203931.getClass(), "_typeHandler", null);
        setBooleanField(term203931, term203931.getClass(), "_asStatic", false);
        setElement(term203929, 1, term203931);
        setField(term203932, term203932.getClass(), "_referencedType", null);
        setField(term203932, term203932.getClass(), "_superClass", null);
        setField(term203932, term203932.getClass(), "_superInterfaces", null);
        setField(term203932, term203932.getClass(), "_bindings", null);
        setField(term203932, term203932.getClass(), "_canonicalName", null);
        setField(term203932, term203932.getClass(), "_class", null);
        setIntField(term203932, term203932.getClass(), "_hash", 0);
        setField(term203932, term203932.getClass(), "_valueHandler", null);
        setField(term203932, term203932.getClass(), "_typeHandler", null);
        setBooleanField(term203932, term203932.getClass(), "_asStatic", false);
        setElement(term203929, 2, term203932);
        setField(term203933, term203933.getClass(), "_referencedType", null);
        setField(term203933, term203933.getClass(), "_superClass", null);
        setField(term203933, term203933.getClass(), "_superInterfaces", null);
        setField(term203933, term203933.getClass(), "_bindings", null);
        setField(term203933, term203933.getClass(), "_canonicalName", null);
        setField(term203933, term203933.getClass(), "_class", null);
        setIntField(term203933, term203933.getClass(), "_hash", 0);
        setField(term203933, term203933.getClass(), "_valueHandler", null);
        setField(term203933, term203933.getClass(), "_typeHandler", null);
        setBooleanField(term203933, term203933.getClass(), "_asStatic", false);
        setElement(term203929, 3, term203933);
        setField(term203919, term203919.getClass(), "_types", term203929);
        setField(term203919, term203919.getClass(), "_unboundVariables", null);
        setIntField(term203919, term203919.getClass(), "_hashCode", 1);
        term203934 = (Object[]) newArray("java.lang.String", 4);
        setElement(term203934, 0, "");
        setElement(term203934, 1, "");
        setElement(term203934, 2, "");
        setElement(term203934, 3, "");
        term203943 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term203944 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term203945 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term203946 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term203947 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term203944, term203944.getClass(), "_elementType", null);
        setField(term203944, term203944.getClass(), "_superClass", null);
        setField(term203944, term203944.getClass(), "_superInterfaces", null);
        setField(term203944, term203944.getClass(), "_bindings", null);
        setField(term203944, term203944.getClass(), "_canonicalName", null);
        setField(term203944, term203944.getClass(), "_class", null);
        setIntField(term203944, term203944.getClass(), "_hash", 0);
        setField(term203944, term203944.getClass(), "_valueHandler", null);
        setField(term203944, term203944.getClass(), "_typeHandler", null);
        setBooleanField(term203944, term203944.getClass(), "_asStatic", false);
        setElement(term203943, 0, term203944);
        setField(term203945, term203945.getClass(), "_componentType", null);
        setField(term203945, term203945.getClass(), "_emptyArray", null);
        setField(term203945, term203945.getClass(), "_superClass", null);
        setField(term203945, term203945.getClass(), "_superInterfaces", null);
        setField(term203945, term203945.getClass(), "_bindings", null);
        setField(term203945, term203945.getClass(), "_canonicalName", null);
        setField(term203945, term203945.getClass(), "_class", null);
        setIntField(term203945, term203945.getClass(), "_hash", 0);
        setField(term203945, term203945.getClass(), "_valueHandler", null);
        setField(term203945, term203945.getClass(), "_typeHandler", null);
        setBooleanField(term203945, term203945.getClass(), "_asStatic", false);
        setElement(term203943, 1, term203945);
        setField(term203946, term203946.getClass(), "_referencedType", null);
        setField(term203946, term203946.getClass(), "_superClass", null);
        setField(term203946, term203946.getClass(), "_superInterfaces", null);
        setField(term203946, term203946.getClass(), "_bindings", null);
        setField(term203946, term203946.getClass(), "_canonicalName", null);
        setField(term203946, term203946.getClass(), "_class", null);
        setIntField(term203946, term203946.getClass(), "_hash", 0);
        setField(term203946, term203946.getClass(), "_valueHandler", null);
        setField(term203946, term203946.getClass(), "_typeHandler", null);
        setBooleanField(term203946, term203946.getClass(), "_asStatic", false);
        setElement(term203943, 2, term203946);
        setField(term203947, term203947.getClass(), "_referencedType", null);
        setField(term203947, term203947.getClass(), "_superClass", null);
        setField(term203947, term203947.getClass(), "_superInterfaces", null);
        setField(term203947, term203947.getClass(), "_bindings", null);
        setField(term203947, term203947.getClass(), "_canonicalName", null);
        setField(term203947, term203947.getClass(), "_class", null);
        setIntField(term203947, term203947.getClass(), "_hash", 0);
        setField(term203947, term203947.getClass(), "_valueHandler", null);
        setField(term203947, term203947.getClass(), "_typeHandler", null);
        setBooleanField(term203947, term203947.getClass(), "_asStatic", false);
        setElement(term203943, 3, term203947);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term203031;
        args[1] = term203036;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term203919));
        assertTrue(recursiveEquals(term203031, term203934));
        assertTrue(recursiveEquals(term203036, term203943));
    }

};


