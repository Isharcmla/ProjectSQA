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

public class JSType_getLeastSupertype_2082831967345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54510;
     Object term54710;
     Object term55535;
     Object term55537;
     Object term55527;

    public JSType_getLeastSupertype_2082831967345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54510 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        Object term54614 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term54510, term54510.getClass(), "registry", term54614);
        setBooleanField(term54510, term54510.getClass(), "inTemplatedCheckVisit", true);
        term54710 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setBooleanField(term54710, term54710.getClass(), "inTemplatedCheckVisit", false);
        term55535 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        Object term55536 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term55535, term55535.getClass(), "resolved", false);
        setField(term55535, term55535.getClass(), "resolveResult", null);
        setBooleanField(term55535, term55535.getClass(), "inTemplatedCheckVisit", true);
        setField(term55536, term55536.getClass(), "reporter", null);
        setField(term55536, term55536.getClass(), "nativeTypes", null);
        setField(term55536, term55536.getClass(), "namesToTypes", null);
        setField(term55536, term55536.getClass(), "namespaces", null);
        setField(term55536, term55536.getClass(), "nonNullableTypeNames", null);
        setField(term55536, term55536.getClass(), "forwardDeclaredTypes", null);
        setField(term55536, term55536.getClass(), "typesIndexedByProperty", null);
        setField(term55536, term55536.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term55536, term55536.getClass(), "greatestSubtypeByProperty", null);
        setField(term55536, term55536.getClass(), "interfaceToImplementors", null);
        setField(term55536, term55536.getClass(), "unresolvedNamedTypes", null);
        setField(term55536, term55536.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term55536, term55536.getClass(), "lastGeneration", false);
        setField(term55536, term55536.getClass(), "templateTypes", null);
        setBooleanField(term55536, term55536.getClass(), "tolerateUndefinedValues", false);
        setField(term55536, term55536.getClass(), "resolveMode", null);
        setField(term55535, term55535.getClass(), "registry", term55536);
        term55537 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setBooleanField(term55537, term55537.getClass(), "resolved", false);
        setField(term55537, term55537.getClass(), "resolveResult", null);
        setBooleanField(term55537, term55537.getClass(), "inTemplatedCheckVisit", false);
        setField(term55537, term55537.getClass(), "registry", null);
        term55527 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term55528 = newInstance(Class.forName("com.google.common.collect.RegularImmutableList"));
        Object[] term55531 = (Object[]) newArray("java.lang.Object", 2);
        Object term54829 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        Object term54832 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term54835 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setIntField(term55528, term55528.getClass(), "offset", 0);
        setIntField(term55528, term55528.getClass(), "size", 2);
        setBooleanField(term54829, term54829.getClass(), "resolved", false);
        setField(term54829, term54829.getClass(), "resolveResult", null);
        setBooleanField(term54829, term54829.getClass(), "inTemplatedCheckVisit", true);
        setField(term54832, term54832.getClass(), "reporter", null);
        setField(term54832, term54832.getClass(), "nativeTypes", null);
        setField(term54832, term54832.getClass(), "namesToTypes", null);
        setField(term54832, term54832.getClass(), "namespaces", null);
        setField(term54832, term54832.getClass(), "nonNullableTypeNames", null);
        setField(term54832, term54832.getClass(), "forwardDeclaredTypes", null);
        setField(term54832, term54832.getClass(), "typesIndexedByProperty", null);
        setField(term54832, term54832.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term54832, term54832.getClass(), "greatestSubtypeByProperty", null);
        setField(term54832, term54832.getClass(), "interfaceToImplementors", null);
        setField(term54832, term54832.getClass(), "unresolvedNamedTypes", null);
        setField(term54832, term54832.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term54832, term54832.getClass(), "lastGeneration", false);
        setField(term54832, term54832.getClass(), "templateTypes", null);
        setBooleanField(term54832, term54832.getClass(), "tolerateUndefinedValues", false);
        setField(term54832, term54832.getClass(), "resolveMode", null);
        setField(term54829, term54829.getClass(), "registry", term54832);
        setElement(term55531, 0, term54829);
        setBooleanField(term54835, term54835.getClass(), "resolved", false);
        setField(term54835, term54835.getClass(), "resolveResult", null);
        setBooleanField(term54835, term54835.getClass(), "inTemplatedCheckVisit", false);
        setField(term54835, term54835.getClass(), "registry", null);
        setElement(term55531, 1, term54835);
        setField(term55528, term55528.getClass(), "array", term55531);
        setField(term55528, term55528.getClass(), "asList", null);
        setField(term55527, term55527.getClass(), "alternates", term55528);
        setIntField(term55527, term55527.getClass(), "hashcode", -222559072);
        setBooleanField(term55527, term55527.getClass(), "resolved", false);
        setField(term55527, term55527.getClass(), "resolveResult", null);
        setBooleanField(term55527, term55527.getClass(), "inTemplatedCheckVisit", false);
        setField(term55527, term55527.getClass(), "registry", term54832);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term54510;
        args[1] = term54710;
        Object retValue = callMethod(klass, "getLeastSupertype", argTypes, null, args);
        assertTrue(recursiveEquals(term54510, term55535));
        assertTrue(recursiveEquals(term54710, term55537));
        assertTrue(recursiveEquals(retValue, term55527));
    }

};


