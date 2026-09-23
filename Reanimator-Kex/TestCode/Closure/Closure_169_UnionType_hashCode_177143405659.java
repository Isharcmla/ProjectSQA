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
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class UnionType_hashCode_177143405659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1344;
     Object term7641;

    public UnionType_hashCode_177143405659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1345 = new ArrayList();
        ((ArrayList) term1345).add((Object)null);
        ((ArrayList) term1345).add((Object)null);
        ((ArrayList) term1345).add((Object)null);
        ((ArrayList) term1345).add((Object)null);
        ((ArrayList) term1345).add((Object)null);
        ((ArrayList) term1345).add((Object)null);
        HashMap term1354 = new HashMap();
        HashMap term1363 = new HashMap();
        Set<Object> term7656 =  ((Map) term1363).keySet();
        HashSet term1362 = new HashSet((Collection<? extends Object>) term7656);
        HashMap term1370 = new HashMap();
        Set<Object> term7657 =  ((Map) term1370).keySet();
        HashSet term1369 = new HashSet((Collection<? extends Object>) term7657);
        HashMap term1377 = new HashMap();
        Set<Object> term7658 =  ((Map) term1377).keySet();
        HashSet term1376 = new HashSet((Collection<? extends Object>) term7658);
        HashMap term1382 = new HashMap();
        HashMap term1390 = new HashMap();
        HashMap term1395 = new HashMap();
        term1344 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term1352 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1353 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term1344, term1344.getClass(), "alternates", term1345);
        setIntField(term1344, term1344.getClass(), "hashcode", -375014958);
        setBooleanField(term1344, term1344.getClass(), "resolved", true);
        setField(term1344, term1344.getClass(), "resolveResult", null);
        setBooleanField(term1344, term1344.getClass(), "inTemplatedCheckVisit", false);
        setField(term1352, term1352.getClass(), "reporter", null);
        setField(term1352, term1352.getClass(), "nativeTypes", term1353);
        setField(term1352, term1352.getClass(), "namesToTypes", term1354);
        setField(term1352, term1352.getClass(), "namespaces", term1362);
        setField(term1352, term1352.getClass(), "nonNullableTypeNames", term1369);
        setField(term1352, term1352.getClass(), "forwardDeclaredTypes", term1376);
        setField(term1352, term1352.getClass(), "typesIndexedByProperty", term1382);
        setField(term1352, term1352.getClass(), "eachRefTypeIndexedByProperty", term1390);
        setField(term1352, term1352.getClass(), "greatestSubtypeByProperty", term1395);
        setField(term1352, term1352.getClass(), "interfaceToImplementors", null);
        setField(term1352, term1352.getClass(), "unresolvedNamedTypes", null);
        setField(term1352, term1352.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1352, term1352.getClass(), "lastGeneration", false);
        setField(term1352, term1352.getClass(), "templateTypes", null);
        setBooleanField(term1352, term1352.getClass(), "tolerateUndefinedValues", false);
        setField(term1352, term1352.getClass(), "resolveMode", null);
        setField(term1344, term1344.getClass(), "registry", term1352);
        ArrayList term7642 = new ArrayList();
        ((ArrayList) term7642).add((Object)null);
        ((ArrayList) term7642).add((Object)null);
        ((ArrayList) term7642).add((Object)null);
        ((ArrayList) term7642).add((Object)null);
        ((ArrayList) term7642).add((Object)null);
        ((ArrayList) term7642).add((Object)null);
        HashMap term7646 = new HashMap();
        HashMap term7648 = new HashMap();
        Set<Object> term7659 =  ((Map) term7648).keySet();
        HashSet term7647 = new HashSet((Collection<? extends Object>) term7659);
        HashMap term7650 = new HashMap();
        Set<Object> term7660 =  ((Map) term7650).keySet();
        HashSet term7649 = new HashSet((Collection<? extends Object>) term7660);
        HashMap term7652 = new HashMap();
        Set<Object> term7661 =  ((Map) term7652).keySet();
        HashSet term7651 = new HashSet((Collection<? extends Object>) term7661);
        HashMap term7653 = new HashMap();
        HashMap term7654 = new HashMap();
        HashMap term7655 = new HashMap();
        term7641 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term7644 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term7645 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term7641, term7641.getClass(), "alternates", term7642);
        setIntField(term7641, term7641.getClass(), "hashcode", -375014958);
        setBooleanField(term7641, term7641.getClass(), "resolved", true);
        setField(term7641, term7641.getClass(), "resolveResult", null);
        setBooleanField(term7641, term7641.getClass(), "inTemplatedCheckVisit", false);
        setField(term7644, term7644.getClass(), "reporter", null);
        setField(term7644, term7644.getClass(), "nativeTypes", term7645);
        setField(term7644, term7644.getClass(), "namesToTypes", term7646);
        setField(term7644, term7644.getClass(), "namespaces", term7647);
        setField(term7644, term7644.getClass(), "nonNullableTypeNames", term7649);
        setField(term7644, term7644.getClass(), "forwardDeclaredTypes", term7651);
        setField(term7644, term7644.getClass(), "typesIndexedByProperty", term7653);
        setField(term7644, term7644.getClass(), "eachRefTypeIndexedByProperty", term7654);
        setField(term7644, term7644.getClass(), "greatestSubtypeByProperty", term7655);
        setField(term7644, term7644.getClass(), "interfaceToImplementors", null);
        setField(term7644, term7644.getClass(), "unresolvedNamedTypes", null);
        setField(term7644, term7644.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term7644, term7644.getClass(), "lastGeneration", false);
        setField(term7644, term7644.getClass(), "templateTypes", null);
        setBooleanField(term7644, term7644.getClass(), "tolerateUndefinedValues", false);
        setField(term7644, term7644.getClass(), "resolveMode", null);
        setField(term7641, term7641.getClass(), "registry", term7644);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term1344, args);
        assertTrue(recursiveEquals(term1344, term7641));
        assertTrue(recursiveEquals(retValue, -375014958));
    }

};


