package com.fasterxml.jackson.databind.deser.std;

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
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.std.EqualityUtils.*;
import java.lang.Object;

public class AtomicReferenceDeserializer_init_42896733525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3579;
     Object term3585;
     Object term3587;

    public AtomicReferenceDeserializer_init_42896733525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3483 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        term3579 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        term3585 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        Object term3586 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term3586, term3586.getClass(), "_componentType", null);
        setField(term3586, term3586.getClass(), "_emptyArray", null);
        setField(term3586, term3586.getClass(), "_superClass", null);
        setField(term3586, term3586.getClass(), "_superInterfaces", null);
        setField(term3586, term3586.getClass(), "_bindings", null);
        setField(term3586, term3586.getClass(), "_canonicalName", null);
        setField(term3586, term3586.getClass(), "_class", null);
        setIntField(term3586, term3586.getClass(), "_hash", 0);
        setField(term3586, term3586.getClass(), "_valueHandler", null);
        setField(term3586, term3586.getClass(), "_typeHandler", null);
        setBooleanField(term3586, term3586.getClass(), "_asStatic", false);
        setField(term3585, term3585.getClass(), "_fullType", term3586);
        setField(term3585, term3585.getClass(), "_valueInstantiator", null);
        setField(term3585, term3585.getClass(), "_valueTypeDeserializer", null);
        setField(term3585, term3585.getClass(), "_valueDeserializer", null);
        setField(term3585, term3585.getClass(), "_valueClass", null);
        term3587 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term3587, term3587.getClass(), "_componentType", null);
        setField(term3587, term3587.getClass(), "_emptyArray", null);
        setField(term3587, term3587.getClass(), "_superClass", null);
        setField(term3587, term3587.getClass(), "_superInterfaces", null);
        setField(term3587, term3587.getClass(), "_bindings", null);
        setField(term3587, term3587.getClass(), "_canonicalName", null);
        setField(term3587, term3587.getClass(), "_class", null);
        setIntField(term3587, term3587.getClass(), "_hash", 0);
        setField(term3587, term3587.getClass(), "_valueHandler", null);
        setField(term3587, term3587.getClass(), "_typeHandler", null);
        setBooleanField(term3587, term3587.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        Object[] args = new Object[4];
        args[0] = term3579;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term3585));
        assertTrue(recursiveEquals(term3579, term3587));
    }

};


