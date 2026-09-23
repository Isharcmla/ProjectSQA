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

public class TypeBindings_init_352540534298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98215;
     Object term98216;
     Object term99789;
     Object term99796;
     Object term99797;

    public TypeBindings_init_352540534298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term98380 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        term98216 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term98842 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term98895 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term98947 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term98995 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term98380, term98380.getClass(), "_names", null);
        setIntField(term98842, term98842.getClass(), "_hash", 0);
        setElement(term98216, 0, term98842);
        setIntField(term98895, term98895.getClass(), "_hash", 0);
        setElement(term98216, 1, term98895);
        setIntField(term98947, term98947.getClass(), "_hash", 0);
        setElement(term98216, 2, term98947);
        setElement(term98216, 3, term98995);
        setField(term98380, term98380.getClass(), "_types", term98216);
        term98215 = (Object[]) newArray("java.lang.String", 4);
        term99789 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term99790 = (Object[]) newArray("java.lang.String", 4);
        Object[] term99791 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term99792 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term99793 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term99794 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term99795 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term99789, term99789.getClass(), "_names", term99790);
        setField(term99792, term99792.getClass(), "_referencedType", null);
        setField(term99792, term99792.getClass(), "_superClass", null);
        setField(term99792, term99792.getClass(), "_superInterfaces", null);
        setField(term99792, term99792.getClass(), "_bindings", null);
        setField(term99792, term99792.getClass(), "_canonicalName", null);
        setField(term99792, term99792.getClass(), "_class", null);
        setIntField(term99792, term99792.getClass(), "_hash", 0);
        setField(term99792, term99792.getClass(), "_valueHandler", null);
        setField(term99792, term99792.getClass(), "_typeHandler", null);
        setBooleanField(term99792, term99792.getClass(), "_asStatic", false);
        setElement(term99791, 0, term99792);
        setField(term99793, term99793.getClass(), "_elementType", null);
        setField(term99793, term99793.getClass(), "_superClass", null);
        setField(term99793, term99793.getClass(), "_superInterfaces", null);
        setField(term99793, term99793.getClass(), "_bindings", null);
        setField(term99793, term99793.getClass(), "_canonicalName", null);
        setField(term99793, term99793.getClass(), "_class", null);
        setIntField(term99793, term99793.getClass(), "_hash", 0);
        setField(term99793, term99793.getClass(), "_valueHandler", null);
        setField(term99793, term99793.getClass(), "_typeHandler", null);
        setBooleanField(term99793, term99793.getClass(), "_asStatic", false);
        setElement(term99791, 1, term99793);
        setField(term99794, term99794.getClass(), "_referencedType", null);
        setField(term99794, term99794.getClass(), "_superClass", null);
        setField(term99794, term99794.getClass(), "_superInterfaces", null);
        setField(term99794, term99794.getClass(), "_bindings", null);
        setField(term99794, term99794.getClass(), "_canonicalName", null);
        setField(term99794, term99794.getClass(), "_class", null);
        setIntField(term99794, term99794.getClass(), "_hash", 0);
        setField(term99794, term99794.getClass(), "_valueHandler", null);
        setField(term99794, term99794.getClass(), "_typeHandler", null);
        setBooleanField(term99794, term99794.getClass(), "_asStatic", false);
        setElement(term99791, 2, term99794);
        setField(term99795, term99795.getClass(), "_componentType", null);
        setField(term99795, term99795.getClass(), "_emptyArray", null);
        setField(term99795, term99795.getClass(), "_superClass", null);
        setField(term99795, term99795.getClass(), "_superInterfaces", null);
        setField(term99795, term99795.getClass(), "_bindings", null);
        setField(term99795, term99795.getClass(), "_canonicalName", null);
        setField(term99795, term99795.getClass(), "_class", null);
        setIntField(term99795, term99795.getClass(), "_hash", 0);
        setField(term99795, term99795.getClass(), "_valueHandler", null);
        setField(term99795, term99795.getClass(), "_typeHandler", null);
        setBooleanField(term99795, term99795.getClass(), "_asStatic", false);
        setElement(term99791, 3, term99795);
        setField(term99789, term99789.getClass(), "_types", term99791);
        setField(term99789, term99789.getClass(), "_unboundVariables", null);
        setIntField(term99789, term99789.getClass(), "_hashCode", 1);
        term99796 = (Object[]) newArray("java.lang.String", 4);
        term99797 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term99798 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term99799 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term99800 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term99801 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term99798, term99798.getClass(), "_referencedType", null);
        setField(term99798, term99798.getClass(), "_superClass", null);
        setField(term99798, term99798.getClass(), "_superInterfaces", null);
        setField(term99798, term99798.getClass(), "_bindings", null);
        setField(term99798, term99798.getClass(), "_canonicalName", null);
        setField(term99798, term99798.getClass(), "_class", null);
        setIntField(term99798, term99798.getClass(), "_hash", 0);
        setField(term99798, term99798.getClass(), "_valueHandler", null);
        setField(term99798, term99798.getClass(), "_typeHandler", null);
        setBooleanField(term99798, term99798.getClass(), "_asStatic", false);
        setElement(term99797, 0, term99798);
        setField(term99799, term99799.getClass(), "_elementType", null);
        setField(term99799, term99799.getClass(), "_superClass", null);
        setField(term99799, term99799.getClass(), "_superInterfaces", null);
        setField(term99799, term99799.getClass(), "_bindings", null);
        setField(term99799, term99799.getClass(), "_canonicalName", null);
        setField(term99799, term99799.getClass(), "_class", null);
        setIntField(term99799, term99799.getClass(), "_hash", 0);
        setField(term99799, term99799.getClass(), "_valueHandler", null);
        setField(term99799, term99799.getClass(), "_typeHandler", null);
        setBooleanField(term99799, term99799.getClass(), "_asStatic", false);
        setElement(term99797, 1, term99799);
        setField(term99800, term99800.getClass(), "_referencedType", null);
        setField(term99800, term99800.getClass(), "_superClass", null);
        setField(term99800, term99800.getClass(), "_superInterfaces", null);
        setField(term99800, term99800.getClass(), "_bindings", null);
        setField(term99800, term99800.getClass(), "_canonicalName", null);
        setField(term99800, term99800.getClass(), "_class", null);
        setIntField(term99800, term99800.getClass(), "_hash", 0);
        setField(term99800, term99800.getClass(), "_valueHandler", null);
        setField(term99800, term99800.getClass(), "_typeHandler", null);
        setBooleanField(term99800, term99800.getClass(), "_asStatic", false);
        setElement(term99797, 2, term99800);
        setField(term99801, term99801.getClass(), "_componentType", null);
        setField(term99801, term99801.getClass(), "_emptyArray", null);
        setField(term99801, term99801.getClass(), "_superClass", null);
        setField(term99801, term99801.getClass(), "_superInterfaces", null);
        setField(term99801, term99801.getClass(), "_bindings", null);
        setField(term99801, term99801.getClass(), "_canonicalName", null);
        setField(term99801, term99801.getClass(), "_class", null);
        setIntField(term99801, term99801.getClass(), "_hash", 0);
        setField(term99801, term99801.getClass(), "_valueHandler", null);
        setField(term99801, term99801.getClass(), "_typeHandler", null);
        setBooleanField(term99801, term99801.getClass(), "_asStatic", false);
        setElement(term99797, 3, term99801);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term98215;
        args[1] = term98216;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term99789));
        assertTrue(recursiveEquals(term98215, term99796));
        assertTrue(recursiveEquals(term98216, term99797));
    }

};


