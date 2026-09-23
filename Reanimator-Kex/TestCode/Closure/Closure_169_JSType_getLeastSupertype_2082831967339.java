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

public class JSType_getLeastSupertype_2082831967339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51056;
     Object term51256;
     Object term51965;
     Object term51967;
     Object term51957;

    public JSType_getLeastSupertype_2082831967339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51056 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        Object term51160 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term51056, term51056.getClass(), "registry", term51160);
        term51256 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        term51965 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        Object term51966 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term51965, term51965.getClass(), "resolved", false);
        setField(term51965, term51965.getClass(), "resolveResult", null);
        setBooleanField(term51965, term51965.getClass(), "inTemplatedCheckVisit", false);
        setField(term51966, term51966.getClass(), "reporter", null);
        setField(term51966, term51966.getClass(), "nativeTypes", null);
        setField(term51966, term51966.getClass(), "namesToTypes", null);
        setField(term51966, term51966.getClass(), "namespaces", null);
        setField(term51966, term51966.getClass(), "nonNullableTypeNames", null);
        setField(term51966, term51966.getClass(), "forwardDeclaredTypes", null);
        setField(term51966, term51966.getClass(), "typesIndexedByProperty", null);
        setField(term51966, term51966.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term51966, term51966.getClass(), "greatestSubtypeByProperty", null);
        setField(term51966, term51966.getClass(), "interfaceToImplementors", null);
        setField(term51966, term51966.getClass(), "unresolvedNamedTypes", null);
        setField(term51966, term51966.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term51966, term51966.getClass(), "lastGeneration", false);
        setField(term51966, term51966.getClass(), "templateTypes", null);
        setBooleanField(term51966, term51966.getClass(), "tolerateUndefinedValues", false);
        setField(term51966, term51966.getClass(), "resolveMode", null);
        setField(term51965, term51965.getClass(), "registry", term51966);
        term51967 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setBooleanField(term51967, term51967.getClass(), "resolved", false);
        setField(term51967, term51967.getClass(), "resolveResult", null);
        setBooleanField(term51967, term51967.getClass(), "inTemplatedCheckVisit", false);
        setField(term51967, term51967.getClass(), "registry", null);
        term51957 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term51958 = newInstance(Class.forName("com.google.common.collect.RegularImmutableList"));
        Object[] term51961 = (Object[]) newArray("java.lang.Object", 2);
        Object term51259 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        Object term51262 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term51265 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setIntField(term51958, term51958.getClass(), "offset", 0);
        setIntField(term51958, term51958.getClass(), "size", 2);
        setBooleanField(term51259, term51259.getClass(), "resolved", false);
        setField(term51259, term51259.getClass(), "resolveResult", null);
        setBooleanField(term51259, term51259.getClass(), "inTemplatedCheckVisit", false);
        setField(term51262, term51262.getClass(), "reporter", null);
        setField(term51262, term51262.getClass(), "nativeTypes", null);
        setField(term51262, term51262.getClass(), "namesToTypes", null);
        setField(term51262, term51262.getClass(), "namespaces", null);
        setField(term51262, term51262.getClass(), "nonNullableTypeNames", null);
        setField(term51262, term51262.getClass(), "forwardDeclaredTypes", null);
        setField(term51262, term51262.getClass(), "typesIndexedByProperty", null);
        setField(term51262, term51262.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term51262, term51262.getClass(), "greatestSubtypeByProperty", null);
        setField(term51262, term51262.getClass(), "interfaceToImplementors", null);
        setField(term51262, term51262.getClass(), "unresolvedNamedTypes", null);
        setField(term51262, term51262.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term51262, term51262.getClass(), "lastGeneration", false);
        setField(term51262, term51262.getClass(), "templateTypes", null);
        setBooleanField(term51262, term51262.getClass(), "tolerateUndefinedValues", false);
        setField(term51262, term51262.getClass(), "resolveMode", null);
        setField(term51259, term51259.getClass(), "registry", term51262);
        setElement(term51961, 0, term51259);
        setBooleanField(term51265, term51265.getClass(), "resolved", false);
        setField(term51265, term51265.getClass(), "resolveResult", null);
        setBooleanField(term51265, term51265.getClass(), "inTemplatedCheckVisit", false);
        setField(term51265, term51265.getClass(), "registry", null);
        setElement(term51961, 1, term51265);
        setField(term51958, term51958.getClass(), "array", term51961);
        setField(term51958, term51958.getClass(), "asList", null);
        setField(term51957, term51957.getClass(), "alternates", term51958);
        setIntField(term51957, term51957.getClass(), "hashcode", 168289106);
        setBooleanField(term51957, term51957.getClass(), "resolved", false);
        setField(term51957, term51957.getClass(), "resolveResult", null);
        setBooleanField(term51957, term51957.getClass(), "inTemplatedCheckVisit", false);
        setField(term51957, term51957.getClass(), "registry", term51262);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term51056;
        args[1] = term51256;
        Object retValue = callMethod(klass, "getLeastSupertype", argTypes, null, args);
        assertTrue(recursiveEquals(term51056, term51965));
        assertTrue(recursiveEquals(term51256, term51967));
        assertTrue(recursiveEquals(retValue, term51957));
    }

};


