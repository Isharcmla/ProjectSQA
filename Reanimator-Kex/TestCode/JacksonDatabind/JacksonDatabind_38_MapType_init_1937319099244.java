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
import java.lang.String;

public class MapType_init_1937319099244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101222;
     Object term101318;
     Object term101422;
     Object term102647;
     Object term102672;
     Object term102673;
     Object term102674;

    public MapType_init_1937319099244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term101186 = Class.forName((String) "java.util.TreeMap$NavigableSubMap$SubMapEntryIterator");
        Object term101150 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term101150, term101150.getClass(), "_class", term101186);
        term101222 = Class.forName((String) "java.util.stream.SortedOps");
        term101318 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setIntField(term101318, term101318.getClass(), "_hash", 0);
        term101422 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term101422, term101422.getClass(), "_hash", 0);
        Class<? extends Object> term102653 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        term102647 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term102648 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term102649 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term102650 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term102651 = (Object[]) newArray("java.lang.String", 0);
        Object[] term102652 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term102648, term102648.getClass(), "_componentType", null);
        setField(term102648, term102648.getClass(), "_emptyArray", null);
        setField(term102648, term102648.getClass(), "_superClass", null);
        setField(term102648, term102648.getClass(), "_superInterfaces", null);
        setField(term102648, term102648.getClass(), "_bindings", null);
        setField(term102648, term102648.getClass(), "_canonicalName", null);
        setField(term102648, term102648.getClass(), "_class", null);
        setIntField(term102648, term102648.getClass(), "_hash", 0);
        setField(term102648, term102648.getClass(), "_valueHandler", null);
        setField(term102648, term102648.getClass(), "_typeHandler", null);
        setBooleanField(term102648, term102648.getClass(), "_asStatic", false);
        setField(term102647, term102647.getClass(), "_keyType", term102648);
        setField(term102649, term102649.getClass(), "_referencedType", null);
        setField(term102649, term102649.getClass(), "_superClass", null);
        setField(term102649, term102649.getClass(), "_superInterfaces", null);
        setField(term102649, term102649.getClass(), "_bindings", null);
        setField(term102649, term102649.getClass(), "_canonicalName", null);
        setField(term102649, term102649.getClass(), "_class", null);
        setIntField(term102649, term102649.getClass(), "_hash", 0);
        setField(term102649, term102649.getClass(), "_valueHandler", null);
        setField(term102649, term102649.getClass(), "_typeHandler", null);
        setBooleanField(term102649, term102649.getClass(), "_asStatic", false);
        setField(term102647, term102647.getClass(), "_valueType", term102649);
        setField(term102647, term102647.getClass(), "_superClass", null);
        setField(term102647, term102647.getClass(), "_superInterfaces", null);
        setField(term102650, term102650.getClass(), "_names", term102651);
        setField(term102650, term102650.getClass(), "_types", term102652);
        setField(term102650, term102650.getClass(), "_unboundVariables", null);
        setIntField(term102650, term102650.getClass(), "_hashCode", 1);
        setField(term102647, term102647.getClass(), "_bindings", term102650);
        setField(term102647, term102647.getClass(), "_canonicalName", null);
        setField(term102647, term102647.getClass(), "_class", term102653);
        setIntField(term102647, term102647.getClass(), "_hash", -66569544);
        setField(term102647, term102647.getClass(), "_valueHandler", null);
        setField(term102647, term102647.getClass(), "_typeHandler", null);
        setBooleanField(term102647, term102647.getClass(), "_asStatic", false);
        term102672 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term102672, term102672.getClass(), "_componentType", null);
        setField(term102672, term102672.getClass(), "_emptyArray", null);
        setField(term102672, term102672.getClass(), "_superClass", null);
        setField(term102672, term102672.getClass(), "_superInterfaces", null);
        setField(term102672, term102672.getClass(), "_bindings", null);
        setField(term102672, term102672.getClass(), "_canonicalName", null);
        setField(term102672, term102672.getClass(), "_class", null);
        setIntField(term102672, term102672.getClass(), "_hash", 0);
        setField(term102672, term102672.getClass(), "_valueHandler", null);
        setField(term102672, term102672.getClass(), "_typeHandler", null);
        setBooleanField(term102672, term102672.getClass(), "_asStatic", false);
        term102673 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term102673, term102673.getClass(), "_referencedType", null);
        setField(term102673, term102673.getClass(), "_superClass", null);
        setField(term102673, term102673.getClass(), "_superInterfaces", null);
        setField(term102673, term102673.getClass(), "_bindings", null);
        setField(term102673, term102673.getClass(), "_canonicalName", null);
        setField(term102673, term102673.getClass(), "_class", null);
        setIntField(term102673, term102673.getClass(), "_hash", 0);
        setField(term102673, term102673.getClass(), "_valueHandler", null);
        setField(term102673, term102673.getClass(), "_typeHandler", null);
        setBooleanField(term102673, term102673.getClass(), "_asStatic", false);
        term102674 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.MapType");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[5] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[6] = Class.forName("java.lang.Object");
        argTypes[7] = Class.forName("java.lang.Object");
        argTypes[8] = boolean.class;
        Object[] args = new Object[9];
        args[0] = term101222;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term101318;
        args[5] = term101422;
        args[6] = null;
        args[7] = null;
        args[8] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term102647));
        assertTrue(recursiveEquals(term101222, term102672));
        assertTrue(recursiveEquals(term101318, null));
        assertTrue(recursiveEquals(term101422, false));
    }

};


