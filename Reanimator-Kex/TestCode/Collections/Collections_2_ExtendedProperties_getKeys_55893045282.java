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

public class ExtendedProperties_getKeys_55893045282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2134;
     Object term11711;
     Object term11627;

    public ExtendedProperties_getKeys_55893045282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2140 = new ArrayList();
        ArrayList term2177 = new ArrayList();
        HashMap term2199 = new HashMap();
        Set<Object> term11764 =  ((Map) term2199).keySet();
        HashSet term2198 = new HashSet((Collection<? extends Object>) term11764);
        HashMap term2205 = new HashMap();
        Set<Object> term11765 =  ((Map) term2205).keySet();
        HashSet term2204 = new HashSet((Collection<? extends Object>) term11765);
        ArrayList term2210 = new ArrayList();
        term2134 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term2135 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term2144 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term2181 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term2182 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term2184 = newInstance(Class.forName("java.lang.Object"));
        Object term2185 = newInstance(Class.forName("java.lang.Object"));
        Object term2186 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term2188 = newInstance(Class.forName("java.lang.Object"));
        Object term2189 = newInstance(Class.forName("java.lang.Object"));
        Object term2190 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term2192 = newInstance(Class.forName("java.lang.Object"));
        Object term2193 = newInstance(Class.forName("java.lang.Object"));
        setField(term2135, term2135.getClass(), "defaults", null);
        setField(term2135, term2135.getClass(), "file", null);
        setField(term2135, term2135.getClass(), "basePath", null);
        setField(term2135, term2135.getClass(), "fileSeparator", "/");
        setBooleanField(term2135, term2135.getClass(), "isInitialized", false);
        setField(term2135, term2135.getClass(), "keysAsListed", term2140);
        setField(term2135, term2135.getClass(), "table", term2144);
        setIntField(term2135, term2135.getClass(), "count", 0);
        setIntField(term2135, term2135.getClass(), "threshold", 8);
        setFloatField(term2135, term2135.getClass(), "loadFactor", 0.75F);
        setIntField(term2135, term2135.getClass(), "modCount", 0);
        setField(term2135, term2135.getClass(), "keySet", null);
        setField(term2135, term2135.getClass(), "entrySet", null);
        setField(term2135, term2135.getClass(), "values", null);
        setField(term2134, term2134.getClass(), "defaults", term2135);
        setField(term2134, term2134.getClass(), "file", "nGKItKLYNC");
        setField(term2134, term2134.getClass(), "basePath", "UiUYnPrcCi");
        setField(term2134, term2134.getClass(), "fileSeparator", "/");
        setBooleanField(term2134, term2134.getClass(), "isInitialized", true);
        setField(term2134, term2134.getClass(), "keysAsListed", term2177);
        setIntField(term2182, term2182.getClass(), "hash", 327110842);
        setField(term2182, term2182.getClass(), "key", term2184);
        setField(term2182, term2182.getClass(), "value", term2185);
        setField(term2182, term2182.getClass(), "next", null);
        setElement(term2181, 3, term2182);
        setIntField(term2186, term2186.getClass(), "hash", 126417856);
        setField(term2186, term2186.getClass(), "key", term2188);
        setField(term2186, term2186.getClass(), "value", term2189);
        setField(term2186, term2186.getClass(), "next", null);
        setElement(term2181, 4, term2186);
        setIntField(term2190, term2190.getClass(), "hash", 2136901840);
        setField(term2190, term2190.getClass(), "key", term2192);
        setField(term2190, term2190.getClass(), "value", term2193);
        setField(term2190, term2190.getClass(), "next", null);
        setElement(term2181, 7, term2190);
        setField(term2134, term2134.getClass(), "table", term2181);
        setIntField(term2134, term2134.getClass(), "count", -14890616);
        setIntField(term2134, term2134.getClass(), "threshold", 8);
        setFloatField(term2134, term2134.getClass(), "loadFactor", 0.75F);
        setIntField(term2134, term2134.getClass(), "modCount", 1632125676);
        setField(term2134, term2134.getClass(), "keySet", term2198);
        setField(term2134, term2134.getClass(), "entrySet", term2204);
        setField(term2134, term2134.getClass(), "values", term2210);
        ArrayList term11715 = new ArrayList();
        ArrayList term11724 = new ArrayList();
        HashMap term11737 = new HashMap();
        Set<Object> term11788 =  ((Map) term11737).keySet();
        HashSet term11736 = new HashSet((Collection<? extends Object>) term11788);
        HashMap term11739 = new HashMap();
        Set<Object> term11789 =  ((Map) term11739).keySet();
        HashSet term11738 = new HashSet((Collection<? extends Object>) term11789);
        ArrayList term11740 = new ArrayList();
        term11711 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term11712 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term11717 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term11726 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term11727 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term11728 = newInstance(Class.forName("java.lang.Object"));
        Object term11729 = newInstance(Class.forName("java.lang.Object"));
        Object term11730 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term11731 = newInstance(Class.forName("java.lang.Object"));
        Object term11732 = newInstance(Class.forName("java.lang.Object"));
        Object term11733 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term11734 = newInstance(Class.forName("java.lang.Object"));
        Object term11735 = newInstance(Class.forName("java.lang.Object"));
        setField(term11712, term11712.getClass(), "defaults", null);
        setField(term11712, term11712.getClass(), "file", null);
        setField(term11712, term11712.getClass(), "basePath", null);
        setField(term11712, term11712.getClass(), "fileSeparator", "/");
        setBooleanField(term11712, term11712.getClass(), "isInitialized", false);
        setField(term11712, term11712.getClass(), "keysAsListed", term11715);
        setField(term11712, term11712.getClass(), "table", term11717);
        setIntField(term11712, term11712.getClass(), "count", 0);
        setIntField(term11712, term11712.getClass(), "threshold", 8);
        setFloatField(term11712, term11712.getClass(), "loadFactor", 0.75F);
        setIntField(term11712, term11712.getClass(), "modCount", 0);
        setField(term11712, term11712.getClass(), "keySet", null);
        setField(term11712, term11712.getClass(), "entrySet", null);
        setField(term11712, term11712.getClass(), "values", null);
        setField(term11711, term11711.getClass(), "defaults", term11712);
        setField(term11711, term11711.getClass(), "file", "nGKItKLYNC");
        setField(term11711, term11711.getClass(), "basePath", "UiUYnPrcCi");
        setField(term11711, term11711.getClass(), "fileSeparator", "/");
        setBooleanField(term11711, term11711.getClass(), "isInitialized", true);
        setField(term11711, term11711.getClass(), "keysAsListed", term11724);
        setIntField(term11727, term11727.getClass(), "hash", 327110842);
        setField(term11727, term11727.getClass(), "key", term11728);
        setField(term11727, term11727.getClass(), "value", term11729);
        setField(term11727, term11727.getClass(), "next", null);
        setElement(term11726, 3, term11727);
        setIntField(term11730, term11730.getClass(), "hash", 126417856);
        setField(term11730, term11730.getClass(), "key", term11731);
        setField(term11730, term11730.getClass(), "value", term11732);
        setField(term11730, term11730.getClass(), "next", null);
        setElement(term11726, 4, term11730);
        setIntField(term11733, term11733.getClass(), "hash", 2136901840);
        setField(term11733, term11733.getClass(), "key", term11734);
        setField(term11733, term11733.getClass(), "value", term11735);
        setField(term11733, term11733.getClass(), "next", null);
        setElement(term11726, 7, term11733);
        setField(term11711, term11711.getClass(), "table", term11726);
        setIntField(term11711, term11711.getClass(), "count", -14890616);
        setIntField(term11711, term11711.getClass(), "threshold", 8);
        setFloatField(term11711, term11711.getClass(), "loadFactor", 0.75F);
        setIntField(term11711, term11711.getClass(), "modCount", 1632125676);
        setField(term11711, term11711.getClass(), "keySet", term11736);
        setField(term11711, term11711.getClass(), "entrySet", term11738);
        setField(term11711, term11711.getClass(), "values", term11740);
        ArrayList term11631 = new ArrayList();
        term11627 = newInstance(Class.forName("java.util.ArrayList$Itr"));
        setIntField(term11627, term11627.getClass(), "cursor", 0);
        setIntField(term11627, term11627.getClass(), "lastRet", -1);
        setIntField(term11627, term11627.getClass(), "expectedModCount", 0);
        setField(term11627, term11627.getClass(), "this$0", term11631);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getKeys", argTypes, term2134, args);
        assertTrue(recursiveEquals(term2134, term11711));
        assertTrue(recursiveEquals(retValue, term11627));
    }

};


