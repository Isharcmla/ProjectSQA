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

public class SimpleType_init_66107235153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10787;
     Object term11838;
     Object term11861;

    public SimpleType_init_66107235153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10751 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term10751, term10751.getClass(), "_class", null);
        term10787 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        Class<? extends Object> term11842 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonIdentityReference");
        term11838 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term11839 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term11840 = (Object[]) newArray("java.lang.String", 0);
        Object[] term11841 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term11838, term11838.getClass(), "_superClass", null);
        setField(term11838, term11838.getClass(), "_superInterfaces", null);
        setField(term11839, term11839.getClass(), "_names", term11840);
        setField(term11839, term11839.getClass(), "_types", term11841);
        setField(term11839, term11839.getClass(), "_unboundVariables", null);
        setIntField(term11839, term11839.getClass(), "_hashCode", 1);
        setField(term11838, term11838.getClass(), "_bindings", term11839);
        setField(term11838, term11838.getClass(), "_canonicalName", null);
        setField(term11838, term11838.getClass(), "_class", term11842);
        setIntField(term11838, term11838.getClass(), "_hash", -679675442);
        setField(term11838, term11838.getClass(), "_valueHandler", null);
        setField(term11838, term11838.getClass(), "_typeHandler", null);
        setBooleanField(term11838, term11838.getClass(), "_asStatic", false);
        term11861 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonIdentityReference");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.SimpleType");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[4] = Class.forName("java.lang.Object");
        argTypes[5] = Class.forName("java.lang.Object");
        argTypes[6] = boolean.class;
        Object[] args = new Object[7];
        args[0] = term10787;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term11838));
        assertTrue(recursiveEquals(term10787, term11861));
    }

};


