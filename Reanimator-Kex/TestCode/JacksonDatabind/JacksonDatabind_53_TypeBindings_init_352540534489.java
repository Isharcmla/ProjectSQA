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

public class TypeBindings_init_352540534489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192094;
     Object term192095;
     Object term192756;
     Object term192763;
     Object term192764;

    public TypeBindings_init_352540534489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term192265 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term192100 = (Object[]) newArray("java.lang.String", 0);
        Object[] term192101 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term192265, term192265.getClass(), "_names", term192100);
        setField(term192265, term192265.getClass(), "_types", term192101);
        term192094 = (Object[]) newArray("java.lang.String", 4);
        term192095 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term192385 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term192489 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term192609 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term192713 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term192385, term192385.getClass(), "_hash", 0);
        setElement(term192095, 0, term192385);
        setIntField(term192489, term192489.getClass(), "_hash", 0);
        setElement(term192095, 1, term192489);
        setIntField(term192609, term192609.getClass(), "_hash", 0);
        setElement(term192095, 2, term192609);
        setIntField(term192713, term192713.getClass(), "_hash", 0);
        setElement(term192095, 3, term192713);
        term192756 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term192757 = (Object[]) newArray("java.lang.String", 4);
        Object[] term192758 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term192759 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term192760 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term192761 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term192762 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term192756, term192756.getClass(), "_names", term192757);
        setField(term192759, term192759.getClass(), "_referencedType", null);
        setField(term192759, term192759.getClass(), "_superClass", null);
        setField(term192759, term192759.getClass(), "_superInterfaces", null);
        setField(term192759, term192759.getClass(), "_bindings", null);
        setField(term192759, term192759.getClass(), "_canonicalName", null);
        setField(term192759, term192759.getClass(), "_class", null);
        setIntField(term192759, term192759.getClass(), "_hash", 0);
        setField(term192759, term192759.getClass(), "_valueHandler", null);
        setField(term192759, term192759.getClass(), "_typeHandler", null);
        setBooleanField(term192759, term192759.getClass(), "_asStatic", false);
        setElement(term192758, 0, term192759);
        setField(term192760, term192760.getClass(), "_referencedType", null);
        setField(term192760, term192760.getClass(), "_superClass", null);
        setField(term192760, term192760.getClass(), "_superInterfaces", null);
        setField(term192760, term192760.getClass(), "_bindings", null);
        setField(term192760, term192760.getClass(), "_canonicalName", null);
        setField(term192760, term192760.getClass(), "_class", null);
        setIntField(term192760, term192760.getClass(), "_hash", 0);
        setField(term192760, term192760.getClass(), "_valueHandler", null);
        setField(term192760, term192760.getClass(), "_typeHandler", null);
        setBooleanField(term192760, term192760.getClass(), "_asStatic", false);
        setElement(term192758, 1, term192760);
        setField(term192761, term192761.getClass(), "_referencedType", null);
        setField(term192761, term192761.getClass(), "_superClass", null);
        setField(term192761, term192761.getClass(), "_superInterfaces", null);
        setField(term192761, term192761.getClass(), "_bindings", null);
        setField(term192761, term192761.getClass(), "_canonicalName", null);
        setField(term192761, term192761.getClass(), "_class", null);
        setIntField(term192761, term192761.getClass(), "_hash", 0);
        setField(term192761, term192761.getClass(), "_valueHandler", null);
        setField(term192761, term192761.getClass(), "_typeHandler", null);
        setBooleanField(term192761, term192761.getClass(), "_asStatic", false);
        setElement(term192758, 2, term192761);
        setField(term192762, term192762.getClass(), "_referencedType", null);
        setField(term192762, term192762.getClass(), "_superClass", null);
        setField(term192762, term192762.getClass(), "_superInterfaces", null);
        setField(term192762, term192762.getClass(), "_bindings", null);
        setField(term192762, term192762.getClass(), "_canonicalName", null);
        setField(term192762, term192762.getClass(), "_class", null);
        setIntField(term192762, term192762.getClass(), "_hash", 0);
        setField(term192762, term192762.getClass(), "_valueHandler", null);
        setField(term192762, term192762.getClass(), "_typeHandler", null);
        setBooleanField(term192762, term192762.getClass(), "_asStatic", false);
        setElement(term192758, 3, term192762);
        setField(term192756, term192756.getClass(), "_types", term192758);
        setField(term192756, term192756.getClass(), "_unboundVariables", null);
        setIntField(term192756, term192756.getClass(), "_hashCode", 1);
        term192763 = (Object[]) newArray("java.lang.String", 4);
        term192764 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term192765 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term192766 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term192767 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term192768 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term192765, term192765.getClass(), "_referencedType", null);
        setField(term192765, term192765.getClass(), "_superClass", null);
        setField(term192765, term192765.getClass(), "_superInterfaces", null);
        setField(term192765, term192765.getClass(), "_bindings", null);
        setField(term192765, term192765.getClass(), "_canonicalName", null);
        setField(term192765, term192765.getClass(), "_class", null);
        setIntField(term192765, term192765.getClass(), "_hash", 0);
        setField(term192765, term192765.getClass(), "_valueHandler", null);
        setField(term192765, term192765.getClass(), "_typeHandler", null);
        setBooleanField(term192765, term192765.getClass(), "_asStatic", false);
        setElement(term192764, 0, term192765);
        setField(term192766, term192766.getClass(), "_referencedType", null);
        setField(term192766, term192766.getClass(), "_superClass", null);
        setField(term192766, term192766.getClass(), "_superInterfaces", null);
        setField(term192766, term192766.getClass(), "_bindings", null);
        setField(term192766, term192766.getClass(), "_canonicalName", null);
        setField(term192766, term192766.getClass(), "_class", null);
        setIntField(term192766, term192766.getClass(), "_hash", 0);
        setField(term192766, term192766.getClass(), "_valueHandler", null);
        setField(term192766, term192766.getClass(), "_typeHandler", null);
        setBooleanField(term192766, term192766.getClass(), "_asStatic", false);
        setElement(term192764, 1, term192766);
        setField(term192767, term192767.getClass(), "_referencedType", null);
        setField(term192767, term192767.getClass(), "_superClass", null);
        setField(term192767, term192767.getClass(), "_superInterfaces", null);
        setField(term192767, term192767.getClass(), "_bindings", null);
        setField(term192767, term192767.getClass(), "_canonicalName", null);
        setField(term192767, term192767.getClass(), "_class", null);
        setIntField(term192767, term192767.getClass(), "_hash", 0);
        setField(term192767, term192767.getClass(), "_valueHandler", null);
        setField(term192767, term192767.getClass(), "_typeHandler", null);
        setBooleanField(term192767, term192767.getClass(), "_asStatic", false);
        setElement(term192764, 2, term192767);
        setField(term192768, term192768.getClass(), "_referencedType", null);
        setField(term192768, term192768.getClass(), "_superClass", null);
        setField(term192768, term192768.getClass(), "_superInterfaces", null);
        setField(term192768, term192768.getClass(), "_bindings", null);
        setField(term192768, term192768.getClass(), "_canonicalName", null);
        setField(term192768, term192768.getClass(), "_class", null);
        setIntField(term192768, term192768.getClass(), "_hash", 0);
        setField(term192768, term192768.getClass(), "_valueHandler", null);
        setField(term192768, term192768.getClass(), "_typeHandler", null);
        setBooleanField(term192768, term192768.getClass(), "_asStatic", false);
        setElement(term192764, 3, term192768);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term192094;
        args[1] = term192095;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term192756));
        assertTrue(recursiveEquals(term192094, term192763));
        assertTrue(recursiveEquals(term192095, term192764));
    }

};


