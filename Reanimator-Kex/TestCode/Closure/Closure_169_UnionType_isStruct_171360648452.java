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

public class UnionType_isStruct_171360648452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term800;

    public UnionType_isStruct_171360648452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term801 = new ArrayList();
        ((ArrayList) term801).add((Object)null);
        ((ArrayList) term801).add((Object)null);
        ((ArrayList) term801).add((Object)null);
        ((ArrayList) term801).add((Object)null);
        ((ArrayList) term801).add((Object)null);
        ((ArrayList) term801).add((Object)null);
        HashMap term810 = new HashMap();
        HashMap term819 = new HashMap();
        Set<Object> term5933 =  ((Map) term819).keySet();
        HashSet term818 = new HashSet((Collection<? extends Object>) term5933);
        HashMap term826 = new HashMap();
        Set<Object> term5934 =  ((Map) term826).keySet();
        HashSet term825 = new HashSet((Collection<? extends Object>) term5934);
        HashMap term833 = new HashMap();
        Set<Object> term5935 =  ((Map) term833).keySet();
        HashSet term832 = new HashSet((Collection<? extends Object>) term5935);
        HashMap term839 = new HashMap();
        HashMap term847 = new HashMap();
        HashMap term852 = new HashMap();
        term800 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term808 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term809 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        setField(term800, term800.getClass(), "alternates", term801);
        setIntField(term800, term800.getClass(), "hashcode", 1375330971);
        setBooleanField(term800, term800.getClass(), "resolved", true);
        setField(term800, term800.getClass(), "resolveResult", null);
        setBooleanField(term800, term800.getClass(), "inTemplatedCheckVisit", true);
        setField(term808, term808.getClass(), "reporter", null);
        setField(term808, term808.getClass(), "nativeTypes", term809);
        setField(term808, term808.getClass(), "namesToTypes", term810);
        setField(term808, term808.getClass(), "namespaces", term818);
        setField(term808, term808.getClass(), "nonNullableTypeNames", term825);
        setField(term808, term808.getClass(), "forwardDeclaredTypes", term832);
        setField(term808, term808.getClass(), "typesIndexedByProperty", term839);
        setField(term808, term808.getClass(), "eachRefTypeIndexedByProperty", term847);
        setField(term808, term808.getClass(), "greatestSubtypeByProperty", term852);
        setField(term808, term808.getClass(), "interfaceToImplementors", null);
        setField(term808, term808.getClass(), "unresolvedNamedTypes", null);
        setField(term808, term808.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term808, term808.getClass(), "lastGeneration", false);
        setField(term808, term808.getClass(), "templateTypes", null);
        setBooleanField(term808, term808.getClass(), "tolerateUndefinedValues", false);
        setField(term808, term808.getClass(), "resolveMode", null);
        setField(term800, term800.getClass(), "registry", term808);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "isStruct", argTypes, term800, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


