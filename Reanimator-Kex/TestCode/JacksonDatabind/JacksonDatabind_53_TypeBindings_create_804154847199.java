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

public class TypeBindings_create_804154847199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65962;
     Object term66466;
     Object term66462;

    public TypeBindings_create_804154847199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65962 = Class.forName((String) "java.lang.invoke.VarHandleShorts$FieldInstanceReadWrite");
        term66466 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase");
        term66462 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term66463 = (Object[]) newArray("java.lang.String", 0);
        Object[] term66464 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term66462, term66462.getClass(), "_names", term66463);
        setField(term66462, term66462.getClass(), "_types", term66464);
        setField(term66462, term66462.getClass(), "_unboundVariables", null);
        setIntField(term66462, term66462.getClass(), "_hashCode", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term65962;
        args[1] = null;
        Object retValue = callMethod(klass, "create", argTypes, null, args);
        assertTrue(recursiveEquals(term65962, term66466));
        assertTrue(recursiveEquals(retValue, term66462));
    }

};


