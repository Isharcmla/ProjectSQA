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

public class ReferenceType_construct_816666245100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26944;
     Object term27040;
     Object term29092;
     Object term29093;

    public ReferenceType_construct_816666245100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26944 = Class.forName((String) "java.util.stream.AbstractShortCircuitTask");
        term27040 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setIntField(term27040, term27040.getClass(), "_hash", 0);
        term29092 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term29092, term29092.getClass(), "_componentType", null);
        setField(term29092, term29092.getClass(), "_emptyArray", null);
        setField(term29092, term29092.getClass(), "_superClass", null);
        setField(term29092, term29092.getClass(), "_superInterfaces", null);
        setField(term29092, term29092.getClass(), "_bindings", null);
        setField(term29092, term29092.getClass(), "_canonicalName", null);
        setField(term29092, term29092.getClass(), "_class", null);
        setIntField(term29092, term29092.getClass(), "_hash", 0);
        setField(term29092, term29092.getClass(), "_valueHandler", null);
        setField(term29092, term29092.getClass(), "_typeHandler", null);
        setBooleanField(term29092, term29092.getClass(), "_asStatic", false);
        term29093 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter$SerializeExceptFilter");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.ReferenceType");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[5];
        args[0] = term26944;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term27040;
        callMethod(klass, "construct", argTypes, null, args);
        assertTrue(recursiveEquals(term26944, term29092));
        assertTrue(recursiveEquals(term27040, null));
    }

};


