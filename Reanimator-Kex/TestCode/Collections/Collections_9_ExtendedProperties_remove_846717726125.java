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
     Object term78591;
     Object term78633;

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
        Set<Object> term78814 =  ((Map) term29126).keySet();
        HashSet term29125 = new HashSet((Collection<? extends Object>) term78814);
        HashMap term29132 = new HashMap();
        Set<Object> term78815 =  ((Map) term29132).keySet();
        HashSet term29131 = new HashSet((Collection<? extends Object>) term78815);
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
        ArrayList term78595 = new ArrayList();
        ArrayList term78606 = new ArrayList();
        ((ArrayList) term78606).add("java.lang.Object@66640ac8");
        ((ArrayList) term78606).add("java.lang.Object@b9f7bc8");
        ((ArrayList) term78606).add("java.lang.Object@1d3130f1");
        HashMap term78628 = new HashMap();
        Set<Object> term78996 =  ((Map) term78628).keySet();
        HashSet term78627 = new HashSet((Collection<? extends Object>) term78996);
        HashMap term78630 = new HashMap();
        Set<Object> term78997 =  ((Map) term78630).keySet();
        HashSet term78629 = new HashSet((Collection<? extends Object>) term78997);
        ArrayList term78631 = new ArrayList();
        term78591 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term78592 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term78597 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term78614 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term78615 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term78618 = newInstance(Class.forName("java.lang.Object"));
        Object term78619 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term78622 = newInstance(Class.forName("java.lang.Object"));
        Object term78623 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term78626 = newInstance(Class.forName("java.lang.Object"));
        setField(term78592, term78592.getClass(), "defaults", null);
        setField(term78592, term78592.getClass(), "file", null);
        setField(term78592, term78592.getClass(), "basePath", null);
        setField(term78592, term78592.getClass(), "fileSeparator", "/");
        setBooleanField(term78592, term78592.getClass(), "isInitialized", false);
        setField(term78592, term78592.getClass(), "includePropertyName", null);
        setField(term78592, term78592.getClass(), "keysAsListed", term78595);
        setField(term78592, term78592.getClass(), "table", term78597);
        setIntField(term78592, term78592.getClass(), "count", 0);
        setIntField(term78592, term78592.getClass(), "threshold", 8);
        setFloatField(term78592, term78592.getClass(), "loadFactor", 0.75F);
        setIntField(term78592, term78592.getClass(), "modCount", 0);
        setField(term78592, term78592.getClass(), "keySet", null);
        setField(term78592, term78592.getClass(), "entrySet", null);
        setField(term78592, term78592.getClass(), "values", null);
        setField(term78591, term78591.getClass(), "defaults", term78592);
        setField(term78591, term78591.getClass(), "file", "SFqCrhEWLm");
        setField(term78591, term78591.getClass(), "basePath", "GZdcJyZntS");
        setField(term78591, term78591.getClass(), "fileSeparator", "/");
        setBooleanField(term78591, term78591.getClass(), "isInitialized", true);
        setField(term78591, term78591.getClass(), "includePropertyName", "OIHoJeysUi");
        setField(term78591, term78591.getClass(), "keysAsListed", term78606);
        setIntField(term78615, term78615.getClass(), "hash", -95375578);
        setField(term78615, term78615.getClass(), "key", "java.lang.Object@1d3130f1");
        setField(term78615, term78615.getClass(), "value", term78618);
        setField(term78615, term78615.getClass(), "next", null);
        setElement(term78614, 1, term78615);
        setIntField(term78619, term78619.getClass(), "hash", -510250366);
        setField(term78619, term78619.getClass(), "key", "java.lang.Object@b9f7bc8");
        setField(term78619, term78619.getClass(), "value", term78622);
        setField(term78619, term78619.getClass(), "next", null);
        setElement(term78614, 3, term78619);
        setIntField(term78623, term78623.getClass(), "hash", -2053106511);
        setField(term78623, term78623.getClass(), "key", "java.lang.Object@66640ac8");
        setField(term78623, term78623.getClass(), "value", term78626);
        setField(term78623, term78623.getClass(), "next", null);
        setElement(term78614, 8, term78623);
        setField(term78591, term78591.getClass(), "table", term78614);
        setIntField(term78591, term78591.getClass(), "count", -2014576102);
        setIntField(term78591, term78591.getClass(), "threshold", 8);
        setFloatField(term78591, term78591.getClass(), "loadFactor", 0.75F);
        setIntField(term78591, term78591.getClass(), "modCount", 1296895587);
        setField(term78591, term78591.getClass(), "keySet", term78627);
        setField(term78591, term78591.getClass(), "entrySet", term78629);
        setField(term78591, term78591.getClass(), "values", term78631);
        term78633 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term29141;
        Object retValue = callMethod(klass, "remove", argTypes, term28892, args);
        assertTrue(recursiveEquals(term28892, term78591));
        assertTrue(recursiveEquals(term29141, term78633));
        assertTrue(recursiveEquals(retValue, null));
    }

};


