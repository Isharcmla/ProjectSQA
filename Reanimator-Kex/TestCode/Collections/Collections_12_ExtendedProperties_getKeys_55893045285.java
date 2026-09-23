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

public class ExtendedProperties_getKeys_55893045285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8489;
     Object term43771;
     Object term43516;

    public ExtendedProperties_getKeys_55893045285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8495 = new ArrayList();
        ArrayList term8544 = new ArrayList();
        ((ArrayList) term8544).add("java.lang.Object@65af6235");
        ((ArrayList) term8544).add("java.lang.Object@37836c90");
        ((ArrayList) term8544).add("java.lang.Object@21e5c75f");
        HashMap term8725 = new HashMap();
        Set<Object> term43995 =  ((Map) term8725).keySet();
        HashSet term8724 = new HashSet((Collection<? extends Object>) term43995);
        HashMap term8731 = new HashMap();
        Set<Object> term43996 =  ((Map) term8731).keySet();
        HashSet term8730 = new HashSet((Collection<? extends Object>) term43996);
        ArrayList term8736 = new ArrayList();
        term8489 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term8490 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term8499 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term8629 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term8630 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term8659 = newInstance(Class.forName("java.lang.Object"));
        Object term8660 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term8689 = newInstance(Class.forName("java.lang.Object"));
        Object term8690 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term8719 = newInstance(Class.forName("java.lang.Object"));
        setField(term8490, term8490.getClass(), "defaults", null);
        setField(term8490, term8490.getClass(), "file", null);
        setField(term8490, term8490.getClass(), "basePath", null);
        setField(term8490, term8490.getClass(), "fileSeparator", "/");
        setBooleanField(term8490, term8490.getClass(), "isInitialized", false);
        setField(term8490, term8490.getClass(), "includePropertyName", null);
        setField(term8490, term8490.getClass(), "keysAsListed", term8495);
        setField(term8490, term8490.getClass(), "table", term8499);
        setIntField(term8490, term8490.getClass(), "count", 0);
        setIntField(term8490, term8490.getClass(), "threshold", 8);
        setFloatField(term8490, term8490.getClass(), "loadFactor", 0.75F);
        setIntField(term8490, term8490.getClass(), "modCount", 0);
        setField(term8490, term8490.getClass(), "keySet", null);
        setField(term8490, term8490.getClass(), "entrySet", null);
        setField(term8490, term8490.getClass(), "values", null);
        setField(term8489, term8489.getClass(), "defaults", term8490);
        setField(term8489, term8489.getClass(), "file", "kBdSllIBVz");
        setField(term8489, term8489.getClass(), "basePath", "TJmVBGfTML");
        setField(term8489, term8489.getClass(), "fileSeparator", "/");
        setBooleanField(term8489, term8489.getClass(), "isInitialized", true);
        setField(term8489, term8489.getClass(), "includePropertyName", "tPlsykYBqO");
        setField(term8489, term8489.getClass(), "keysAsListed", term8544);
        setIntField(term8630, term8630.getClass(), "hash", -2042552400);
        setField(term8630, term8630.getClass(), "key", "java.lang.Object@37836c90");
        setField(term8630, term8630.getClass(), "value", term8659);
        setField(term8630, term8630.getClass(), "next", null);
        setElement(term8629, 4, term8630);
        setIntField(term8660, term8660.getClass(), "hash", -1663248561);
        setField(term8660, term8660.getClass(), "key", "java.lang.Object@65af6235");
        setField(term8660, term8660.getClass(), "value", term8689);
        setField(term8660, term8660.getClass(), "next", null);
        setElement(term8629, 6, term8660);
        setIntField(term8690, term8690.getClass(), "hash", 771006849);
        setField(term8690, term8690.getClass(), "key", "java.lang.Object@21e5c75f");
        setField(term8690, term8690.getClass(), "value", term8719);
        setField(term8690, term8690.getClass(), "next", null);
        setElement(term8629, 8, term8690);
        setField(term8489, term8489.getClass(), "table", term8629);
        setIntField(term8489, term8489.getClass(), "count", -14890616);
        setIntField(term8489, term8489.getClass(), "threshold", 8);
        setFloatField(term8489, term8489.getClass(), "loadFactor", 0.75F);
        setIntField(term8489, term8489.getClass(), "modCount", 1632125676);
        setField(term8489, term8489.getClass(), "keySet", term8724);
        setField(term8489, term8489.getClass(), "entrySet", term8730);
        setField(term8489, term8489.getClass(), "values", term8736);
        ArrayList term43775 = new ArrayList();
        ArrayList term43786 = new ArrayList();
        ((ArrayList) term43786).add("java.lang.Object@65af6235");
        ((ArrayList) term43786).add("java.lang.Object@37836c90");
        ((ArrayList) term43786).add("java.lang.Object@21e5c75f");
        HashMap term43808 = new HashMap();
        Set<Object> term44179 =  ((Map) term43808).keySet();
        HashSet term43807 = new HashSet((Collection<? extends Object>) term44179);
        HashMap term43810 = new HashMap();
        Set<Object> term44180 =  ((Map) term43810).keySet();
        HashSet term43809 = new HashSet((Collection<? extends Object>) term44180);
        ArrayList term43811 = new ArrayList();
        term43771 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term43772 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term43777 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term43794 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term43795 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term43798 = newInstance(Class.forName("java.lang.Object"));
        Object term43799 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term43802 = newInstance(Class.forName("java.lang.Object"));
        Object term43803 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term43806 = newInstance(Class.forName("java.lang.Object"));
        setField(term43772, term43772.getClass(), "defaults", null);
        setField(term43772, term43772.getClass(), "file", null);
        setField(term43772, term43772.getClass(), "basePath", null);
        setField(term43772, term43772.getClass(), "fileSeparator", "/");
        setBooleanField(term43772, term43772.getClass(), "isInitialized", false);
        setField(term43772, term43772.getClass(), "includePropertyName", null);
        setField(term43772, term43772.getClass(), "keysAsListed", term43775);
        setField(term43772, term43772.getClass(), "table", term43777);
        setIntField(term43772, term43772.getClass(), "count", 0);
        setIntField(term43772, term43772.getClass(), "threshold", 8);
        setFloatField(term43772, term43772.getClass(), "loadFactor", 0.75F);
        setIntField(term43772, term43772.getClass(), "modCount", 0);
        setField(term43772, term43772.getClass(), "keySet", null);
        setField(term43772, term43772.getClass(), "entrySet", null);
        setField(term43772, term43772.getClass(), "values", null);
        setField(term43771, term43771.getClass(), "defaults", term43772);
        setField(term43771, term43771.getClass(), "file", "kBdSllIBVz");
        setField(term43771, term43771.getClass(), "basePath", "TJmVBGfTML");
        setField(term43771, term43771.getClass(), "fileSeparator", "/");
        setBooleanField(term43771, term43771.getClass(), "isInitialized", true);
        setField(term43771, term43771.getClass(), "includePropertyName", "tPlsykYBqO");
        setField(term43771, term43771.getClass(), "keysAsListed", term43786);
        setIntField(term43795, term43795.getClass(), "hash", -2042552400);
        setField(term43795, term43795.getClass(), "key", "java.lang.Object@37836c90");
        setField(term43795, term43795.getClass(), "value", term43798);
        setField(term43795, term43795.getClass(), "next", null);
        setElement(term43794, 4, term43795);
        setIntField(term43799, term43799.getClass(), "hash", -1663248561);
        setField(term43799, term43799.getClass(), "key", "java.lang.Object@65af6235");
        setField(term43799, term43799.getClass(), "value", term43802);
        setField(term43799, term43799.getClass(), "next", null);
        setElement(term43794, 6, term43799);
        setIntField(term43803, term43803.getClass(), "hash", 771006849);
        setField(term43803, term43803.getClass(), "key", "java.lang.Object@21e5c75f");
        setField(term43803, term43803.getClass(), "value", term43806);
        setField(term43803, term43803.getClass(), "next", null);
        setElement(term43794, 8, term43803);
        setField(term43771, term43771.getClass(), "table", term43794);
        setIntField(term43771, term43771.getClass(), "count", -14890616);
        setIntField(term43771, term43771.getClass(), "threshold", 8);
        setFloatField(term43771, term43771.getClass(), "loadFactor", 0.75F);
        setIntField(term43771, term43771.getClass(), "modCount", 1632125676);
        setField(term43771, term43771.getClass(), "keySet", term43807);
        setField(term43771, term43771.getClass(), "entrySet", term43809);
        setField(term43771, term43771.getClass(), "values", term43811);
        ArrayList term43520 = new ArrayList();
        ((ArrayList) term43520).add("java.lang.Object@65af6235");
        ((ArrayList) term43520).add("java.lang.Object@37836c90");
        ((ArrayList) term43520).add("java.lang.Object@21e5c75f");
        term43516 = newInstance(Class.forName("java.util.ArrayList$Itr"));
        setIntField(term43516, term43516.getClass(), "cursor", 0);
        setIntField(term43516, term43516.getClass(), "lastRet", -1);
        setIntField(term43516, term43516.getClass(), "expectedModCount", 3);
        setField(term43516, term43516.getClass(), "this$0", term43520);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getKeys", argTypes, term8489, args);
        assertTrue(recursiveEquals(term8489, term43771));
        assertTrue(recursiveEquals(retValue, term43516));
    }

};


