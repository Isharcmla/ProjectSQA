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
     Object term43275;
     Object term43009;

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
        Set<Object> term43499 =  ((Map) term8725).keySet();
        HashSet term8724 = new HashSet((Collection<? extends Object>) term43499);
        HashMap term8731 = new HashMap();
        Set<Object> term43500 =  ((Map) term8731).keySet();
        HashSet term8730 = new HashSet((Collection<? extends Object>) term43500);
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
        ArrayList term43279 = new ArrayList();
        ArrayList term43290 = new ArrayList();
        ((ArrayList) term43290).add("java.lang.Object@65af6235");
        ((ArrayList) term43290).add("java.lang.Object@37836c90");
        ((ArrayList) term43290).add("java.lang.Object@21e5c75f");
        HashMap term43312 = new HashMap();
        Set<Object> term43683 =  ((Map) term43312).keySet();
        HashSet term43311 = new HashSet((Collection<? extends Object>) term43683);
        HashMap term43314 = new HashMap();
        Set<Object> term43684 =  ((Map) term43314).keySet();
        HashSet term43313 = new HashSet((Collection<? extends Object>) term43684);
        ArrayList term43315 = new ArrayList();
        term43275 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term43276 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term43281 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term43298 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term43299 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term43302 = newInstance(Class.forName("java.lang.Object"));
        Object term43303 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term43306 = newInstance(Class.forName("java.lang.Object"));
        Object term43307 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term43310 = newInstance(Class.forName("java.lang.Object"));
        setField(term43276, term43276.getClass(), "defaults", null);
        setField(term43276, term43276.getClass(), "file", null);
        setField(term43276, term43276.getClass(), "basePath", null);
        setField(term43276, term43276.getClass(), "fileSeparator", "/");
        setBooleanField(term43276, term43276.getClass(), "isInitialized", false);
        setField(term43276, term43276.getClass(), "includePropertyName", null);
        setField(term43276, term43276.getClass(), "keysAsListed", term43279);
        setField(term43276, term43276.getClass(), "table", term43281);
        setIntField(term43276, term43276.getClass(), "count", 0);
        setIntField(term43276, term43276.getClass(), "threshold", 8);
        setFloatField(term43276, term43276.getClass(), "loadFactor", 0.75F);
        setIntField(term43276, term43276.getClass(), "modCount", 0);
        setField(term43276, term43276.getClass(), "keySet", null);
        setField(term43276, term43276.getClass(), "entrySet", null);
        setField(term43276, term43276.getClass(), "values", null);
        setField(term43275, term43275.getClass(), "defaults", term43276);
        setField(term43275, term43275.getClass(), "file", "kBdSllIBVz");
        setField(term43275, term43275.getClass(), "basePath", "TJmVBGfTML");
        setField(term43275, term43275.getClass(), "fileSeparator", "/");
        setBooleanField(term43275, term43275.getClass(), "isInitialized", true);
        setField(term43275, term43275.getClass(), "includePropertyName", "tPlsykYBqO");
        setField(term43275, term43275.getClass(), "keysAsListed", term43290);
        setIntField(term43299, term43299.getClass(), "hash", -2042552400);
        setField(term43299, term43299.getClass(), "key", "java.lang.Object@37836c90");
        setField(term43299, term43299.getClass(), "value", term43302);
        setField(term43299, term43299.getClass(), "next", null);
        setElement(term43298, 4, term43299);
        setIntField(term43303, term43303.getClass(), "hash", -1663248561);
        setField(term43303, term43303.getClass(), "key", "java.lang.Object@65af6235");
        setField(term43303, term43303.getClass(), "value", term43306);
        setField(term43303, term43303.getClass(), "next", null);
        setElement(term43298, 6, term43303);
        setIntField(term43307, term43307.getClass(), "hash", 771006849);
        setField(term43307, term43307.getClass(), "key", "java.lang.Object@21e5c75f");
        setField(term43307, term43307.getClass(), "value", term43310);
        setField(term43307, term43307.getClass(), "next", null);
        setElement(term43298, 8, term43307);
        setField(term43275, term43275.getClass(), "table", term43298);
        setIntField(term43275, term43275.getClass(), "count", -14890616);
        setIntField(term43275, term43275.getClass(), "threshold", 8);
        setFloatField(term43275, term43275.getClass(), "loadFactor", 0.75F);
        setIntField(term43275, term43275.getClass(), "modCount", 1632125676);
        setField(term43275, term43275.getClass(), "keySet", term43311);
        setField(term43275, term43275.getClass(), "entrySet", term43313);
        setField(term43275, term43275.getClass(), "values", term43315);
        ArrayList term43013 = new ArrayList();
        ((ArrayList) term43013).add("java.lang.Object@65af6235");
        ((ArrayList) term43013).add("java.lang.Object@37836c90");
        ((ArrayList) term43013).add("java.lang.Object@21e5c75f");
        term43009 = newInstance(Class.forName("java.util.ArrayList$Itr"));
        setIntField(term43009, term43009.getClass(), "cursor", 0);
        setIntField(term43009, term43009.getClass(), "lastRet", -1);
        setIntField(term43009, term43009.getClass(), "expectedModCount", 3);
        setField(term43009, term43009.getClass(), "this$0", term43013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getKeys", argTypes, term8489, args);
        assertTrue(recursiveEquals(term8489, term43275));
        assertTrue(recursiveEquals(retValue, term43009));
    }

};


