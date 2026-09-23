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
import java.lang.String;

public class StdValueInstantiator_init_1394365189143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78793;
     Object term79619;
     Object term79622;

    public StdValueInstantiator_init_1394365189143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term78673 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term78949 = Class.forName((String) "java.util.stream.ReferencePipeline$11$1");
        term78793 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term78913 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term78913, term78913.getClass(), "_class", term78949);
        setField(term78793, term78793.getClass(), "_referencedType", term78913);
        term79619 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term79619, term79619.getClass(), "_valueTypeDesc", "[recursive type; com.fasterxml.jackson.annotation.JsonIdentityReference");
        setField(term79619, term79619.getClass(), "_valueClass", null);
        setField(term79619, term79619.getClass(), "_defaultCreator", null);
        setField(term79619, term79619.getClass(), "_withArgsCreator", null);
        setField(term79619, term79619.getClass(), "_constructorArguments", null);
        setField(term79619, term79619.getClass(), "_delegateType", null);
        setField(term79619, term79619.getClass(), "_delegateCreator", null);
        setField(term79619, term79619.getClass(), "_delegateArguments", null);
        setField(term79619, term79619.getClass(), "_arrayDelegateType", null);
        setField(term79619, term79619.getClass(), "_arrayDelegateCreator", null);
        setField(term79619, term79619.getClass(), "_arrayDelegateArguments", null);
        setField(term79619, term79619.getClass(), "_fromStringCreator", null);
        setField(term79619, term79619.getClass(), "_fromIntCreator", null);
        setField(term79619, term79619.getClass(), "_fromLongCreator", null);
        setField(term79619, term79619.getClass(), "_fromDoubleCreator", null);
        setField(term79619, term79619.getClass(), "_fromBooleanCreator", null);
        setField(term79619, term79619.getClass(), "_incompleteParameter", null);
        Class<? extends Object> term79624 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonIdentityReference");
        term79622 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term79623 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term79623, term79623.getClass(), "_referencedType", null);
        setField(term79623, term79623.getClass(), "_superClass", null);
        setField(term79623, term79623.getClass(), "_superInterfaces", null);
        setField(term79623, term79623.getClass(), "_bindings", null);
        setField(term79623, term79623.getClass(), "_canonicalName", null);
        setField(term79623, term79623.getClass(), "_class", term79624);
        setIntField(term79623, term79623.getClass(), "_hash", 0);
        setField(term79623, term79623.getClass(), "_valueHandler", null);
        setField(term79623, term79623.getClass(), "_typeHandler", null);
        setBooleanField(term79623, term79623.getClass(), "_asStatic", false);
        setField(term79622, term79622.getClass(), "_referencedType", term79623);
        setField(term79622, term79622.getClass(), "_superClass", null);
        setField(term79622, term79622.getClass(), "_superInterfaces", null);
        setField(term79622, term79622.getClass(), "_bindings", null);
        setField(term79622, term79622.getClass(), "_canonicalName", null);
        setField(term79622, term79622.getClass(), "_class", null);
        setIntField(term79622, term79622.getClass(), "_hash", 0);
        setField(term79622, term79622.getClass(), "_valueHandler", null);
        setField(term79622, term79622.getClass(), "_typeHandler", null);
        setBooleanField(term79622, term79622.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term78793;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term79619));
        assertTrue(recursiveEquals(term78793, null));
    }

};


