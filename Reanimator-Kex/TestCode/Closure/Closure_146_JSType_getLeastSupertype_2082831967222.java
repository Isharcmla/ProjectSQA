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

public class JSType_getLeastSupertype_2082831967222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36202;
     Object term36398;
     Object term36780;
     Object term36781;
     Object term36782;
     Object term36784;
     Object term36785;
     Object term36773;

    public JSType_getLeastSupertype_2082831967222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36202 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        Object term36306 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term36202, term36202.getClass(), "registry", term36306);
        term36398 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        term36780 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setBooleanField(term36780, term36780.getClass(), "resolved", false);
        setField(term36780, term36780.getClass(), "resolveResult", null);
        setField(term36780, term36780.getClass(), "registry", null);
        term36781 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setBooleanField(term36781, term36781.getClass(), "resolved", false);
        setField(term36781, term36781.getClass(), "resolveResult", null);
        setField(term36781, term36781.getClass(), "registry", null);
        term36782 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        Object term36783 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term36782, term36782.getClass(), "resolved", false);
        setField(term36782, term36782.getClass(), "resolveResult", null);
        setField(term36783, term36783.getClass(), "reporter", null);
        setField(term36783, term36783.getClass(), "nativeTypes", null);
        setField(term36783, term36783.getClass(), "namesToTypes", null);
        setField(term36783, term36783.getClass(), "namespaces", null);
        setField(term36783, term36783.getClass(), "enumTypeNames", null);
        setField(term36783, term36783.getClass(), "forwardDeclaredTypes", null);
        setField(term36783, term36783.getClass(), "typesIndexedByProperty", null);
        setField(term36783, term36783.getClass(), "greatestSubtypeByProperty", null);
        setField(term36783, term36783.getClass(), "interfaceToImplementors", null);
        setField(term36783, term36783.getClass(), "unresolvedNamedTypes", null);
        setField(term36783, term36783.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term36783, term36783.getClass(), "lastGeneration", false);
        setField(term36783, term36783.getClass(), "templateTypeName", null);
        setField(term36783, term36783.getClass(), "templateType", null);
        setBooleanField(term36783, term36783.getClass(), "tolerateUndefinedValues", false);
        setField(term36783, term36783.getClass(), "resolveMode", null);
        setField(term36782, term36782.getClass(), "registry", term36783);
        term36784 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setBooleanField(term36784, term36784.getClass(), "resolved", false);
        setField(term36784, term36784.getClass(), "resolveResult", null);
        setField(term36784, term36784.getClass(), "registry", null);
        term36785 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        Object term36786 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term36785, term36785.getClass(), "resolved", false);
        setField(term36785, term36785.getClass(), "resolveResult", null);
        setField(term36786, term36786.getClass(), "reporter", null);
        setField(term36786, term36786.getClass(), "nativeTypes", null);
        setField(term36786, term36786.getClass(), "namesToTypes", null);
        setField(term36786, term36786.getClass(), "namespaces", null);
        setField(term36786, term36786.getClass(), "enumTypeNames", null);
        setField(term36786, term36786.getClass(), "forwardDeclaredTypes", null);
        setField(term36786, term36786.getClass(), "typesIndexedByProperty", null);
        setField(term36786, term36786.getClass(), "greatestSubtypeByProperty", null);
        setField(term36786, term36786.getClass(), "interfaceToImplementors", null);
        setField(term36786, term36786.getClass(), "unresolvedNamedTypes", null);
        setField(term36786, term36786.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term36786, term36786.getClass(), "lastGeneration", false);
        setField(term36786, term36786.getClass(), "templateTypeName", null);
        setField(term36786, term36786.getClass(), "templateType", null);
        setBooleanField(term36786, term36786.getClass(), "tolerateUndefinedValues", false);
        setField(term36786, term36786.getClass(), "resolveMode", null);
        setField(term36785, term36785.getClass(), "registry", term36786);
        term36773 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term36774 = newInstance(Class.forName("com.google.common.collect.RegularImmutableList"));
        Object[] term36777 = (Object[]) newArray("java.lang.Object", 2);
        Object term36637 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        Object term36639 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term36505 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setIntField(term36774, term36774.getClass(), "offset", 0);
        setIntField(term36774, term36774.getClass(), "size", 2);
        setBooleanField(term36637, term36637.getClass(), "resolved", false);
        setField(term36637, term36637.getClass(), "resolveResult", null);
        setField(term36639, term36639.getClass(), "reporter", null);
        setField(term36639, term36639.getClass(), "nativeTypes", null);
        setField(term36639, term36639.getClass(), "namesToTypes", null);
        setField(term36639, term36639.getClass(), "namespaces", null);
        setField(term36639, term36639.getClass(), "enumTypeNames", null);
        setField(term36639, term36639.getClass(), "forwardDeclaredTypes", null);
        setField(term36639, term36639.getClass(), "typesIndexedByProperty", null);
        setField(term36639, term36639.getClass(), "greatestSubtypeByProperty", null);
        setField(term36639, term36639.getClass(), "interfaceToImplementors", null);
        setField(term36639, term36639.getClass(), "unresolvedNamedTypes", null);
        setField(term36639, term36639.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term36639, term36639.getClass(), "lastGeneration", false);
        setField(term36639, term36639.getClass(), "templateTypeName", null);
        setField(term36639, term36639.getClass(), "templateType", null);
        setBooleanField(term36639, term36639.getClass(), "tolerateUndefinedValues", false);
        setField(term36639, term36639.getClass(), "resolveMode", null);
        setField(term36637, term36637.getClass(), "registry", term36639);
        setElement(term36777, 0, term36637);
        setBooleanField(term36505, term36505.getClass(), "resolved", false);
        setField(term36505, term36505.getClass(), "resolveResult", null);
        setField(term36505, term36505.getClass(), "registry", null);
        setElement(term36777, 1, term36505);
        setField(term36774, term36774.getClass(), "array", term36777);
        setField(term36774, term36774.getClass(), "asList", null);
        setField(term36773, term36773.getClass(), "alternates", term36774);
        setIntField(term36773, term36773.getClass(), "hashcode", 1807403608);
        setBooleanField(term36773, term36773.getClass(), "resolved", false);
        setField(term36773, term36773.getClass(), "resolveResult", null);
        setField(term36773, term36773.getClass(), "registry", term36639);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term36202;
        args[1] = term36398;
        Object retValue = callMethod(klass, "getLeastSupertype", argTypes, null, args);
        assertTrue(recursiveEquals(term36202, term36781));
        assertTrue(recursiveEquals(term36398, term36782));
        assertTrue(recursiveEquals(retValue, term36773));
    }

};


