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

public class TypeBindings_init_352540534235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76450;
     Object term76453;
     Object term77082;
     Object term77094;
     Object term77101;

    public TypeBindings_init_352540534235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term76612 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term76457 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term76612, term76612.getClass(), "_names", null);
        setField(term76612, term76612.getClass(), "_types", term76457);
        term76450 = (Object[]) newArray("java.lang.String", 3);
        setElement(term76450, 0, "");
        setElement(term76450, 1, "");
        setElement(term76450, 2, "");
        term76453 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term76792 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term76888 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term76984 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setIntField(term76792, term76792.getClass(), "_hash", 0);
        setElement(term76453, 0, term76792);
        setIntField(term76888, term76888.getClass(), "_hash", 0);
        setElement(term76453, 1, term76888);
        setIntField(term76984, term76984.getClass(), "_hash", 0);
        setElement(term76453, 2, term76984);
        term77082 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term77083 = (Object[]) newArray("java.lang.String", 3);
        Object[] term77090 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term77091 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term77092 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term77093 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setElement(term77083, 0, "");
        setElement(term77083, 1, "");
        setElement(term77083, 2, "");
        setField(term77082, term77082.getClass(), "_names", term77083);
        setField(term77091, term77091.getClass(), "_referencedType", null);
        setField(term77091, term77091.getClass(), "_superClass", null);
        setField(term77091, term77091.getClass(), "_superInterfaces", null);
        setField(term77091, term77091.getClass(), "_bindings", null);
        setField(term77091, term77091.getClass(), "_canonicalName", null);
        setField(term77091, term77091.getClass(), "_class", null);
        setIntField(term77091, term77091.getClass(), "_hash", 0);
        setField(term77091, term77091.getClass(), "_valueHandler", null);
        setField(term77091, term77091.getClass(), "_typeHandler", null);
        setBooleanField(term77091, term77091.getClass(), "_asStatic", false);
        setElement(term77090, 0, term77091);
        setField(term77092, term77092.getClass(), "_componentType", null);
        setField(term77092, term77092.getClass(), "_emptyArray", null);
        setField(term77092, term77092.getClass(), "_superClass", null);
        setField(term77092, term77092.getClass(), "_superInterfaces", null);
        setField(term77092, term77092.getClass(), "_bindings", null);
        setField(term77092, term77092.getClass(), "_canonicalName", null);
        setField(term77092, term77092.getClass(), "_class", null);
        setIntField(term77092, term77092.getClass(), "_hash", 0);
        setField(term77092, term77092.getClass(), "_valueHandler", null);
        setField(term77092, term77092.getClass(), "_typeHandler", null);
        setBooleanField(term77092, term77092.getClass(), "_asStatic", false);
        setElement(term77090, 1, term77092);
        setField(term77093, term77093.getClass(), "_componentType", null);
        setField(term77093, term77093.getClass(), "_emptyArray", null);
        setField(term77093, term77093.getClass(), "_superClass", null);
        setField(term77093, term77093.getClass(), "_superInterfaces", null);
        setField(term77093, term77093.getClass(), "_bindings", null);
        setField(term77093, term77093.getClass(), "_canonicalName", null);
        setField(term77093, term77093.getClass(), "_class", null);
        setIntField(term77093, term77093.getClass(), "_hash", 0);
        setField(term77093, term77093.getClass(), "_valueHandler", null);
        setField(term77093, term77093.getClass(), "_typeHandler", null);
        setBooleanField(term77093, term77093.getClass(), "_asStatic", false);
        setElement(term77090, 2, term77093);
        setField(term77082, term77082.getClass(), "_types", term77090);
        setField(term77082, term77082.getClass(), "_unboundVariables", null);
        setIntField(term77082, term77082.getClass(), "_hashCode", 1);
        term77094 = (Object[]) newArray("java.lang.String", 3);
        setElement(term77094, 0, "");
        setElement(term77094, 1, "");
        setElement(term77094, 2, "");
        term77101 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term77102 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term77103 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term77104 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term77102, term77102.getClass(), "_referencedType", null);
        setField(term77102, term77102.getClass(), "_superClass", null);
        setField(term77102, term77102.getClass(), "_superInterfaces", null);
        setField(term77102, term77102.getClass(), "_bindings", null);
        setField(term77102, term77102.getClass(), "_canonicalName", null);
        setField(term77102, term77102.getClass(), "_class", null);
        setIntField(term77102, term77102.getClass(), "_hash", 0);
        setField(term77102, term77102.getClass(), "_valueHandler", null);
        setField(term77102, term77102.getClass(), "_typeHandler", null);
        setBooleanField(term77102, term77102.getClass(), "_asStatic", false);
        setElement(term77101, 0, term77102);
        setField(term77103, term77103.getClass(), "_componentType", null);
        setField(term77103, term77103.getClass(), "_emptyArray", null);
        setField(term77103, term77103.getClass(), "_superClass", null);
        setField(term77103, term77103.getClass(), "_superInterfaces", null);
        setField(term77103, term77103.getClass(), "_bindings", null);
        setField(term77103, term77103.getClass(), "_canonicalName", null);
        setField(term77103, term77103.getClass(), "_class", null);
        setIntField(term77103, term77103.getClass(), "_hash", 0);
        setField(term77103, term77103.getClass(), "_valueHandler", null);
        setField(term77103, term77103.getClass(), "_typeHandler", null);
        setBooleanField(term77103, term77103.getClass(), "_asStatic", false);
        setElement(term77101, 1, term77103);
        setField(term77104, term77104.getClass(), "_componentType", null);
        setField(term77104, term77104.getClass(), "_emptyArray", null);
        setField(term77104, term77104.getClass(), "_superClass", null);
        setField(term77104, term77104.getClass(), "_superInterfaces", null);
        setField(term77104, term77104.getClass(), "_bindings", null);
        setField(term77104, term77104.getClass(), "_canonicalName", null);
        setField(term77104, term77104.getClass(), "_class", null);
        setIntField(term77104, term77104.getClass(), "_hash", 0);
        setField(term77104, term77104.getClass(), "_valueHandler", null);
        setField(term77104, term77104.getClass(), "_typeHandler", null);
        setBooleanField(term77104, term77104.getClass(), "_asStatic", false);
        setElement(term77101, 2, term77104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term76450;
        args[1] = term76453;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term77082));
        assertTrue(recursiveEquals(term76450, term77094));
        assertTrue(recursiveEquals(term76453, term77101));
    }

};


