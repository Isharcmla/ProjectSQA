package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.Object;

public class JSType_getLeastSupertype_2082831967265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33614;
     Object term33822;
     Object term35246;
     Object term35248;
     Object term34497;

    public JSType_getLeastSupertype_2082831967265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33614 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        Object term33718 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term33614, term33614.getClass(), "registry", term33718);
        term33822 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        term35246 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        Object term35247 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term35246, term35246.getClass(), "resolved", false);
        setField(term35246, term35246.getClass(), "resolveResult", null);
        setBooleanField(term35246, term35246.getClass(), "inTemplatedCheckVisit", false);
        setField(term35247, term35247.getClass(), "reporter", null);
        setField(term35247, term35247.getClass(), "nativeTypes", null);
        setField(term35247, term35247.getClass(), "namesToTypes", null);
        setField(term35247, term35247.getClass(), "namespaces", null);
        setField(term35247, term35247.getClass(), "nonNullableTypeNames", null);
        setField(term35247, term35247.getClass(), "forwardDeclaredTypes", null);
        setField(term35247, term35247.getClass(), "typesIndexedByProperty", null);
        setField(term35247, term35247.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term35247, term35247.getClass(), "greatestSubtypeByProperty", null);
        setField(term35247, term35247.getClass(), "interfaceToImplementors", null);
        setField(term35247, term35247.getClass(), "unresolvedNamedTypes", null);
        setField(term35247, term35247.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term35247, term35247.getClass(), "lastGeneration", false);
        setField(term35247, term35247.getClass(), "templateTypes", null);
        setBooleanField(term35247, term35247.getClass(), "tolerateUndefinedValues", false);
        setField(term35247, term35247.getClass(), "resolveMode", null);
        setField(term35246, term35246.getClass(), "registry", term35247);
        term35248 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term35248, term35248.getClass(), "call", null);
        setField(term35248, term35248.getClass(), "prototypeSlot", null);
        setField(term35248, term35248.getClass(), "kind", null);
        setField(term35248, term35248.getClass(), "typeOfThis", null);
        setField(term35248, term35248.getClass(), "source", null);
        setField(term35248, term35248.getClass(), "implementedInterfaces", null);
        setField(term35248, term35248.getClass(), "extendedInterfaces", null);
        setField(term35248, term35248.getClass(), "subTypes", null);
        setField(term35248, term35248.getClass(), "templateTypeNames", null);
        setField(term35248, term35248.getClass(), "className", null);
        setField(term35248, term35248.getClass(), "properties", null);
        setBooleanField(term35248, term35248.getClass(), "nativeType", false);
        setField(term35248, term35248.getClass(), "implicitPrototypeFallback", null);
        setField(term35248, term35248.getClass(), "ownerFunction", null);
        setBooleanField(term35248, term35248.getClass(), "prettyPrint", false);
        setBooleanField(term35248, term35248.getClass(), "visited", false);
        setField(term35248, term35248.getClass(), "docInfo", null);
        setBooleanField(term35248, term35248.getClass(), "unknown", false);
        setBooleanField(term35248, term35248.getClass(), "resolved", false);
        setField(term35248, term35248.getClass(), "resolveResult", null);
        setBooleanField(term35248, term35248.getClass(), "inTemplatedCheckVisit", false);
        setField(term35248, term35248.getClass(), "registry", null);
        term34497 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        Object term34500 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term34497, term34497.getClass(), "resolved", false);
        setField(term34497, term34497.getClass(), "resolveResult", null);
        setBooleanField(term34497, term34497.getClass(), "inTemplatedCheckVisit", false);
        setField(term34500, term34500.getClass(), "reporter", null);
        setField(term34500, term34500.getClass(), "nativeTypes", null);
        setField(term34500, term34500.getClass(), "namesToTypes", null);
        setField(term34500, term34500.getClass(), "namespaces", null);
        setField(term34500, term34500.getClass(), "nonNullableTypeNames", null);
        setField(term34500, term34500.getClass(), "forwardDeclaredTypes", null);
        setField(term34500, term34500.getClass(), "typesIndexedByProperty", null);
        setField(term34500, term34500.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term34500, term34500.getClass(), "greatestSubtypeByProperty", null);
        setField(term34500, term34500.getClass(), "interfaceToImplementors", null);
        setField(term34500, term34500.getClass(), "unresolvedNamedTypes", null);
        setField(term34500, term34500.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term34500, term34500.getClass(), "lastGeneration", false);
        setField(term34500, term34500.getClass(), "templateTypes", null);
        setBooleanField(term34500, term34500.getClass(), "tolerateUndefinedValues", false);
        setField(term34500, term34500.getClass(), "resolveMode", null);
        setField(term34497, term34497.getClass(), "registry", term34500);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term33614;
        args[1] = term33822;
        Object retValue = callMethod(klass, "getLeastSupertype", argTypes, null, args);
        assertTrue(recursiveEquals(term33614, term35246));
        assertTrue(recursiveEquals(term33822, term35248));
        assertTrue(recursiveEquals(retValue, term34497));
    }

};


