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

public class TypeBindings_init_352540534360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124940;
     Object term124941;
     Object term126403;
     Object term126410;
     Object term126411;

    public TypeBindings_init_352540534360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term125105 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term125105, term125105.getClass(), "_names", null);
        setField(term125105, term125105.getClass(), "_types", null);
        term124940 = (Object[]) newArray("java.lang.String", 4);
        term124941 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term125211 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term125307 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term125407 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term125511 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term125211, term125211.getClass(), "_hash", 0);
        setElement(term124941, 0, term125211);
        setIntField(term125307, term125307.getClass(), "_hash", 0);
        setElement(term124941, 1, term125307);
        setIntField(term125407, term125407.getClass(), "_hash", 0);
        setElement(term124941, 2, term125407);
        setElement(term124941, 3, term125511);
        term126403 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term126404 = (Object[]) newArray("java.lang.String", 4);
        Object[] term126405 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term126406 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term126407 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term126408 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term126409 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term126403, term126403.getClass(), "_names", term126404);
        setField(term126406, term126406.getClass(), "_elementType", null);
        setField(term126406, term126406.getClass(), "_superClass", null);
        setField(term126406, term126406.getClass(), "_superInterfaces", null);
        setField(term126406, term126406.getClass(), "_bindings", null);
        setField(term126406, term126406.getClass(), "_canonicalName", null);
        setField(term126406, term126406.getClass(), "_class", null);
        setIntField(term126406, term126406.getClass(), "_hash", 0);
        setField(term126406, term126406.getClass(), "_valueHandler", null);
        setField(term126406, term126406.getClass(), "_typeHandler", null);
        setBooleanField(term126406, term126406.getClass(), "_asStatic", false);
        setElement(term126405, 0, term126406);
        setField(term126407, term126407.getClass(), "_componentType", null);
        setField(term126407, term126407.getClass(), "_emptyArray", null);
        setField(term126407, term126407.getClass(), "_superClass", null);
        setField(term126407, term126407.getClass(), "_superInterfaces", null);
        setField(term126407, term126407.getClass(), "_bindings", null);
        setField(term126407, term126407.getClass(), "_canonicalName", null);
        setField(term126407, term126407.getClass(), "_class", null);
        setIntField(term126407, term126407.getClass(), "_hash", 0);
        setField(term126407, term126407.getClass(), "_valueHandler", null);
        setField(term126407, term126407.getClass(), "_typeHandler", null);
        setBooleanField(term126407, term126407.getClass(), "_asStatic", false);
        setElement(term126405, 1, term126407);
        setField(term126408, term126408.getClass(), "_keyType", null);
        setField(term126408, term126408.getClass(), "_valueType", null);
        setField(term126408, term126408.getClass(), "_superClass", null);
        setField(term126408, term126408.getClass(), "_superInterfaces", null);
        setField(term126408, term126408.getClass(), "_bindings", null);
        setField(term126408, term126408.getClass(), "_canonicalName", null);
        setField(term126408, term126408.getClass(), "_class", null);
        setIntField(term126408, term126408.getClass(), "_hash", 0);
        setField(term126408, term126408.getClass(), "_valueHandler", null);
        setField(term126408, term126408.getClass(), "_typeHandler", null);
        setBooleanField(term126408, term126408.getClass(), "_asStatic", false);
        setElement(term126405, 2, term126408);
        setField(term126409, term126409.getClass(), "_referencedType", null);
        setField(term126409, term126409.getClass(), "_superClass", null);
        setField(term126409, term126409.getClass(), "_superInterfaces", null);
        setField(term126409, term126409.getClass(), "_bindings", null);
        setField(term126409, term126409.getClass(), "_canonicalName", null);
        setField(term126409, term126409.getClass(), "_class", null);
        setIntField(term126409, term126409.getClass(), "_hash", 0);
        setField(term126409, term126409.getClass(), "_valueHandler", null);
        setField(term126409, term126409.getClass(), "_typeHandler", null);
        setBooleanField(term126409, term126409.getClass(), "_asStatic", false);
        setElement(term126405, 3, term126409);
        setField(term126403, term126403.getClass(), "_types", term126405);
        setField(term126403, term126403.getClass(), "_unboundVariables", null);
        setIntField(term126403, term126403.getClass(), "_hashCode", 1);
        term126410 = (Object[]) newArray("java.lang.String", 4);
        term126411 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term126412 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term126413 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term126414 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term126415 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term126412, term126412.getClass(), "_elementType", null);
        setField(term126412, term126412.getClass(), "_superClass", null);
        setField(term126412, term126412.getClass(), "_superInterfaces", null);
        setField(term126412, term126412.getClass(), "_bindings", null);
        setField(term126412, term126412.getClass(), "_canonicalName", null);
        setField(term126412, term126412.getClass(), "_class", null);
        setIntField(term126412, term126412.getClass(), "_hash", 0);
        setField(term126412, term126412.getClass(), "_valueHandler", null);
        setField(term126412, term126412.getClass(), "_typeHandler", null);
        setBooleanField(term126412, term126412.getClass(), "_asStatic", false);
        setElement(term126411, 0, term126412);
        setField(term126413, term126413.getClass(), "_componentType", null);
        setField(term126413, term126413.getClass(), "_emptyArray", null);
        setField(term126413, term126413.getClass(), "_superClass", null);
        setField(term126413, term126413.getClass(), "_superInterfaces", null);
        setField(term126413, term126413.getClass(), "_bindings", null);
        setField(term126413, term126413.getClass(), "_canonicalName", null);
        setField(term126413, term126413.getClass(), "_class", null);
        setIntField(term126413, term126413.getClass(), "_hash", 0);
        setField(term126413, term126413.getClass(), "_valueHandler", null);
        setField(term126413, term126413.getClass(), "_typeHandler", null);
        setBooleanField(term126413, term126413.getClass(), "_asStatic", false);
        setElement(term126411, 1, term126413);
        setField(term126414, term126414.getClass(), "_keyType", null);
        setField(term126414, term126414.getClass(), "_valueType", null);
        setField(term126414, term126414.getClass(), "_superClass", null);
        setField(term126414, term126414.getClass(), "_superInterfaces", null);
        setField(term126414, term126414.getClass(), "_bindings", null);
        setField(term126414, term126414.getClass(), "_canonicalName", null);
        setField(term126414, term126414.getClass(), "_class", null);
        setIntField(term126414, term126414.getClass(), "_hash", 0);
        setField(term126414, term126414.getClass(), "_valueHandler", null);
        setField(term126414, term126414.getClass(), "_typeHandler", null);
        setBooleanField(term126414, term126414.getClass(), "_asStatic", false);
        setElement(term126411, 2, term126414);
        setField(term126415, term126415.getClass(), "_referencedType", null);
        setField(term126415, term126415.getClass(), "_superClass", null);
        setField(term126415, term126415.getClass(), "_superInterfaces", null);
        setField(term126415, term126415.getClass(), "_bindings", null);
        setField(term126415, term126415.getClass(), "_canonicalName", null);
        setField(term126415, term126415.getClass(), "_class", null);
        setIntField(term126415, term126415.getClass(), "_hash", 0);
        setField(term126415, term126415.getClass(), "_valueHandler", null);
        setField(term126415, term126415.getClass(), "_typeHandler", null);
        setBooleanField(term126415, term126415.getClass(), "_asStatic", false);
        setElement(term126411, 3, term126415);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term124940;
        args[1] = term124941;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term126403));
        assertTrue(recursiveEquals(term124940, term126410));
        assertTrue(recursiveEquals(term124941, term126411));
    }

};


