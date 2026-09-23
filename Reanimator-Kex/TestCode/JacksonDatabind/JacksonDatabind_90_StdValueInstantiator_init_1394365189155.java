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

public class StdValueInstantiator_init_1394365189155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93654;
     Object term96141;
     Object term96170;

    public StdValueInstantiator_init_1394365189155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term93550 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term93690 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<? extends Object> term93860 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$DelegatingKD");
        term93654 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term93824 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term93654, term93654.getClass(), "_class", term93690);
        setField(term93824, term93824.getClass(), "_canonicalName", null);
        setField(term93824, term93824.getClass(), "_class", term93860);
        setField(term93654, term93654.getClass(), "_referencedType", term93824);
        Class<? extends Object> term96144 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        term96141 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term96141, term96141.getClass(), "_valueTypeDesc", "[reference type, class com.fasterxml.jackson.databind.deser.std.StdValueInstantiator<com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer<[array type, component type: null]>]");
        setField(term96141, term96141.getClass(), "_valueClass", term96144);
        setField(term96141, term96141.getClass(), "_defaultCreator", null);
        setField(term96141, term96141.getClass(), "_withArgsCreator", null);
        setField(term96141, term96141.getClass(), "_constructorArguments", null);
        setField(term96141, term96141.getClass(), "_delegateType", null);
        setField(term96141, term96141.getClass(), "_delegateCreator", null);
        setField(term96141, term96141.getClass(), "_delegateArguments", null);
        setField(term96141, term96141.getClass(), "_arrayDelegateType", null);
        setField(term96141, term96141.getClass(), "_arrayDelegateCreator", null);
        setField(term96141, term96141.getClass(), "_arrayDelegateArguments", null);
        setField(term96141, term96141.getClass(), "_fromStringCreator", null);
        setField(term96141, term96141.getClass(), "_fromIntCreator", null);
        setField(term96141, term96141.getClass(), "_fromLongCreator", null);
        setField(term96141, term96141.getClass(), "_fromDoubleCreator", null);
        setField(term96141, term96141.getClass(), "_fromBooleanCreator", null);
        setField(term96141, term96141.getClass(), "_incompleteParameter", null);
        Class<? extends Object> term96172 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer");
        Class<? extends Object> term96191 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        term96170 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term96171 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term96171, term96171.getClass(), "_componentType", null);
        setField(term96171, term96171.getClass(), "_emptyArray", null);
        setField(term96171, term96171.getClass(), "_superClass", null);
        setField(term96171, term96171.getClass(), "_superInterfaces", null);
        setField(term96171, term96171.getClass(), "_bindings", null);
        setField(term96171, term96171.getClass(), "_canonicalName", null);
        setField(term96171, term96171.getClass(), "_class", term96172);
        setIntField(term96171, term96171.getClass(), "_hash", 0);
        setField(term96171, term96171.getClass(), "_valueHandler", null);
        setField(term96171, term96171.getClass(), "_typeHandler", null);
        setBooleanField(term96171, term96171.getClass(), "_asStatic", false);
        setField(term96170, term96170.getClass(), "_referencedType", term96171);
        setField(term96170, term96170.getClass(), "_anchorType", null);
        setField(term96170, term96170.getClass(), "_superClass", null);
        setField(term96170, term96170.getClass(), "_superInterfaces", null);
        setField(term96170, term96170.getClass(), "_bindings", null);
        setField(term96170, term96170.getClass(), "_canonicalName", null);
        setField(term96170, term96170.getClass(), "_class", term96191);
        setIntField(term96170, term96170.getClass(), "_hash", 0);
        setField(term96170, term96170.getClass(), "_valueHandler", null);
        setField(term96170, term96170.getClass(), "_typeHandler", null);
        setBooleanField(term96170, term96170.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term93654;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term96141));
        assertTrue(recursiveEquals(term93654, null));
    }

};


