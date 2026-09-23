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

public class UnionType_matchesStringContext_173309388042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131;

    public UnionType_matchesStringContext_173309388042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term132 = new ArrayList();
        ((ArrayList) term132).add((Object)null);
        HashMap term141 = new HashMap();
        HashMap term150 = new HashMap();
        Set<Object> term3514 =  ((Map) term150).keySet();
        HashSet term149 = new HashSet((Collection<? extends Object>) term3514);
        HashMap term157 = new HashMap();
        Set<Object> term3515 =  ((Map) term157).keySet();
        HashSet term156 = new HashSet((Collection<? extends Object>) term3515);
        HashMap term164 = new HashMap();
        Set<Object> term3516 =  ((Map) term164).keySet();
        HashSet term163 = new HashSet((Collection<? extends Object>) term3516);
        HashMap term170 = new HashMap();
        HashMap term178 = new HashMap();
        HashMap term183 = new HashMap();
        term131 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term139 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term140 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term131, term131.getClass(), "alternates", term132);
        setIntField(term131, term131.getClass(), "hashcode", 1622346318);
        setBooleanField(term131, term131.getClass(), "resolved", false);
        setField(term131, term131.getClass(), "resolveResult", null);
        setBooleanField(term131, term131.getClass(), "inTemplatedCheckVisit", false);
        setField(term139, term139.getClass(), "reporter", null);
        setField(term139, term139.getClass(), "nativeTypes", term140);
        setField(term139, term139.getClass(), "namesToTypes", term141);
        setField(term139, term139.getClass(), "namespaces", term149);
        setField(term139, term139.getClass(), "nonNullableTypeNames", term156);
        setField(term139, term139.getClass(), "forwardDeclaredTypes", term163);
        setField(term139, term139.getClass(), "typesIndexedByProperty", term170);
        setField(term139, term139.getClass(), "eachRefTypeIndexedByProperty", term178);
        setField(term139, term139.getClass(), "greatestSubtypeByProperty", term183);
        setField(term139, term139.getClass(), "interfaceToImplementors", null);
        setField(term139, term139.getClass(), "unresolvedNamedTypes", null);
        setField(term139, term139.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term139, term139.getClass(), "lastGeneration", false);
        setField(term139, term139.getClass(), "templateTypes", null);
        setBooleanField(term139, term139.getClass(), "tolerateUndefinedValues", false);
        setField(term139, term139.getClass(), "resolveMode", null);
        setField(term131, term131.getClass(), "registry", term139);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "matchesStringContext", argTypes, term131, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


