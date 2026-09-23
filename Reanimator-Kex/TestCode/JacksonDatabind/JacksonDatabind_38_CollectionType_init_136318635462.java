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
import java.lang.String;

public class CollectionType_init_136318635462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16273;
     Object term16393;
     Object term17767;
     Object term17791;
     Object term17792;

    public CollectionType_init_136318635462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16237 = Class.forName((String) "java.util.DualPivotQuicksort");
        Object term16201 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term16201, term16201.getClass(), "_class", term16237);
        term16273 = Class.forName((String) "java.nio.ByteBufferAsIntBufferL");
        term16393 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setIntField(term16393, term16393.getClass(), "_hash", 0);
        Class<? extends Object> term17772 = Class.forName((String) "com.fasterxml.jackson.core.JsonGenerator");
        term17767 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term17768 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term17769 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term17770 = (Object[]) newArray("java.lang.String", 0);
        Object[] term17771 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term17768, term17768.getClass(), "_referencedType", null);
        setField(term17768, term17768.getClass(), "_superClass", null);
        setField(term17768, term17768.getClass(), "_superInterfaces", null);
        setField(term17768, term17768.getClass(), "_bindings", null);
        setField(term17768, term17768.getClass(), "_canonicalName", null);
        setField(term17768, term17768.getClass(), "_class", null);
        setIntField(term17768, term17768.getClass(), "_hash", 0);
        setField(term17768, term17768.getClass(), "_valueHandler", null);
        setField(term17768, term17768.getClass(), "_typeHandler", null);
        setBooleanField(term17768, term17768.getClass(), "_asStatic", false);
        setField(term17767, term17767.getClass(), "_elementType", term17768);
        setField(term17767, term17767.getClass(), "_superClass", null);
        setField(term17767, term17767.getClass(), "_superInterfaces", null);
        setField(term17769, term17769.getClass(), "_names", term17770);
        setField(term17769, term17769.getClass(), "_types", term17771);
        setField(term17769, term17769.getClass(), "_unboundVariables", null);
        setIntField(term17769, term17769.getClass(), "_hashCode", 1);
        setField(term17767, term17767.getClass(), "_bindings", term17769);
        setField(term17767, term17767.getClass(), "_canonicalName", null);
        setField(term17767, term17767.getClass(), "_class", term17772);
        setIntField(term17767, term17767.getClass(), "_hash", 245512164);
        setField(term17767, term17767.getClass(), "_valueHandler", null);
        setField(term17767, term17767.getClass(), "_typeHandler", null);
        setBooleanField(term17767, term17767.getClass(), "_asStatic", false);
        term17791 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term17791, term17791.getClass(), "_referencedType", null);
        setField(term17791, term17791.getClass(), "_superClass", null);
        setField(term17791, term17791.getClass(), "_superInterfaces", null);
        setField(term17791, term17791.getClass(), "_bindings", null);
        setField(term17791, term17791.getClass(), "_canonicalName", null);
        setField(term17791, term17791.getClass(), "_class", null);
        setIntField(term17791, term17791.getClass(), "_hash", 0);
        setField(term17791, term17791.getClass(), "_valueHandler", null);
        setField(term17791, term17791.getClass(), "_typeHandler", null);
        setBooleanField(term17791, term17791.getClass(), "_asStatic", false);
        term17792 = Class.forName((String) "com.fasterxml.jackson.core.JsonGenerator");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.CollectionType");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[5] = Class.forName("java.lang.Object");
        argTypes[6] = Class.forName("java.lang.Object");
        argTypes[7] = boolean.class;
        Object[] args = new Object[8];
        args[0] = term16273;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term16393;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term17767));
        assertTrue(recursiveEquals(term16273, term17791));
        assertTrue(recursiveEquals(term16393, false));
    }

};


