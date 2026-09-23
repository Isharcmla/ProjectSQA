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

public class JSTypeRegistry_shouldTolerateUndefinedValues_10881608388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term665;
     Object term479238;

    public JSTypeRegistry_shouldTolerateUndefinedValues_10881608388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term667 = new HashMap();
        HashMap term677 = new HashMap();
        Set<Object> term479250 =  ((Map) term677).keySet();
        HashSet term676 = new HashSet((Collection<? extends Object>) term479250);
        HashMap term696 = new HashMap();
        Set<Object> term479251 =  ((Map) term696).keySet();
        HashSet term695 = new HashSet((Collection<? extends Object>) term479251);
        HashMap term713 = new HashMap();
        Set<Object> term479252 =  ((Map) term713).keySet();
        HashSet term712 = new HashSet((Collection<? extends Object>) term479252);
        HashMap term733 = new HashMap();
        HashMap term748 = new HashMap();
        HashMap term753 = new HashMap();
        term665 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term666 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        setField(term665, term665.getClass(), "reporter", null);
        setField(term665, term665.getClass(), "nativeTypes", term666);
        setField(term665, term665.getClass(), "namesToTypes", term667);
        setField(term665, term665.getClass(), "namespaces", term676);
        setField(term665, term665.getClass(), "nonNullableTypeNames", term695);
        setField(term665, term665.getClass(), "forwardDeclaredTypes", term712);
        setField(term665, term665.getClass(), "typesIndexedByProperty", term733);
        setField(term665, term665.getClass(), "eachRefTypeIndexedByProperty", term748);
        setField(term665, term665.getClass(), "greatestSubtypeByProperty", term753);
        setField(term665, term665.getClass(), "interfaceToImplementors", null);
        setField(term665, term665.getClass(), "unresolvedNamedTypes", null);
        setField(term665, term665.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term665, term665.getClass(), "lastGeneration", false);
        setField(term665, term665.getClass(), "templateTypeName", null);
        setField(term665, term665.getClass(), "templateType", null);
        setBooleanField(term665, term665.getClass(), "tolerateUndefinedValues", false);
        setField(term665, term665.getClass(), "resolveMode", null);
        HashMap term479240 = new HashMap();
        HashMap term479242 = new HashMap();
        Set<Object> term479253 =  ((Map) term479242).keySet();
        HashSet term479241 = new HashSet((Collection<? extends Object>) term479253);
        HashMap term479244 = new HashMap();
        Set<Object> term479254 =  ((Map) term479244).keySet();
        HashSet term479243 = new HashSet((Collection<? extends Object>) term479254);
        HashMap term479246 = new HashMap();
        Set<Object> term479255 =  ((Map) term479246).keySet();
        HashSet term479245 = new HashSet((Collection<? extends Object>) term479255);
        HashMap term479247 = new HashMap();
        HashMap term479248 = new HashMap();
        HashMap term479249 = new HashMap();
        term479238 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term479239 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        setField(term479238, term479238.getClass(), "reporter", null);
        setField(term479238, term479238.getClass(), "nativeTypes", term479239);
        setField(term479238, term479238.getClass(), "namesToTypes", term479240);
        setField(term479238, term479238.getClass(), "namespaces", term479241);
        setField(term479238, term479238.getClass(), "nonNullableTypeNames", term479243);
        setField(term479238, term479238.getClass(), "forwardDeclaredTypes", term479245);
        setField(term479238, term479238.getClass(), "typesIndexedByProperty", term479247);
        setField(term479238, term479238.getClass(), "eachRefTypeIndexedByProperty", term479248);
        setField(term479238, term479238.getClass(), "greatestSubtypeByProperty", term479249);
        setField(term479238, term479238.getClass(), "interfaceToImplementors", null);
        setField(term479238, term479238.getClass(), "unresolvedNamedTypes", null);
        setField(term479238, term479238.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term479238, term479238.getClass(), "lastGeneration", false);
        setField(term479238, term479238.getClass(), "templateTypeName", null);
        setField(term479238, term479238.getClass(), "templateType", null);
        setBooleanField(term479238, term479238.getClass(), "tolerateUndefinedValues", false);
        setField(term479238, term479238.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "shouldTolerateUndefinedValues", argTypes, term665, args);
        assertTrue(recursiveEquals(term665, term479238));
    }

};


