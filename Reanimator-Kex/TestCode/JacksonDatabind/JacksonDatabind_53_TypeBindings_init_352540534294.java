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

public class TypeBindings_init_352540534294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96437;
     Object term96441;
     Object term97811;
     Object term97823;
     Object term97830;

    public TypeBindings_init_352540534294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term96597 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term96445 = (Object[]) newArray("java.lang.String", 0);
        Object[] term96446 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term96597, term96597.getClass(), "_names", term96445);
        setField(term96597, term96597.getClass(), "_types", term96446);
        term96437 = (Object[]) newArray("java.lang.String", 3);
        setElement(term96437, 0, "");
        setElement(term96437, 1, "");
        setElement(term96437, 2, "");
        term96441 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term96815 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term96921 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term97019 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setIntField(term96815, term96815.getClass(), "_hash", 0);
        setElement(term96441, 0, term96815);
        setIntField(term96921, term96921.getClass(), "_hash", 0);
        setElement(term96441, 1, term96921);
        setElement(term96441, 2, term97019);
        term97811 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term97812 = (Object[]) newArray("java.lang.String", 3);
        Object[] term97819 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term97820 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term97821 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term97822 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setElement(term97812, 0, "");
        setElement(term97812, 1, "");
        setElement(term97812, 2, "");
        setField(term97811, term97811.getClass(), "_names", term97812);
        setField(term97820, term97820.getClass(), "_referencedType", null);
        setField(term97820, term97820.getClass(), "_superClass", null);
        setField(term97820, term97820.getClass(), "_superInterfaces", null);
        setField(term97820, term97820.getClass(), "_bindings", null);
        setField(term97820, term97820.getClass(), "_canonicalName", null);
        setField(term97820, term97820.getClass(), "_class", null);
        setIntField(term97820, term97820.getClass(), "_hash", 0);
        setField(term97820, term97820.getClass(), "_valueHandler", null);
        setField(term97820, term97820.getClass(), "_typeHandler", null);
        setBooleanField(term97820, term97820.getClass(), "_asStatic", false);
        setElement(term97819, 0, term97820);
        setField(term97821, term97821.getClass(), "_elementType", null);
        setField(term97821, term97821.getClass(), "_superClass", null);
        setField(term97821, term97821.getClass(), "_superInterfaces", null);
        setField(term97821, term97821.getClass(), "_bindings", null);
        setField(term97821, term97821.getClass(), "_canonicalName", null);
        setField(term97821, term97821.getClass(), "_class", null);
        setIntField(term97821, term97821.getClass(), "_hash", 0);
        setField(term97821, term97821.getClass(), "_valueHandler", null);
        setField(term97821, term97821.getClass(), "_typeHandler", null);
        setBooleanField(term97821, term97821.getClass(), "_asStatic", false);
        setElement(term97819, 1, term97821);
        setField(term97822, term97822.getClass(), "_superClass", null);
        setField(term97822, term97822.getClass(), "_superInterfaces", null);
        setField(term97822, term97822.getClass(), "_bindings", null);
        setField(term97822, term97822.getClass(), "_canonicalName", null);
        setField(term97822, term97822.getClass(), "_class", null);
        setIntField(term97822, term97822.getClass(), "_hash", 0);
        setField(term97822, term97822.getClass(), "_valueHandler", null);
        setField(term97822, term97822.getClass(), "_typeHandler", null);
        setBooleanField(term97822, term97822.getClass(), "_asStatic", false);
        setElement(term97819, 2, term97822);
        setField(term97811, term97811.getClass(), "_types", term97819);
        setField(term97811, term97811.getClass(), "_unboundVariables", null);
        setIntField(term97811, term97811.getClass(), "_hashCode", 1);
        term97823 = (Object[]) newArray("java.lang.String", 3);
        setElement(term97823, 0, "");
        setElement(term97823, 1, "");
        setElement(term97823, 2, "");
        term97830 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term97831 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term97832 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term97833 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term97831, term97831.getClass(), "_referencedType", null);
        setField(term97831, term97831.getClass(), "_superClass", null);
        setField(term97831, term97831.getClass(), "_superInterfaces", null);
        setField(term97831, term97831.getClass(), "_bindings", null);
        setField(term97831, term97831.getClass(), "_canonicalName", null);
        setField(term97831, term97831.getClass(), "_class", null);
        setIntField(term97831, term97831.getClass(), "_hash", 0);
        setField(term97831, term97831.getClass(), "_valueHandler", null);
        setField(term97831, term97831.getClass(), "_typeHandler", null);
        setBooleanField(term97831, term97831.getClass(), "_asStatic", false);
        setElement(term97830, 0, term97831);
        setField(term97832, term97832.getClass(), "_elementType", null);
        setField(term97832, term97832.getClass(), "_superClass", null);
        setField(term97832, term97832.getClass(), "_superInterfaces", null);
        setField(term97832, term97832.getClass(), "_bindings", null);
        setField(term97832, term97832.getClass(), "_canonicalName", null);
        setField(term97832, term97832.getClass(), "_class", null);
        setIntField(term97832, term97832.getClass(), "_hash", 0);
        setField(term97832, term97832.getClass(), "_valueHandler", null);
        setField(term97832, term97832.getClass(), "_typeHandler", null);
        setBooleanField(term97832, term97832.getClass(), "_asStatic", false);
        setElement(term97830, 1, term97832);
        setField(term97833, term97833.getClass(), "_superClass", null);
        setField(term97833, term97833.getClass(), "_superInterfaces", null);
        setField(term97833, term97833.getClass(), "_bindings", null);
        setField(term97833, term97833.getClass(), "_canonicalName", null);
        setField(term97833, term97833.getClass(), "_class", null);
        setIntField(term97833, term97833.getClass(), "_hash", 0);
        setField(term97833, term97833.getClass(), "_valueHandler", null);
        setField(term97833, term97833.getClass(), "_typeHandler", null);
        setBooleanField(term97833, term97833.getClass(), "_asStatic", false);
        setElement(term97830, 2, term97833);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term96437;
        args[1] = term96441;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term97811));
        assertTrue(recursiveEquals(term96437, term97823));
        assertTrue(recursiveEquals(term96441, term97830));
    }

};


