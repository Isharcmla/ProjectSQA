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

public class StdValueInstantiator_init_1394365189169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117467;
     Object term118560;
     Object term118582;

    public StdValueInstantiator_init_1394365189169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term117363 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term117503 = Class.forName((String) "org.vorpal.research.kex.intrinsics.UnknownIntrinsics");
        term117467 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term117661 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term117467, term117467.getClass(), "_class", term117503);
        setField(term117661, term117661.getClass(), "_canonicalName", "");
        setField(term117467, term117467.getClass(), "_referencedType", term117661);
        Class<? extends Object> term118563 = Class.forName((String) "org.vorpal.research.kex.intrinsics.UnknownIntrinsics");
        term118560 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term118560, term118560.getClass(), "_valueTypeDesc", "[reference type, class org.vorpal.research.kex.intrinsics.UnknownIntrinsics<<[recursive type; UNRESOLVED>]");
        setField(term118560, term118560.getClass(), "_valueClass", term118563);
        setField(term118560, term118560.getClass(), "_defaultCreator", null);
        setField(term118560, term118560.getClass(), "_withArgsCreator", null);
        setField(term118560, term118560.getClass(), "_constructorArguments", null);
        setField(term118560, term118560.getClass(), "_delegateType", null);
        setField(term118560, term118560.getClass(), "_delegateCreator", null);
        setField(term118560, term118560.getClass(), "_delegateArguments", null);
        setField(term118560, term118560.getClass(), "_arrayDelegateType", null);
        setField(term118560, term118560.getClass(), "_arrayDelegateCreator", null);
        setField(term118560, term118560.getClass(), "_arrayDelegateArguments", null);
        setField(term118560, term118560.getClass(), "_fromStringCreator", null);
        setField(term118560, term118560.getClass(), "_fromIntCreator", null);
        setField(term118560, term118560.getClass(), "_fromLongCreator", null);
        setField(term118560, term118560.getClass(), "_fromDoubleCreator", null);
        setField(term118560, term118560.getClass(), "_fromBooleanCreator", null);
        setField(term118560, term118560.getClass(), "_incompleteParameter", null);
        Class<? extends Object> term118586 = Class.forName((String) "org.vorpal.research.kex.intrinsics.UnknownIntrinsics");
        term118582 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term118583 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term118583, term118583.getClass(), "_referencedType", null);
        setField(term118583, term118583.getClass(), "_superClass", null);
        setField(term118583, term118583.getClass(), "_superInterfaces", null);
        setField(term118583, term118583.getClass(), "_bindings", null);
        setField(term118583, term118583.getClass(), "_canonicalName", "");
        setField(term118583, term118583.getClass(), "_class", null);
        setIntField(term118583, term118583.getClass(), "_hash", 0);
        setField(term118583, term118583.getClass(), "_valueHandler", null);
        setField(term118583, term118583.getClass(), "_typeHandler", null);
        setBooleanField(term118583, term118583.getClass(), "_asStatic", false);
        setField(term118582, term118582.getClass(), "_referencedType", term118583);
        setField(term118582, term118582.getClass(), "_anchorType", null);
        setField(term118582, term118582.getClass(), "_superClass", null);
        setField(term118582, term118582.getClass(), "_superInterfaces", null);
        setField(term118582, term118582.getClass(), "_bindings", null);
        setField(term118582, term118582.getClass(), "_canonicalName", null);
        setField(term118582, term118582.getClass(), "_class", term118586);
        setIntField(term118582, term118582.getClass(), "_hash", 0);
        setField(term118582, term118582.getClass(), "_valueHandler", null);
        setField(term118582, term118582.getClass(), "_typeHandler", null);
        setBooleanField(term118582, term118582.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term117467;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term118560));
        assertTrue(recursiveEquals(term117467, null));
    }

};


