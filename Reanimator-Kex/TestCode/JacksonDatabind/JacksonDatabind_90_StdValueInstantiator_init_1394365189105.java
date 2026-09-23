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

public class StdValueInstantiator_init_1394365189105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41242;
     Object term41308;
     Object term41311;

    public StdValueInstantiator_init_1394365189105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term41122 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        term41242 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        term41308 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term41308, term41308.getClass(), "_valueTypeDesc", "[recursive type; UNRESOLVED");
        setField(term41308, term41308.getClass(), "_valueClass", null);
        setField(term41308, term41308.getClass(), "_defaultCreator", null);
        setField(term41308, term41308.getClass(), "_withArgsCreator", null);
        setField(term41308, term41308.getClass(), "_constructorArguments", null);
        setField(term41308, term41308.getClass(), "_delegateType", null);
        setField(term41308, term41308.getClass(), "_delegateCreator", null);
        setField(term41308, term41308.getClass(), "_delegateArguments", null);
        setField(term41308, term41308.getClass(), "_arrayDelegateType", null);
        setField(term41308, term41308.getClass(), "_arrayDelegateCreator", null);
        setField(term41308, term41308.getClass(), "_arrayDelegateArguments", null);
        setField(term41308, term41308.getClass(), "_fromStringCreator", null);
        setField(term41308, term41308.getClass(), "_fromIntCreator", null);
        setField(term41308, term41308.getClass(), "_fromLongCreator", null);
        setField(term41308, term41308.getClass(), "_fromDoubleCreator", null);
        setField(term41308, term41308.getClass(), "_fromBooleanCreator", null);
        setField(term41308, term41308.getClass(), "_incompleteParameter", null);
        term41311 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term41311, term41311.getClass(), "_referencedType", null);
        setField(term41311, term41311.getClass(), "_superClass", null);
        setField(term41311, term41311.getClass(), "_superInterfaces", null);
        setField(term41311, term41311.getClass(), "_bindings", null);
        setField(term41311, term41311.getClass(), "_canonicalName", null);
        setField(term41311, term41311.getClass(), "_class", null);
        setIntField(term41311, term41311.getClass(), "_hash", 0);
        setField(term41311, term41311.getClass(), "_valueHandler", null);
        setField(term41311, term41311.getClass(), "_typeHandler", null);
        setBooleanField(term41311, term41311.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term41242;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term41308));
        assertTrue(recursiveEquals(term41242, null));
    }

};


