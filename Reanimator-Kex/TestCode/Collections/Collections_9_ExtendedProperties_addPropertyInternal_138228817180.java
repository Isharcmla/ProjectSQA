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
     Object term39523;
     Object term39567;

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
        Set<Object> term39700 =  ((Map) term6293).keySet();
        HashSet term6292 = new HashSet((Collection<? extends Object>) term39700);
        HashMap term6299 = new HashMap();
        Set<Object> term39701 =  ((Map) term6299).keySet();
        HashSet term6298 = new HashSet((Collection<? extends Object>) term39701);
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
        ArrayList term39527 = new ArrayList();
        ArrayList term39538 = new ArrayList();
        ((ArrayList) term39538).add("java.lang.Object@7ee89c94");
        ((ArrayList) term39538).add("java.lang.Object@24a5b301");
        ((ArrayList) term39538).add("LvtrsXUliU");
        HashMap term39560 = new HashMap();
        Set<Object> term39864 =  ((Map) term39560).keySet();
        HashSet term39559 = new HashSet((Collection<? extends Object>) term39864);
        HashMap term39562 = new HashMap();
        Set<Object> term39865 =  ((Map) term39562).keySet();
        HashSet term39561 = new HashSet((Collection<? extends Object>) term39865);
        ArrayList term39563 = new ArrayList();
        term39523 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term39524 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term39529 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term39546 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term39547 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term39550 = newInstance(Class.forName("java.lang.Object"));
        Object term39551 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term39554 = newInstance(Class.forName("java.lang.Object"));
        Object term39555 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term39558 = newInstance(Class.forName("java.lang.Object"));
        setField(term39524, term39524.getClass(), "defaults", null);
        setField(term39524, term39524.getClass(), "file", null);
        setField(term39524, term39524.getClass(), "basePath", null);
        setField(term39524, term39524.getClass(), "fileSeparator", "/");
        setBooleanField(term39524, term39524.getClass(), "isInitialized", false);
        setField(term39524, term39524.getClass(), "includePropertyName", null);
        setField(term39524, term39524.getClass(), "keysAsListed", term39527);
        setField(term39524, term39524.getClass(), "table", term39529);
        setIntField(term39524, term39524.getClass(), "count", 0);
        setIntField(term39524, term39524.getClass(), "threshold", 8);
        setFloatField(term39524, term39524.getClass(), "loadFactor", 0.75F);
        setIntField(term39524, term39524.getClass(), "modCount", 0);
        setField(term39524, term39524.getClass(), "keySet", null);
        setField(term39524, term39524.getClass(), "entrySet", null);
        setField(term39524, term39524.getClass(), "values", null);
        setField(term39523, term39523.getClass(), "defaults", term39524);
        setField(term39523, term39523.getClass(), "file", "BndsHwAFMv");
        setField(term39523, term39523.getClass(), "basePath", "GzFkzHGYFt");
        setField(term39523, term39523.getClass(), "fileSeparator", "/");
        setBooleanField(term39523, term39523.getClass(), "isInitialized", true);
        setField(term39523, term39523.getClass(), "includePropertyName", "tShwQLRGNe");
        setField(term39523, term39523.getClass(), "keysAsListed", term39538);
        setIntField(term39547, term39547.getClass(), "hash", -975999851);
        setField(term39547, term39547.getClass(), "key", "java.lang.Object@24a5b301");
        setField(term39547, term39547.getClass(), "value", term39550);
        setField(term39547, term39547.getClass(), "next", null);
        setElement(term39546, 0, term39547);
        setIntField(term39551, term39551.getClass(), "hash", -197763213);
        setField(term39551, term39551.getClass(), "key", "java.lang.Object@7ee89c94");
        setField(term39551, term39551.getClass(), "value", term39554);
        setField(term39551, term39551.getClass(), "next", null);
        setElement(term39546, 3, term39551);
        setIntField(term39555, term39555.getClass(), "hash", 1193615728);
        setField(term39555, term39555.getClass(), "key", "LvtrsXUliU");
        setField(term39555, term39555.getClass(), "value", term39558);
        setField(term39555, term39555.getClass(), "next", null);
        setElement(term39546, 8, term39555);
        setField(term39523, term39523.getClass(), "table", term39546);
        setIntField(term39523, term39523.getClass(), "count", -1179120539);
        setIntField(term39523, term39523.getClass(), "threshold", 8);
        setFloatField(term39523, term39523.getClass(), "loadFactor", 0.75F);
        setIntField(term39523, term39523.getClass(), "modCount", -73683642);
        setField(term39523, term39523.getClass(), "keySet", term39559);
        setField(term39523, term39523.getClass(), "entrySet", term39561);
        setField(term39523, term39523.getClass(), "values", term39563);
        term39567 = newInstance(Class.forName("java.lang.Object"));
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
        assertTrue(recursiveEquals(term6114, term39523));
        assertTrue(recursiveEquals(term6320, term39567));
    }

};


