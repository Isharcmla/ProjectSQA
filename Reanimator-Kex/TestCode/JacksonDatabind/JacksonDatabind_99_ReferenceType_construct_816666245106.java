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

public class ReferenceType_construct_816666245106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32545;
     Object term32685;
     Object term32791;
     Object term33083;
     Object term33084;
     Object term33108;

    public ReferenceType_construct_816666245106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32545 = Class.forName((String) "com.fasterxml.jackson.databind.type.TypeBindings");
        term32685 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        term32791 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setIntField(term32791, term32791.getClass(), "_hash", 0);
        term33083 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term33083, term33083.getClass(), "_elementType", null);
        setField(term33083, term33083.getClass(), "_superClass", null);
        setField(term33083, term33083.getClass(), "_superInterfaces", null);
        setField(term33083, term33083.getClass(), "_bindings", null);
        setField(term33083, term33083.getClass(), "_canonicalName", null);
        setField(term33083, term33083.getClass(), "_class", null);
        setIntField(term33083, term33083.getClass(), "_hash", 0);
        setField(term33083, term33083.getClass(), "_valueHandler", null);
        setField(term33083, term33083.getClass(), "_typeHandler", null);
        setBooleanField(term33083, term33083.getClass(), "_asStatic", false);
        term33084 = Class.forName((String) "com.fasterxml.jackson.databind.type.TypeBindings");
        term33108 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term33108, term33108.getClass(), "_names", null);
        setField(term33108, term33108.getClass(), "_types", null);
        setField(term33108, term33108.getClass(), "_unboundVariables", null);
        setIntField(term33108, term33108.getClass(), "_hashCode", 0);
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
        args[0] = term32545;
        args[1] = term32685;
        args[2] = null;
        args[3] = null;
        args[4] = term32791;
        callMethod(klass, "construct", argTypes, null, args);
        assertTrue(recursiveEquals(term32545, term33083));
        assertTrue(recursiveEquals(term32685, term33084));
        assertTrue(recursiveEquals(term32791, null));
    }

};


