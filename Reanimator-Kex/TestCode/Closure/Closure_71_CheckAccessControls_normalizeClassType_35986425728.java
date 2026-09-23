package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class CheckAccessControls_normalizeClassType_35986425728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term561;
     Object term4430;

    public CheckAccessControls_normalizeClassType_35986425728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term565 = new HashMap();
        HashMap term572 = new HashMap();
        Set<Object> term4444 =  ((Map) term572).keySet();
        HashSet term571 = new HashSet((Collection<? extends Object>) term4444);
        HashMap term578 = new HashMap();
        Set<Object> term4445 =  ((Map) term578).keySet();
        HashSet term577 = new HashSet((Collection<? extends Object>) term4445);
        HashMap term584 = new HashMap();
        Set<Object> term4446 =  ((Map) term584).keySet();
        HashSet term583 = new HashSet((Collection<? extends Object>) term4446);
        HashMap term589 = new HashMap();
        HashMap term595 = new HashMap();
        HashMap term600 = new HashMap();
        term561 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        Object term562 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term563 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term564 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        setField(term561, term561.getClass(), "compiler", null);
        setField(term562, term562.getClass(), "compiler", null);
        setField(term563, term563.getClass(), "reporter", null);
        setField(term563, term563.getClass(), "nativeTypes", term564);
        setField(term563, term563.getClass(), "namesToTypes", term565);
        setField(term563, term563.getClass(), "namespaces", term571);
        setField(term563, term563.getClass(), "nonNullableTypeNames", term577);
        setField(term563, term563.getClass(), "forwardDeclaredTypes", term583);
        setField(term563, term563.getClass(), "typesIndexedByProperty", term589);
        setField(term563, term563.getClass(), "eachRefTypeIndexedByProperty", term595);
        setField(term563, term563.getClass(), "greatestSubtypeByProperty", term600);
        setField(term563, term563.getClass(), "interfaceToImplementors", null);
        setField(term563, term563.getClass(), "unresolvedNamedTypes", null);
        setField(term563, term563.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term563, term563.getClass(), "lastGeneration", false);
        setField(term563, term563.getClass(), "templateTypeName", null);
        setField(term563, term563.getClass(), "templateType", null);
        setBooleanField(term563, term563.getClass(), "tolerateUndefinedValues", false);
        setField(term563, term563.getClass(), "resolveMode", null);
        setField(term562, term562.getClass(), "typeRegistry", term563);
        setField(term562, term562.getClass(), "allValueTypes", null);
        setBooleanField(term562, term562.getClass(), "shouldReport", false);
        setField(term562, term562.getClass(), "nullOrUndefined", null);
        setField(term562, term562.getClass(), "mismatches", null);
        setField(term561, term561.getClass(), "validator", term562);
        setIntField(term561, term561.getClass(), "deprecatedDepth", -1547384488);
        setIntField(term561, term561.getClass(), "methodDepth", 1442160736);
        setField(term561, term561.getClass(), "currentClass", null);
        setField(term561, term561.getClass(), "initializedConstantProperties", null);
        HashMap term4434 = new HashMap();
        HashMap term4436 = new HashMap();
        Set<Object> term4447 =  ((Map) term4436).keySet();
        HashSet term4435 = new HashSet((Collection<? extends Object>) term4447);
        HashMap term4438 = new HashMap();
        Set<Object> term4448 =  ((Map) term4438).keySet();
        HashSet term4437 = new HashSet((Collection<? extends Object>) term4448);
        HashMap term4440 = new HashMap();
        Set<Object> term4449 =  ((Map) term4440).keySet();
        HashSet term4439 = new HashSet((Collection<? extends Object>) term4449);
        HashMap term4441 = new HashMap();
        HashMap term4442 = new HashMap();
        HashMap term4443 = new HashMap();
        term4430 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        Object term4431 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term4432 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term4433 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        setField(term4430, term4430.getClass(), "compiler", null);
        setField(term4431, term4431.getClass(), "compiler", null);
        setField(term4432, term4432.getClass(), "reporter", null);
        setField(term4432, term4432.getClass(), "nativeTypes", term4433);
        setField(term4432, term4432.getClass(), "namesToTypes", term4434);
        setField(term4432, term4432.getClass(), "namespaces", term4435);
        setField(term4432, term4432.getClass(), "nonNullableTypeNames", term4437);
        setField(term4432, term4432.getClass(), "forwardDeclaredTypes", term4439);
        setField(term4432, term4432.getClass(), "typesIndexedByProperty", term4441);
        setField(term4432, term4432.getClass(), "eachRefTypeIndexedByProperty", term4442);
        setField(term4432, term4432.getClass(), "greatestSubtypeByProperty", term4443);
        setField(term4432, term4432.getClass(), "interfaceToImplementors", null);
        setField(term4432, term4432.getClass(), "unresolvedNamedTypes", null);
        setField(term4432, term4432.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term4432, term4432.getClass(), "lastGeneration", false);
        setField(term4432, term4432.getClass(), "templateTypeName", null);
        setField(term4432, term4432.getClass(), "templateType", null);
        setBooleanField(term4432, term4432.getClass(), "tolerateUndefinedValues", false);
        setField(term4432, term4432.getClass(), "resolveMode", null);
        setField(term4431, term4431.getClass(), "typeRegistry", term4432);
        setField(term4431, term4431.getClass(), "allValueTypes", null);
        setBooleanField(term4431, term4431.getClass(), "shouldReport", false);
        setField(term4431, term4431.getClass(), "nullOrUndefined", null);
        setField(term4431, term4431.getClass(), "mismatches", null);
        setField(term4430, term4430.getClass(), "validator", term4431);
        setIntField(term4430, term4430.getClass(), "deprecatedDepth", -1547384488);
        setIntField(term4430, term4430.getClass(), "methodDepth", 1442160736);
        setField(term4430, term4430.getClass(), "currentClass", null);
        setField(term4430, term4430.getClass(), "initializedConstantProperties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "normalizeClassType", argTypes, term561, args);
        assertTrue(recursiveEquals(term561, term4430));
        assertTrue(recursiveEquals(retValue, null));
    }

};


