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

public class StdValueInstantiator_init_1394365189165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110079;
     Object term111160;
     Object term111187;
     Object term111215;

    public StdValueInstantiator_init_1394365189165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term109975 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term110115 = Class.forName((String) "com.fasterxml.jackson.databind.type.PlaceholderForType");
        term110079 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term110267 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term110079, term110079.getClass(), "_class", term110115);
        setField(term110267, term110267.getClass(), "_canonicalName", "");
        setField(term110079, term110079.getClass(), "_referencedType", term110267);
        Class<? extends Object> term111163 = Class.forName((String) "com.fasterxml.jackson.databind.type.PlaceholderForType");
        term111160 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term111160, term111160.getClass(), "_valueTypeDesc", "[reference type, class com.fasterxml.jackson.databind.type.PlaceholderForType<<$1>]");
        setField(term111160, term111160.getClass(), "_valueClass", term111163);
        setField(term111160, term111160.getClass(), "_defaultCreator", null);
        setField(term111160, term111160.getClass(), "_withArgsCreator", null);
        setField(term111160, term111160.getClass(), "_constructorArguments", null);
        setField(term111160, term111160.getClass(), "_delegateType", null);
        setField(term111160, term111160.getClass(), "_delegateCreator", null);
        setField(term111160, term111160.getClass(), "_delegateArguments", null);
        setField(term111160, term111160.getClass(), "_arrayDelegateType", null);
        setField(term111160, term111160.getClass(), "_arrayDelegateCreator", null);
        setField(term111160, term111160.getClass(), "_arrayDelegateArguments", null);
        setField(term111160, term111160.getClass(), "_fromStringCreator", null);
        setField(term111160, term111160.getClass(), "_fromIntCreator", null);
        setField(term111160, term111160.getClass(), "_fromLongCreator", null);
        setField(term111160, term111160.getClass(), "_fromDoubleCreator", null);
        setField(term111160, term111160.getClass(), "_fromBooleanCreator", null);
        setField(term111160, term111160.getClass(), "_incompleteParameter", null);
        Class<? extends Object> term111191 = Class.forName((String) "com.fasterxml.jackson.databind.type.PlaceholderForType");
        term111187 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term111188 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setIntField(term111188, term111188.getClass(), "_ordinal", 0);
        setField(term111188, term111188.getClass(), "_actualType", null);
        setField(term111188, term111188.getClass(), "_superClass", null);
        setField(term111188, term111188.getClass(), "_superInterfaces", null);
        setField(term111188, term111188.getClass(), "_bindings", null);
        setField(term111188, term111188.getClass(), "_canonicalName", "");
        setField(term111188, term111188.getClass(), "_class", null);
        setIntField(term111188, term111188.getClass(), "_hash", 0);
        setField(term111188, term111188.getClass(), "_valueHandler", null);
        setField(term111188, term111188.getClass(), "_typeHandler", null);
        setBooleanField(term111188, term111188.getClass(), "_asStatic", false);
        setField(term111187, term111187.getClass(), "_referencedType", term111188);
        setField(term111187, term111187.getClass(), "_anchorType", null);
        setField(term111187, term111187.getClass(), "_superClass", null);
        setField(term111187, term111187.getClass(), "_superInterfaces", null);
        setField(term111187, term111187.getClass(), "_bindings", null);
        setField(term111187, term111187.getClass(), "_canonicalName", null);
        setField(term111187, term111187.getClass(), "_class", term111191);
        setIntField(term111187, term111187.getClass(), "_hash", 0);
        setField(term111187, term111187.getClass(), "_valueHandler", null);
        setField(term111187, term111187.getClass(), "_typeHandler", null);
        setBooleanField(term111187, term111187.getClass(), "_asStatic", false);
        term111215 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term111216 = (byte[]) newByteArray(16);
        setByteElement(term111216, 0, (byte) 36);
        setByteElement(term111216, 1, (byte) 49);
        setField(term111215, term111215.getClass(), "value", term111216);
        setByteField(term111215, term111215.getClass(), "coder", (byte) 0);
        setIntField(term111215, term111215.getClass(), "count", 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term110079;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term111160));
        assertTrue(recursiveEquals(term110079, term111215));
    }

};


