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

public class TypeBindings_init_352540534319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107029;
     Object term107030;
     Object term107704;
     Object term107711;
     Object term107712;

    public TypeBindings_init_352540534319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term107195 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term107195, term107195.getClass(), "_names", null);
        setField(term107195, term107195.getClass(), "_types", null);
        term107029 = (Object[]) newArray("java.lang.String", 4);
        term107030 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term107299 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term107395 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term107491 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term107611 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setIntField(term107299, term107299.getClass(), "_hash", 0);
        setElement(term107030, 0, term107299);
        setIntField(term107395, term107395.getClass(), "_hash", 0);
        setElement(term107030, 1, term107395);
        setIntField(term107491, term107491.getClass(), "_hash", 0);
        setElement(term107030, 2, term107491);
        setElement(term107030, 3, term107611);
        term107704 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term107705 = (Object[]) newArray("java.lang.String", 4);
        Object[] term107706 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term107707 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term107708 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term107709 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term107710 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term107704, term107704.getClass(), "_names", term107705);
        setField(term107707, term107707.getClass(), "_referencedType", null);
        setField(term107707, term107707.getClass(), "_superClass", null);
        setField(term107707, term107707.getClass(), "_superInterfaces", null);
        setField(term107707, term107707.getClass(), "_bindings", null);
        setField(term107707, term107707.getClass(), "_canonicalName", null);
        setField(term107707, term107707.getClass(), "_class", null);
        setIntField(term107707, term107707.getClass(), "_hash", 0);
        setField(term107707, term107707.getClass(), "_valueHandler", null);
        setField(term107707, term107707.getClass(), "_typeHandler", null);
        setBooleanField(term107707, term107707.getClass(), "_asStatic", false);
        setElement(term107706, 0, term107707);
        setField(term107708, term107708.getClass(), "_componentType", null);
        setField(term107708, term107708.getClass(), "_emptyArray", null);
        setField(term107708, term107708.getClass(), "_superClass", null);
        setField(term107708, term107708.getClass(), "_superInterfaces", null);
        setField(term107708, term107708.getClass(), "_bindings", null);
        setField(term107708, term107708.getClass(), "_canonicalName", null);
        setField(term107708, term107708.getClass(), "_class", null);
        setIntField(term107708, term107708.getClass(), "_hash", 0);
        setField(term107708, term107708.getClass(), "_valueHandler", null);
        setField(term107708, term107708.getClass(), "_typeHandler", null);
        setBooleanField(term107708, term107708.getClass(), "_asStatic", false);
        setElement(term107706, 1, term107708);
        setField(term107709, term107709.getClass(), "_componentType", null);
        setField(term107709, term107709.getClass(), "_emptyArray", null);
        setField(term107709, term107709.getClass(), "_superClass", null);
        setField(term107709, term107709.getClass(), "_superInterfaces", null);
        setField(term107709, term107709.getClass(), "_bindings", null);
        setField(term107709, term107709.getClass(), "_canonicalName", null);
        setField(term107709, term107709.getClass(), "_class", null);
        setIntField(term107709, term107709.getClass(), "_hash", 0);
        setField(term107709, term107709.getClass(), "_valueHandler", null);
        setField(term107709, term107709.getClass(), "_typeHandler", null);
        setBooleanField(term107709, term107709.getClass(), "_asStatic", false);
        setElement(term107706, 2, term107709);
        setField(term107710, term107710.getClass(), "_referencedType", null);
        setField(term107710, term107710.getClass(), "_superClass", null);
        setField(term107710, term107710.getClass(), "_superInterfaces", null);
        setField(term107710, term107710.getClass(), "_bindings", null);
        setField(term107710, term107710.getClass(), "_canonicalName", null);
        setField(term107710, term107710.getClass(), "_class", null);
        setIntField(term107710, term107710.getClass(), "_hash", 0);
        setField(term107710, term107710.getClass(), "_valueHandler", null);
        setField(term107710, term107710.getClass(), "_typeHandler", null);
        setBooleanField(term107710, term107710.getClass(), "_asStatic", false);
        setElement(term107706, 3, term107710);
        setField(term107704, term107704.getClass(), "_types", term107706);
        setField(term107704, term107704.getClass(), "_unboundVariables", null);
        setIntField(term107704, term107704.getClass(), "_hashCode", 1);
        term107711 = (Object[]) newArray("java.lang.String", 4);
        term107712 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term107713 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term107714 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term107715 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term107716 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term107713, term107713.getClass(), "_referencedType", null);
        setField(term107713, term107713.getClass(), "_superClass", null);
        setField(term107713, term107713.getClass(), "_superInterfaces", null);
        setField(term107713, term107713.getClass(), "_bindings", null);
        setField(term107713, term107713.getClass(), "_canonicalName", null);
        setField(term107713, term107713.getClass(), "_class", null);
        setIntField(term107713, term107713.getClass(), "_hash", 0);
        setField(term107713, term107713.getClass(), "_valueHandler", null);
        setField(term107713, term107713.getClass(), "_typeHandler", null);
        setBooleanField(term107713, term107713.getClass(), "_asStatic", false);
        setElement(term107712, 0, term107713);
        setField(term107714, term107714.getClass(), "_componentType", null);
        setField(term107714, term107714.getClass(), "_emptyArray", null);
        setField(term107714, term107714.getClass(), "_superClass", null);
        setField(term107714, term107714.getClass(), "_superInterfaces", null);
        setField(term107714, term107714.getClass(), "_bindings", null);
        setField(term107714, term107714.getClass(), "_canonicalName", null);
        setField(term107714, term107714.getClass(), "_class", null);
        setIntField(term107714, term107714.getClass(), "_hash", 0);
        setField(term107714, term107714.getClass(), "_valueHandler", null);
        setField(term107714, term107714.getClass(), "_typeHandler", null);
        setBooleanField(term107714, term107714.getClass(), "_asStatic", false);
        setElement(term107712, 1, term107714);
        setField(term107715, term107715.getClass(), "_componentType", null);
        setField(term107715, term107715.getClass(), "_emptyArray", null);
        setField(term107715, term107715.getClass(), "_superClass", null);
        setField(term107715, term107715.getClass(), "_superInterfaces", null);
        setField(term107715, term107715.getClass(), "_bindings", null);
        setField(term107715, term107715.getClass(), "_canonicalName", null);
        setField(term107715, term107715.getClass(), "_class", null);
        setIntField(term107715, term107715.getClass(), "_hash", 0);
        setField(term107715, term107715.getClass(), "_valueHandler", null);
        setField(term107715, term107715.getClass(), "_typeHandler", null);
        setBooleanField(term107715, term107715.getClass(), "_asStatic", false);
        setElement(term107712, 2, term107715);
        setField(term107716, term107716.getClass(), "_referencedType", null);
        setField(term107716, term107716.getClass(), "_superClass", null);
        setField(term107716, term107716.getClass(), "_superInterfaces", null);
        setField(term107716, term107716.getClass(), "_bindings", null);
        setField(term107716, term107716.getClass(), "_canonicalName", null);
        setField(term107716, term107716.getClass(), "_class", null);
        setIntField(term107716, term107716.getClass(), "_hash", 0);
        setField(term107716, term107716.getClass(), "_valueHandler", null);
        setField(term107716, term107716.getClass(), "_typeHandler", null);
        setBooleanField(term107716, term107716.getClass(), "_asStatic", false);
        setElement(term107712, 3, term107716);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term107029;
        args[1] = term107030;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term107704));
        assertTrue(recursiveEquals(term107029, term107711));
        assertTrue(recursiveEquals(term107030, term107712));
    }

};


