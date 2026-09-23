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

public class TypeBindings_init_352540534177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59267;
     Object term59268;
     Object term59656;
     Object term59661;
     Object term59662;

    public TypeBindings_init_352540534177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term59411 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term59411, term59411.getClass(), "_names", null);
        setField(term59411, term59411.getClass(), "_types", null);
        term59267 = (Object[]) newArray("java.lang.String", 2);
        term59268 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term59531 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term59629 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setIntField(term59531, term59531.getClass(), "_hash", 0);
        setElement(term59268, 0, term59531);
        setElement(term59268, 1, term59629);
        term59656 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term59657 = (Object[]) newArray("java.lang.String", 2);
        Object[] term59658 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term59659 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term59660 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term59656, term59656.getClass(), "_names", term59657);
        setField(term59659, term59659.getClass(), "_referencedType", null);
        setField(term59659, term59659.getClass(), "_superClass", null);
        setField(term59659, term59659.getClass(), "_superInterfaces", null);
        setField(term59659, term59659.getClass(), "_bindings", null);
        setField(term59659, term59659.getClass(), "_canonicalName", null);
        setField(term59659, term59659.getClass(), "_class", null);
        setIntField(term59659, term59659.getClass(), "_hash", 0);
        setField(term59659, term59659.getClass(), "_valueHandler", null);
        setField(term59659, term59659.getClass(), "_typeHandler", null);
        setBooleanField(term59659, term59659.getClass(), "_asStatic", false);
        setElement(term59658, 0, term59659);
        setField(term59660, term59660.getClass(), "_superClass", null);
        setField(term59660, term59660.getClass(), "_superInterfaces", null);
        setField(term59660, term59660.getClass(), "_bindings", null);
        setField(term59660, term59660.getClass(), "_canonicalName", null);
        setField(term59660, term59660.getClass(), "_class", null);
        setIntField(term59660, term59660.getClass(), "_hash", 0);
        setField(term59660, term59660.getClass(), "_valueHandler", null);
        setField(term59660, term59660.getClass(), "_typeHandler", null);
        setBooleanField(term59660, term59660.getClass(), "_asStatic", false);
        setElement(term59658, 1, term59660);
        setField(term59656, term59656.getClass(), "_types", term59658);
        setField(term59656, term59656.getClass(), "_unboundVariables", null);
        setIntField(term59656, term59656.getClass(), "_hashCode", 1);
        term59661 = (Object[]) newArray("java.lang.String", 2);
        term59662 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term59663 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term59664 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term59663, term59663.getClass(), "_referencedType", null);
        setField(term59663, term59663.getClass(), "_superClass", null);
        setField(term59663, term59663.getClass(), "_superInterfaces", null);
        setField(term59663, term59663.getClass(), "_bindings", null);
        setField(term59663, term59663.getClass(), "_canonicalName", null);
        setField(term59663, term59663.getClass(), "_class", null);
        setIntField(term59663, term59663.getClass(), "_hash", 0);
        setField(term59663, term59663.getClass(), "_valueHandler", null);
        setField(term59663, term59663.getClass(), "_typeHandler", null);
        setBooleanField(term59663, term59663.getClass(), "_asStatic", false);
        setElement(term59662, 0, term59663);
        setField(term59664, term59664.getClass(), "_superClass", null);
        setField(term59664, term59664.getClass(), "_superInterfaces", null);
        setField(term59664, term59664.getClass(), "_bindings", null);
        setField(term59664, term59664.getClass(), "_canonicalName", null);
        setField(term59664, term59664.getClass(), "_class", null);
        setIntField(term59664, term59664.getClass(), "_hash", 0);
        setField(term59664, term59664.getClass(), "_valueHandler", null);
        setField(term59664, term59664.getClass(), "_typeHandler", null);
        setBooleanField(term59664, term59664.getClass(), "_asStatic", false);
        setElement(term59662, 1, term59664);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term59267;
        args[1] = term59268;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term59656));
        assertTrue(recursiveEquals(term59267, term59661));
        assertTrue(recursiveEquals(term59268, term59662));
    }

};


