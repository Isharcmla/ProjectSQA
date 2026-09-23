package com.fasterxml.jackson.databind.jsontype.impl;

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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.jsontype.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class StdTypeResolverBuilder_buildTypeSerializer_565512902519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term613444;
     Object term613706;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term614902 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term614901 = ((Class) term614902).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term614901).setAccessible(true);
        Object enum665 = ((Field) term614901).get((Object) null);
        term613444 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term613444, term613444.getClass(), "_appliesFor", enum665);
        Class<? extends Object> term613834 = Class.forName((String) "java.lang.invoke.VarHandleDoubles$FieldStaticReadWrite");
        term613706 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term613798 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term613798, term613798.getClass(), "_class", term613834);
        setField(term613706, term613706.getClass(), "_referencedType", term613798);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term613706;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term613444, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


