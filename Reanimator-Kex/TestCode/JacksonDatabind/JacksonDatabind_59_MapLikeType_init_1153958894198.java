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

public class MapLikeType_init_1153958894198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80093;
     Object term80197;
     Object term80303;
     Object term80770;
     Object term80795;
     Object term80796;
     Object term80797;

    public MapLikeType_init_1153958894198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term80057 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJInt");
        Object term80021 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term80021, term80021.getClass(), "_class", term80057);
        term80093 = Class.forName((String) "java.util.zip.CRC32");
        term80197 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term80197, term80197.getClass(), "_hash", 0);
        term80303 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setIntField(term80303, term80303.getClass(), "_hash", 0);
        Class<? extends Object> term80776 = Class.forName((String) "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor");
        term80770 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term80771 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term80772 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term80773 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term80774 = (Object[]) newArray("java.lang.String", 0);
        Object[] term80775 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term80771, term80771.getClass(), "_referencedType", null);
        setField(term80771, term80771.getClass(), "_anchorType", null);
        setField(term80771, term80771.getClass(), "_superClass", null);
        setField(term80771, term80771.getClass(), "_superInterfaces", null);
        setField(term80771, term80771.getClass(), "_bindings", null);
        setField(term80771, term80771.getClass(), "_canonicalName", null);
        setField(term80771, term80771.getClass(), "_class", null);
        setIntField(term80771, term80771.getClass(), "_hash", 0);
        setField(term80771, term80771.getClass(), "_valueHandler", null);
        setField(term80771, term80771.getClass(), "_typeHandler", null);
        setBooleanField(term80771, term80771.getClass(), "_asStatic", false);
        setField(term80770, term80770.getClass(), "_keyType", term80771);
        setField(term80772, term80772.getClass(), "_elementType", null);
        setField(term80772, term80772.getClass(), "_superClass", null);
        setField(term80772, term80772.getClass(), "_superInterfaces", null);
        setField(term80772, term80772.getClass(), "_bindings", null);
        setField(term80772, term80772.getClass(), "_canonicalName", null);
        setField(term80772, term80772.getClass(), "_class", null);
        setIntField(term80772, term80772.getClass(), "_hash", 0);
        setField(term80772, term80772.getClass(), "_valueHandler", null);
        setField(term80772, term80772.getClass(), "_typeHandler", null);
        setBooleanField(term80772, term80772.getClass(), "_asStatic", false);
        setField(term80770, term80770.getClass(), "_valueType", term80772);
        setField(term80770, term80770.getClass(), "_superClass", null);
        setField(term80770, term80770.getClass(), "_superInterfaces", null);
        setField(term80773, term80773.getClass(), "_names", term80774);
        setField(term80773, term80773.getClass(), "_types", term80775);
        setField(term80773, term80773.getClass(), "_unboundVariables", null);
        setIntField(term80773, term80773.getClass(), "_hashCode", 1);
        setField(term80770, term80770.getClass(), "_bindings", term80773);
        setField(term80770, term80770.getClass(), "_canonicalName", null);
        setField(term80770, term80770.getClass(), "_class", term80776);
        setIntField(term80770, term80770.getClass(), "_hash", 140910391);
        setField(term80770, term80770.getClass(), "_valueHandler", null);
        setField(term80770, term80770.getClass(), "_typeHandler", null);
        setBooleanField(term80770, term80770.getClass(), "_asStatic", false);
        term80795 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term80795, term80795.getClass(), "_referencedType", null);
        setField(term80795, term80795.getClass(), "_anchorType", null);
        setField(term80795, term80795.getClass(), "_superClass", null);
        setField(term80795, term80795.getClass(), "_superInterfaces", null);
        setField(term80795, term80795.getClass(), "_bindings", null);
        setField(term80795, term80795.getClass(), "_canonicalName", null);
        setField(term80795, term80795.getClass(), "_class", null);
        setIntField(term80795, term80795.getClass(), "_hash", 0);
        setField(term80795, term80795.getClass(), "_valueHandler", null);
        setField(term80795, term80795.getClass(), "_typeHandler", null);
        setBooleanField(term80795, term80795.getClass(), "_asStatic", false);
        term80796 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term80796, term80796.getClass(), "_elementType", null);
        setField(term80796, term80796.getClass(), "_superClass", null);
        setField(term80796, term80796.getClass(), "_superInterfaces", null);
        setField(term80796, term80796.getClass(), "_bindings", null);
        setField(term80796, term80796.getClass(), "_canonicalName", null);
        setField(term80796, term80796.getClass(), "_class", null);
        setIntField(term80796, term80796.getClass(), "_hash", 0);
        setField(term80796, term80796.getClass(), "_valueHandler", null);
        setField(term80796, term80796.getClass(), "_typeHandler", null);
        setBooleanField(term80796, term80796.getClass(), "_asStatic", false);
        term80797 = Class.forName((String) "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.MapLikeType");
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
        args[0] = term80093;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term80197;
        args[5] = term80303;
        args[6] = null;
        args[7] = null;
        args[8] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term80770));
        assertTrue(recursiveEquals(term80093, term80795));
        assertTrue(recursiveEquals(term80197, null));
        assertTrue(recursiveEquals(term80303, false));
    }

};


