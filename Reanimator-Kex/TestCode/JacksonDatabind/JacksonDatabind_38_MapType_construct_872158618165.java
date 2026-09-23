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
import java.lang.String;
import java.lang.Object;

public class MapType_construct_872158618165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54308;
     Object term54404;
     Object term54500;
     Object term55634;
     Object term55635;
     Object term55636;
     Object term55488;

    public MapType_construct_872158618165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54308 = Class.forName((String) "java.lang.invoke.MethodHandleImpl$BindCaller");
        term54404 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setIntField(term54404, term54404.getClass(), "_hash", 0);
        term54500 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setIntField(term54500, term54500.getClass(), "_hash", 0);
        term55634 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term55634, term55634.getClass(), "_componentType", null);
        setField(term55634, term55634.getClass(), "_emptyArray", null);
        setField(term55634, term55634.getClass(), "_superClass", null);
        setField(term55634, term55634.getClass(), "_superInterfaces", null);
        setField(term55634, term55634.getClass(), "_bindings", null);
        setField(term55634, term55634.getClass(), "_canonicalName", null);
        setField(term55634, term55634.getClass(), "_class", null);
        setIntField(term55634, term55634.getClass(), "_hash", 0);
        setField(term55634, term55634.getClass(), "_valueHandler", null);
        setField(term55634, term55634.getClass(), "_typeHandler", null);
        setBooleanField(term55634, term55634.getClass(), "_asStatic", false);
        term55635 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term55635, term55635.getClass(), "_componentType", null);
        setField(term55635, term55635.getClass(), "_emptyArray", null);
        setField(term55635, term55635.getClass(), "_superClass", null);
        setField(term55635, term55635.getClass(), "_superInterfaces", null);
        setField(term55635, term55635.getClass(), "_bindings", null);
        setField(term55635, term55635.getClass(), "_canonicalName", null);
        setField(term55635, term55635.getClass(), "_class", null);
        setIntField(term55635, term55635.getClass(), "_hash", 0);
        setField(term55635, term55635.getClass(), "_valueHandler", null);
        setField(term55635, term55635.getClass(), "_typeHandler", null);
        setBooleanField(term55635, term55635.getClass(), "_asStatic", false);
        term55636 = Class.forName((String) "com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo");
        Class<? extends Object> term55493 = Class.forName((String) "com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo");
        term55488 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term55481 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term55485 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term55489 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term55490 = (Object[]) newArray("java.lang.String", 0);
        Object[] term55491 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term55481, term55481.getClass(), "_componentType", null);
        setField(term55481, term55481.getClass(), "_emptyArray", null);
        setField(term55481, term55481.getClass(), "_superClass", null);
        setField(term55481, term55481.getClass(), "_superInterfaces", null);
        setField(term55481, term55481.getClass(), "_bindings", null);
        setField(term55481, term55481.getClass(), "_canonicalName", null);
        setField(term55481, term55481.getClass(), "_class", null);
        setIntField(term55481, term55481.getClass(), "_hash", 0);
        setField(term55481, term55481.getClass(), "_valueHandler", null);
        setField(term55481, term55481.getClass(), "_typeHandler", null);
        setBooleanField(term55481, term55481.getClass(), "_asStatic", false);
        setField(term55488, term55488.getClass(), "_keyType", term55481);
        setField(term55485, term55485.getClass(), "_componentType", null);
        setField(term55485, term55485.getClass(), "_emptyArray", null);
        setField(term55485, term55485.getClass(), "_superClass", null);
        setField(term55485, term55485.getClass(), "_superInterfaces", null);
        setField(term55485, term55485.getClass(), "_bindings", null);
        setField(term55485, term55485.getClass(), "_canonicalName", null);
        setField(term55485, term55485.getClass(), "_class", null);
        setIntField(term55485, term55485.getClass(), "_hash", 0);
        setField(term55485, term55485.getClass(), "_valueHandler", null);
        setField(term55485, term55485.getClass(), "_typeHandler", null);
        setBooleanField(term55485, term55485.getClass(), "_asStatic", false);
        setField(term55488, term55488.getClass(), "_valueType", term55485);
        setField(term55488, term55488.getClass(), "_superClass", null);
        setField(term55488, term55488.getClass(), "_superInterfaces", null);
        setField(term55489, term55489.getClass(), "_names", term55490);
        setField(term55489, term55489.getClass(), "_types", term55491);
        setField(term55489, term55489.getClass(), "_unboundVariables", null);
        setIntField(term55489, term55489.getClass(), "_hashCode", 1);
        setField(term55488, term55488.getClass(), "_bindings", term55489);
        setField(term55488, term55488.getClass(), "_canonicalName", null);
        setField(term55488, term55488.getClass(), "_class", term55493);
        setIntField(term55488, term55488.getClass(), "_hash", -547099532);
        setField(term55488, term55488.getClass(), "_valueHandler", null);
        setField(term55488, term55488.getClass(), "_typeHandler", null);
        setBooleanField(term55488, term55488.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.MapType");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[5] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[6];
        args[0] = term54308;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term54404;
        args[5] = term54500;
        Object retValue = callMethod(klass, "construct", argTypes, null, args);
        assertTrue(recursiveEquals(term54308, term55634));
        assertTrue(recursiveEquals(term54404, null));
        assertTrue(recursiveEquals(term54500, null));
        assertTrue(recursiveEquals(retValue, term55488));
    }

};


