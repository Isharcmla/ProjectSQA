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

public class TypeBindings_init_352540534349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120822;
     Object term120824;
     Object term121575;
     Object term121584;
     Object term121587;

    public TypeBindings_init_352540534349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term120989 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term120829 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term120989, term120989.getClass(), "_names", null);
        setField(term120989, term120989.getClass(), "_types", term120829);
        term120822 = (Object[]) newArray("java.lang.String", 4);
        setElement(term120822, 3, "");
        term120824 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term121131 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term121235 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term121355 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term121453 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setIntField(term121131, term121131.getClass(), "_hash", 0);
        setElement(term120824, 0, term121131);
        setIntField(term121235, term121235.getClass(), "_hash", 0);
        setElement(term120824, 1, term121235);
        setIntField(term121355, term121355.getClass(), "_hash", 0);
        setElement(term120824, 2, term121355);
        setElement(term120824, 3, term121453);
        term121575 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term121576 = (Object[]) newArray("java.lang.String", 4);
        Object[] term121579 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term121580 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term121581 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term121582 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term121583 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setElement(term121576, 3, "");
        setField(term121575, term121575.getClass(), "_names", term121576);
        setField(term121580, term121580.getClass(), "_referencedType", null);
        setField(term121580, term121580.getClass(), "_superClass", null);
        setField(term121580, term121580.getClass(), "_superInterfaces", null);
        setField(term121580, term121580.getClass(), "_bindings", null);
        setField(term121580, term121580.getClass(), "_canonicalName", null);
        setField(term121580, term121580.getClass(), "_class", null);
        setIntField(term121580, term121580.getClass(), "_hash", 0);
        setField(term121580, term121580.getClass(), "_valueHandler", null);
        setField(term121580, term121580.getClass(), "_typeHandler", null);
        setBooleanField(term121580, term121580.getClass(), "_asStatic", false);
        setElement(term121579, 0, term121580);
        setField(term121581, term121581.getClass(), "_referencedType", null);
        setField(term121581, term121581.getClass(), "_superClass", null);
        setField(term121581, term121581.getClass(), "_superInterfaces", null);
        setField(term121581, term121581.getClass(), "_bindings", null);
        setField(term121581, term121581.getClass(), "_canonicalName", null);
        setField(term121581, term121581.getClass(), "_class", null);
        setIntField(term121581, term121581.getClass(), "_hash", 0);
        setField(term121581, term121581.getClass(), "_valueHandler", null);
        setField(term121581, term121581.getClass(), "_typeHandler", null);
        setBooleanField(term121581, term121581.getClass(), "_asStatic", false);
        setElement(term121579, 1, term121581);
        setField(term121582, term121582.getClass(), "_referencedType", null);
        setField(term121582, term121582.getClass(), "_superClass", null);
        setField(term121582, term121582.getClass(), "_superInterfaces", null);
        setField(term121582, term121582.getClass(), "_bindings", null);
        setField(term121582, term121582.getClass(), "_canonicalName", null);
        setField(term121582, term121582.getClass(), "_class", null);
        setIntField(term121582, term121582.getClass(), "_hash", 0);
        setField(term121582, term121582.getClass(), "_valueHandler", null);
        setField(term121582, term121582.getClass(), "_typeHandler", null);
        setBooleanField(term121582, term121582.getClass(), "_asStatic", false);
        setElement(term121579, 2, term121582);
        setField(term121583, term121583.getClass(), "_superClass", null);
        setField(term121583, term121583.getClass(), "_superInterfaces", null);
        setField(term121583, term121583.getClass(), "_bindings", null);
        setField(term121583, term121583.getClass(), "_canonicalName", null);
        setField(term121583, term121583.getClass(), "_class", null);
        setIntField(term121583, term121583.getClass(), "_hash", 0);
        setField(term121583, term121583.getClass(), "_valueHandler", null);
        setField(term121583, term121583.getClass(), "_typeHandler", null);
        setBooleanField(term121583, term121583.getClass(), "_asStatic", false);
        setElement(term121579, 3, term121583);
        setField(term121575, term121575.getClass(), "_types", term121579);
        setField(term121575, term121575.getClass(), "_unboundVariables", null);
        setIntField(term121575, term121575.getClass(), "_hashCode", 1);
        term121584 = (Object[]) newArray("java.lang.String", 4);
        setElement(term121584, 3, "");
        term121587 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term121588 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term121589 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term121590 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term121591 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term121588, term121588.getClass(), "_referencedType", null);
        setField(term121588, term121588.getClass(), "_superClass", null);
        setField(term121588, term121588.getClass(), "_superInterfaces", null);
        setField(term121588, term121588.getClass(), "_bindings", null);
        setField(term121588, term121588.getClass(), "_canonicalName", null);
        setField(term121588, term121588.getClass(), "_class", null);
        setIntField(term121588, term121588.getClass(), "_hash", 0);
        setField(term121588, term121588.getClass(), "_valueHandler", null);
        setField(term121588, term121588.getClass(), "_typeHandler", null);
        setBooleanField(term121588, term121588.getClass(), "_asStatic", false);
        setElement(term121587, 0, term121588);
        setField(term121589, term121589.getClass(), "_referencedType", null);
        setField(term121589, term121589.getClass(), "_superClass", null);
        setField(term121589, term121589.getClass(), "_superInterfaces", null);
        setField(term121589, term121589.getClass(), "_bindings", null);
        setField(term121589, term121589.getClass(), "_canonicalName", null);
        setField(term121589, term121589.getClass(), "_class", null);
        setIntField(term121589, term121589.getClass(), "_hash", 0);
        setField(term121589, term121589.getClass(), "_valueHandler", null);
        setField(term121589, term121589.getClass(), "_typeHandler", null);
        setBooleanField(term121589, term121589.getClass(), "_asStatic", false);
        setElement(term121587, 1, term121589);
        setField(term121590, term121590.getClass(), "_referencedType", null);
        setField(term121590, term121590.getClass(), "_superClass", null);
        setField(term121590, term121590.getClass(), "_superInterfaces", null);
        setField(term121590, term121590.getClass(), "_bindings", null);
        setField(term121590, term121590.getClass(), "_canonicalName", null);
        setField(term121590, term121590.getClass(), "_class", null);
        setIntField(term121590, term121590.getClass(), "_hash", 0);
        setField(term121590, term121590.getClass(), "_valueHandler", null);
        setField(term121590, term121590.getClass(), "_typeHandler", null);
        setBooleanField(term121590, term121590.getClass(), "_asStatic", false);
        setElement(term121587, 2, term121590);
        setField(term121591, term121591.getClass(), "_superClass", null);
        setField(term121591, term121591.getClass(), "_superInterfaces", null);
        setField(term121591, term121591.getClass(), "_bindings", null);
        setField(term121591, term121591.getClass(), "_canonicalName", null);
        setField(term121591, term121591.getClass(), "_class", null);
        setIntField(term121591, term121591.getClass(), "_hash", 0);
        setField(term121591, term121591.getClass(), "_valueHandler", null);
        setField(term121591, term121591.getClass(), "_typeHandler", null);
        setBooleanField(term121591, term121591.getClass(), "_asStatic", false);
        setElement(term121587, 3, term121591);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term120822;
        args[1] = term120824;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term121575));
        assertTrue(recursiveEquals(term120822, term121584));
        assertTrue(recursiveEquals(term120824, term121587));
    }

};


