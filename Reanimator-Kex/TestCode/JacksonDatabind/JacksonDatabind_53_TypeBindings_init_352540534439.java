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

public class TypeBindings_init_352540534439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168210;
     Object term168211;
     Object term168859;
     Object term168866;
     Object term168867;

    public TypeBindings_init_352540534439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term168364 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term168216 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term168364, term168364.getClass(), "_names", null);
        setField(term168364, term168364.getClass(), "_types", term168216);
        term168210 = (Object[]) newArray("java.lang.String", 4);
        term168211 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term168484 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term168576 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term168696 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term168816 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setIntField(term168484, term168484.getClass(), "_hash", 0);
        setElement(term168211, 0, term168484);
        setIntField(term168576, term168576.getClass(), "_hash", 0);
        setElement(term168211, 1, term168576);
        setElement(term168211, 2, term168696);
        setElement(term168211, 3, term168816);
        term168859 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term168860 = (Object[]) newArray("java.lang.String", 4);
        Object[] term168861 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term168862 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term168863 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term168864 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term168865 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term168859, term168859.getClass(), "_names", term168860);
        setField(term168862, term168862.getClass(), "_referencedType", null);
        setField(term168862, term168862.getClass(), "_superClass", null);
        setField(term168862, term168862.getClass(), "_superInterfaces", null);
        setField(term168862, term168862.getClass(), "_bindings", null);
        setField(term168862, term168862.getClass(), "_canonicalName", null);
        setField(term168862, term168862.getClass(), "_class", null);
        setIntField(term168862, term168862.getClass(), "_hash", 0);
        setField(term168862, term168862.getClass(), "_valueHandler", null);
        setField(term168862, term168862.getClass(), "_typeHandler", null);
        setBooleanField(term168862, term168862.getClass(), "_asStatic", false);
        setElement(term168861, 0, term168862);
        setField(term168863, term168863.getClass(), "_keyType", null);
        setField(term168863, term168863.getClass(), "_valueType", null);
        setField(term168863, term168863.getClass(), "_superClass", null);
        setField(term168863, term168863.getClass(), "_superInterfaces", null);
        setField(term168863, term168863.getClass(), "_bindings", null);
        setField(term168863, term168863.getClass(), "_canonicalName", null);
        setField(term168863, term168863.getClass(), "_class", null);
        setIntField(term168863, term168863.getClass(), "_hash", 0);
        setField(term168863, term168863.getClass(), "_valueHandler", null);
        setField(term168863, term168863.getClass(), "_typeHandler", null);
        setBooleanField(term168863, term168863.getClass(), "_asStatic", false);
        setElement(term168861, 1, term168863);
        setField(term168864, term168864.getClass(), "_referencedType", null);
        setField(term168864, term168864.getClass(), "_superClass", null);
        setField(term168864, term168864.getClass(), "_superInterfaces", null);
        setField(term168864, term168864.getClass(), "_bindings", null);
        setField(term168864, term168864.getClass(), "_canonicalName", null);
        setField(term168864, term168864.getClass(), "_class", null);
        setIntField(term168864, term168864.getClass(), "_hash", 0);
        setField(term168864, term168864.getClass(), "_valueHandler", null);
        setField(term168864, term168864.getClass(), "_typeHandler", null);
        setBooleanField(term168864, term168864.getClass(), "_asStatic", false);
        setElement(term168861, 2, term168864);
        setField(term168865, term168865.getClass(), "_referencedType", null);
        setField(term168865, term168865.getClass(), "_superClass", null);
        setField(term168865, term168865.getClass(), "_superInterfaces", null);
        setField(term168865, term168865.getClass(), "_bindings", null);
        setField(term168865, term168865.getClass(), "_canonicalName", null);
        setField(term168865, term168865.getClass(), "_class", null);
        setIntField(term168865, term168865.getClass(), "_hash", 0);
        setField(term168865, term168865.getClass(), "_valueHandler", null);
        setField(term168865, term168865.getClass(), "_typeHandler", null);
        setBooleanField(term168865, term168865.getClass(), "_asStatic", false);
        setElement(term168861, 3, term168865);
        setField(term168859, term168859.getClass(), "_types", term168861);
        setField(term168859, term168859.getClass(), "_unboundVariables", null);
        setIntField(term168859, term168859.getClass(), "_hashCode", 1);
        term168866 = (Object[]) newArray("java.lang.String", 4);
        term168867 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term168868 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term168869 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term168870 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term168871 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term168868, term168868.getClass(), "_referencedType", null);
        setField(term168868, term168868.getClass(), "_superClass", null);
        setField(term168868, term168868.getClass(), "_superInterfaces", null);
        setField(term168868, term168868.getClass(), "_bindings", null);
        setField(term168868, term168868.getClass(), "_canonicalName", null);
        setField(term168868, term168868.getClass(), "_class", null);
        setIntField(term168868, term168868.getClass(), "_hash", 0);
        setField(term168868, term168868.getClass(), "_valueHandler", null);
        setField(term168868, term168868.getClass(), "_typeHandler", null);
        setBooleanField(term168868, term168868.getClass(), "_asStatic", false);
        setElement(term168867, 0, term168868);
        setField(term168869, term168869.getClass(), "_keyType", null);
        setField(term168869, term168869.getClass(), "_valueType", null);
        setField(term168869, term168869.getClass(), "_superClass", null);
        setField(term168869, term168869.getClass(), "_superInterfaces", null);
        setField(term168869, term168869.getClass(), "_bindings", null);
        setField(term168869, term168869.getClass(), "_canonicalName", null);
        setField(term168869, term168869.getClass(), "_class", null);
        setIntField(term168869, term168869.getClass(), "_hash", 0);
        setField(term168869, term168869.getClass(), "_valueHandler", null);
        setField(term168869, term168869.getClass(), "_typeHandler", null);
        setBooleanField(term168869, term168869.getClass(), "_asStatic", false);
        setElement(term168867, 1, term168869);
        setField(term168870, term168870.getClass(), "_referencedType", null);
        setField(term168870, term168870.getClass(), "_superClass", null);
        setField(term168870, term168870.getClass(), "_superInterfaces", null);
        setField(term168870, term168870.getClass(), "_bindings", null);
        setField(term168870, term168870.getClass(), "_canonicalName", null);
        setField(term168870, term168870.getClass(), "_class", null);
        setIntField(term168870, term168870.getClass(), "_hash", 0);
        setField(term168870, term168870.getClass(), "_valueHandler", null);
        setField(term168870, term168870.getClass(), "_typeHandler", null);
        setBooleanField(term168870, term168870.getClass(), "_asStatic", false);
        setElement(term168867, 2, term168870);
        setField(term168871, term168871.getClass(), "_referencedType", null);
        setField(term168871, term168871.getClass(), "_superClass", null);
        setField(term168871, term168871.getClass(), "_superInterfaces", null);
        setField(term168871, term168871.getClass(), "_bindings", null);
        setField(term168871, term168871.getClass(), "_canonicalName", null);
        setField(term168871, term168871.getClass(), "_class", null);
        setIntField(term168871, term168871.getClass(), "_hash", 0);
        setField(term168871, term168871.getClass(), "_valueHandler", null);
        setField(term168871, term168871.getClass(), "_typeHandler", null);
        setBooleanField(term168871, term168871.getClass(), "_asStatic", false);
        setElement(term168867, 3, term168871);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term168210;
        args[1] = term168211;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term168859));
        assertTrue(recursiveEquals(term168210, term168866));
        assertTrue(recursiveEquals(term168211, term168867));
    }

};


