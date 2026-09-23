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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class JSTypeRegistry_getErrorReporter_70672526587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term577;
     Object term479177;

    public JSTypeRegistry_getErrorReporter_70672526587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term579 = new HashMap();
        HashMap term589 = new HashMap();
        Set<Object> term479190 =  ((Map) term589).keySet();
        HashSet term588 = new HashSet((Collection<? extends Object>) term479190);
        HashMap term606 = new HashMap();
        Set<Object> term479191 =  ((Map) term606).keySet();
        HashSet term605 = new HashSet((Collection<? extends Object>) term479191);
        HashMap term617 = new HashMap();
        Set<Object> term479192 =  ((Map) term617).keySet();
        HashSet term616 = new HashSet((Collection<? extends Object>) term479192);
        HashMap term631 = new HashMap();
        HashMap term646 = new HashMap();
        HashMap term651 = new HashMap();
        term577 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term578 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term577, term577.getClass(), "reporter", null);
        setField(term577, term577.getClass(), "nativeTypes", term578);
        setField(term577, term577.getClass(), "namesToTypes", term579);
        setField(term577, term577.getClass(), "namespaces", term588);
        setField(term577, term577.getClass(), "nonNullableTypeNames", term605);
        setField(term577, term577.getClass(), "forwardDeclaredTypes", term616);
        setField(term577, term577.getClass(), "typesIndexedByProperty", term631);
        setField(term577, term577.getClass(), "eachRefTypeIndexedByProperty", term646);
        setField(term577, term577.getClass(), "greatestSubtypeByProperty", term651);
        setField(term577, term577.getClass(), "interfaceToImplementors", null);
        setField(term577, term577.getClass(), "unresolvedNamedTypes", null);
        setField(term577, term577.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term577, term577.getClass(), "lastGeneration", false);
        setField(term577, term577.getClass(), "templateTypeName", null);
        setField(term577, term577.getClass(), "templateType", null);
        setBooleanField(term577, term577.getClass(), "tolerateUndefinedValues", false);
        setField(term577, term577.getClass(), "resolveMode", null);
        HashMap term479179 = new HashMap();
        HashMap term479181 = new HashMap();
        Set<Object> term479193 =  ((Map) term479181).keySet();
        HashSet term479180 = new HashSet((Collection<? extends Object>) term479193);
        HashMap term479183 = new HashMap();
        Set<Object> term479194 =  ((Map) term479183).keySet();
        HashSet term479182 = new HashSet((Collection<? extends Object>) term479194);
        HashMap term479185 = new HashMap();
        Set<Object> term479195 =  ((Map) term479185).keySet();
        HashSet term479184 = new HashSet((Collection<? extends Object>) term479195);
        HashMap term479186 = new HashMap();
        HashMap term479187 = new HashMap();
        HashMap term479188 = new HashMap();
        term479177 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term479178 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term479177, term479177.getClass(), "reporter", null);
        setField(term479177, term479177.getClass(), "nativeTypes", term479178);
        setField(term479177, term479177.getClass(), "namesToTypes", term479179);
        setField(term479177, term479177.getClass(), "namespaces", term479180);
        setField(term479177, term479177.getClass(), "nonNullableTypeNames", term479182);
        setField(term479177, term479177.getClass(), "forwardDeclaredTypes", term479184);
        setField(term479177, term479177.getClass(), "typesIndexedByProperty", term479186);
        setField(term479177, term479177.getClass(), "eachRefTypeIndexedByProperty", term479187);
        setField(term479177, term479177.getClass(), "greatestSubtypeByProperty", term479188);
        setField(term479177, term479177.getClass(), "interfaceToImplementors", null);
        setField(term479177, term479177.getClass(), "unresolvedNamedTypes", null);
        setField(term479177, term479177.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term479177, term479177.getClass(), "lastGeneration", false);
        setField(term479177, term479177.getClass(), "templateTypeName", null);
        setField(term479177, term479177.getClass(), "templateType", null);
        setBooleanField(term479177, term479177.getClass(), "tolerateUndefinedValues", false);
        setField(term479177, term479177.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getErrorReporter", argTypes, term577, args);
        assertTrue(recursiveEquals(term577, term479177));
        assertTrue(recursiveEquals(retValue, null));
    }

};


