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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class UnionType_getLeastSupertype_146096155154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term930;

    public UnionType_getLeastSupertype_146096155154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term931 = new ArrayList();
        ((ArrayList) term931).add((Object)null);
        HashMap term940 = new HashMap();
        HashMap term949 = new HashMap();
        Set<Object> term6507 =  ((Map) term949).keySet();
        HashSet term948 = new HashSet((Collection<? extends Object>) term6507);
        HashMap term956 = new HashMap();
        Set<Object> term6508 =  ((Map) term956).keySet();
        HashSet term955 = new HashSet((Collection<? extends Object>) term6508);
        HashMap term963 = new HashMap();
        Set<Object> term6509 =  ((Map) term963).keySet();
        HashSet term962 = new HashSet((Collection<? extends Object>) term6509);
        HashMap term969 = new HashMap();
        HashMap term977 = new HashMap();
        HashMap term982 = new HashMap();
        term930 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term938 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term939 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        setField(term930, term930.getClass(), "alternates", term931);
        setIntField(term930, term930.getClass(), "hashcode", -1772434990);
        setBooleanField(term930, term930.getClass(), "resolved", false);
        setField(term930, term930.getClass(), "resolveResult", null);
        setBooleanField(term930, term930.getClass(), "inTemplatedCheckVisit", false);
        setField(term938, term938.getClass(), "reporter", null);
        setField(term938, term938.getClass(), "nativeTypes", term939);
        setField(term938, term938.getClass(), "namesToTypes", term940);
        setField(term938, term938.getClass(), "namespaces", term948);
        setField(term938, term938.getClass(), "nonNullableTypeNames", term955);
        setField(term938, term938.getClass(), "forwardDeclaredTypes", term962);
        setField(term938, term938.getClass(), "typesIndexedByProperty", term969);
        setField(term938, term938.getClass(), "eachRefTypeIndexedByProperty", term977);
        setField(term938, term938.getClass(), "greatestSubtypeByProperty", term982);
        setField(term938, term938.getClass(), "interfaceToImplementors", null);
        setField(term938, term938.getClass(), "unresolvedNamedTypes", null);
        setField(term938, term938.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term938, term938.getClass(), "lastGeneration", false);
        setField(term938, term938.getClass(), "templateTypes", null);
        setBooleanField(term938, term938.getClass(), "tolerateUndefinedValues", false);
        setField(term938, term938.getClass(), "resolveMode", null);
        setField(term930, term930.getClass(), "registry", term938);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term930, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


