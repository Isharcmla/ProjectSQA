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

public class StdValueInstantiator_init_1394365189161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104214;
     Object term104980;
     Object term104983;

    public StdValueInstantiator_init_1394365189161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term104094 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term104364 = Class.forName((String) "java.util.concurrent.RunnableScheduledFuture");
        term104214 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term104328 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term104328, term104328.getClass(), "_class", term104364);
        setField(term104214, term104214.getClass(), "_referencedType", term104328);
        term104980 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term104980, term104980.getClass(), "_valueTypeDesc", "[recursive type; com.fasterxml.jackson.annotation.JacksonInject");
        setField(term104980, term104980.getClass(), "_valueClass", null);
        setField(term104980, term104980.getClass(), "_defaultCreator", null);
        setField(term104980, term104980.getClass(), "_withArgsCreator", null);
        setField(term104980, term104980.getClass(), "_constructorArguments", null);
        setField(term104980, term104980.getClass(), "_delegateType", null);
        setField(term104980, term104980.getClass(), "_delegateCreator", null);
        setField(term104980, term104980.getClass(), "_delegateArguments", null);
        setField(term104980, term104980.getClass(), "_arrayDelegateType", null);
        setField(term104980, term104980.getClass(), "_arrayDelegateCreator", null);
        setField(term104980, term104980.getClass(), "_arrayDelegateArguments", null);
        setField(term104980, term104980.getClass(), "_fromStringCreator", null);
        setField(term104980, term104980.getClass(), "_fromIntCreator", null);
        setField(term104980, term104980.getClass(), "_fromLongCreator", null);
        setField(term104980, term104980.getClass(), "_fromDoubleCreator", null);
        setField(term104980, term104980.getClass(), "_fromBooleanCreator", null);
        setField(term104980, term104980.getClass(), "_incompleteParameter", null);
        Class<? extends Object> term104985 = Class.forName((String) "com.fasterxml.jackson.annotation.JacksonInject");
        term104983 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term104984 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setIntField(term104984, term104984.getClass(), "_ordinal", 0);
        setField(term104984, term104984.getClass(), "_actualType", null);
        setField(term104984, term104984.getClass(), "_superClass", null);
        setField(term104984, term104984.getClass(), "_superInterfaces", null);
        setField(term104984, term104984.getClass(), "_bindings", null);
        setField(term104984, term104984.getClass(), "_canonicalName", null);
        setField(term104984, term104984.getClass(), "_class", term104985);
        setIntField(term104984, term104984.getClass(), "_hash", 0);
        setField(term104984, term104984.getClass(), "_valueHandler", null);
        setField(term104984, term104984.getClass(), "_typeHandler", null);
        setBooleanField(term104984, term104984.getClass(), "_asStatic", false);
        setField(term104983, term104983.getClass(), "_referencedType", term104984);
        setField(term104983, term104983.getClass(), "_superClass", null);
        setField(term104983, term104983.getClass(), "_superInterfaces", null);
        setField(term104983, term104983.getClass(), "_bindings", null);
        setField(term104983, term104983.getClass(), "_canonicalName", null);
        setField(term104983, term104983.getClass(), "_class", null);
        setIntField(term104983, term104983.getClass(), "_hash", 0);
        setField(term104983, term104983.getClass(), "_valueHandler", null);
        setField(term104983, term104983.getClass(), "_typeHandler", null);
        setBooleanField(term104983, term104983.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term104214;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term104980));
        assertTrue(recursiveEquals(term104214, null));
    }

};


