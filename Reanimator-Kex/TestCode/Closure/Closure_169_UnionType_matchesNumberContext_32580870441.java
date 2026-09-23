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

public class UnionType_matchesNumberContext_32580870441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66;

    public UnionType_matchesNumberContext_32580870441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term67 = new ArrayList();
        ((ArrayList) term67).add((Object)null);
        ((ArrayList) term67).add((Object)null);
        ((ArrayList) term67).add((Object)null);
        ((ArrayList) term67).add((Object)null);
        ((ArrayList) term67).add((Object)null);
        HashMap term76 = new HashMap();
        HashMap term85 = new HashMap();
        Set<Object> term3262 =  ((Map) term85).keySet();
        HashSet term84 = new HashSet((Collection<? extends Object>) term3262);
        HashMap term92 = new HashMap();
        Set<Object> term3263 =  ((Map) term92).keySet();
        HashSet term91 = new HashSet((Collection<? extends Object>) term3263);
        HashMap term99 = new HashMap();
        Set<Object> term3264 =  ((Map) term99).keySet();
        HashSet term98 = new HashSet((Collection<? extends Object>) term3264);
        HashMap term105 = new HashMap();
        HashMap term113 = new HashMap();
        HashMap term118 = new HashMap();
        term66 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term74 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term75 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        setField(term66, term66.getClass(), "alternates", term67);
        setIntField(term66, term66.getClass(), "hashcode", 1134449235);
        setBooleanField(term66, term66.getClass(), "resolved", true);
        setField(term66, term66.getClass(), "resolveResult", null);
        setBooleanField(term66, term66.getClass(), "inTemplatedCheckVisit", false);
        setField(term74, term74.getClass(), "reporter", null);
        setField(term74, term74.getClass(), "nativeTypes", term75);
        setField(term74, term74.getClass(), "namesToTypes", term76);
        setField(term74, term74.getClass(), "namespaces", term84);
        setField(term74, term74.getClass(), "nonNullableTypeNames", term91);
        setField(term74, term74.getClass(), "forwardDeclaredTypes", term98);
        setField(term74, term74.getClass(), "typesIndexedByProperty", term105);
        setField(term74, term74.getClass(), "eachRefTypeIndexedByProperty", term113);
        setField(term74, term74.getClass(), "greatestSubtypeByProperty", term118);
        setField(term74, term74.getClass(), "interfaceToImplementors", null);
        setField(term74, term74.getClass(), "unresolvedNamedTypes", null);
        setField(term74, term74.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term74, term74.getClass(), "lastGeneration", false);
        setField(term74, term74.getClass(), "templateTypes", null);
        setBooleanField(term74, term74.getClass(), "tolerateUndefinedValues", false);
        setField(term74, term74.getClass(), "resolveMode", null);
        setField(term66, term66.getClass(), "registry", term74);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "matchesNumberContext", argTypes, term66, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


