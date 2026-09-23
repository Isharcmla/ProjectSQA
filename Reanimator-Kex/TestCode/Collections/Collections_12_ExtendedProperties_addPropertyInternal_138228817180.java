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

public class ExtendedProperties_addPropertyInternal_138228817180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6114;
     Object term6320;
     Object term40018;
     Object term40062;

    public ExtendedProperties_addPropertyInternal_138228817180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6120 = new ArrayList();
        ArrayList term6169 = new ArrayList();
        ((ArrayList) term6169).add("java.lang.Object@7ee89c94");
        ((ArrayList) term6169).add("java.lang.Object@24a5b301");
        HashMap term6293 = new HashMap();
        Set<Object> term40195 =  ((Map) term6293).keySet();
        HashSet term6292 = new HashSet((Collection<? extends Object>) term40195);
        HashMap term6299 = new HashMap();
        Set<Object> term40196 =  ((Map) term6299).keySet();
        HashSet term6298 = new HashSet((Collection<? extends Object>) term40196);
        ArrayList term6304 = new ArrayList();
        term6114 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term6115 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term6124 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term6227 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term6228 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term6257 = newInstance(Class.forName("java.lang.Object"));
        Object term6258 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term6287 = newInstance(Class.forName("java.lang.Object"));
        setField(term6115, term6115.getClass(), "defaults", null);
        setField(term6115, term6115.getClass(), "file", null);
        setField(term6115, term6115.getClass(), "basePath", null);
        setField(term6115, term6115.getClass(), "fileSeparator", "/");
        setBooleanField(term6115, term6115.getClass(), "isInitialized", false);
        setField(term6115, term6115.getClass(), "includePropertyName", null);
        setField(term6115, term6115.getClass(), "keysAsListed", term6120);
        setField(term6115, term6115.getClass(), "table", term6124);
        setIntField(term6115, term6115.getClass(), "count", 0);
        setIntField(term6115, term6115.getClass(), "threshold", 8);
        setFloatField(term6115, term6115.getClass(), "loadFactor", 0.75F);
        setIntField(term6115, term6115.getClass(), "modCount", 0);
        setField(term6115, term6115.getClass(), "keySet", null);
        setField(term6115, term6115.getClass(), "entrySet", null);
        setField(term6115, term6115.getClass(), "values", null);
        setField(term6114, term6114.getClass(), "defaults", term6115);
        setField(term6114, term6114.getClass(), "file", "BndsHwAFMv");
        setField(term6114, term6114.getClass(), "basePath", "GzFkzHGYFt");
        setField(term6114, term6114.getClass(), "fileSeparator", "/");
        setBooleanField(term6114, term6114.getClass(), "isInitialized", true);
        setField(term6114, term6114.getClass(), "includePropertyName", "tShwQLRGNe");
        setField(term6114, term6114.getClass(), "keysAsListed", term6169);
        setIntField(term6228, term6228.getClass(), "hash", -975999851);
        setField(term6228, term6228.getClass(), "key", "java.lang.Object@24a5b301");
        setField(term6228, term6228.getClass(), "value", term6257);
        setField(term6228, term6228.getClass(), "next", null);
        setElement(term6227, 0, term6228);
        setIntField(term6258, term6258.getClass(), "hash", -197763213);
        setField(term6258, term6258.getClass(), "key", "java.lang.Object@7ee89c94");
        setField(term6258, term6258.getClass(), "value", term6287);
        setField(term6258, term6258.getClass(), "next", null);
        setElement(term6227, 3, term6258);
        setField(term6114, term6114.getClass(), "table", term6227);
        setIntField(term6114, term6114.getClass(), "count", -1179120540);
        setIntField(term6114, term6114.getClass(), "threshold", 8);
        setFloatField(term6114, term6114.getClass(), "loadFactor", 0.75F);
        setIntField(term6114, term6114.getClass(), "modCount", -73683643);
        setField(term6114, term6114.getClass(), "keySet", term6292);
        setField(term6114, term6114.getClass(), "entrySet", term6298);
        setField(term6114, term6114.getClass(), "values", term6304);
        term6320 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term40022 = new ArrayList();
        ArrayList term40033 = new ArrayList();
        ((ArrayList) term40033).add("java.lang.Object@7ee89c94");
        ((ArrayList) term40033).add("java.lang.Object@24a5b301");
        ((ArrayList) term40033).add("LvtrsXUliU");
        HashMap term40055 = new HashMap();
        Set<Object> term40359 =  ((Map) term40055).keySet();
        HashSet term40054 = new HashSet((Collection<? extends Object>) term40359);
        HashMap term40057 = new HashMap();
        Set<Object> term40360 =  ((Map) term40057).keySet();
        HashSet term40056 = new HashSet((Collection<? extends Object>) term40360);
        ArrayList term40058 = new ArrayList();
        term40018 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term40019 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term40024 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term40041 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term40042 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term40045 = newInstance(Class.forName("java.lang.Object"));
        Object term40046 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term40049 = newInstance(Class.forName("java.lang.Object"));
        Object term40050 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term40053 = newInstance(Class.forName("java.lang.Object"));
        setField(term40019, term40019.getClass(), "defaults", null);
        setField(term40019, term40019.getClass(), "file", null);
        setField(term40019, term40019.getClass(), "basePath", null);
        setField(term40019, term40019.getClass(), "fileSeparator", "/");
        setBooleanField(term40019, term40019.getClass(), "isInitialized", false);
        setField(term40019, term40019.getClass(), "includePropertyName", null);
        setField(term40019, term40019.getClass(), "keysAsListed", term40022);
        setField(term40019, term40019.getClass(), "table", term40024);
        setIntField(term40019, term40019.getClass(), "count", 0);
        setIntField(term40019, term40019.getClass(), "threshold", 8);
        setFloatField(term40019, term40019.getClass(), "loadFactor", 0.75F);
        setIntField(term40019, term40019.getClass(), "modCount", 0);
        setField(term40019, term40019.getClass(), "keySet", null);
        setField(term40019, term40019.getClass(), "entrySet", null);
        setField(term40019, term40019.getClass(), "values", null);
        setField(term40018, term40018.getClass(), "defaults", term40019);
        setField(term40018, term40018.getClass(), "file", "BndsHwAFMv");
        setField(term40018, term40018.getClass(), "basePath", "GzFkzHGYFt");
        setField(term40018, term40018.getClass(), "fileSeparator", "/");
        setBooleanField(term40018, term40018.getClass(), "isInitialized", true);
        setField(term40018, term40018.getClass(), "includePropertyName", "tShwQLRGNe");
        setField(term40018, term40018.getClass(), "keysAsListed", term40033);
        setIntField(term40042, term40042.getClass(), "hash", -975999851);
        setField(term40042, term40042.getClass(), "key", "java.lang.Object@24a5b301");
        setField(term40042, term40042.getClass(), "value", term40045);
        setField(term40042, term40042.getClass(), "next", null);
        setElement(term40041, 0, term40042);
        setIntField(term40046, term40046.getClass(), "hash", -197763213);
        setField(term40046, term40046.getClass(), "key", "java.lang.Object@7ee89c94");
        setField(term40046, term40046.getClass(), "value", term40049);
        setField(term40046, term40046.getClass(), "next", null);
        setElement(term40041, 3, term40046);
        setIntField(term40050, term40050.getClass(), "hash", 1193615728);
        setField(term40050, term40050.getClass(), "key", "LvtrsXUliU");
        setField(term40050, term40050.getClass(), "value", term40053);
        setField(term40050, term40050.getClass(), "next", null);
        setElement(term40041, 8, term40050);
        setField(term40018, term40018.getClass(), "table", term40041);
        setIntField(term40018, term40018.getClass(), "count", -1179120539);
        setIntField(term40018, term40018.getClass(), "threshold", 8);
        setFloatField(term40018, term40018.getClass(), "loadFactor", 0.75F);
        setIntField(term40018, term40018.getClass(), "modCount", -73683642);
        setField(term40018, term40018.getClass(), "keySet", term40054);
        setField(term40018, term40018.getClass(), "entrySet", term40056);
        setField(term40018, term40018.getClass(), "values", term40058);
        term40062 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = "LvtrsXUliU";
        args[1] = term6320;
        callMethod(klass, "addPropertyInternal", argTypes, term6114, args);
        assertTrue(recursiveEquals(term6114, term40018));
        assertTrue(recursiveEquals(term6320, term40062));
    }

};


