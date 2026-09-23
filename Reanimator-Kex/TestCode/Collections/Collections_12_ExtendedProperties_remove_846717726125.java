package org.apache.commons.collections;

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
import static org.apache.commons.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ExtendedProperties_remove_846717726125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28892;
     Object term29141;
     Object term79094;
     Object term79136;

    public ExtendedProperties_remove_846717726125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term28898 = new ArrayList();
        ArrayList term28947 = new ArrayList();
        ((ArrayList) term28947).add("java.lang.Object@66640ac8");
        ((ArrayList) term28947).add("java.lang.Object@b9f7bc8");
        ((ArrayList) term28947).add("java.lang.Object@1d3130f1");
        HashMap term29126 = new HashMap();
        Set<Object> term79317 =  ((Map) term29126).keySet();
        HashSet term29125 = new HashSet((Collection<? extends Object>) term79317);
        HashMap term29132 = new HashMap();
        Set<Object> term79318 =  ((Map) term29132).keySet();
        HashSet term29131 = new HashSet((Collection<? extends Object>) term79318);
        ArrayList term29137 = new ArrayList();
        term28892 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term28893 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term28902 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term29031 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term29032 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term29061 = newInstance(Class.forName("java.lang.Object"));
        Object term29062 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term29090 = newInstance(Class.forName("java.lang.Object"));
        Object term29091 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term29120 = newInstance(Class.forName("java.lang.Object"));
        setField(term28893, term28893.getClass(), "defaults", null);
        setField(term28893, term28893.getClass(), "file", null);
        setField(term28893, term28893.getClass(), "basePath", null);
        setField(term28893, term28893.getClass(), "fileSeparator", "/");
        setBooleanField(term28893, term28893.getClass(), "isInitialized", false);
        setField(term28893, term28893.getClass(), "includePropertyName", null);
        setField(term28893, term28893.getClass(), "keysAsListed", term28898);
        setField(term28893, term28893.getClass(), "table", term28902);
        setIntField(term28893, term28893.getClass(), "count", 0);
        setIntField(term28893, term28893.getClass(), "threshold", 8);
        setFloatField(term28893, term28893.getClass(), "loadFactor", 0.75F);
        setIntField(term28893, term28893.getClass(), "modCount", 0);
        setField(term28893, term28893.getClass(), "keySet", null);
        setField(term28893, term28893.getClass(), "entrySet", null);
        setField(term28893, term28893.getClass(), "values", null);
        setField(term28892, term28892.getClass(), "defaults", term28893);
        setField(term28892, term28892.getClass(), "file", "SFqCrhEWLm");
        setField(term28892, term28892.getClass(), "basePath", "GZdcJyZntS");
        setField(term28892, term28892.getClass(), "fileSeparator", "/");
        setBooleanField(term28892, term28892.getClass(), "isInitialized", true);
        setField(term28892, term28892.getClass(), "includePropertyName", "OIHoJeysUi");
        setField(term28892, term28892.getClass(), "keysAsListed", term28947);
        setIntField(term29032, term29032.getClass(), "hash", -95375578);
        setField(term29032, term29032.getClass(), "key", "java.lang.Object@1d3130f1");
        setField(term29032, term29032.getClass(), "value", term29061);
        setField(term29032, term29032.getClass(), "next", null);
        setElement(term29031, 1, term29032);
        setIntField(term29062, term29062.getClass(), "hash", -510250366);
        setField(term29062, term29062.getClass(), "key", "java.lang.Object@b9f7bc8");
        setField(term29062, term29062.getClass(), "value", term29090);
        setField(term29062, term29062.getClass(), "next", null);
        setElement(term29031, 3, term29062);
        setIntField(term29091, term29091.getClass(), "hash", -2053106511);
        setField(term29091, term29091.getClass(), "key", "java.lang.Object@66640ac8");
        setField(term29091, term29091.getClass(), "value", term29120);
        setField(term29091, term29091.getClass(), "next", null);
        setElement(term29031, 8, term29091);
        setField(term28892, term28892.getClass(), "table", term29031);
        setIntField(term28892, term28892.getClass(), "count", -2014576102);
        setIntField(term28892, term28892.getClass(), "threshold", 8);
        setFloatField(term28892, term28892.getClass(), "loadFactor", 0.75F);
        setIntField(term28892, term28892.getClass(), "modCount", 1296895587);
        setField(term28892, term28892.getClass(), "keySet", term29125);
        setField(term28892, term28892.getClass(), "entrySet", term29131);
        setField(term28892, term28892.getClass(), "values", term29137);
        term29141 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term79098 = new ArrayList();
        ArrayList term79109 = new ArrayList();
        ((ArrayList) term79109).add("java.lang.Object@66640ac8");
        ((ArrayList) term79109).add("java.lang.Object@b9f7bc8");
        ((ArrayList) term79109).add("java.lang.Object@1d3130f1");
        HashMap term79131 = new HashMap();
        Set<Object> term79499 =  ((Map) term79131).keySet();
        HashSet term79130 = new HashSet((Collection<? extends Object>) term79499);
        HashMap term79133 = new HashMap();
        Set<Object> term79500 =  ((Map) term79133).keySet();
        HashSet term79132 = new HashSet((Collection<? extends Object>) term79500);
        ArrayList term79134 = new ArrayList();
        term79094 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term79095 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term79100 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term79117 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term79118 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term79121 = newInstance(Class.forName("java.lang.Object"));
        Object term79122 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term79125 = newInstance(Class.forName("java.lang.Object"));
        Object term79126 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term79129 = newInstance(Class.forName("java.lang.Object"));
        setField(term79095, term79095.getClass(), "defaults", null);
        setField(term79095, term79095.getClass(), "file", null);
        setField(term79095, term79095.getClass(), "basePath", null);
        setField(term79095, term79095.getClass(), "fileSeparator", "/");
        setBooleanField(term79095, term79095.getClass(), "isInitialized", false);
        setField(term79095, term79095.getClass(), "includePropertyName", null);
        setField(term79095, term79095.getClass(), "keysAsListed", term79098);
        setField(term79095, term79095.getClass(), "table", term79100);
        setIntField(term79095, term79095.getClass(), "count", 0);
        setIntField(term79095, term79095.getClass(), "threshold", 8);
        setFloatField(term79095, term79095.getClass(), "loadFactor", 0.75F);
        setIntField(term79095, term79095.getClass(), "modCount", 0);
        setField(term79095, term79095.getClass(), "keySet", null);
        setField(term79095, term79095.getClass(), "entrySet", null);
        setField(term79095, term79095.getClass(), "values", null);
        setField(term79094, term79094.getClass(), "defaults", term79095);
        setField(term79094, term79094.getClass(), "file", "SFqCrhEWLm");
        setField(term79094, term79094.getClass(), "basePath", "GZdcJyZntS");
        setField(term79094, term79094.getClass(), "fileSeparator", "/");
        setBooleanField(term79094, term79094.getClass(), "isInitialized", true);
        setField(term79094, term79094.getClass(), "includePropertyName", "OIHoJeysUi");
        setField(term79094, term79094.getClass(), "keysAsListed", term79109);
        setIntField(term79118, term79118.getClass(), "hash", -95375578);
        setField(term79118, term79118.getClass(), "key", "java.lang.Object@1d3130f1");
        setField(term79118, term79118.getClass(), "value", term79121);
        setField(term79118, term79118.getClass(), "next", null);
        setElement(term79117, 1, term79118);
        setIntField(term79122, term79122.getClass(), "hash", -510250366);
        setField(term79122, term79122.getClass(), "key", "java.lang.Object@b9f7bc8");
        setField(term79122, term79122.getClass(), "value", term79125);
        setField(term79122, term79122.getClass(), "next", null);
        setElement(term79117, 3, term79122);
        setIntField(term79126, term79126.getClass(), "hash", -2053106511);
        setField(term79126, term79126.getClass(), "key", "java.lang.Object@66640ac8");
        setField(term79126, term79126.getClass(), "value", term79129);
        setField(term79126, term79126.getClass(), "next", null);
        setElement(term79117, 8, term79126);
        setField(term79094, term79094.getClass(), "table", term79117);
        setIntField(term79094, term79094.getClass(), "count", -2014576102);
        setIntField(term79094, term79094.getClass(), "threshold", 8);
        setFloatField(term79094, term79094.getClass(), "loadFactor", 0.75F);
        setIntField(term79094, term79094.getClass(), "modCount", 1296895587);
        setField(term79094, term79094.getClass(), "keySet", term79130);
        setField(term79094, term79094.getClass(), "entrySet", term79132);
        setField(term79094, term79094.getClass(), "values", term79134);
        term79136 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term29141;
        Object retValue = callMethod(klass, "remove", argTypes, term28892, args);
        assertTrue(recursiveEquals(term28892, term79094));
        assertTrue(recursiveEquals(term29141, term79136));
        assertTrue(recursiveEquals(retValue, null));
    }

};


