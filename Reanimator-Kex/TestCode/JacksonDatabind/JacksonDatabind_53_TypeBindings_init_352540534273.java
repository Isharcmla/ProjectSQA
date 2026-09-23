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

public class TypeBindings_init_352540534273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88605;
     Object term88606;
     Object term89296;
     Object term89303;
     Object term89304;

    public TypeBindings_init_352540534273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term88768 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term88611 = (Object[]) newArray("java.lang.String", 0);
        Object[] term88612 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term88768, term88768.getClass(), "_names", term88611);
        setField(term88768, term88768.getClass(), "_types", term88612);
        term88605 = (Object[]) newArray("java.lang.String", 4);
        term88606 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term88872 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term88968 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term89088 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term89188 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setIntField(term88872, term88872.getClass(), "_hash", 0);
        setElement(term88606, 0, term88872);
        setIntField(term88968, term88968.getClass(), "_hash", 0);
        setElement(term88606, 1, term88968);
        setIntField(term89088, term89088.getClass(), "_hash", 0);
        setElement(term88606, 2, term89088);
        setElement(term88606, 3, term89188);
        term89296 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term89297 = (Object[]) newArray("java.lang.String", 4);
        Object[] term89298 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term89299 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term89300 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term89301 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term89302 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term89296, term89296.getClass(), "_names", term89297);
        setField(term89299, term89299.getClass(), "_referencedType", null);
        setField(term89299, term89299.getClass(), "_superClass", null);
        setField(term89299, term89299.getClass(), "_superInterfaces", null);
        setField(term89299, term89299.getClass(), "_bindings", null);
        setField(term89299, term89299.getClass(), "_canonicalName", null);
        setField(term89299, term89299.getClass(), "_class", null);
        setIntField(term89299, term89299.getClass(), "_hash", 0);
        setField(term89299, term89299.getClass(), "_valueHandler", null);
        setField(term89299, term89299.getClass(), "_typeHandler", null);
        setBooleanField(term89299, term89299.getClass(), "_asStatic", false);
        setElement(term89298, 0, term89299);
        setField(term89300, term89300.getClass(), "_componentType", null);
        setField(term89300, term89300.getClass(), "_emptyArray", null);
        setField(term89300, term89300.getClass(), "_superClass", null);
        setField(term89300, term89300.getClass(), "_superInterfaces", null);
        setField(term89300, term89300.getClass(), "_bindings", null);
        setField(term89300, term89300.getClass(), "_canonicalName", null);
        setField(term89300, term89300.getClass(), "_class", null);
        setIntField(term89300, term89300.getClass(), "_hash", 0);
        setField(term89300, term89300.getClass(), "_valueHandler", null);
        setField(term89300, term89300.getClass(), "_typeHandler", null);
        setBooleanField(term89300, term89300.getClass(), "_asStatic", false);
        setElement(term89298, 1, term89300);
        setField(term89301, term89301.getClass(), "_referencedType", null);
        setField(term89301, term89301.getClass(), "_superClass", null);
        setField(term89301, term89301.getClass(), "_superInterfaces", null);
        setField(term89301, term89301.getClass(), "_bindings", null);
        setField(term89301, term89301.getClass(), "_canonicalName", null);
        setField(term89301, term89301.getClass(), "_class", null);
        setIntField(term89301, term89301.getClass(), "_hash", 0);
        setField(term89301, term89301.getClass(), "_valueHandler", null);
        setField(term89301, term89301.getClass(), "_typeHandler", null);
        setBooleanField(term89301, term89301.getClass(), "_asStatic", false);
        setElement(term89298, 2, term89301);
        setField(term89302, term89302.getClass(), "_keyType", null);
        setField(term89302, term89302.getClass(), "_valueType", null);
        setField(term89302, term89302.getClass(), "_superClass", null);
        setField(term89302, term89302.getClass(), "_superInterfaces", null);
        setField(term89302, term89302.getClass(), "_bindings", null);
        setField(term89302, term89302.getClass(), "_canonicalName", null);
        setField(term89302, term89302.getClass(), "_class", null);
        setIntField(term89302, term89302.getClass(), "_hash", 0);
        setField(term89302, term89302.getClass(), "_valueHandler", null);
        setField(term89302, term89302.getClass(), "_typeHandler", null);
        setBooleanField(term89302, term89302.getClass(), "_asStatic", false);
        setElement(term89298, 3, term89302);
        setField(term89296, term89296.getClass(), "_types", term89298);
        setField(term89296, term89296.getClass(), "_unboundVariables", null);
        setIntField(term89296, term89296.getClass(), "_hashCode", 1);
        term89303 = (Object[]) newArray("java.lang.String", 4);
        term89304 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term89305 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term89306 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term89307 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term89308 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term89305, term89305.getClass(), "_referencedType", null);
        setField(term89305, term89305.getClass(), "_superClass", null);
        setField(term89305, term89305.getClass(), "_superInterfaces", null);
        setField(term89305, term89305.getClass(), "_bindings", null);
        setField(term89305, term89305.getClass(), "_canonicalName", null);
        setField(term89305, term89305.getClass(), "_class", null);
        setIntField(term89305, term89305.getClass(), "_hash", 0);
        setField(term89305, term89305.getClass(), "_valueHandler", null);
        setField(term89305, term89305.getClass(), "_typeHandler", null);
        setBooleanField(term89305, term89305.getClass(), "_asStatic", false);
        setElement(term89304, 0, term89305);
        setField(term89306, term89306.getClass(), "_componentType", null);
        setField(term89306, term89306.getClass(), "_emptyArray", null);
        setField(term89306, term89306.getClass(), "_superClass", null);
        setField(term89306, term89306.getClass(), "_superInterfaces", null);
        setField(term89306, term89306.getClass(), "_bindings", null);
        setField(term89306, term89306.getClass(), "_canonicalName", null);
        setField(term89306, term89306.getClass(), "_class", null);
        setIntField(term89306, term89306.getClass(), "_hash", 0);
        setField(term89306, term89306.getClass(), "_valueHandler", null);
        setField(term89306, term89306.getClass(), "_typeHandler", null);
        setBooleanField(term89306, term89306.getClass(), "_asStatic", false);
        setElement(term89304, 1, term89306);
        setField(term89307, term89307.getClass(), "_referencedType", null);
        setField(term89307, term89307.getClass(), "_superClass", null);
        setField(term89307, term89307.getClass(), "_superInterfaces", null);
        setField(term89307, term89307.getClass(), "_bindings", null);
        setField(term89307, term89307.getClass(), "_canonicalName", null);
        setField(term89307, term89307.getClass(), "_class", null);
        setIntField(term89307, term89307.getClass(), "_hash", 0);
        setField(term89307, term89307.getClass(), "_valueHandler", null);
        setField(term89307, term89307.getClass(), "_typeHandler", null);
        setBooleanField(term89307, term89307.getClass(), "_asStatic", false);
        setElement(term89304, 2, term89307);
        setField(term89308, term89308.getClass(), "_keyType", null);
        setField(term89308, term89308.getClass(), "_valueType", null);
        setField(term89308, term89308.getClass(), "_superClass", null);
        setField(term89308, term89308.getClass(), "_superInterfaces", null);
        setField(term89308, term89308.getClass(), "_bindings", null);
        setField(term89308, term89308.getClass(), "_canonicalName", null);
        setField(term89308, term89308.getClass(), "_class", null);
        setIntField(term89308, term89308.getClass(), "_hash", 0);
        setField(term89308, term89308.getClass(), "_valueHandler", null);
        setField(term89308, term89308.getClass(), "_typeHandler", null);
        setBooleanField(term89308, term89308.getClass(), "_asStatic", false);
        setElement(term89304, 3, term89308);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term88605;
        args[1] = term88606;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term89296));
        assertTrue(recursiveEquals(term88605, term89303));
        assertTrue(recursiveEquals(term88606, term89304));
    }

};


