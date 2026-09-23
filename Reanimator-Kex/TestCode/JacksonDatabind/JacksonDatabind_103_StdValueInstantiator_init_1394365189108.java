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

public class StdValueInstantiator_init_1394365189108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41616;
     Object term42752;
     Object term42774;

    public StdValueInstantiator_init_1394365189108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term41502 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term41652 = Class.forName((String) "com.fasterxml.jackson.databind.util.RawValue");
        term41616 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term41616, term41616.getClass(), "_class", term41652);
        Class<? extends Object> term42755 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer");
        term42752 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term42752, term42752.getClass(), "_valueTypeDesc", "[collection-like type; class com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer, contains null]");
        setField(term42752, term42752.getClass(), "_valueClass", term42755);
        setField(term42752, term42752.getClass(), "_defaultCreator", null);
        setField(term42752, term42752.getClass(), "_withArgsCreator", null);
        setField(term42752, term42752.getClass(), "_constructorArguments", null);
        setField(term42752, term42752.getClass(), "_delegateType", null);
        setField(term42752, term42752.getClass(), "_delegateCreator", null);
        setField(term42752, term42752.getClass(), "_delegateArguments", null);
        setField(term42752, term42752.getClass(), "_arrayDelegateType", null);
        setField(term42752, term42752.getClass(), "_arrayDelegateCreator", null);
        setField(term42752, term42752.getClass(), "_arrayDelegateArguments", null);
        setField(term42752, term42752.getClass(), "_fromStringCreator", null);
        setField(term42752, term42752.getClass(), "_fromIntCreator", null);
        setField(term42752, term42752.getClass(), "_fromLongCreator", null);
        setField(term42752, term42752.getClass(), "_fromDoubleCreator", null);
        setField(term42752, term42752.getClass(), "_fromBooleanCreator", null);
        setField(term42752, term42752.getClass(), "_incompleteParameter", null);
        Class<? extends Object> term42775 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer");
        term42774 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term42774, term42774.getClass(), "_elementType", null);
        setField(term42774, term42774.getClass(), "_superClass", null);
        setField(term42774, term42774.getClass(), "_superInterfaces", null);
        setField(term42774, term42774.getClass(), "_bindings", null);
        setField(term42774, term42774.getClass(), "_canonicalName", null);
        setField(term42774, term42774.getClass(), "_class", term42775);
        setIntField(term42774, term42774.getClass(), "_hash", 0);
        setField(term42774, term42774.getClass(), "_valueHandler", null);
        setField(term42774, term42774.getClass(), "_typeHandler", null);
        setBooleanField(term42774, term42774.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term41616;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term42752));
        assertTrue(recursiveEquals(term41616, null));
    }

};


