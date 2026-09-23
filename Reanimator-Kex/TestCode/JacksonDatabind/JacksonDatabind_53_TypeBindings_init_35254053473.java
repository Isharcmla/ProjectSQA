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

public class TypeBindings_init_35254053473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13366;
     Object term13367;
     Object term13784;
     Object term13787;
     Object term13788;

    public TypeBindings_init_35254053473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13488 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term13368 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term13488, term13488.getClass(), "_names", null);
        setField(term13488, term13488.getClass(), "_types", term13368);
        term13366 = (Object[]) newArray("java.lang.String", 0);
        term13367 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        term13784 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term13785 = (Object[]) newArray("java.lang.String", 0);
        Object[] term13786 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term13784, term13784.getClass(), "_names", term13785);
        setField(term13784, term13784.getClass(), "_types", term13786);
        setField(term13784, term13784.getClass(), "_unboundVariables", null);
        setIntField(term13784, term13784.getClass(), "_hashCode", 1);
        term13787 = (Object[]) newArray("java.lang.String", 0);
        term13788 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term13366;
        args[1] = term13367;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term13784));
        assertTrue(recursiveEquals(term13366, term13787));
        assertTrue(recursiveEquals(term13367, term13788));
    }

};


