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

public class TypeBindings_init_352540534305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100934;
     Object term100935;
     Object term102766;
     Object term102773;
     Object term102774;

    public TypeBindings_init_352540534305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term101100 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term101100, term101100.getClass(), "_names", null);
        setField(term101100, term101100.getClass(), "_types", null);
        term100934 = (Object[]) newArray("java.lang.String", 4);
        term100935 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term101204 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term101300 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term101396 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term101510 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setIntField(term101204, term101204.getClass(), "_hash", 0);
        setElement(term100935, 0, term101204);
        setIntField(term101300, term101300.getClass(), "_hash", 0);
        setElement(term100935, 1, term101300);
        setIntField(term101396, term101396.getClass(), "_hash", 0);
        setElement(term100935, 2, term101396);
        setElement(term100935, 3, term101510);
        term102766 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term102767 = (Object[]) newArray("java.lang.String", 4);
        Object[] term102768 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term102769 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term102770 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term102771 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term102772 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term102766, term102766.getClass(), "_names", term102767);
        setField(term102769, term102769.getClass(), "_referencedType", null);
        setField(term102769, term102769.getClass(), "_superClass", null);
        setField(term102769, term102769.getClass(), "_superInterfaces", null);
        setField(term102769, term102769.getClass(), "_bindings", null);
        setField(term102769, term102769.getClass(), "_canonicalName", null);
        setField(term102769, term102769.getClass(), "_class", null);
        setIntField(term102769, term102769.getClass(), "_hash", 0);
        setField(term102769, term102769.getClass(), "_valueHandler", null);
        setField(term102769, term102769.getClass(), "_typeHandler", null);
        setBooleanField(term102769, term102769.getClass(), "_asStatic", false);
        setElement(term102768, 0, term102769);
        setField(term102770, term102770.getClass(), "_componentType", null);
        setField(term102770, term102770.getClass(), "_emptyArray", null);
        setField(term102770, term102770.getClass(), "_superClass", null);
        setField(term102770, term102770.getClass(), "_superInterfaces", null);
        setField(term102770, term102770.getClass(), "_bindings", null);
        setField(term102770, term102770.getClass(), "_canonicalName", null);
        setField(term102770, term102770.getClass(), "_class", null);
        setIntField(term102770, term102770.getClass(), "_hash", 0);
        setField(term102770, term102770.getClass(), "_valueHandler", null);
        setField(term102770, term102770.getClass(), "_typeHandler", null);
        setBooleanField(term102770, term102770.getClass(), "_asStatic", false);
        setElement(term102768, 1, term102770);
        setField(term102771, term102771.getClass(), "_componentType", null);
        setField(term102771, term102771.getClass(), "_emptyArray", null);
        setField(term102771, term102771.getClass(), "_superClass", null);
        setField(term102771, term102771.getClass(), "_superInterfaces", null);
        setField(term102771, term102771.getClass(), "_bindings", null);
        setField(term102771, term102771.getClass(), "_canonicalName", null);
        setField(term102771, term102771.getClass(), "_class", null);
        setIntField(term102771, term102771.getClass(), "_hash", 0);
        setField(term102771, term102771.getClass(), "_valueHandler", null);
        setField(term102771, term102771.getClass(), "_typeHandler", null);
        setBooleanField(term102771, term102771.getClass(), "_asStatic", false);
        setElement(term102768, 2, term102771);
        setField(term102772, term102772.getClass(), "_elementType", null);
        setField(term102772, term102772.getClass(), "_superClass", null);
        setField(term102772, term102772.getClass(), "_superInterfaces", null);
        setField(term102772, term102772.getClass(), "_bindings", null);
        setField(term102772, term102772.getClass(), "_canonicalName", null);
        setField(term102772, term102772.getClass(), "_class", null);
        setIntField(term102772, term102772.getClass(), "_hash", 0);
        setField(term102772, term102772.getClass(), "_valueHandler", null);
        setField(term102772, term102772.getClass(), "_typeHandler", null);
        setBooleanField(term102772, term102772.getClass(), "_asStatic", false);
        setElement(term102768, 3, term102772);
        setField(term102766, term102766.getClass(), "_types", term102768);
        setField(term102766, term102766.getClass(), "_unboundVariables", null);
        setIntField(term102766, term102766.getClass(), "_hashCode", 1);
        term102773 = (Object[]) newArray("java.lang.String", 4);
        term102774 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term102775 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term102776 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term102777 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term102778 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term102775, term102775.getClass(), "_referencedType", null);
        setField(term102775, term102775.getClass(), "_superClass", null);
        setField(term102775, term102775.getClass(), "_superInterfaces", null);
        setField(term102775, term102775.getClass(), "_bindings", null);
        setField(term102775, term102775.getClass(), "_canonicalName", null);
        setField(term102775, term102775.getClass(), "_class", null);
        setIntField(term102775, term102775.getClass(), "_hash", 0);
        setField(term102775, term102775.getClass(), "_valueHandler", null);
        setField(term102775, term102775.getClass(), "_typeHandler", null);
        setBooleanField(term102775, term102775.getClass(), "_asStatic", false);
        setElement(term102774, 0, term102775);
        setField(term102776, term102776.getClass(), "_componentType", null);
        setField(term102776, term102776.getClass(), "_emptyArray", null);
        setField(term102776, term102776.getClass(), "_superClass", null);
        setField(term102776, term102776.getClass(), "_superInterfaces", null);
        setField(term102776, term102776.getClass(), "_bindings", null);
        setField(term102776, term102776.getClass(), "_canonicalName", null);
        setField(term102776, term102776.getClass(), "_class", null);
        setIntField(term102776, term102776.getClass(), "_hash", 0);
        setField(term102776, term102776.getClass(), "_valueHandler", null);
        setField(term102776, term102776.getClass(), "_typeHandler", null);
        setBooleanField(term102776, term102776.getClass(), "_asStatic", false);
        setElement(term102774, 1, term102776);
        setField(term102777, term102777.getClass(), "_componentType", null);
        setField(term102777, term102777.getClass(), "_emptyArray", null);
        setField(term102777, term102777.getClass(), "_superClass", null);
        setField(term102777, term102777.getClass(), "_superInterfaces", null);
        setField(term102777, term102777.getClass(), "_bindings", null);
        setField(term102777, term102777.getClass(), "_canonicalName", null);
        setField(term102777, term102777.getClass(), "_class", null);
        setIntField(term102777, term102777.getClass(), "_hash", 0);
        setField(term102777, term102777.getClass(), "_valueHandler", null);
        setField(term102777, term102777.getClass(), "_typeHandler", null);
        setBooleanField(term102777, term102777.getClass(), "_asStatic", false);
        setElement(term102774, 2, term102777);
        setField(term102778, term102778.getClass(), "_elementType", null);
        setField(term102778, term102778.getClass(), "_superClass", null);
        setField(term102778, term102778.getClass(), "_superInterfaces", null);
        setField(term102778, term102778.getClass(), "_bindings", null);
        setField(term102778, term102778.getClass(), "_canonicalName", null);
        setField(term102778, term102778.getClass(), "_class", null);
        setIntField(term102778, term102778.getClass(), "_hash", 0);
        setField(term102778, term102778.getClass(), "_valueHandler", null);
        setField(term102778, term102778.getClass(), "_typeHandler", null);
        setBooleanField(term102778, term102778.getClass(), "_asStatic", false);
        setElement(term102774, 3, term102778);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term100934;
        args[1] = term100935;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term102766));
        assertTrue(recursiveEquals(term100934, term102773));
        assertTrue(recursiveEquals(term100935, term102774));
    }

};


