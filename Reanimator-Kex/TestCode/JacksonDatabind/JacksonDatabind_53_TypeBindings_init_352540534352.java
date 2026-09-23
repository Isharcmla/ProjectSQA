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

public class TypeBindings_init_352540534352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121643;
     Object term121644;
     Object term123143;
     Object term123150;
     Object term123151;

    public TypeBindings_init_352540534352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term121808 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        term121644 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term122304 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term122356 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term122416 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term122462 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term121808, term121808.getClass(), "_names", null);
        setIntField(term122304, term122304.getClass(), "_hash", 0);
        setElement(term121644, 0, term122304);
        setIntField(term122356, term122356.getClass(), "_hash", 0);
        setElement(term121644, 1, term122356);
        setIntField(term122416, term122416.getClass(), "_hash", 0);
        setElement(term121644, 2, term122416);
        setElement(term121644, 3, term122462);
        setField(term121808, term121808.getClass(), "_types", term121644);
        term121643 = (Object[]) newArray("java.lang.String", 4);
        term123143 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term123144 = (Object[]) newArray("java.lang.String", 4);
        Object[] term123145 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term123146 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term123147 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term123148 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term123149 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term123143, term123143.getClass(), "_names", term123144);
        setField(term123146, term123146.getClass(), "_referencedType", null);
        setField(term123146, term123146.getClass(), "_superClass", null);
        setField(term123146, term123146.getClass(), "_superInterfaces", null);
        setField(term123146, term123146.getClass(), "_bindings", null);
        setField(term123146, term123146.getClass(), "_canonicalName", null);
        setField(term123146, term123146.getClass(), "_class", null);
        setIntField(term123146, term123146.getClass(), "_hash", 0);
        setField(term123146, term123146.getClass(), "_valueHandler", null);
        setField(term123146, term123146.getClass(), "_typeHandler", null);
        setBooleanField(term123146, term123146.getClass(), "_asStatic", false);
        setElement(term123145, 0, term123146);
        setField(term123147, term123147.getClass(), "_referencedType", null);
        setField(term123147, term123147.getClass(), "_superClass", null);
        setField(term123147, term123147.getClass(), "_superInterfaces", null);
        setField(term123147, term123147.getClass(), "_bindings", null);
        setField(term123147, term123147.getClass(), "_canonicalName", null);
        setField(term123147, term123147.getClass(), "_class", null);
        setIntField(term123147, term123147.getClass(), "_hash", 0);
        setField(term123147, term123147.getClass(), "_valueHandler", null);
        setField(term123147, term123147.getClass(), "_typeHandler", null);
        setBooleanField(term123147, term123147.getClass(), "_asStatic", false);
        setElement(term123145, 1, term123147);
        setField(term123148, term123148.getClass(), "_referencedType", null);
        setField(term123148, term123148.getClass(), "_superClass", null);
        setField(term123148, term123148.getClass(), "_superInterfaces", null);
        setField(term123148, term123148.getClass(), "_bindings", null);
        setField(term123148, term123148.getClass(), "_canonicalName", null);
        setField(term123148, term123148.getClass(), "_class", null);
        setIntField(term123148, term123148.getClass(), "_hash", 0);
        setField(term123148, term123148.getClass(), "_valueHandler", null);
        setField(term123148, term123148.getClass(), "_typeHandler", null);
        setBooleanField(term123148, term123148.getClass(), "_asStatic", false);
        setElement(term123145, 2, term123148);
        setField(term123149, term123149.getClass(), "_keyType", null);
        setField(term123149, term123149.getClass(), "_valueType", null);
        setField(term123149, term123149.getClass(), "_superClass", null);
        setField(term123149, term123149.getClass(), "_superInterfaces", null);
        setField(term123149, term123149.getClass(), "_bindings", null);
        setField(term123149, term123149.getClass(), "_canonicalName", null);
        setField(term123149, term123149.getClass(), "_class", null);
        setIntField(term123149, term123149.getClass(), "_hash", 0);
        setField(term123149, term123149.getClass(), "_valueHandler", null);
        setField(term123149, term123149.getClass(), "_typeHandler", null);
        setBooleanField(term123149, term123149.getClass(), "_asStatic", false);
        setElement(term123145, 3, term123149);
        setField(term123143, term123143.getClass(), "_types", term123145);
        setField(term123143, term123143.getClass(), "_unboundVariables", null);
        setIntField(term123143, term123143.getClass(), "_hashCode", 1);
        term123150 = (Object[]) newArray("java.lang.String", 4);
        term123151 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term123152 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term123153 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term123154 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term123155 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term123152, term123152.getClass(), "_referencedType", null);
        setField(term123152, term123152.getClass(), "_superClass", null);
        setField(term123152, term123152.getClass(), "_superInterfaces", null);
        setField(term123152, term123152.getClass(), "_bindings", null);
        setField(term123152, term123152.getClass(), "_canonicalName", null);
        setField(term123152, term123152.getClass(), "_class", null);
        setIntField(term123152, term123152.getClass(), "_hash", 0);
        setField(term123152, term123152.getClass(), "_valueHandler", null);
        setField(term123152, term123152.getClass(), "_typeHandler", null);
        setBooleanField(term123152, term123152.getClass(), "_asStatic", false);
        setElement(term123151, 0, term123152);
        setField(term123153, term123153.getClass(), "_referencedType", null);
        setField(term123153, term123153.getClass(), "_superClass", null);
        setField(term123153, term123153.getClass(), "_superInterfaces", null);
        setField(term123153, term123153.getClass(), "_bindings", null);
        setField(term123153, term123153.getClass(), "_canonicalName", null);
        setField(term123153, term123153.getClass(), "_class", null);
        setIntField(term123153, term123153.getClass(), "_hash", 0);
        setField(term123153, term123153.getClass(), "_valueHandler", null);
        setField(term123153, term123153.getClass(), "_typeHandler", null);
        setBooleanField(term123153, term123153.getClass(), "_asStatic", false);
        setElement(term123151, 1, term123153);
        setField(term123154, term123154.getClass(), "_referencedType", null);
        setField(term123154, term123154.getClass(), "_superClass", null);
        setField(term123154, term123154.getClass(), "_superInterfaces", null);
        setField(term123154, term123154.getClass(), "_bindings", null);
        setField(term123154, term123154.getClass(), "_canonicalName", null);
        setField(term123154, term123154.getClass(), "_class", null);
        setIntField(term123154, term123154.getClass(), "_hash", 0);
        setField(term123154, term123154.getClass(), "_valueHandler", null);
        setField(term123154, term123154.getClass(), "_typeHandler", null);
        setBooleanField(term123154, term123154.getClass(), "_asStatic", false);
        setElement(term123151, 2, term123154);
        setField(term123155, term123155.getClass(), "_keyType", null);
        setField(term123155, term123155.getClass(), "_valueType", null);
        setField(term123155, term123155.getClass(), "_superClass", null);
        setField(term123155, term123155.getClass(), "_superInterfaces", null);
        setField(term123155, term123155.getClass(), "_bindings", null);
        setField(term123155, term123155.getClass(), "_canonicalName", null);
        setField(term123155, term123155.getClass(), "_class", null);
        setIntField(term123155, term123155.getClass(), "_hash", 0);
        setField(term123155, term123155.getClass(), "_valueHandler", null);
        setField(term123155, term123155.getClass(), "_typeHandler", null);
        setBooleanField(term123155, term123155.getClass(), "_asStatic", false);
        setElement(term123151, 3, term123155);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term121643;
        args[1] = term121644;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term123143));
        assertTrue(recursiveEquals(term121643, term123150));
        assertTrue(recursiveEquals(term121644, term123151));
    }

};


