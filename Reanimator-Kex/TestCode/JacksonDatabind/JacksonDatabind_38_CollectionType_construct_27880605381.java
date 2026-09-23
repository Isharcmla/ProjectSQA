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

public class CollectionType_construct_27880605381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28399;
     Object term28539;
     Object term28643;
     Object term29549;
     Object term29550;
     Object term29574;
     Object term29409;

    public CollectionType_construct_27880605381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28399 = Class.forName((String) "com.fasterxml.jackson.databind.type.SimpleType");
        term28539 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        term28643 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term28643, term28643.getClass(), "_hash", 0);
        term29549 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term29549, term29549.getClass(), "_referencedType", null);
        setField(term29549, term29549.getClass(), "_superClass", null);
        setField(term29549, term29549.getClass(), "_superInterfaces", null);
        setField(term29549, term29549.getClass(), "_bindings", null);
        setField(term29549, term29549.getClass(), "_canonicalName", null);
        setField(term29549, term29549.getClass(), "_class", null);
        setIntField(term29549, term29549.getClass(), "_hash", 0);
        setField(term29549, term29549.getClass(), "_valueHandler", null);
        setField(term29549, term29549.getClass(), "_typeHandler", null);
        setBooleanField(term29549, term29549.getClass(), "_asStatic", false);
        term29550 = Class.forName((String) "com.fasterxml.jackson.databind.type.SimpleType");
        term29574 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term29574, term29574.getClass(), "_names", null);
        setField(term29574, term29574.getClass(), "_types", null);
        setField(term29574, term29574.getClass(), "_unboundVariables", null);
        setIntField(term29574, term29574.getClass(), "_hashCode", 0);
        Class<? extends Object> term29412 = Class.forName((String) "com.fasterxml.jackson.databind.type.SimpleType");
        term29409 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term29406 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term29410 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term29406, term29406.getClass(), "_referencedType", null);
        setField(term29406, term29406.getClass(), "_superClass", null);
        setField(term29406, term29406.getClass(), "_superInterfaces", null);
        setField(term29406, term29406.getClass(), "_bindings", null);
        setField(term29406, term29406.getClass(), "_canonicalName", null);
        setField(term29406, term29406.getClass(), "_class", null);
        setIntField(term29406, term29406.getClass(), "_hash", 0);
        setField(term29406, term29406.getClass(), "_valueHandler", null);
        setField(term29406, term29406.getClass(), "_typeHandler", null);
        setBooleanField(term29406, term29406.getClass(), "_asStatic", false);
        setField(term29409, term29409.getClass(), "_elementType", term29406);
        setField(term29409, term29409.getClass(), "_superClass", null);
        setField(term29409, term29409.getClass(), "_superInterfaces", null);
        setField(term29410, term29410.getClass(), "_names", null);
        setField(term29410, term29410.getClass(), "_types", null);
        setField(term29410, term29410.getClass(), "_unboundVariables", null);
        setIntField(term29410, term29410.getClass(), "_hashCode", 0);
        setField(term29409, term29409.getClass(), "_bindings", term29410);
        setField(term29409, term29409.getClass(), "_canonicalName", null);
        setField(term29409, term29409.getClass(), "_class", term29412);
        setIntField(term29409, term29409.getClass(), "_hash", 896230817);
        setField(term29409, term29409.getClass(), "_valueHandler", null);
        setField(term29409, term29409.getClass(), "_typeHandler", null);
        setBooleanField(term29409, term29409.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.CollectionType");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[5];
        args[0] = term28399;
        args[1] = term28539;
        args[2] = null;
        args[3] = null;
        args[4] = term28643;
        Object retValue = callMethod(klass, "construct", argTypes, null, args);
        assertTrue(recursiveEquals(term28399, term29549));
        assertTrue(recursiveEquals(term28539, term29550));
        assertTrue(recursiveEquals(term28643, null));
        assertTrue(recursiveEquals(retValue, term29409));
    }

};


