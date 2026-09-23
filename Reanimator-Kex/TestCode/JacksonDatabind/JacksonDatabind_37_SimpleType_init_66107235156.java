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

public class SimpleType_init_66107235156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13680;
     Object term13820;
     Object term13858;
     Object term14244;
     Object term14273;
     Object term14299;
     Object term14300;

    public SimpleType_init_66107235156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13644 = Class.forName((String) "java.util.stream.StreamSpliterators$AbstractWrappingSpliterator");
        Object term13608 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term13608, term13608.getClass(), "_class", term13644);
        setIntField(term13608, term13608.getClass(), "_hash", 0);
        setField(term13608, term13608.getClass(), "_valueHandler", null);
        setField(term13608, term13608.getClass(), "_typeHandler", null);
        setBooleanField(term13608, term13608.getClass(), "_asStatic", false);
        term13680 = Class.forName((String) "com.fasterxml.jackson.databind.type.SimpleType");
        term13820 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        term13858 = newInstance(Class.forName("java.lang.Object"));
        Class<? extends Object> term14246 = Class.forName((String) "com.fasterxml.jackson.databind.type.SimpleType");
        term14244 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term14245 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object term14272 = newInstance(Class.forName("java.lang.Object"));
        setField(term14244, term14244.getClass(), "_superClass", null);
        setField(term14244, term14244.getClass(), "_superInterfaces", null);
        setField(term14245, term14245.getClass(), "_names", null);
        setField(term14245, term14245.getClass(), "_types", null);
        setField(term14245, term14245.getClass(), "_unboundVariables", null);
        setIntField(term14245, term14245.getClass(), "_hashCode", 0);
        setField(term14244, term14244.getClass(), "_bindings", term14245);
        setField(term14244, term14244.getClass(), "_canonicalName", null);
        setField(term14244, term14244.getClass(), "_class", term14246);
        setIntField(term14244, term14244.getClass(), "_hash", 896230817);
        setField(term14244, term14244.getClass(), "_valueHandler", term14272);
        setField(term14244, term14244.getClass(), "_typeHandler", null);
        setBooleanField(term14244, term14244.getClass(), "_asStatic", true);
        term14273 = Class.forName((String) "com.fasterxml.jackson.databind.type.SimpleType");
        term14299 = newInstance(Class.forName("java.lang.Object"));
        term14300 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term14300, term14300.getClass(), "_names", null);
        setField(term14300, term14300.getClass(), "_types", null);
        setField(term14300, term14300.getClass(), "_unboundVariables", null);
        setIntField(term14300, term14300.getClass(), "_hashCode", 0);
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
        args[0] = term13680;
        args[1] = term13820;
        args[2] = null;
        args[3] = null;
        args[4] = term13858;
        args[5] = null;
        args[6] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term14244));
        assertTrue(recursiveEquals(term13680, term14273));
        assertTrue(recursiveEquals(term13820, term14299));
        assertTrue(recursiveEquals(term13858, term14300));
    }

};


