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

public class ExtendedProperties_clearProperty_3423515382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2346;
     Object term13815;

    public ExtendedProperties_clearProperty_3423515382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2352 = new ArrayList();
        ArrayList term2401 = new ArrayList();
        HashMap term2419 = new HashMap();
        Set<Object> term13879 =  ((Map) term2419).keySet();
        HashSet term2418 = new HashSet((Collection<? extends Object>) term13879);
        HashMap term2425 = new HashMap();
        Set<Object> term13880 =  ((Map) term2425).keySet();
        HashSet term2424 = new HashSet((Collection<? extends Object>) term13880);
        ArrayList term2430 = new ArrayList();
        term2346 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term2347 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term2356 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term2405 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term2406 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term2408 = newInstance(Class.forName("java.lang.Object"));
        Object term2409 = newInstance(Class.forName("java.lang.Object"));
        Object term2410 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term2412 = newInstance(Class.forName("java.lang.Object"));
        Object term2413 = newInstance(Class.forName("java.lang.Object"));
        setField(term2347, term2347.getClass(), "defaults", null);
        setField(term2347, term2347.getClass(), "file", null);
        setField(term2347, term2347.getClass(), "basePath", null);
        setField(term2347, term2347.getClass(), "fileSeparator", "/");
        setBooleanField(term2347, term2347.getClass(), "isInitialized", false);
        setField(term2347, term2347.getClass(), "includePropertyName", null);
        setField(term2347, term2347.getClass(), "keysAsListed", term2352);
        setField(term2347, term2347.getClass(), "table", term2356);
        setIntField(term2347, term2347.getClass(), "count", 0);
        setIntField(term2347, term2347.getClass(), "threshold", 8);
        setFloatField(term2347, term2347.getClass(), "loadFactor", 0.75F);
        setIntField(term2347, term2347.getClass(), "modCount", 0);
        setField(term2347, term2347.getClass(), "keySet", null);
        setField(term2347, term2347.getClass(), "entrySet", null);
        setField(term2347, term2347.getClass(), "values", null);
        setField(term2346, term2346.getClass(), "defaults", term2347);
        setField(term2346, term2346.getClass(), "file", "hoicvmsovO");
        setField(term2346, term2346.getClass(), "basePath", "eqJfYWRaEL");
        setField(term2346, term2346.getClass(), "fileSeparator", "/");
        setBooleanField(term2346, term2346.getClass(), "isInitialized", false);
        setField(term2346, term2346.getClass(), "includePropertyName", "fhkbdRViHi");
        setField(term2346, term2346.getClass(), "keysAsListed", term2401);
        setIntField(term2406, term2406.getClass(), "hash", 1396778240);
        setField(term2406, term2406.getClass(), "key", term2408);
        setField(term2406, term2406.getClass(), "value", term2409);
        setField(term2406, term2406.getClass(), "next", null);
        setElement(term2405, 0, term2406);
        setIntField(term2410, term2410.getClass(), "hash", 1926635354);
        setField(term2410, term2410.getClass(), "key", term2412);
        setField(term2410, term2410.getClass(), "value", term2413);
        setField(term2410, term2410.getClass(), "next", null);
        setElement(term2405, 6, term2410);
        setField(term2346, term2346.getClass(), "table", term2405);
        setIntField(term2346, term2346.getClass(), "count", -1016503457);
        setIntField(term2346, term2346.getClass(), "threshold", 8);
        setFloatField(term2346, term2346.getClass(), "loadFactor", 0.75F);
        setIntField(term2346, term2346.getClass(), "modCount", -1968847289);
        setField(term2346, term2346.getClass(), "keySet", term2418);
        setField(term2346, term2346.getClass(), "entrySet", term2424);
        setField(term2346, term2346.getClass(), "values", term2430);
        ArrayList term13819 = new ArrayList();
        ArrayList term13830 = new ArrayList();
        HashMap term13840 = new HashMap();
        Set<Object> term13923 =  ((Map) term13840).keySet();
        HashSet term13839 = new HashSet((Collection<? extends Object>) term13923);
        HashMap term13842 = new HashMap();
        Set<Object> term13924 =  ((Map) term13842).keySet();
        HashSet term13841 = new HashSet((Collection<? extends Object>) term13924);
        ArrayList term13843 = new ArrayList();
        term13815 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term13816 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term13821 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term13832 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term13833 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term13834 = newInstance(Class.forName("java.lang.Object"));
        Object term13835 = newInstance(Class.forName("java.lang.Object"));
        Object term13836 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term13837 = newInstance(Class.forName("java.lang.Object"));
        Object term13838 = newInstance(Class.forName("java.lang.Object"));
        setField(term13816, term13816.getClass(), "defaults", null);
        setField(term13816, term13816.getClass(), "file", null);
        setField(term13816, term13816.getClass(), "basePath", null);
        setField(term13816, term13816.getClass(), "fileSeparator", "/");
        setBooleanField(term13816, term13816.getClass(), "isInitialized", false);
        setField(term13816, term13816.getClass(), "includePropertyName", null);
        setField(term13816, term13816.getClass(), "keysAsListed", term13819);
        setField(term13816, term13816.getClass(), "table", term13821);
        setIntField(term13816, term13816.getClass(), "count", 0);
        setIntField(term13816, term13816.getClass(), "threshold", 8);
        setFloatField(term13816, term13816.getClass(), "loadFactor", 0.75F);
        setIntField(term13816, term13816.getClass(), "modCount", 0);
        setField(term13816, term13816.getClass(), "keySet", null);
        setField(term13816, term13816.getClass(), "entrySet", null);
        setField(term13816, term13816.getClass(), "values", null);
        setField(term13815, term13815.getClass(), "defaults", term13816);
        setField(term13815, term13815.getClass(), "file", "hoicvmsovO");
        setField(term13815, term13815.getClass(), "basePath", "eqJfYWRaEL");
        setField(term13815, term13815.getClass(), "fileSeparator", "/");
        setBooleanField(term13815, term13815.getClass(), "isInitialized", false);
        setField(term13815, term13815.getClass(), "includePropertyName", "fhkbdRViHi");
        setField(term13815, term13815.getClass(), "keysAsListed", term13830);
        setIntField(term13833, term13833.getClass(), "hash", 1396778240);
        setField(term13833, term13833.getClass(), "key", term13834);
        setField(term13833, term13833.getClass(), "value", term13835);
        setField(term13833, term13833.getClass(), "next", null);
        setElement(term13832, 0, term13833);
        setIntField(term13836, term13836.getClass(), "hash", 1926635354);
        setField(term13836, term13836.getClass(), "key", term13837);
        setField(term13836, term13836.getClass(), "value", term13838);
        setField(term13836, term13836.getClass(), "next", null);
        setElement(term13832, 6, term13836);
        setField(term13815, term13815.getClass(), "table", term13832);
        setIntField(term13815, term13815.getClass(), "count", -1016503457);
        setIntField(term13815, term13815.getClass(), "threshold", 8);
        setFloatField(term13815, term13815.getClass(), "loadFactor", 0.75F);
        setIntField(term13815, term13815.getClass(), "modCount", -1968847289);
        setField(term13815, term13815.getClass(), "keySet", term13839);
        setField(term13815, term13815.getClass(), "entrySet", term13841);
        setField(term13815, term13815.getClass(), "values", term13843);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uWHnvSvaPl";
        callMethod(klass, "clearProperty", argTypes, term2346, args);
        assertTrue(recursiveEquals(term2346, term13815));
    }

};


