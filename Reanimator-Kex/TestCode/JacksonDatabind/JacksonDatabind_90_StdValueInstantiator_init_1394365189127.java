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

public class StdValueInstantiator_init_1394365189127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57925;
     Object term58787;
     Object term58790;

    public StdValueInstantiator_init_1394365189127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term57805 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term58067 = Class.forName((String) "java.util.stream.Collector$Characteristics");
        term57925 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term58031 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term58031, term58031.getClass(), "_class", term58067);
        setField(term57925, term57925.getClass(), "_referencedType", term58031);
        term58787 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term58787, term58787.getClass(), "_valueTypeDesc", "[recursive type; com.fasterxml.jackson.databind.deser.DataFormatReaders$Match");
        setField(term58787, term58787.getClass(), "_valueClass", null);
        setField(term58787, term58787.getClass(), "_defaultCreator", null);
        setField(term58787, term58787.getClass(), "_withArgsCreator", null);
        setField(term58787, term58787.getClass(), "_constructorArguments", null);
        setField(term58787, term58787.getClass(), "_delegateType", null);
        setField(term58787, term58787.getClass(), "_delegateCreator", null);
        setField(term58787, term58787.getClass(), "_delegateArguments", null);
        setField(term58787, term58787.getClass(), "_arrayDelegateType", null);
        setField(term58787, term58787.getClass(), "_arrayDelegateCreator", null);
        setField(term58787, term58787.getClass(), "_arrayDelegateArguments", null);
        setField(term58787, term58787.getClass(), "_fromStringCreator", null);
        setField(term58787, term58787.getClass(), "_fromIntCreator", null);
        setField(term58787, term58787.getClass(), "_fromLongCreator", null);
        setField(term58787, term58787.getClass(), "_fromDoubleCreator", null);
        setField(term58787, term58787.getClass(), "_fromBooleanCreator", null);
        setField(term58787, term58787.getClass(), "_incompleteParameter", null);
        Class<? extends Object> term58792 = Class.forName((String) "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match");
        term58790 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term58791 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term58791, term58791.getClass(), "_elementType", null);
        setField(term58791, term58791.getClass(), "_superClass", null);
        setField(term58791, term58791.getClass(), "_superInterfaces", null);
        setField(term58791, term58791.getClass(), "_bindings", null);
        setField(term58791, term58791.getClass(), "_canonicalName", null);
        setField(term58791, term58791.getClass(), "_class", term58792);
        setIntField(term58791, term58791.getClass(), "_hash", 0);
        setField(term58791, term58791.getClass(), "_valueHandler", null);
        setField(term58791, term58791.getClass(), "_typeHandler", null);
        setBooleanField(term58791, term58791.getClass(), "_asStatic", false);
        setField(term58790, term58790.getClass(), "_referencedType", term58791);
        setField(term58790, term58790.getClass(), "_superClass", null);
        setField(term58790, term58790.getClass(), "_superInterfaces", null);
        setField(term58790, term58790.getClass(), "_bindings", null);
        setField(term58790, term58790.getClass(), "_canonicalName", null);
        setField(term58790, term58790.getClass(), "_class", null);
        setIntField(term58790, term58790.getClass(), "_hash", 0);
        setField(term58790, term58790.getClass(), "_valueHandler", null);
        setField(term58790, term58790.getClass(), "_typeHandler", null);
        setBooleanField(term58790, term58790.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term57925;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term58787));
        assertTrue(recursiveEquals(term57925, null));
    }

};


