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

public class UnionType_isUnknownType_118440535151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term735;

    public UnionType_isUnknownType_118440535151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term736 = new ArrayList();
        ((ArrayList) term736).add((Object)null);
        ((ArrayList) term736).add((Object)null);
        ((ArrayList) term736).add((Object)null);
        HashMap term745 = new HashMap();
        HashMap term754 = new HashMap();
        Set<Object> term5616 =  ((Map) term754).keySet();
        HashSet term753 = new HashSet((Collection<? extends Object>) term5616);
        HashMap term761 = new HashMap();
        Set<Object> term5617 =  ((Map) term761).keySet();
        HashSet term760 = new HashSet((Collection<? extends Object>) term5617);
        HashMap term768 = new HashMap();
        Set<Object> term5618 =  ((Map) term768).keySet();
        HashSet term767 = new HashSet((Collection<? extends Object>) term5618);
        HashMap term774 = new HashMap();
        HashMap term782 = new HashMap();
        HashMap term787 = new HashMap();
        term735 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term743 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term744 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        setField(term735, term735.getClass(), "alternates", term736);
        setIntField(term735, term735.getClass(), "hashcode", 1540719661);
        setBooleanField(term735, term735.getClass(), "resolved", true);
        setField(term735, term735.getClass(), "resolveResult", null);
        setBooleanField(term735, term735.getClass(), "inTemplatedCheckVisit", true);
        setField(term743, term743.getClass(), "reporter", null);
        setField(term743, term743.getClass(), "nativeTypes", term744);
        setField(term743, term743.getClass(), "namesToTypes", term745);
        setField(term743, term743.getClass(), "namespaces", term753);
        setField(term743, term743.getClass(), "nonNullableTypeNames", term760);
        setField(term743, term743.getClass(), "forwardDeclaredTypes", term767);
        setField(term743, term743.getClass(), "typesIndexedByProperty", term774);
        setField(term743, term743.getClass(), "eachRefTypeIndexedByProperty", term782);
        setField(term743, term743.getClass(), "greatestSubtypeByProperty", term787);
        setField(term743, term743.getClass(), "interfaceToImplementors", null);
        setField(term743, term743.getClass(), "unresolvedNamedTypes", null);
        setField(term743, term743.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term743, term743.getClass(), "lastGeneration", false);
        setField(term743, term743.getClass(), "templateTypes", null);
        setBooleanField(term743, term743.getClass(), "tolerateUndefinedValues", false);
        setField(term743, term743.getClass(), "resolveMode", null);
        setField(term735, term735.getClass(), "registry", term743);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "isUnknownType", argTypes, term735, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


