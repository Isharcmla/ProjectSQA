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

public class TypeBindings_init_352540534147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47784;
     Object term47785;
     Object term48035;
     Object term48039;
     Object term48040;

    public TypeBindings_init_352540534147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term47920 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term47787 = (Object[]) newArray("java.lang.String", 0);
        Object[] term47788 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term47920, term47920.getClass(), "_names", term47787);
        setField(term47920, term47920.getClass(), "_types", term47788);
        term47784 = (Object[]) newArray("java.lang.String", 1);
        term47785 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 1);
        Object term48016 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setElement(term47785, 0, term48016);
        term48035 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term48036 = (Object[]) newArray("java.lang.String", 1);
        Object[] term48037 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 1);
        Object term48038 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term48035, term48035.getClass(), "_names", term48036);
        setField(term48038, term48038.getClass(), "_componentType", null);
        setField(term48038, term48038.getClass(), "_emptyArray", null);
        setField(term48038, term48038.getClass(), "_superClass", null);
        setField(term48038, term48038.getClass(), "_superInterfaces", null);
        setField(term48038, term48038.getClass(), "_bindings", null);
        setField(term48038, term48038.getClass(), "_canonicalName", null);
        setField(term48038, term48038.getClass(), "_class", null);
        setIntField(term48038, term48038.getClass(), "_hash", 0);
        setField(term48038, term48038.getClass(), "_valueHandler", null);
        setField(term48038, term48038.getClass(), "_typeHandler", null);
        setBooleanField(term48038, term48038.getClass(), "_asStatic", false);
        setElement(term48037, 0, term48038);
        setField(term48035, term48035.getClass(), "_types", term48037);
        setField(term48035, term48035.getClass(), "_unboundVariables", null);
        setIntField(term48035, term48035.getClass(), "_hashCode", 1);
        term48039 = (Object[]) newArray("java.lang.String", 1);
        term48040 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 1);
        Object term48041 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term48041, term48041.getClass(), "_componentType", null);
        setField(term48041, term48041.getClass(), "_emptyArray", null);
        setField(term48041, term48041.getClass(), "_superClass", null);
        setField(term48041, term48041.getClass(), "_superInterfaces", null);
        setField(term48041, term48041.getClass(), "_bindings", null);
        setField(term48041, term48041.getClass(), "_canonicalName", null);
        setField(term48041, term48041.getClass(), "_class", null);
        setIntField(term48041, term48041.getClass(), "_hash", 0);
        setField(term48041, term48041.getClass(), "_valueHandler", null);
        setField(term48041, term48041.getClass(), "_typeHandler", null);
        setBooleanField(term48041, term48041.getClass(), "_asStatic", false);
        setElement(term48040, 0, term48041);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term47784;
        args[1] = term47785;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term48035));
        assertTrue(recursiveEquals(term47784, term48039));
        assertTrue(recursiveEquals(term47785, term48040));
    }

};


